package com.yandex.div.legacy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import defpackage.s0z0;

/* loaded from: classes11.dex */
public class BackgroundImageDrawable extends Drawable {
    private final Context mContext;
    private Bitmap mOriginalBitmap;
    private Matrix mThumbTransformMatrix;
    private final Rect mDrawableBounds = new Rect();
    private final Paint mPaint = new Paint(3);

    public BackgroundImageDrawable(Context context) {
        this.mContext = context;
    }

    private void onChanged() {
        if (this.mOriginalBitmap == null || this.mDrawableBounds.width() == 0 || this.mDrawableBounds.height() == 0) {
            return;
        }
        this.mThumbTransformMatrix = s0z0.c(this.mOriginalBitmap, this.mDrawableBounds.width(), this.mDrawableBounds.height(), 0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.mOriginalBitmap == null || this.mThumbTransformMatrix == null) {
            return;
        }
        canvas.save();
        canvas.clipRect(this.mDrawableBounds);
        canvas.drawBitmap(this.mOriginalBitmap, this.mThumbTransformMatrix, this.mPaint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mDrawableBounds.set(rect);
        onChanged();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    public void setOriginalBitmap(Bitmap bitmap) {
        this.mOriginalBitmap = bitmap;
        onChanged();
    }
}
