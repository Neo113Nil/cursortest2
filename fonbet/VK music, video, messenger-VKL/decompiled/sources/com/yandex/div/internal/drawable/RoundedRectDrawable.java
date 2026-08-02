package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.internal.Assert;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.shy;
import xsna.so;

/* compiled from: RoundedRectDrawable.kt */
/* loaded from: classes7.dex */
public final class RoundedRectDrawable extends Drawable {
    private final Paint mainPaint;
    private final float offset;
    private final Params params;
    private final float radiusX;
    private final float radiusY;
    private final RectF rect;
    private final float strokeOffset;
    private final Paint strokePaint;

    /* compiled from: RoundedRectDrawable.kt */
    public static final class Params {
        private final int color;
        private final float height;
        private final float radius;
        private final Integer strokeColor;
        private final Float strokeWidth;
        private final float width;

        public Params(float f, float f2, int i, float f3, Integer num, Float f4) {
            this.width = f;
            this.height = f2;
            this.color = i;
            this.radius = f3;
            this.strokeColor = num;
            this.strokeWidth = f4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return Float.compare(this.width, params.width) == 0 && Float.compare(this.height, params.height) == 0 && this.color == params.color && Float.compare(this.radius, params.radius) == 0 && epx.f(this.strokeColor, params.strokeColor) && epx.f(this.strokeWidth, params.strokeWidth);
        }

        public final int getColor() {
            return this.color;
        }

        public final float getHeight() {
            return this.height;
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

        public final float getWidth() {
            return this.width;
        }

        public int hashCode() {
            int a = b.a(this.radius, shy.a(this.color, b.a(this.height, Float.hashCode(this.width) * 31, 31), 31), 31);
            Integer num = this.strokeColor;
            int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
            Float f = this.strokeWidth;
            return hashCode + (f != null ? f.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Params(width=");
            sb.append(this.width);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", color=");
            sb.append(this.color);
            sb.append(", radius=");
            sb.append(this.radius);
            sb.append(", strokeColor=");
            sb.append(this.strokeColor);
            sb.append(", strokeWidth=");
            return so.b(sb, this.strokeWidth, ')');
        }
    }

    public RoundedRectDrawable(Params params) {
        this.params = params;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(params.getColor());
        this.mainPaint = paint;
        this.radiusX = considerSize(params.getRadius(), params.getHeight());
        this.radiusY = considerSize(params.getRadius(), params.getWidth());
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, params.getWidth(), params.getHeight());
        this.rect = rectF;
        if (params.getStrokeColor() == null || params.getStrokeWidth() == null) {
            this.strokePaint = null;
            this.strokeOffset = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.offset = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(params.getStrokeColor().intValue());
            paint2.setStrokeWidth(params.getStrokeWidth().floatValue());
            this.strokePaint = paint2;
            this.strokeOffset = params.getStrokeWidth().floatValue() / 2;
            this.offset = 1.0f;
        }
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    private final float considerSize(float f, float f2) {
        return f - (f >= f2 / ((float) 2) ? this.strokeOffset : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    private final void setRectWithOffset(float f) {
        Rect bounds = getBounds();
        this.rect.set(bounds.left + f, bounds.top + f, bounds.right - f, bounds.bottom - f);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        setRectWithOffset(this.offset);
        canvas.drawRoundRect(this.rect, this.radiusX, this.radiusY, this.mainPaint);
        Paint paint = this.strokePaint;
        if (paint != null) {
            setRectWithOffset(this.strokeOffset);
            canvas.drawRoundRect(this.rect, this.params.getRadius(), this.params.getRadius(), paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.params.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.params.getWidth();
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
