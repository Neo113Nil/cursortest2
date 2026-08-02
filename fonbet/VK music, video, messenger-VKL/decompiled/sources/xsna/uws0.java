package xsna;

import java.text.DecimalFormat;
import java.util.Currency;

/* compiled from: VideoMotionBannerMapper.kt */
/* loaded from: classes8.dex */
public final class uws0 {
    public static final bpn0 a = new bpn0(new w5k0(7));

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        Currency currency = ((DecimalFormat) a.getValue()).getCurrency();
        String symbol = currency != null ? currency.getSymbol() : null;
        return symbol == null ? str : symbol.equals("RUB") ? str.concat(" ₽") : pzl.b(str, " ", symbol);
    }
}
