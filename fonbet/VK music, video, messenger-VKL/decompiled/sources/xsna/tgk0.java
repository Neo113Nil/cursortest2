package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SpaceBeforePaymentButtonDecoration.kt */
/* loaded from: classes6.dex */
public final class tgk0 extends RecyclerView.n {
    public final int b = iah0.a(16);

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (recyclerView.findViewHolderForLayoutPosition(recyclerView.getChildAdapterPosition(view)) instanceof zb) {
            rect.top = this.b;
        }
    }
}
