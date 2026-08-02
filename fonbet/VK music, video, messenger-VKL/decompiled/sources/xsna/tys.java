package xsna;

import android.content.Context;
import com.vk.auth.main.AuthModel;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.restore.RestoreNavValue;
import com.vk.auth.restore.RestoreReason;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.core.serialize.Serializer;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.states.VkAuthState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.sir0;
import xsna.zi6;

/* compiled from: FullscreenPasswordPresenter.kt */
/* loaded from: classes15.dex */
public final class tys extends zi6<rys> implements qys<rys> {
    public final bm01 A;
    public String B;
    public final FullscreenPasswordData y;
    public final tir0 z;

    /* compiled from: FullscreenPasswordPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((com.vk.registration.funnels.b) this.receiver).getClass();
            com.vk.registration.funnels.b.y();
            return s3q0.a;
        }
    }

    public tys(FullscreenPasswordData fullscreenPasswordData) {
        this.y = fullscreenPasswordData;
        Context context = this.b;
        AuthModel authModel = this.c;
        SignUpRouter signUpRouter = this.n;
        this.z = new tir0(context, authModel, signUpRouter == null ? null : signUpRouter);
        SignUpDataHolder signUpDataHolder = this.p;
        this.A = new bm01((signUpDataHolder != null ? signUpDataHolder : null).K);
        this.B = "";
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qys
    public final void G1(String str) {
        if (epx.f(this.B, str)) {
            return;
        }
        this.B = str;
        ((jm90) this.x.getValue()).a();
        rys rysVar = (rys) this.a;
        if (rysVar != null) {
            rysVar.H2();
        }
        rys rysVar2 = (rys) this.a;
        if (rysVar2 != null) {
            rysVar2.i3(drm0.N(this.B));
        }
    }

    @Override // xsna.qys
    public final void H1() {
        FullscreenPasswordData fullscreenPasswordData = this.y;
        if (fullscreenPasswordData == null) {
            return;
        }
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SELECT_AUTH_BY_PHONE, null, null, null, null, null, null, 254);
        String str = fullscreenPasswordData.c ? fullscreenPasswordData.b : null;
        sir0 sir0Var = sir0.a;
        sir0.e eVar = new sir0.e(fullscreenPasswordData.d, str, this.c.n().a(), true, true, false, false, false, ol90.a(), null, 736);
        sir0.d dVar = new sir0.d(null, new lwh(this, 13), null, null, 13);
        sir0Var.getClass();
        i0(mnh0.B(w0(sir0.g(eVar, dVar), true), this.s, new rlh(this, 12), new cvh(this, 9), null));
    }

    @Override // xsna.qys
    public final boolean I1() {
        return !drm0.N(this.B);
    }

    @Override // xsna.qys
    public final void J1() {
        a aVar = new a(0, com.vk.registration.funnels.b.a, com.vk.registration.funnels.b.class, "onWhiteLabelForgotPassword", "onWhiteLabelForgotPassword()V", 0);
        String a2 = this.A.a();
        if (a2 == null) {
            com.vk.auth.main.b bVar = this.d;
            if (bVar == null) {
                bVar = null;
            }
            FullscreenPasswordData fullscreenPasswordData = this.y;
            String str = fullscreenPasswordData != null ? fullscreenPasswordData.b : null;
            SignUpDataHolder signUpDataHolder = this.p;
            bVar.S0(new RestoreReason.ForgetPassword(str, (signUpDataHolder != null ? signUpDataHolder : null).o, RestoreNavValue.AUTH_SCREEN));
            return;
        }
        aVar.invoke();
        SignUpDataHolder signUpDataHolder2 = this.p;
        if (signUpDataHolder2 == null) {
            signUpDataHolder2 = null;
        }
        String str2 = signUpDataHolder2.o;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.t.b(mnh0.B(w0(vdx0Var.e().u(a2, str2).a0(io.reactivex.rxjava3.android.schedulers.a.b()), true), this.s, new ayo(this, 6), new d40(28), null));
    }

    @Override // xsna.qys
    public final void a() {
        String str;
        String str2;
        FullscreenPasswordData fullscreenPasswordData = this.y;
        if (fullscreenPasswordData == null || (str = fullscreenPasswordData.b) == null) {
            str = "";
        }
        Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
        VkAuthState b = VkAuthState.a.b(str, this.B, fullscreenPasswordData != null ? fullscreenPasswordData.d : null, false);
        Context context = this.b;
        if (fullscreenPasswordData != null && (str2 = fullscreenPasswordData.f) != null && (!drm0.N(str2))) {
            new k140(context).e();
        }
        zi6.a aVar = new zi6.a();
        String str3 = fullscreenPasswordData != null ? fullscreenPasswordData.f : null;
        SignUpDataHolder signUpDataHolder = this.p;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        VkAuthMetaInfo zb = VkAuthMetaInfo.zb(signUpDataHolder.H, SilentAuthSource.BY_LOGIN, null, null, 55);
        bhh bhhVar = new bhh(this, 20);
        l55.a.getClass();
        q0(l55.a(context, b, str3, zb), aVar, zb, bhhVar);
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.UNKNOWN;
    }

    @Override // xsna.p66, xsna.z55
    /* renamed from: p */
    public final void y0(x65 x65Var) {
        rys rysVar = (rys) x65Var;
        super.y0(rysVar);
        FullscreenPasswordData fullscreenPasswordData = this.y;
        if (fullscreenPasswordData != null) {
            rysVar.F3(fullscreenPasswordData.b, fullscreenPasswordData.c);
        } else {
            rysVar.e();
        }
        if (fullscreenPasswordData != null && fullscreenPasswordData.e) {
            rysVar.Rh();
        }
        SignUpDataHolder signUpDataHolder = this.p;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        String str = signUpDataHolder.y;
        if (str != null) {
            rysVar.G1(str);
        }
        rys rysVar2 = (rys) this.a;
        if (rysVar2 != null) {
            rysVar2.H2();
        }
        rys rysVar3 = (rys) this.a;
        if (rysVar3 != null) {
            rysVar3.i3(drm0.N(this.B));
        }
    }

    @Override // xsna.zi6
    public final void y0() {
        rys rysVar = (rys) this.a;
        if (rysVar != null) {
            rysVar.J1();
        }
    }
}
