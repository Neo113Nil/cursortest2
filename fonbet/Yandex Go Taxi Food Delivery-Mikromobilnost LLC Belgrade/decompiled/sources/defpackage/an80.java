package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.go.places.impl.ui.organizations.recycler.viewholders.b;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes13.dex */
public final class an80 extends RecyclerView.d {
    public final i3y a;
    public final i3y b;
    public final i3y c;
    public final i3y w;
    public final Paint x;

    public an80(Context context) {
        qd00 qd00Var = new qd00(context, 9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = a.b(lazyThreadSafetyMode, qd00Var);
        this.b = a.b(lazyThreadSafetyMode, new qd00(context, 10));
        this.c = a.b(lazyThreadSafetyMode, new qd00(context, 11));
        this.w = a.b(lazyThreadSafetyMode, new qd00(context, 12));
        i3y b = a.b(lazyThreadSafetyMode, new qd00(context, 13));
        Paint paint = new Paint();
        paint.setStrokeWidth(((Number) b.getValue()).floatValue());
        paint.setColor(qje.u(context.getTheme(), xng0.line));
        this.x = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int i;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        x0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(childAdapterPosition);
        if (childAdapterPosition > 1 && (findViewHolderForAdapterPosition instanceof com.yandex.go.places.impl.ui.organizations.recycler.viewholders.a)) {
            rect.top = f();
        }
        if (findViewHolderForAdapterPosition instanceof e760) {
            i = ((Number) this.w.getValue()).intValue();
        } else {
            boolean z = findViewHolderForAdapterPosition instanceof b;
            i3y i3yVar = this.a;
            if (z) {
                i = ((Number) i3yVar.getValue()).intValue();
            } else if (findViewHolderForAdapterPosition instanceof fp8) {
                i = ((Number) this.c.getValue()).intValue();
            } else if (findViewHolderForAdapterPosition instanceof com.yandex.go.places.impl.ui.organizations.recycler.viewholders.a) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                i = (adapter == null || adapter.getItemCount() - 1 != childAdapterPosition) ? f() : ((Number) i3yVar.getValue()).intValue();
            } else {
                i = 0;
            }
        }
        rect.bottom = i;
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
            x0 childViewHolder = recyclerView.getChildViewHolder(childAt);
            if ((recyclerView.getChildViewHolder(childAt2) instanceof com.yandex.go.places.impl.ui.organizations.recycler.viewholders.a) && (childViewHolder instanceof com.yandex.go.places.impl.ui.organizations.recycler.viewholders.a)) {
                canvas2 = canvas;
                canvas2.drawLine(f(), childAt.getBottom() + f(), childAt.getRight() - f(), childAt.getBottom() + f(), this.x);
            } else {
                canvas2 = canvas;
            }
            canvas = canvas2;
        }
    }

    public final int f() {
        return ((Number) this.b.getValue()).intValue();
    }
}
