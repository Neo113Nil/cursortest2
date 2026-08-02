package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: NewsfeedListStatisticsViewsPlugin.kt */
/* loaded from: classes4.dex */
public final class zr60 extends RecyclerView.t {
    public final /* synthetic */ bs60 b;

    public zr60(bs60 bs60Var) {
        this.b = bs60Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        bs60 bs60Var = this.b;
        ks60 ks60Var = bs60Var.o;
        if (ks60Var != null) {
            ks60Var.b();
        }
        bs60Var.d().c(recyclerView, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
    }
}
