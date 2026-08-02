package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.money.createtransfer.people.pin.VkPayPinFragment;
import com.vk.money.pin.PinFragment;
import com.vk.pin.views.dots.PinDotsView;
import com.vk.pin.views.keyboard.PinKeyboardView;
import java.util.Iterator;

/* compiled from: PinPresenter.kt */
/* loaded from: classes3.dex */
public class jma0 implements qla0 {
    public final PinFragment b;
    public final int c;
    public final StringBuilder d = new StringBuilder();

    public jma0(PinFragment pinFragment, int i) {
        this.b = pinFragment;
        this.c = i;
    }

    @Override // xsna.qla0
    public final void C(boolean z) {
        if (z) {
            a7();
            return;
        }
        StringBuilder sb = this.d;
        if (drm0.H(sb) >= 0) {
            sb.deleteCharAt(drm0.H(sb));
        }
        PinDotsView pinDotsView = this.b.V;
        if (pinDotsView == null) {
            pinDotsView = null;
        }
        pinDotsView.b();
    }

    @Override // xsna.qla0
    public final void D() {
        ((VkPayPinFragment) this.b).mo();
    }

    @Override // xsna.gm6
    public boolean a0() {
        this.b.ko(0);
        return true;
    }

    @Override // xsna.qla0
    public final void a7() {
        this.d.setLength(0);
        PinDotsView pinDotsView = this.b.V;
        if (pinDotsView == null) {
            pinDotsView = null;
        }
        pinDotsView.a();
    }

    public io.reactivex.rxjava3.core.x<Boolean> b(String str) {
        return io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
    }

    @Override // xsna.qla0
    public final void s(String str) {
        StringBuilder sb = this.d;
        int length = sb.length();
        int i = this.c;
        if (length >= i) {
            return;
        }
        sb.append(str);
        PinFragment pinFragment = this.b;
        PinDotsView pinDotsView = pinFragment.V;
        if (pinDotsView == null) {
            pinDotsView = null;
        }
        pinDotsView.c();
        if (sb.length() == i) {
            PinKeyboardView pinKeyboardView = pinFragment.W;
            if (pinKeyboardView == null) {
                pinKeyboardView = null;
            }
            pinKeyboardView.e = true;
            Iterator it = pinKeyboardView.d.iterator();
            while (it.hasNext()) {
                ((sf6) it.next()).a.setClickable(false);
            }
            PinKeyboardView pinKeyboardView2 = pinFragment.W;
            if (pinKeyboardView2 == null) {
                pinKeyboardView2 = null;
            }
            pinKeyboardView2.setAlpha(0.4f);
            TextView textView = pinFragment.X;
            if (textView == null) {
                textView = null;
            }
            textView.setVisibility(4);
            View view = pinFragment.a0;
            (view != null ? view : null).setVisibility(0);
            ver0.b(pinFragment.getActivity(), b(sb.toString()).subscribe(new pdw(new jjx(this, 26), 14)));
        }
    }

    @Override // xsna.gm6
    public final void d() {
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
