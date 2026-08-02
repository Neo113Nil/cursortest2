package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SelectionTabView.kt */
/* loaded from: classes6.dex */
public final class hfi0 extends GridLayoutManager.c {
    public final /* synthetic */ ifi0<Object, RecyclerView.e0> d;

    public hfi0(ifi0<Object, RecyclerView.e0> ifi0Var) {
        this.d = ifi0Var;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        ifi0<Object, RecyclerView.e0> ifi0Var = this.d;
        qm6<Object, RecyclerView.e0> adapter = ifi0Var.getAdapter();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) ifi0Var.h;
        int itemViewType = ((kim0) adapter).getItemViewType(i);
        if (itemViewType == 101 || itemViewType == 102) {
            return gridLayoutManager.s;
        }
        return 1;
    }
}
