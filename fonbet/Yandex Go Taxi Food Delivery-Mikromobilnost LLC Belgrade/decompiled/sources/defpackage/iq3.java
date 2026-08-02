package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class iq3 implements ip60 {
    public static final iq3 a = new iq3();
    public static final lxq b = lxq.c("generator");
    public static final lxq c = lxq.c("identifier");
    public static final lxq d = lxq.c("appQualitySessionId");
    public static final lxq e = lxq.c("startedAt");
    public static final lxq f = lxq.c("endedAt");
    public static final lxq g = lxq.c("crashed");
    public static final lxq h = lxq.c("app");
    public static final lxq i = lxq.c("user");
    public static final lxq j = lxq.c("os");
    public static final lxq k = lxq.c("device");
    public static final lxq l = lxq.c("events");
    public static final lxq m = lxq.c("generatorType");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.e eVar = (c3f.e) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, eVar.f());
        jp60Var.f(c, eVar.h().getBytes(c3f.a));
        jp60Var.f(d, eVar.b());
        jp60Var.e(e, eVar.j());
        jp60Var.f(f, eVar.d());
        jp60Var.b(g, eVar.l());
        jp60Var.f(h, eVar.a());
        jp60Var.f(i, eVar.k());
        jp60Var.f(j, eVar.i());
        jp60Var.f(k, eVar.c());
        jp60Var.f(l, eVar.e());
        jp60Var.c(m, eVar.g());
    }
}
