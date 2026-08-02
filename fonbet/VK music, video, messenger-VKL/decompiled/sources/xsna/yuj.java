package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: CornersDecoration.kt */
/* loaded from: classes4.dex */
public abstract class yuj extends RecyclerView.n implements too0 {
    public final int b = R.attr.vk_ui_background_content;
    public final int c = R.attr.vk_ui_image_border_alpha;
    public final Paint d;
    public final xso0 e;
    public final Rect f;
    public final RectF g;
    public boolean h;
    public final a i;

    /* compiled from: CornersDecoration.kt */
    public static final class a {
        public RectF a;
        public xso0 b;
        public int c;
        public int d;
        public boolean e;
        public float f;
        public float g;
        public Paint h;
    }

    public yuj(float f, float f2) {
        Paint paint = new Paint();
        this.d = paint;
        abg0 abg0Var = dhr0.t;
        xso0 xso0Var = new xso0(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, abg0Var.c(R.attr.vk_ui_background_content), abg0Var.c(R.attr.vk_ui_image_border_alpha), 2);
        this.e = xso0Var;
        this.f = new Rect();
        RectF rectF = new RectF();
        this.g = rectF;
        a aVar = new a();
        aVar.a = rectF;
        aVar.b = xso0Var;
        aVar.c = -1;
        aVar.d = 0;
        aVar.e = false;
        aVar.f = f;
        aVar.g = f2;
        aVar.h = paint;
        this.i = aVar;
        paint.setAntiAlias(false);
        paint.setColor(abg0Var.c(R.attr.vk_ui_image_border_alpha));
        this.h = dhr0.M();
    }

    @Override // xsna.too0
    public final void Ng() {
        this.h = dhr0.M();
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(this.c);
        this.d.setColor(c);
        this.e.c(abg0Var.c(this.b), c);
    }

    public abstract void l(Canvas canvas, a aVar);

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childCount = recyclerView.getChildCount();
        boolean z = recyclerView.getLayoutDirection() == 1;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                int left = childAt.getLeft();
                int top = childAt.getTop();
                int right = childAt.getRight();
                int bottom = childAt.getBottom();
                Rect rect = this.f;
                rect.set(left, top, right, bottom);
                this.g.set(rect);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                a aVar = this.i;
                aVar.c = childAdapterPosition;
                aVar.d = itemCount;
                aVar.e = z;
                l(canvas, aVar);
            }
        }
    }
}
