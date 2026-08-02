package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.w;

/* loaded from: classes15.dex */
public final class c0t0 extends w {
    public final mqu p;
    public final kk11 q;

    public c0t0(Context context, mqu mquVar, kk11 kk11Var) {
        super(context);
        this.p = mquVar;
        this.q = kk11Var;
    }

    @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.RecyclerView.j
    public final void g() {
        super.g();
        mqu mquVar = this.p;
        if (mquVar != null) {
            mquVar.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.RecyclerView.j
    public final void h(View view, RecyclerView.k kVar, t0 t0Var) {
        kk11 kk11Var = this.q;
        int intValue = kk11Var != null ? ((Number) kk11Var.invoke(view)).intValue() : 0;
        int k = k(-1, view);
        int l = l(-1, view);
        int n = n((int) Math.sqrt((l * l) + (k * k)));
        if (n > 0) {
            t0Var.b(-k, (-l) - intValue, n, this.i);
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final int p() {
        return -1;
    }

    @Override // androidx.recyclerview.widget.w
    public final int q() {
        return -1;
    }
}
