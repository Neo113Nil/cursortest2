package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.verification.base.ui.VkCheckEditText;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.R;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.gm50;
import xsna.mk50;

/* compiled from: RelatedUserPinInputFragment.kt */
/* loaded from: classes6.dex */
public final class osf0 extends tl50<nsf0, usf0, msf0> implements arf0 {
    public static final /* synthetic */ int q1 = 0;
    public rsf0 i1;
    public boolean m1;
    public VkCheckEditText o1;
    public final bpn0 j1 = new bpn0(new x850(this, 22));
    public final bpn0 k1 = new bpn0(new odc0(this, 9));
    public final bpn0 l1 = new bpn0(new wf40(this, 21));
    public final bpn0 n1 = new bpn0(new lo10(this, 28));
    public final Bundle p1 = new Bundle();

    /* compiled from: RelatedUserPinInputFragment.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<msf0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(msf0 msf0Var) {
            ((nsf0) this.receiver).C(msf0Var);
            return s3q0.a;
        }
    }

    public osf0() {
        this.p0 = Integer.valueOf(R.drawable.vk_ecosystem_switcher_background);
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.f(SchemeStatSak$EventScreen.NOWHERE, SchemeStatSak$EventScreen.PINCODE_VALIDATION_ENTER, null, false, null, null, 60);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = e3m.b(requireContext()).inflate(R.layout.vk_related_user_pin_code_input_bottom_sheet, (ViewGroup) null, false);
        inflate.setClipToOutline(true);
        inflate.setOutlineProvider(new t0w0(6, this.A, false, false));
        this.i1 = new rsf0(this, inflate, new a(1, getFeature(), nsf0.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0));
        this.o1 = (VkCheckEditText) inflate.findViewById(R.id.related_user_pin_input);
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        usf0 usf0Var = (usf0) ao50Var;
        rsf0 rsf0Var = this.i1;
        if (rsf0Var == null) {
            rsf0Var = null;
        }
        rsf0Var.getClass();
        gm50.a.b(rsf0Var, usf0Var.a, new k170(rsf0Var, 19));
        rsf0 rsf0Var2 = this.i1;
        rsf0 rsf0Var3 = rsf0Var2 != null ? rsf0Var2 : null;
        rsf0Var3.a().postDelayed(new xq3(rsf0Var3, 12), 150L);
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((nsf0) vk50Var).g.a(new yo20(1, this, osf0.class, "dispatchSideEffect", "dispatchSideEffect(Lcom/vk/superapp/multiaccount/impl/related/pin/RelatedUserPinInputSideEffects;)V", 0, 6), this);
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

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        getParentFragmentManager().k0(this.p1, "related_pin_code_request_key");
        rsf0 rsf0Var = this.i1;
        if (rsf0Var == null) {
            rsf0Var = null;
        }
        osf0 osf0Var = rsf0Var.b;
        FragmentActivity activity = osf0Var.getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(-1);
        }
        Context mo2getContext = osf0Var.mo2getContext();
        if (mo2getContext != null) {
            mhy.b(mo2getContext);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.m1) {
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.e(SchemeStatSak$EventScreen.PINCODE_VALIDATION_ENTER, null, 6);
        }
        this.m1 = true;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        if (!isRemoving()) {
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.m(SchemeStatSak$EventScreen.PINCODE_VALIDATION_ENTER, false);
            frf0.j(SchemeStatSak$TypeRegistrationItem.EventType.SCREEN_BLUR, null, null, null, null, 248);
            RegistrationElementsTracker.b.clear();
        }
        super.onStop();
    }

    @Override // xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.PINCODE_VALIDATION_ENTER;
    }

    @Override // xsna.dw20, androidx.fragment.app.d
    public final int vn() {
        return R.style.VkFastLoginBottomSheetTheme;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new nsf0((u240) this.l1.getValue());
    }
}
