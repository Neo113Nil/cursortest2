package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.on00;
import xsna.s5a;

/* loaded from: classes10.dex */
public final class g20 implements zk3 {
    public final /* synthetic */ b20 a;

    public g20(b20 b20Var) {
        this.a = b20Var;
    }

    @Override // yads.zk3
    public final Map a() {
        e20 e20Var = this.a.e;
        List list = e20Var != null ? e20Var.b : null;
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = ((b93) obj).a;
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = s5a.a(str, linkedHashMap);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((b93) it.next()).b);
            }
            linkedHashMap2.put(key, arrayList);
        }
        return linkedHashMap2;
    }
}
