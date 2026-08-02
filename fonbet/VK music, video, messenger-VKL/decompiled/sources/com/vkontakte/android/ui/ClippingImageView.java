package com.vkontakte.android.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Keep;

/* loaded from: classes7.dex */
public class ClippingImageView extends View {
    public int b;
    public int c;
    public int d;
    public int e;
    public Bitmap f;

    @Keep
    public int getClipBottom() {
        return this.d;
    }

    @Keep
    public int getClipHorizontal() {
        return this.e;
    }

    @Keep
    public int getClipLeft() {
        return this.c;
    }

    @Keep
    public int getClipRight() {
        return this.e;
    }

    @Keep
    public int getClipTop() {
        return this.b;
    }

    @Keep
    public int getClipVertical() {
        return this.b;
    }

    public Drawable getDrawable() {
        return new BitmapDrawable(this.f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Rect rect = new Rect(this.c, this.b, getWidth() - this.e, getHeight() - this.d);
        canvas.save();
        canvas.clipRect(rect);
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, getWidth(), getHeight()), (Paint) null);
        }
        canvas.restore();
    }

    @Keep
    public void setClipBottom(int i) {
        this.d = i;
        invalidate();
    }

    @Keep
    public void setClipHorizontal(int i) {
        this.e = i;
        this.c = i;
        invalidate();
    }

    @Keep
    public void setClipLeft(int i) {
        this.c = i;
        invalidate();
    }

    @Keep
    public void setClipRight(int i) {
        this.e = i;
        invalidate();
    }

    @Keep
    public void setClipTop(int i) {
        this.b = i;
        invalidate();
    }

    @Keep
    public void setClipVertical(int i) {
        this.d = i;
        this.b = i;
        invalidate();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f = bitmap;
        invalidate();
    }
}
