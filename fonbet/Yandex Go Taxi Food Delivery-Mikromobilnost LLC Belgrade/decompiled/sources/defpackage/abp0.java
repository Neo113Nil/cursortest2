package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class abp0 extends RecyclerView.d {
    public final int a;
    public final int b;

    public abp0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        bys bysVar = adapter instanceof bys ? (bys) adapter : null;
        if (bysVar == null) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = bysVar.getItemCount();
        if (childAdapterPosition == -1 || itemCount < 2 || bysVar.getItemViewType(childAdapterPosition) != this.b || childAdapterPosition >= itemCount - 2) {
            return;
        }
        rect.bottom = this.a;
    }
}
