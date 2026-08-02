package defpackage;

import com.yandex.plus.core.graphql.type.CURRENCY;
import java.math.BigDecimal;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class byw implements b70 {
    public static final List a = scc.g("currency", "amount");

    public static ayw c(xdx xdxVar) {
        CURRENCY currency;
        CURRENCY currency2 = null;
        BigDecimal bigDecimal = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                String nextString = xdxVar.nextString();
                CURRENCY.Companion.getClass();
                CURRENCY[] values = CURRENCY.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        currency = null;
                        break;
                    }
                    currency = values[i];
                    if (jl40.l(currency.getRawValue(), nextString)) {
                        break;
                    }
                    i++;
                }
                currency2 = currency == null ? CURRENCY.UNKNOWN__ : currency;
            } else {
                if (h2 != 1) {
                    return new ayw(currency2, bigDecimal);
                }
                bigDecimal = new BigDecimal(xdxVar.nextString());
            }
        }
    }

    public static void d(bfx bfxVar, ayw aywVar) {
        bfxVar.A1("currency");
        bfxVar.r0(aywVar.a.getRawValue());
        bfxVar.A1("amount");
        bfxVar.r0(aywVar.b.toString());
    }
}
