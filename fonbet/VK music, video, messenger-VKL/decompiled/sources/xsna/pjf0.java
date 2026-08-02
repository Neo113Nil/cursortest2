package xsna;

import androidx.recyclerview.widget.RecyclerView;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: RecyclerViewDelegate.java */
/* loaded from: classes8.dex */
public final class pjf0 extends RecyclerView.t {
    public final /* synthetic */ me.grishka.appkit.views.a b;
    public final /* synthetic */ qjf0 c;

    public pjf0(qjf0 qjf0Var, me.grishka.appkit.views.a aVar) {
        this.c = qjf0Var;
        this.b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = -1;
                }
            }
        } else {
            i2 = 0;
        }
        if (i2 != -1) {
            this.b.onScrollStateChanged(null, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        qjf0 qjf0Var = this.c;
        int a = qjf0Var.a();
        int b = qjf0Var.b();
        UsableRecyclerView usableRecyclerView = qjf0Var.a;
        this.b.onScroll(null, a, b, usableRecyclerView.getAdapter() == null ? 0 : usableRecyclerView.getAdapter().getItemCount());
    }
}
