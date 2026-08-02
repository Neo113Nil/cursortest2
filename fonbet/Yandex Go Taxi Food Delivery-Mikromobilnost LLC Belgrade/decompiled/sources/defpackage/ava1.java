package defpackage;

/* loaded from: classes11.dex */
public final class ava1 implements ip60 {
    public static final ava1 a = new ava1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;

    static {
        pf91 pf91Var = new pf91();
        pf91Var.a = 1;
        b = new lxq("inferenceCommonLogEvent", x4e.u(uw51.o(dg91.class, pf91Var.a())));
        pf91 pf91Var2 = new pf91();
        pf91Var2.a = 2;
        c = new lxq("imageInfo", x4e.u(uw51.o(dg91.class, pf91Var2.a())));
        pf91 pf91Var3 = new pf91();
        pf91Var3.a = 3;
        d = new lxq("recognizerOptions", x4e.u(uw51.o(dg91.class, pf91Var3.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        xmb1 xmb1Var = (xmb1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, xmb1Var.a);
        jp60Var.f(c, xmb1Var.b);
        jp60Var.f(d, xmb1Var.c);
    }
}
