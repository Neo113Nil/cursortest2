package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vkontakte.android.R;
import xsna.s36;

/* compiled from: CompactBannerView.kt */
/* loaded from: classes6.dex */
public final class s5i implements s36 {
    public final View a;
    public final bpn0 b = new bpn0(new wqf(this, 7));
    public final bpn0 c = new bpn0(new trf(this, 9));
    public final bpn0 d = new bpn0(new pce(this, 13));
    public final bpn0 e = new bpn0(new dof(this, 11));
    public final bpn0 f = new bpn0(new b1h(this, 5));
    public final bpn0 g = new bpn0(new ncg(this, 9));
    public final bpn0 h = new bpn0(new r5i(this, 0));
    public final bpn0 i = new bpn0(new ocg(this, 7));
    public final bpn0 j = new bpn0(new x3i(this, 1));

    public s5i(Context context) {
        this.a = LayoutInflater.from(context).inflate(R.layout.vk_native_banner_ad_landscape_compact, (ViewGroup) null);
    }

    @Override // xsna.s36
    public final s36 a(String str) {
        VkSimpleButton vkSimpleButton = (VkSimpleButton) this.i.getValue();
        if (vkSimpleButton != null) {
            vkSimpleButton.setText(str);
        }
        return this;
    }

    @Override // xsna.s36
    public final void b(Context context, float f) {
        ViewGroup.LayoutParams layoutParams;
        Resources resources = context.getResources();
        if (resources != null) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.vk_sticky_banner_size_extra_small);
            View view = (View) this.j.getValue();
            if (view == null || (layoutParams = view.getLayoutParams()) == null) {
                return;
            }
            layoutParams.width = an10.b(dimensionPixelSize * f);
        }
    }

    @Override // xsna.s36
    public final String c(String str, String str2) {
        return s36.a.b(str, str2);
    }

    @Override // xsna.s36
    public final s36 d(String str) {
        bpn0 bpn0Var = this.c;
        if (str != null) {
            TextView textView = (TextView) bpn0Var.getValue();
            if (textView != null) {
                textView.setText(str);
                return this;
            }
        } else {
            TextView textView2 = (TextView) bpn0Var.getValue();
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        return this;
    }

    @Override // xsna.s36
    public final s36 e(String str) {
        TextView textView = (TextView) this.b.getValue();
        if (textView != null) {
            textView.setText(str);
        }
        return this;
    }

    @Override // xsna.jel0
    public final View f() {
        return this.a;
    }

    @Override // xsna.s36
    public final s36 g(String str) {
        TextView textView = (TextView) this.e.getValue();
        if (textView != null) {
            textView.setText(str);
        }
        return this;
    }

    @Override // xsna.s36
    public final s36 h(Context context, float f) {
        s36.a.a(this, context, f);
        return this;
    }

    @Override // xsna.s36
    public final s36 i(String str) {
        bpn0 bpn0Var = this.f;
        TextView textView = (TextView) bpn0Var.getValue();
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = (TextView) bpn0Var.getValue();
        if (textView2 != null) {
            textView2.setText(str);
        }
        return this;
    }

    @Override // xsna.s36
    public final s36 j(String str) {
        View view = (View) this.h.getValue();
        if (view != null) {
            view.setVisibility(0);
        }
        TextView textView = (TextView) this.g.getValue();
        if (textView != null) {
            textView.setText(str);
        }
        return this;
    }

    @Override // xsna.s36
    public final s36 k(String str) {
        this.a.setContentDescription(str);
        return this;
    }

    @Override // xsna.s36
    public final s36 m(String str) {
        bpn0 bpn0Var = this.d;
        TextView textView = (TextView) bpn0Var.getValue();
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = (TextView) bpn0Var.getValue();
        if (textView2 != null) {
            textView2.setText(str);
        }
        return this;
    }

    @Override // xsna.s36
    public final s36 l(String str) {
        return this;
    }
}
