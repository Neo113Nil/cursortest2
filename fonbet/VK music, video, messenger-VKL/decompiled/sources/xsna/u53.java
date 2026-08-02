package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AppItemsAdapter.kt */
/* loaded from: classes6.dex */
public final class u53 extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (recyclerView.getChildAdapterPosition(view) != (recyclerView.getAdapter() != null ? r3.getItemCount() : 0) - 1) {
            int i = t53.f;
            rect.right = t53.i;
        }
    }
}
