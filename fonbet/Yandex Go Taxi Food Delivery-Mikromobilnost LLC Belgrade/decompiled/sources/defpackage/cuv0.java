package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes14.dex */
public final class cuv0 extends RecyclerView.d {
    public final int a;
    public final int b;

    public cuv0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int b = kVar.b();
        int i = this.b;
        int i2 = this.a;
        int i3 = childAdapterPosition == 0 ? i2 : i / 2;
        if (childAdapterPosition != b - 1) {
            i2 = i / 2;
        }
        rect.set(i3, rect.top, i2, rect.bottom);
    }
}
