package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class mdr extends RecyclerView.g {
    public final ibb0 a;

    public mdr(ibb0 ibb0Var) {
        this.a = ibb0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int K1;
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (K1 = linearLayoutManager.K1()) == -1) {
            return;
        }
        this.a.invoke(Integer.valueOf(K1));
    }
}
