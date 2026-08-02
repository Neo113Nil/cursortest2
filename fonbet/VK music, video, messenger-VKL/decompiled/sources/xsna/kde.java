package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ClipsGridItemDecorator.kt */
/* loaded from: classes17.dex */
public final class kde extends RecyclerView.n {
    public final mmv b;
    public final int c = iah0.a(2.0f);

    public kde(mmv mmvVar) {
        this.b = mmvVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        mmv mmvVar = this.b;
        nmv c = mmvVar.N(childAdapterPosition) ? mmvVar.c(childAdapterPosition) : null;
        int spanCount = mmvVar.getSpanCount();
        if (c instanceof jde) {
            Integer a = ((jde) c).a();
            if (a != null) {
                childAdapterPosition = a.intValue();
            }
        } else if (!(c instanceof tce)) {
            return;
        }
        int i = childAdapterPosition % spanCount;
        int i2 = this.c;
        float f = spanCount;
        rect.left = an10.b((i * i2) / f);
        rect.right = i2 - an10.b(((i + 1) * i2) / f);
        if (childAdapterPosition >= spanCount) {
            rect.top = i2;
        }
    }
}
