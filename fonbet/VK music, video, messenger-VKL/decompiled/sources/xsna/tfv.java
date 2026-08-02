package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: HorizontalSpaceDecorator.kt */
/* loaded from: classes18.dex */
public final class tfv extends RecyclerView.n {
    public final int b;

    public tfv(int i) {
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            rect.left = this.b;
        }
    }
}
