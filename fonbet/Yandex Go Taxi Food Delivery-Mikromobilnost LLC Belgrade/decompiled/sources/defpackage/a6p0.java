package defpackage;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes6.dex */
public final class a6p0 implements bvo0 {
    public final View a;
    public final cq80 b;

    public a6p0(View view) {
        View O;
        this.a = view;
        View inflate = LayoutInflater.from(view.getContext()).inflate(vjh0.scooters_top_shadow_container, (ViewGroup) null, false);
        int i = k7h0.content_layout;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
        if (frameLayout == null || (O = cma1.O((i = k7h0.scroll_indicator_shadow), inflate)) == null) {
            ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            throw null;
        }
        this.b = new cq80((ConstraintLayout) inflate, frameLayout, O, 1);
        if (qje.s(xng0.themeDarkMode, view.getContext())) {
            O.setBackgroundTintList(ColorStateList.valueOf(view.getContext().getColor(mqg0.black)));
        }
    }

    @Override // defpackage.bvo0
    public final void a(boolean z) {
        cq80 cq80Var = this.b;
        View view = cq80Var.d;
        View view2 = this.a;
        view.setVisibility(view2.getVisibility() == 0 ? 0 : 8);
        if (view2.getVisibility() == 0) {
            View view3 = cq80Var.d;
            if (z) {
                cma1.b(1.0f, view3);
            } else {
                cma1.b(0.0f, view3);
            }
        }
    }
}
