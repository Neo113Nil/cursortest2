package defpackage;

import com.yandex.mob.data.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final /* synthetic */ class fn20 implements wls {
    public final /* synthetic */ c a;
    public final /* synthetic */ List b;
    public final /* synthetic */ zm20 c;
    public final /* synthetic */ iq20 w;

    public /* synthetic */ fn20(c cVar, List list, zm20 zm20Var, iq20 iq20Var) {
        this.a = cVar;
        this.b = list;
        this.c = zm20Var;
        this.w = iq20Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Map map = (Map) obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size() + 1);
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            zm20 zm20Var = this.c;
            if (!hasNext) {
                linkedHashMap.put(zm20Var.b, this.w);
                return linkedHashMap;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            iq20 iq20Var = (iq20) entry.getValue();
            zm20 i = vng.i(iq20Var.a.a);
            if (!i.equals(zm20Var)) {
                c cVar = this.a;
                if (!cVar.g.containsKey(i)) {
                    for (zm20 zm20Var2 : this.b) {
                        if (!cVar.l(zm20Var, zm20Var2) || !cVar.l(i, zm20Var2)) {
                        }
                    }
                }
                linkedHashMap.put(str, iq20Var);
            }
        }
    }
}
