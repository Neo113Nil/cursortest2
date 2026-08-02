package xsna;

import xsna.n7r0;

/* compiled from: VkAppValidationHandlerDecorator.kt */
/* loaded from: classes.dex */
public final class sau0 implements n7r0 {
    public final zcu0 b;

    public sau0(zcu0 zcu0Var) {
        this.b = zcu0Var;
    }

    @Override // xsna.n7r0
    public final void a(n7r0.b bVar, n7r0.a<n7r0.c> aVar) {
        c63 c63Var = c63.a;
        if (c63.f) {
            this.b.a(bVar, aVar);
            return;
        }
        par0.a.getClass();
        par0.e("VkAppValidationHandlerDecorator: invoke handleCaptcha, but DefaultCaptchaResolver#captchaEnabled return false");
        yhr0.b();
        aVar.a();
    }

    @Override // xsna.n7r0
    public final void b(String str, n7r0.a<Boolean> aVar) {
        this.b.b(str, aVar);
    }

    @Override // xsna.n7r0
    public final void c(String str, n7r0.a<n7r0.d> aVar) {
        this.b.c(str, aVar);
    }
}
