package defpackage;

/* loaded from: classes.dex */
public final class kp3 implements ip60 {
    public static final kp3 a = new kp3();
    public static final lxq b = lxq.c("requestTimeMs");
    public static final lxq c = lxq.c("requestUptimeMs");
    public static final lxq d = lxq.c("clientInfo");
    public static final lxq e = lxq.c("logSource");
    public static final lxq f = lxq.c("logSourceName");
    public static final lxq g = lxq.c("logEvent");
    public static final lxq h = lxq.c("qosTier");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        ifz ifzVar = (ifz) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.e(b, ifzVar.f());
        jp60Var.e(c, ifzVar.g());
        jp60Var.f(d, ifzVar.a());
        jp60Var.f(e, ifzVar.c());
        jp60Var.f(f, ifzVar.d());
        jp60Var.f(g, ifzVar.b());
        jp60Var.f(h, ifzVar.e());
    }
}
