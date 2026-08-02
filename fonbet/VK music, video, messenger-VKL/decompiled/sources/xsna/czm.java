package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DimingItemDecoration.kt */
/* loaded from: classes4.dex */
public final class czm extends RecyclerView.n implements too0 {
    public final Paint b;
    public final RectF c;
    public final float d;
    public boolean e;
    public final Object f;
    public View g;
    public a h;

    /* compiled from: DimingItemDecoration.kt */
    public static abstract class a {

        /* compiled from: DimingItemDecoration.kt */
        /* renamed from: xsna.czm$a$a, reason: collision with other inner class name */
        public static final class C2692a extends a {
            public static final C2692a a = new C2692a();
        }

        /* compiled from: DimingItemDecoration.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    public czm() {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new RectF();
        this.d = cn70.a() * 2.0f;
        this.f = msy.a(LazyThreadSafetyMode.NONE, new k5h(this, 10));
        this.h = a.b.a;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(l());
    }

    @Override // xsna.too0
    public final void Ng() {
        this.b.setColor(l());
    }

    public final int l() {
        return this.h instanceof a.C2692a ? n8g.l(-16777216, an10.b(204.0f)) : n8g.l(krv0.l(R.attr.vk_ui_background), an10.b(204.0f));
    }

    public final void m(a aVar) {
        if (epx.f(this.h, aVar)) {
            return;
        }
        this.h = aVar;
        this.b.setColor(l());
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        View view = this.g;
        ViewParent parent = view != null ? view.getParent() : null;
        View view2 = parent instanceof View ? (View) parent : null;
        Paint paint = this.b;
        if (view == null || view2 == null) {
            if (this.e) {
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, recyclerView.getMeasuredWidth(), recyclerView.getMeasuredHeight(), paint);
                return;
            }
            return;
        }
        float translationX = view.getTranslationX() + view2.getLeft() + view.getLeft() + view2.getTranslationX();
        float translationY = view2.getTranslationY() + view.getTranslationY() + view2.getTop() + view.getTop();
        float translationX2 = view2.getTranslationX() + view.getTranslationX() + view2.getLeft() + view.getRight();
        float translationY2 = view2.getTranslationY() + view.getTranslationY() + view2.getTop() + view.getBottom();
        if (translationX > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            canvas2 = canvas;
            canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, translationX, recyclerView.getMeasuredHeight(), paint);
            f = translationX;
        } else {
            canvas2 = canvas;
            f = translationX;
        }
        if (translationX2 < recyclerView.getMeasuredWidth()) {
            canvas2.drawRect(translationX2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, recyclerView.getMeasuredWidth(), recyclerView.getMeasuredHeight(), paint);
            f2 = translationX2;
        } else {
            f2 = translationX2;
        }
        if (translationY > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 = f;
            canvas2.drawRect(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, translationY, paint);
            f4 = translationY;
        } else {
            f3 = f;
            f4 = translationY;
        }
        if (translationY2 < recyclerView.getMeasuredHeight()) {
            f5 = translationY2;
            canvas2.drawRect(f3, f5, f2, recyclerView.getMeasuredHeight(), paint);
        } else {
            f5 = translationY2;
        }
        if (epx.f(this.h, a.C2692a.a)) {
            RectF rectF = this.c;
            rectF.set(f3, f4, f2, f5);
            ((xso0) this.f.getValue()).b(canvas2, rectF, xso0.i);
        }
    }
}
