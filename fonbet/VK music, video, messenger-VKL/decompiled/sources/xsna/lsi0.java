package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: StorefrontServicesState.kt */
/* loaded from: classes18.dex */
public final class lsi0 {
    public final int a;
    public final Map<Long, uoi0> b;
    public final List<fsi0> c;
    public final boolean d;
    public final String e;

    public lsi0(int i, Map<Long, uoi0> map, List<fsi0> list, boolean z, String str) {
        this.a = i;
        this.b = map;
        this.c = list;
        this.d = z;
        this.e = str;
    }

    public final lsi0 a(List<uoi0> list) {
        Map<Long, uoi0> map = this.b;
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
        s3q0 s3q0Var = s3q0.a;
        return new lsi0(this.a, linkedHashMap, this.c, this.d, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsi0)) {
            return false;
        }
        lsi0 lsi0Var = (lsi0) obj;
        return this.a == lsi0Var.a && epx.f(this.b, lsi0Var.b) && epx.f(this.c, lsi0Var.c) && this.d == lsi0Var.d && epx.f(this.e, lsi0Var.e);
    }

    public final int hashCode() {
        int a = v11.a(Integer.hashCode(this.a) * 31, 31, this.b);
        List<fsi0> list = this.c;
        int b = qoy.b((a + (list == null ? 0 : list.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServicesStateData(totalCount=");
        sb.append(this.a);
        sb.append(", services=");
        sb.append(this.b);
        sb.append(", sections=");
        sb.append(this.c);
        sb.append(", isListViewType=");
        sb.append(this.d);
        sb.append(", header=");
        return ho8.a(sb, this.e, ')');
    }
}
