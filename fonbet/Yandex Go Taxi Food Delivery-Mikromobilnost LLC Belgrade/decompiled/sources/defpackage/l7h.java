package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes4.dex */
public class l7h implements t87 {
    public static final HashSet a;
    public static final HashMap b;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashSet.add(b490.U2);
        hashSet.add(b490.W2);
        hashSet.add(b490.Y2);
        hashSet.add(b490.Z2);
        hashSet.add(zo60.c);
        hashSet.add(zo60.a);
        hashSet.add(zo60.b);
        hashSet.add(zo60.g);
        hashSet.add(cdy0.f);
        hashSet.add(cdy0.e);
        hashSet.add(cdy0.g);
        u2 u2Var = bdf.h;
        u2 u2Var2 = bdf.f;
        zpf zpfVar = zpf.b;
        hashMap.put(u2Var, new xr1(u2Var2, zpfVar));
        hashMap.put(pwk0.e, new xr1(pwk0.c, zpfVar));
        hashMap.put(pwk0.f, new xr1(pwk0.d, zpfVar));
    }

    @Override // defpackage.t87
    public final xr1 findEncryptionAlgorithm(xr1 xr1Var) {
        u2 u2Var = xr1Var.a;
        if (a.contains(u2Var)) {
            return new xr1(b490.S2, zpf.b);
        }
        HashMap hashMap = b;
        return hashMap.containsKey(u2Var) ? (xr1) hashMap.get(u2Var) : xr1Var;
    }
}
