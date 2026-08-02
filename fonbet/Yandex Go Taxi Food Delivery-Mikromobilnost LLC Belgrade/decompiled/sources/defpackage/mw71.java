package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import yads.zp1;

/* loaded from: classes7.dex */
public final class mw71 {
    public final up81 a;

    public mw71(up81 up81Var) {
        this.a = up81Var;
    }

    public final ArrayList a(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String a = this.a.a((zp1) next);
            Object obj = linkedHashMap.get(a);
            if (obj == null) {
                obj = qv10.w(a, linkedHashMap);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            zp1 zp1Var = ((String) entry.getKey()) != null ? (zp1) a.P((List) entry.getValue()) : null;
            if (zp1Var != null) {
                arrayList2.add(zp1Var);
            }
        }
        return arrayList2;
    }
}
