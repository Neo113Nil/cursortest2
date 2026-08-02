package xsna;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: BaseSpinnerDrawable.kt */
/* loaded from: classes.dex */
public abstract class xn6 extends Drawable {
    public final a b;
    public int c;

    /* compiled from: BaseSpinnerDrawable.kt */
    public final class a {
        public float a;
        public float b;
        public float c;
        public float e;
        public float f;
        public float g;
        public final Paint j;
        public float d = 5.0f;
        public float h = 2.5f;
        public final RectF i = new RectF();

        public a() {
            Paint paint = new Paint();
            this.j = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            paint.setColor(-16777216);
        }

        public final void a(Canvas canvas, Rect rect) {
            RectF rectF = this.i;
            rectF.set(rect);
            float f = this.h;
            rectF.inset(f, f);
            float f2 = this.a;
            float f3 = this.c;
            float f4 = 360;
            float f5 = (f2 + f3) * f4;
            canvas.drawArc(rectF, f5, ((this.b + f3) * f4) - f5, false, this.j);
        }
    }

    public xn6() {
        a aVar = new a();
        this.b = aVar;
        aVar.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void a(float f) {
        a aVar = this.b;
        aVar.d = f;
        aVar.j.setStrokeWidth(f);
        aVar.h = (float) Math.ceil(aVar.d / 2.0f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.j.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.b.j.setColor(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.b.j.setColor(colorStateList.getDefaultColor());
        }
        invalidateSelf();
    }
}
