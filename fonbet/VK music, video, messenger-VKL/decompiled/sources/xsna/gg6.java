package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: BaseListDataSet.kt */
/* loaded from: classes3.dex */
public final class gg6 extends RecyclerView.i {
    public final /* synthetic */ zoj0 a;

    public gg6(zoj0 zoj0Var, fg6 fg6Var) {
        this.a = zoj0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void b() {
        this.a.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void c(int i, int i2) {
        this.a.notifyItemRangeChanged(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void d(int i, int i2, Object obj) {
        this.a.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void e(int i, int i2) {
        this.a.notifyItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void f(int i, int i2) {
        this.a.notifyItemMoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void g(int i, int i2) {
        this.a.notifyItemRangeRemoved(i, i2);
    }
}
