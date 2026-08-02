package defpackage;

/* loaded from: classes11.dex */
public final class fva1 implements ip60 {
    public static final fva1 a = new fva1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;

    static {
        pf91 pf91Var = new pf91();
        pf91Var.a = 3;
        b = new lxq("languageOption", x4e.u(uw51.o(dg91.class, pf91Var.a())));
        pf91 pf91Var2 = new pf91();
        pf91Var2.a = 4;
        c = new lxq("isUsingLegacyApi", x4e.u(uw51.o(dg91.class, pf91Var2.a())));
        pf91 pf91Var3 = new pf91();
        pf91Var3.a = 5;
        d = new lxq("sdkVersion", x4e.u(uw51.o(dg91.class, pf91Var3.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, ((qnb1) obj).a);
        jp60Var.f(c, null);
        jp60Var.f(d, null);
    }
}
