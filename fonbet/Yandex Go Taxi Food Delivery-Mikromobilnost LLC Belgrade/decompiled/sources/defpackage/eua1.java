package defpackage;

/* loaded from: classes11.dex */
public final class eua1 implements ip60 {
    public static final eua1 a = new eua1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;

    static {
        pb91 pb91Var = new pb91();
        pb91Var.a = 1;
        b = new lxq("width", x4e.u(uw51.m(nd91.class, pb91Var.a())));
        pb91 pb91Var2 = new pb91();
        pb91Var2.a = 2;
        c = new lxq("height", x4e.u(uw51.m(nd91.class, pb91Var2.a())));
        pb91 pb91Var3 = new pb91();
        pb91Var3.a = 3;
        d = new lxq("startX", x4e.u(uw51.m(nd91.class, pb91Var3.a())));
        pb91 pb91Var4 = new pb91();
        pb91Var4.a = 4;
        e = new lxq("startY", x4e.u(uw51.m(nd91.class, pb91Var4.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        nmb1 nmb1Var = (nmb1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, nmb1Var.a);
        jp60Var.f(c, nmb1Var.b);
        jp60Var.f(d, nmb1Var.c);
        jp60Var.f(e, nmb1Var.d);
    }
}
