package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.auth.main.AuthModel;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.main.VkClientLibverifyInfo;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.auth.utils.VkPhoneFormatUtils;
import com.vk.core.serialize.Serializer;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.analytics.RegistrationStatFlowType;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.superapp.api.dto.auth.AuthTarget;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import com.vk.superapp.api.internal.oauthrequests.AuthByExchangeTokenInitiator;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.qr.web2app.QrWebToAppComponent;
import com.vk.toggle.anonymous.SakFeatures;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ao10;
import xsna.eo10;
import xsna.oou0;
import xsna.p66;
import xsna.pir0;
import xsna.sir0;

/* compiled from: EnterLoginPresenter.kt */
/* loaded from: classes.dex */
public class vop extends p66<cop> implements bop {
    public boolean A;
    public boolean B;
    public boolean C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final y5k0 G;
    public final nl90 H;
    public final pys I;
    public final a J;
    public final Object K;
    public final pir0 L;
    public final bpn0 M;
    public String N;
    public final oou0.a x;
    public final qcv0 y;
    public final tir0 z;

    /* compiled from: EnterLoginPresenter.kt */
    public static final class a implements pir0.b {
        public a() {
        }

        @Override // xsna.pir0.b
        public final void a(String str, VkAuthValidateAccountResponse vkAuthValidateAccountResponse, boolean z) {
            nl90 nl90Var = vop.this.H;
            String e = vkAuthValidateAccountResponse.e();
            List<VkAuthValidateAccountResponse.ValidateAccountFlow> c = vkAuthValidateAccountResponse.c();
            if (j5g.a0(c) == VkAuthValidateAccountResponse.ValidateAccountFlow.PASSKEY) {
                c = j5g.S(c, 1);
            }
            nl90Var.a(str, e, z, c);
        }

        @Override // xsna.pir0.b
        public final void b(r25 r25Var) {
            VerificationMethodState a;
            ao10.a b;
            if (SakFeatures.Type.SAK_MAX_AUTH_CACHE_ANDROID.h() && (((a = a6k0.a(r25Var.d().f())) == VerificationMethodTypes.MAX_MESSENGER || a == VerificationMethodTypes.MAX_OTP_CODE) && ((b = ao10.b(r25Var.c())) == null || System.currentTimeMillis() >= b.c()))) {
                ao10.a(r25Var.c(), r25Var);
            }
            y5k0.b(vop.this.G, r25Var);
        }

        @Override // xsna.pir0.b
        public final void c(String str, String str2) {
            r55 r55Var = r55.a;
            r55.e().d(VkClientLibverifyInfo.Service.REGISTRATION);
            vop vopVar = vop.this;
            vopVar.i0(mnh0.B(vopVar.y0(false, false, false, str, str2), vopVar.s, new bi0(16, vopVar, str), new rop(vopVar, 0), new ngl(null, new ps2(vopVar, 19), null, new l8(vopVar, 22), null, null, null, null, new ju1(vopVar, 23), null, 757)));
        }

        @Override // xsna.pir0.b
        public final void d(String str, VkAuthValidateAccountResponse vkAuthValidateAccountResponse, List<i2q> list) {
            com.vk.registration.funnels.b.a.getClass();
            com.vk.registration.funnels.b.j();
            vop vopVar = vop.this;
            vopVar.l0().c(str);
            Integer b = vkAuthValidateAccountResponse.b();
            if (b == null) {
                vopVar.A0(str);
                return;
            }
            i2q i2qVar = (i2q) j5g.b0(b.intValue(), list);
            if (i2qVar == null) {
                vopVar.A0(str);
            } else {
                VkAuthMetaInfo vkAuthMetaInfo = new VkAuthMetaInfo(null, null, null, SilentAuthSource.FAST_LOGIN, new AuthTarget(null, false, false, false, true, 15, null), null, 39, null);
                p66.r0(vopVar, l55.e(l55.a, vopVar.b, i2qVar.a(), i2qVar.b(), vkAuthMetaInfo, AuthByExchangeTokenInitiator.SILENT_AUTHORIZATION), new p66.a(), vkAuthMetaInfo, 4);
            }
        }

        @Override // xsna.pir0.b
        public final void e(String str, VkAuthValidateAccountResponse vkAuthValidateAccountResponse) {
            com.vk.registration.funnels.b.a.getClass();
            com.vk.registration.funnels.b.j();
            vop vopVar = vop.this;
            vopVar.l0().c(str);
            ty0 ty0Var = new ty0(vopVar, str, vkAuthValidateAccountResponse, 4);
            Context context = vopVar.b;
            new k140(context).e();
            Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
            VkAuthState d = VkAuthState.a.d(vkAuthValidateAccountResponse.e(), str);
            String f = vkAuthValidateAccountResponse.f();
            VkAuthMetaInfo vkAuthMetaInfo = new VkAuthMetaInfo(null, null, null, SilentAuthSource.FAST_LOGIN, null, null, 55, null);
            top topVar = new top(vopVar, ty0Var);
            wpg wpgVar = new wpg(vopVar, 10);
            l55.a.getClass();
            vopVar.q0(l55.a(context, d, f, vkAuthMetaInfo), topVar, vkAuthMetaInfo, wpgVar);
        }

        @Override // xsna.pir0.b
        public final void f(String str, VkAuthValidateAccountResponse vkAuthValidateAccountResponse, boolean z, boolean z2) {
            pys pysVar = vop.this.I;
            String e = vkAuthValidateAccountResponse.e();
            String f = vkAuthValidateAccountResponse.f();
            pysVar.getClass();
            if (z) {
                com.vk.registration.funnels.b.a.getClass();
                com.vk.registration.funnels.b.j();
            }
            if (z2) {
                VkPhoneFormatUtils.PhoneFormatterMode phoneFormatterMode = VkPhoneFormatUtils.PhoneFormatterMode.RUSSIAN_SPECIFIC;
                if (!brm0.B(str, phoneFormatterMode.i(), false)) {
                    str = VkPhoneFormatUtils.a(pysVar.b, str, null, phoneFormatterMode, 12);
                }
            }
            pysVar.a.c(new FullscreenPasswordData(str, z2, e, z, f, false, 32, null), null);
        }

        @Override // xsna.pir0.b
        public final void g(String str, String str2) {
            com.vk.registration.funnels.b.a.getClass();
            com.vk.registration.funnels.b.j();
            boolean a = ol90.a();
            vop vopVar = vop.this;
            vopVar.i0(mnh0.B(vopVar.y0(true, true, a, str, str2), vopVar.s, new lfa(4, vopVar, str), new xcd(vopVar, 20), new ngl(null, new iu4(vopVar, 12), null, new yh1(vopVar, 16), null, null, null, null, new nz(vopVar, 17), null, 757)));
        }
    }

    /* compiled from: EnterLoginPresenter.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<vgg, s3q0> {
        public b(nir0 nir0Var) {
            super(1, nir0Var, nir0.class, "handleError", "handleError(Lcom/vk/superapp/core/errors/CommonApiError;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(vgg vggVar) {
            vgg vggVar2 = vggVar;
            nir0 nir0Var = (nir0) this.receiver;
            nir0Var.getClass();
            Throwable th = vggVar2.a;
            a35.a(vggVar2);
            vggVar2.d(new s(21, th, nir0Var));
            return s3q0.a;
        }
    }

    /* compiled from: EnterLoginPresenter.kt */
    public static final class c implements pir0.a {
        public c() {
        }

        @Override // xsna.pir0.a
        public final void a() {
            com.vk.registration.funnels.b.a.getClass();
            com.vk.registration.funnels.b.w();
            cop copVar = (cop) vop.this.a;
            if (copVar != null) {
                copVar.v4();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, kotlin.Lazy] */
    public vop(oou0.a aVar, qcv0 qcv0Var) {
        this.x = aVar;
        this.y = qcv0Var;
        Context context = this.b;
        AuthModel authModel = this.c;
        SignUpRouter signUpRouter = this.n;
        this.z = new tir0(context, authModel, signUpRouter == null ? null : signUpRouter);
        v94 v94Var = new v94(6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.D = msy.a(lazyThreadSafetyMode, v94Var);
        this.E = msy.a(lazyThreadSafetyMode, new w94(7));
        this.F = msy.a(lazyThreadSafetyMode, new hbl(this, 2));
        g71 g71Var = new g71(new tkj(this, 2));
        Context context2 = this.b;
        this.G = new y5k0(g71Var, context2);
        this.H = new nl90(g71Var);
        this.I = new pys(g71Var, context2);
        a aVar2 = new a();
        this.J = aVar2;
        this.K = msy.a(lazyThreadSafetyMode, new b5o(this, 1));
        this.L = new pir0(aVar2, new c(), (ymj0) this.m.getValue(), (umj0) this.l.getValue(), 48);
        this.M = new bpn0(new c5o(this, 1));
        this.N = "";
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void A0(String str) {
        wmj0 l0 = l0();
        Context context = this.b;
        List<i2q> a2 = l0.a(context, str);
        boolean z = !(eo10.a(context) instanceof eo10.a.c);
        i0(mnh0.B(w0(mir0.a(new mir0(), new oir0(str, this.A, this.c.n().a(), null, m0(str), l0().b(str) ? EmptyList.b : SakFeatures.Type.VKC_BACKUP_SENDING.h() ? ((hsp0) this.j.getValue()).getAll() : EmptyList.b, a2, z, z, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE)).a0(io.reactivex.rxjava3.android.schedulers.a.b()), true), this.s, new n15(this, str, a2, 3), new b((nir0) this.K.getValue()), new ngl(null, null, null, new pi0(this, 21), null, null, null, null, new d9(this, 12), null, 759)));
    }

    @Override // xsna.bop
    public final void D() {
        ao10.a b2;
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.AUTH_START, null, null, null, null, null, null, 254);
        String obj = drm0.p0(this.N).toString();
        if (obj.length() == 0) {
            cop copVar = (cop) this.a;
            if (copVar != null) {
                copVar.c7();
                return;
            }
            return;
        }
        if (!SakFeatures.Type.SAK_MAX_AUTH_CACHE_ANDROID.h() || (b2 = ao10.b(obj)) == null) {
            A0(obj);
        } else {
            this.J.b(b2.b());
        }
    }

    @Override // xsna.bop
    public final void G() {
        com.vk.registration.funnels.b.a.getClass();
        com.vk.registration.funnels.b.s();
        RegistrationStatParamsFactory.a = RegistrationStatFlowType.AUTH_WITHOUT_PASSWORD;
        SignUpDataHolder signUpDataHolder = this.p;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        signUpDataHolder.f = true;
        com.vk.auth.main.e eVar = this.o;
        (eVar != null ? eVar : null).l();
    }

    @Override // xsna.bop
    public final void H() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.MOBILE_QR_QR_CODE_BUTTON_SHOW, null, null, null, null, null, null, 254);
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.LOGIN;
    }

    @Override // xsna.bop
    public final void k() {
        r55 r55Var = r55.a;
        umu0 umu0Var = r55.g;
        if (umu0Var == null) {
            umu0Var = null;
        }
        umu0Var.m.a(this.b);
    }

    @Override // xsna.bop
    public final void n() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.MOBILE_QR_QR_CODE_BUTTON_TAP, null, null, null, null, null, null, 254);
        SignUpRouter signUpRouter = this.n;
        if (signUpRouter == null) {
            signUpRouter = null;
        }
        signUpRouter.c();
    }

    @Override // xsna.p66, xsna.z55
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 16845) {
            return false;
        }
        if (i2 == -1 && intent != null) {
            qcv0 qcv0Var = this.y;
            String a2 = qcv0Var != null ? qcv0Var.a(intent) : null;
            if (a2 != null) {
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.GOOGLE_PHONE_HINT_ADDED, null, null, null, null, null, null, 254);
                cop copVar = (cop) this.a;
                if (copVar != null) {
                    copVar.setLogin(a2);
                }
                D();
            }
        }
        if (i2 != 0) {
            return true;
        }
        com.vk.registration.funnels.b.a.getClass();
        com.vk.registration.funnels.b.n();
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.p66, xsna.z55
    /* renamed from: p */
    public final void y0(cop copVar) {
        super.y0(copVar);
        cop copVar2 = (cop) this.a;
        if (copVar2 != null) {
            copVar2.Nd();
        }
        int i = 1;
        if (!this.B && !this.C && !((koe0) this.F.getValue()).c() && !this.B) {
            oou0.a aVar = this.x;
            if (aVar != null) {
                aVar.a(new l8m(this, 1), new w6b(this, i));
            }
            this.B = true;
        }
        this.B = true;
        koe0 handler = ((QrWebToAppComponent) k0().a(fpf0.a(QrWebToAppComponent.class))).getHandler();
        cop copVar3 = (cop) this.a;
        if (copVar3 != null) {
            copVar3.w4(handler.e());
        }
        r55 r55Var = r55.a;
        i0(hg1.i(((yui) r55.j()).c(this.b, false).q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.schedulers.a.b()), new l60(1)));
    }

    @Override // xsna.bop
    public final void setLogin(String str) {
        this.N = str;
        if (this.A) {
            SignUpDataHolder signUpDataHolder = this.p;
            if (signUpDataHolder == null) {
                signUpDataHolder = null;
            }
            signUpDataHolder.y = null;
            this.A = false;
        }
        cop copVar = (cop) this.a;
        if (copVar != null) {
            copVar.Nd();
        }
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 y0(boolean z, boolean z2, boolean z3, String str, String str2) {
        sir0 sir0Var = sir0.a;
        sir0.e eVar = new sir0.e(str2, str, false, z, z2, false, false, false, z3, null, 740);
        sir0.d dVar = new sir0.d(new sm(22), null, null, null, 14);
        sir0Var.getClass();
        return w0(sir0.g(eVar, dVar), true);
    }

    public final void z0(vgg vggVar) {
        vggVar.d(new j49(vggVar.a(), this, vggVar, 1));
    }
}
