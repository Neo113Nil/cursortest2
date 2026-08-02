package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import core.flex.ui.OrientationAwareRecyclerView;
import just.adapter.scroll.ScrollDirection;

/* loaded from: classes9.dex */
public final class g2u0 implements reu0 {
    public final f2u0 a;

    public g2u0(f2u0 f2u0Var) {
        this.a = f2u0Var;
    }

    @Override // defpackage.reu0
    public final float a(OrientationAwareRecyclerView orientationAwareRecyclerView, RecyclerView.e eVar, ydu0 ydu0Var, View view, int i, int i2, ScrollDirection scrollDirection, int i3, vdu0 vdu0Var, int i4) {
        float f;
        View view2;
        x0 findViewHolderForAdapterPosition = orientationAwareRecyclerView.findViewHolderForAdapterPosition(i);
        View view3 = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.a : null;
        int paddingTop = orientationAwareRecyclerView.getPaddingTop() + i4;
        if (view3 != null) {
            float f2 = paddingTop;
            if (view3.getY() >= f2) {
                return view3.getY() - f2;
            }
        }
        int a = ydu0Var.a(i2 + 1);
        x0 findViewHolderForAdapterPosition2 = orientationAwareRecyclerView.findViewHolderForAdapterPosition(a);
        if (findViewHolderForAdapterPosition2 != null && (view2 = findViewHolderForAdapterPosition2.a) != null) {
            f = view.getY();
            float height = (((view.getHeight() + f) + jgb1.g(view.getLayoutParams())) + (RecyclerView.e.v0(view2) + jgb1.g(view2.getLayoutParams()))) - view2.getY();
            if (height != 0.0f) {
                if (height > 0.0f) {
                    f += -height;
                }
            }
            if (f == 0.0f || !vdu0Var.b.contains(Integer.valueOf(i))) {
                if (a == -1 && ((Boolean) ydu0Var.a.invoke(Integer.valueOf(a))).booleanValue()) {
                    return f;
                }
                return 0.0f;
            }
            f2u0 f2u0Var = this.a;
            int i5 = 0;
            if (i != f2u0Var.b) {
                f2u0Var.a = 0;
            }
            f2u0Var.b = i;
            int height2 = view.getHeight();
            int bottom = view.getBottom();
            if (height2 == 0 || bottom == 0) {
                i5 = f2u0Var.a;
            } else {
                int i6 = e2u0.a[scrollDirection.ordinal()];
                if (i6 == 1) {
                    i5 = -Math.min(Math.abs((((int) view.getY()) - (bottom - height2)) - i3), height2);
                } else if (i6 == 2) {
                    i5 = Math.min(0, (((int) view.getY()) - (bottom - height2)) - i3);
                } else if (i6 == 3) {
                    i5 = f2u0Var.a;
                } else {
                    w511.b();
                }
            }
            f2u0Var.a = i5;
            return i5;
        }
        f = 0.0f;
        if (f == 0.0f) {
        }
        if (a == -1) {
        }
        return 0.0f;
    }
}
