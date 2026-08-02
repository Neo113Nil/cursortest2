package xsna;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ClipLoaderDrawable.kt */
/* loaded from: classes17.dex */
public final class m7d extends Drawable implements Animatable {
    public RectF b;
    public Float c;
    public AnimatorSet d;
    public float f;
    public float g;
    public final float e = iah0.b(1.0f);
    public final long h = 1400;
    public final float i = 0.4f;
    public final float j = 1.0f;
    public final float k = 6.0f;
    public final bpn0 l = new bpn0(new la0(5));

    public final Paint a() {
        return (Paint) this.l.getValue();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().width() == 0 || getBounds().height() == 0 || this.b == null) {
            return;
        }
        int save = canvas.save();
        float max = Math.max(this.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float max2 = getBounds().right - Math.max(this.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int centerY = getBounds().centerY();
        RectF rectF = this.b;
        float f = centerY;
        float f2 = this.e / 2.0f;
        rectF.set(max, f - f2, max2, f2 + f);
        RectF rectF2 = this.b;
        float f3 = this.k;
        canvas.drawRoundRect(rectF2, f3, f3, a());
        canvas.restoreToCount(save);
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null ? animatorSet.isStarted() : false) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return a().getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return a().getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            return animatorSet.isRunning();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.b = new RectF(rect);
        this.c = Float.valueOf((float) (rect.width() * 0.9d));
        stop();
        start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (a().getAlpha() != i) {
            a().setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (epx.f(a().getColorFilter(), colorFilter)) {
            return;
        }
        a().setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Float f = this.c;
        if (f == null) {
            return;
        }
        if (this.d == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(-f.floatValue(), this.c.floatValue());
            long j = this.h;
            ofFloat.setDuration(j);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(2);
            ofFloat.addUpdateListener(new ys5(this, 2));
            float f2 = 255;
            float f3 = this.i * f2;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f3, f2 * this.j, f3);
            ofFloat2.setDuration(j);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat2.setRepeatMode(2);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.addUpdateListener(new l7d(this, 0));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            this.d = animatorSet;
        }
        AnimatorSet animatorSet2 = this.d;
        if (animatorSet2 != null ? animatorSet2.isStarted() : false) {
            return;
        }
        AnimatorSet animatorSet3 = this.d;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }
}
