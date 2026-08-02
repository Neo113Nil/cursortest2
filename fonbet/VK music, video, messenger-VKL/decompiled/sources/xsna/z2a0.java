package xsna;

import com.vk.auth.main.AfterPhoneReuseVerificationWay;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.fullscreen.helper.PhoneValidationPendingEvent;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.CodeState;
import java.util.ArrayList;
import kotlin.Result;
import xsna.p66;

/* compiled from: PhoneConfirmationHelper.kt */
/* loaded from: classes15.dex */
public final class z2a0 {
    public static r04 a(String str, CheckPresenterInfo checkPresenterInfo) {
        Object failure;
        try {
            q55 q55Var = q55.a;
            failure = q55.c().b;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        String str2 = null;
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        SignUpRouter signUpRouter = (SignUpRouter) failure;
        bv3 bv3Var = new bv3(checkPresenterInfo, signUpRouter, str);
        ma maVar = new ma(24, checkPresenterInfo, signUpRouter);
        if (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) {
            VerificationScreenData verificationScreenData = ((CheckPresenterInfo.SignUp) checkPresenterInfo).b;
            VerificationScreenData.Phone phone = verificationScreenData instanceof VerificationScreenData.Phone ? (VerificationScreenData.Phone) verificationScreenData : null;
            if (phone != null) {
                str2 = phone.b;
            }
        } else if (checkPresenterInfo instanceof CheckPresenterInfo.Validation) {
            str2 = ((CheckPresenterInfo.Validation) checkPresenterInfo).b;
        }
        return new r04(str2, bv3Var, maVar);
    }

    public static void b(CheckPresenterInfo checkPresenterInfo, vbu0 vbu0Var, p66.c cVar, CodeState codeState) {
        Object failure;
        Object failure2;
        try {
            q55 q55Var = q55.a;
            failure = q55.c().a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        SignUpDataHolder signUpDataHolder = (SignUpDataHolder) failure;
        if (signUpDataHolder == null) {
            return;
        }
        try {
            q55 q55Var2 = q55.a;
            failure2 = q55.c().c;
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        if (failure2 instanceof Result.Failure) {
            failure2 = null;
        }
        com.vk.auth.main.e eVar = (com.vk.auth.main.e) failure2;
        if (eVar == null) {
            return;
        }
        if (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) {
            if (codeState instanceof CodeState.MaxMessengerWait) {
                signUpDataHolder.I = VkAuthMetaInfo.zb(signUpDataHolder.I, SilentAuthSource.BY_MAX_MESSENGER, null, null, 55);
            } else if (codeState instanceof CodeState.MaxCodeWait) {
                signUpDataHolder.I = VkAuthMetaInfo.zb(signUpDataHolder.I, SilentAuthSource.BY_MAX_CODE, null, null, 55);
            }
            CheckPresenterInfo.SignUp signUp = (CheckPresenterInfo.SignUp) checkPresenterInfo;
            VerificationScreenData verificationScreenData = signUp.b;
            eVar.f(verificationScreenData, vbu0Var, cVar, signUp.d ? codeState instanceof CodeState.PushWait ? AfterPhoneReuseVerificationWay.BY_PUSH : AfterPhoneReuseVerificationWay.BY_PHONE : null);
            signUpDataHolder.e = verificationScreenData.b;
            return;
        }
        if (!(checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth)) {
            if (checkPresenterInfo instanceof CheckPresenterInfo.Validation) {
                String str = vbu0Var.a;
                String str2 = vbu0Var.g;
                VkPhoneValidationCompleteResult internal2 = str2 != null ? new VkPhoneValidationCompleteResult.Internal(((CheckPresenterInfo.Validation) checkPresenterInfo).b, str, str2) : new VkPhoneValidationCompleteResult.Public(((CheckPresenterInfo.Validation) checkPresenterInfo).b);
                ArrayList arrayList = w3a0.a;
                w3a0.c(new PhoneValidationPendingEvent.Success(internal2));
                return;
            }
            return;
        }
        if (codeState instanceof CodeState.EmailWait) {
            signUpDataHolder.I = VkAuthMetaInfo.zb(signUpDataHolder.I, SilentAuthSource.BY_EMAIL, null, null, 55);
        } else if (codeState instanceof CodeState.PushWait) {
            signUpDataHolder.I = VkAuthMetaInfo.zb(signUpDataHolder.I, SilentAuthSource.BY_ECOSYSTEM_PUSH, null, null, 55);
        } else if (codeState instanceof CodeState.MaxMessengerWait) {
            signUpDataHolder.I = VkAuthMetaInfo.zb(signUpDataHolder.I, SilentAuthSource.BY_MAX_MESSENGER, null, null, 55);
        } else if (codeState instanceof CodeState.MaxCodeWait) {
            signUpDataHolder.I = VkAuthMetaInfo.zb(signUpDataHolder.I, SilentAuthSource.BY_MAX_CODE, null, null, 55);
        }
        CheckPresenterInfo.PasswordLessAuth passwordLessAuth = (CheckPresenterInfo.PasswordLessAuth) checkPresenterInfo;
        eVar.f(passwordLessAuth.b, vbu0Var, cVar, null);
        signUpDataHolder.e = passwordLessAuth.b.b;
    }

    public static io.reactivex.rxjava3.internal.operators.observable.b0 c(CheckPresenterInfo checkPresenterInfo, v2j v2jVar) {
        par0.a.getClass();
        par0.a("PhoneConfirmationHelper runPhoneConfirm");
        if (checkPresenterInfo instanceof CheckPresenterInfo.Auth) {
            throw new IllegalStateException("This method should be used only for sign up, validation and passwordless");
        }
        boolean z = checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth;
        boolean z2 = (z && ((CheckPresenterInfo.PasswordLessAuth) checkPresenterInfo).b.h) || ((checkPresenterInfo instanceof CheckPresenterInfo.SignUp) && ((CheckPresenterInfo.SignUp) checkPresenterInfo).b.h);
        boolean z3 = (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) || z || ((checkPresenterInfo instanceof CheckPresenterInfo.Validation) && ((CheckPresenterInfo.Validation) checkPresenterInfo).c);
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        return com.vk.registration.funnels.a.a(vdx0Var.e().e(v2jVar.a, v2jVar.b, v2jVar.c, v2jVar.d, v2jVar.e, z3, z2, v2jVar.f, v2jVar.g));
    }
}
