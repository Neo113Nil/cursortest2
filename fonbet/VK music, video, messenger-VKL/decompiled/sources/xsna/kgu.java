package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: GridSpacingItemDecoration.kt */
/* loaded from: classes6.dex */
public final class kgu extends RecyclerView.n {
    public final int b;

    public kgu(int i) {
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int i = gridLayoutManager.s;
        if (gridLayoutManager.x.c(childAdapterPosition) == i) {
            rect.set(0, 0, 0, 0);
            return;
        }
        int i2 = ((GridLayoutManager.b) view.getLayoutParams()).f;
        int i3 = this.b;
        rect.left = (i2 * i3) / i;
        rect.right = i3 - (((i2 + 1) * i3) / i);
        rect.top = i3;
    }
}
