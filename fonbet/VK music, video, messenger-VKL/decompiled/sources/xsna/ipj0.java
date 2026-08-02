package xsna;

import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.signup.VkAdditionalSignUpData;
import com.vk.auth.signupagreement.SignUpAgreementInfo;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.exceptions.AuthException;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.core.api.models.BanInfo;
import com.vk.superapp.core.api.models.SendOtpInfo;
import com.vk.superapp.core.api.models.ValidateInfo;

/* compiled from: SimpleAuthObserver.kt */
/* loaded from: classes15.dex */
public class ipj0 extends io.reactivex.rxjava3.observers.a<AuthResult> {
    public izs<? super Throwable, ? extends vgg> c;

    public void f(com.vk.superapp.core.api.models.a aVar, vgg vggVar) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.v
    public void onError(Throwable th) {
        vgg xjqVar;
        izs<? super Throwable, ? extends vgg> izsVar = this.c;
        if (izsVar == null || (xjqVar = izsVar.invoke(th)) == null) {
            xjqVar = new xjq(th);
        }
        if (th instanceof AuthException.BannedUserException) {
            b(((AuthException.BannedUserException) th).d());
            return;
        }
        if (th instanceof AuthException.NeedValidationException) {
            AuthException.NeedValidationException needValidationException = (AuthException.NeedValidationException) th;
            m(needValidationException.d(), needValidationException.g());
            return;
        }
        if (th instanceof AuthException.SuspiciousAuthException) {
            AuthException.SuspiciousAuthException suspiciousAuthException = (AuthException.SuspiciousAuthException) th;
            s(suspiciousAuthException.d(), suspiciousAuthException.g(), suspiciousAuthException.h());
            return;
        }
        if (th instanceof AuthException.IncorrectLoginDataException) {
            AuthException.IncorrectLoginDataException incorrectLoginDataException = (AuthException.IncorrectLoginDataException) th;
            incorrectLoginDataException.getClass();
            f(incorrectLoginDataException.d(), xjqVar);
            return;
        }
        if (th instanceof AuthException.InvalidRequestException) {
            AuthException.InvalidRequestException invalidRequestException = (AuthException.InvalidRequestException) th;
            j(invalidRequestException.g(), invalidRequestException.d(), xjqVar);
            return;
        }
        if (th instanceof AuthException.ExchangeTokenException) {
            i(((AuthException.ExchangeTokenException) th).d(), xjqVar);
            return;
        }
        if (th instanceof AuthException.NeedSignUpException) {
            AuthException.NeedSignUpException needSignUpException = (AuthException.NeedSignUpException) th;
            l(new VkAdditionalSignUpData(needSignUpException.g(), needSignUpException.i(), needSignUpException.d(), needSignUpException.h(), VkAuthMetaInfo.h, needSignUpException.k(), new SignUpAgreementInfo(needSignUpException.l(), needSignUpException.j())));
            return;
        }
        if (th instanceof AuthException.DeactivatedUserException) {
            AuthException.DeactivatedUserException deactivatedUserException = (AuthException.DeactivatedUserException) th;
            v(deactivatedUserException.d(), deactivatedUserException.g(), deactivatedUserException.h());
            return;
        }
        if (th instanceof AuthException.ExchangeSilentTokenException) {
            e(th.getMessage(), xjqVar);
            return;
        }
        if (th instanceof AuthException.MailAccountBlockedException) {
            k((AuthException.MailAccountBlockedException) th);
            return;
        }
        if (th instanceof AuthException.PhoneValidationRequiredException) {
            q((AuthException.PhoneValidationRequiredException) th);
            return;
        }
        if (th instanceof AuthException.VkEmailSignUpRequiredException) {
            d((AuthException.VkEmailSignUpRequiredException) th);
            return;
        }
        if ((th instanceof AuthException.InvalidAnonymousTokenException) || (th instanceof AuthException.ExpiredAnonymousTokenException)) {
            return;
        }
        if (th instanceof AuthException.TooManyRequestsException) {
            u(((AuthException.TooManyRequestsException) th).d(), xjqVar);
            return;
        }
        if (th instanceof AuthException.TooManyAttemptsException) {
            t(((AuthException.TooManyAttemptsException) th).d());
            return;
        }
        if (th instanceof AuthException.CancelByOwnerNeeded) {
            c(((AuthException.CancelByOwnerNeeded) th).d());
            return;
        }
        if (th instanceof AuthException.OAuthSpecificException) {
            p((AuthException.OAuthSpecificException) th);
            return;
        }
        if (th instanceof AuthException.AgeIsTooYoung) {
            a(xjqVar);
            return;
        }
        if (th instanceof AuthException.DetailedAuthException) {
            xjqVar.c();
            return;
        }
        if (th instanceof AuthException.InterruptForUserChooseException) {
            g(((AuthException.InterruptForUserChooseException) th).d());
        } else if (!(th instanceof AuthException.InvalidSidException)) {
            n(th, xjqVar);
        } else {
            ((AuthException.InvalidSidException) th).getClass();
            r(xjqVar);
        }
    }

    public final void w(ll1 ll1Var) {
        this.c = ll1Var;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
    }

    public void a(vgg vggVar) {
    }

    public void b(BanInfo banInfo) {
    }

    public void c(com.vk.superapp.core.api.models.a aVar) {
    }

    public void d(AuthException.VkEmailSignUpRequiredException vkEmailSignUpRequiredException) {
    }

    public void g(xbu0 xbu0Var) {
    }

    public void k(AuthException.MailAccountBlockedException mailAccountBlockedException) {
    }

    public void l(VkAdditionalSignUpData vkAdditionalSignUpData) {
    }

    @Override // io.reactivex.rxjava3.core.v
    /* renamed from: o */
    public void onNext(AuthResult authResult) {
    }

    public void p(AuthException.OAuthSpecificException oAuthSpecificException) {
    }

    public void q(AuthException.PhoneValidationRequiredException phoneValidationRequiredException) {
    }

    public void r(vgg vggVar) {
    }

    public void t(com.vk.superapp.core.api.models.a aVar) {
    }

    public void e(String str, vgg vggVar) {
    }

    public void i(com.vk.superapp.core.api.models.a aVar, vgg vggVar) {
    }

    public void m(com.vk.superapp.core.api.models.a aVar, VkAuthState vkAuthState) {
    }

    public void n(Throwable th, vgg vggVar) {
    }

    public void u(com.vk.superapp.core.api.models.a aVar, vgg vggVar) {
    }

    public void j(VkAuthState vkAuthState, com.vk.superapp.core.api.models.a aVar, vgg vggVar) {
    }

    public void s(VkAuthState vkAuthState, SendOtpInfo sendOtpInfo, ValidateInfo validateInfo) {
    }

    public void v(String str, VkAuthCredentials vkAuthCredentials, UtilityTokens utilityTokens) {
    }
}
