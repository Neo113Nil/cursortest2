package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: InlineCommentBackgroundDecoration.kt */
/* loaded from: classes4.dex */
public final class zzw extends RecyclerView.n implements too0 {
    public final int b;
    public final int c;
    public final float d;
    public final Paint e;
    public final RectF f;
    public final qg50 g;

    public zzw(int i) {
        int b = cn70.b(8);
        int b2 = cn70.b(16);
        float b3 = cn70.b(12);
        this.b = b;
        this.c = b2;
        this.d = b3;
        Paint paint = new Paint(1);
        paint.setColor(dhr0.t.c(R.attr.vk_ui_background_tertiary));
        paint.setStyle(Paint.Style.FILL);
        this.e = paint;
        this.f = new RectF();
        int[] iArr = p9x.a;
        qg50 qg50Var = new qg50(2);
        qg50Var.g(60);
        qg50Var.g(65);
        this.g = qg50Var;
    }

    @Override // xsna.too0
    public final void Ng() {
        this.e.setColor(dhr0.t.c(R.attr.vk_ui_background_tertiary));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(view);
        Integer num = null;
        Integer valueOf = childViewHolder == null ? null : Integer.valueOf(childViewHolder.getItemViewType());
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            qg50 qg50Var = this.g;
            if (qg50Var.a(intValue)) {
                int i = this.c;
                rect.left = i;
                rect.right = i;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition > 0) {
                    int i2 = childAdapterPosition - 1;
                    RecyclerView.Adapter adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        num = Integer.valueOf(adapter.getItemViewType(i2));
                    }
                }
                if (num == null || !qg50Var.a(num.intValue())) {
                    rect.top = this.b;
                } else if (intValue == 60) {
                    rect.top = cn70.b(4);
                }
            }
        }
    }

    public final void l(Canvas canvas, View view, View view2, float f, float f2) {
        if (view == null || view2 == null) {
            return;
        }
        float translationY = view.getTranslationY() + view.getTop();
        float f3 = this.b;
        float f4 = translationY - f3;
        float translationY2 = view2.getTranslationY() + view2.getBottom() + f3;
        RectF rectF = this.f;
        rectF.set(f, f4, f2, translationY2);
        float f5 = this.d;
        canvas.drawRoundRect(rectF, f5, f5, this.e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        Canvas canvas2;
        int i = this.c;
        float f = i;
        float width = recyclerView.getWidth() - i;
        int childCount = recyclerView.getChildCount();
        int i2 = 0;
        View view = null;
        View view2 = null;
        while (i2 < childCount) {
            View childAt = recyclerView.getChildAt(i2);
            if (childAt != null) {
                RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(childAt);
                Integer valueOf = childViewHolder == null ? null : Integer.valueOf(childViewHolder.getItemViewType());
                if (valueOf != null) {
                    if (this.g.a(valueOf.intValue())) {
                        if (view == null) {
                            view = childAt;
                        }
                        canvas2 = canvas;
                        view2 = childAt;
                    } else if (view != null) {
                        canvas2 = canvas;
                        l(canvas2, view, view2, f, width);
                        view = null;
                        view2 = null;
                    }
                    i2++;
                    canvas = canvas2;
                }
            }
            canvas2 = canvas;
            i2++;
            canvas = canvas2;
        }
        l(canvas, view, view2, f, width);
    }
}
