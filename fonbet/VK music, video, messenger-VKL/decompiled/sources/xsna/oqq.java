package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FaveMarketGridItemDecoration.kt */
/* loaded from: classes4.dex */
public final class oqq extends RecyclerView.n {
    public final int b = 2;
    public final int c;
    public final int d;
    public final int e;

    public oqq(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            rect.top = cn70.b(4);
            rect.bottom = cn70.b(12);
            return;
        }
        int i = childAdapterPosition % this.b;
        int i2 = this.d;
        int i3 = this.e;
        if (i == 1) {
            rect.left = i3;
            rect.right = i2 / 2;
        } else {
            rect.left = i2 / 2;
            rect.right = i3;
        }
        if (childAdapterPosition > 2) {
            rect.top = this.c;
        }
    }
}
