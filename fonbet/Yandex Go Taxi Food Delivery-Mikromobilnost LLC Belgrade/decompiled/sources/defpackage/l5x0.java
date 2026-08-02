package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes15.dex */
public final class l5x0 extends RecyclerView.g {
    public final /* synthetic */ n5x0 a;

    public l5x0(n5x0 n5x0Var) {
        this.a = n5x0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        n5x0.a(this.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.getScrollState() == 0) {
            return;
        }
        n5x0.a(this.a);
    }
}
