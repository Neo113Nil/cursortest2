package com.yandex.div.internal.widget.slider.shapes;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.nps0;
import defpackage.zly0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/yandex/div/internal/widget/slider/shapes/TextDrawable;", "Landroid/graphics/drawable/Drawable;", "Lnps0;", "textStyle", "<init>", "(Lnps0;)V", "", "text", "Lzy11;", "setText", "(Ljava/lang/String;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "getIntrinsicHeight", "()I", "getIntrinsicWidth", "getOffsetY", "getTextHeight", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "Lnps0;", "Lzly0;", "textDrawDelegate", "Lzly0;", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextDrawable extends Drawable {
    private final RectF rect = new RectF();
    private zly0 textDrawDelegate;
    private final nps0 textStyle;

    public TextDrawable(nps0 nps0Var) {
        this.textStyle = nps0Var;
        this.textDrawDelegate = new zly0(nps0Var);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.rect.set(getBounds());
        zly0 zly0Var = this.textDrawDelegate;
        float centerX = this.rect.centerX();
        float centerY = this.rect.centerY();
        String str = zly0Var.d;
        if (str != null) {
            float f = centerX - zly0Var.e;
            nps0 nps0Var = zly0Var.a;
            canvas.drawText(str, f + nps0Var.d, centerY + zly0Var.f + nps0Var.e, zly0Var.c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        nps0 nps0Var = this.textStyle;
        return (int) (Math.abs(nps0Var.e) + nps0Var.a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) (Math.abs(this.textStyle.d) + this.rect.width());
    }

    public final int getOffsetY() {
        return (int) this.textStyle.e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public final int getTextHeight() {
        return (int) this.textStyle.a;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setText(String text) {
        zly0 zly0Var = this.textDrawDelegate;
        Rect rect = zly0Var.b;
        zly0Var.d = text;
        Paint paint = zly0Var.c;
        paint.getTextBounds(text, 0, text != null ? text.length() : 0, rect);
        zly0Var.e = paint.measureText(zly0Var.d) / 2.0f;
        zly0Var.f = rect.height() / 2.0f;
        invalidateSelf();
    }
}
