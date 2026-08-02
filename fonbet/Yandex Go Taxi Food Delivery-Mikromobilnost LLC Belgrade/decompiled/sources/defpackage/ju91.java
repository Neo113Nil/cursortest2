package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;

/* loaded from: classes11.dex */
public final class ju91 implements ip60 {
    public static final ju91 a = new ju91();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;

    static {
        pb91 pb91Var = new pb91();
        pb91Var.a = 1;
        b = new lxq(ErrorResponseData.JSON_ERROR_CODE, x4e.u(uw51.m(nd91.class, pb91Var.a())));
        pb91 pb91Var2 = new pb91();
        pb91Var2.a = 2;
        c = new lxq("isColdCall", x4e.u(uw51.m(nd91.class, pb91Var2.a())));
        pb91 pb91Var3 = new pb91();
        pb91Var3.a = 3;
        d = new lxq("imageInfo", x4e.u(uw51.m(nd91.class, pb91Var3.a())));
        pb91 pb91Var4 = new pb91();
        pb91Var4.a = 4;
        e = new lxq("subjectSegmenterOptions", x4e.u(uw51.m(nd91.class, pb91Var4.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        yk91 yk91Var = (yk91) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, yk91Var.a);
        jp60Var.f(c, yk91Var.b);
        jp60Var.f(d, null);
        jp60Var.f(e, yk91Var.c);
    }
}
