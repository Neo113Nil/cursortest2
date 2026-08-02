package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AlbumDetailsGridSpacingDecoration.kt */
/* loaded from: classes4.dex */
public class ah1 extends RecyclerView.n {
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public ah1(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i3 % 3 != 0 ? i3 + (3 - (i3 % 3)) : i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view) - this.b;
        if (childAdapterPosition >= 0) {
            int i = this.c;
            if (i != 1) {
                int i2 = childAdapterPosition % i;
                int i3 = this.e;
                if (i2 == 0) {
                    rect.right = (i3 * 2) / 3;
                } else if (childAdapterPosition % i == i - 1) {
                    rect.left = (i3 * 2) / 3;
                } else {
                    rect.left = i3 / 3;
                    rect.right = i3 / 3;
                }
            }
            if (childAdapterPosition >= i) {
                rect.top = this.d;
            }
        }
    }
}
