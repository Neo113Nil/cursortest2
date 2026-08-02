package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: EntryPointsHolder.kt */
/* loaded from: classes4.dex */
public final class trp extends RecyclerView.n {
    public final int b = cn70.b(8);

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (childAdapterPosition == 0) {
            rect.left = 0;
            return;
        }
        int i = this.b;
        if (adapter == null || childAdapterPosition != adapter.getItemCount() - 1) {
            rect.left = i;
        } else {
            rect.left = i;
            rect.right = 0;
        }
    }
}
