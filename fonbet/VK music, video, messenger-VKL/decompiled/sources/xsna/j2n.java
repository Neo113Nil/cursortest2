package xsna;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DiscoverGridItemDecoration.kt */
/* loaded from: classes4.dex */
public final class j2n extends RecyclerView.n implements too0 {
    public final int b;
    public final RectF c;
    public final float d;
    public final Object e;

    public j2n() {
        this((Object) null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.too0
    public final void Ng() {
        ((xso0) this.e.getValue()).c(dhr0.t.c(this.b), 0);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                float left = childAt.getLeft();
                float top = childAt.getTop();
                float right = childAt.getRight();
                float bottom = childAt.getBottom();
                RectF rectF = this.c;
                rectF.set(left, top, right, bottom);
                rectF.offset(childAt.getTranslationX(), childAt.getTranslationY());
                ((xso0) this.e.getValue()).b(canvas, rectF, xso0.i);
            }
        }
    }

    public /* synthetic */ j2n(Object obj) {
        this(R.attr.vk_ui_background);
    }

    public j2n(int i) {
        this.b = i;
        this.c = new RectF();
        this.d = cn70.a() * 2.0f;
        this.e = msy.a(LazyThreadSafetyMode.NONE, new btm(this, 1));
    }
}
