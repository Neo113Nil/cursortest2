package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.internal.Assert;
import xsna.epx;
import xsna.shy;
import xsna.so;

/* compiled from: CircleDrawable.kt */
/* loaded from: classes7.dex */
public final class CircleDrawable extends Drawable {
    private final Paint mainPaint;
    private final Params params;
    private final RectF rect;
    private final Paint strokePaint;

    /* compiled from: CircleDrawable.kt */
    public static final class Params {
        private final int color;
        private final float radius;
        private final Integer strokeColor;
        private final Float strokeWidth;

        public Params(float f, int i, Integer num, Float f2) {
            this.radius = f;
            this.color = i;
            this.strokeColor = num;
            this.strokeWidth = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return Float.compare(this.radius, params.radius) == 0 && this.color == params.color && epx.f(this.strokeColor, params.strokeColor) && epx.f(this.strokeWidth, params.strokeWidth);
        }

        public final int getColor() {
            return this.color;
        }

        public final float getRadius() {
            return this.radius;
        }

        public final Integer getStrokeColor() {
            return this.strokeColor;
        }

        public final Float getStrokeWidth() {
            return this.strokeWidth;
        }

        public int hashCode() {
            int a = shy.a(this.color, Float.hashCode(this.radius) * 31, 31);
            Integer num = this.strokeColor;
            int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
            Float f = this.strokeWidth;
            return hashCode + (f != null ? f.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Params(radius=");
            sb.append(this.radius);
            sb.append(", color=");
            sb.append(this.color);
            sb.append(", strokeColor=");
            sb.append(this.strokeColor);
            sb.append(", strokeWidth=");
            return so.b(sb, this.strokeWidth, ')');
        }
    }

    public CircleDrawable(Params params) {
        Paint paint;
        this.params = params;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(params.getColor());
        this.mainPaint = paint2;
        if (params.getStrokeColor() == null || params.getStrokeWidth() == null) {
            paint = null;
        } else {
            paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(params.getStrokeColor().intValue());
            paint.setStrokeWidth(params.getStrokeWidth().floatValue());
        }
        this.strokePaint = paint;
        float f = 2;
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, params.getRadius() * f, params.getRadius() * f);
        this.rect = rectF;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.mainPaint.setColor(this.params.getColor());
        this.rect.set(getBounds());
        canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), this.params.getRadius(), this.mainPaint);
        if (this.strokePaint != null) {
            canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), this.params.getRadius(), this.strokePaint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return ((int) this.params.getRadius()) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return ((int) this.params.getRadius()) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Assert.fail("Setting alpha is not implemented");
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Assert.fail("Setting color filter is not implemented");
    }
}
