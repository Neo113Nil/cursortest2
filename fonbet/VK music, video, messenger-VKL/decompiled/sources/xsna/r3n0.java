package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: SuggestedItemDecoration.kt */
/* loaded from: classes4.dex */
public final class r3n0 extends RecyclerView.n {
    public final Object b;
    public final Object c;
    public final Paint d;
    public final int e;
    public final int f;

    /* compiled from: SuggestedItemDecoration.kt */
    public interface a {
        float a(int i);
    }

    /* compiled from: SuggestedItemDecoration.kt */
    public interface b {
        boolean a(int i);
    }

    public r3n0(b bVar, a aVar) {
        this.b = bVar;
        this.c = aVar;
        Paint paint = new Paint();
        this.d = paint;
        abg0 abg0Var = dhr0.t;
        this.e = abg0Var.c(R.attr.vk_ui_vkontakte_color_snippet_background);
        this.f = abg0Var.c(R.attr.vk_ui_separator_primary_alpha);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(cn70.a() * 0.5f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.r3n0$b] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, xsna.r3n0$a] */
    public final void l(Canvas canvas, View view, RecyclerView recyclerView) {
        RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(view);
        if (childViewHolder != null && this.b.a(childViewHolder.getItemViewType())) {
            float left = view.getLeft();
            float top = view.getTop();
            float right = view.getRight();
            float bottom = view.getBottom();
            float a2 = this.c.a(childViewHolder.getItemViewType());
            canvas.drawRoundRect(left, top, right, bottom, a2, a2, this.d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int i2 = this.e;
            Paint paint = this.d;
            paint.setColor(i2);
            paint.setStyle(Paint.Style.FILL);
            l(canvas, childAt, recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int i2 = this.f;
            Paint paint = this.d;
            paint.setColor(i2);
            paint.setStyle(Paint.Style.STROKE);
            l(canvas, childAt, recyclerView);
        }
    }
}
