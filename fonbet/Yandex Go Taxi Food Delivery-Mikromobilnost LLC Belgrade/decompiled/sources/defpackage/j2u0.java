package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class j2u0 implements i2u0 {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // defpackage.i2u0
    public final h2u0 a(n951 n951Var) {
        return (h2u0) this.a.remove(n951Var);
    }

    @Override // defpackage.i2u0
    public final h2u0 b(n951 n951Var) {
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(n951Var);
        if (obj == null) {
            obj = new h2u0(n951Var);
            linkedHashMap.put(n951Var, obj);
        }
        return (h2u0) obj;
    }

    public final List c(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (jl40.l(((n951) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((n951) it.next());
        }
        return a.J0(linkedHashMap.values());
    }
}
