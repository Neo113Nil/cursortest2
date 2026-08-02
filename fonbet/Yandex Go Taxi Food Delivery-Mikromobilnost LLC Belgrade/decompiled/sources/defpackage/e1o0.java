package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class e1o0 extends RecyclerView.d {
    public final int a;

    public e1o0(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (childAdapterPosition == -1 || itemCount < 2) {
            return;
        }
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int i = gridLayoutManager.c0;
        GridLayoutManager.b bVar = gridLayoutManager.h0;
        int b = bVar.b(childAdapterPosition, i) + bVar.c(childAdapterPosition);
        int i2 = this.a;
        if (b < i) {
            if (xw31.k(recyclerView.getContext())) {
                rect.right = i2;
            } else {
                rect.left = i2;
            }
        }
        if (bVar.a(childAdapterPosition, i) < bVar.a(itemCount - 1, i)) {
            rect.bottom = i2;
        }
    }
}
