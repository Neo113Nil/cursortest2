package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.passkey.PasskeyAlternative;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.passkey.web.PasskeyWebAuthScreen;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.auth.utils.VkPhoneFormatUtils;
import com.vk.core.serialize.Serializer;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.silentauth.SilentAuthInfo;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.whitelabelauth.di.data.WhiteLabelAuthData;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import xsna.pir0;
import xsna.sir0;
import xsna.x65;

/* compiled from: WhiteLabelAuthPresenter.kt */
/* loaded from: classes15.dex */
public final class xkx0 extends p66<tkx0> implements skx0 {
    public final bpn0 A = new bpn0(new qqt0(this, 8));
    public final Object B;
    public final y5k0 C;
    public final nl90 D;
    public final pys E;
    public final Object F;
    public final pir0 G;
    public final WhiteLabelAuthData x;
    public final FragmentActivity y;
    public SilentAuthInfo z;

    /* compiled from: WhiteLabelAuthPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<vgg, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(vgg vggVar) {
            xkx0.y0((xkx0) this.receiver, vggVar);
            return s3q0.a;
        }
    }

    /* compiled from: WhiteLabelAuthPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((xkx0) this.receiver).C0();
            return s3q0.a;
        }
    }

    /* compiled from: WhiteLabelAuthPresenter.kt */
    public static final class d implements pir0.a {
        public d() {
        }

        @Override // xsna.pir0.a
        public final void a() {
            com.vk.registration.funnels.b.a.getClass();
            com.vk.registration.funnels.b.w();
            xkx0.this.B0();
        }
    }

    public xkx0(WhiteLabelAuthData whiteLabelAuthData, FragmentActivity fragmentActivity) {
        this.x = whiteLabelAuthData;
        this.y = fragmentActivity;
        ko60 ko60Var = new ko60(17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.B = msy.a(lazyThreadSafetyMode, ko60Var);
        rkx0 rkx0Var = new rkx0(fragmentActivity);
        this.C = new y5k0(rkx0Var, fragmentActivity.getApplicationContext());
        this.D = new nl90(rkx0Var);
        this.E = new pys(rkx0Var, fragmentActivity.getApplicationContext());
        c cVar = new c();
        this.F = msy.a(lazyThreadSafetyMode, new guw0(this, 2));
        this.G = new pir0(cVar, new d(), null, null, 60);
    }

    public static final void y0(xkx0 xkx0Var, vgg vggVar) {
        xkx0Var.getClass();
        Throwable th = vggVar.a;
        if ((th instanceof VKApiExecutionException) && f35.d((VKApiExecutionException) th)) {
            sp.v(xkx0Var.a, xkx0Var.b, new jcf0(xkx0Var, 28));
        } else if (vggVar.b() != ApiErrorViewType.CUSTOM) {
            vggVar.c();
        } else {
            xkx0Var.B0();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void A0(String str, VkAuthValidatePhoneResult vkAuthValidatePhoneResult) {
        VkPhoneFormatUtils.PhoneFormatterMode phoneFormatterMode = VkPhoneFormatUtils.PhoneFormatterMode.RUSSIAN_SPECIFIC;
        Context context = this.b;
        VerificationScreenData.Phone phone = new VerificationScreenData.Phone(str, VkPhoneFormatUtils.a(context, str, null, phoneFormatterMode, 12), vkAuthValidatePhoneResult.b, false, vkAuthValidatePhoneResult, false, false, false, null, null, null, null, 4072, null);
        VkAuthValidatePhoneResult vkAuthValidatePhoneResult2 = phone.f;
        if (vkAuthValidatePhoneResult2 != null) {
            VkAuthValidatePhoneResult.ValidationType validationType = vkAuthValidatePhoneResult2.f;
            if (vkAuthValidatePhoneResult2.e == VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_PASSKEY) {
                PasskeyAlternative.a aVar = PasskeyAlternative.Companion;
                boolean z = validationType == null;
                aVar.getClass();
                PasskeyAlternative a2 = PasskeyAlternative.a.a(z);
                PasskeyWebAuthScreen.a aVar2 = PasskeyWebAuthScreen.Companion;
                boolean z2 = validationType == null;
                aVar2.getClass();
                PasskeyCheckInfo passkeyCheckInfo = new PasskeyCheckInfo(phone.b, phone.d, a2, PasskeyWebAuthScreen.a.a(z2), true, false, 32, null);
                com.vk.auth.main.b bVar = this.d;
                if (bVar == null) {
                    bVar = null;
                }
                bVar.I0(passkeyCheckInfo);
                return;
            }
        }
        sir0 sir0Var = sir0.a;
        LibverifyScreenData b2 = sir0.b(sir0Var, context, str, vkAuthValidatePhoneResult);
        if (b2 == null) {
            SignUpRouter signUpRouter = this.n;
            sir0.f(sir0Var, signUpRouter != null ? signUpRouter : null, null, phone, null, 10);
        } else {
            SignUpRouter signUpRouter2 = this.n;
            if (signUpRouter2 == null) {
                signUpRouter2 = null;
            }
            sir0.f(sir0Var, signUpRouter2, b2, null, null, 12);
        }
    }

    public final void B0() {
        tkx0 tkx0Var = (tkx0) this.a;
        if (tkx0Var != null) {
            Context context = this.b;
            x65.a.a(tkx0Var, context.getString(R.string.vk_white_label_auth_error_title), context.getString(R.string.vk_white_label_auth_error_subtitle), context.getString(R.string.vk_white_label_auth_error_positive_button), new b(0, this, xkx0.class, "validate", "validate()V", 0), context.getString(R.string.vk_white_label_auth_error_negative_button), new gbt0(this, 7), true, new m5o0(this, 18), null, 256);
        }
    }

    @Override // xsna.skx0
    public final void C() {
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CHOOSE_ANOTHER_ACCOUNT, null, null, null, null, null, null, 254);
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.t.b(mnh0.B(w0(vdx0Var.e().u(this.x.c, null).a0(io.reactivex.rxjava3.android.schedulers.a.b()), true), this.s, new cim0(this, 19), new eni0(20), null));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void C0() {
        if (!((Boolean) this.B.getValue()).booleanValue()) {
            z0(null, null);
            return;
        }
        mir0 mir0Var = new mir0();
        WhiteLabelAuthData whiteLabelAuthData = this.x;
        String str = whiteLabelAuthData.b;
        i0(mnh0.B(w0(mir0.a(mir0Var, new oir0(str, false, this.c.n().a(), whiteLabelAuthData.c, m0(str), l0().b(str) ? EmptyList.b : SakFeatures.Type.VKC_BACKUP_SENDING.h() ? ((hsp0) this.j.getValue()).getAll() : EmptyList.b, null, false, false, VideoRecord.DEFAULT_MAX_DIMENSION)).a0(io.reactivex.rxjava3.android.schedulers.a.b()), true), this.s, new pst0(this, 8), new hoh(1, (nir0) this.F.getValue(), nir0.class, "handleError", "handleError(Lcom/vk/superapp/core/errors/CommonApiError;)V", 0, 14), new ngl(null, null, null, new si60(this, 20), null, null, null, null, new xq70(this, 28), null, 759)));
    }

    @Override // xsna.skx0
    public final void g() {
        if (this.z != null) {
            com.vk.registration.funnels.b.a.getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SILENT_AUTH_RESUME_CLICK, null, null, null, null, null, null, 254);
            ((com.vk.whitelabelauth.di.d) this.A.getValue()).a(new qah0(this, 27));
        }
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.UNKNOWN;
    }

    @Override // xsna.p66, xsna.z55
    /* renamed from: p */
    public final void y0(tkx0 tkx0Var) {
        tkx0 tkx0Var2 = tkx0Var;
        super.y0(tkx0Var2);
        com.vk.whitelabelauth.di.d dVar = (com.vk.whitelabelauth.di.d) this.A.getValue();
        String str = this.x.c;
        i0(mnh0.B(w0(dVar.b().r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b()), true), this.s, new aqt0(3, this, (vkx0) tkx0Var2), new fvq0(this, 25), null));
    }

    public final void z0(String str, String str2) {
        sir0 sir0Var = sir0.a;
        if (str == null) {
            str = this.x.b;
        }
        i0(mnh0.B(w0(sir0.h(sir0Var, new sir0.e(str2, str, this.c.n().a(), true, true, false, false, false, ol90.a(), null, 736)), true), this.s, new l6w0(this, 4), new a(1, this, xkx0.class, "handleCommonError", "handleCommonError(Lcom/vk/superapp/core/errors/CommonApiError;)V", 0), null));
    }

    /* compiled from: WhiteLabelAuthPresenter.kt */
    public static final class c implements pir0.b {
        public c() {
        }

        @Override // xsna.pir0.b
        public final void a(String str, VkAuthValidateAccountResponse vkAuthValidateAccountResponse, boolean z) {
            nl90 nl90Var = xkx0.this.D;
            String str2 = vkAuthValidateAccountResponse.d;
            List<VkAuthValidateAccountResponse.ValidateAccountFlow> list = vkAuthValidateAccountResponse.c;
            if (j5g.a0(list) == VkAuthValidateAccountResponse.ValidateAccountFlow.PASSKEY) {
                list = j5g.S(list, 1);
            }
            nl90Var.a(str, str2, z, list);
        }

        @Override // xsna.pir0.b
        public final void b(r25 r25Var) {
            y5k0.b(xkx0.this.C, r25Var);
        }

        @Override // xsna.pir0.b
        public final void c(String str, String str2) {
            sir0 sir0Var = sir0.a;
            xkx0 xkx0Var = xkx0.this;
            xkx0Var.i0(mnh0.B(xkx0Var.w0(sir0.h(sir0Var, new sir0.e(str2, str, xkx0Var.c.n().a(), false, false, false, false, false, ol90.a(), null, 736)), true), xkx0Var.s, new q3s0(xkx0Var, 9), new yte(xkx0Var, 14), null));
        }

        @Override // xsna.pir0.b
        public final void e(String str, VkAuthValidateAccountResponse vkAuthValidateAccountResponse) {
            com.vk.registration.funnels.b.a.getClass();
            com.vk.registration.funnels.b.j();
            xkx0 xkx0Var = xkx0.this;
            xkx0Var.l0().c(str);
            hf80 hf80Var = new hf80(xkx0Var, str, vkAuthValidateAccountResponse, 4);
            VkAuthMetaInfo vkAuthMetaInfo = new VkAuthMetaInfo(null, null, null, SilentAuthSource.INTERNAL, null, null, 55, null);
            FragmentActivity fragmentActivity = xkx0Var.y;
            new k140(fragmentActivity).e();
            l55 l55Var = l55.a;
            Context applicationContext = fragmentActivity.getApplicationContext();
            String str2 = vkAuthValidateAccountResponse.h;
            Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
            VkAuthState d = VkAuthState.a.d(vkAuthValidateAccountResponse.d, str);
            l55Var.getClass();
            io.reactivex.rxjava3.internal.operators.observable.b0 w0 = xkx0Var.w0(l55.a(applicationContext, d, str2, vkAuthMetaInfo), true);
            wkx0 wkx0Var = new wkx0(hf80Var);
            wkx0Var.c = new l1k0(13, xkx0Var, new ngl(null, null, null, null, null, new tj60(new wlw0(xkx0Var, 4), 24), null, null, null, null, 991));
            w0.subscribe(wkx0Var);
        }

        @Override // xsna.pir0.b
        public final void f(String str, VkAuthValidateAccountResponse vkAuthValidateAccountResponse, boolean z, boolean z2) {
            pys pysVar = xkx0.this.E;
            String str2 = vkAuthValidateAccountResponse.d;
            String str3 = vkAuthValidateAccountResponse.h;
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
            pysVar.a.c(new FullscreenPasswordData(str, z2, str2, z, str3, false, 32, null), null);
        }

        @Override // xsna.pir0.b
        public final void g(String str, String str2) {
            xkx0.this.z0(str, str2);
        }

        @Override // xsna.pir0.b
        public final void d(String str, VkAuthValidateAccountResponse vkAuthValidateAccountResponse, List<i2q> list) {
        }
    }
}
