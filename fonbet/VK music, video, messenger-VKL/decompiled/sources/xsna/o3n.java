package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: DiscoverMediaItemDecoration.kt */
/* loaded from: classes4.dex */
public final class o3n extends RecyclerView.n implements too0 {
    public final int b;
    public final RectF c;
    public final Paint d;

    public o3n() {
        this(R.attr.vk_ui_background);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.d.setColor(krv0.l(this.b));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i = rect.bottom;
        recyclerView.getContext();
        rect.bottom = iah0.a(2) + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        float left = recyclerView.getLeft();
        float top = recyclerView.getTop();
        float right = recyclerView.getRight();
        float bottom = recyclerView.getBottom();
        RectF rectF = this.c;
        rectF.set(left, top, right, bottom);
        canvas.drawRect(rectF, this.d);
    }

    public o3n(int i) {
        this.b = i;
        this.c = new RectF();
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(krv0.l(i));
    }
}
