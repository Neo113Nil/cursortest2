package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: StorefrontServicesState.kt */
/* loaded from: classes18.dex */
public final class wyh0 {
    public final Map<Long, uoi0> a;
    public final boolean b;
    public final boolean c;

    public wyh0(boolean z, boolean z2, Map map) {
        this.a = map;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static wyh0 a(wyh0 wyh0Var, LinkedHashMap linkedHashMap, int i) {
        Map map = linkedHashMap;
        if ((i & 1) != 0) {
            map = wyh0Var.a;
        }
        boolean z = wyh0Var.b;
        boolean z2 = wyh0Var.c;
        wyh0Var.getClass();
        return new wyh0(z, z2, map);
    }

    public final wyh0 b(List<uoi0> list) {
        Map<Long, uoi0> map = this.a;
        Set<Long> keySet = map.keySet();
        List<uoi0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((uoi0) it.next()).i));
        }
        if (!p4g.b(keySet, arrayList)) {
            return this;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (uoi0 uoi0Var : list2) {
            linkedHashMap.put(Long.valueOf(uoi0Var.i), uoi0Var);
        }
        return a(this, linkedHashMap, 6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyh0)) {
            return false;
        }
        wyh0 wyh0Var = (wyh0) obj;
        return epx.f(this.a, wyh0Var.a) && this.b == wyh0Var.b && this.c == wyh0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchStateData(services=");
        sb.append(this.a);
        sb.append(", hasMore=");
        sb.append(this.b);
        sb.append(", isListViewType=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
