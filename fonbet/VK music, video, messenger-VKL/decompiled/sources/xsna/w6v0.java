package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.auth.main.AuthModel;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.oauth.VkOAuthGoal;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.restore.RestoreReason;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.core.serialize.Serializer;
import com.vk.silentauth.SilentAuthInfo;
import com.vk.superapp.api.states.VkAuthState;
import com.vkontakte.android.R;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.eo70;
import xsna.sir0;

/* compiled from: VkOAuthServicePresenter.kt */
/* loaded from: classes15.dex */
public final class w6v0 extends p66<i90> {
    public final Object A;
    public final Object B;
    public final tir0 C;
    public final Object D;
    public eo70.c.a.b E;
    public final c F;
    public final Map<VkOAuthService, wzs<Context, SilentAuthInfo, s3q0>> G;
    public final VkOAuthService x;
    public final VkOAuthGoal y;
    public final u6v0 z;

    /* compiled from: VkOAuthServicePresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VkOAuthGoal.values().length];
            try {
                iArr[VkOAuthGoal.AUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkOAuthGoal.ACTIVATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkOAuthGoal.ADDITIONAL_OAUTH_AUTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VerificationMethodTypes.values().length];
            try {
                iArr2[VerificationMethodTypes.CALLRESET.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VerificationMethodTypes.CODEGEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VerificationMethodTypes.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VerificationMethodTypes.PUSH.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VerificationMethodTypes.RESERVE_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VerificationMethodTypes.MAX_MESSENGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VerificationMethodTypes.OFFICIAL_MESSENGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[VerificationMethodTypes.MAX_OTP_CODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[VerificationMethodTypes.SMS.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[VerificationMethodTypes.PASSWORD.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[VerificationMethodTypes.PASSKEY.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: VkOAuthServicePresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<eo70, s3q0> {
        /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.izs
        public final s3q0 invoke(eo70 eo70Var) {
            eo70 eo70Var2 = eo70Var;
            w6v0 w6v0Var = (w6v0) this.receiver;
            w6v0Var.getClass();
            if (eo70Var2 instanceof eo70.e) {
                w6v0Var.A0((eo70.e) eo70Var2);
            } else if (eo70Var2 instanceof eo70.d) {
                eo70.d dVar = (eo70.d) eo70Var2;
                String str = dVar.a;
                String str2 = dVar.b;
                Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
                String i = w6v0Var.x.i();
                VkAuthState vkAuthState = new VkAuthState(null);
                vkAuthState.d.put("grant_type", "vk_external_auth");
                vkAuthState.d.put("vk_service", i);
                vkAuthState.d.put("vk_external_token", str);
                vkAuthState.d.put("vk_external_client_id", str2);
                vkAuthState.d.put("2fa_supported", "1");
                p66.j0(w6v0Var, vkAuthState, w6v0Var.F, null, null, 28);
            } else if (eo70Var2 instanceof eo70.f) {
                eo70.f fVar = (eo70.f) eo70Var2;
                par0.a.getClass();
                par0.a("[OAuthPresenter] doVkAuth");
                SignUpDataHolder signUpDataHolder = w6v0Var.p;
                if (signUpDataHolder == null) {
                    signUpDataHolder = null;
                }
                Bundle bundle = signUpDataHolder.K;
                if (bundle != null) {
                    m63.m(bundle, fVar.b);
                }
                l55 l55Var = l55.a;
                Context context = w6v0Var.b;
                SilentAuthInfo silentAuthInfo = fVar.a;
                SignUpDataHolder signUpDataHolder2 = w6v0Var.p;
                if (signUpDataHolder2 == null) {
                    signUpDataHolder2 = null;
                }
                p66.r0(w6v0Var, w6v0Var.w0(l55.f(l55Var, context, silentAuthInfo, signUpDataHolder2.I, 56).a0(io.reactivex.rxjava3.android.schedulers.a.b()), false), new y6v0(w6v0Var), null, 6);
            } else if (eo70Var2 instanceof eo70.a) {
                w6v0Var.B0(null);
            } else if (eo70Var2 instanceof eo70.c) {
                SignUpDataHolder signUpDataHolder3 = w6v0Var.p;
                if (signUpDataHolder3 == null) {
                    signUpDataHolder3 = null;
                }
                Bundle bundle2 = signUpDataHolder3.K;
                if (bundle2 == null || !m63.g(bundle2)) {
                    eo70.c.a aVar = ((eo70.c) eo70Var2).a;
                    if (aVar instanceof eo70.c.a.b) {
                        eo70.c.a.b bVar = (eo70.c.a.b) aVar;
                        boolean matches = Patterns.EMAIL_ADDRESS.matcher(bVar.a).matches();
                        if (((Boolean) w6v0Var.D.getValue()).booleanValue() || matches) {
                            w6v0Var.E = bVar;
                            i90 i90Var = (i90) w6v0Var.a;
                            if (i90Var != null) {
                                i90Var.xc(bVar.b, bVar.a);
                            }
                        } else {
                            String str3 = bVar.a;
                            w6v0Var.i0(mnh0.B(w6v0Var.w0(sir0.h(sir0.a, new sir0.e(bVar.b, str3, false, true, true, false, false, false, false, null, 740)), true), w6v0Var.s, new v6v0(0, w6v0Var, str3), new ltl0(14), null));
                        }
                    } else if (aVar instanceof eo70.c.a.d) {
                        com.vk.auth.main.b bVar2 = w6v0Var.d;
                        if (bVar2 == null) {
                            bVar2 = null;
                        }
                        bVar2.S0(new RestoreReason.ForgetPassword(null, null, null));
                    } else if (!(aVar instanceof eo70.c.a.C2827a) && !(aVar instanceof eo70.c.a.C2828c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    eo70.c.a aVar2 = ((eo70.c) eo70Var2).a;
                    if (aVar2 instanceof eo70.c.a.d) {
                        w6v0Var.z0(((eo70.c.a.d) aVar2).a);
                    } else if (aVar2 instanceof eo70.c.a.C2827a) {
                        w6v0Var.z0(((eo70.c.a.C2827a) aVar2).a);
                    } else if (!(aVar2 instanceof eo70.c.a.b) && !(aVar2 instanceof eo70.c.a.C2828c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else if (!(eo70Var2 instanceof eo70.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return s3q0.a;
        }
    }

    /* compiled from: VkOAuthServicePresenter.kt */
    public static final class c extends p66<i90>.a {
        public c() {
            super();
        }

        @Override // xsna.p66.a, xsna.ipj0
        public final void n(Throwable th, vgg vggVar) {
            super.n(th, vggVar);
            if (vggVar.b() == ApiErrorViewType.SKIP) {
                w6v0.this.y0();
            }
        }
    }

    /* compiled from: VkOAuthServicePresenter.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<eo70.e, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(eo70.e eVar) {
            ((w6v0) this.receiver).A0(eVar);
            return s3q0.a;
        }
    }

    /* compiled from: VkOAuthServicePresenter.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            ((w6v0) this.receiver).B0(str);
            return s3q0.a;
        }
    }

    public w6v0(VkOAuthService vkOAuthService, VkOAuthGoal vkOAuthGoal, u6v0 u6v0Var) {
        this.x = vkOAuthService;
        this.y = vkOAuthGoal;
        this.z = u6v0Var;
        afl0 afl0Var = new afl0(this, 27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.A = msy.a(lazyThreadSafetyMode, afl0Var);
        this.B = msy.a(lazyThreadSafetyMode, new rmu0(this, 2));
        Context context = this.b;
        AuthModel authModel = this.c;
        SignUpRouter signUpRouter = this.n;
        this.C = new tir0(context, authModel, signUpRouter == null ? null : signUpRouter);
        this.D = msy.a(lazyThreadSafetyMode, new vqe0(13));
        this.F = new c();
        this.G = on00.f(new Pair(VkOAuthService.MAILRU, new w1(this, 10)));
    }

    public final void A0(eo70.e eVar) {
        par0 par0Var = par0.a;
        StringBuilder sb = new StringBuilder("[OAuthPresenter] success oauth, service=");
        VkOAuthService vkOAuthService = this.x;
        sb.append(vkOAuthService);
        sb.append(", goal=");
        VkOAuthGoal vkOAuthGoal = this.y;
        sb.append(vkOAuthGoal);
        String sb2 = sb.toString();
        par0Var.getClass();
        par0.a(sb2);
        int i = a.$EnumSwitchMapping$0[vkOAuthGoal.ordinal()];
        if (i == 1) {
            Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
            p66.j0(this, VkAuthState.a.a(vkOAuthService.i(), eVar.a, eVar.c, eVar.d, eVar.b, eVar.e), this.F, null, null, 28);
            return;
        }
        int i2 = 0;
        io.reactivex.rxjava3.disposables.b bVar = this.t;
        if (i == 2) {
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            bVar.b(mnh0.B(w0(vdx0Var.q().a(eVar.a, eVar.c, eVar.d, vkOAuthService.i(), eVar.b), false), this.s, new gsq0(this, 7), new skj0(this, 19), null));
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        SignUpDataHolder signUpDataHolder = this.p;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        iq0 iq0Var = new iq0(this.b, signUpDataHolder.I, new x6v0(this, w6v0.class, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "getView()Lcom/vk/auth/base/AuthView;", 0), bVar);
        Serializer.c<VkAuthState> cVar2 = VkAuthState.CREATOR;
        VkAuthState a2 = VkAuthState.a.a(vkOAuthService.i(), eVar.a, eVar.c, eVar.d, eVar.b, eVar.e);
        SignUpDataHolder signUpDataHolder2 = this.p;
        if (signUpDataHolder2 == null) {
            signUpDataHolder2 = null;
        }
        VkAuthMetaInfo vkAuthMetaInfo = signUpDataHolder2.I;
        r55 r55Var = r55.a;
        AuthModel h = r55.h();
        l55 l55Var = l55.a;
        vdx0 vdx0Var2 = e370.e;
        io.reactivex.rxjava3.internal.operators.observable.m1 o = (vdx0Var2 != null ? vdx0Var2 : null).e().o(a2, null, h.n().a(), h.f(), false, null, false, false, null);
        l55Var.getClass();
        new io.reactivex.rxjava3.internal.operators.observable.o1(new io.reactivex.rxjava3.internal.operators.observable.o1(o, new d45(new c45(i2))), new a45(new z35(vkAuthMetaInfo, i2))).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(iq0Var);
        i0(iq0Var);
    }

    public final void B0(String str) {
        par0 par0Var = par0.a;
        String str2 = "[OAuthPresenter] showError, service=" + this.x + ", goal=" + this.y;
        par0Var.getClass();
        par0.a(str2);
        if (str == null) {
            str = this.b.getString(R.string.error_unknown);
        }
        i90 i90Var = (i90) this.a;
        if (i90Var != null) {
            i90Var.wa(str, null, null);
        }
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.UNKNOWN;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.p66, xsna.z55
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        boolean a2 = ((do70) this.B.getValue()).a(i, i2, intent, new b(1, this, w6v0.class, "onOAuthResult", "onOAuthResult(Lcom/vk/auth/oauth/OAuthResult;)V", 0));
        par0 par0Var = par0.a;
        String str = "[OAuthPresenter] onActivityResult, service=" + this.x + ", goal=" + this.y + ", resultCode=" + i2 + ", result=" + a2;
        par0Var.getClass();
        par0.a(str);
        return a2;
    }

    public final void y0() {
        V v = this.a;
        c7v0 c7v0Var = v instanceof c7v0 ? (c7v0) v : null;
        if (c7v0Var != null) {
            c7v0Var.b.finish();
        }
    }

    public final void z0(String str) {
        String string;
        SignUpDataHolder signUpDataHolder = this.p;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        Bundle bundle = signUpDataHolder.K;
        if (bundle == null || (string = bundle.getString("white_label_flow_input_sat")) == null) {
            return;
        }
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.t.b(mnh0.B(w0(vdx0Var.e().u(string, str).a0(io.reactivex.rxjava3.android.schedulers.a.b()), true), this.s, new kyq0(this, 10), new ujm0(this, 15), null));
    }
}
