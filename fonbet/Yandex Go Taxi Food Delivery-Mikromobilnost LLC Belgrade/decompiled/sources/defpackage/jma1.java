package defpackage;

/* loaded from: classes11.dex */
public final class jma1 implements ip60 {
    public static final jma1 a = new jma1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;
    public static final lxq f;
    public static final lxq g;

    static {
        nr91 nr91Var = new nr91();
        nr91Var.a = 1;
        b = new lxq("maxMs", x4e.u(uw51.p(cs91.class, nr91Var.a())));
        nr91 nr91Var2 = new nr91();
        nr91Var2.a = 2;
        c = new lxq("minMs", x4e.u(uw51.p(cs91.class, nr91Var2.a())));
        nr91 nr91Var3 = new nr91();
        nr91Var3.a = 3;
        d = new lxq("avgMs", x4e.u(uw51.p(cs91.class, nr91Var3.a())));
        nr91 nr91Var4 = new nr91();
        nr91Var4.a = 4;
        e = new lxq("firstQuartileMs", x4e.u(uw51.p(cs91.class, nr91Var4.a())));
        nr91 nr91Var5 = new nr91();
        nr91Var5.a = 5;
        f = new lxq("medianMs", x4e.u(uw51.p(cs91.class, nr91Var5.a())));
        nr91 nr91Var6 = new nr91();
        nr91Var6.a = 6;
        g = new lxq("thirdQuartileMs", x4e.u(uw51.p(cs91.class, nr91Var6.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        mgb1 mgb1Var = (mgb1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, mgb1Var.a);
        jp60Var.f(c, mgb1Var.b);
        jp60Var.f(d, mgb1Var.c);
        jp60Var.f(e, mgb1Var.d);
        jp60Var.f(f, mgb1Var.e);
        jp60Var.f(g, mgb1Var.f);
    }
}
