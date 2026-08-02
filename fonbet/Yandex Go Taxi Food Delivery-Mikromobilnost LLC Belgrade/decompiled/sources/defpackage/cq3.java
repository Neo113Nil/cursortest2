package defpackage;

/* loaded from: classes.dex */
public final class cq3 implements ip60 {
    public static final cq3 a = new cq3();
    public static final lxq b = lxq.c("sdkVersion");
    public static final lxq c = lxq.c("gmpAppId");
    public static final lxq d = lxq.c("platform");
    public static final lxq e = lxq.c("installationUuid");
    public static final lxq f = lxq.c("firebaseInstallationId");
    public static final lxq g = lxq.c("firebaseAuthenticationToken");
    public static final lxq h = lxq.c("appQualitySessionId");
    public static final lxq i = lxq.c("buildVersion");
    public static final lxq j = lxq.c("displayVersion");
    public static final lxq k = lxq.c("session");
    public static final lxq l = lxq.c("ndkPayload");
    public static final lxq m = lxq.c("appExitInfo");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f c3fVar = (c3f) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, c3fVar.k());
        jp60Var.f(c, c3fVar.g());
        jp60Var.c(d, c3fVar.j());
        jp60Var.f(e, c3fVar.h());
        jp60Var.f(f, c3fVar.f());
        jp60Var.f(g, c3fVar.e());
        jp60Var.f(h, c3fVar.b());
        jp60Var.f(i, c3fVar.c());
        jp60Var.f(j, c3fVar.d());
        jp60Var.f(k, c3fVar.l());
        jp60Var.f(l, c3fVar.i());
        jp60Var.f(m, c3fVar.a());
    }
}
