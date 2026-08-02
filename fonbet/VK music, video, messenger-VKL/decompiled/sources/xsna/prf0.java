package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.s36;

/* compiled from: RegularBannerView.kt */
/* loaded from: classes6.dex */
public final class prf0 implements s36 {
    public final View a;
    public final bpn0 b = new bpn0(new os30(this, 18));
    public final bpn0 c = new bpn0(new r010(this, 26));
    public final bpn0 d = new bpn0(new qbc0(this, 6));
    public final bpn0 e = new bpn0(new t210(this, 28));
    public final bpn0 f = new bpn0(new sy50(this, 24));
    public final bpn0 g = new bpn0(new bbb0(this, 9));
    public final bpn0 h = new bpn0(new b6f0(this, 1));
    public final bpn0 i = new bpn0(new kld0(this, 3));
    public final bpn0 j = new bpn0(new u210(this, 22));
    public final bpn0 k = new bpn0(new nid0(this, 2));

    public prf0(Context context) {
        this.a = LayoutInflater.from(context).inflate(R.layout.vk_native_banner_ad_redesign_v3, (ViewGroup) null);
    }

    @Override // xsna.s36
    public final s36 a(String str) {
        VkButton vkButton = (VkButton) this.b.getValue();
        if (vkButton != null) {
            vkButton.setContentDescription(str);
        }
        return this;
    }

    @Override // xsna.s36
    public final void b(Context context, float f) {
        ViewGroup.LayoutParams layoutParams;
        Resources resources = context.getResources();
        if (resources != null) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.vk_sticky_banner_size_medium);
            View view = (View) this.d.getValue();
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
            TextView textView2 = (TextView) this.e.getValue();
            if (textView2 != null) {
                textView2.setMaxLines(2);
            }
            TextView textView3 = (TextView) bpn0Var.getValue();
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        return this;
    }

    @Override // xsna.s36
    public final s36 e(String str) {
        TextView textView = (TextView) this.e.getValue();
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
        TextView textView = (TextView) this.g.getValue();
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
        bpn0 bpn0Var = this.h;
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
        View view = (View) this.j.getValue();
        if (view != null) {
            view.setVisibility(0);
        }
        bpn0 bpn0Var = this.i;
        TextView textView = (TextView) bpn0Var.getValue();
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) bpn0Var.getValue();
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        View view2 = (View) this.k.getValue();
        if (view2 != null) {
            view2.setVisibility(0);
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
        View view = (View) this.j.getValue();
        if (view != null) {
            view.setVisibility(0);
        }
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
    public final s36 l(String str) {
        return this;
    }
}
