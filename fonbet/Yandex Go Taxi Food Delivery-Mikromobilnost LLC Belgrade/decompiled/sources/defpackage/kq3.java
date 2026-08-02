package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class kq3 implements ip60 {
    public static final kq3 a = new kq3();
    public static final lxq b = lxq.c("baseAddress");
    public static final lxq c = lxq.c("size");
    public static final lxq d = lxq.c("name");
    public static final lxq e = lxq.c("uuid");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.e.d.a.b.AbstractC0014a abstractC0014a = (c3f.e.d.a.b.AbstractC0014a) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.e(b, abstractC0014a.a());
        jp60Var.e(c, abstractC0014a.c());
        jp60Var.f(d, abstractC0014a.b());
        String d2 = abstractC0014a.d();
        jp60Var.f(e, d2 != null ? d2.getBytes(c3f.a) : null);
    }
}
