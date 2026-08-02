package defpackage;

import defpackage.c3f;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class hq3 implements ip60 {
    public static final hq3 a = new hq3();
    public static final lxq b = lxq.c("arch");
    public static final lxq c = lxq.c("model");
    public static final lxq d = lxq.c("cores");
    public static final lxq e = lxq.c("ram");
    public static final lxq f = lxq.c("diskSpace");
    public static final lxq g = lxq.c("simulator");
    public static final lxq h = lxq.c(ClidProvider.STATE);
    public static final lxq i = lxq.c("manufacturer");
    public static final lxq j = lxq.c("modelClass");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.e.c cVar = (c3f.e.c) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.c(b, cVar.a());
        jp60Var.f(c, cVar.e());
        jp60Var.c(d, cVar.b());
        jp60Var.e(e, cVar.g());
        jp60Var.e(f, cVar.c());
        jp60Var.b(g, cVar.i());
        jp60Var.c(h, cVar.h());
        jp60Var.f(i, cVar.d());
        jp60Var.f(j, cVar.f());
    }
}
