package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PostDisplayItemsOffsetDecoration.kt */
/* loaded from: classes4.dex */
public class l2c0 extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        u1c0 l = l(recyclerView, view);
        if (l == null) {
            return;
        }
        int i = rect.top;
        Rect rect2 = l.j;
        rect.top = i + (rect2 == null ? 0 : rect2.top);
        rect.bottom = (rect2 == null ? 0 : rect2.bottom) + rect.bottom;
        rect.left = (rect2 == null ? 0 : rect2.left) + rect.left;
        rect.right = (rect2 != null ? rect2.left : 0) + rect.right;
    }

    public u1c0 l(RecyclerView recyclerView, View view) {
        u1c0 J0;
        Object childViewHolder = recyclerView.getChildViewHolder(view);
        w1c0 w1c0Var = childViewHolder instanceof w1c0 ? (w1c0) childViewHolder : null;
        if (w1c0Var == null || (J0 = w1c0Var.J0()) == null) {
            return null;
        }
        return J0;
    }
}
