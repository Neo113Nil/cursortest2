package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public final class e0 extends w {
    public final /* synthetic */ f0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, Context context) {
        super(context);
        this.p = f0Var;
    }

    @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.RecyclerView.j
    public final void h(View view, RecyclerView.k kVar, t0 t0Var) {
        f0 f0Var = this.p;
        int[] c = f0Var.c(f0Var.a.getLayoutManager(), view);
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

    @Override // androidx.recyclerview.widget.w
    public final int o(int i) {
        return Math.min(100, super.o(i));
    }
}
