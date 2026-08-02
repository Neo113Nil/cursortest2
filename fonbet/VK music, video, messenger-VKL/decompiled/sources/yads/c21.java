package yads;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class c21 extends ho {
    public final ho a;
    public final jc3 b;

    public c21(ru1 ru1Var, jc3 jc3Var) {
        this.a = ru1Var;
        this.b = jc3Var;
    }

    @Override // yads.ho
    public final a21 a(qp2 qp2Var, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        w11 w11Var = w11.c;
        hashMap.put("User-Agent", ((p63) this.b.a).a());
        return this.a.a(qp2Var, hashMap);
    }
}
