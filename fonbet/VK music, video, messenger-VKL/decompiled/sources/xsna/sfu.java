package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: GridItemDecorator.kt */
/* loaded from: classes18.dex */
public final class sfu extends RecyclerView.n {
    public final int b;
    public final int c;
    public final int d;

    public sfu(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.b;
        int i2 = childAdapterPosition % i;
        int i3 = this.d;
        rect.left = (i2 * i3) / i;
        rect.right = i3 - (((i2 + 1) * i3) / i);
        if (childAdapterPosition >= i) {
            rect.top = this.c;
        }
    }
}
