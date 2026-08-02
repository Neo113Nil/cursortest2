package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class hsu implements jp00 {
    @Override // defpackage.jp00
    public final vxi0 a(vxi0 vxi0Var) {
        Map map = vxi0Var.a;
        Map map2 = vxi0Var.b;
        ArrayList arrayList = vxi0Var.d;
        Set keySet = map.keySet();
        LinkedHashMap linkedHashMap = vxi0Var.c;
        Set keySet2 = linkedHashMap.keySet();
        Set g = v4r0.g(keySet, keySet2);
        Set set = keySet;
        Set g2 = v4r0.g(keySet2, set);
        LinkedHashSet<String> U = a.U(set, keySet2);
        Iterator it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(new mxi0((String) it.next()));
        }
        Iterator it2 = g2.iterator();
        while (it2.hasNext()) {
            arrayList.add(new ixi0((lm00) b.g((String) it2.next(), map2)));
        }
        for (String str : U) {
            if (!jl40.l((no00) b.g(str, vxi0Var.a), (no00) b.g(str, linkedHashMap))) {
                arrayList.add(new qxi0((lm00) b.g(str, map2)));
            }
        }
        return vxi0Var;
    }

    @Override // defpackage.jp00
    public final int getOrder() {
        return 100;
    }
}
