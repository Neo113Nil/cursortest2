package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class ah11 extends RecyclerView.d {
    public final float a;
    public final int b;
    public final Paint c;

    public ah11(Context context) {
        this.a = tje.r(mrg0.go_design_m_space, context);
        this.b = (int) tje.w(12, context);
        Paint paint = new Paint();
        paint.setStrokeWidth(tje.x(context, 0.5f));
        paint.setColor(qje.u(context.getTheme(), xng0.line));
        this.c = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && childAdapterPosition == 0) {
            boolean z = view instanceof ListGroupHeaderComponent;
            int i = this.b;
            if (z) {
                rect.top = i;
            } else if (view instanceof ListItemComponent) {
                rect.bottom = i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        if (recyclerView.getChildCount() < 2) {
            return;
        }
        int childCount = recyclerView.getChildCount() - 1;
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            i++;
            View childAt2 = recyclerView.getChildAt(i);
            if ((childAt instanceof ListGroupHeaderComponent) || (childAt2 instanceof ListGroupHeaderComponent)) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(this.a, childAt.getBottom(), childAt.getRight() - this.a, childAt.getBottom(), this.c);
            }
            canvas = canvas2;
        }
    }
}
