package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpData;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.SwitcherLaunchMode;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.c;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gm50;
import xsna.hxo;
import xsna.mk50;
import xsna.xn50;

/* compiled from: EcosystemMultiAccountSwitcherFragment.kt */
/* loaded from: classes6.dex */
public final class txo extends tl50<mxo, uxo, hxo> implements arf0, w8i {
    public static final /* synthetic */ int q1 = 0;
    public final Object i1;
    public final Object j1;
    public final Object k1;
    public final Object l1;
    public final ixo m1;
    public SwitcherUiMode n1;
    public qxo o1;
    public final a p1;

    /* compiled from: EcosystemMultiAccountSwitcherFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<hxo, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(hxo hxoVar) {
            txo txoVar = (txo) this.receiver;
            txoVar.getClass();
            xn50.a.c(txoVar, hxoVar);
            return s3q0.a;
        }
    }

    /* compiled from: EcosystemMultiAccountSwitcherFragment.kt */
    public static final /* synthetic */ class c extends AdaptedFunctionReference implements izs<hxo, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(hxo hxoVar) {
            ((mxo) this.receiver).C(hxoVar);
            return s3q0.a;
        }
    }

    public txo() {
        b1j b1jVar = new b1j(this, 13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i1 = msy.a(lazyThreadSafetyMode, b1jVar);
        this.j1 = msy.a(lazyThreadSafetyMode, new bzj(this, 7));
        this.k1 = msy.a(lazyThreadSafetyMode, new nuj(this, 5));
        this.l1 = msy.a(lazyThreadSafetyMode, new v3n(this, 2));
        ixo ixoVar = ixo.b;
        this.m1 = ixoVar;
        ixoVar.getClass();
        ixoVar.a = io.reactivex.rxjava3.subjects.d.N0();
        this.p0 = Integer.valueOf(R.drawable.vk_ecosystem_switcher_background);
        this.p1 = new a();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = e3m.b(requireContext()).inflate(R.layout.vk_auth_ecosystem_multiaccount_switcher_fragment, (ViewGroup) null, false);
        inflate.setClipToOutline(true);
        inflate.setOutlineProvider(new t0w0(6, this.A, false, false));
        this.o1 = new qxo(this, inflate, new c(1, getFeature(), mxo.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0), (jzq0) this.j1.getValue());
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        uxo uxoVar = (uxo) ao50Var;
        qxo qxoVar = this.o1;
        if (qxoVar == null) {
            qxoVar = null;
        }
        qxoVar.getClass();
        gm50.a.b(qxoVar, uxoVar.a, new fgh(qxoVar, 9));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((mxo) vk50Var).o.a(new whe(1, this, txo.class, "dispatchSideEffect", "dispatchSideEffect(Lcom/vk/superapp/multiaccount/impl/ecosystemswitcher/EcosystemMultiAccountSideEffects;)V", 0, 4), this);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext != null) {
            return hnj.a(mo2getContext);
        }
        return null;
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b bVar = new b(1, this, txo.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        io.reactivex.rxjava3.subjects.d dVar = (io.reactivex.rxjava3.subjects.d) this.m1.a;
        if (dVar != null) {
            hg1.a(hg1.h(dVar, new bbw(bVar, 15)), this);
        }
        q55 q55Var = q55.a;
        q55.a(this.p1);
        getParentFragmentManager().e("related_pin_code_request_key");
        getParentFragmentManager().l0("related_pin_code_request_key", this, new qj4(this, 12));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.m1.a = null;
        q55 q55Var = q55.a;
        q55.e(this.p1);
    }

    @Override // xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        SwitcherUiMode switcherUiMode = this.n1;
        if (switcherUiMode == null) {
            switcherUiMode = null;
        }
        return switcherUiMode instanceof SwitcherUiMode.EcoplateRestricted ? SchemeStatSak$EventScreen.MULTI_ACC_SWITCHER : SchemeStatSak$EventScreen.ECOSYSTEM_NAVIGATION;
    }

    @Override // xsna.dw20, androidx.fragment.app.d
    public final int vn() {
        return R.style.VkMultiAccountSwitcherBottomSheetTheme;
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Bundle arguments = getArguments();
        MultiAccountEntryPoint multiAccountEntryPoint = arguments != null ? (MultiAccountEntryPoint) arguments.getParcelable("arg_from") : null;
        Bundle arguments2 = getArguments();
        SwitcherLaunchMode switcherLaunchMode = arguments2 != null ? (SwitcherLaunchMode) arguments2.getParcelable("arg_launch_mode") : null;
        Bundle arguments3 = getArguments();
        this.n1 = arguments3 != null ? (SwitcherUiMode) arguments3.getParcelable("arg_ui_mode") : null;
        MultiAccountComponent multiAccountComponent = (MultiAccountComponent) m7m.d(this).a(fpf0.a(MultiAccountComponent.class));
        SwitcherUiMode switcherUiMode = this.n1;
        if (switcherUiMode == null) {
            switcherUiMode = null;
        }
        i340 i340Var = (i340) multiAccountComponent.c();
        x140 x140Var = new x140(requireContext());
        mui0 J2 = ((SessionManagementComponent) m7m.d(this).a(fpf0.a(SessionManagementComponent.class))).J2();
        v140 v140Var = new v140(multiAccountEntryPoint, u5(), (mui0) this.l1.getValue(), multiAccountComponent.d());
        m200 m200Var = m200.b;
        SwitcherUiMode switcherUiMode2 = this.n1;
        if (switcherUiMode2 == null) {
            switcherUiMode2 = null;
        }
        wxo l = m200Var.l(switcherUiMode2, multiAccountComponent.d(), multiAccountComponent.c(), c.a.a);
        SwitcherUiMode switcherUiMode3 = this.n1;
        return new mxo(switcherUiMode, i340Var, x140Var, J2, v140Var, l, new bon0(switcherUiMode3 != null ? switcherUiMode3 : null, switcherLaunchMode), switcherLaunchMode, (jzq0) this.j1.getValue());
    }

    /* compiled from: EcosystemMultiAccountSwitcherFragment.kt */
    public static final class a implements s25 {
        public a() {
        }

        @Override // xsna.s25
        public final void n(AuthResult authResult) {
            int i = txo.q1;
            txo txoVar = txo.this;
            if (txoVar.n) {
                hxo.b bVar = hxo.b.b;
                txoVar.getClass();
                xn50.a.c(txoVar, bVar);
            }
        }

        @Override // xsna.s25
        public final void A() {
        }

        @Override // xsna.s25
        public final void m() {
        }

        @Override // xsna.s25
        public final void o() {
        }

        @Override // xsna.s25
        public final void p() {
        }

        @Override // xsna.s25
        public final void t() {
        }

        @Override // xsna.s25
        public final void u() {
        }

        @Override // xsna.s25
        public final void b(String str) {
        }

        @Override // xsna.s25
        public final void h(VkPhoneValidationCompleteResult vkPhoneValidationCompleteResult) {
        }

        @Override // xsna.s25
        @ozl
        public final void l(jq0 jq0Var) {
        }

        @Override // xsna.s25
        public final void r(t6v0 t6v0Var) {
        }

        @Override // xsna.s25
        public final void v(VkPhoneValidationErrorReason vkPhoneValidationErrorReason) {
        }

        @Override // xsna.s25
        public final void j(long j, SignUpData signUpData) {
        }
    }
}
