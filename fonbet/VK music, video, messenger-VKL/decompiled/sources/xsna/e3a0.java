package xsna;

import com.vk.api.generated.auth.dto.AuthValidateRegistrationConfirmTextsDto;
import com.vk.auth.main.AfterPhoneReuseVerificationWay;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.superapp.api.dto.auth.VkAuthProfileInfo;
import com.vk.superapp.api.dto.auth.validatephoneconfirm.NextStep;
import com.vk.superapp.api.dto.auth.validatephoneconfirm.PasswordScreen;

/* compiled from: PhoneConfirmedStrategy.kt */
/* loaded from: classes15.dex */
public final class e3a0 {
    public final VerificationScreenData a;
    public final PasswordScreen b;
    public final boolean c;
    public final VkAuthProfileInfo d;
    public final String e;
    public final pbu0 f;
    public final NextStep g;
    public final AuthValidateRegistrationConfirmTextsDto h;
    public final AfterPhoneReuseVerificationWay i;

    public e3a0(VerificationScreenData verificationScreenData, PasswordScreen passwordScreen, boolean z, VkAuthProfileInfo vkAuthProfileInfo, String str, pbu0 pbu0Var, NextStep nextStep, AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto, AfterPhoneReuseVerificationWay afterPhoneReuseVerificationWay) {
        this.a = verificationScreenData;
        this.b = passwordScreen;
        this.c = z;
        this.d = vkAuthProfileInfo;
        this.e = str;
        this.f = pbu0Var;
        this.g = nextStep;
        this.h = authValidateRegistrationConfirmTextsDto;
        this.i = afterPhoneReuseVerificationWay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3a0)) {
            return false;
        }
        e3a0 e3a0Var = (e3a0) obj;
        return epx.f(this.a, e3a0Var.a) && this.b == e3a0Var.b && this.c == e3a0Var.c && epx.f(this.d, e3a0Var.d) && epx.f(this.e, e3a0Var.e) && epx.f(this.f, e3a0Var.f) && this.g == e3a0Var.g && epx.f(this.h, e3a0Var.h) && this.i == e3a0Var.i;
    }

    public final int hashCode() {
        int b = qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        VkAuthProfileInfo vkAuthProfileInfo = this.d;
        int hashCode = (this.g.hashCode() + ((this.f.hashCode() + urd0.a((b + (vkAuthProfileInfo == null ? 0 : vkAuthProfileInfo.hashCode())) * 31, 31, this.e)) * 31)) * 31;
        AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto = this.h;
        int hashCode2 = (hashCode + (authValidateRegistrationConfirmTextsDto == null ? 0 : authValidateRegistrationConfirmTextsDto.hashCode())) * 31;
        AfterPhoneReuseVerificationWay afterPhoneReuseVerificationWay = this.i;
        return hashCode2 + (afterPhoneReuseVerificationWay != null ? afterPhoneReuseVerificationWay.hashCode() : 0);
    }

    public final String toString() {
        return "PhoneConfirmedInfo(verificationScreenData=" + this.a + ", passwordScreenLogic=" + this.b + ", canSkipPassword=" + this.c + ", profile=" + this.d + ", sid=" + this.e + ", authDelegate=" + this.f + ", nextStep=" + this.g + ", registrationConfirmTextsDto=" + this.h + ", afterPhoneReuseVerificationWay=" + this.i + ')';
    }
}
