package defpackage;

/* loaded from: classes.dex */
public final class as3 implements ip60 {
    public static final as3 a = new as3();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;

    static {
        nb3 nb3Var = new nb3();
        nb3Var.a = 1;
        b = new lxq("window", x4e.u(x4e.o(dvf0.class, nb3Var.a())));
        nb3 nb3Var2 = new nb3();
        nb3Var2.a = 2;
        c = new lxq("logSourceMetrics", x4e.u(x4e.o(dvf0.class, nb3Var2.a())));
        nb3 nb3Var3 = new nb3();
        nb3Var3.a = 3;
        d = new lxq("globalMetrics", x4e.u(x4e.o(dvf0.class, nb3Var3.a())));
        nb3 nb3Var4 = new nb3();
        nb3Var4.a = 4;
        e = new lxq("appNamespace", x4e.u(x4e.o(dvf0.class, nb3Var4.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        w2c w2cVar = (w2c) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, w2cVar.a);
        jp60Var.f(c, w2cVar.b);
        jp60Var.f(d, w2cVar.c);
        jp60Var.f(e, w2cVar.d);
    }
}
