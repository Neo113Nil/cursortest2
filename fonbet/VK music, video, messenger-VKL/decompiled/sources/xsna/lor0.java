package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vkontakte.android.R;
import xsna.s36;

/* compiled from: VerticalBannerView.kt */
/* loaded from: classes6.dex */
public final class lor0 implements s36 {
    public final View a;
    public final bpn0 b;
    public final bpn0 c;
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;
    public final bpn0 g;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j;

    /* compiled from: VerticalBannerView.kt */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver;
            lor0 lor0Var = lor0.this;
            TextView n = lor0Var.n();
            if (n != null && (viewTreeObserver = n.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            TextView n2 = lor0Var.n();
            if (n2 == null) {
                return;
            }
            int height = n2.getHeight() / n2.getLineHeight();
            TextView n3 = lor0Var.n();
            if (n3 != null) {
                n3.setLines(height);
            }
            TextView n4 = lor0Var.n();
            if (n4 != null) {
                n4.setEllipsize(TextUtils.TruncateAt.END);
            }
        }
    }

    public lor0(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.vk_native_banner_ad_vertical, (ViewGroup) null);
        this.a = inflate;
        this.b = new bpn0(new tsk0(this, 18));
        this.c = new bpn0(new wzb0(this, 27));
        this.d = new bpn0(new dei0(this, 21));
        this.e = new bpn0(new iml0(this, 12));
        this.f = new bpn0(new ofc0(this, 19));
        this.g = new bpn0(new rrn0(this, 9));
        this.h = new bpn0(new kcj0(this, 12));
        this.i = new bpn0(new l6n0(this, 9));
        this.j = new bpn0(new w2j0(this, 12));
        View findViewById = inflate.findViewById(R.id.nativeads_ad_choices_icon);
        if (findViewById != null) {
            iut0.q(findViewById, new kor0(context));
        }
    }

    @Override // xsna.s36
    public final s36 a(String str) {
        VkSimpleButton vkSimpleButton = (VkSimpleButton) this.b.getValue();
        if (vkSimpleButton != null) {
            vkSimpleButton.setText(str);
        }
        return this;
    }

    @Override // xsna.s36
    public final void b(Context context, float f) {
        Resources resources;
        ViewGroup.LayoutParams layoutParams;
        if (f >= 1.0f && (resources = context.getResources()) != null) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.vk_landscape_vertical_banner_ad_image_side);
            View view = (View) this.j.getValue();
            if (view == null || (layoutParams = view.getLayoutParams()) == null) {
                return;
            }
            layoutParams.height = an10.b(dimensionPixelSize / f);
        }
    }

    @Override // xsna.s36
    public final String c(String str, String str2) {
        return s36.a.b(str, str2);
    }

    @Override // xsna.s36
    public final s36 d(String str) {
        if (str != null) {
            TextView n = n();
            if (n != null) {
                n.setText(str);
                return this;
            }
        } else {
            TextView n2 = n();
            if (n2 != null) {
                n2.setVisibility(8);
            }
        }
        return this;
    }

    @Override // xsna.s36
    public final s36 e(String str) {
        TextView textView = (TextView) this.d.getValue();
        if (textView != null) {
            textView.setText(str);
        }
        return this;
    }

    @Override // xsna.jel0
    public final View f() {
        TextView n;
        ViewTreeObserver viewTreeObserver;
        TextView n2 = n();
        View view = this.a;
        if (n2 != null && n2.getVisibility() == 0 && (n = n()) != null && (viewTreeObserver = n.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
        return view;
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
        TextView n = n();
        if (n != null) {
            n.setVisibility(8);
        }
        ViewGroup viewGroup = (ViewGroup) this.i.getValue();
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
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
    public final s36 l(String str) {
        TextView textView = (TextView) this.h.getValue();
        if (textView != null) {
            textView.setText(str);
        }
        return this;
    }

    public final TextView n() {
        return (TextView) this.c.getValue();
    }

    @Override // xsna.s36
    public final s36 m(String str) {
        return this;
    }
}
