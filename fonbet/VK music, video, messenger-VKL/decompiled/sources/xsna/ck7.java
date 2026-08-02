package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: BonusCatalogItemDecorator.kt */
/* loaded from: classes5.dex */
public final class ck7 extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int i = gridLayoutManager.s;
        GridLayoutManager.b bVar = (GridLayoutManager.b) view.getLayoutParams();
        if (bVar.g == 1) {
            int b = cn70.b(8);
            int b2 = cn70.b(4);
            int i2 = bVar.f;
            if (i2 == 0) {
                b2 = 0;
            } else if (i2 == i - 1) {
                b2 = b;
                b = 0;
            } else {
                b = b2;
            }
            rect.set(b, 0, b2, 0);
        }
    }
}
