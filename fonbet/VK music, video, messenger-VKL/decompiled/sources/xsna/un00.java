package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: MarginDecoration.kt */
/* loaded from: classes2.dex */
public final class un00 extends RecyclerView.n {
    public final Rect b;
    public final int c;

    public un00(int i, Rect rect) {
        this.b = rect;
        this.c = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        Rect rect2 = this.b;
        int i = 0;
        if (rect2.left > 0 || rect2.right > 0) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            boolean z = view.getLayoutDirection() == 0;
            rect.left = z ? rect2.left : rect2.right;
            rect.right = z ? rect2.right : rect2.left;
        }
        if (rect2.top > 0) {
            recyclerView.getChildAdapterPosition(view);
            rect.top = rect2.top;
        }
        if (rect2.bottom > 0) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (childAdapterPosition >= 0 && childAdapterPosition == itemCount - 1) {
                i = this.c;
            }
            rect.bottom = rect2.bottom + i;
        }
    }
}
