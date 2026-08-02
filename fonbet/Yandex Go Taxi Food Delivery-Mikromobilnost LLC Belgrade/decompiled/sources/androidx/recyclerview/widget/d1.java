package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public final class d1 extends w {
    public final /* synthetic */ e1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, Context context) {
        super(context);
        this.p = e1Var;
    }

    @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.RecyclerView.j
    public final void h(View view, RecyclerView.k kVar, t0 t0Var) {
        e1 e1Var = this.p;
        RecyclerView recyclerView = e1Var.a;
        if (recyclerView == null) {
            return;
        }
        int[] c = e1Var.c(recyclerView.getLayoutManager(), view);
        int i = c[0];
        int i2 = c[1];
        int n = n(Math.max(Math.abs(i), Math.abs(i2)));
        if (n > 0) {
            t0Var.b(i, i2, n, this.i);
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final float m(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
