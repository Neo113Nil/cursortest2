package defpackage;

/* loaded from: classes11.dex */
public final class c3a1 implements ip60 {
    public static final c3a1 a = new c3a1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;
    public static final lxq f;
    public static final lxq g;

    static {
        pb91 pb91Var = new pb91();
        pb91Var.a = 1;
        b = new lxq("maxMs", x4e.u(uw51.m(nd91.class, pb91Var.a())));
        pb91 pb91Var2 = new pb91();
        pb91Var2.a = 2;
        c = new lxq("minMs", x4e.u(uw51.m(nd91.class, pb91Var2.a())));
        pb91 pb91Var3 = new pb91();
        pb91Var3.a = 3;
        d = new lxq("avgMs", x4e.u(uw51.m(nd91.class, pb91Var3.a())));
        pb91 pb91Var4 = new pb91();
        pb91Var4.a = 4;
        e = new lxq("firstQuartileMs", x4e.u(uw51.m(nd91.class, pb91Var4.a())));
        pb91 pb91Var5 = new pb91();
        pb91Var5.a = 5;
        f = new lxq("medianMs", x4e.u(uw51.m(nd91.class, pb91Var5.a())));
        pb91 pb91Var6 = new pb91();
        pb91Var6.a = 6;
        g = new lxq("thirdQuartileMs", x4e.u(uw51.m(nd91.class, pb91Var6.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        v3b1 v3b1Var = (v3b1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, v3b1Var.a);
        jp60Var.f(c, v3b1Var.b);
        jp60Var.f(d, v3b1Var.c);
        jp60Var.f(e, v3b1Var.d);
        jp60Var.f(f, v3b1Var.e);
        jp60Var.f(g, v3b1Var.f);
    }
}
