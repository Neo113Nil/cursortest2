package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes14.dex */
public final class kc80 extends RecyclerView.d {
    public final int a;
    public final int b;
    public final int c;

    public kc80(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = (int) uh6.o(8.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        recyclerView.getChildAdapterPosition(view);
        int i = recyclerView.getChildAdapterPosition(view) + 1 < kVar.b() ? this.c : this.b;
        int i2 = this.a;
        rect.set(i2, 0, i2, i);
    }

    public kc80() {
        this(0, 0);
    }
}
