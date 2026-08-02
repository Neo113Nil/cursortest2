package xsna;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AutoAssignMaxRecycledViewPool.java */
/* loaded from: classes2.dex */
public final class ve5 extends RecyclerView.u {
    public final SparseIntArray a = new SparseIntArray();
    public final int b = 15;

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void clear() {
        this.a.clear();
        super.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void putRecycledView(RecyclerView.e0 e0Var) {
        int itemViewType = e0Var.getItemViewType();
        if (this.a.get(itemViewType, -1) == -1) {
            setMaxRecycledViews(itemViewType, this.b);
        }
        super.putRecycledView(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void setMaxRecycledViews(int i, int i2) {
        this.a.put(i, i2);
        super.setMaxRecycledViews(i, i2);
    }
}
