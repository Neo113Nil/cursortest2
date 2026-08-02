package defpackage;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes11.dex */
public final class gc60 extends RecyclerView.h {
    public final SparseIntArray d = new SparseIntArray();

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void a() {
        this.d.clear();
        super.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void d(x0 x0Var) {
        int i = x0Var.y;
        int size = c(i).a.size();
        int i2 = this.d.get(i, -1);
        if (i2 == -1) {
            i2 = 5;
            e(i, 5);
        }
        int i3 = size + 1;
        if (i3 > i2) {
            e(i, i3);
        }
        super.d(x0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void e(int i, int i2) {
        this.d.put(i, i2);
        super.e(i, i2);
    }
}
