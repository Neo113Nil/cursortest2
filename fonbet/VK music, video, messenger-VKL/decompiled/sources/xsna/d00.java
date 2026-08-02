package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ActionDivider.kt */
/* loaded from: classes13.dex */
public final class d00 extends RecyclerView.n {
    public final esn b;
    public final Paint c;
    public final Rect d;

    public d00(esn esnVar) {
        this.b = esnVar;
        Paint paint = new Paint();
        this.c = paint;
        this.d = new Rect();
        paint.setColor(esnVar.c);
        paint.setAntiAlias(false);
        paint.setDither(false);
    }

    public static boolean l(RecyclerView recyclerView, View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return false;
        }
        cu cuVar = (cu) recyclerView.getAdapter();
        if (childAdapterPosition == cuVar.f.size() - 1) {
            return false;
        }
        return cuVar.f.get(childAdapterPosition).b != cuVar.f.get(childAdapterPosition + 1).b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (l(recyclerView, view)) {
            rect.bottom = this.b.a;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.onDraw(canvas, recyclerView, a0Var);
        int childCount = recyclerView.getChildCount();
        if (childCount == 0) {
            return;
        }
        int paddingLeft = recyclerView.getPaddingLeft();
        int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (l(recyclerView, childAt)) {
                int bottom = childAt.getBottom();
                esn esnVar = this.b;
                int i2 = esnVar.a / 2;
                int i3 = esnVar.b;
                int i4 = (i2 - (i3 / 2)) + bottom;
                Rect rect = this.d;
                rect.set(paddingLeft, i4, measuredWidth, i3 + i4);
                canvas.drawRect(rect, this.c);
            }
        }
    }
}
