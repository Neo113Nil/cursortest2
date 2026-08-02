package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class k6u0 {
    public static String a(String str, Map map) {
        Object obj;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t((String) obj, str, true)) {
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            return (String) map.get(str2);
        }
        return null;
    }
}
