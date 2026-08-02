package defpackage;

/* loaded from: classes11.dex */
public final class o8a1 implements ip60 {
    public static final o8a1 a = new o8a1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;
    public static final lxq f;
    public static final lxq g;

    static {
        pf91 pf91Var = new pf91();
        pf91Var.a = 1;
        b = new lxq("maxMs", x4e.u(uw51.o(dg91.class, pf91Var.a())));
        pf91 pf91Var2 = new pf91();
        pf91Var2.a = 2;
        c = new lxq("minMs", x4e.u(uw51.o(dg91.class, pf91Var2.a())));
        pf91 pf91Var3 = new pf91();
        pf91Var3.a = 3;
        d = new lxq("avgMs", x4e.u(uw51.o(dg91.class, pf91Var3.a())));
        pf91 pf91Var4 = new pf91();
        pf91Var4.a = 4;
        e = new lxq("firstQuartileMs", x4e.u(uw51.o(dg91.class, pf91Var4.a())));
        pf91 pf91Var5 = new pf91();
        pf91Var5.a = 5;
        f = new lxq("medianMs", x4e.u(uw51.o(dg91.class, pf91Var5.a())));
        pf91 pf91Var6 = new pf91();
        pf91Var6.a = 6;
        g = new lxq("thirdQuartileMs", x4e.u(uw51.o(dg91.class, pf91Var6.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        g7b1 g7b1Var = (g7b1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, g7b1Var.a);
        jp60Var.f(c, g7b1Var.b);
        jp60Var.f(d, g7b1Var.c);
        jp60Var.f(e, g7b1Var.d);
        jp60Var.f(f, g7b1Var.e);
        jp60Var.f(g, g7b1Var.f);
    }
}
