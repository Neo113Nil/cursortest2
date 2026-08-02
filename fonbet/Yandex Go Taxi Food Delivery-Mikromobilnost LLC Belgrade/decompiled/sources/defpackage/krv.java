package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes15.dex */
public final class krv extends RecyclerView.d {
    public Paint a;
    public int b;
    public int c;

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        int i = this.c;
        x0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(this.b);
        if (findViewHolderForAdapterPosition != null) {
            View view = findViewHolderForAdapterPosition.a;
            canvas.drawLine(view.getLeft(), view.getBottom() - i, view.getRight(), view.getBottom() - i, this.a);
        }
    }
}
