package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: EvenSpacingGridItemDecoration.kt */
/* loaded from: classes5.dex */
public final class pxp extends RecyclerView.n {
    public final int b;
    public final int c;
    public final boolean d = true;

    public pxp(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int i = gridLayoutManager.s;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i2 = childAdapterPosition % i;
        if (((com.vk.sharing.core.view.k) recyclerView.getAdapter()).getItemViewType(childAdapterPosition) == 3) {
            rect.setEmpty();
            return;
        }
        int width = (recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        if (width <= 0) {
            return;
        }
        int i3 = width - (this.b * i);
        if (i3 < 0) {
            rect.setEmpty();
            return;
        }
        boolean z = this.d;
        int i4 = z ? i3 / (i + 1) : i > 1 ? i3 / (i - 1) : 0;
        if (z) {
            int i5 = i4 / 2;
            rect.left = i5;
            rect.right = i5;
        } else if (i == 1) {
            rect.left = 0;
            rect.right = 0;
        } else if (i2 == 0) {
            rect.left = 0;
            rect.right = i4 / 2;
        } else if (i2 == i - 1) {
            rect.left = i4 / 2;
            rect.right = 0;
        } else {
            int i6 = i4 / 2;
            rect.left = i6;
            rect.right = i6;
        }
        int i7 = this.c;
        if (z) {
            if (childAdapterPosition < i) {
                rect.top = i7;
            }
            rect.bottom = i7;
        } else if (childAdapterPosition >= i) {
            rect.top = i7;
        }
    }
}
