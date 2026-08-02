package xsna;

import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpData;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;

/* compiled from: BaseSuperappMiniAppsPresenter.kt */
/* loaded from: classes6.dex */
public final class yo6 implements s25 {
    public final /* synthetic */ oe5 b;
    public final /* synthetic */ zo6 c;

    public yo6(oe5 oe5Var, zo6 zo6Var) {
        this.b = oe5Var;
        this.c = zo6Var;
    }

    @Override // xsna.s25
    public final void n(AuthResult authResult) {
        q55 q55Var = q55.a;
        q55.e(this);
        this.b.invoke();
        com.vk.lists.c cVar = this.c.c;
        if (cVar == null) {
            cVar = null;
        }
        cVar.p(false);
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
