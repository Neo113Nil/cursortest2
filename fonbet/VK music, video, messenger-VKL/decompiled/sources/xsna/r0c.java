package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.internal.p001authapiphone.zzab;
import com.vk.api.generated.auth.dto.AuthUserDto;
import com.vk.api.generated.auth.dto.AuthValidateSignupParamsDto;
import com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpVerificationMethodDto;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.passkey.PasskeyAlternative;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.passkey.web.PasskeyWebAuthScreen;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.screendata.VkExistingProfileScreenData;
import com.vk.auth.smartflow.api.data.VerificationMethodGeneralState;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.MethodSelectorCodeState;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.emailforwarding.api.VkEmailForwardingConfig;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.registration.funnels.b;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import com.vk.superapp.api.dto.auth.validatephoneconfirm.NextStep;
import com.vk.superapp.api.dto.auth.validatephoneconfirm.PasswordScreen;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.core.api.models.SendOtpInfo;
import com.vk.superapp.core.api.models.SignUpField;
import com.vk.superapp.core.api.models.SignUpParams;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.b;
import com.vkontakte.android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ao10;
import xsna.eo10;
import xsna.p66;
import xsna.pj20;
import xsna.q0c;
import xsna.wbu0;

/* compiled from: CheckMethodSelectorPresenter.kt */
/* loaded from: classes15.dex */
public class r0c<V extends q0c> extends ya6<V> {
    public final com.vk.auth.suspicious_auth.b M;
    public final ck20 N;
    public final zzab O;
    public final tj20 P;
    public final xj20 Q;

    /* compiled from: CheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationMethodGeneralState.values().length];
            try {
                iArr[VerificationMethodGeneralState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<List<? extends cyo>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(List<? extends cyo> list) {
            r0c r0cVar = (r0c) this.receiver;
            r0cVar.getClass();
            if (list.isEmpty()) {
                throw new VKApiExecutionException(5, "", true, r0cVar.b.getString(R.string.vk_otp_method_selection_code_entering_no_available_methods_title), null, null, null, null, 1129, null, null, null, 3824);
            }
            return s3q0.a;
        }
    }

    /* compiled from: CheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class c extends AdaptedFunctionReference implements izs<VerificationMethodTypes, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(VerificationMethodTypes verificationMethodTypes) {
            ((r0c) this.receiver).A0(verificationMethodTypes, false);
            return s3q0.a;
        }
    }

    /* compiled from: CheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<vgg, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(vgg vggVar) {
            r0c.P0((r0c) this.receiver, vggVar);
            return s3q0.a;
        }
    }

    /* compiled from: CheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<EcosystemCheckOtpResponseDto, s3q0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1 */
        /* JADX WARN: Type inference failed for: r12v10, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r12v11, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List<? extends com.vk.superapp.core.api.models.SignUpField>] */
        @Override // xsna.izs
        public final s3q0 invoke(EcosystemCheckOtpResponseDto ecosystemCheckOtpResponseDto) {
            ?? r12;
            Integer d;
            EcosystemCheckOtpResponseDto ecosystemCheckOtpResponseDto2 = ecosystemCheckOtpResponseDto;
            r0c r0cVar = (r0c) this.receiver;
            CheckPresenterInfo checkPresenterInfo = r0cVar.z;
            ao10.a = null;
            r0cVar.F.c(ecosystemCheckOtpResponseDto2.g() != null);
            if (checkPresenterInfo instanceof CheckPresenterInfo.MethodSelectorAuth) {
                r0cVar.Z0();
                com.vk.auth.main.e eVar = r0cVar.o;
                if (eVar == null) {
                    eVar = null;
                }
                CheckPresenterInfo.MethodSelectorAuth methodSelectorAuth = (CheckPresenterInfo.MethodSelectorAuth) checkPresenterInfo;
                VerificationScreenData verificationScreenData = methodSelectorAuth.b;
                p66.c cVar = r0cVar.w;
                eVar.a();
                DefaultAuthActivity defaultAuthActivity = eVar.a;
                SignUpDataHolder signUpDataHolder = eVar.b;
                VerificationScreenData.Phone phone = verificationScreenData instanceof VerificationScreenData.Phone ? (VerificationScreenData.Phone) verificationScreenData : null;
                signUpDataHolder.c = phone != null ? phone.b : null;
                signUpDataHolder.o = ecosystemCheckOtpResponseDto2.k();
                List<String> l = ecosystemCheckOtpResponseDto2.l();
                if (l != null) {
                    List<String> list = l;
                    r12 = new ArrayList(c5g.u(list, 10));
                    for (String str : list) {
                        SignUpField.Companion.getClass();
                        r12.add(SignUpField.a.a(str));
                    }
                } else {
                    r12 = 0;
                }
                if (r12 == 0) {
                    r12 = EmptyList.b;
                }
                signUpDataHolder.q = r12;
                signUpDataHolder.x = ecosystemCheckOtpResponseDto2.o();
                signUpDataHolder.f = verificationScreenData.h;
                AuthValidateSignupParamsDto n = ecosystemCheckOtpResponseDto2.n();
                signUpDataHolder.J = new SignUpParams((n == null || (d = n.d()) == null) ? 0 : d.intValue());
                signUpDataHolder.B = ecosystemCheckOtpResponseDto2.d();
                SignUpRouter signUpRouter = eVar.c;
                AuthUserDto g = ecosystemCheckOtpResponseDto2.g();
                EcosystemCheckOtpResponseDto.NextStepDto f = ecosystemCheckOtpResponseDto2.f();
                NextStep.a aVar = NextStep.Companion;
                String i = f != null ? f.i() : null;
                aVar.getClass();
                NextStep a = NextStep.a.a(i);
                Boolean j = ecosystemCheckOtpResponseDto2.j();
                Boolean bool = Boolean.TRUE;
                if (epx.f(j, bool)) {
                    eVar.g(ecosystemCheckOtpResponseDto2.i());
                } else {
                    if (g != null) {
                        epx.f(ecosystemCheckOtpResponseDto2.e(), bool);
                    }
                    signUpRouter.getClass();
                    if (a != null) {
                        PasswordScreen passwordScreen = PasswordScreen.SHOW;
                        boolean f2 = epx.f(ecosystemCheckOtpResponseDto2.e(), bool);
                        AuthUserDto g2 = ecosystemCheckOtpResponseDto2.g();
                        new com.vk.auth.main.c(defaultAuthActivity, signUpDataHolder, signUpRouter, eVar.d).n(new e3a0(verificationScreenData, passwordScreen, f2, g2 != null ? a6k0.b(g2) : null, ecosystemCheckOtpResponseDto2.k(), cVar, a, ecosystemCheckOtpResponseDto2.i(), null));
                    } else if (g != null) {
                        AuthUserDto g3 = ecosystemCheckOtpResponseDto2.g();
                        if (g3 != null) {
                            boolean f3 = epx.f(ecosystemCheckOtpResponseDto2.e(), bool);
                            boolean z = verificationScreenData.g && f3;
                            if (z) {
                                Serializer.c<VkAuthState> cVar2 = VkAuthState.CREATOR;
                                cVar.b(l55.c(l55.a, defaultAuthActivity, VkAuthState.a.c(ecosystemCheckOtpResponseDto2.k(), verificationScreenData.b, z, false), signUpDataHolder.I, 4));
                            } else {
                                signUpRouter.t(new VkExistingProfileScreenData(verificationScreenData.b, a6k0.b(g3), !f3, ecosystemCheckOtpResponseDto2.k(), f3, ecosystemCheckOtpResponseDto2.i(), null, null, null, 384, null));
                            }
                        }
                    } else {
                        eVar.j(SignUpRouter.DataScreen.PHONE, cVar);
                    }
                }
                SignUpDataHolder signUpDataHolder2 = r0cVar.p;
                (signUpDataHolder2 != null ? signUpDataHolder2 : null).e = methodSelectorAuth.b.b;
            } else {
                m200.C(new IllegalStateException("This method should be used only for method selector auth."));
            }
            return s3q0.a;
        }
    }

    /* compiled from: CheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<vgg, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(vgg vggVar) {
            vgg vggVar2 = vggVar;
            r0c r0cVar = (r0c) this.receiver;
            r0cVar.R0();
            Context context = r0cVar.b;
            p090 p090Var = r0cVar.F;
            Throwable th = vggVar2.a;
            p090Var.b(th);
            if (!r0cVar.S0(vggVar2) && (th instanceof VKApiExecutionException)) {
                wbu0.a a = wbu0.a(context, th, false);
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                int s = vKApiExecutionException.s();
                if (s != 5) {
                    if (s != 1110) {
                        if (vggVar2.b() == ApiErrorViewType.CUSTOM) {
                            q0c q0cVar = (q0c) r0cVar.a;
                            if (q0cVar != null) {
                                q0cVar.vf(a);
                            }
                            s3q0 s3q0Var = s3q0.a;
                        } else {
                            vggVar2.c();
                        }
                    } else if (vggVar2.b() == ApiErrorViewType.CUSTOM) {
                        q0c q0cVar2 = (q0c) r0cVar.a;
                        if (q0cVar2 != null) {
                            q0cVar2.E1(a.a, (r5 & 2) == 0, (r5 & 4) == 0);
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                    } else {
                        vggVar2.c();
                    }
                } else if (f35.d(vKApiExecutionException)) {
                    sp.w((sjm) r0cVar.a, context, new m1(r0cVar, 17));
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: CheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<thi0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(thi0 thi0Var) {
            VkAuthValidateAccountResponse.NextStep.MaxOptions maxOptions;
            String str;
            thi0 thi0Var2 = thi0Var;
            r0c r0cVar = (r0c) this.receiver;
            VerificationScreenData verificationScreenData = r0cVar.I;
            String str2 = thi0Var2.b;
            if (str2 == null) {
                r0cVar.U0();
            } else {
                if (SakFeatures.Type.SAK_MAX_AUTH_CACHE_ANDROID.h() && r0cVar.B == null && verificationScreenData != null && (str = verificationScreenData.b) != null) {
                    String str3 = thi0Var2.a;
                    String str4 = thi0Var2.c;
                    ao10.a aVar = ao10.a;
                    if (aVar != null && epx.f(aVar.a, str)) {
                        ao10.a = ao10.a.a(aVar, str2, str3, str4, null, null, null, ApiInvocationException.ErrorCodes.FRIEND_RESTRICTION);
                    }
                }
                Long l = (!SakFeatures.Type.SAK_MAX_AUTH_TIMER_ANDROID.h() || r0cVar.T0() || verificationScreenData == null || (maxOptions = verificationScreenData.l) == null) ? null : maxOptions.b;
                r0cVar.L0(new MethodSelectorCodeState.MaxMessenger(thi0Var2.a, str2, thi0Var2.c, true, l != null ? Long.valueOf((l.longValue() * 1000) + System.currentTimeMillis()) : null));
                r0cVar.X0();
            }
            return s3q0.a;
        }
    }

    /* compiled from: CheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<uhi0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(uhi0 uhi0Var) {
            VkAuthValidateAccountResponse.NextStep.MaxOptions maxOptions;
            VkAuthValidateAccountResponse.NextStep.MaxOptions maxOptions2;
            String str;
            uhi0 uhi0Var2 = uhi0Var;
            r0c r0cVar = (r0c) this.receiver;
            VerificationScreenData verificationScreenData = r0cVar.I;
            if (SakFeatures.Type.SAK_MAX_AUTH_CACHE_ANDROID.h() && r0cVar.B == null && verificationScreenData != null && (str = verificationScreenData.b) != null) {
                int i = uhi0Var2.a;
                String str2 = uhi0Var2.b;
                String str3 = uhi0Var2.c;
                ao10.a aVar = ao10.a;
                if (aVar != null && epx.f(aVar.a, str)) {
                    ao10.a = ao10.a.a(aVar, null, null, null, Integer.valueOf(i), str2, str3, 63);
                }
            }
            Long l = (r0cVar.T0() || verificationScreenData == null || (maxOptions2 = verificationScreenData.l) == null) ? null : maxOptions2.b;
            r0cVar.L0(new MethodSelectorCodeState.MaxOtpCode(uhi0Var2.a, l != null ? Long.valueOf((l.longValue() * 1000) + System.currentTimeMillis()) : null, uhi0Var2.b, uhi0Var2.c, (verificationScreenData == null || (maxOptions = verificationScreenData.l) == null) ? false : maxOptions.d, false));
            r0cVar.X0();
            return s3q0.a;
        }
    }

    /* compiled from: CheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements izs<bii0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(bii0 bii0Var) {
            bii0 bii0Var2 = bii0Var;
            r0c r0cVar = (r0c) this.receiver;
            r0cVar.getClass();
            r0cVar.L0(new MethodSelectorCodeState.CallReset(bii0Var2.a, bii0Var2.b));
            r0cVar.X0();
            return s3q0.a;
        }
    }

    /* compiled from: CheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements izs<bii0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(bii0 bii0Var) {
            bii0 bii0Var2 = bii0Var;
            r0c r0cVar = (r0c) this.receiver;
            r0cVar.getClass();
            r0cVar.L0(new MethodSelectorCodeState.Email(bii0Var2.a, bii0Var2.b));
            r0cVar.X0();
            return s3q0.a;
        }
    }

    /* compiled from: CheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements izs<bii0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(bii0 bii0Var) {
            bii0 bii0Var2 = bii0Var;
            r0c r0cVar = (r0c) this.receiver;
            r0cVar.getClass();
            r0cVar.L0(new MethodSelectorCodeState.Push(bii0Var2.a, bii0Var2.b));
            r0cVar.X0();
            return s3q0.a;
        }
    }

    /* compiled from: CheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class l extends FunctionReferenceImpl implements izs<bii0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(bii0 bii0Var) {
            bii0 bii0Var2 = bii0Var;
            r0c r0cVar = (r0c) this.receiver;
            r0cVar.getClass();
            r0cVar.L0(new MethodSelectorCodeState.Sms(bii0Var2.a, bii0Var2.b));
            r0cVar.X0();
            return s3q0.a;
        }
    }

    public r0c(VerificationMethodState verificationMethodState, Bundle bundle, String str, CheckPresenterInfo checkPresenterInfo, wzs<? super Intent, ? super Integer, s3q0> wzsVar, com.vk.auth.suspicious_auth.b bVar) {
        super(str, verificationMethodState, checkPresenterInfo, bundle, wzsVar);
        this.M = bVar;
        this.N = ck20.a;
        Context context = this.b;
        this.O = k0x.c(context) ? vua0.j(context) : null;
        this.P = new tj20();
        this.Q = new xj20(this.b);
    }

    public static final void P0(r0c r0cVar, vgg vggVar) {
        if (r0cVar.S0(vggVar)) {
            return;
        }
        Throwable th = vggVar.a;
        if (th instanceof VKApiExecutionException) {
            if (!f35.c((VKApiExecutionException) th)) {
                vggVar.c();
                return;
            }
            if (vggVar.b() != ApiErrorViewType.CUSTOM) {
                vggVar.c();
                return;
            }
            V v = r0cVar.a;
            VerificationScreenData verificationScreenData = r0cVar.I;
            i270.a(v, verificationScreenData != null ? verificationScreenData.b : null, r0cVar.b, new vx6(r0cVar, 6));
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.ya6
    public final void B0() {
        L0(new MethodSelectorCodeState.AppGenerator());
        X0();
    }

    @Override // xsna.ya6
    public final void C0() {
        VerificationScreenData verificationScreenData = this.I;
        String str = verificationScreenData != null ? verificationScreenData.b : null;
        if (str == null) {
            str = "";
        }
        PasskeyCheckInfo passkeyCheckInfo = new PasskeyCheckInfo(str, this.x, PasskeyAlternative.METHOD_SELECTOR, PasskeyWebAuthScreen.PASSKEY_OTP, verificationScreenData instanceof VerificationScreenData.Phone, false, 32, null);
        com.vk.auth.main.b bVar = this.d;
        (bVar != null ? bVar : null).I0(passkeyCheckInfo);
    }

    @Override // xsna.ya6
    public final void D0() {
        L0(new MethodSelectorCodeState.Reserve());
        X0();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    @Override // xsna.ya6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0() {
        ao10.a aVar;
        String str;
        String str2;
        if (SakFeatures.Type.SAK_MAX_AUTH_CACHE_ANDROID.h() && this.B == null) {
            VerificationScreenData verificationScreenData = this.I;
            if (verificationScreenData != null && (str2 = verificationScreenData.b) != null && (aVar = ao10.a) != null && epx.f(aVar.a, str2)) {
                if (System.currentTimeMillis() >= aVar.c) {
                    ao10.a = null;
                }
                if ((aVar == null ? aVar.d : null) != null) {
                    Long valueOf = SakFeatures.Type.SAK_MAX_AUTH_TIMER_ANDROID.h() ? Long.valueOf(aVar.c) : null;
                    String str3 = aVar.e;
                    if (str3 == null) {
                        String str4 = verificationScreenData != null ? verificationScreenData.c : null;
                        if (str4 != null) {
                            str = str4;
                            L0(new MethodSelectorCodeState.MaxMessenger(str, aVar.d, aVar.f, true, valueOf));
                            X0();
                            return;
                        }
                        str3 = "";
                    }
                    str = str3;
                    L0(new MethodSelectorCodeState.MaxMessenger(str, aVar.d, aVar.f, true, valueOf));
                    X0();
                    return;
                }
            }
            aVar = null;
            if ((aVar == null ? aVar.d : null) != null) {
            }
        }
        L0(MethodSelectorCodeState.Loading.b);
        this.N.getClass();
        vdx0 vdx0Var = e370.e;
        this.t.b(Y0((vdx0Var != null ? vdx0Var : null).x().i(this.x, dgn0.e()).l(new ac20(new q8w(4), 1)), new g(1, this, r0c.class, "onSendMaxMessengerVerificationSuccess", "onSendMaxMessengerVerificationSuccess(Lcom/vk/auth/smartflow/api/data/models/maxmessenger/SendMaxMessengerVerificationResponse;)V", 0)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0035  */
    @Override // xsna.ya6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0() {
        ao10.a aVar;
        String str;
        VkAuthValidateAccountResponse.NextStep.MaxOptions maxOptions;
        String str2;
        if (SakFeatures.Type.SAK_MAX_AUTH_CACHE_ANDROID.h() && this.B == null) {
            VerificationScreenData verificationScreenData = this.I;
            if (verificationScreenData != null && (str2 = verificationScreenData.b) != null && (aVar = ao10.a) != null && epx.f(aVar.a, str2)) {
                if (System.currentTimeMillis() >= aVar.c) {
                    ao10.a = null;
                }
                if ((aVar == null ? aVar.g : null) != null) {
                    int intValue = aVar.g.intValue();
                    Long valueOf = Long.valueOf(aVar.c);
                    String str3 = aVar.h;
                    if (str3 == null) {
                        String str4 = verificationScreenData != null ? verificationScreenData.c : null;
                        if (str4 != null) {
                            str = str4;
                            L0(new MethodSelectorCodeState.MaxOtpCode(intValue, valueOf, str, aVar.i, (verificationScreenData != null || (maxOptions = verificationScreenData.l) == null) ? false : maxOptions.d, false));
                            X0();
                            return;
                        }
                        str3 = "";
                    }
                    str = str3;
                    L0(new MethodSelectorCodeState.MaxOtpCode(intValue, valueOf, str, aVar.i, (verificationScreenData != null || (maxOptions = verificationScreenData.l) == null) ? false : maxOptions.d, false));
                    X0();
                    return;
                }
            }
            aVar = null;
            if ((aVar == null ? aVar.g : null) != null) {
            }
        }
        L0(MethodSelectorCodeState.Loading.b);
        this.N.getClass();
        vdx0 vdx0Var = e370.e;
        this.t.b(Y0((vdx0Var != null ? vdx0Var : null).x().g(this.x, dgn0.e()).l(new l8(new u620(2), 29)), new h(1, this, r0c.class, "onSendMaxOtpCodeSuccess", "onSendMaxOtpCodeSuccess(Lcom/vk/auth/smartflow/api/data/models/maxmessenger/SendMaxOtpCodeResponse;)V", 0)));
    }

    @Override // xsna.ya6
    public final void G0(boolean z) {
        SendOtpInfo b2;
        L0(MethodSelectorCodeState.Loading.b);
        Boolean valueOf = Boolean.valueOf(z);
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null && (b2 = this.M.b()) != null) {
            L0(new MethodSelectorCodeState.CallReset(b2.c, b2.d));
            X0();
        } else {
            this.N.getClass();
            vdx0 vdx0Var = e370.e;
            this.t.b(Y0((vdx0Var != null ? vdx0Var : null).x().h(this.x, dgn0.e()).l(new com.vk.movika.sdk.base.model.history.b(new j5n(12), 23)), new i(1, this, r0c.class, "onSendOtpCallResetSuccess", "onSendOtpCallResetSuccess(Lcom/vk/auth/smartflow/api/data/models/send/otp/SendOtpResponse;)V", 0)));
        }
    }

    @Override // xsna.ya6
    public final void H0(boolean z) {
        SendOtpInfo b2;
        L0(MethodSelectorCodeState.Loading.b);
        Boolean valueOf = Boolean.valueOf(z);
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null && (b2 = this.M.b()) != null) {
            L0(new MethodSelectorCodeState.Email(b2.c, b2.d));
            X0();
        } else {
            this.N.getClass();
            vdx0 vdx0Var = e370.e;
            this.t.b(Y0((vdx0Var != null ? vdx0Var : null).x().e(this.x, dgn0.e()).l(new iq(new p7x(4))), new j(1, this, r0c.class, "onSendOtpEmailSuccess", "onSendOtpEmailSuccess(Lcom/vk/auth/smartflow/api/data/models/send/otp/SendOtpResponse;)V", 0)));
        }
    }

    @Override // xsna.ya6
    public final void I0(boolean z) {
        SendOtpInfo b2;
        L0(MethodSelectorCodeState.Loading.b);
        Boolean valueOf = Boolean.valueOf(z);
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null && (b2 = this.M.b()) != null) {
            L0(new MethodSelectorCodeState.OfficialMessenger(b2.c));
            X0();
        } else {
            this.N.getClass();
            vdx0 vdx0Var = e370.e;
            this.t.b(Y0((vdx0Var != null ? vdx0Var : null).x().c(this.x, dgn0.e()).l(new kq(new ulz(2), 25)), new p1(this, 24)));
        }
    }

    @Override // xsna.ya6
    public final void J0(boolean z) {
        SendOtpInfo b2;
        L0(MethodSelectorCodeState.Loading.b);
        Boolean valueOf = Boolean.valueOf(z);
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null && (b2 = this.M.b()) != null) {
            L0(new MethodSelectorCodeState.Push(b2.c, b2.d));
            X0();
        } else {
            this.N.getClass();
            vdx0 vdx0Var = e370.e;
            this.t.b(Y0((vdx0Var != null ? vdx0Var : null).x().k(this.x, dgn0.e()).l(new oq(new svz(4), 22)), new k(1, this, r0c.class, "onSendOtpPushSuccess", "onSendOtpPushSuccess(Lcom/vk/auth/smartflow/api/data/models/send/otp/SendOtpResponse;)V", 0)));
        }
    }

    @Override // xsna.ya6
    public final void K0(boolean z) {
        SendOtpInfo b2;
        L0(MethodSelectorCodeState.Loading.b);
        zzab zzabVar = this.O;
        if (zzabVar != null) {
            zzabVar.startSmsUserConsent(null);
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null && (b2 = this.M.b()) != null) {
            L0(new MethodSelectorCodeState.Sms(b2.c, b2.d));
            X0();
        } else {
            this.N.getClass();
            vdx0 vdx0Var = e370.e;
            this.t.b(Y0((vdx0Var != null ? vdx0Var : null).x().f(this.x, dgn0.e()).l(new j8(new y8m(12), 20)), new l(1, this, r0c.class, "onSendOtpSmsSuccess", "onSendOtpSmsSuccess(Lcom/vk/auth/smartflow/api/data/models/send/otp/SendOtpResponse;)V", 0)));
        }
    }

    @Override // xsna.p66, xsna.z55
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public void y0(V v) {
        r0c<V> r0cVar = this;
        super.y0(v);
        wa6 wa6Var = (wa6) v;
        View view = wa6Var.z;
        if (view == null) {
            view = null;
        }
        wa6Var.B = new wk20(view, new e1(wa6Var, 8));
        r0cVar.X0();
        VerificationMethodState verificationMethodState = r0cVar.y;
        boolean z = verificationMethodState instanceof VerificationMethodTypes;
        tj20 tj20Var = r0cVar.P;
        if (z) {
            VerificationMethodTypes verificationMethodTypes = (VerificationMethodTypes) verificationMethodState;
            MethodSelectorCodeState methodSelectorCodeState = r0cVar.A;
            if (!tj20Var.a) {
                r0cVar.A0(verificationMethodTypes, true);
                s3q0 s3q0Var = s3q0.a;
            } else if (methodSelectorCodeState.equals(MethodSelectorCodeState.Loading.b) && tj20Var.c) {
                tj20Var.b = true;
            }
        } else if (verificationMethodState instanceof VerificationMethodGeneralState) {
            if (a.$EnumSwitchMapping$0[((VerificationMethodGeneralState) verificationMethodState).ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            r0cVar.N.getClass();
            r0cVar = this;
            r0cVar.t.b(mnh0.C(p66.x0(r0cVar, ck20.b(r0cVar.x).m(io.reactivex.rxjava3.android.schedulers.a.b()).l(new s41(new md(13), 11))), r0cVar.s, new s0c(1, r0cVar, r0c.class, "handleVerificationMethodType", "handleVerificationMethodType(Lcom/vk/auth/smartflow/api/data/VerificationMethodTypes;Z)V", 0), new td5(1, r0cVar, r0c.class, "handleGetVerificationMethodError", "handleGetVerificationMethodError(Lcom/vk/superapp/core/errors/CommonApiError;)V", 0, 3), null));
        }
        v.a9(r0cVar.A);
        pj20 pj20Var = wa6Var.C;
        if (pj20Var == null) {
            pj20Var = null;
        }
        pj20Var.b(pj20.a.a(pj20Var.m, null, false, false, false, 29));
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        fzf fzfVar = wa6Var.A;
        fzf fzfVar2 = fzfVar != null ? fzfVar : null;
        r0cVar.i0(io.reactivex.rxjava3.core.q.X(new qno0(fzfVar2.a), new qno0(fzfVar2.c.c)).subscribe(new wn(new rw(r0cVar, ref$BooleanRef, wa6Var, 6), 13)));
        if (r0cVar.V0()) {
            wa6Var.O1();
        }
        tj20Var.a = true;
    }

    public final void R0() {
        q0c q0cVar = (q0c) this.a;
        if (q0cVar != null) {
            q0cVar.O2("");
        }
    }

    public final boolean S0(vgg vggVar) {
        q0c q0cVar = (q0c) this.a;
        xj20 xj20Var = this.Q;
        xj20Var.getClass();
        Context context = xj20Var.a;
        a35.a(vggVar);
        Throwable th = vggVar.a;
        if ((th instanceof IOException) || ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1)) {
            if (vggVar.b() != ApiErrorViewType.CUSTOM) {
                vggVar.c();
                return true;
            }
            if (q0cVar != null) {
                q0cVar.E1(wbu0.a(context, th, false).a, (r5 & 2) == 0, (r5 & 4) == 0);
            }
            s3q0 s3q0Var = s3q0.a;
            return true;
        }
        if (th instanceof VKApiExecutionException) {
            return false;
        }
        wbu0.a a2 = wbu0.a(context, th, false);
        if (vggVar.b() != ApiErrorViewType.CUSTOM) {
            vggVar.c();
            return true;
        }
        if (q0cVar != null) {
            q0cVar.kf(a2, new w4u(q0cVar, 11));
        }
        s3q0 s3q0Var2 = s3q0.a;
        return true;
    }

    public final boolean T0() {
        eo10.a aVar;
        Context context = this.b;
        if (BuildInfo.s()) {
            SakFeatures.b.getClass();
            b.d i2 = SakFeatures.c.i(SakFeatures.Type.SAK_DEF_CLIENT_INSTALL_ANDROID);
            if (i2 == null || !i2.a) {
                aVar = eo10.a.b.a;
            } else if (xhr0.b(context, "ru.oneme.app")) {
                aVar = eo10.a.b.a;
            } else {
                String obj = i2.c.toString();
                aVar = epx.f(obj, "A") ? eo10.a.c.a : epx.f(obj, "B") ? eo10.a.C2826a.a : eo10.a.b.a;
            }
        } else {
            aVar = eo10.a.b.a;
        }
        return aVar instanceof eo10.a.C2826a;
    }

    public final void U0() {
        gxo gxoVar;
        VerificationMethodState verificationMethodState = this.y;
        VerificationMethodTypes verificationMethodTypes = verificationMethodState instanceof VerificationMethodTypes ? (VerificationMethodTypes) verificationMethodState : null;
        ck20 ck20Var = this.N;
        ck20Var.getClass();
        if (SakFeatures.Type.FEATURE_VKC_SMARTFLOW_METHODS_CACHE.h() && (gxoVar = ck20.b) != null && gxoVar != null) {
            ArrayList arrayList = new ArrayList(gxoVar.a);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (verificationMethodTypes == ((cyo) it.next()).a) {
                    it.remove();
                }
            }
            ck20.b = new gxo(arrayList);
        }
        ck20Var.getClass();
        this.t.b(mnh0.C(p66.x0(this, new io.reactivex.rxjava3.internal.operators.single.o(((!SakFeatures.Type.FEATURE_VKC_SMARTFLOW_METHODS_CACHE.h() || ck20.b == null) ? ck20.b(this.x) : new io.reactivex.rxjava3.internal.operators.single.v(new bk20())).m(io.reactivex.rxjava3.android.schedulers.a.b()).l(new ql2(new wq3(11), 10)), new ea(new b(1, this, r0c.class, "throwIfNoVerificationMethodsAvailable", "throwIfNoVerificationMethodsAvailable(Ljava/util/List;)V", 0), 15)).l(new ft0(new ci7(8), 14))), this.s, new c(1, this, r0c.class, "handleVerificationMethodType", "handleVerificationMethodType(Lcom/vk/auth/smartflow/api/data/VerificationMethodTypes;Z)V", 0), new d(1, this, r0c.class, "handleGetVerificationMethodError", "handleGetVerificationMethodError(Lcom/vk/superapp/core/errors/CommonApiError;)V", 0), null));
    }

    public boolean V0() {
        return true;
    }

    public final void W0(String str) {
        String str2;
        EcosystemCheckOtpVerificationMethodDto ecosystemCheckOtpVerificationMethodDto;
        if (!(this.z instanceof CheckPresenterInfo.MethodSelectorAuth)) {
            m200.C(new IllegalStateException("This method should be used only for method selector auth."));
            return;
        }
        MethodSelectorCodeState methodSelectorCodeState = this.A;
        boolean z = methodSelectorCodeState instanceof MethodSelectorCodeState.AppGenerator;
        if (!z && !(methodSelectorCodeState instanceof MethodSelectorCodeState.CallReset) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.Email) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.Push) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.Reserve) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.MaxMessenger) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.OfficialMessenger) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.MaxOtpCode) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.Sms)) {
            if (!(methodSelectorCodeState instanceof MethodSelectorCodeState.Passkey) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallReset) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifySms) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMobileId) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallIn) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMessengerPush) && !methodSelectorCodeState.equals(MethodSelectorCodeState.Loading.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        if (z) {
            str2 = "codegen";
        } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.CallReset) {
            str2 = "callreset";
        } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Email) {
            str2 = "email";
        } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Push) {
            str2 = "push";
        } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Reserve) {
            str2 = "reserve_code";
        } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Sms) {
            str2 = "sms";
        } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.MaxMessenger) {
            str2 = "max_messenger";
        } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.OfficialMessenger) {
            str2 = "official_messenger";
        } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.MaxOtpCode) {
            str2 = "max_code";
        } else {
            if (!(methodSelectorCodeState instanceof MethodSelectorCodeState.Passkey) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallReset) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifySms) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMobileId) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallIn) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMessengerPush) && !methodSelectorCodeState.equals(MethodSelectorCodeState.Loading.b)) {
                throw new NoWhenBranchMatchedException();
            }
            m200.C(new IllegalStateException("This method should be used only for method selector auth."));
            str2 = "";
        }
        this.N.getClass();
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        vfn0 x = vdx0Var.x();
        String e2 = dgn0.e();
        EcosystemCheckOtpVerificationMethodDto[] values = EcosystemCheckOtpVerificationMethodDto.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                ecosystemCheckOtpVerificationMethodDto = null;
                break;
            }
            ecosystemCheckOtpVerificationMethodDto = values[i2];
            if (epx.f(ecosystemCheckOtpVerificationMethodDto.i(), str2)) {
                break;
            } else {
                i2++;
            }
        }
        this.t.b(mnh0.C(p66.x0(this, com.vk.registration.funnels.a.b(new io.reactivex.rxjava3.internal.operators.single.o(x.j(this.x, str, e2, ecosystemCheckOtpVerificationMethodDto).m(io.reactivex.rxjava3.android.schedulers.a.b()), new w00(new qm1(this, 21), 8)).h(new y00(new com.vk.movika.sdk.base.hooks.p(this, 27), 9)))), this.s, new e(1, this, r0c.class, "onCheckOtpSuccess", "onCheckOtpSuccess(Lcom/vk/api/generated/ecosystem/dto/EcosystemCheckOtpResponseDto;)V", 0), new f(1, this, r0c.class, "onCheckOtpError", "onCheckOtpError(Lcom/vk/superapp/core/errors/CommonApiError;)V", 0), null));
    }

    public final void X0() {
        MethodSelectorCodeState methodSelectorCodeState = this.A;
        p090 p090Var = this.F;
        p090Var.a = methodSelectorCodeState;
        p090Var.e = null;
        if (!(methodSelectorCodeState instanceof MethodSelectorCodeState.Loading)) {
            p090Var.d(new uz(22));
            return;
        }
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.VERIFICATION_LOADING;
        ArrayList arrayList = new ArrayList();
        arrayList.add(p090Var.a().h());
        s3q0 s3q0Var = s3q0.a;
        frf0.l(schemeStatSak$EventScreen, arrayList);
    }

    public final io.reactivex.rxjava3.disposables.c Y0(io.reactivex.rxjava3.internal.operators.single.y yVar, izs izsVar) {
        return mnh0.C(p66.x0(this, yVar.m(io.reactivex.rxjava3.android.schedulers.a.b())), this.s, new z5a(3, this, izsVar), new com.vk.channels.impl.channel_screen.send_msg.e(1, this, r0c.class, "onSendOtpError", "onSendOtpError(Lcom/vk/superapp/core/errors/CommonApiError;)V", 0, 5), null);
    }

    public final void Z0() {
        MethodSelectorCodeState methodSelectorCodeState = this.A;
        if (methodSelectorCodeState instanceof MethodSelectorCodeState.Email) {
            SignUpDataHolder signUpDataHolder = this.p;
            SignUpDataHolder signUpDataHolder2 = signUpDataHolder != null ? signUpDataHolder : null;
            if (signUpDataHolder == null) {
                signUpDataHolder = null;
            }
            signUpDataHolder2.I = VkAuthMetaInfo.zb(signUpDataHolder.I, SilentAuthSource.BY_EMAIL, null, null, 55);
            return;
        }
        if (methodSelectorCodeState instanceof MethodSelectorCodeState.Push) {
            SignUpDataHolder signUpDataHolder3 = this.p;
            SignUpDataHolder signUpDataHolder4 = signUpDataHolder3 != null ? signUpDataHolder3 : null;
            if (signUpDataHolder3 == null) {
                signUpDataHolder3 = null;
            }
            signUpDataHolder4.I = VkAuthMetaInfo.zb(signUpDataHolder3.I, SilentAuthSource.BY_ECOSYSTEM_PUSH, null, null, 55);
            return;
        }
        if (methodSelectorCodeState instanceof MethodSelectorCodeState.Passkey) {
            SignUpDataHolder signUpDataHolder5 = this.p;
            SignUpDataHolder signUpDataHolder6 = signUpDataHolder5 != null ? signUpDataHolder5 : null;
            if (signUpDataHolder5 == null) {
                signUpDataHolder5 = null;
            }
            signUpDataHolder6.I = VkAuthMetaInfo.zb(signUpDataHolder5.I, SilentAuthSource.BY_PASSKEY, null, null, 55);
            return;
        }
        if (methodSelectorCodeState instanceof MethodSelectorCodeState.MaxMessenger) {
            SignUpDataHolder signUpDataHolder7 = this.p;
            SignUpDataHolder signUpDataHolder8 = signUpDataHolder7 != null ? signUpDataHolder7 : null;
            if (signUpDataHolder7 == null) {
                signUpDataHolder7 = null;
            }
            signUpDataHolder8.I = VkAuthMetaInfo.zb(signUpDataHolder7.I, SilentAuthSource.BY_MAX_MESSENGER, null, null, 55);
            return;
        }
        if (methodSelectorCodeState instanceof MethodSelectorCodeState.OfficialMessenger) {
            SignUpDataHolder signUpDataHolder9 = this.p;
            SignUpDataHolder signUpDataHolder10 = signUpDataHolder9 != null ? signUpDataHolder9 : null;
            if (signUpDataHolder9 == null) {
                signUpDataHolder9 = null;
            }
            signUpDataHolder10.I = VkAuthMetaInfo.zb(signUpDataHolder9.I, SilentAuthSource.BY_OFFICIAL_MESSENGER, null, null, 55);
            return;
        }
        if (methodSelectorCodeState instanceof MethodSelectorCodeState.MaxOtpCode) {
            SignUpDataHolder signUpDataHolder11 = this.p;
            SignUpDataHolder signUpDataHolder12 = signUpDataHolder11 != null ? signUpDataHolder11 : null;
            if (signUpDataHolder11 == null) {
                signUpDataHolder11 = null;
            }
            signUpDataHolder12.I = VkAuthMetaInfo.zb(signUpDataHolder11.I, SilentAuthSource.BY_MAX_CODE, null, null, 55);
            return;
        }
        if (!(methodSelectorCodeState instanceof MethodSelectorCodeState.Sms) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.CallReset) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifySms) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallReset) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMobileId) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallIn) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMessengerPush)) {
            if (!(methodSelectorCodeState instanceof MethodSelectorCodeState.AppGenerator) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.Reserve) && !epx.f(methodSelectorCodeState, MethodSelectorCodeState.Loading.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        SignUpDataHolder signUpDataHolder13 = this.p;
        SignUpDataHolder signUpDataHolder14 = signUpDataHolder13 != null ? signUpDataHolder13 : null;
        if (signUpDataHolder13 == null) {
            signUpDataHolder13 = null;
        }
        signUpDataHolder14.I = VkAuthMetaInfo.zb(signUpDataHolder13.I, SilentAuthSource.BY_PHONE, null, null, 55);
    }

    @Override // xsna.p0c
    public final void h() {
        MethodSelectorCodeState methodSelectorCodeState = this.A;
        MethodSelectorCodeState.MaxOtpCode maxOtpCode = methodSelectorCodeState instanceof MethodSelectorCodeState.MaxOtpCode ? (MethodSelectorCodeState.MaxOtpCode) methodSelectorCodeState : null;
        if (maxOtpCode == null) {
            return;
        }
        L0(new MethodSelectorCodeState.MaxOtpCode(maxOtpCode.c, maxOtpCode.d, maxOtpCode.e, maxOtpCode.f, maxOtpCode.g, true));
    }

    @Override // xsna.p66, xsna.z55
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        n090 n090Var = this.H;
        n090Var.getClass();
        if (i2 != 2) {
            return false;
        }
        n090Var.getClass();
        if (i3 != -1) {
            return true;
        }
        String stringExtra = intent != null ? intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE") : null;
        p090 p090Var = n090Var.a;
        p090Var.getClass();
        p090Var.d(new np2(com.vk.registration.funnels.b.a));
        if (stringExtra == null) {
            return true;
        }
        n090Var.c.k(stringExtra);
        return true;
    }

    @Override // xsna.p66, xsna.z55
    public void onDestroy() {
        super.onDestroy();
        M0(this.A, null);
    }

    @Override // xsna.p66, xsna.z55
    public void onResume() {
        tj20 tj20Var = this.P;
        boolean z = tj20Var.b;
        tj20Var.b = false;
        if (z) {
            bpn0 bpn0Var = qro0.a;
            qro0.a(new rj1(this, 15));
        }
    }

    @Override // xsna.p66
    public final void p0() {
        this.e.f(AuthStatSender.Screen.PHONE_CODE);
    }

    @Override // xsna.ya6
    public final void z0() {
        VerificationScreenData verificationScreenData = this.I;
        if (verificationScreenData == null) {
            return;
        }
        FullscreenPasswordData fullscreenPasswordData = new FullscreenPasswordData(verificationScreenData.b, verificationScreenData instanceof VerificationScreenData.Phone, verificationScreenData.d, true, null, false, 48, null);
        com.vk.auth.main.b bVar = this.d;
        VkEmailForwardingConfig vkEmailForwardingConfig = null;
        if (bVar == null) {
            bVar = null;
        }
        bVar.b1(fullscreenPasswordData);
        p090 p090Var = this.F;
        p090Var.getClass();
        b.a aVar = b.a.a;
        SchemeStatSak$RegistrationFieldItem h2 = p090Var.a().h();
        try {
            q55 q55Var = q55.a;
            Bundle bundle = q55.c().a.K;
            if (bundle != null) {
                vkEmailForwardingConfig = m63.d(bundle);
            }
        } catch (Throwable unused) {
        }
        aVar.getClass();
        b.a.d(h2, vkEmailForwardingConfig);
    }
}
