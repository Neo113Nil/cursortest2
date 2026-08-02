package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.pin.views.dots.PinDotsView;
import com.vk.pin.views.keyboard.PinKeyboardView;
import com.vk.superapp.vkpay.checkout.feature.pin.success.PinSuccessView;
import com.vkontakte.android.R;
import java.util.HashSet;

/* compiled from: CreateWalletSetPinFragment.kt */
/* loaded from: classes6.dex */
public final class bbk extends jrz<abk> implements rla0, iv5 {
    public ViewGroup k;
    public TextView l;
    public PinDotsView m;
    public TextView n;
    public PinSuccessView o;
    public boolean p;
    public final a q = new a();

    /* compiled from: CreateWalletSetPinFragment.kt */
    public static final class a implements PinKeyboardView.a {
        public a() {
        }

        @Override // com.vk.pin.views.keyboard.PinKeyboardView.a
        public final void C(boolean z) {
            abk abkVar = (abk) bbk.this.h;
            if (abkVar != null) {
                abkVar.C(z);
            }
        }

        @Override // com.vk.pin.views.keyboard.PinKeyboardView.a
        public final void s(String str) {
            abk abkVar = (abk) bbk.this.h;
            if (abkVar != null) {
                abkVar.s(str);
            }
        }
    }

    @Override // xsna.rla0
    public final void Ga() {
        PinDotsView pinDotsView = this.m;
        if (pinDotsView == null) {
            pinDotsView = null;
        }
        pinDotsView.a();
        TextView textView = this.n;
        (textView != null ? textView : null).setText("");
    }

    @Override // xsna.gi6, xsna.iv5
    public final boolean a0() {
        abk abkVar = (abk) this.h;
        boolean a0 = abkVar != null ? abkVar.a0() : true;
        this.p = !a0;
        return a0;
    }

    @Override // xsna.rla0
    public final void db() {
        PinDotsView pinDotsView = this.m;
        if (pinDotsView == null) {
            pinDotsView = null;
        }
        pinDotsView.c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FragmentActivity activity;
        super.onCreate(bundle);
        this.h = new cbk(this);
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
        View inflate = layoutInflater.inflate(R.layout.vk_pay_checkout_create_wallet_set_pin_fragment, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.root);
        this.k = viewGroup2;
        czs.a(viewGroup2);
        this.m = (PinDotsView) inflate.findViewById(R.id.vk_pay_checkout_pin_dots);
        this.n = (TextView) inflate.findViewById(R.id.vk_pay_checkout_pin_hint);
        this.l = (TextView) inflate.findViewById(R.id.vk_pay_checkout_pin_title);
        ((PinKeyboardView) inflate.findViewById(R.id.vk_pay_checkout_pin_keyboard)).setOnKeysListener(this.q);
        this.o = (PinSuccessView) inflate.findViewById(R.id.vk_pay_checkout_pin_success);
        return inflate;
    }

    @Override // xsna.gi6, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        FragmentActivity activity;
        super.onDestroyView();
        this.k = null;
        if (!this.p || (activity = getActivity()) == null) {
            return;
        }
        activity.setRequestedOrientation(-1);
    }

    @Override // xsna.rla0
    public final void z5() {
        PinDotsView pinDotsView = this.m;
        if (pinDotsView == null) {
            pinDotsView = null;
        }
        pinDotsView.b();
    }
}
