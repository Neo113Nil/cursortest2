package xsna;

import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpData;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;

/* compiled from: AuthCallback.kt */
/* loaded from: classes.dex */
public interface s25 {
    void A();

    void b(String str);

    void h(VkPhoneValidationCompleteResult vkPhoneValidationCompleteResult);

    void j(long j, SignUpData signUpData);

    @ozl
    void l(jq0 jq0Var);

    void m();

    void n(AuthResult authResult);

    void o();

    void p();

    void r(t6v0 t6v0Var);

    void t();

    void u();

    void v(VkPhoneValidationErrorReason vkPhoneValidationErrorReason);
}
