package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.qty;

/* loaded from: classes.dex */
public final class b implements qty {
    public final RecyclerView.Adapter a;

    public b(RecyclerView.Adapter adapter) {
        this.a = adapter;
    }

    @Override // defpackage.qty
    public final void onChanged(int i, int i2, Object obj) {
        this.a.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // defpackage.qty
    public final void onInserted(int i, int i2) {
        this.a.notifyItemRangeInserted(i, i2);
    }

    @Override // defpackage.qty
    public final void onMoved(int i, int i2) {
        this.a.notifyItemMoved(i, i2);
    }

    @Override // defpackage.qty
    public final void onRemoved(int i, int i2) {
        this.a.notifyItemRangeRemoved(i, i2);
    }
}
