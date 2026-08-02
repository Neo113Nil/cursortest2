package defpackage;

/* loaded from: classes11.dex */
public final class du91 implements ip60 {
    public static final du91 a = new du91();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;

    static {
        pb91 pb91Var = new pb91();
        pb91Var.a = 1;
        b = new lxq("logEventKey", x4e.u(uw51.m(nd91.class, pb91Var.a())));
        pb91 pb91Var2 = new pb91();
        pb91Var2.a = 2;
        c = new lxq("eventCount", x4e.u(uw51.m(nd91.class, pb91Var2.a())));
        pb91 pb91Var3 = new pb91();
        pb91Var3.a = 3;
        d = new lxq("inferenceDurationStats", x4e.u(uw51.m(nd91.class, pb91Var3.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        ol91 ol91Var = (ol91) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, ol91Var.a);
        jp60Var.f(c, ol91Var.b);
        jp60Var.f(d, ol91Var.c);
    }
}
