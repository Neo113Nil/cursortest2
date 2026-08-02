package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ContactsGroupHeaderItemDecoration.kt */
/* loaded from: classes2.dex */
public final class bbj extends vd {
    @Override // xsna.kku, androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.setEmpty();
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int i = gridLayoutManager.s;
        if (i <= 1) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int c = gridLayoutManager.x.c(childAdapterPosition);
        RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager2 = layoutManager2 instanceof GridLayoutManager ? (GridLayoutManager) layoutManager2 : null;
        if (gridLayoutManager2 != null) {
            GridLayoutManager.c cVar = gridLayoutManager2.x;
            int i2 = gridLayoutManager2.s;
            int a = cVar.a(childAdapterPosition, i2);
            int i3 = childAdapterPosition;
            while (true) {
                if (i3 < 0 || cVar.a(i3, i2) != a) {
                    break;
                }
                if (zik0.a(this.e, i3)) {
                    rect.top = ((Number) this.f.getValue()).intValue();
                    break;
                }
                i3--;
            }
        }
        if (c <= 1 || !(this.i.get(childAdapterPosition) instanceof t8j)) {
            return;
        }
        rect.right = (recyclerView.getWidth() / i) * (c - 1);
    }
}
