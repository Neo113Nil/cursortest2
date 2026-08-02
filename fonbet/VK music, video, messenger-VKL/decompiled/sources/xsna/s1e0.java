package xsna;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.widget.MediaStoreItemSmallView;
import com.vkontakte.android.R;

/* compiled from: ProgressBarIndeterminateDrawable.kt */
/* loaded from: classes15.dex */
public final class s1e0 extends Drawable implements Animatable, ValueAnimator.AnimatorUpdateListener {
    public ox0 b;
    public boolean c;
    public final float d = 260.0f;
    public final float e = iah0.a(22);
    public final int f;
    public final Paint g;
    public final ValueAnimator h;
    public final RectF i;
    public float j;

    public s1e0() {
        float a = iah0.a(4);
        int color = e43.a.getColor(R.color.vk_white);
        this.f = e43.a.getColor(R.color.vk_black_alpha35);
        Paint paint = new Paint(1);
        paint.setStrokeWidth(a);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(color);
        this.g = paint;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(1000L);
        ofFloat.addUpdateListener(this);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        this.h = ofFloat;
        this.i = new RectF();
        this.j = 1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.c) {
            canvas.drawColor(this.f);
            Rect clipBounds = canvas.getClipBounds();
            float width = clipBounds.width() / 2.0f;
            float f = this.e;
            RectF rectF = this.i;
            rectF.set(width - f, (clipBounds.height() / 2.0f) - f, (clipBounds.width() / 2.0f) + f, (clipBounds.height() / 2.0f) + f);
            canvas.drawArc(rectF, this.j, this.d, false, this.g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.c;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        this.j = f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        invalidateSelf();
        ox0 ox0Var = this.b;
        if (ox0Var != null) {
            ((MediaStoreItemSmallView) ox0Var.c).postInvalidate();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.h.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.c) {
            this.c = false;
            this.h.cancel();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
