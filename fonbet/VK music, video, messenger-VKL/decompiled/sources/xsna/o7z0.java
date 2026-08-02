package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class o7z0 extends RecyclerView.n {
    public final int b;
    public final int c;

    public o7z0(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (((wcz0) recyclerView.getAdapter()) == null) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.c;
        if (childAdapterPosition == 0) {
            rect.left = i;
        }
        if (childAdapterPosition == r4.c.size() - 1) {
            rect.right = i;
        } else {
            rect.right = this.b;
        }
    }
}
