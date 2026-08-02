package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: CatalogRoundedCardItemDecoration.kt */
/* loaded from: classes3.dex */
public final class mda extends oog0 {
    @Override // xsna.oog0
    public final void o(Canvas canvas, RecyclerView recyclerView, RecyclerView.Adapter<?> adapter) {
        int childAdapterPosition;
        View view = (View) j5g.k0(this.m);
        if (view == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) != adapter.getItemCount() - 1) {
            return;
        }
        RectF rectF = this.k;
        m(recyclerView, view, rectF, null);
        mf7 mf7Var = this.d;
        if (oog0.n(mf7Var.e0(childAdapterPosition), 4)) {
            rectF.bottom -= this.c;
        }
        int bottom = mf7Var.e0(childAdapterPosition) == 1 ? (int) rectF.bottom : (oog0.n(mf7Var.e0(childAdapterPosition), 4) || oog0.n(mf7Var.e0(childAdapterPosition), 0)) ? recyclerView.getBottom() : recyclerView.getBottom() - recyclerView.getPaddingBottom();
        int paddingLeft = recyclerView.getPaddingLeft();
        int i = (int) rectF.bottom;
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        Rect rect = this.l;
        rect.set(paddingLeft, i, width, bottom);
        rectF.set(rect);
        canvas.drawRect(rectF, this.q);
    }
}
