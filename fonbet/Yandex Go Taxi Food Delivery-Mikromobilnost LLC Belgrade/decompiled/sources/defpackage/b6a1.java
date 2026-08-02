package defpackage;

/* loaded from: classes11.dex */
public final class b6a1 implements ip60 {
    public static final b6a1 a = new b6a1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;

    static {
        nr91 nr91Var = new nr91();
        nr91Var.a = 1;
        b = new lxq("logEventKey", x4e.u(uw51.p(cs91.class, nr91Var.a())));
        nr91 nr91Var2 = new nr91();
        nr91Var2.a = 2;
        c = new lxq("eventCount", x4e.u(uw51.p(cs91.class, nr91Var2.a())));
        nr91 nr91Var3 = new nr91();
        nr91Var3.a = 3;
        d = new lxq("inferenceDurationStats", x4e.u(uw51.p(cs91.class, nr91Var3.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        qv91 qv91Var = (qv91) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, qv91Var.a);
        jp60Var.f(c, qv91Var.b);
        jp60Var.f(d, qv91Var.c);
    }
}
