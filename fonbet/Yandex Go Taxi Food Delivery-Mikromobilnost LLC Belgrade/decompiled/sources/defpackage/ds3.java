package defpackage;

/* loaded from: classes.dex */
public final class ds3 implements ip60 {
    public static final ds3 a = new ds3();
    public static final lxq b;
    public static final lxq c;

    static {
        nb3 nb3Var = new nb3();
        nb3Var.a = 1;
        b = new lxq("logSource", x4e.u(x4e.o(dvf0.class, nb3Var.a())));
        nb3 nb3Var2 = new nb3();
        nb3Var2.a = 2;
        c = new lxq("logEventDropped", x4e.u(x4e.o(dvf0.class, nb3Var2.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        tfz tfzVar = (tfz) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, tfzVar.b());
        jp60Var.f(c, tfzVar.a());
    }
}
