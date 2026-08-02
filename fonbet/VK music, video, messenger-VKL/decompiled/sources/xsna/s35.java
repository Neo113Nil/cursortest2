package xsna;

import xsna.xbr0;

/* compiled from: AuthGetVkConnectRemoteConfig.kt */
/* loaded from: classes6.dex */
public final class s35 extends nx2<wmu0> {
    public final int b;

    public s35(int i) {
        this.b = i;
    }

    @Override // xsna.nx2
    public final wmu0 f(l7r0 l7r0Var) {
        xbr0.a aVar = new xbr0.a();
        aVar.a = i5s.a(new StringBuilder("https://id."), a0a.d, "/get_config");
        aVar.b = false;
        aVar.a("app_id", String.valueOf(this.b));
        aVar.a("v", l7r0Var.a.g);
        return (wmu0) l7r0.g(l7r0Var, new xbr0(aVar), r35.b);
    }
}
