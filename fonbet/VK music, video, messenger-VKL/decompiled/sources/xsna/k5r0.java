package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: UxPollsPrefetchListener.kt */
/* loaded from: classes4.dex */
public final class k5r0 extends RecyclerView.t {
    public final w5r0 b;

    public k5r0(w5r0 w5r0Var) {
        this.b = w5r0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        w5r0 w5r0Var;
        if (i != 0 || (w5r0Var = this.b) == null) {
            return;
        }
        w5r0Var.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        w5r0 w5r0Var;
        if (i2 != 0 || (w5r0Var = this.b) == null) {
            return;
        }
        w5r0Var.c();
    }
}
