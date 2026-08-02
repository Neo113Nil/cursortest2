package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.j5g;
import xsna.s5a;

/* loaded from: classes10.dex */
public final class vp1 {
    public final tq1 a;

    public vp1(tq1 tq1Var) {
        this.a = tq1Var;
    }

    public final ArrayList a(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String b = this.a.b((rr1) next);
            Object obj = linkedHashMap.get(b);
            if (obj == null) {
                obj = s5a.a(b, linkedHashMap);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            rr1 rr1Var = ((String) entry.getKey()) != null ? (rr1) j5g.Y((List) entry.getValue()) : null;
            if (rr1Var != null) {
                arrayList2.add(rr1Var);
            }
        }
        return arrayList2;
    }
}
