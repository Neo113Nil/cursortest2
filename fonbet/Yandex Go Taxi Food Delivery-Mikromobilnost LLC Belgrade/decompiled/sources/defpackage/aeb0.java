package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes3.dex */
public abstract class aeb0 {
    public static final Map a = b.i(new Pair("JANUARY", 0), new Pair("FEBRUARY", 1), new Pair("MARCH", 2), new Pair("APRIL", 3), new Pair("MAY", 4), new Pair("JUNE", 5), new Pair("JULY", 6), new Pair("AUGUST", 7), new Pair("SEPTEMBER", 8), new Pair("OCTOBER", 9), new Pair("NOVEMBER", 10), new Pair("DECEMBER", 11));

    public static final kb61 a(String str) {
        List W;
        Pair pair;
        W = evu0.W(str, new String[]{"::"}, (r2 & 4) != 0 ? 0 : 2);
        Object S = a.S(0, W);
        String str2 = (String) a.S(1, W);
        pair = new Pair(S, str2 != null ? bvu0.l(10, str2) : null);
        String str3 = (String) pair.getFirst();
        Integer num = (Integer) pair.getSecond();
        Integer num2 = str3 != null ? (Integer) a.get(str3.toUpperCase(Locale.ROOT)) : null;
        if (num2 == null || num == null) {
            return null;
        }
        return new kb61(num.intValue(), num2.intValue());
    }

    public static final Text.Constant b(int i, int i2, Locale locale) {
        int i3 = Calendar.getInstance().get(1);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i);
        calendar.set(2, i2);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        String format = new SimpleDateFormat(i == i3 ? "LLLL" : "LLLL yyyy", locale).format(calendar.getTime());
        if (format.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = format.charAt(0);
            sb.append((Object) (Character.isLowerCase(charAt) ? rza.c(charAt, locale) : String.valueOf(charAt)));
            sb.append(format.substring(1));
            format = sb.toString();
        }
        return d.e(format);
    }
}
