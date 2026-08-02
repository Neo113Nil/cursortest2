package defpackage;

/* loaded from: classes11.dex */
public final class lz91 implements ip60 {
    public static final lz91 a = new lz91();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;

    static {
        pf91 pf91Var = new pf91();
        pf91Var.a = 1;
        b = new lxq("logEventKey", x4e.u(uw51.o(dg91.class, pf91Var.a())));
        pf91 pf91Var2 = new pf91();
        pf91Var2.a = 2;
        c = new lxq("eventCount", x4e.u(uw51.o(dg91.class, pf91Var2.a())));
        pf91 pf91Var3 = new pf91();
        pf91Var3.a = 3;
        d = new lxq("inferenceDurationStats", x4e.u(uw51.o(dg91.class, pf91Var3.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        vp91 vp91Var = (vp91) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, vp91Var.a);
        jp60Var.f(c, vp91Var.b);
        jp60Var.f(d, vp91Var.c);
    }
}
