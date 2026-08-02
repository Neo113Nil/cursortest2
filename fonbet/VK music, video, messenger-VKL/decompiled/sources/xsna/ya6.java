package xsna;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.restore.RestoreReason;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.auth.smartflow.mail.password.MailPasswordData;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.MethodSelectorCodeState;
import com.vk.emailforwarding.api.di.EmailForwardingComponent;
import com.vk.mail.auth.api.MailAuthFlowConfig;
import com.vk.superapp.analytics.MaxMessengerAnalytics;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.q0c;

/* compiled from: BaseCheckMethodSelectorPresenter.kt */
/* loaded from: classes15.dex */
public abstract class ya6<V extends q0c> extends p66<V> implements p0c<V> {
    public MethodSelectorCodeState A;
    public MethodSelectorCodeState B;
    public String C;
    public boolean D;
    public final MaxMessengerAnalytics E;
    public final p090 F;
    public final uy9 G;
    public final n090 H;
    public final VerificationScreenData I;
    public final o090 J;
    public final bm01 K;
    public final l090 L;
    public final String x;
    public VerificationMethodState y;
    public final CheckPresenterInfo z;

    /* compiled from: BaseCheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            String str2 = str;
            ya6 ya6Var = (ya6) this.receiver;
            ya6Var.D = true;
            ya6Var.C = str2;
            ya6Var.N0();
            q0c q0cVar = (q0c) ya6Var.a;
            if (q0cVar != null) {
                q0cVar.O2(str2);
            }
            if (ya6Var.y0() <= 0 || ya6Var.C.length() != ya6Var.y0()) {
                ya6Var.O0(str2);
            }
            return s3q0.a;
        }
    }

    /* compiled from: BaseCheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationMethodTypes.values().length];
            try {
                iArr[VerificationMethodTypes.CALLRESET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationMethodTypes.CODEGEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationMethodTypes.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationMethodTypes.PASSKEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VerificationMethodTypes.PASSWORD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VerificationMethodTypes.PUSH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VerificationMethodTypes.RESERVE_CODE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VerificationMethodTypes.SMS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VerificationMethodTypes.MAX_MESSENGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VerificationMethodTypes.MAX_OTP_CODE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VerificationMethodTypes.OFFICIAL_MESSENGER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: BaseCheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((com.vk.registration.funnels.b) this.receiver).getClass();
            com.vk.registration.funnels.b.y();
            return s3q0.a;
        }
    }

    /* compiled from: BaseCheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Intent, s3q0> {
        /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
        @Override // xsna.izs
        public final s3q0 invoke(Intent intent) {
            Intent intent2 = intent;
            n090 n090Var = (n090) this.receiver;
            n090Var.getClass();
            try {
                n090Var.b.invoke(intent2, 2);
            } catch (Throwable th) {
                par0.a.getClass();
                par0.d(th);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r2 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ya6(String str, VerificationMethodState verificationMethodState, CheckPresenterInfo checkPresenterInfo, Bundle bundle, wzs<? super Intent, ? super Integer, s3q0> wzsVar) {
        MethodSelectorCodeState methodSelectorCodeState;
        VerificationScreenData verificationScreenData;
        Parcelable parcelable;
        Object parcelable2;
        this.x = str;
        this.y = verificationMethodState;
        this.z = checkPresenterInfo;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("VkAuthLib_codeState", MethodSelectorCodeState.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = bundle.getParcelable("VkAuthLib_codeState");
                parcelable = (MethodSelectorCodeState) (parcelable3 instanceof MethodSelectorCodeState ? parcelable3 : null);
            }
            methodSelectorCodeState = (MethodSelectorCodeState) parcelable;
        }
        methodSelectorCodeState = MethodSelectorCodeState.Loading.b;
        this.A = methodSelectorCodeState;
        this.B = !epx.f(methodSelectorCodeState, MethodSelectorCodeState.Loading.b) ? this.A : null;
        this.C = "";
        MaxMessengerAnalytics Q9 = ((SakAnalyticsComponent) k0().a(fpf0.a(SakAnalyticsComponent.class))).Q9();
        this.E = Q9;
        p090 p090Var = new p090(this.A, checkPresenterInfo, Q9);
        this.F = p090Var;
        r0c r0cVar = (r0c) this;
        uy9 uy9Var = new uy9(new r41(r0cVar, 7));
        this.G = uy9Var;
        n090 n090Var = new n090(p090Var, wzsVar, uy9Var);
        this.H = n090Var;
        CheckPresenterInfo.MethodSelectorAuth methodSelectorAuth = checkPresenterInfo instanceof CheckPresenterInfo.MethodSelectorAuth ? (CheckPresenterInfo.MethodSelectorAuth) checkPresenterInfo : null;
        if (methodSelectorAuth == null || (verificationScreenData = methodSelectorAuth.b) == null) {
            CheckPresenterInfo.PasswordLessAuth passwordLessAuth = checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth ? (CheckPresenterInfo.PasswordLessAuth) checkPresenterInfo : null;
            verificationScreenData = passwordLessAuth != null ? passwordLessAuth.b : null;
        }
        this.I = verificationScreenData;
        this.J = new o090(this.b, new d(1, n090Var, n090.class, "startActivityForSmsRetrieve", "startActivityForSmsRetrieve(Landroid/content/Intent;)V", 0));
        SignUpDataHolder signUpDataHolder = this.p;
        this.K = new bm01((signUpDataHolder == null ? null : signUpDataHolder).K);
        this.L = new l090(this.b);
        M0(null, this.A);
        h0(((io.reactivex.rxjava3.subjects.d) uy9Var.c).subscribe(new js1(new a(1, r0cVar, ya6.class, "onNewCodeReceivedFromSms", "onNewCodeReceivedFromSms(Ljava/lang/String;)V", 0), 4)));
    }

    @Override // xsna.p0c
    public final void A() {
        c cVar = new c(0, com.vk.registration.funnels.b.a, com.vk.registration.funnels.b.class, "onWhiteLabelForgotPassword", "onWhiteLabelForgotPassword()V", 0);
        String a2 = this.K.a();
        if (a2 == null) {
            com.vk.auth.main.b bVar = this.d;
            if (bVar == null) {
                bVar = null;
            }
            VerificationScreenData verificationScreenData = this.I;
            bVar.S0(new RestoreReason.PrimaryFactorChoice(verificationScreenData != null ? verificationScreenData.b : null, this.F.a()));
            return;
        }
        cVar.invoke();
        SignUpDataHolder signUpDataHolder = this.p;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        String str = signUpDataHolder.o;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.t.b(mnh0.B(w0(vdx0Var.e().u(a2, str).a0(io.reactivex.rxjava3.android.schedulers.a.b()), true), this.s, new v9(this, 6), new pl2(2), null));
    }

    public void A0(VerificationMethodTypes verificationMethodTypes, boolean z) {
        this.y = verificationMethodTypes;
        switch (b.$EnumSwitchMapping$0[verificationMethodTypes.ordinal()]) {
            case 1:
                G0(z);
                return;
            case 2:
                B0();
                return;
            case 3:
                H0(z);
                return;
            case 4:
                C0();
                return;
            case 5:
                z0();
                return;
            case 6:
                J0(z);
                return;
            case 7:
                D0();
                return;
            case 8:
                K0(z);
                return;
            case 9:
                E0();
                return;
            case 10:
                F0();
                return;
            case 11:
                I0(z);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public abstract void B0();

    public abstract void C0();

    public abstract void D0();

    public abstract void E0();

    public abstract void F0();

    public abstract void G0(boolean z);

    public abstract void H0(boolean z);

    public abstract void I0(boolean z);

    public abstract void J0(boolean z);

    public abstract void K0(boolean z);

    public final void L0(MethodSelectorCodeState methodSelectorCodeState) {
        M0(this.A, methodSelectorCodeState);
        this.A = methodSelectorCodeState;
        N0();
        if (methodSelectorCodeState.equals(MethodSelectorCodeState.Loading.b)) {
            return;
        }
        this.B = methodSelectorCodeState;
    }

    public final void M0(MethodSelectorCodeState methodSelectorCodeState, MethodSelectorCodeState methodSelectorCodeState2) {
        boolean z = methodSelectorCodeState instanceof MethodSelectorCodeState.Sms;
        o090 o090Var = this.J;
        if (!z && (methodSelectorCodeState2 instanceof MethodSelectorCodeState.Sms)) {
            o090Var.a.registerReceiver(o090Var.d, (IntentFilter) o090Var.c.getValue(), "com.google.android.gms.auth.api.phone.permission.SEND", null, 2);
        } else {
            if (!z || (methodSelectorCodeState2 instanceof MethodSelectorCodeState.Sms)) {
                return;
            }
            enj.s(o090Var.a, o090Var.d);
        }
    }

    public void N0() {
        q0c q0cVar = (q0c) this.a;
        if (q0cVar != null) {
            q0cVar.a9(this.A);
        }
        if (drm0.N(this.C)) {
            q0c q0cVar2 = (q0c) this.a;
            if (q0cVar2 != null) {
                q0cVar2.d2();
                return;
            }
            return;
        }
        q0c q0cVar3 = (q0c) this.a;
        if (q0cVar3 != null) {
            q0cVar3.s0();
        }
    }

    public void O0(String str) {
        p090 p090Var = this.F;
        p090Var.getClass();
        p090Var.d(new nij(com.vk.registration.funnels.b.a, 3));
    }

    @Override // xsna.p0c
    public final void S() {
        p090 p090Var = this.F;
        VerificationMethodTypes verificationMethodTypes = null;
        p090Var.e = null;
        p090Var.d(new ku70(5));
        this.e.c(AuthStatSender.Screen.PHONE_CODE, AuthStatSender.Status.DEFAULT, AuthStatSender.Element.RESEND_CODE_BUTTON);
        q0c q0cVar = (q0c) this.a;
        if (q0cVar != null) {
            MethodSelectorCodeState methodSelectorCodeState = this.A;
            if (methodSelectorCodeState instanceof MethodSelectorCodeState.AppGenerator) {
                verificationMethodTypes = VerificationMethodTypes.CODEGEN;
            } else if ((methodSelectorCodeState instanceof MethodSelectorCodeState.CallReset) || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallReset)) {
                verificationMethodTypes = VerificationMethodTypes.CALLRESET;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Email) {
                verificationMethodTypes = VerificationMethodTypes.EMAIL;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Passkey) {
                verificationMethodTypes = VerificationMethodTypes.PASSKEY;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Push) {
                verificationMethodTypes = VerificationMethodTypes.PUSH;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.OfficialMessenger) {
                verificationMethodTypes = VerificationMethodTypes.OFFICIAL_MESSENGER;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Reserve) {
                verificationMethodTypes = VerificationMethodTypes.RESERVE_CODE;
            } else if ((methodSelectorCodeState instanceof MethodSelectorCodeState.Sms) || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifySms)) {
                verificationMethodTypes = VerificationMethodTypes.SMS;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.MaxMessenger) {
                verificationMethodTypes = VerificationMethodTypes.MAX_MESSENGER;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.MaxOtpCode) {
                verificationMethodTypes = VerificationMethodTypes.MAX_OTP_CODE;
            } else if (!(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMobileId) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallIn) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMessengerPush) && !methodSelectorCodeState.equals(MethodSelectorCodeState.Loading.b)) {
                throw new NoWhenBranchMatchedException();
            }
            q0cVar.Rg(verificationMethodTypes);
        }
    }

    @Override // xsna.p0c
    public final void a() {
        O0(this.C);
    }

    @Override // xsna.p0c
    public final void b(VerificationMethodTypes verificationMethodTypes) {
        A0(verificationMethodTypes, false);
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.PHONE_CODE;
    }

    @Override // xsna.p0c
    public final boolean i() {
        boolean z = false;
        if (y0() == 0) {
            return false;
        }
        l090 l090Var = this.L;
        String a2 = l090Var.a();
        if (l090Var.b(a2) && drm0.N(this.C)) {
            z = true;
        }
        if (z && a2 != null) {
            this.G.k(a2);
            l090Var.b = a2;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // xsna.smp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        MailAuthFlowConfig mailAuthFlowConfig;
        MailAuthFlowConfig e;
        Bundle bundle;
        p090 p090Var = this.F;
        p090Var.getClass();
        p090Var.d(new mij(com.vk.registration.funnels.b.a, 5));
        String str = null;
        try {
            q55 q55Var = q55.a;
            bundle = q55.c().a.K;
        } catch (Throwable unused) {
        }
        if (bundle != null) {
            mailAuthFlowConfig = m63.e(bundle);
            if (mailAuthFlowConfig != null) {
                ((EmailForwardingComponent) k0().a(fpf0.a(EmailForwardingComponent.class))).Hb();
                throw null;
            }
            com.vk.auth.main.b bVar = this.d;
            if (bVar == null) {
                bVar = null;
            }
            try {
                q55 q55Var2 = q55.a;
                Bundle bundle2 = q55.c().a.K;
                if (bundle2 != null && (e = m63.e(bundle2)) != null) {
                    str = e.b;
                }
            } catch (Throwable unused2) {
            }
            if (str == null) {
                str = "···@mail.ru";
            }
            new MailPasswordData(str, this.x, false, 4, null);
            bVar.getClass();
            return;
        }
        mailAuthFlowConfig = null;
        if (mailAuthFlowConfig != null) {
        }
    }

    @Override // xsna.p66, xsna.z55
    public final void x(Bundle bundle) {
        bundle.putParcelable("VkAuthLib_codeState", this.A);
    }

    public int y0() {
        return this.A.d();
    }

    public abstract void z0();
}
