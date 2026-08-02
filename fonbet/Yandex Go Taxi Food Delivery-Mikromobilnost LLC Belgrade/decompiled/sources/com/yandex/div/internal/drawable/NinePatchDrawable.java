package com.yandex.div.internal.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import defpackage.va60;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R*\u0010%\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\u0016R*\u0010)\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010&\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\u0016R*\u0010,\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\u0016R*\u0010/\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010&\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\u0016R.\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/yandex/div/internal/drawable/NinePatchDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/NinePatch;", "buildNinePatchFromBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/NinePatch;", "", "imageWidth", "imageHeight", "bottomInset", "leftInset", "rightInset", "topInset", "", "getChunkByteArray", "(IIIIII)[B", "value", "Lzy11;", "setAlpha", "(I)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "bottom", CA20Status.STATUS_USER_I, "getBottom", "setBottom", "left", "getLeft", "setLeft", "right", "getRight", "setRight", "top", "getTop", "setTop", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "ninePatch", "Landroid/graphics/NinePatch;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Companion", "va60", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NinePatchDrawable extends Drawable {
    private static final va60 Companion = new va60();
    private static final int REGIONS_COLOR = 1;
    private Bitmap bitmap;
    private int bottom;
    private int left;
    private NinePatch ninePatch;
    private final Paint paint = new Paint(3);
    private int right;
    private int top;

    private final NinePatch buildNinePatchFromBitmap(Bitmap bitmap) {
        return new NinePatch(bitmap, getChunkByteArray(bitmap.getWidth(), bitmap.getHeight(), this.bottom, this.left, this.right, this.top));
    }

    private final byte[] getChunkByteArray(int imageWidth, int imageHeight, int bottomInset, int leftInset, int rightInset, int topInset) {
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
        order.putInt(leftInset);
        order.putInt(imageWidth - rightInset);
        order.putInt(topInset);
        order.putInt(imageHeight - bottomInset);
        for (int i = 0; i < 9; i++) {
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

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int value) {
        this.paint.setAlpha(value);
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

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
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
}
