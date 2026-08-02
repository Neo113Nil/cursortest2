package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollItemDecoration.kt */
/* loaded from: classes6.dex */
public final class ofh0 extends RecyclerView.n {
    public final int b;
    public final int c;
    public final int d;

    public ofh0(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = recyclerView.getAdapter().getItemCount();
        int max = Math.max(((recyclerView.getMeasuredWidth() > 0 ? recyclerView.getMeasuredWidth() : this.b) - (this.c * itemCount)) / (itemCount + 1), 0);
        int i = max - this.d;
        if (itemCount == 1) {
            rect.left = i;
            rect.right = i;
            return;
        }
        if (childAdapterPosition == itemCount - 1) {
            rect.left = max / 2;
            rect.right = i;
        } else if (childAdapterPosition == 0) {
            rect.left = i;
            rect.right = max / 2;
        } else {
            int i2 = max / 2;
            rect.left = i2;
            rect.right = i2;
        }
    }
}
