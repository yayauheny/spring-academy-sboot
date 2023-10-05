package by.yayauheny.cashcard.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


//@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CashCard {

    @Id
    private Long id;
    private Double amount;
    private String owner;
}
