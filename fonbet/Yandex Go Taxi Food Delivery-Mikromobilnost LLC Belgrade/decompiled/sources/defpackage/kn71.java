package defpackage;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes7.dex */
public final class kn71 {
    public final DecimalFormat a;

    public kn71() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(HexString.CHAR_SPACE);
        this.a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }
}
