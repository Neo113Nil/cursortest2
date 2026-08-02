package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ItemMarginDecoration.kt */
/* loaded from: classes6.dex */
public final class xux extends RecyclerView.n {
    public final int b;

    public xux(int i) {
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || recyclerView.getChildAdapterPosition(view) == a0Var.b() - 1) {
            return;
        }
        int i = linearLayoutManager.b;
        int i2 = this.b;
        if (i == 1) {
            rect.bottom = i2;
        } else {
            rect.right = i2;
        }
    }
}
