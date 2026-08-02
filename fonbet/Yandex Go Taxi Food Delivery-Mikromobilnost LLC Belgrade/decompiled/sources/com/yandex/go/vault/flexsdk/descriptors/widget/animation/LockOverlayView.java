package com.yandex.go.vault.flexsdk.descriptors.widget.animation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.mqg0;
import defpackage.tje;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00162\b\b\u0001\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u0010\u0019\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010*R\u0016\u00101\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010*R\u0018\u00102\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/yandex/go/vault/flexsdk/descriptors/widget/animation/LockOverlayView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "charSequence", "Landroid/text/TextPaint;", "paint", "", "measureCharSequenceWidth", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F", "", "formattedText", "()Ljava/lang/String;", "Landroid/graphics/Bitmap;", "bitmap", "Lzy11;", "setKeyBitmap", "(Landroid/graphics/Bitmap;)V", "keyAmount", "setKeyAmount", "(I)V", "setMaxKeyAmount", "offset", "setPaintOffset", "(F)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "paintOffset", "F", "strokeWidth", "textTopOffset", "drawableOffset", "greenHighColor", CA20Status.STATUS_USER_I, "greenLightColor", "maxKeyAmount", "keyBitmap", "Landroid/graphics/Bitmap;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LockOverlayView extends View {
    private final float drawableOffset;
    private final int greenHighColor;
    private final int greenLightColor;
    private float keyAmount;
    private Bitmap keyBitmap;
    private float maxKeyAmount;
    private final Paint paint;
    private float paintOffset;
    private final RectF rect;
    private final float strokeWidth;
    private final float textTopOffset;

    public LockOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.paint = new Paint();
        this.rect = new RectF();
        this.paintOffset = tje.w(45, context);
        this.strokeWidth = tje.w(3, context);
        this.textTopOffset = tje.w(16, context);
        this.drawableOffset = tje.w(12, context);
        this.greenHighColor = context.getColor(mqg0.component_green_high);
        this.greenLightColor = context.getColor(mqg0.component_green_light);
        this.maxKeyAmount = 100.0f;
    }

    private final String formattedText() {
        return ((int) this.keyAmount) + " / " + ((int) this.maxKeyAmount);
    }

    private final float measureCharSequenceWidth(CharSequence charSequence, TextPaint paint) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), paint, Integer.MAX_VALUE).build().getLineWidth(0);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.strokeWidth);
        this.paint.setTextSize(tje.b0(getContext(), 13.0f));
        this.rect.set((getWidth() / 2.0f) - this.paintOffset, (getHeight() / 2.0f) - this.paintOffset, (getWidth() / 2.0f) + this.paintOffset, (getHeight() / 2.0f) + this.paintOffset);
        this.paint.setColor(-1);
        this.paint.setAlpha(26);
        canvas.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
        this.paint.setAlpha(255);
        this.paint.setColor(this.keyAmount >= this.maxKeyAmount ? this.greenHighColor : -1);
        float f = this.maxKeyAmount;
        canvas.drawArc(this.rect, 270.0f, (f > 0.0f ? this.keyAmount / f : 1.0f) * 360.0f, false, this.paint);
        if (this.keyAmount >= this.maxKeyAmount) {
            this.paint.setColor(this.greenLightColor);
        }
        this.paint.setStrokeWidth(1.0f);
        this.paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.paint.setStrokeCap(Paint.Cap.BUTT);
        canvas.drawText(formattedText(), (getWidth() / 2.0f) - (measureCharSequenceWidth(formattedText(), new TextPaint(this.paint)) / 2.0f), (getHeight() / 2.0f) + this.textTopOffset, this.paint);
        Bitmap bitmap = this.keyBitmap;
        if (bitmap != null) {
            this.rect.set((getWidth() / 2) - this.drawableOffset, (getHeight() / 2) - (this.drawableOffset * 2.0f), (getWidth() / 2) + this.drawableOffset, getHeight() / 2.0f);
            canvas.drawBitmap(bitmap, (Rect) null, this.rect, this.paint);
        }
    }

    public final void setKeyAmount(int keyAmount) {
        this.keyAmount = keyAmount;
        invalidate();
    }

    public final void setKeyBitmap(Bitmap bitmap) {
        this.keyBitmap = bitmap;
    }

    public final void setMaxKeyAmount(int keyAmount) {
        this.maxKeyAmount = keyAmount;
        invalidate();
    }

    public final void setPaintOffset(float offset) {
        this.paintOffset = offset;
    }

    public LockOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LockOverlayView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ LockOverlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
