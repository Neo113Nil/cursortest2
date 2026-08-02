package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public abstract class g4b1 {
    public static ras0 a(Context context) {
        return new ras0(context);
    }

    public static final void b(xn4 xn4Var, wn4 wn4Var) {
        String str = wn4Var.b;
        String str2 = wn4Var.a;
        boolean z = true;
        boolean z2 = str2 == null || evu0.J(str2);
        if (str != null && !evu0.J(str)) {
            z = false;
        }
        if (z2 && z) {
            xn4Var.getView().setVisibility(8);
            return;
        }
        xn4Var.getView().setVisibility(0);
        if (z2) {
            xn4Var.getDiscountBadgeTextView().setVisibility(8);
        } else {
            xn4Var.getDiscountBadgeTextView().setVisibility(0);
            xn4Var.getDiscountBadgeTextView().setText(str2);
        }
        if (z) {
            xn4Var.getPlusPointsBadgeContainer().setVisibility(8);
        } else {
            xn4Var.getPlusPointsBadgeContainer().setVisibility(0);
            xn4Var.getPlusPointsBadgeTextView().setText(str);
        }
    }

    public static void c(View view, ViewGroup viewGroup) {
        a6p0 a6p0Var = new a6p0(view);
        new avo0(viewGroup, a6p0Var);
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int indexOfChild = viewGroup2.indexOfChild(view);
        viewGroup2.removeView(view);
        cq80 cq80Var = a6p0Var.b;
        cq80Var.c.addView(view);
        viewGroup2.addView(cq80Var.b, indexOfChild, layoutParams);
    }
}
