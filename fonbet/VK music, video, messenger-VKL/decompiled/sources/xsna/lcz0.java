package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class lcz0 extends RecyclerView.n {
    public final int b;

    public lcz0(int i) {
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        m5z0 m5z0Var = (m5z0) recyclerView.getAdapter();
        if (m5z0Var == null) {
            return;
        }
        int size = m5z0Var.c.size();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.b;
        if (childAdapterPosition == 0) {
            rect.left = i;
            rect.right = i / 2;
        } else if (recyclerView.getChildAdapterPosition(view) == size - 1) {
            rect.right = i;
            rect.left = i / 2;
        } else {
            int i2 = i / 2;
            rect.right = i2;
            rect.left = i2;
        }
    }
}
