package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.fxg0;
import defpackage.lvg0;
import defpackage.mvg0;
import defpackage.qpg0;
import defpackage.unr0;
import defpackage.vng;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\u0013\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/composite/CompositeProductsLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/Canvas;", "", "cx", "cy", "Lzy11;", "drawLines", "(Landroid/graphics/Canvas;FF)V", "drawPlusCircle", "drawPlus", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "acquisition-sdk-button-section-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompositeProductsLayout extends LinearLayout {
    private final Paint paint;

    public CompositeProductsLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.paint = unr0.f(true);
        setOrientation(1);
        setBackground(vng.t(fxg0.acquisition_sdk_bg_products_container, context));
    }

    private final void drawLines(Canvas canvas, float f, float f2) {
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setStrokeWidth(0.0f);
        this.paint.setColor(getContext().getColor(qpg0.acquisition_sdk_semantic_stroke_divider));
        float s = f - (vng.s(lvg0.acquisition_sdk_composite_offer_plus_circle_size, getContext()) / 2.0f);
        float s2 = vng.s(mvg0.acquisition_sdk_dimension_size_200, getContext());
        canvas.drawLine(s2, f2, s, f2, this.paint);
        canvas.drawLine(s + vng.s(lvg0.acquisition_sdk_composite_offer_plus_circle_size, getContext()), f2, canvas.getWidth() - s2, f2, this.paint);
    }

    private final void drawPlus(Canvas canvas, float f, float f2) {
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setStrokeWidth(0.0f);
        this.paint.setColor(getContext().getColor(qpg0.acquisition_sdk_semantic_control_content_disable));
        float s = vng.s(lvg0.acquisition_sdk_composite_offer_plus_size, getContext()) / 2.0f;
        canvas.drawLine(f - s, f2, f + s, f2, this.paint);
        canvas.drawLine(f, f2 - s, f, f2 + s, this.paint);
    }

    private final void drawPlusCircle(Canvas canvas, float f, float f2) {
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(vng.s(lvg0.acquisition_sdk_composite_offer_lines_thickness, getContext()));
        this.paint.setColor(getContext().getColor(qpg0.acquisition_sdk_semantic_stroke_divider));
        canvas.drawCircle(f, f2, vng.s(lvg0.acquisition_sdk_composite_offer_plus_circle_size, getContext()) / 2.0f, this.paint);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        drawLines(canvas, width, height);
        drawPlusCircle(canvas, width, height);
        drawPlus(canvas, width, height);
    }

    public CompositeProductsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public CompositeProductsLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ CompositeProductsLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public CompositeProductsLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
