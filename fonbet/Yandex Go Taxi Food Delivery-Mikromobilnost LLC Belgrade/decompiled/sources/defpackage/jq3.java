package defpackage;

import defpackage.c3f;
import io.appmetrica.analytics.impl.C0553n3;

/* loaded from: classes.dex */
public final class jq3 implements ip60 {
    public static final jq3 a = new jq3();
    public static final lxq b = lxq.c("execution");
    public static final lxq c = lxq.c("customAttributes");
    public static final lxq d = lxq.c("internalKeys");
    public static final lxq e = lxq.c(C0553n3.g);
    public static final lxq f = lxq.c("currentProcessDetails");
    public static final lxq g = lxq.c("appProcessDetails");
    public static final lxq h = lxq.c("uiOrientation");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.e.d.a aVar = (c3f.e.d.a) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, aVar.e());
        jp60Var.f(c, aVar.d());
        jp60Var.f(d, aVar.f());
        jp60Var.f(e, aVar.b());
        jp60Var.f(f, aVar.c());
        jp60Var.f(g, aVar.a());
        jp60Var.c(h, aVar.g());
    }
}
