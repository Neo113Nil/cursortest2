package xsna;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;
import xsna.pin0;

/* compiled from: UnavailableAccountModal.kt */
/* loaded from: classes15.dex */
public final class m2q0 {
    public final String a;
    public final kcu0 b;

    public m2q0(String str, kcu0 kcu0Var) {
        this.a = str;
        this.b = kcu0Var;
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [T, xsna.dw20] */
    public final void a(DefaultAuthActivity defaultAuthActivity) {
        final n2q0 n2q0Var = new n2q0();
        baf0 f = krv0.f(R.drawable.vk_icon_phone_outline_56, R.attr.vk_ui_icon_accent, defaultAuthActivity);
        baf0 f2 = krv0.f(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_secondary, defaultAuthActivity);
        String str = this.a;
        String string = defaultAuthActivity.getString(R.string.vk_auth_sign_up_account_unavailable_message, str);
        int f3 = e3m.f(R.attr.vk_ui_text_primary, defaultAuthActivity);
        int K = drm0.K(0, 6, string, str, false);
        int length = str.length() + K;
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(f3), K, length, 33);
        hz20 hz20Var = new hz20() { // from class: xsna.l2q0
            @Override // xsna.hz20
            public final void a(int i) {
                kcu0 kcu0Var = m2q0.this.b;
                if (kcu0Var.c) {
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.d(kcu0Var.b, kcu0Var.f, kcu0Var.d, 8);
                    kcu0Var.e = false;
                }
                n2q0 n2q0Var2 = n2q0Var;
                if (i != -3) {
                    if (i != -1) {
                        return;
                    }
                    SignUpRouter signUpRouter = n2q0Var2.n;
                    (signUpRouter != null ? signUpRouter : null).X0(new pin0.a(true));
                    return;
                }
                SignUpDataHolder signUpDataHolder = n2q0Var2.p;
                if (signUpDataHolder == null) {
                    signUpDataHolder = null;
                }
                signUpDataHolder.c = null;
                com.vk.auth.main.e eVar = n2q0Var2.o;
                (eVar != null ? eVar : null).d();
            }
        };
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        dw20.b bVar = new dw20.b(defaultAuthActivity, this.b);
        cbq.a(bVar);
        dw20.b v0 = bVar.N(f).v0(R.string.vk_auth_sign_up_account_unavailable_title);
        ref$ObjectRef.element = ((dw20.b) ((dw20.b) dw20.a.R(v0.h(v0.c.getString(R.string.vk_auth_sign_up_account_unavailable_try_another_phone), hz20Var), spannableString, 0, 0, 6)).i0(R.string.vk_auth_sign_up_account_unavailable_go_to_support, hz20Var).F(f2, defaultAuthActivity.getString(R.string.vk_login_confirmation_close))).b0(new u5p0(ref$ObjectRef, 1)).I0("UnavailableAccount");
    }
}
