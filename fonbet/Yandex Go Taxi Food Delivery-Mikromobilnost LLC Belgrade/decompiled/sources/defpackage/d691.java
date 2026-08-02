package defpackage;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes11.dex */
public abstract class d691 {
    public static final DecimalFormat a;
    public static final DecimalFormat b;

    static {
        Locale locale = Locale.ROOT;
        a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }
}
