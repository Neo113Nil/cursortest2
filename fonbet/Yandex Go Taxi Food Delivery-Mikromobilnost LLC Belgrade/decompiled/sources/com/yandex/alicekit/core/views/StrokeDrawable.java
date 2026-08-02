package com.yandex.alicekit.core.views;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes11.dex */
public class StrokeDrawable extends Drawable {
    private final float mCornerRadius;
    private final Paint mPaint;
    private final RectF mRect;
    private final float mStrokeWidth;

    public StrokeDrawable(float f, float f2, int i) {
        Paint paint = new Paint();
        this.mPaint = paint;
        this.mRect = new RectF();
        paint.setStrokeWidth(f);
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.mStrokeWidth = f;
        this.mCornerRadius = f2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.mRect;
        float f = this.mCornerRadius;
        canvas.drawRoundRect(rectF, f, f, this.mPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float f = this.mStrokeWidth / 2.0f;
        this.mRect.set(rect.left + f, rect.top + f, rect.right - f, rect.bottom - f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
