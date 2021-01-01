import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.NumberFormat;


public class JJJH {
   // public static Logger logger = LoggerFactory.getLogger(JJJH.class);

    public static void main(String[] args) {
      //  logger.info("124");
        NumberFormat format = NumberFormat.getInstance();
        Long s = 999L;
        Double d = s * 0.01;
        String format1 = format.format(d);
        System.out.println(format1);
    }
}
