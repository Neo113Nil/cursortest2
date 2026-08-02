package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: InterestingStoriesSpacerDecoration.kt */
/* loaded from: classes6.dex */
public final class cfx extends RecyclerView.n {
    public final int b;
    public final int c;

    public cfx() {
        int a = iah0.a(16);
        int a2 = iah0.a(8);
        this.b = a;
        this.c = a2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int b = a0Var.b();
        if (childAdapterPosition == -1 || b == 0) {
            return;
        }
        int i = this.b;
        rect.left = childAdapterPosition == 0 ? i : 0;
        if (childAdapterPosition != b - 1) {
            i = this.c;
        }
        rect.right = i;
    }
}
