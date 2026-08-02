package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: View.kt */
/* loaded from: classes7.dex */
public final class qkf0 implements Runnable {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public qkf0(RecyclerView recyclerView, int i, int i2) {
        this.b = recyclerView;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.b;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        pkf0 pkf0Var = new pkf0(this.d, recyclerView.getContext());
        pkf0Var.setTargetPosition(this.c);
        linearLayoutManager.startSmoothScroll(pkf0Var);
    }
}
