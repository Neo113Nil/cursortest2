package xsna;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: StartStopToken.kt */
/* loaded from: classes.dex */
public final class uqk0 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final List<tqk0> a(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (epx.f(((svx0) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((svx0) it.next());
        }
        return j5g.O0(linkedHashMap.values());
    }

    public final tqk0 b(svx0 svx0Var) {
        return (tqk0) this.a.remove(svx0Var);
    }

    public final tqk0 c(svx0 svx0Var) {
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(svx0Var);
        if (obj == null) {
            obj = new tqk0(svx0Var);
            linkedHashMap.put(svx0Var, obj);
        }
        return (tqk0) obj;
    }
}
