package xsna;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OnVisibleRangeChangedScrollListener.java */
/* loaded from: classes2.dex */
public abstract class vc80 extends RecyclerView.t {

    @Nullable
    public LinearLayoutManager b;
    public int c = -1;
    public int d = -1;
    public int e = -1;

    public abstract void l(int i, int i2, int i3);

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = this.b;
        if (linearLayoutManager == null) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                throw new IllegalArgumentException("Only linear layout manger supported");
            }
            linearLayoutManager = (LinearLayoutManager) layoutManager;
            this.b = linearLayoutManager;
        }
        int v = linearLayoutManager.v();
        int x = linearLayoutManager.x();
        int itemCount = linearLayoutManager.getItemCount();
        if (v == -1 || x == -1) {
            return;
        }
        if (this.c == v && this.d == x && this.e == itemCount) {
            return;
        }
        this.c = v;
        this.d = x;
        this.e = itemCount;
        l(v, x, itemCount);
    }
}
