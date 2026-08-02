package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;
import xsna.a640;

/* compiled from: BadgeHighlightDrawable.kt */
/* loaded from: classes16.dex */
public final class bz5 extends Drawable implements Animatable {
    public static final a640 k = new a640(new a640.a(2517.0f, new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.68f, 0.55f)), new a640.a(1783.0f, new PathInterpolator(1.0f, 0.46f, 1.0f, 1.0f)));
    public final o19 b = new o19();
    public final Paint c;
    public final PathMeasure d;
    public final float[] e;
    public float f;
    public int g;
    public int h;
    public int i;
    public final ValueAnimator j;

    /* compiled from: BadgeHighlightDrawable.kt */
    public final class a implements Animator.AnimatorListener {
        public boolean b;

        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.b = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.b) {
                return;
            }
            bz5.this.i++;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            bz5.this.i++;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.b = false;
        }
    }

    public bz5(int i) {
        Paint paint = new Paint(1);
        paint.setColor(i);
        paint.setAlpha(230);
        this.c = paint;
        this.d = new PathMeasure();
        this.e = new float[2];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(4000L);
        ofFloat.setRepeatCount(0);
        ofFloat.setInterpolator(k);
        ofFloat.addListener(new a());
        ofFloat.addUpdateListener(new az5(this, 0));
        this.j = ofFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.j.isStarted()) {
            PathMeasure pathMeasure = this.d;
            float length = pathMeasure.getLength() * this.f;
            float[] fArr = this.e;
            pathMeasure.getPosTan(length, fArr, null);
            canvas.drawCircle(fArr[0], fArr[1], this.h * 2.27f, this.c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.j.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int width = rect.width();
        int height = rect.height();
        if (this.g != width || this.h != height) {
            this.g = width;
            this.h = height;
        }
        if (this.g == 0 || this.h == 0) {
            return;
        }
        float f = width;
        this.b.getClass();
        double d = f / 8.49450603978d;
        double d2 = height;
        PointF pointF = new PointF(((float) (2.35430091942d * d2)) + f, (float) ((-0.68823087648d) * d2));
        PointF pointF2 = new PointF((float) ((-0.53216875515d) * d2), (float) (0.77193483529d * d2));
        PointF pointF3 = new PointF(f + ((float) (2.43453697762d * d2)), (float) (d2 * 2.54512996454d));
        PointF pointF4 = new PointF((float) (((-9.06042982128d) * d) + pointF.x), (float) (((-1.69650022044d) * d) + pointF.y));
        PointF pointF5 = new PointF((float) (((-0.11481336209d) * d) + pointF2.x), (float) (((-2.85989638436d) * d) + pointF2.y));
        PointF pointF6 = new PointF((float) ((0.0730630844d * d) + pointF2.x), (float) ((2.22320405895d * d) + pointF2.y));
        PointF pointF7 = new PointF((float) (((-7.14974096094d) * d) + pointF3.x), (float) ((d * 0.020874942d) + pointF3.y));
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        path.cubicTo(pointF4.x, pointF4.y, pointF5.x, pointF5.y, pointF2.x, pointF2.y);
        path.cubicTo(pointF6.x, pointF6.y, pointF7.x, pointF7.y, pointF3.x, pointF3.y);
        this.d.setPath(path, false);
        this.c.setMaskFilter(new BlurMaskFilter((this.h / iah0.b(22.0f)) * iah0.b(37.0f), BlurMaskFilter.Blur.NORMAL));
        invalidateSelf();
        if (isVisible()) {
            start();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!visible && !z2) {
            return false;
        }
        if (z2) {
            stop();
            this.j.setCurrentPlayTime(0L);
        }
        if (z) {
            start();
            return visible;
        }
        stop();
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.i >= 1) {
            return;
        }
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator.isRunning()) {
            return;
        }
        if (this.g == 0 && this.h == 0) {
            return;
        }
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
    }
}
