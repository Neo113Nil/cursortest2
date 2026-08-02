package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: GridItemDecoration.java */
/* loaded from: classes15.dex */
public final class rfu extends RecyclerView.n {
    public final int b;
    public final int c;
    public final int d;

    public rfu(int i, int i2, int i3) {
        while (i % i2 != 0 && i > 0) {
            i--;
        }
        if (i <= 0) {
            i = 1;
            while (i % i2 != 0) {
                i++;
            }
        }
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.d;
        if (childAdapterPosition < i) {
            rect.set(0, 0, 0, 0);
            return;
        }
        int i2 = childAdapterPosition - i;
        int i3 = this.c;
        int i4 = i2 % i3;
        int i5 = this.b;
        rect.left = (i4 * i5) / i3;
        rect.right = i5 - (((i4 + 1) * i5) / i3);
        if (i2 >= i3) {
            rect.top = i5;
        }
    }
}
