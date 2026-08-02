package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes6.dex */
public final class j051 implements g051 {
    public final bbx0 a;
    public View b;
    public View c;

    public j051(bbx0 bbx0Var) {
        this.a = bbx0Var;
    }

    @Override // defpackage.g051
    public final void B(View view) {
        this.b = view;
        this.c = view.findViewById(vfh0.wide_tariff_min_width_view);
    }

    @Override // defpackage.g051
    public final void t(elx0 elx0Var) {
        View view;
        View view2 = this.b;
        if (view2 == null || (view = this.c) == null) {
            return;
        }
        bbx0 bbx0Var = this.a;
        int i = bbx0Var.j;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintMinWidth = i;
        } else {
            view.setMinimumWidth(i);
        }
        xw31.A(!elx0Var.w ? bbx0Var.k : 0, view2);
        if (elx0Var.u || !elx0Var.w) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }
}
