package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes14.dex */
public final class bgh extends RecyclerView.d {
    public final int a;
    public final int b;
    public final int c;

    public bgh(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int i;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        boolean n = xw31.n(recyclerView.getContext());
        int i2 = this.b;
        if (childAdapterPosition == 0) {
            i = this.a;
            if (!n) {
                i = i2;
                i2 = i;
            }
        } else {
            i = i2;
        }
        if (childAdapterPosition == itemCount - 1) {
            int i3 = this.c;
            if (n) {
                i2 = i3;
            } else {
                i = i3;
            }
        }
        rect.set(i2, 0, i, 0);
    }
}
