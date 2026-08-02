package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: GridSpacingDecoration.kt */
/* loaded from: classes6.dex */
public final class hgu extends RecyclerView.n {
    public final int b = 4;
    public final int c;

    public hgu(int i) {
        this.c = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (recyclerView.getChildAdapterPosition(view) >= this.b) {
            rect.top = this.c;
        }
    }
}
