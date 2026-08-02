package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class l39 extends RecyclerView.d {
    public static final int c = kp50.r(8);
    public static final int w = kp50.r(1);
    public final qa3 a;
    public final Paint b;

    public l39(qa3 qa3Var) {
        this.a = qa3Var;
        Paint paint = new Paint();
        paint.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        paint.setAlpha(14);
        this.b = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        if (f(view, recyclerView)) {
            rect.bottom = (c * 2) + w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            }
            if (f(childAt, recyclerView)) {
                int left = childAt.getLeft();
                int bottom = childAt.getBottom() + c;
                canvas.drawRect(new Rect(left, bottom, childAt.getRight(), w + bottom), this.b);
            }
            i = i2;
        }
    }

    public final boolean f(View view, RecyclerView recyclerView) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        Pair pair = null;
        if (childAdapterPosition != -1) {
            c cVar = this.a.b;
            int i = childAdapterPosition + 1;
            if (cVar.f.size() > i) {
                pair = new Pair(cVar.f.get(childAdapterPosition), cVar.f.get(i));
            }
        }
        if (pair == null) {
            return false;
        }
        Object first = pair.getFirst();
        Object second = pair.getSecond();
        return (first instanceof xm11) && (second instanceof xm11) && ((xm11) first).getType() != ((xm11) second).getType();
    }
}
