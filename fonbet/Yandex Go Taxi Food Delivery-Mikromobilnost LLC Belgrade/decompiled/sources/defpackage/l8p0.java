package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class l8p0 extends RecyclerView.d {
    public final int a;
    public final Paint b;

    public l8p0(int i, int i2, int i3) {
        this.a = i3;
        Paint paint = new Paint();
        paint.setStrokeWidth(i2);
        paint.setColor(i);
        this.b = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        Canvas canvas2;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int i = 0;
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount < 2) {
            return;
        }
        boolean k = xw31.k(recyclerView.getContext());
        int i2 = itemCount - 1;
        while (i < i2) {
            View childAt = recyclerView.getChildAt(i);
            float bottom = childAt.getBottom();
            float f = this.a;
            float f2 = bottom - f;
            float top = childAt.getTop() + f;
            Paint paint = this.b;
            if (k) {
                float right = childAt.getRight();
                canvas2 = canvas;
                canvas2.drawLine(right, f2, right, top, paint);
            } else {
                canvas2 = canvas;
                float left = childAt.getLeft();
                canvas2.drawLine(left, f2, left, top, paint);
            }
            i++;
            canvas = canvas2;
        }
    }
}
