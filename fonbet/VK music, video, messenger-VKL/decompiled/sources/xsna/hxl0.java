package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: StoryArchiveGridSpacingItemDecoration.kt */
/* loaded from: classes3.dex */
public final class hxl0 extends RecyclerView.n {
    public static final int d = iah0.a(3);
    public final int b;
    public final int c;

    public hxl0(int i, int i2) {
        i = (i2 & 2) != 0 ? d : i;
        this.b = 3;
        int i3 = i % 3;
        this.c = i3 != 0 ? i + (3 - i3) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition < 0) {
            return;
        }
        int i = this.b;
        int i2 = childAdapterPosition % i;
        int i3 = this.c;
        if (i2 == 0) {
            rect.right = (i3 * 2) / 3;
        } else if (i2 == i - 1) {
            rect.left = (i3 * 2) / 3;
        } else {
            int i4 = i3 / 3;
            rect.left = i4;
            rect.right = i4;
        }
        rect.bottom = i3;
    }
}
