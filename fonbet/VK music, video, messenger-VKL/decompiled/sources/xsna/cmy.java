package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LastReachedScrollListener.java */
/* loaded from: classes3.dex */
public final class cmy extends RecyclerView.t {

    @NonNull
    public final LinearLayoutManager b;
    public final int c;
    public int d;

    @Nullable
    public a e;

    /* compiled from: LastReachedScrollListener.java */
    public interface a {
        void I2();
    }

    public cmy(@NonNull LinearLayoutManager linearLayoutManager, int i) {
        this.b = linearLayoutManager;
        this.c = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int x = this.b.x();
        boolean z = !recyclerView.canScrollVertically(1) && i2 > 0;
        if ((recyclerView.getAdapter().getItemCount() <= 0 || x < (recyclerView.getAdapter().getItemCount() - 1) - this.c) && !z) {
            this.d = x;
            return;
        }
        if (x != this.d || z) {
            this.d = x;
            a aVar = this.e;
            if (aVar != null) {
                aVar.I2();
            }
        }
    }
}
