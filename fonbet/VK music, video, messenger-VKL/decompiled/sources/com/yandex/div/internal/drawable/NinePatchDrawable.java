package com.yandex.div.internal.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import xsna.zcl;

/* compiled from: NinePatchDrawable.kt */
/* loaded from: classes7.dex */
public final class NinePatchDrawable extends Drawable {
    private static final Companion Companion = new Companion(null);
    private Bitmap bitmap;
    private int bottom;
    private int left;
    private NinePatch ninePatch;
    private final Paint paint = new Paint(3);
    private int right;
    private int top;

    /* compiled from: NinePatchDrawable.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    private final NinePatch buildNinePatchFromBitmap(Bitmap bitmap) {
        return new NinePatch(bitmap, getChunkByteArray(bitmap.getWidth(), bitmap.getHeight(), this.bottom, this.left, this.right, this.top));
    }

    private final byte[] getChunkByteArray(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i2 - i3;
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i4);
        order.putInt(i - i5);
        order.putInt(i6);
        order.putInt(i7);
        for (int i8 = 0; i8 < 9; i8++) {
            order.putInt(1);
        }
        return order.array();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        NinePatch ninePatch = this.ninePatch;
        if (ninePatch != null) {
            ninePatch.draw(canvas, new Rect(0, 0, getBounds().width(), getBounds().height()), this.paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
        invalidateSelf();
    }

    public final void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
        this.ninePatch = bitmap != null ? buildNinePatchFromBitmap(bitmap) : null;
        invalidateSelf();
    }

    public final void setBottom(int i) {
        this.bottom = i;
        invalidateSelf();
    }

    public final void setLeft(int i) {
        this.left = i;
        invalidateSelf();
    }

    public final void setRight(int i) {
        this.right = i;
        invalidateSelf();
    }

    public final void setTop(int i) {
        this.top = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
