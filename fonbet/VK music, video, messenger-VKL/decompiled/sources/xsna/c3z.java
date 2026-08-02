package xsna;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.suspicious_auth.SuspiciousAuthComponent;
import com.vk.auth.verification.base.states.MethodSelectorCodeState;
import com.vk.auth.verification.base.ui.HorizontalCountDownBar;
import com.vkontakte.android.R;
import xsna.v39;

/* compiled from: LibverifyCheckMethodSelectorFragment.kt */
/* loaded from: classes15.dex */
public final class c3z extends wa6<m3z> implements t3z {
    public LibverifyScreenData.MethodSelectorAuth R;
    public ut20 S;
    public v39 T;

    @Override // xsna.t3z
    public final void D2(String str) {
        try {
            startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:+".concat(str))));
        } catch (Exception unused) {
            wa(getString(R.string.vk_otp_method_selection_verification_methods_libverify_callin_error), null, null);
        }
    }

    @Override // xsna.wa6, xsna.q0c
    public final void a9(MethodSelectorCodeState methodSelectorCodeState) {
        View view;
        super.a9(methodSelectorCodeState);
        if (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallIn) {
            v39 v39Var = this.T;
            if (v39Var != null) {
                MethodSelectorCodeState.LibverifyCallIn libverifyCallIn = (MethodSelectorCodeState.LibverifyCallIn) methodSelectorCodeState;
                v39Var.a(requireContext(), new v39.a(libverifyCallIn.b, libverifyCallIn.c, libverifyCallIn.d), false, libverifyCallIn.f);
            }
            bpn0 bpn0Var = t65.a;
            mhy.b(requireContext());
        } else {
            v39 v39Var2 = this.T;
            if (v39Var2 != null) {
                View view2 = v39Var2.e;
                if (view2 != null) {
                    f4m.j(view2);
                }
                View view3 = v39Var2.f;
                if (view3 != null) {
                    f4m.j(view3);
                }
            }
        }
        if (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMobileId) {
            ut20 ut20Var = this.S;
            if (ut20Var != null) {
                ut20Var.a(((MethodSelectorCodeState.LibverifyMobileId) methodSelectorCodeState).b);
                return;
            }
            return;
        }
        ut20 ut20Var2 = this.S;
        if (ut20Var2 == null || (view = ut20Var2.b) == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // xsna.wa6, xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.S = null;
        this.T = null;
    }

    @Override // xsna.wa6, xsna.a66, androidx.fragment.app.Fragment
    public final void onStart() {
        HorizontalCountDownBar horizontalCountDownBar;
        super.onStart();
        v39 v39Var = this.T;
        if (v39Var == null || (horizontalCountDownBar = v39Var.j) == null) {
            return;
        }
        horizontalCountDownBar.c();
    }

    @Override // xsna.wa6, xsna.a66, androidx.fragment.app.Fragment
    public final void onStop() {
        HorizontalCountDownBar horizontalCountDownBar;
        super.onStop();
        v39 v39Var = this.T;
        if (v39Var == null || (horizontalCountDownBar = v39Var.j) == null) {
            return;
        }
        ValueAnimator valueAnimator = horizontalCountDownBar.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        horizontalCountDownBar.j = null;
    }

    @Override // xsna.wa6, xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.S = new ut20((ViewStub) view.findViewById(R.id.mobile_id_stub));
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.libverify_callin_top_stub);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.libverify_callin_bottom_stub);
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        Object obj2 = obj;
        this.T = new v39(viewStub, viewStub2, new ax0(0, obj2, m3z.class, "onMakeCallClicked", "onMakeCallClicked()V", 0, 3));
        super.onViewCreated(view, bundle);
    }

    @Override // xsna.a66
    public final z55 tn(Bundle bundle) {
        VerificationMethodState verificationMethodState = this.v;
        String str = this.t;
        if (str == null) {
            str = null;
        }
        LibverifyScreenData.MethodSelectorAuth methodSelectorAuth = this.R;
        if (methodSelectorAuth == null) {
            methodSelectorAuth = null;
        }
        return new k3z(verificationMethodState, bundle, str, methodSelectorAuth, this.O, new a3z(2, this, c3z.class, "startActivityForResult", "startActivityForResult(Landroid/content/Intent;I)V", 0), ((SuspiciousAuthComponent) m7m.d(this).a(fpf0.a(SuspiciousAuthComponent.class))).c());
    }

    @Override // xsna.wa6
    public final void yn() {
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((m3z) obj).y0(this);
    }

    @Override // xsna.wa6
    public final void zn() {
        super.zn();
        Bundle requireArguments = requireArguments();
        f9t.N(requireArguments);
        this.R = requireArguments != null ? (LibverifyScreenData.MethodSelectorAuth) requireArguments.getParcelable("screenData") : null;
    }
}
