package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: GarlandScrollListener.kt */
/* loaded from: classes4.dex */
public final class cht extends RecyclerView.t {
    public final f550 b;
    public int c;
    public int d;
    public boolean e;
    public final int f = 100;

    public cht(f550 f550Var) {
        this.b = f550Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (this.e) {
            int i3 = this.c;
            if (i < 0) {
                i = 0;
            }
            this.c = i3 + i;
            int i4 = this.d;
            if (i2 < 0) {
                i2 = 0;
            }
            this.d = i4 + i2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
    }
}
