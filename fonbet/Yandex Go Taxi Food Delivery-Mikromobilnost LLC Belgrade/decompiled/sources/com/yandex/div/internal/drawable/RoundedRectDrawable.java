package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.oyk0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/yandex/div/internal/drawable/RoundedRectDrawable;", "Landroid/graphics/drawable/Drawable;", "Loyk0;", "params", "<init>", "(Loyk0;)V", "", "size", "considerSize", "(FF)F", "offset", "Lzy11;", "setRectWithOffset", "(F)V", "", "getIntrinsicHeight", "()I", "getIntrinsicWidth", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "Loyk0;", "Landroid/graphics/Paint;", "mainPaint", "Landroid/graphics/Paint;", "strokePaint", "strokeOffset", "F", "radiusX", "radiusY", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RoundedRectDrawable extends Drawable {
    private final Paint mainPaint;
    private final float offset;
    private final oyk0 params;
    private final float radiusX;
    private final float radiusY;
    private final RectF rect;
    private final float strokeOffset;
    private final Paint strokePaint;

    public RoundedRectDrawable(oyk0 oyk0Var) {
        this.params = oyk0Var;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(oyk0Var.c);
        this.mainPaint = paint;
        this.radiusX = considerSize(oyk0Var.d, oyk0Var.b);
        this.radiusY = considerSize(oyk0Var.d, oyk0Var.a);
        RectF rectF = new RectF(0.0f, 0.0f, oyk0Var.a, oyk0Var.b);
        this.rect = rectF;
        if (oyk0Var.e == null || oyk0Var.f == null) {
            this.strokePaint = null;
            this.strokeOffset = 0.0f;
            this.offset = 0.0f;
        } else {
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(oyk0Var.e.intValue());
            paint2.setStrokeWidth(oyk0Var.f.floatValue());
            this.strokePaint = paint2;
            this.strokeOffset = oyk0Var.f.floatValue() / 2.0f;
            this.offset = 1.0f;
        }
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    private final float considerSize(float f, float f2) {
        return f - (f >= f2 / 2.0f ? this.strokeOffset : 0.0f);
    }

    private final void setRectWithOffset(float offset) {
        Rect bounds = getBounds();
        this.rect.set(bounds.left + offset, bounds.top + offset, bounds.right - offset, bounds.bottom - offset);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        setRectWithOffset(this.offset);
        canvas.drawRoundRect(this.rect, this.radiusX, this.radiusY, this.mainPaint);
        Paint paint = this.strokePaint;
        if (paint != null) {
            setRectWithOffset(this.strokeOffset);
            RectF rectF = this.rect;
            float f = this.params.d;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.params.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.params.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
