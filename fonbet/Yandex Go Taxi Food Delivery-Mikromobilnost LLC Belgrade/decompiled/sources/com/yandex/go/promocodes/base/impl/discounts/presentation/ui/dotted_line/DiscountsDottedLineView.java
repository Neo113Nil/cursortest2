package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.dotted_line;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.mqg0;
import defpackage.tje;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010!\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010\"\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0016\u0010#\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0016\u0010$\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/dotted_line/DiscountsDottedLineView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "Lzy11;", "updateColor", "(I)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "", "indent", "F", "radius", "start", "end", "thickness", "dx", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscountsDottedLineView extends View {
    private float dx;
    private float end;
    private final float indent;
    private final Paint paint;
    private final float radius;
    private float start;
    private float thickness;

    public DiscountsDottedLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint f = unr0.f(true);
        f.setColor(getContext().getColor(mqg0.component_gray_300));
        this.paint = f;
        float w = tje.w(3, getContext());
        this.indent = w;
        float w2 = tje.w(2, getContext());
        this.radius = w2;
        this.dx = w + w2 + w2;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f = this.start;
        while (f <= this.end) {
            canvas.drawCircle(f, this.thickness, this.radius, this.paint);
            f += this.dx;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.start = getPaddingLeft() + this.radius;
        float width = getWidth() - getPaddingRight();
        float f = this.radius;
        float f2 = width + f;
        this.end = f2;
        float f3 = this.start;
        this.dx = (f2 - f3) / ((f2 - f3) / ((this.indent + f) + f));
        this.thickness = ((Math.abs(top - bottom) + getPaddingTop()) - getPaddingBottom()) / 2.0f;
    }

    public final void updateColor(int color) {
        this.paint.setColor(color);
        invalidate();
    }

    public DiscountsDottedLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DiscountsDottedLineView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DiscountsDottedLineView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
