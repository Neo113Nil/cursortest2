package xsna;

import android.os.Bundle;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.base.stats.VerificationStatFactor;
import com.vk.auth.verification.base.stats.VerificationStatFlow;
import com.vk.auth.verification.libverify.LibverifyPresenter;
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

/* compiled from: VerificationStat.kt */
/* loaded from: classes15.dex */
public final class inr0 {
    public final CheckPresenterInfo a;
    public final MaxMessengerAnalytics b;
    public CodeState c;
    public final boolean d;
    public VerificationStatFlow e;
    public lnr0.a f;

    /* compiled from: VerificationStat.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            com.vk.registration.funnels.b.t((com.vk.registration.funnels.b) this.receiver);
            return s3q0.a;
        }
    }

    /* compiled from: VerificationStat.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((com.vk.registration.funnels.b) this.receiver).getClass();
            com.vk.registration.funnels.b.v();
            return s3q0.a;
        }
    }

    /* compiled from: VerificationStat.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((com.vk.registration.funnels.b) this.receiver).getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ALERT_VERIFICATION_CODE_ERROR, null, null, null, null, null, null, 254);
            return s3q0.a;
        }
    }

    /* compiled from: VerificationStat.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((com.vk.registration.funnels.b) this.receiver).getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PHONE_SUCCESS_VERIFICATION, null, null, null, null, null, null, 254);
            return s3q0.a;
        }
    }

    public inr0(CodeState codeState, com.vk.auth.verification.base.b bVar, CheckPresenterInfo checkPresenterInfo, MaxMessengerAnalytics maxMessengerAnalytics) {
        this.a = checkPresenterInfo;
        this.b = maxMessengerAnalytics;
        this.c = codeState;
        this.d = bVar instanceof LibverifyPresenter;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = codeState instanceof CodeState.CallResetPreview ? SchemeStatSak$EventScreen.CALLRESET_WARNING : SchemeStatSak$EventScreen.VERIFICATION_PHONE_VERIFY;
        e();
        com.vk.registration.funnels.b bVar2 = com.vk.registration.funnels.b.a;
        bVar2.getClass();
        com.vk.registration.funnels.b.z(bVar2, schemeStatSak$EventScreen, null, null, null, 30);
        s3q0 s3q0Var = s3q0.a;
    }

    public final VerificationStatFlow a() {
        VerificationStatFlow verificationStatFlow = this.e;
        if (verificationStatFlow != null) {
            return verificationStatFlow;
        }
        CheckPresenterInfo checkPresenterInfo = this.a;
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
            d(new a(0, com.vk.registration.funnels.b.a, com.vk.registration.funnels.b.class, "onScreenLoadingError", "onScreenLoadingError(Lcom/vk/stat/sak/scheme/SchemeStatSak$EventScreen;)V", 0));
        } else if (th == null || !f35.e(th)) {
            d(new c(0, com.vk.registration.funnels.b.a, com.vk.registration.funnels.b.class, "onVerificationIncorrectCode", "onVerificationIncorrectCode()V", 0));
        } else {
            d(new b(0, com.vk.registration.funnels.b.a, com.vk.registration.funnels.b.class, "onTooYoungErrorReceivedInValidation", "onTooYoungErrorReceivedInValidation()V", 0));
        }
    }

    public final void c(boolean z) {
        VerificationStatFlow a2 = a();
        VerificationStatFlow verificationStatFlow = VerificationStatFlow.VALIDATION;
        if (a2 == verificationStatFlow) {
            this.e = verificationStatFlow;
        } else if (z) {
            this.e = VerificationStatFlow.AUTH;
        } else if (!z) {
            this.e = VerificationStatFlow.SIGN_UP;
        }
        d(new d(0, com.vk.registration.funnels.b.a, com.vk.registration.funnels.b.class, "onVerificationSuccess", "onVerificationSuccess()V", 0));
        this.f = null;
    }

    public final void d(gzs<s3q0> gzsVar) {
        e();
        gzsVar.invoke();
    }

    public final void e() {
        VerificationStatFactor verificationStatFactor;
        lnr0.i iVar;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = this.c instanceof CodeState.CallResetPreview ? SchemeStatSak$EventScreen.CALLRESET_WARNING : SchemeStatSak$EventScreen.VERIFICATION_PHONE_VERIFY;
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a().h());
        lnr0 lnr0Var = this.f;
        if (lnr0Var == null) {
            CodeState codeState = this.c;
            if (codeState instanceof CodeState.AppWait) {
                lnr0Var = lnr0.b.b;
            } else if (codeState instanceof CodeState.CheckAccess) {
                lnr0Var = lnr0.o.b;
            } else if (codeState instanceof CodeState.EmailWait) {
                lnr0Var = lnr0.f.b;
            } else {
                boolean z = codeState instanceof CodeState.SmsWait;
                boolean z2 = this.d;
                if (z) {
                    lnr0Var = z2 ? lnr0.q.b : lnr0.o.b;
                } else if ((codeState instanceof CodeState.CallResetWait) || (codeState instanceof CodeState.CallResetPreview)) {
                    lnr0Var = z2 ? lnr0.d.b : lnr0.c.b;
                } else if (codeState instanceof CodeState.LibverifyMobileId) {
                    lnr0Var = lnr0.j.b;
                } else if (codeState instanceof CodeState.CallInWait) {
                    lnr0Var = lnr0.e.b;
                } else if (codeState instanceof CodeState.PushWait) {
                    lnr0Var = lnr0.m.b;
                } else {
                    if (codeState instanceof CodeState.LibverifyMessengersPushWait) {
                        iVar = new lnr0.i(((CodeState.LibverifyMessengersPushWait) codeState).e);
                    } else if (codeState instanceof CodeState.MessengerLoading) {
                        iVar = new lnr0.i(((CodeState.MessengerLoading) codeState).e);
                    } else if (codeState instanceof CodeState.MessengerRegistration) {
                        iVar = new lnr0.i(((CodeState.MessengerRegistration) codeState).e);
                    } else {
                        lnr0Var = codeState instanceof CodeState.MaxMessengerWait ? lnr0.g.b : codeState instanceof CodeState.MaxCodeWait ? lnr0.h.b : lnr0.o.b;
                    }
                    lnr0Var = iVar;
                }
            }
        }
        lnr0Var.getClass();
        arrayList.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.VERIFICATION_TYPE, "", "", lnr0Var.a));
        CheckPresenterInfo checkPresenterInfo = this.a;
        if (checkPresenterInfo instanceof CheckPresenterInfo.Auth) {
            verificationStatFactor = VerificationStatFactor.SECOND;
        } else if (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) {
            verificationStatFactor = VerificationStatFactor.FIRST;
        } else if (checkPresenterInfo instanceof CheckPresenterInfo.Validation) {
            verificationStatFactor = VerificationStatFactor.FIRST;
        } else if (checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth) {
            verificationStatFactor = VerificationStatFactor.FIRST;
        } else {
            if (!(checkPresenterInfo instanceof CheckPresenterInfo.MethodSelectorAuth)) {
                throw new NoWhenBranchMatchedException();
            }
            verificationStatFactor = VerificationStatFactor.FIRST;
        }
        arrayList.add(verificationStatFactor.h());
        CodeState codeState2 = this.c;
        VkEmailForwardingConfig vkEmailForwardingConfig = null;
        arrayList.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.SCREEN_TYPE, "", "", ((codeState2 instanceof CodeState.MaxCodeWait) || (codeState2 instanceof CodeState.MaxMessengerWait)) ? ((CodeState.WithTime) codeState2).f != 0 ? "timer" : "muted_alternative" : null));
        r55 r55Var = r55.a;
        arrayList.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.INSTALLED_APPS, "", "", this.b.k(r55.a())));
        try {
            q55 q55Var = q55.a;
            Bundle bundle = q55.c().a.K;
            if (bundle != null) {
                vkEmailForwardingConfig = m63.d(bundle);
            }
        } catch (Throwable unused) {
        }
        if (vkEmailForwardingConfig != null) {
            arrayList.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.IS_INPUT_SKIPPED_BY_EMAIL, "", "", com.vk.registration.funnels.a.e(Boolean.TRUE)));
        }
        frf0.l(schemeStatSak$EventScreen, arrayList);
    }
}
