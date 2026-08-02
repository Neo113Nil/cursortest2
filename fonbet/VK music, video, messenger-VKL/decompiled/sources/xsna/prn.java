package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: DividerByIdItemDecoration.kt */
/* loaded from: classes2.dex */
public final class prn extends RecyclerView.n {
    public final int[] b;
    public final int c = iah0.a(0.5f);
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Paint h;
    public final Rect i;

    public prn(int[] iArr, Rect rect) {
        this.b = iArr;
        this.d = rect.left;
        this.e = rect.right;
        this.f = rect.top;
        this.g = rect.bottom;
        Paint paint = new Paint();
        paint.setColor(dhr0.t.c(R.attr.vk_legacy_separator_common));
        paint.setAntiAlias(false);
        paint.setDither(false);
        this.h = paint;
        this.i = new Rect();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (rl3.E(view.getId(), this.b)) {
            rect.set(0, this.c + this.f + this.g, 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.onDraw(canvas, recyclerView, a0Var);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (rl3.E(childAt.getId(), this.b)) {
                int left = recyclerView.getLeft() + this.d;
                Rect rect = this.i;
                rect.left = left;
                int top = childAt.getTop();
                int i2 = this.c;
                rect.top = (top - i2) - this.f;
                rect.right = recyclerView.getRight() - this.e;
                rect.bottom = rect.top + i2;
                canvas.drawRect(rect, this.h);
            }
        }
    }
}
