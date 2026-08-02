package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: BoundariesSpacesItemDecoration.java */
/* loaded from: classes3.dex */
public final class v98 extends ehk0 {
    public final int d;
    public final int e;

    public v98(int i, int i2, int i3, boolean z) {
        super(i, z);
        this.d = i2;
        this.e = i3;
    }

    @Override // xsna.ehk0, androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        boolean z = this.b;
        if (childLayoutPosition == 0) {
            int i = this.d;
            if (z) {
                rect.left = i;
                return;
            } else {
                rect.top = i;
                return;
            }
        }
        if (childLayoutPosition == recyclerView.getAdapter().getItemCount() - 1) {
            int i2 = this.e;
            if (z) {
                rect.right = i2;
            } else {
                rect.bottom = i2;
            }
        }
    }
}
