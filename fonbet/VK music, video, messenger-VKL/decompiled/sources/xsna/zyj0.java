package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.ui.shimmer.Shimmer;

/* compiled from: SkeletonTabDrawable.kt */
/* loaded from: classes.dex */
public final class zyj0 extends Drawable {
    public ValueAnimator e;
    public Shimmer f;
    public boolean g;
    public final yyj0 a = new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.yyj0
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            zyj0.this.invalidateSelf();
        }
    };
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Matrix d = new Matrix();
    public final a h = new a();

    public final void a() {
        Shimmer shimmer;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.e;
        if ((valueAnimator2 != null && valueAnimator2.isStarted()) || (shimmer = this.f) == null || !shimmer.k || getCallback() == null || (valueAnimator = this.e) == null) {
            return;
        }
        valueAnimator.start();
    }

    public final void b() {
        Shimmer shimmer = this.f;
        if (shimmer == null) {
            return;
        }
        Rect rect = this.c;
        this.b.setShader(new LinearGradient(rect.left, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.right, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, shimmer.b, shimmer.a, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.b;
        if (paint.getShader() == null) {
            return;
        }
        Rect rect = this.c;
        float width = rect.width();
        ValueAnimator valueAnimator = this.e;
        float f = -width;
        float animatedFraction = ((width - f) * (valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f)) + f;
        Matrix matrix = this.d;
        matrix.reset();
        matrix.postTranslate(animatedFraction, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        paint.getShader().setLocalMatrix(matrix);
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(rect);
        b();
        a();
    }

    /* compiled from: SkeletonTabDrawable.kt */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ValueAnimator valueAnimator;
            zyj0 zyj0Var = zyj0.this;
            ValueAnimator valueAnimator2 = zyj0Var.e;
            if (valueAnimator2 != null) {
                Shimmer shimmer = zyj0Var.f;
                valueAnimator2.setStartDelay(shimmer != null ? shimmer.p : 0L);
            }
            if (zyj0Var.g || (valueAnimator = zyj0Var.e) == null) {
                return;
            }
            valueAnimator.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
