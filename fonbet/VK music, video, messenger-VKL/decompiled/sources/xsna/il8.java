package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: BubbleDrawable.kt */
/* loaded from: classes16.dex */
public final class il8 extends Drawable {
    public float c;
    public float d;
    public float e;
    public int n;
    public final Paint a = new Paint(1);
    public final Path b = new Path();
    public final int f = 1;
    public final int g = 2;
    public final int h = 3;
    public float[] i = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public final RectF l = new RectF();
    public final RectF m = new RectF();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = getBounds().left;
        RectF rectF = this.j;
        rectF.left = f;
        float f2 = r0.top + this.d;
        rectF.top = f2;
        float f3 = 2;
        float f4 = this.i[0] * f3;
        rectF.bottom = f4 + f2;
        rectF.left = f + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF.right = f4 + f + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f5 = getBounds().right;
        RectF rectF2 = this.k;
        rectF2.right = f5;
        float f6 = r1.top + this.d;
        rectF2.top = f6;
        float[] fArr = this.i;
        int i = this.f;
        float f7 = fArr[i] * f3;
        rectF2.bottom = f7 + f6;
        rectF2.left = (f5 - f7) - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF2.right = f5 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Rect bounds = getBounds();
        float f8 = bounds.right;
        RectF rectF3 = this.l;
        rectF3.right = f8;
        float f9 = bounds.bottom;
        rectF3.bottom = f9;
        float[] fArr2 = this.i;
        int i2 = this.g;
        float f10 = fArr2[i2] * f3;
        rectF3.left = (f8 - f10) - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF3.right = f8 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF3.top = (f9 - f10) - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF3.bottom = f9 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Rect bounds2 = getBounds();
        float f11 = bounds2.left;
        RectF rectF4 = this.m;
        rectF4.left = f11;
        float f12 = bounds2.bottom;
        rectF4.bottom = f12;
        float[] fArr3 = this.i;
        int i3 = this.h;
        float f13 = fArr3[i3] * f3;
        rectF4.left = f11 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF4.right = f13 + f11 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF4.top = (f12 - f13) - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF4.bottom = f12 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Path path = this.b;
        path.reset();
        path.moveTo(rectF.left, rectF.bottom - this.i[0]);
        path.arcTo(rectF, 180.0f, 90.0f);
        path.lineTo(((getBounds().width() * this.e) + getBounds().left) - (this.c / f3), getBounds().top + this.d);
        path.lineTo((getBounds().width() * this.e) + getBounds().left, getBounds().top);
        path.lineTo((this.c / f3) + (getBounds().width() * this.e) + getBounds().left, getBounds().top + this.d);
        path.lineTo(rectF2.left + this.i[i], rectF2.top);
        path.arcTo(rectF2, 270.0f, 90.0f);
        path.lineTo(rectF3.right, rectF3.top + this.i[i2]);
        path.arcTo(rectF3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f);
        path.lineTo(rectF4.right - this.i[i3], rectF4.bottom);
        path.arcTo(rectF4, 90.0f, 90.0f);
        path.close();
        int i4 = this.n;
        Paint paint = this.a;
        paint.setColor(i4);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, paint);
        paint.setColor(0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
