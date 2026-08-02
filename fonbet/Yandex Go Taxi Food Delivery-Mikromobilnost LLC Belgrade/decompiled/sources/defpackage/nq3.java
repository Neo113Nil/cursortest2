package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.c3f;

/* loaded from: classes.dex */
public final class nq3 implements ip60 {
    public static final nq3 a = new nq3();
    public static final lxq b = lxq.c("name");
    public static final lxq c = lxq.c(AuthSdkActivity.RESPONSE_TYPE_CODE);
    public static final lxq d = lxq.c("address");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.e.d.a.b.AbstractC0018d abstractC0018d = (c3f.e.d.a.b.AbstractC0018d) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, abstractC0018d.c());
        jp60Var.f(c, abstractC0018d.b());
        jp60Var.e(d, abstractC0018d.a());
    }
}
