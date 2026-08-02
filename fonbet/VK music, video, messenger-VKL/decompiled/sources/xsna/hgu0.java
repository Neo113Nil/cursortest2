package xsna;

import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpData;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import xsna.bex0;
import xsna.t6v0;

/* compiled from: VkBrowserView.kt */
/* loaded from: classes6.dex */
public final class hgu0 implements s25 {
    public final /* synthetic */ ggu0 b;

    public hgu0(ggu0 ggu0Var) {
        this.b = ggu0Var;
    }

    @Override // xsna.s25
    public final void r(t6v0 t6v0Var) {
        r6y r6yVar = this.b.C;
        if (t6v0Var instanceof t6v0.a) {
            bex0.a.b(r6yVar, JsApiMethodType.OAUTH_ACTIVATE, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), null, 12);
        } else {
            r6yVar.y(JsApiMethodType.OAUTH_ACTIVATE);
        }
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
    public final void n(AuthResult authResult) {
    }

    @Override // xsna.s25
    public final void v(VkPhoneValidationErrorReason vkPhoneValidationErrorReason) {
    }

    @Override // xsna.s25
    public final void j(long j, SignUpData signUpData) {
    }
}
