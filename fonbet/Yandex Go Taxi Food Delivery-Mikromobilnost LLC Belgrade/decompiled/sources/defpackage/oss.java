package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class oss extends RecyclerView.d {
    public final int a;
    public final int b;
    public final int c;
    public final int w;
    public final int x;
    public final int y;

    public oss(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.w = i4;
        this.x = i5;
        this.y = i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        recyclerView.getLayoutManager().getClass();
        int viewLayoutPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        int itemCount = recyclerView.getAdapter().getItemCount();
        int i = this.w;
        int i2 = this.c;
        if (itemCount != 1) {
            if (viewLayoutPosition != itemCount - 1) {
                boolean z = viewLayoutPosition == 0;
                boolean z2 = viewLayoutPosition == itemCount + (-2);
                r3 = z ? this.a : 0;
                i = z2 ? i2 : this.b;
            }
            i2 = r3;
        }
        rect.set(i2, this.x, i, this.y);
    }
}
