package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: SettingsItemDecoration.kt */
/* loaded from: classes16.dex */
public final class q2j0 extends RecyclerView.n implements too0 {
    public final Paint b;
    public final Rect c;

    public q2j0() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        paint.setAntiAlias(false);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(dhr0.t.c(R.attr.vk_ui_separator_primary2x));
    }

    @Override // xsna.too0
    public final void Ng() {
        this.b.setColor(dhr0.t.c(R.attr.vk_ui_separator_primary2x));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(view);
        j2j0 j2j0Var = null;
        j2j0 j2j0Var2 = childViewHolder instanceof j2j0 ? (j2j0) childViewHolder : null;
        if (j2j0Var2 != null && (((zif0) j2j0Var2.m) instanceof v8l)) {
            j2j0Var = j2j0Var2;
        }
        if (j2j0Var == null) {
            return;
        }
        rect.set(((v8l) j2j0Var.m).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        Canvas canvas2;
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(childAt);
                j2j0 j2j0Var = null;
                j2j0 j2j0Var2 = childViewHolder instanceof j2j0 ? (j2j0) childViewHolder : null;
                if (j2j0Var2 != null && (((zif0) j2j0Var2.m) instanceof v8l)) {
                    j2j0Var = j2j0Var2;
                }
                if (j2j0Var != null && ((v8l) j2j0Var.m).b) {
                    recyclerView.getDecoratedBoundsWithMargins(childAt, this.c);
                    canvas2 = canvas;
                    canvas2.drawRect(cn70.a() * 16.0f, r2.bottom - (cn70.a() * 0.5f), r2.right - (cn70.a() * 16.0f), r2.bottom, this.b);
                    i++;
                    canvas = canvas2;
                }
            }
            canvas2 = canvas;
            i++;
            canvas = canvas2;
        }
    }
}
