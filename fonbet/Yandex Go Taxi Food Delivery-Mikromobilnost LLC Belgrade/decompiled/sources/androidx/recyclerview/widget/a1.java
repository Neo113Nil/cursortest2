package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class a1 {
    public static int a(RecyclerView.k kVar, d0 d0Var, View view, View view2, RecyclerView.e eVar, boolean z) {
        if (eVar.d0() == 0 || kVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition() - ((RecyclerView.LayoutParams) view2.getLayoutParams()).getViewLayoutPosition()) + 1;
        }
        return Math.min(d0Var.l(), d0Var.b(view2) - d0Var.e(view));
    }

    public static int b(RecyclerView.k kVar, d0 d0Var, View view, View view2, RecyclerView.e eVar, boolean z, boolean z2) {
        if (eVar.d0() == 0 || kVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (kVar.b() - Math.max(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), ((RecyclerView.LayoutParams) view2.getLayoutParams()).getViewLayoutPosition())) - 1) : Math.max(0, Math.min(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), ((RecyclerView.LayoutParams) view2.getLayoutParams()).getViewLayoutPosition()));
        if (z) {
            return Math.round((max * (Math.abs(d0Var.b(view2) - d0Var.e(view)) / (Math.abs(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition() - ((RecyclerView.LayoutParams) view2.getLayoutParams()).getViewLayoutPosition()) + 1))) + (d0Var.k() - d0Var.e(view)));
        }
        return max;
    }

    public static int c(RecyclerView.k kVar, d0 d0Var, View view, View view2, RecyclerView.e eVar, boolean z) {
        if (eVar.d0() == 0 || kVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return kVar.b();
        }
        return (int) (((d0Var.b(view2) - d0Var.e(view)) / (Math.abs(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition() - ((RecyclerView.LayoutParams) view2.getLayoutParams()).getViewLayoutPosition()) + 1)) * kVar.b());
    }
}
