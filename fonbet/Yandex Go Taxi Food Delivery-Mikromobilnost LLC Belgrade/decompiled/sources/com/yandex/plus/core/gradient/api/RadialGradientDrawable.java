package com.yandex.plus.core.gradient.api;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/yandex/plus/core/gradient/api/RadialGradientDrawable;", "Lcom/yandex/plus/core/gradient/api/PlusDrawable;", "Landroid/graphics/PointF;", "center", "gradientRadius", "", "", "colors", "", "colorPositions", "<init>", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Ljava/util/List;Ljava/util/List;)V", "Landroid/graphics/Rect;", "bounds", "Lzy11;", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/PointF;", "Ljava/util/List;", "radiusX", "F", "radiusY", "centerX", "centerY", "plus-core-gradient_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RadialGradientDrawable extends PlusDrawable {
    private final PointF center;
    private float centerX;
    private float centerY;
    private final List<Float> colorPositions;
    private final List<Integer> colors;
    private final PointF gradientRadius;
    private float radiusX;
    private float radiusY;

    public RadialGradientDrawable(PointF pointF, PointF pointF2, List<Integer> list, List<Float> list2) {
        this.center = pointF;
        this.gradientRadius = pointF2;
        this.colors = list;
        this.colorPositions = list2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4 = this.radiusX;
        if (f4 == 0.0f) {
            return;
        }
        float f5 = this.radiusY;
        if (f5 == 0.0f) {
            return;
        }
        float f6 = 1.0f;
        if (f4 > f5) {
            float f7 = f5 / f4;
            float f8 = this.centerY;
            f3 = f8 - (f8 * f7);
            f2 = f7;
            f = 0.0f;
        } else {
            float f9 = f4 / f5;
            float f10 = this.centerX;
            f = f10 - (f10 * f9);
            f2 = 1.0f;
            f6 = f9;
            f3 = 0.0f;
        }
        int save = canvas.save();
        canvas.translate(f, f3);
        try {
            save = canvas.save();
            canvas.scale(f6, f2, 0.0f, 0.0f);
            canvas.drawPaint(getPaint());
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // com.yandex.plus.core.gradient.api.PlusDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        float width = getBoundsF().width();
        float height = getBoundsF().height();
        PointF pointF = this.center;
        this.centerX = pointF.x * width;
        this.centerY = pointF.y * height;
        PointF pointF2 = this.gradientRadius;
        float f = pointF2.x * width;
        this.radiusX = f;
        float f2 = pointF2.y * height;
        this.radiusY = f2;
        Float valueOf = (f > 0.0f || f2 > 0.0f) ? Float.valueOf(Math.max(f, f2)) : null;
        getPaint().setShader(valueOf != null ? new RadialGradient(this.centerX, this.centerY, valueOf.floatValue(), kotlin.collections.a.I0(this.colors), kotlin.collections.a.G0(this.colorPositions), Shader.TileMode.CLAMP) : null);
    }
}
