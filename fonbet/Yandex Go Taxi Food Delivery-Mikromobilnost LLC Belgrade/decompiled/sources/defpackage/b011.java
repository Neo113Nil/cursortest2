package defpackage;

import java.util.HashMap;

/* loaded from: classes9.dex */
public final class b011 {
    public final pho a;

    public b011(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(a011 a011Var, yz01 yz01Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("starting", a011Var.a());
        hashMap.put("destination", yz01Var.a());
        this.a.a("Transport.Address.Selected", hashMap, 1, new HashMap());
    }
}
