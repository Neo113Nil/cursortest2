package defpackage;

import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;

/* loaded from: classes.dex */
public final class ep3 implements ip60 {
    public static final ep3 a = new ep3();
    public static final lxq b = lxq.c("sdkVersion");
    public static final lxq c = lxq.c("model");
    public static final lxq d = lxq.c("hardware");
    public static final lxq e = lxq.c("device");
    public static final lxq f = lxq.c(CreateApplicationWithProductJsonAdapter.productKey);
    public static final lxq g = lxq.c("osBuild");
    public static final lxq h = lxq.c("manufacturer");
    public static final lxq i = lxq.c("fingerprint");
    public static final lxq j = lxq.c("locale");
    public static final lxq k = lxq.c("country");
    public static final lxq l = lxq.c("mccMnc");
    public static final lxq m = lxq.c("applicationBuild");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        v72 v72Var = (v72) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, v72Var.l());
        jp60Var.f(c, v72Var.i());
        jp60Var.f(d, v72Var.e());
        jp60Var.f(e, v72Var.c());
        jp60Var.f(f, v72Var.k());
        jp60Var.f(g, v72Var.j());
        jp60Var.f(h, v72Var.g());
        jp60Var.f(i, v72Var.d());
        jp60Var.f(j, v72Var.f());
        jp60Var.f(k, v72Var.b());
        jp60Var.f(l, v72Var.h());
        jp60Var.f(m, v72Var.a());
    }
}
