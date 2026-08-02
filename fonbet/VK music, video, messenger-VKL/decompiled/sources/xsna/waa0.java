package xsna;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: PhotoProgress.kt */
/* loaded from: classes3.dex */
public final class waa0 extends Drawable implements Animatable {
    public final ValueAnimator b;
    public final ValueAnimator c;
    public float d;
    public float e = 0.05f;
    public float f;
    public final Paint g;
    public final float h;
    public final RectF i;
    public final long j;
    public final int k;
    public float l;
    public final float m;

    public waa0() {
        Paint paint = new Paint(1);
        this.g = paint;
        float a = cn70.a() * 40.0f;
        this.h = a;
        this.i = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a, a);
        this.j = SystemClock.uptimeMillis() + 300;
        this.k = 1332;
        this.l = 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(1332L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new msv(this, 1));
        this.b = ofFloat;
        float f = this.e;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f, f);
        ofFloat2.setDuration(150L);
        ofFloat2.addUpdateListener(new uaa0(this, 0));
        this.c = ofFloat2;
        paint.setColor(-1);
        paint.setStrokeWidth(cn70.a() * 2.5f);
        this.m = cn70.a() * 4.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        float f = 360;
        canvas.rotate(this.f * f, getBounds().exactCenterX(), getBounds().exactCenterY());
        float centerX = getBounds().centerX();
        float f2 = 2;
        float f3 = this.h;
        canvas.translate(centerX - (f3 / f2), getBounds().centerY() - (f3 / f2));
        int l = n8g.l(-16777216, (int) (this.l * 76.5d));
        Paint paint = this.g;
        paint.setColor(l);
        paint.setStyle(Paint.Style.FILL);
        RectF rectF = this.i;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f3);
        canvas.drawOval(rectF, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(n8g.l(-1, (int) (this.l * 76.5d)));
        float f4 = this.m;
        rectF.set(f4, f4, f3 - f4, f3 - f4);
        canvas.drawArc(rectF, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f, false, paint);
        paint.setColor(n8g.l(-1, (int) (255 * this.l)));
        canvas.drawArc(rectF, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f * this.e, false, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        this.d = Math.max(i / 10000.0f, 0.05f);
        float max = Math.max(this.e, 0.05f);
        this.e = max;
        float[] fArr = {max, this.d};
        ValueAnimator valueAnimator = this.c;
        valueAnimator.setFloatValues(fArr);
        if (this.b.isRunning()) {
            valueAnimator.start();
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.start();
        this.c.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.b.pause();
        this.c.pause();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
