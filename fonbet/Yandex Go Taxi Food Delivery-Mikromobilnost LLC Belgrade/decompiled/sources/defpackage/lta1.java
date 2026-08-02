package defpackage;

/* loaded from: classes11.dex */
public final class lta1 implements ip60 {
    public static final lta1 a = new lta1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;
    public static final lxq f;

    static {
        nr91 nr91Var = new nr91();
        nr91Var.a = 1;
        b = new lxq("inferenceCommonLogEvent", x4e.u(uw51.p(cs91.class, nr91Var.a())));
        nr91 nr91Var2 = new nr91();
        nr91Var2.a = 2;
        c = new lxq("options", x4e.u(uw51.p(cs91.class, nr91Var2.a())));
        nr91 nr91Var3 = new nr91();
        nr91Var3.a = 3;
        d = new lxq("detectedBarcodeFormats", x4e.u(uw51.p(cs91.class, nr91Var3.a())));
        nr91 nr91Var4 = new nr91();
        nr91Var4.a = 4;
        e = new lxq("detectedBarcodeValueTypes", x4e.u(uw51.p(cs91.class, nr91Var4.a())));
        nr91 nr91Var5 = new nr91();
        nr91Var5.a = 5;
        f = new lxq("imageInfo", x4e.u(uw51.p(cs91.class, nr91Var5.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        cmb1 cmb1Var = (cmb1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, cmb1Var.a);
        jp60Var.f(c, cmb1Var.b);
        jp60Var.f(d, cmb1Var.c);
        jp60Var.f(e, cmb1Var.d);
        jp60Var.f(f, cmb1Var.e);
    }
}
