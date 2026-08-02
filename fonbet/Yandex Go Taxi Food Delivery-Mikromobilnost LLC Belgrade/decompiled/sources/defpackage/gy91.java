package defpackage;

/* loaded from: classes11.dex */
public final class gy91 implements ip60 {
    public static final gy91 a = new gy91();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;
    public static final lxq f;
    public static final lxq g;

    static {
        bf91 bf91Var = new bf91();
        bf91Var.a = 1;
        b = new lxq("landmarkMode", x4e.u(uw51.n(sf91.class, bf91Var.a())));
        bf91 bf91Var2 = new bf91();
        bf91Var2.a = 2;
        c = new lxq("classificationMode", x4e.u(uw51.n(sf91.class, bf91Var2.a())));
        bf91 bf91Var3 = new bf91();
        bf91Var3.a = 3;
        d = new lxq("performanceMode", x4e.u(uw51.n(sf91.class, bf91Var3.a())));
        bf91 bf91Var4 = new bf91();
        bf91Var4.a = 4;
        e = new lxq("contourMode", x4e.u(uw51.n(sf91.class, bf91Var4.a())));
        bf91 bf91Var5 = new bf91();
        bf91Var5.a = 5;
        f = new lxq("isTrackingEnabled", x4e.u(uw51.n(sf91.class, bf91Var5.a())));
        bf91 bf91Var6 = new bf91();
        bf91Var6.a = 6;
        g = new lxq("minFaceSize", x4e.u(uw51.n(sf91.class, bf91Var6.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        fna1 fna1Var = (fna1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, fna1Var.a);
        jp60Var.f(c, fna1Var.b);
        jp60Var.f(d, fna1Var.c);
        jp60Var.f(e, fna1Var.d);
        jp60Var.f(f, fna1Var.e);
        jp60Var.f(g, fna1Var.f);
    }
}
