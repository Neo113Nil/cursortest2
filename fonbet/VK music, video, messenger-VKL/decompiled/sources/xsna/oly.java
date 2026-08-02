package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.s36;

/* compiled from: LandscapeOverlayFloatingBannerView.kt */
/* loaded from: classes6.dex */
public final class oly implements s36 {
    public final View a;
    public final bpn0 b = new bpn0(new yqf(this, 29));
    public final bpn0 c = new bpn0(new vex(this, 1));
    public final bpn0 d = new bpn0(new nly(this, 0));
    public final bpn0 e = new bpn0(new bzj(this, 22));
    public final bpn0 f = new bpn0(new nuj(this, 17));
    public final bpn0 g = new bpn0(new v3n(this, 14));
    public final bpn0 h = new bpn0(new p3h(this, 29));
    public final bpn0 i = new bpn0(new nwk(this, 14));

    public oly(Context context) {
        this.a = LayoutInflater.from(context).inflate(R.layout.vk_native_banner_ad_landscape_overlay_floating, (ViewGroup) null);
    }

    @Override // xsna.s36
    public final void b(Context context, float f) {
        ViewGroup.LayoutParams layoutParams;
        Resources resources = context.getResources();
        if (resources != null) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.vk_sticky_banner_size_small);
            View view = (View) this.b.getValue();
            if (view == null || (layoutParams = view.getLayoutParams()) == null) {
                return;
            }
            layoutParams.width = an10.b(dimensionPixelSize * f);
        }
    }

    @Override // xsna.s36
    public final s36 e(String str) {
        TextView textView = (TextView) this.c.getValue();
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
        TextView textView = (TextView) this.h.getValue();
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
        bpn0 bpn0Var = this.i;
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
        View view = (View) this.f.getValue();
        if (view != null) {
            view.setVisibility(0);
        }
        bpn0 bpn0Var = this.e;
        TextView textView = (TextView) bpn0Var.getValue();
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) bpn0Var.getValue();
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        View view2 = (View) this.g.getValue();
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
        View view = (View) this.f.getValue();
        if (view != null) {
            view.setVisibility(0);
        }
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
    public final s36 a(String str) {
        return this;
    }

    @Override // xsna.s36
    public final s36 d(String str) {
        return this;
    }

    @Override // xsna.s36
    public final s36 l(String str) {
        return this;
    }

    @Override // xsna.s36
    public final String c(String str, String str2) {
        return str;
    }
}
