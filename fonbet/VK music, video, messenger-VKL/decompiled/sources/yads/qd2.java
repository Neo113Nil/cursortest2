package yads;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import xsna.hfr;
import xsna.i5g;
import xsna.j5g;
import xsna.rli0;
import xsna.s5a;

/* loaded from: classes10.dex */
public final class qd2 {
    public final w5 a;

    public qd2(w5 w5Var) {
        this.a = w5Var;
    }

    public final LinkedHashMap a(Set set) {
        List O0;
        w5 w5Var = this.a;
        synchronized (w5Var.a) {
            O0 = j5g.O0(w5Var.d);
        }
        hfr j = rli0.j(new i5g(O0), new pd2(set));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        hfr.a aVar = new hfr.a(j);
        while (aVar.hasNext()) {
            u5 u5Var = (u5) aVar.next();
            String str = u5Var.a.b;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = s5a.a(str, linkedHashMap);
            }
            ((List) obj).add(u5Var.b);
        }
        return linkedHashMap;
    }
}
