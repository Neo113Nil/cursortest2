package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SpaceBetweenItemDecoration.kt */
/* loaded from: classes7.dex */
public final class ugk0<Item> extends RecyclerView.n {
    public final int b;
    public final lxw0 c;
    public final mxw0 d;

    public ugk0(int i, lxw0 lxw0Var, mxw0 mxw0Var) {
        this.b = i;
        this.c = lxw0Var;
        this.d = mxw0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        lxw0 lxw0Var = this.c;
        Object a = lxw0Var.a(childAdapterPosition);
        Object a2 = lxw0Var.a(childAdapterPosition + 1);
        if (a == null || a2 == null || !this.d.a(a, a2)) {
            return;
        }
        rect.set(0, 0, 0, this.b);
    }
}
