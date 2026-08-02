package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: MarketSpacesItemDecorator.kt */
/* loaded from: classes17.dex */
public final class we10 extends RecyclerView.n {
    public final int b;
    public final int c;

    public we10(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int i = this.c;
        if (childAdapterPosition == 0) {
            rect.left = i;
            return;
        }
        int i2 = itemCount - 1;
        int i3 = this.b;
        if (childAdapterPosition != i2) {
            rect.left = i3;
        } else {
            rect.right = i;
            rect.left = i3;
        }
    }
}
