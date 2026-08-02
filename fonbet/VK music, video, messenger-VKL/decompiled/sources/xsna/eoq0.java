package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: UserProfileContentWallViewHolder.kt */
/* loaded from: classes5.dex */
public final class eoq0 extends RecyclerView.i {
    public final /* synthetic */ foq0 a;

    public eoq0(foq0 foq0Var) {
        this.a = foq0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void e(int i, int i2) {
        if (i == 0) {
            foq0 foq0Var = this.a;
            foq0Var.w.getRecyclerView().post(new gv2(foq0Var, 16));
        }
    }
}
