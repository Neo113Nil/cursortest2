package com.ybsdk.feature.kyc.internal.screens.photo.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.kp50;
import defpackage.nzf0;
import defpackage.rje;
import defpackage.ung0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR.\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/screens/photo/views/PunchHoleView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Rect;", "value", "holeBorders", "Landroid/graphics/Rect;", "getHoleBorders", "()Landroid/graphics/Rect;", "setHoleBorders", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Path;", "holePath", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "holePaint", "Landroid/graphics/Paint;", "Companion", "nzf0", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PunchHoleView extends View {
    private Rect holeBorders;
    private final Paint holePaint;
    private final Path holePath;
    public static final nzf0 Companion = new nzf0();
    private static final float CORNER_RADIUS = kp50.t(24);

    public PunchHoleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Path path = new Path();
        path.setFillType(Path.FillType.WINDING);
        this.holePath = path;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(rje.a(context, ung0.ybColor_background_primary));
        this.holePaint = paint;
    }

    public final Rect getHoleBorders() {
        return this.holeBorders;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Rect rect = this.holeBorders;
        if (rect != null) {
            RectF rectF = new RectF(rect);
            this.holePath.addRect(0.0f, 0.0f, getWidth(), getHeight(), Path.Direction.CW);
            Path path = this.holePath;
            float f = CORNER_RADIUS;
            path.addRoundRect(rectF, f, f, Path.Direction.CCW);
            canvas.drawPath(this.holePath, this.holePaint);
        }
    }

    public final void setHoleBorders(Rect rect) {
        this.holeBorders = rect;
        invalidate();
    }

    public PunchHoleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PunchHoleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PunchHoleView(Context context) {
        this(context, null, 0, 6, null);
    }
}
