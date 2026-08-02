package defpackage;

import defpackage.c3f;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class aq3 implements ip60 {
    public static final aq3 a = new aq3();
    public static final lxq b = lxq.c("pid");
    public static final lxq c = lxq.c("processName");
    public static final lxq d = lxq.c("reasonCode");
    public static final lxq e = lxq.c("importance");
    public static final lxq f = lxq.c("pss");
    public static final lxq g = lxq.c("rss");
    public static final lxq h = lxq.c(ClidProvider.TIMESTAMP);
    public static final lxq i = lxq.c("traceFile");
    public static final lxq j = lxq.c("buildIdMappingForArch");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.a aVar = (c3f.a) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.c(b, aVar.c());
        jp60Var.f(c, aVar.d());
        jp60Var.c(d, aVar.f());
        jp60Var.c(e, aVar.b());
        jp60Var.e(f, aVar.e());
        jp60Var.e(g, aVar.g());
        jp60Var.e(h, aVar.h());
        jp60Var.f(i, aVar.i());
        jp60Var.f(j, aVar.a());
    }
}
