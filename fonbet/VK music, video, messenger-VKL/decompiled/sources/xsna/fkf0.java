package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RecyclerViewShadows.kt */
/* loaded from: classes3.dex */
public final class fkf0 extends RecyclerView.t {
    public final RecyclerView b;
    public final View c;
    public final View d;
    public final int e;
    public int f;

    public fkf0(RecyclerView recyclerView, View view, View view2, int i) {
        this.b = recyclerView;
        this.c = view;
        this.d = view2;
        this.e = i;
        this.f = recyclerView.computeVerticalScrollOffset();
    }

    public final void l() {
        View view = this.d;
        if (view == null) {
            return;
        }
        RecyclerView recyclerView = this.b;
        view.setVisibility(recyclerView.computeVerticalScrollRange() - (recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset()) <= this.e ? 4 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int computeVerticalScrollOffset = this.b.computeVerticalScrollOffset();
        this.f = computeVerticalScrollOffset;
        View view = this.c;
        if (view != null) {
            view.setVisibility(computeVerticalScrollOffset <= this.e ? 4 : 0);
        }
        l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.f + i2;
        this.f = i3;
        View view = this.c;
        if (view != null) {
            view.setVisibility(i3 <= this.e ? 4 : 0);
        }
        l();
    }
}
