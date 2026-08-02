package xsna;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: GrowingRecycledViewPool.java */
/* loaded from: classes2.dex */
public final class rru extends RecyclerView.u {
    public final SparseIntArray a;
    public final SparseIntArray b;
    public final int c;

    public rru() {
        this(5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void clear() {
        this.a.clear();
        this.b.clear();
        super.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final RecyclerView.e0 getRecycledView(int i) {
        RecyclerView.e0 recycledView = super.getRecycledView(i);
        if (recycledView != null) {
            SparseIntArray sparseIntArray = this.a;
            int i2 = sparseIntArray.get(i, -1);
            if (i2 <= 0) {
                throw new IllegalStateException("Not expected here. The #put call must be before");
            }
            if (i2 > 0) {
                sparseIntArray.put(i, i2 - 1);
                return recycledView;
            }
        }
        return recycledView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void putRecycledView(RecyclerView.e0 e0Var) {
        int itemViewType = e0Var.getItemViewType();
        SparseIntArray sparseIntArray = this.a;
        int i = sparseIntArray.get(itemViewType, 0) + 1;
        sparseIntArray.put(itemViewType, i);
        int i2 = this.b.get(itemViewType, -1);
        if (i2 == -1) {
            i2 = this.c;
            setMaxRecycledViews(itemViewType, i2);
        }
        if (i > i2) {
            setMaxRecycledViews(itemViewType, i);
        }
        super.putRecycledView(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void setMaxRecycledViews(int i, int i2) {
        this.b.put(i, i2);
        super.setMaxRecycledViews(i, i2);
    }

    public rru(int i) {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
        this.c = i;
    }
}
