package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: GoodPreviewSubgridItemDecoration.kt */
/* loaded from: classes18.dex */
public final class e7u extends RecyclerView.n {
    public final GridLayoutManager.c c;
    public final int b = 2;
    public final int d = cn70.b(10);
    public final int e = cn70.b(4);

    public e7u(GridLayoutManager.c cVar) {
        this.c = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        List<? extends hfz> list;
        hfz hfzVar;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        n5u n5uVar = adapter instanceof n5u ? (n5u) adapter : null;
        if (n5uVar == null || (list = n5uVar.h) == null || (hfzVar = (hfz) j5g.b0(childAdapterPosition, list)) == null) {
            return;
        }
        GridLayoutManager.c cVar = this.c;
        int i = this.b;
        int b = cVar.b(childAdapterPosition, i);
        if (hfzVar instanceof v6u) {
            int i2 = b % i;
            int i3 = this.d;
            if (i2 == 0) {
                rect.left = i3;
            } else if (i2 == i - 1) {
                rect.right = i3;
            }
            rect.bottom = this.e;
        }
    }
}
