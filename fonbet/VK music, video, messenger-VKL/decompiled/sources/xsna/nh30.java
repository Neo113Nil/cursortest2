package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MsgBubbleLinkedTopAppendixDrawable.kt */
/* loaded from: classes2.dex */
public final class nh30 extends Drawable {
    public final boolean a;
    public final Paint b;
    public final Path c;
    public Integer d;
    public PorterDuff.Mode e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public nh30(boolean z) {
        this.a = z;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16777216);
        this.b = paint;
        this.c = new Path();
        this.e = PorterDuff.Mode.SRC_IN;
        this.f = iah0.b(20.0f);
        this.g = iah0.b(7.0f);
        this.h = iah0.b(19.0f);
        this.i = iah0.b(1.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Integer num = this.d;
        Paint paint = this.b;
        if (num != null) {
            paint.setColorFilter(new PorterDuffColorFilter(this.d.intValue(), this.e));
        } else {
            paint.setColorFilter(null);
        }
        Rect bounds = getBounds();
        Path path = this.c;
        path.reset();
        float f = this.h;
        float f2 = this.g;
        path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f + f2);
        float f3 = this.i;
        path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
        path.arcTo(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2 * f3, f3), 180.0f, 90.0f, false);
        float f4 = this.f;
        path.cubicTo((f4 - f3) / 2.5f, f2 + f3, (f4 - f3) / 1.2f, f3 + f2, f4, f2 + f3);
        path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f + f2);
        path.close();
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        if (this.a) {
            canvas.translate(bounds.width(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            canvas.scale(-1.0f, 1.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) (this.h + this.g + this.i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.d = Integer.valueOf(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        this.e = mode;
        invalidateSelf();
    }
}
