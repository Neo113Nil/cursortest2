package defpackage;

/* loaded from: classes.dex */
public final class is3 implements ip60 {
    public static final is3 a = new is3();
    public static final lxq b;
    public static final lxq c;

    static {
        nb3 nb3Var = new nb3();
        nb3Var.a = 1;
        b = new lxq("currentCacheSizeBytes", x4e.u(x4e.o(dvf0.class, nb3Var.a())));
        nb3 nb3Var2 = new nb3();
        nb3Var2.a = 2;
        c = new lxq("maxCacheSizeBytes", x4e.u(x4e.o(dvf0.class, nb3Var2.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        dju0 dju0Var = (dju0) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.e(b, dju0Var.a);
        jp60Var.e(c, dju0Var.b);
    }
}
