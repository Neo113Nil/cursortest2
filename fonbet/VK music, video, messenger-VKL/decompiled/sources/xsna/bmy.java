package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LastPositionItemDecoration.kt */
/* loaded from: classes4.dex */
public final class bmy extends RecyclerView.n {
    public final int b;

    public bmy(int i) {
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (recyclerView.getAdapter() != null && recyclerView.getChildAdapterPosition(view) == r4.getItemCount() - 1) {
            rect.bottom = this.b;
        }
    }
}
