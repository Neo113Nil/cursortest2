package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.pin.views.dots.PinDotsView;
import com.vk.pin.views.keyboard.PinKeyboardView;
import com.vk.superapp.ui.VkTextFieldView;
import com.vk.superapp.vkpay.checkout.feature.pin.success.PinSuccessView;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.bbv0;

/* compiled from: PinRestoreFragment.kt */
/* loaded from: classes6.dex */
public final class mma0 extends jrz<lma0> implements rla0, iv5 {
    public ViewGroup k;
    public ViewGroup l;
    public ViewGroup m;
    public VkTextFieldView n;
    public TextView o;
    public TextView p;
    public TextView q;
    public PinDotsView r;
    public TextView s;
    public ViewGroup t;
    public PinSuccessView u;
    public final a v = new a();

    /* compiled from: PinRestoreFragment.kt */
    public static final class a implements PinKeyboardView.a {
        public a() {
        }

        @Override // com.vk.pin.views.keyboard.PinKeyboardView.a
        public final void C(boolean z) {
            lma0 lma0Var = (lma0) mma0.this.h;
            if (lma0Var != null) {
                lma0Var.C(z);
            }
        }

        @Override // com.vk.pin.views.keyboard.PinKeyboardView.a
        public final void s(String str) {
            lma0 lma0Var = (lma0) mma0.this.h;
            if (lma0Var != null) {
                lma0Var.s(str);
            }
        }
    }

    @Override // xsna.rla0
    public final void Ga() {
        PinDotsView pinDotsView = this.r;
        if (pinDotsView == null) {
            pinDotsView = null;
        }
        pinDotsView.a();
        TextView textView = this.s;
        (textView != null ? textView : null).setVisibility(4);
    }

    @Override // xsna.gi6, xsna.iv5
    public final boolean a0() {
        lma0 lma0Var = (lma0) this.h;
        if (lma0Var != null) {
            return lma0Var.a0();
        }
        return true;
    }

    @Override // xsna.rla0
    public final void db() {
        PinDotsView pinDotsView = this.r;
        if (pinDotsView == null) {
            pinDotsView = null;
        }
        pinDotsView.c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FragmentActivity activity;
        super.onCreate(bundle);
        bbv0.g.getClass();
        this.h = new nma0(this, bbv0.a.f().d, new ahn());
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        if (fnj.b(requireContext) || (activity = getActivity()) == null) {
            return;
        }
        activity.setRequestedOrientation(1);
    }

    @Override // xsna.jrz, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.vk_pay_checkout_pin_restore_fragment, viewGroup, false);
        FrameLayout frameLayout = this.i;
        if (frameLayout == null) {
            frameLayout = null;
        }
        czs.a(frameLayout);
        this.k = (ViewGroup) inflate.findViewById(R.id.vk_pay_checkout_ll_code_request);
        this.l = (ViewGroup) inflate.findViewById(R.id.vk_pay_checkout_ll_code_input);
        this.m = (ViewGroup) inflate.findViewById(R.id.vk_pay_checkout_ll_pin);
        this.t = (ViewGroup) inflate.findViewById(R.id.root);
        VkTextFieldView vkTextFieldView = (VkTextFieldView) inflate.findViewById(R.id.vk_pay_checkout_code_input);
        oa01.a(vkTextFieldView.c, new rxz(this, 12));
        this.n = vkTextFieldView;
        this.o = (TextView) inflate.findViewById(R.id.vk_pay_checkout_timer);
        TextView textView = (TextView) inflate.findViewById(R.id.vk_pay_checkout_resend_code);
        textView.setOnClickListener(new c98(this, 9));
        this.p = textView;
        this.q = (TextView) inflate.findViewById(R.id.vk_pay_checkout_new_pin_title);
        this.r = (PinDotsView) inflate.findViewById(R.id.vk_pay_checkout_pin_dots);
        this.s = (TextView) inflate.findViewById(R.id.vk_pay_checkout_restore_hint);
        ((PinKeyboardView) inflate.findViewById(R.id.vk_pay_checkout_pin_keyboard)).setOnKeysListener(this.v);
        this.u = (PinSuccessView) inflate.findViewById(R.id.vk_pay_checkout_pin_success);
        TextView textView2 = (TextView) inflate.findViewById(R.id.vk_pay_checkout_restore_sms_send_text);
        Context context = inflate.getContext();
        bbv0.g.getClass();
        String qb = bbv0.a.f().b.c.qb();
        if (qb == null) {
            qb = "";
        }
        textView2.setText(context.getString(R.string.vk_pay_checkout_restore_text, ((Object) drm0.f0(qb, new k9x(0, 1, 1))) + " *** *** ** " + ((Object) drm0.f0(qb, swe0.q(qb.length() - 2, qb.length())))));
        ((Button) inflate.findViewById(R.id.vk_pay_checkout_restore_button)).setOnClickListener(new rbe(this, 5));
        return inflate;
    }

    @Override // xsna.gi6, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(-1);
        }
    }

    public final void wn() {
        VkTextFieldView vkTextFieldView = this.n;
        if (vkTextFieldView == null) {
            vkTextFieldView = null;
        }
        vkTextFieldView.setEnabled(true);
        VkTextFieldView vkTextFieldView2 = this.n;
        mhy.j((vkTextFieldView2 != null ? vkTextFieldView2 : null).getKeyboardTargetView());
    }

    public final void xn(int i) {
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        Toast.makeText(mo2getContext, i, 0).show();
    }

    public final void yn() {
        TextView textView = this.o;
        if (textView == null) {
            textView = null;
        }
        f4m.j(textView);
        TextView textView2 = this.p;
        d3m.c(textView2 == null ? null : textView2, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.rla0
    public final void z5() {
        PinDotsView pinDotsView = this.r;
        if (pinDotsView == null) {
            pinDotsView = null;
        }
        pinDotsView.b();
    }
}
