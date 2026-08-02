package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class vaz0 extends RecyclerView.n {
    public final int b;
    public final int c;

    public vaz0(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        rect.bottom = this.b;
        int i = childAdapterPosition % 2;
        int i2 = this.c;
        if (i == 0) {
            rect.right = i2;
        } else {
            rect.left = i2;
        }
    }
}
