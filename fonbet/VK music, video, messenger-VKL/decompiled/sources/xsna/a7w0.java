package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: VmojiCharacterItemDecorator.kt */
/* loaded from: classes7.dex */
public final class a7w0 extends RecyclerView.n {
    public final int b;
    public final int c;

    public a7w0(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int i2 = gridLayoutManager.s;
        GridLayoutManager.b bVar = (GridLayoutManager.b) view.getLayoutParams();
        if (bVar.g == 1) {
            int i3 = bVar.f;
            int i4 = this.b;
            if (i3 == 0) {
                i = 0;
            } else if (i3 == i2 - 1) {
                i = i4;
                i4 = 0;
            } else {
                i4 = this.c;
                i = i4;
            }
            rect.set(i4, 0, i, 0);
        }
    }
}
