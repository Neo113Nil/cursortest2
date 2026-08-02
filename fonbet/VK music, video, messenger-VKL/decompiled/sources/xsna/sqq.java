package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FaveOffsetDecoration.kt */
/* loaded from: classes4.dex */
public final class sqq extends RecyclerView.n {
    public final int b;
    public final int c;

    public sqq(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int itemCount;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || (itemCount = adapter.getItemCount()) == 0) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition == 0) {
                    rect.top = this.b;
                }
                if (childAdapterPosition == itemCount - 1) {
                    rect.bottom = this.c;
                }
            }
        }
    }
}
