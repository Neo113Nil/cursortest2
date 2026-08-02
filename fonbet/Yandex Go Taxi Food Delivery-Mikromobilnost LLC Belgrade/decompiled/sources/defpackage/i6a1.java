package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;

/* loaded from: classes11.dex */
public final class i6a1 implements ip60 {
    public static final i6a1 a = new i6a1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;
    public static final lxq f;
    public static final lxq g;
    public static final lxq h;

    static {
        nr91 nr91Var = new nr91();
        nr91Var.a = 1;
        b = new lxq(ErrorResponseData.JSON_ERROR_CODE, x4e.u(uw51.p(cs91.class, nr91Var.a())));
        nr91 nr91Var2 = new nr91();
        nr91Var2.a = 2;
        c = new lxq("hasResult", x4e.u(uw51.p(cs91.class, nr91Var2.a())));
        nr91 nr91Var3 = new nr91();
        nr91Var3.a = 3;
        d = new lxq("isColdCall", x4e.u(uw51.p(cs91.class, nr91Var3.a())));
        nr91 nr91Var4 = new nr91();
        nr91Var4.a = 4;
        e = new lxq("imageInfo", x4e.u(uw51.p(cs91.class, nr91Var4.a())));
        nr91 nr91Var5 = new nr91();
        nr91Var5.a = 5;
        f = new lxq("options", x4e.u(uw51.p(cs91.class, nr91Var5.a())));
        nr91 nr91Var6 = new nr91();
        nr91Var6.a = 6;
        g = new lxq("detectedBarcodeFormats", x4e.u(uw51.p(cs91.class, nr91Var6.a())));
        nr91 nr91Var7 = new nr91();
        nr91Var7.a = 7;
        h = new lxq("detectedBarcodeValueTypes", x4e.u(uw51.p(cs91.class, nr91Var7.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        gv91 gv91Var = (gv91) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, gv91Var.a);
        jp60Var.f(c, null);
        jp60Var.f(d, gv91Var.b);
        jp60Var.f(e, null);
        jp60Var.f(f, gv91Var.c);
        jp60Var.f(g, gv91Var.d);
        jp60Var.f(h, gv91Var.e);
    }
}
