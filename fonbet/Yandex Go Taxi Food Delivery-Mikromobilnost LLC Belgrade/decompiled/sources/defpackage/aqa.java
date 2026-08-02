package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class aqa extends RecyclerView.d {
    public final Rect a = new Rect();
    public final Paint b;
    public final float c;

    public aqa(Context context) {
        Paint paint = new Paint();
        paint.setColor(qje.t(xng0.line, context));
        paint.setStrokeWidth(tje.x(context, 0.5f));
        this.b = paint;
        this.c = tje.w(3, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        int childCount = recyclerView.getChildCount();
        if (childCount == 0) {
            return;
        }
        int i = childCount - 1;
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            float top = childAt.getTop();
            float f = this.c;
            float f2 = top + f;
            float bottom = childAt.getBottom() - f;
            RecyclerView.e layoutManager = recyclerView.getLayoutManager();
            Rect rect = this.a;
            if (layoutManager != null) {
                layoutManager.i0(childAt, rect);
            }
            float round = Math.round(childAt.getTranslationX()) + rect.right;
            canvas.drawLine(round, f2, round, bottom, this.b);
        }
    }
}
