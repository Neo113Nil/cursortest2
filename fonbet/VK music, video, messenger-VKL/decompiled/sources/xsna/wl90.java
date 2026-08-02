package xsna;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.O6;
import com.vk.auth.main.AuthModel;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.passkey.PasskeyAlternative;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.restore.RestoreReason;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.auth.smartflow.mail.password.MailPasswordData;
import com.vk.auth.utils.VkPhoneFormatUtils;
import com.vk.auth.verification.base.stats.VerificationStatFlow;
import com.vk.core.serialize.Serializer;
import com.vk.emailforwarding.api.VkEmailForwardingConfig;
import com.vk.emailforwarding.api.di.EmailForwardingComponent;
import com.vk.mail.auth.api.MailAuthFlowConfig;
import com.vk.passkey.PasskeySignInDelegateImpl;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.registration.funnels.TrackingElement;
import com.vk.registration.funnels.b;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.states.VkAuthState;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.sir0;
import xsna.sl90;

/* compiled from: PasskeyCheckPresenter.kt */
/* loaded from: classes15.dex */
public final class wl90 extends p66<ul90> implements tl90 {
    public final tir0 A;
    public final a B;
    public final bm01 C;
    public final Object D;
    public final PasskeyCheckInfo x;
    public final Activity y;
    public final PasskeySignInDelegateImpl z;

    /* compiled from: PasskeyCheckPresenter.kt */
    public final class a implements tb0 {
        public a() {
        }

        @Override // xsna.tb0
        public final void onActivityResult(int i, int i2, Intent intent) {
            wl90 wl90Var = wl90.this;
            wl90Var.z.onActivityResult(wl90Var.y, i, i2, intent);
        }
    }

    /* compiled from: PasskeyCheckPresenter.kt */
    public final class b implements bm90 {
        public b() {
        }

        @Override // xsna.bm90
        public final void a() {
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            bVar.getClass();
            com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.CONFIRM_AUTH_FAILED, null, null, null, 30);
            wl90 wl90Var = wl90.this;
            sl90.a y0 = wl90Var.y0();
            ul90 ul90Var = (ul90) wl90Var.a;
            if (ul90Var != null) {
                ul90Var.Yl(y0);
            }
        }

        @Override // xsna.bm90
        public final void b() {
            wl90 wl90Var = wl90.this;
            int i = c.$EnumSwitchMapping$0[wl90Var.x.d.ordinal()];
            if (i == 1) {
                wl90Var.z0();
                return;
            }
            if (i != 2) {
                if (i == 3) {
                    wl90Var.A0(true);
                    return;
                } else if (i == 4) {
                    wl90Var.A0(false);
                    return;
                } else if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            bVar.getClass();
            com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.CONFIRM_AUTH_FAILED, null, null, null, 30);
            sl90.a y0 = wl90Var.y0();
            ul90 ul90Var = (ul90) wl90Var.a;
            if (ul90Var != null) {
                ul90Var.Yl(y0);
            }
        }

        @Override // xsna.bm90
        public final void onCancel() {
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            bVar.getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PASSKEY_SCREEN_CANCELED, null, null, null, null, null, null, 254);
            com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.CONFIRM_AUTH_FAILED, null, null, null, 30);
            wl90 wl90Var = wl90.this;
            sl90.a y0 = wl90Var.y0();
            ul90 ul90Var = (ul90) wl90Var.a;
            if (ul90Var != null) {
                ul90Var.Yl(y0);
            }
        }

        @Override // xsna.bm90
        public final void onSuccess(String str) {
            Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
            wl90 wl90Var = wl90.this;
            String str2 = wl90Var.x.c;
            VkAuthState vkAuthState = new VkAuthState(null);
            vkAuthState.d.put("grant_type", "passkey");
            vkAuthState.d.put(O6.e1, str2);
            vkAuthState.zb("supported_ways", "passkey");
            vkAuthState.d.put("passkey_data", str);
            SignUpDataHolder signUpDataHolder = wl90Var.p;
            if (signUpDataHolder == null) {
                signUpDataHolder = null;
            }
            p66.j0(wl90Var, vkAuthState, new xl90(wl90Var), VkAuthMetaInfo.zb(signUpDataHolder.I, SilentAuthSource.BY_PASSKEY, null, null, 55), null, 24);
        }
    }

    /* compiled from: PasskeyCheckPresenter.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PasskeyAlternative.values().length];
            try {
                iArr[PasskeyAlternative.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PasskeyAlternative.RESTORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PasskeyAlternative.PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PasskeyAlternative.PASSWORD_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PasskeyAlternative.METHOD_SELECTOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VerificationMethodTypes.values().length];
            try {
                iArr2[VerificationMethodTypes.CALLRESET.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VerificationMethodTypes.CODEGEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VerificationMethodTypes.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VerificationMethodTypes.PUSH.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VerificationMethodTypes.RESERVE_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[VerificationMethodTypes.MAX_MESSENGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[VerificationMethodTypes.OFFICIAL_MESSENGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[VerificationMethodTypes.MAX_OTP_CODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[VerificationMethodTypes.SMS.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[VerificationMethodTypes.PASSWORD.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[VerificationMethodTypes.PASSKEY.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: PasskeyCheckPresenter.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((com.vk.registration.funnels.b) this.receiver).getClass();
            com.vk.registration.funnels.b.y();
            return s3q0.a;
        }
    }

    public wl90(PasskeyCheckInfo passkeyCheckInfo, FragmentActivity fragmentActivity) {
        this.x = passkeyCheckInfo;
        this.y = fragmentActivity;
        sl90.b bVar = sl90.b.c;
        this.z = new PasskeySignInDelegateImpl(new b());
        Context context = this.b;
        AuthModel authModel = this.c;
        SignUpRouter signUpRouter = this.n;
        VkEmailForwardingConfig vkEmailForwardingConfig = null;
        this.A = new tir0(context, authModel, signUpRouter == null ? null : signUpRouter);
        this.B = new a();
        SignUpDataHolder signUpDataHolder = this.p;
        this.C = new bm01((signUpDataHolder == null ? null : signUpDataHolder).K);
        this.D = msy.a(LazyThreadSafetyMode.NONE, new ko00(this, 14));
        ArrayList<SchemeStatSak$RegistrationFieldItem> c2 = com.vk.registration.funnels.a.c(Collections.singletonList(new Pair(TrackingElement.Registration.VALIDATION_FACTOR_FLOW, new la0(18))));
        if (c2 != null) {
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.l(SchemeStatSak$EventScreen.REGISTRATION_EXISTENT_ACCOUNT_NO_PASSWORD, c2);
            frf0.l(SchemeStatSak$EventScreen.REGISTRATION_EXISTENT_ACCOUNT, c2);
        }
        RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.CONFIRM_AUTH_FAILED;
        jrf0 jrf0Var = frf0.g;
        ArrayList<SchemeStatSak$RegistrationFieldItem> arrayList = jrf0Var.a.get(schemeStatSak$EventScreen);
        arrayList = arrayList == null ? new ArrayList<>() : arrayList;
        try {
            q55 q55Var = q55.a;
            Bundle bundle = q55.c().a.K;
            if (bundle != null) {
                vkEmailForwardingConfig = m63.d(bundle);
            }
        } catch (Throwable unused) {
        }
        o7r.a(arrayList, vkEmailForwardingConfig);
        jrf0Var.a.put(schemeStatSak$EventScreen, arrayList);
    }

    public final void A0(boolean z) {
        com.vk.auth.main.b bVar = this.d;
        if (bVar == null) {
            bVar = null;
        }
        PasskeyCheckInfo passkeyCheckInfo = this.x;
        bVar.T0(new FullscreenPasswordData(passkeyCheckInfo.b, true, passkeyCheckInfo.c, z, null, false, 48, null), false);
    }

    public final boolean B0(gzs<s3q0> gzsVar) {
        String a2 = this.C.a();
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
        this.t.b(mnh0.B(w0(vdx0Var.e().u(a2, str).a0(io.reactivex.rxjava3.android.schedulers.a.b()), true), this.s, new dn20(this, 12), new t810(9), null));
        return true;
    }

    @Override // xsna.tl90
    public final void E() {
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.START_PASSKEY_AGAIN_TAP, null, null, null, null, null, null, 254);
        W();
    }

    @Override // xsna.tl90
    public final void I() {
        PasskeyCheckInfo passkeyCheckInfo = this.x;
        int i = c.$EnumSwitchMapping$0[passkeyCheckInfo.d.ordinal()];
        if (i == 1) {
            z0();
            return;
        }
        if (i == 2) {
            if (B0(new rx4(com.vk.registration.funnels.b.a, 5))) {
                return;
            }
            com.vk.auth.main.b bVar = this.d;
            if (bVar == null) {
                bVar = null;
            }
            bVar.S0(new RestoreReason.PasskeyIsUnavailable(passkeyCheckInfo.b));
            return;
        }
        if (i == 3) {
            A0(true);
            return;
        }
        if (i == 4) {
            A0(false);
            return;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        com.vk.registration.funnels.b.a.getClass();
        com.vk.registration.funnels.b.x();
        ul90 ul90Var = (ul90) this.a;
        if (ul90Var != null) {
            ul90Var.i2();
        }
    }

    @Override // xsna.tl90
    public final void W() {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.VERIFICATION_PASSKEY, null, null, null, 30);
        sl90.b bVar2 = sl90.b.c;
        ul90 ul90Var = (ul90) this.a;
        if (ul90Var != null) {
            ul90Var.Yl(bVar2);
        }
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        i0(mnh0.B(w0(vdx0Var.e().c(this.x.c), true), this.s, new d0w(this, 10), new qw30(this, 11), null));
    }

    @Override // xsna.tl90
    public final void b(VerificationMethodTypes verificationMethodTypes) {
        int i = c.$EnumSwitchMapping$1[verificationMethodTypes.ordinal()];
        PasskeyCheckInfo passkeyCheckInfo = this.x;
        VkEmailForwardingConfig vkEmailForwardingConfig = null;
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
                com.vk.auth.main.b bVar = this.d;
                if (bVar == null) {
                    bVar = null;
                }
                String str = passkeyCheckInfo.b;
                bVar.J0(new VerificationScreenData.Phone(str, VkPhoneFormatUtils.a(this.b, str, null, VkPhoneFormatUtils.PhoneFormatterMode.RUSSIAN_SPECIFIC, 12), passkeyCheckInfo.c, true, null, false, true, false, null, null, null, null, 4016, null), verificationMethodTypes);
                return;
            case 10:
                FullscreenPasswordData fullscreenPasswordData = new FullscreenPasswordData(passkeyCheckInfo.b, passkeyCheckInfo.f, passkeyCheckInfo.c, true, null, false, 48, null);
                com.vk.auth.main.b bVar2 = this.d;
                if (bVar2 == null) {
                    bVar2 = null;
                }
                bVar2.b1(fullscreenPasswordData);
                b.a aVar = b.a.a;
                SchemeStatSak$RegistrationFieldItem h = VerificationStatFlow.AUTH.h();
                try {
                    q55 q55Var = q55.a;
                    Bundle bundle = q55.c().a.K;
                    if (bundle != null) {
                        vkEmailForwardingConfig = m63.d(bundle);
                    }
                } catch (Throwable unused) {
                }
                aVar.getClass();
                b.a.d(h, vkEmailForwardingConfig);
                return;
            case 11:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // xsna.tl90
    public final void c() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.MOBILE_QR_AUTH_WITH_QR_TAP, null, null, null, null, null, null, 254);
        SignUpRouter signUpRouter = this.n;
        if (signUpRouter == null) {
            signUpRouter = null;
        }
        signUpRouter.c();
    }

    @Override // xsna.tl90
    public final void d() {
        if (B0(new d(0, com.vk.registration.funnels.b.a, com.vk.registration.funnels.b.class, "onWhiteLabelForgotPassword", "onWhiteLabelForgotPassword()V", 0))) {
            return;
        }
        com.vk.auth.main.b bVar = this.d;
        if (bVar == null) {
            bVar = null;
        }
        bVar.S0(new RestoreReason.PrimaryFactorChoice(this.x.b, VerificationStatFlow.AUTH));
    }

    @Override // xsna.p66, xsna.z55
    public final void e() {
        super.e();
        ComponentCallbacks2 componentCallbacks2 = this.y;
        aeg0 aeg0Var = componentCallbacks2 instanceof aeg0 ? (aeg0) componentCallbacks2 : null;
        if (aeg0Var != null) {
            aeg0Var.yk(this.B);
        }
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.UNKNOWN;
    }

    @Override // xsna.p66, xsna.z55
    /* renamed from: p */
    public final void y0(ul90 ul90Var) {
        super.y0(ul90Var);
        ComponentCallbacks2 componentCallbacks2 = this.y;
        aeg0 aeg0Var = componentCallbacks2 instanceof aeg0 ? (aeg0) componentCallbacks2 : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this.B);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // xsna.smp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        MailAuthFlowConfig mailAuthFlowConfig;
        MailAuthFlowConfig e;
        Bundle bundle;
        com.vk.registration.funnels.b.a.getClass();
        com.vk.registration.funnels.b.l();
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
            new MailPasswordData(str, this.x.c, false);
            bVar.getClass();
            return;
        }
        mailAuthFlowConfig = null;
        if (mailAuthFlowConfig != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final sl90.a y0() {
        int i = c.$EnumSwitchMapping$0[this.x.d.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return ((koe0) this.D.getValue()).e() ? sl90.a.b.C3675b.e : sl90.a.b.C3674a.e;
            }
            if (i != 3 && i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return sl90.a.C3673a.e;
    }

    public final void z0() {
        com.vk.registration.funnels.b.a.getClass();
        com.vk.registration.funnels.b.j();
        PasskeyCheckInfo passkeyCheckInfo = this.x;
        String str = passkeyCheckInfo.b;
        String str2 = passkeyCheckInfo.c;
        sir0 sir0Var = sir0.a;
        sir0.e eVar = new sir0.e(str2, str, false, true, true, false, false, false, false, null, 740);
        sir0.d dVar = new sir0.d(new bqt(16), null, null, null, 14);
        sir0Var.getClass();
        i0(mnh0.B(w0(sir0.g(eVar, dVar), true), this.s, new g84(25, this, passkeyCheckInfo), new oqu(21), null));
    }
}
