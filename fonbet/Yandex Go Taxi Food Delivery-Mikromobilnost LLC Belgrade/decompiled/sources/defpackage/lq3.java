package defpackage;

import defpackage.c3f;
import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes.dex */
public final class lq3 implements ip60 {
    public static final lq3 a = new lq3();
    public static final lxq b = lxq.c("threads");
    public static final lxq c = lxq.c(Constants.KEY_EXCEPTION);
    public static final lxq d = lxq.c("appExitInfo");
    public static final lxq e = lxq.c("signal");
    public static final lxq f = lxq.c("binaries");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.e.d.a.b bVar = (c3f.e.d.a.b) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, bVar.e());
        jp60Var.f(c, bVar.c());
        jp60Var.f(d, bVar.a());
        jp60Var.f(e, bVar.d());
        jp60Var.f(f, bVar.b());
    }
}
