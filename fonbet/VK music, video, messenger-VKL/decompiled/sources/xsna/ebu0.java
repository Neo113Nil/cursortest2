package xsna;

import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpData;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;

/* compiled from: VkAskPasswordPresenter.kt */
/* loaded from: classes15.dex */
public final class ebu0 implements alu0 {
    public final /* synthetic */ com.vk.auth.ui.password.askpassword.a b;

    public ebu0(com.vk.auth.ui.password.askpassword.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.s25
    public final void n(AuthResult authResult) {
        hjr0 hjr0Var = new hjr0(1);
        com.vk.auth.ui.password.askpassword.a aVar = this.b;
        aVar.e = hjr0Var;
        aVar.c.finish();
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
    public final void p() {
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
