package xsna;

import android.os.Bundle;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.MethodSelectorCodeState;
import com.vk.auth.verification.base.stats.VerificationStatFlow;
import com.vk.emailforwarding.api.VkEmailForwardingConfig;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.analytics.MaxMessengerAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.lnr0;

/* compiled from: OtpVerificationStat.kt */
/* loaded from: classes15.dex */
public final class p090 {
    public MethodSelectorCodeState a;
    public final CheckPresenterInfo b;
    public final MaxMessengerAnalytics c;
    public VerificationStatFlow d;
    public lnr0.a e;

    /* compiled from: OtpVerificationStat.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            com.vk.registration.funnels.b bVar = (com.vk.registration.funnels.b) this.receiver;
            bVar.getClass();
            com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.VERIFICATION_PHONE_VERIFY, null, null, null, 30);
            return s3q0.a;
        }
    }

    /* compiled from: OtpVerificationStat.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            com.vk.registration.funnels.b.t((com.vk.registration.funnels.b) this.receiver);
            return s3q0.a;
        }
    }

    /* compiled from: OtpVerificationStat.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((com.vk.registration.funnels.b) this.receiver).getClass();
            com.vk.registration.funnels.b.v();
            return s3q0.a;
        }
    }

    /* compiled from: OtpVerificationStat.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((com.vk.registration.funnels.b) this.receiver).getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ALERT_VERIFICATION_CODE_ERROR, null, null, null, null, null, null, 254);
            return s3q0.a;
        }
    }

    /* compiled from: OtpVerificationStat.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((com.vk.registration.funnels.b) this.receiver).getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PHONE_SUCCESS_VERIFICATION, null, null, null, null, null, null, 254);
            return s3q0.a;
        }
    }

    public p090(MethodSelectorCodeState methodSelectorCodeState, CheckPresenterInfo checkPresenterInfo, MaxMessengerAnalytics maxMessengerAnalytics) {
        this.a = methodSelectorCodeState;
        this.b = checkPresenterInfo;
        this.c = maxMessengerAnalytics;
        d(new a(0, com.vk.registration.funnels.b.a, com.vk.registration.funnels.b.class, "onProceedToVerificationPhoneVerify", "onProceedToVerificationPhoneVerify()V", 0));
    }

    public final VerificationStatFlow a() {
        VerificationStatFlow verificationStatFlow = this.d;
        if (verificationStatFlow != null) {
            return verificationStatFlow;
        }
        CheckPresenterInfo checkPresenterInfo = this.b;
        if (checkPresenterInfo instanceof CheckPresenterInfo.Auth) {
            return VerificationStatFlow.AUTH;
        }
        if (checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth) {
            return VerificationStatFlow.AUTH;
        }
        if (checkPresenterInfo instanceof CheckPresenterInfo.Validation) {
            return VerificationStatFlow.VALIDATION;
        }
        if (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) {
            return ((CheckPresenterInfo.SignUp) checkPresenterInfo).c.b ? VerificationStatFlow.SIGN_UP : VerificationStatFlow.AUTH;
        }
        if (checkPresenterInfo instanceof CheckPresenterInfo.MethodSelectorAuth) {
            return VerificationStatFlow.AUTH;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(Throwable th) {
        if ((th instanceof IOException) || ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1)) {
            d(new b(0, com.vk.registration.funnels.b.a, com.vk.registration.funnels.b.class, "onScreenLoadingError", "onScreenLoadingError(Lcom/vk/stat/sak/scheme/SchemeStatSak$EventScreen;)V", 0));
        } else if (th == null || !f35.e(th)) {
            d(new d(0, com.vk.registration.funnels.b.a, com.vk.registration.funnels.b.class, "onVerificationIncorrectCode", "onVerificationIncorrectCode()V", 0));
        } else {
            d(new c(0, com.vk.registration.funnels.b.a, com.vk.registration.funnels.b.class, "onTooYoungErrorReceivedInValidation", "onTooYoungErrorReceivedInValidation()V", 0));
        }
    }

    public final void c(boolean z) {
        VerificationStatFlow a2 = a();
        VerificationStatFlow verificationStatFlow = VerificationStatFlow.VALIDATION;
        if (a2 == verificationStatFlow) {
            this.d = verificationStatFlow;
        } else if (z) {
            this.d = VerificationStatFlow.AUTH;
        } else if (!z) {
            this.d = VerificationStatFlow.SIGN_UP;
        }
        d(new e(0, com.vk.registration.funnels.b.a, com.vk.registration.funnels.b.class, "onVerificationSuccess", "onVerificationSuccess()V", 0));
        this.e = null;
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.VERIFICATION_LOADING;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a().h());
        s3q0 s3q0Var = s3q0.a;
        frf0.l(schemeStatSak$EventScreen, arrayList);
    }

    public final void d(gzs<s3q0> gzsVar) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.VERIFICATION_PHONE_VERIFY;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a().h());
        lnr0 lnr0Var = this.e;
        VkEmailForwardingConfig vkEmailForwardingConfig = null;
        if (lnr0Var == null) {
            MethodSelectorCodeState methodSelectorCodeState = this.a;
            if (methodSelectorCodeState instanceof MethodSelectorCodeState.Email) {
                lnr0Var = lnr0.f.b;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.AppGenerator) {
                lnr0Var = lnr0.b.b;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Passkey) {
                lnr0Var = lnr0.l.b;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Push) {
                lnr0Var = lnr0.m.b;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Reserve) {
                lnr0Var = lnr0.n.b;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Sms) {
                lnr0Var = lnr0.o.b;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.OfficialMessenger) {
                lnr0Var = lnr0.k.b;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifySms) {
                lnr0Var = lnr0.q.b;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.CallReset) {
                lnr0Var = lnr0.c.b;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallReset) {
                lnr0Var = lnr0.d.b;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMobileId) {
                lnr0Var = lnr0.j.b;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallIn) {
                lnr0Var = lnr0.e.b;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMessengerPush) {
                lnr0Var = new lnr0.i(((MethodSelectorCodeState.LibverifyMessengerPush) methodSelectorCodeState).c);
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.MaxMessenger) {
                lnr0Var = lnr0.g.b;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.MaxOtpCode) {
                lnr0Var = lnr0.h.b;
            } else {
                if (!(methodSelectorCodeState instanceof MethodSelectorCodeState.Loading)) {
                    throw new NoWhenBranchMatchedException();
                }
                lnr0Var = null;
            }
        }
        if (lnr0Var != null) {
            arrayList.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.VERIFICATION_TYPE, "", "", lnr0Var.a));
        }
        MethodSelectorCodeState methodSelectorCodeState2 = this.a;
        arrayList.add(methodSelectorCodeState2 instanceof MethodSelectorCodeState.MethodSelectorWithTimerCodeState ? ((MethodSelectorCodeState.MethodSelectorWithTimerCodeState) methodSelectorCodeState2).e() != null ? new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.SCREEN_TYPE, "", "", "timer") : new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.SCREEN_TYPE, "", "", "muted_alternative") : new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.SCREEN_TYPE, "", "", null));
        r55 r55Var = r55.a;
        arrayList.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.INSTALLED_APPS, "", "", this.c.k(r55.a())));
        try {
            q55 q55Var = q55.a;
            Bundle bundle = q55.c().a.K;
            if (bundle != null) {
                vkEmailForwardingConfig = m63.d(bundle);
            }
        } catch (Throwable unused) {
        }
        o7r.a(arrayList, vkEmailForwardingConfig);
        frf0.l(schemeStatSak$EventScreen, arrayList);
        gzsVar.invoke();
    }
}
