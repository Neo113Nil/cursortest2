package xsna;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.browser.ui.menu.VkBrowserMenuFactory;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VKMenuViewDelegate.kt */
/* loaded from: classes6.dex */
public final class tdr0 {
    public final xc80 a;
    public final fvv0 b;
    public final wc80 c;
    public final ggu0 d;
    public final qxv0 e;
    public final iri0 f;
    public xfu0 g = dip.b;
    public final bpn0 h = new bpn0(new v5n0(this, 9));
    public yfu0 i;
    public yfu0 j;

    public tdr0(xc80 xc80Var, fvv0 fvv0Var, wc80 wc80Var, ggu0 ggu0Var, qxv0 qxv0Var, iri0 iri0Var) {
        this.a = xc80Var;
        this.b = fvv0Var;
        this.c = wc80Var;
        this.d = ggu0Var;
        this.e = qxv0Var;
        this.f = iri0Var;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(ViewGroup viewGroup, yfu0 yfu0Var) {
        Integer o;
        yfu0Var.setId(View.generateViewId());
        VkBrowserMenuFactory c = c();
        fvv0 fvv0Var = this.b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, c.b(fvv0Var.t()));
        ?? r5 = VkBrowserMenuFactory.i;
        layoutParams.topMargin = ((Number) r5.getValue()).intValue();
        ?? r8 = VkBrowserMenuFactory.j;
        layoutParams.leftMargin = ((Number) r8.getValue()).intValue();
        layoutParams.rightMargin = ((Number) r8.getValue()).intValue();
        int i = VkBrowserMenuFactory.a.$EnumSwitchMapping$0[c.c().ordinal()];
        boolean z = true;
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        layoutParams2 = layoutParams;
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i == 5) {
                    throw new IllegalStateException("None style doesn't need layout params");
                }
                throw new NoWhenBranchMatchedException();
            }
            layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        }
        viewGroup.addView(yfu0Var, layoutParams2);
        int id = yfu0Var.getId();
        ConstraintLayout constraintLayout = viewGroup instanceof ConstraintLayout ? (ConstraintLayout) viewGroup : null;
        if (constraintLayout != null) {
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            WebApiApplication v = fvv0Var.v();
            Integer valueOf = v != null ? Integer.valueOf(v.v) : null;
            if ((valueOf == null || valueOf.intValue() != 1) && (valueOf == null || valueOf.intValue() != 0 || (o = this.d.o()) == null || o.intValue() != 2)) {
                z = false;
            }
            int i2 = (fvv0Var.h() && z) ? 6 : 7;
            bVar.i(constraintLayout);
            bVar.l(id, 3, 0, 3, ((Number) r5.getValue()).intValue());
            bVar.l(id, i2, 0, i2, ((Number) r8.getValue()).intValue());
            bVar.b((ConstraintLayout) viewGroup);
        }
    }

    public final void b(ViewGroup viewGroup) {
        ggu0 ggu0Var = (ggu0) this.f.c;
        ImageView imageView = new ImageView(ggu0Var.b);
        imageView.setId(R.id.vk_internal_app_back_button);
        imageView.setImageResource(R.drawable.vk_icon_back_24);
        imageView.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_text_accent_themed, imageView.getContext())));
        imageView.setContentDescription(imageView.getContext().getString(R.string.vk_back));
        jjc.g(imageView, new xka0(this, 22));
        LinearLayout linearLayout = new LinearLayout(ggu0Var.b);
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int a = iah0.a(16);
        layoutParams.setMargins(a, a, a, a);
        linearLayout.addView(imageView, layoutParams);
        viewGroup.addView(linearLayout);
    }

    public final VkBrowserMenuFactory c() {
        return (VkBrowserMenuFactory) this.h.getValue();
    }

    public final void d(View view, boolean z) {
        yfu0 a;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null || !c().d() || (a = c().a(this.d.o())) == null) {
            return;
        }
        viewGroup.removeView(view);
        a(viewGroup, a);
        a.setVisibility(view.getVisibility());
        if (z) {
            this.j = a;
        } else {
            this.i = a;
        }
    }
}
