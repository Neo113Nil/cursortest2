package defpackage;

/* loaded from: classes.dex */
public final class jp3 implements ip60 {
    public static final jp3 a = new jp3();
    public static final lxq b = lxq.c("eventTimeMs");
    public static final lxq c = lxq.c("eventCode");
    public static final lxq d = lxq.c("complianceData");
    public static final lxq e = lxq.c("eventUptimeMs");
    public static final lxq f = lxq.c("sourceExtension");
    public static final lxq g = lxq.c("sourceExtensionJsonProto3");
    public static final lxq h = lxq.c("timezoneOffsetSeconds");
    public static final lxq i = lxq.c("networkConnectionInfo");
    public static final lxq j = lxq.c("experimentIds");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        gez gezVar = (gez) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.e(b, gezVar.c());
        jp60Var.f(c, gezVar.b());
        jp60Var.f(d, gezVar.a());
        jp60Var.e(e, gezVar.d());
        jp60Var.f(f, gezVar.g());
        jp60Var.f(g, gezVar.h());
        jp60Var.e(h, gezVar.i());
        jp60Var.f(i, gezVar.f());
        jp60Var.f(j, gezVar.e());
    }
}
