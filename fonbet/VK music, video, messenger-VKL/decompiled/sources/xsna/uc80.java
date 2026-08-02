package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OnVisibleRangeChangedScrollListener.kt */
/* loaded from: classes4.dex */
public abstract class uc80 extends RecyclerView.t {
    public int b;
    public int c;
    public int d;

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            throw new IllegalArgumentException("Only linear layout manger supported");
        }
        int v = linearLayoutManager.v();
        int x = linearLayoutManager.x();
        int itemCount = linearLayoutManager.getItemCount();
        if (v == -1 || x == -1) {
            return;
        }
        if (this.b == v && this.c == x && this.d == itemCount) {
            return;
        }
        this.b = v;
        this.c = x;
        this.d = itemCount;
        j9a0 j9a0Var = ((h9a0) this).e;
        md90 c = j9a0Var.g.c();
        int i3 = c.b;
        if (i3 < c.c && itemCount - x < 30) {
            uut0 uut0Var = j9a0Var.f;
            uut0Var.a(uut0Var.j.c, i3);
        }
    }
}
