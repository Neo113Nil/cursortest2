package defpackage;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class leu {
    public static final leu b = new leu(b.f());
    public final Map a;

    public leu(Map map) {
        this.a = map;
    }

    public final String a(String str) {
        Map map = this.a;
        if (!map.containsKey(str)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Iterator it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                String str2 = (String) it.next();
                if (str2.toLowerCase(Locale.ROOT).equals(lowerCase)) {
                    str = str2;
                    break;
                }
            }
        }
        if (str == null) {
            return null;
        }
        return (String) map.get(str);
    }

    public final String toString() {
        return nnm.j("Headers(keyValues=", Extension.C_BRAKE, this.a);
    }
}
