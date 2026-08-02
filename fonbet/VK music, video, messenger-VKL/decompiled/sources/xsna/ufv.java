package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: HorizontalSpaceItemDecoration.kt */
/* loaded from: classes7.dex */
public final class ufv extends RecyclerView.n {
    public final int b;

    public ufv(int i) {
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (recyclerView.getChildViewHolder(view).getBindingAdapterPosition() == 0) {
            return;
        }
        rect.left = this.b;
    }
}
