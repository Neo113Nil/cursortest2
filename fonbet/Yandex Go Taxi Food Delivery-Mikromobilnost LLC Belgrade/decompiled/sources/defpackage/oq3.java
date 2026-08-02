package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class oq3 implements ip60 {
    public static final oq3 a = new oq3();
    public static final lxq b = lxq.c("name");
    public static final lxq c = lxq.c("importance");
    public static final lxq d = lxq.c("frames");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.e.d.a.b.AbstractC0020e abstractC0020e = (c3f.e.d.a.b.AbstractC0020e) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, abstractC0020e.c());
        jp60Var.c(c, abstractC0020e.b());
        jp60Var.f(d, abstractC0020e.a());
    }
}
