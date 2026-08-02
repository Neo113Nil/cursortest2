package com.yandex.div.legacy.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.LinearLayout;

/* loaded from: classes11.dex */
public class RoundedCornersWithStrokeLayout extends LinearLayout {
    private static final float EXTRA_CONTENT_INSET = 1.0f;
    private float mCornerRadius;
    private final Path mPath;
    private final RectF mRectBorder;
    private final RectF mRectBounds;
    private int mStrokeColor;
    private final Paint mStrokePaint;
    private int mStrokeWidth;

    public RoundedCornersWithStrokeLayout(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.mStrokePaint = paint;
        this.mPath = new Path();
        this.mStrokeColor = -65536;
        this.mRectBounds = new RectF();
        this.mRectBorder = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.mStrokeColor);
        paint.setStrokeWidth(this.mStrokeWidth);
        paint.setAntiAlias(true);
    }

    private void clipPath(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        this.mPath.reset();
        this.mRectBounds.set(0.0f, 0.0f, width, height);
        insetContentIfNeeded(this.mRectBounds);
        Path path = this.mPath;
        RectF rectF = this.mRectBounds;
        float f = this.mCornerRadius;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(this.mPath);
    }

    private void drawStroke(Canvas canvas) {
        if (this.mStrokeWidth <= 0) {
            return;
        }
        this.mRectBorder.set(0.0f, 0.0f, getWidth(), getHeight());
        float ceil = (float) Math.ceil(this.mStrokeWidth / 2.0f);
        this.mRectBorder.inset(ceil, ceil);
        RectF rectF = this.mRectBorder;
        float f = this.mCornerRadius;
        canvas.drawRoundRect(rectF, f, f, this.mStrokePaint);
    }

    private void insetContentIfNeeded(RectF rectF) {
        if (this.mStrokeWidth > 0) {
            rectF.inset(1.0f, 1.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        clipPath(canvas);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
        drawStroke(canvas);
    }

    public float getCornerRadius() {
        return this.mCornerRadius;
    }

    public int getStrokeColor() {
        return this.mStrokeColor;
    }

    public int getStrokeWidth() {
        return this.mStrokeWidth;
    }

    public void setCornerRadius(float f) {
        this.mCornerRadius = f;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.mStrokeColor = i;
        this.mStrokePaint.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(int i) {
        this.mStrokeWidth = i;
        this.mStrokePaint.setStrokeWidth(i);
        invalidate();
    }
}
