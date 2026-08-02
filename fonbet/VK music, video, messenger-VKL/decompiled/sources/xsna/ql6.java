package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: BaseProfilesRecommendationsHolder.kt */
/* loaded from: classes4.dex */
public final class ql6 extends RecyclerView.n {
    public final int b;

    public ql6(ol6 ol6Var) {
        ol6Var.itemView.getContext();
        this.b = cn70.b(12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (recyclerView.getChildAdapterPosition(view) < (recyclerView.getAdapter() != null ? r3.getItemCount() : 0) - 1) {
            rect.right = this.b;
        }
    }
}
