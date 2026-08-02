package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: InnerOuterItemDecoration.kt */
/* loaded from: classes6.dex */
public final class z0x extends RecyclerView.n {
    public final int b;
    public final int c;

    public z0x(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (recyclerView.getAdapter() == null) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.b / 2;
        int i2 = this.c;
        rect.left = childAdapterPosition == 0 ? i2 : i;
        if (childAdapterPosition == r6.getItemCount() - 1) {
            i = i2;
        }
        rect.right = i;
    }
}
