package xsna;

import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpData;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;

/* compiled from: VkInternalErrorHandler.kt */
/* loaded from: classes15.dex */
public final class e1v0 implements s25 {
    public final /* synthetic */ izs<AuthResult, s3q0> b;
    public final /* synthetic */ gzs<s3q0> c;

    public e1v0(gzs gzsVar, izs izsVar) {
        this.b = izsVar;
        this.c = gzsVar;
    }

    @Override // xsna.s25
    public final void n(AuthResult authResult) {
        q55 q55Var = q55.a;
        q55.e(this);
        this.b.invoke(authResult);
    }

    @Override // xsna.s25
    public final void p() {
        q55 q55Var = q55.a;
        q55.e(this);
        this.c.invoke();
    }

    @Override // xsna.s25
    public final void A() {
    }

    @Override // xsna.s25
    public final void m() {
    }

    @Override // xsna.s25
    public final void o() {
    }

    @Override // xsna.s25
    public final void t() {
    }

    @Override // xsna.s25
    public final void u() {
    }

    @Override // xsna.s25
    public final void b(String str) {
    }

    @Override // xsna.s25
    public final void h(VkPhoneValidationCompleteResult vkPhoneValidationCompleteResult) {
    }

    @Override // xsna.s25
    @ozl
    public final void l(jq0 jq0Var) {
    }

    @Override // xsna.s25
    public final void r(t6v0 t6v0Var) {
    }

    @Override // xsna.s25
    public final void v(VkPhoneValidationErrorReason vkPhoneValidationErrorReason) {
    }

    @Override // xsna.s25
    public final void j(long j, SignUpData signUpData) {
    }
}
