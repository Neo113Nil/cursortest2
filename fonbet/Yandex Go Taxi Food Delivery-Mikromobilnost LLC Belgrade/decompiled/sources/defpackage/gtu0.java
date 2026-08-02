package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public abstract class gtu0 {
    public static final Regex a = new Regex("\\s+");

    public static String a(String str, String str2) {
        return g8e.p(str, Extension.DOT_CHAR, str2).toLowerCase(Locale.ROOT);
    }

    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!rza.b(charAt)) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static final String c(String str, String str2, String str3) {
        return cvu0.v(cvu0.v(str, oyr.p("%(", str2, ")s"), str3, false), oyr.p("{{", str2, "}}"), str3, false);
    }

    public static final ArrayList d(String str) {
        List W;
        W = evu0.W(evu0.S("]", evu0.Q("[", str)), new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
        List list = W;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(evu0.k0((String) it.next()).toString());
        }
        return arrayList;
    }
}
