package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class gsx extends RecyclerView.g {
    public final sls a;

    public gsx(sls slsVar) {
        this.a = slsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (i2 > 0 || !recyclerView.canScrollVertically(1)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager.K1() + linearLayoutManager.d0() >= linearLayoutManager.getItemCount()) {
                this.a.invoke();
            }
        }
    }
}
