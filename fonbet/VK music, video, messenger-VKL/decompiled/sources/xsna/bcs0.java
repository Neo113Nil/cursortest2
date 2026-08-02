package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: VideoCommentsInPlayerListViewDelegate.kt */
/* loaded from: classes4.dex */
public final class bcs0 extends RecyclerView.t {
    public final /* synthetic */ acs0 b;

    public bcs0(acs0 acs0Var) {
        this.b = acs0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        this.b.i.a(recyclerView, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
    }
}
