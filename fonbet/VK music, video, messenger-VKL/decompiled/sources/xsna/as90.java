package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.vk.pin.views.dots.PinDotsView;
import com.vk.pin.views.keyboard.PinKeyboardView;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkOrderDescription;
import com.vk.superapp.vkpay.checkout.feature.confirmation.vkpay.WalletPayMethod;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.bbv0;

/* compiled from: PayVerificationFragment.kt */
/* loaded from: classes6.dex */
public final class as90 extends jrz<yr90> implements zr90 {
    public static final /* synthetic */ int u = 0;
    public PinDotsView k;
    public PinKeyboardView l;
    public TextView m;
    public TextView n;
    public View o;
    public TextView p;
    public TextView q;
    public TextView r;
    public final wm80 s = new wm80(this, 2);
    public final b t = new b();

    /* compiled from: PayVerificationFragment.kt */
    public interface a extends PinKeyboardView.a {
        void a();
    }

    /* compiled from: PayVerificationFragment.kt */
    public static final class b implements a {
        public b() {
        }

        @Override // com.vk.pin.views.keyboard.PinKeyboardView.a
        public final void C(boolean z) {
            yr90 yr90Var = (yr90) as90.this.h;
            if (yr90Var != null) {
                yr90Var.C(z);
            }
        }

        @Override // xsna.as90.a
        public final void a() {
            as90 as90Var = as90.this;
            yr90 yr90Var = (yr90) as90Var.h;
            if (yr90Var != null) {
                yr90Var.u0(as90Var);
            }
        }

        @Override // com.vk.pin.views.keyboard.PinKeyboardView.a
        public final void s(String str) {
            yr90 yr90Var = (yr90) as90.this.h;
            if (yr90Var != null) {
                yr90Var.s(str);
            }
        }
    }

    @Override // xsna.rla0
    public final void Ga() {
        PinDotsView pinDotsView = this.k;
        if (pinDotsView != null) {
            pinDotsView.a();
        }
    }

    @Override // xsna.zr90
    public final void Nm() {
        PinDotsView pinDotsView = this.k;
        if (pinDotsView != null) {
            pinDotsView.d();
        }
        TextView textView = this.n;
        if (textView != null) {
            textView.setText(R.string.vk_pay_checkout_wrong_pin_code);
            textView.setTextColor(krv0.m(R.attr.vk_legacy_destructive, requireContext()));
            textView.setVisibility(0);
        }
    }

    @Override // xsna.zr90
    public final void Ob() {
        PinKeyboardView pinKeyboardView = this.l;
        if (pinKeyboardView != null) {
            pinKeyboardView.e = false;
            Iterator it = pinKeyboardView.d.iterator();
            while (it.hasNext()) {
                ((sf6) it.next()).a.setClickable(true);
            }
        }
    }

    @Override // xsna.zr90
    public final void Sk(int i) {
        Toast.makeText(mo2getContext(), requireContext().getString(R.string.vk_pay_checkout_something_wrong), 0).show();
    }

    @Override // xsna.zr90
    public final void Uj(String str) {
        TextView textView = this.m;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // xsna.zr90
    public final void b8(VkOrderDescription vkOrderDescription) {
        if (!(vkOrderDescription instanceof VkOrderDescription.Description)) {
            if (!vkOrderDescription.equals(VkOrderDescription.NoDescription.b)) {
                throw new NoWhenBranchMatchedException();
            }
            TextView textView = this.q;
            if (textView != null) {
                textView.setText(requireContext().getString(R.string.vk_pay_checkout_confirm_payment));
            }
            TextView textView2 = this.r;
            if (textView2 != null) {
                f4m.j(textView2);
                return;
            }
            return;
        }
        VkOrderDescription.Description description = (VkOrderDescription.Description) vkOrderDescription;
        String str = description.c;
        TextView textView3 = this.q;
        if (textView3 != null) {
            textView3.setText(description.b);
        }
        TextView textView4 = this.r;
        if (textView4 != null) {
            textView4.setText(str);
        }
        TextView textView5 = this.r;
        if (textView5 != null) {
            awt0.v(textView5, !(str == null || str.length() == 0));
        }
    }

    @Override // xsna.rla0
    public final void db() {
        PinDotsView pinDotsView = this.k;
        if (pinDotsView != null) {
            pinDotsView.c();
        }
    }

    @Override // xsna.zr90
    public final void gd() {
        PinKeyboardView pinKeyboardView = this.l;
        if (pinKeyboardView != null) {
            pinKeyboardView.e = true;
            Iterator it = pinKeyboardView.d.iterator();
            while (it.hasNext()) {
                ((sf6) it.next()).a.setClickable(false);
            }
        }
    }

    @Override // xsna.zr90
    public final void lm() {
        TextView textView = this.n;
        if (textView != null) {
            textView.setVisibility(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("pay_method") : null;
        WalletPayMethod walletPayMethod = serializable instanceof WalletPayMethod ? (WalletPayMethod) serializable : null;
        if (walletPayMethod == null) {
            throw new IllegalArgumentException("No method selected");
        }
        bbv0.g.getClass();
        cs90 cs90Var = new cs90(this, walletPayMethod, bbv0.a.f().d);
        if (gz80.a(23)) {
            cs90Var.k = new l57(this, this);
        }
        this.h = cs90Var;
    }

    @Override // xsna.jrz, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.vk_pay_checkout_fragment_pay_verification, viewGroup, false);
        czs.a(inflate.findViewById(R.id.root));
        this.m = (TextView) inflate.findViewById(R.id.vk_pay_checkout_amount);
        PinKeyboardView pinKeyboardView = (PinKeyboardView) inflate.findViewById(R.id.vk_pay_checkout_pin_keyboard);
        pinKeyboardView.setOnKeysListener(this.t);
        this.l = pinKeyboardView;
        this.k = (PinDotsView) inflate.findViewById(R.id.vk_pay_checkout_pin_dots);
        this.o = inflate.findViewById(R.id.vk_pay_checkout_overlay);
        this.p = (TextView) inflate.findViewById(R.id.vk_pay_checkout_pin_restore_text);
        this.n = (TextView) inflate.findViewById(R.id.vk_pay_checkout_hint);
        this.q = (TextView) inflate.findViewById(R.id.vk_pay_checkout_confirm_title_primary);
        this.r = (TextView) inflate.findViewById(R.id.vk_pay_checkout_confirm_title_secondary);
        TextView textView = this.p;
        if (textView != null) {
            textView.setOnClickListener(new i1f(this, 4));
        }
        return inflate;
    }

    @Override // xsna.gi6, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(-1);
        }
    }

    @Override // xsna.zr90
    public final void pf(int i) {
        TextView textView = this.n;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(requireContext().getResources().getQuantityString(R.plurals.vk_pay_checkout_attempts_left, i, Integer.valueOf(i)));
            textView.setTextColor(krv0.m(R.attr.vk_legacy_text_secondary, requireContext()));
        }
    }

    @Override // xsna.jrz
    public final void un() {
        super.un();
        View view = this.o;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // xsna.jrz
    public final void vn() {
        super.vn();
        View view = this.o;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // xsna.rla0
    public final void z5() {
        PinDotsView pinDotsView = this.k;
        if (pinDotsView != null) {
            pinDotsView.b();
        }
    }
}
