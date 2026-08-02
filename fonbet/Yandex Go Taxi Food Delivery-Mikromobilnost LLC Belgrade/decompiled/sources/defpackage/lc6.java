package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes14.dex */
public final class lc6 extends RecyclerView.d {
    public final Paint a = new Paint();

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            if (recyclerView.getChildAt(i) == null) {
                ny61.s();
                return;
            } else {
                canvas.drawLine(0.0f, r0.getBottom(), r0.getRight(), r0.getBottom(), this.a);
                i = i2;
            }
        }
    }
}
