package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class dz8 {
    public final Map a;
    public final Map b;

    public dz8(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final Map a(String str, String str2) {
        Map map;
        Iterator it = this.a.entrySet().iterator();
        do {
            map = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            bz8 bz8Var = (bz8) entry.getKey();
            Map map2 = (Map) entry.getValue();
            boolean l = jl40.l(bz8Var.a, str);
            String str3 = bz8Var.b;
            boolean z = str3 == null || str3.equals(str2);
            if (l && z) {
                map = map2;
            }
        } while (map == null);
        return map == null ? this.b : map;
    }
}
