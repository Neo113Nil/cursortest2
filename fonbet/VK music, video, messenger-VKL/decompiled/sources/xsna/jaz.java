package xsna;

import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Regex;

/* compiled from: LinkRedirector.kt */
/* loaded from: classes17.dex */
public final class jaz {
    public static final bpn0 a = new bpn0(new z34(19));
    public static final bpn0 b = new bpn0(new n1(20));

    public static String a(String str) {
        Map<Regex, String> map = ((kaz) b.getValue()).a;
        if (str == null || str.length() == 0) {
            return "";
        }
        Iterator<Regex> it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Regex next = it.next();
            hl10 e = next.e(str);
            if (e != null) {
                str = brm0.y((String) pn00.h(next, map), "{original_url}", Uri.encode(str));
                int i = 0;
                for (Object obj : e.b()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    String str2 = (String) obj;
                    str = brm0.y(brm0.y(str, uqi.a("{$", i, '}'), Uri.encode(str2)), "{$" + i + "_r}", str2);
                    i = i2;
                }
            }
        }
        return str;
    }
}
