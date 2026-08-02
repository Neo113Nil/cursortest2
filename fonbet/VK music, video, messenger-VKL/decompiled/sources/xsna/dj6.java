package xsna;

import android.os.Bundle;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.passkey.PasskeyAlternative;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.passkey.web.PasskeyWebAuthScreen;
import com.vk.auth.restore.RestoreNavValue;
import com.vk.auth.restore.RestoreReason;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.auth.smartflow.mail.password.MailPasswordData;
import com.vk.auth.utils.VkPhoneFormatUtils;
import com.vk.auth.verification.base.stats.VerificationStatFlow;
import com.vk.emailforwarding.api.di.EmailForwardingComponent;
import com.vk.mail.auth.api.MailAuthFlowConfig;
import com.vk.registration.funnels.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BasePasswordMethodSelectorPresenter.kt */
/* loaded from: classes15.dex */
public abstract class dj6 extends zi6<lm90> implements km90 {
    public String A;
    public final FullscreenPasswordData y;
    public final bm01 z;

    /* compiled from: BasePasswordMethodSelectorPresenter.kt */
    public static final /* synthetic */ class a {
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
                iArr[VerificationMethodTypes.PUSH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VerificationMethodTypes.RESERVE_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VerificationMethodTypes.MAX_MESSENGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VerificationMethodTypes.OFFICIAL_MESSENGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VerificationMethodTypes.MAX_OTP_CODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VerificationMethodTypes.SMS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VerificationMethodTypes.PASSKEY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VerificationMethodTypes.PASSWORD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: BasePasswordMethodSelectorPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((com.vk.registration.funnels.b) this.receiver).getClass();
            com.vk.registration.funnels.b.y();
            return s3q0.a;
        }
    }

    /* compiled from: BasePasswordMethodSelectorPresenter.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((com.vk.registration.funnels.b) this.receiver).getClass();
            com.vk.registration.funnels.b.y();
            return s3q0.a;
        }
    }

    public dj6(FullscreenPasswordData fullscreenPasswordData) {
        this.y = fullscreenPasswordData;
        SignUpDataHolder signUpDataHolder = this.p;
        this.z = new bm01((signUpDataHolder == null ? null : signUpDataHolder).K);
        this.A = "";
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qys
    public final void G1(String str) {
        if (epx.f(this.A, str)) {
            return;
        }
        this.A = str;
        ((jm90) this.x.getValue()).a();
        lm90 lm90Var = (lm90) this.a;
        if (lm90Var != null) {
            lm90Var.H2();
        }
        lm90 lm90Var2 = (lm90) this.a;
        if (lm90Var2 != null) {
            lm90Var2.i3(drm0.N(this.A));
        }
    }

    @Override // xsna.qys
    public final void H1() {
        com.vk.registration.funnels.b.a.getClass();
        com.vk.registration.funnels.b.x();
        lm90 lm90Var = (lm90) this.a;
        if (lm90Var != null) {
            lm90Var.i2();
        }
    }

    @Override // xsna.qys
    public final boolean I1() {
        return !drm0.N(this.A);
    }

    @Override // xsna.qys
    public final void J1() {
        String str;
        if (z0(new b(0, com.vk.registration.funnels.b.a, com.vk.registration.funnels.b.class, "onWhiteLabelForgotPassword", "onWhiteLabelForgotPassword()V", 0))) {
            return;
        }
        com.vk.auth.main.b bVar = this.d;
        if (bVar == null) {
            bVar = null;
        }
        FullscreenPasswordData fullscreenPasswordData = this.y;
        if (fullscreenPasswordData == null || (str = fullscreenPasswordData.b) == null) {
            SignUpDataHolder signUpDataHolder = this.p;
            if (signUpDataHolder == null) {
                signUpDataHolder = null;
            }
            str = signUpDataHolder.e;
        }
        SignUpDataHolder signUpDataHolder2 = this.p;
        bVar.S0(new RestoreReason.ForgetPassword(str, (signUpDataHolder2 != null ? signUpDataHolder2 : null).o, RestoreNavValue.AUTH_SCREEN));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    @Override // xsna.km90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(VerificationMethodTypes verificationMethodTypes) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        SignUpDataHolder signUpDataHolder;
        String str7;
        String str8;
        int i = a.$EnumSwitchMapping$0[verificationMethodTypes.ordinal()];
        FullscreenPasswordData fullscreenPasswordData = this.y;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                b.a.a.getClass();
                b.a.a();
                com.vk.auth.main.b bVar = this.d;
                if (bVar == null) {
                    bVar = null;
                }
                if (fullscreenPasswordData == null || (str = fullscreenPasswordData.b) == null) {
                    SignUpDataHolder signUpDataHolder2 = this.p;
                    if (signUpDataHolder2 == null) {
                        signUpDataHolder2 = null;
                    }
                    str = signUpDataHolder2.e;
                    if (str == null) {
                        str2 = "";
                        String a2 = VkPhoneFormatUtils.a(this.b, str2, null, VkPhoneFormatUtils.PhoneFormatterMode.RUSSIAN_SPECIFIC, 12);
                        if (fullscreenPasswordData != null || (str3 = fullscreenPasswordData.d) == null) {
                            SignUpDataHolder signUpDataHolder3 = this.p;
                            str3 = (signUpDataHolder3 != null ? signUpDataHolder3 : null).o;
                            if (str3 == null) {
                                str4 = "";
                                bVar.J0(new VerificationScreenData.Phone(str2, a2, str4, true, null, false, true, false, null, null, null, null, 4016, null), verificationMethodTypes);
                                return;
                            }
                        }
                        str4 = str3;
                        bVar.J0(new VerificationScreenData.Phone(str2, a2, str4, true, null, false, true, false, null, null, null, null, 4016, null), verificationMethodTypes);
                        return;
                    }
                }
                str2 = str;
                String a22 = VkPhoneFormatUtils.a(this.b, str2, null, VkPhoneFormatUtils.PhoneFormatterMode.RUSSIAN_SPECIFIC, 12);
                if (fullscreenPasswordData != null) {
                }
                SignUpDataHolder signUpDataHolder32 = this.p;
                str3 = (signUpDataHolder32 != null ? signUpDataHolder32 : null).o;
                if (str3 == null) {
                }
                str4 = str3;
                bVar.J0(new VerificationScreenData.Phone(str2, a22, str4, true, null, false, true, false, null, null, null, null, 4016, null), verificationMethodTypes);
                return;
            case 10:
                b.a.a.getClass();
                b.a.a();
                if (fullscreenPasswordData == null || (str5 = fullscreenPasswordData.b) == null) {
                    SignUpDataHolder signUpDataHolder4 = this.p;
                    if (signUpDataHolder4 == null) {
                        signUpDataHolder4 = null;
                    }
                    str5 = signUpDataHolder4.e;
                    if (str5 == null) {
                        str6 = "";
                        if (fullscreenPasswordData != null || (str7 = fullscreenPasswordData.d) == null) {
                            signUpDataHolder = this.p;
                            if (signUpDataHolder == null) {
                                signUpDataHolder = null;
                            }
                            str7 = signUpDataHolder.o;
                            if (str7 == null) {
                                str8 = "";
                                PasskeyCheckInfo passkeyCheckInfo = new PasskeyCheckInfo(str6, str8, PasskeyAlternative.METHOD_SELECTOR, PasskeyWebAuthScreen.PASSKEY_OTP, fullscreenPasswordData != null ? fullscreenPasswordData.c : true, false, 32, null);
                                com.vk.auth.main.b bVar2 = this.d;
                                (bVar2 != null ? bVar2 : null).I0(passkeyCheckInfo);
                                return;
                            }
                        }
                        str8 = str7;
                        PasskeyCheckInfo passkeyCheckInfo2 = new PasskeyCheckInfo(str6, str8, PasskeyAlternative.METHOD_SELECTOR, PasskeyWebAuthScreen.PASSKEY_OTP, fullscreenPasswordData != null ? fullscreenPasswordData.c : true, false, 32, null);
                        com.vk.auth.main.b bVar22 = this.d;
                        (bVar22 != null ? bVar22 : null).I0(passkeyCheckInfo2);
                        return;
                    }
                }
                str6 = str5;
                if (fullscreenPasswordData != null) {
                }
                signUpDataHolder = this.p;
                if (signUpDataHolder == null) {
                }
                str7 = signUpDataHolder.o;
                if (str7 == null) {
                }
                str8 = str7;
                PasskeyCheckInfo passkeyCheckInfo22 = new PasskeyCheckInfo(str6, str8, PasskeyAlternative.METHOD_SELECTOR, PasskeyWebAuthScreen.PASSKEY_OTP, fullscreenPasswordData != null ? fullscreenPasswordData.c : true, false, 32, null);
                com.vk.auth.main.b bVar222 = this.d;
                (bVar222 != null ? bVar222 : null).I0(passkeyCheckInfo22);
                return;
            case 11:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // xsna.km90
    public final void d() {
        String str;
        if (z0(new c(0, com.vk.registration.funnels.b.a, com.vk.registration.funnels.b.class, "onWhiteLabelForgotPassword", "onWhiteLabelForgotPassword()V", 0))) {
            return;
        }
        com.vk.auth.main.b bVar = this.d;
        if (bVar == null) {
            bVar = null;
        }
        FullscreenPasswordData fullscreenPasswordData = this.y;
        if (fullscreenPasswordData == null || (str = fullscreenPasswordData.b) == null) {
            SignUpDataHolder signUpDataHolder = this.p;
            str = (signUpDataHolder != null ? signUpDataHolder : null).e;
        }
        bVar.S0(new RestoreReason.PrimaryFactorChoice(str, VerificationStatFlow.AUTH));
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.UNKNOWN;
    }

    @Override // xsna.p66, xsna.z55
    /* renamed from: p */
    public final void y0(x65 x65Var) {
        lm90 lm90Var = (lm90) x65Var;
        super.y0(lm90Var);
        FullscreenPasswordData fullscreenPasswordData = this.y;
        if (fullscreenPasswordData != null) {
            lm90Var.F3(fullscreenPasswordData.b, fullscreenPasswordData.c);
        } else {
            lm90Var.e();
        }
        if (fullscreenPasswordData != null && fullscreenPasswordData.e) {
            lm90Var.Rh();
        }
        SignUpDataHolder signUpDataHolder = this.p;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        String str = signUpDataHolder.y;
        if (str != null) {
            lm90Var.G1(str);
        }
        lm90 lm90Var2 = (lm90) this.a;
        if (lm90Var2 != null) {
            lm90Var2.H2();
        }
        lm90 lm90Var3 = (lm90) this.a;
        if (lm90Var3 != null) {
            lm90Var3.i3(drm0.N(this.A));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // xsna.smp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        MailAuthFlowConfig mailAuthFlowConfig;
        String str;
        Bundle bundle;
        MailAuthFlowConfig e;
        Bundle bundle2;
        com.vk.registration.funnels.b.a.getClass();
        com.vk.registration.funnels.b.l();
        try {
            q55 q55Var = q55.a;
            bundle2 = q55.c().a.K;
        } catch (Throwable unused) {
        }
        if (bundle2 != null) {
            mailAuthFlowConfig = m63.e(bundle2);
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
                bundle = q55.c().a.K;
            } catch (Throwable unused2) {
            }
            if (bundle != null && (e = m63.e(bundle)) != null) {
                str = e.b;
                if (str == null) {
                    str = "···@mail.ru";
                }
                FullscreenPasswordData fullscreenPasswordData = this.y;
                new MailPasswordData(str, fullscreenPasswordData != null ? fullscreenPasswordData.d : null, false);
                bVar.getClass();
                return;
            }
            str = null;
            if (str == null) {
            }
            FullscreenPasswordData fullscreenPasswordData2 = this.y;
            new MailPasswordData(str, fullscreenPasswordData2 != null ? fullscreenPasswordData2.d : null, false);
            bVar.getClass();
            return;
        }
        mailAuthFlowConfig = null;
        if (mailAuthFlowConfig != null) {
        }
    }

    @Override // xsna.zi6
    public final void y0() {
        lm90 lm90Var = (lm90) this.a;
        if (lm90Var != null) {
            lm90Var.J1();
        }
    }

    public final boolean z0(gzs<s3q0> gzsVar) {
        String a2 = this.z.a();
        if (a2 == null) {
            return false;
        }
        gzsVar.invoke();
        SignUpDataHolder signUpDataHolder = this.p;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        String str = signUpDataHolder.o;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.t.b(mnh0.B(w0(vdx0Var.e().u(a2, str).a0(io.reactivex.rxjava3.android.schedulers.a.b()), true), this.s, new lz0(this, 6), new com.vk.movika.sdk.base.observable.e0(4), null));
        return true;
    }
}
