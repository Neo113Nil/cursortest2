package yads;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class mr2 {
    public final DecimalFormat a;

    public mr2() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(' ');
        this.a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }

    public final String a(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!xsna.ro.j(charAt)) {
                    sb.append(charAt);
                }
            }
            return this.a.format(Long.parseLong(sb.toString()));
        } catch (NumberFormatException unused) {
            String.format("Could not parse review count value. Review Count value is %s", Arrays.copyOf(new Object[]{str}, 1));
            throw new a22("Native Ad json has not required attributes");
        }
    }
}
