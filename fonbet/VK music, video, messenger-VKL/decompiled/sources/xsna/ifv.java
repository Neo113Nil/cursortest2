package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: HorizontalRecyclerItem.kt */
/* loaded from: classes5.dex */
public final class ifv extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.left = iah0.a(16.0f);
        }
        if (recyclerView.getChildAdapterPosition(view) == (recyclerView.getAdapter() != null ? r4.getItemCount() : 0) - 1) {
            rect.right = iah0.a(16.0f);
        } else {
            rect.right = iah0.a(8.0f);
        }
    }
}
