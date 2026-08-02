package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class fq3 implements ip60 {
    public static final fq3 a = new fq3();
    public static final lxq b = lxq.c("identifier");
    public static final lxq c = lxq.c("version");
    public static final lxq d = lxq.c("displayVersion");
    public static final lxq e = lxq.c("organization");
    public static final lxq f = lxq.c("installationUuid");
    public static final lxq g = lxq.c("developmentPlatform");
    public static final lxq h = lxq.c("developmentPlatformVersion");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.e.a aVar = (c3f.e.a) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, aVar.d());
        jp60Var.f(c, aVar.g());
        jp60Var.f(d, aVar.c());
        jp60Var.f(e, aVar.f());
        jp60Var.f(f, aVar.e());
        jp60Var.f(g, aVar.a());
        jp60Var.f(h, aVar.b());
    }
}
