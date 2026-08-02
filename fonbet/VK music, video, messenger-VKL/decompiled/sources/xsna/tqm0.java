package xsna;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/* compiled from: StringUtils.kt */
/* loaded from: classes6.dex */
public final class tqm0 {
    public static final DecimalFormat a;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        a = decimalFormat;
    }
}
