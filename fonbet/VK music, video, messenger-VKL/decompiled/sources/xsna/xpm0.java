package xsna;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.Pair;

/* compiled from: StringCounterUtils.kt */
/* loaded from: classes17.dex */
public final class xpm0 {
    public static final DecimalFormat a;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        RoundingMode roundingMode = RoundingMode.DOWN;
        decimalFormat.setRoundingMode(roundingMode);
        a = decimalFormat;
        new DecimalFormat("0.0").setRoundingMode(roundingMode);
    }

    public static final String a(int i) {
        long j = i;
        DecimalFormat decimalFormat = a;
        if (j >= 1000000000) {
            return decimalFormat.format(j / 1.0E9d) + 'B';
        }
        if (j >= 1000000) {
            return decimalFormat.format(j / 1000000.0d) + 'M';
        }
        if (j >= 1000) {
            return decimalFormat.format(j / 1000.0d) + 'K';
        }
        return j + "";
    }

    public static String b(long j) {
        Pair c = c(j);
        double doubleValue = ((Number) c.d()).doubleValue();
        String str = (String) c.g();
        if (doubleValue >= 100.0d) {
            doubleValue = Math.floor(doubleValue);
        }
        return a.format(doubleValue) + str;
    }

    public static Pair c(long j) {
        return j >= 1000000000 ? new Pair(Double.valueOf(j / 1.0E9d), "B") : j >= 1000000 ? new Pair(Double.valueOf(j / 1000000.0d), "M") : j >= 1000 ? new Pair(Double.valueOf(j / 1000.0d), "K") : new Pair(Double.valueOf(j), "");
    }
}
