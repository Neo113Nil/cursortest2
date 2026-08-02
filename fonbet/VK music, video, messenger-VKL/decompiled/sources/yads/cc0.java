package yads;

import java.util.HashMap;

/* loaded from: classes10.dex */
public abstract class cc0 {
    public static HashMap a(String str) {
        int[] a = dc0.a(str);
        HashMap hashMap = new HashMap(8);
        hashMap.put(0, 1000000L);
        tn2 tn2Var = dc0.n;
        hashMap.put(2, (Long) tn2Var.get(a[0]));
        hashMap.put(3, (Long) dc0.o.get(a[1]));
        hashMap.put(4, (Long) dc0.p.get(a[2]));
        hashMap.put(5, (Long) dc0.q.get(a[3]));
        hashMap.put(10, (Long) dc0.r.get(a[4]));
        hashMap.put(9, (Long) dc0.s.get(a[5]));
        hashMap.put(7, (Long) tn2Var.get(a[0]));
        return hashMap;
    }
}
