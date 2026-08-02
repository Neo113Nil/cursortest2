package xsna;

import android.os.SystemClock;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ClipsGridScrollListener.kt */
/* loaded from: classes17.dex */
public final class hee extends RecyclerView.t {
    public final zoj0<?, ?> b;
    public final hd c;
    public final long d = 50;
    public long e;

    public hee(gd gdVar, hd hdVar) {
        this.b = gdVar;
        this.c = hdVar;
    }

    public final void l(LinearLayoutManager linearLayoutManager) {
        RecyclerView recyclerView;
        int x = linearLayoutManager.x();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zoj0<?, ?> zoj0Var = this.b;
        if (zoj0Var.getItemCount() - x <= 3) {
            if (elapsedRealtime - this.e > this.d || (recyclerView = zoj0Var.getRecyclerView()) == null || !(recyclerView.canScrollVertically(1) || recyclerView.canScrollVertically(-1))) {
                this.e = elapsedRealtime;
                this.c.invoke();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && i2 > 0) {
            l(linearLayoutManager);
        }
    }
}
