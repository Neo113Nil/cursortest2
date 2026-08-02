package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;

/* loaded from: classes11.dex */
public final class cqa1 implements ip60 {
    public static final cqa1 a = new cqa1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;

    static {
        pb91 pb91Var = new pb91();
        pb91Var.a = 1;
        b = new lxq(ErrorResponseData.JSON_ERROR_CODE, x4e.u(uw51.m(nd91.class, pb91Var.a())));
        pb91 pb91Var2 = new pb91();
        pb91Var2.a = 2;
        c = new lxq("durationMs", x4e.u(uw51.m(nd91.class, pb91Var2.a())));
        pb91 pb91Var3 = new pb91();
        pb91Var3.a = 3;
        d = new lxq("subjectSegmenterOptions", x4e.u(uw51.m(nd91.class, pb91Var3.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        kkb1 kkb1Var = (kkb1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, kkb1Var.a);
        jp60Var.f(c, kkb1Var.b);
        jp60Var.f(d, kkb1Var.c);
    }
}
