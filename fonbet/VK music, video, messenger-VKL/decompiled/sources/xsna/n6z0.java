package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class n6z0 extends RecyclerView.n {
    public final int b;

    public n6z0(int i) {
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        m9y0 m9y0Var = (m9y0) recyclerView.getAdapter();
        if (m9y0Var == null) {
            return;
        }
        int size = m9y0Var.c.size();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.b;
        if (childAdapterPosition == 0) {
            rect.right = i;
        } else if (recyclerView.getChildAdapterPosition(view) == size - 1) {
            rect.left = i;
        } else {
            rect.right = i;
            rect.left = i;
        }
    }
}
