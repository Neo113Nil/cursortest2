package com.yandex.plus.core.gradient.api;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import defpackage.viy;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/yandex/plus/core/gradient/api/LinearGradientDrawable;", "Lcom/yandex/plus/core/gradient/api/PlusDrawable;", "", "angle", "", "", "colors", "colorPositions", "<init>", "(FLjava/util/List;Ljava/util/List;)V", "width", "height", "Lkotlin/Pair;", "calculateGradSizes", "(FF)Lkotlin/Pair;", "Landroid/graphics/Rect;", "bounds", "Lzy11;", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Ljava/util/List;", "angleDeg", "F", "tan", "Companion", "viy", "plus-core-gradient_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LinearGradientDrawable extends PlusDrawable {

    @Deprecated
    public static final float BOTTOM_TO_TOP = 0.0f;
    private static final viy Companion = new viy();

    @Deprecated
    public static final int FULL_ANGLE_DEGREES = 360;

    @Deprecated
    public static final float LEFT_TO_RIGHT = 90.0f;

    @Deprecated
    public static final int RIGHT_ANGLE_DEGREES = 90;

    @Deprecated
    public static final float RIGHT_TO_LEFT = 270.0f;

    @Deprecated
    public static final float TOP_TO_BOTTOM = 180.0f;
    private final float angleDeg;
    private final List<Float> colorPositions;
    private final List<Integer> colors;
    private final float tan;

    public LinearGradientDrawable(float f, List<Integer> list, List<Float> list2) {
        this.colors = list;
        this.colorPositions = list2;
        this.angleDeg = f % 360.0f;
        this.tan = (float) Math.abs(Math.tan(Math.toRadians(r1 - 90.0f)));
    }

    private final Pair<Float, Float> calculateGradSizes(float width, float height) {
        float f = this.angleDeg;
        if (f == 90.0f || f == 270.0f) {
            height = 0.0f;
        } else if (f == 0.0f || f == 180.0f) {
            width = 0.0f;
        } else {
            float f2 = this.tan;
            if (f2 < 1.0f) {
                width += (height - (width * f2)) * f2;
                height = width * f2;
            } else if (f2 > 1.0f) {
                height += (width - (height / f2)) / f2;
                width = height / f2;
            } else {
                width = Math.max(width, height);
                height = width;
            }
        }
        return new Pair<>(Float.valueOf(width), Float.valueOf(height));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawRect(getBoundsF(), getPaint());
    }

    @Override // com.yandex.plus.core.gradient.api.PlusDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        float f;
        float f2;
        super.onBoundsChange(bounds);
        float width = getBoundsF().width();
        float height = getBoundsF().height();
        Pair<Float, Float> calculateGradSizes = calculateGradSizes(width, height);
        float floatValue = ((Number) calculateGradSizes.getFirst()).floatValue();
        float floatValue2 = ((Number) calculateGradSizes.getSecond()).floatValue();
        float f3 = getBoundsF().left;
        float f4 = getBoundsF().top;
        float f5 = this.angleDeg;
        if (f5 >= 90.0f) {
            if (f5 < 180.0f) {
                f = floatValue + f3;
            } else if (f5 < 270.0f) {
                f3 += width;
                f = f3 - floatValue;
            } else {
                f3 += width;
                f4 += height;
                f = f3 - floatValue;
            }
            f2 = f4 + floatValue2;
            getPaint().setShader(new LinearGradient(f3, f4, f, f2, kotlin.collections.a.I0(this.colors), kotlin.collections.a.G0(this.colorPositions), Shader.TileMode.REPEAT));
        }
        f4 += height;
        f = floatValue + f3;
        f2 = f4 - floatValue2;
        getPaint().setShader(new LinearGradient(f3, f4, f, f2, kotlin.collections.a.I0(this.colors), kotlin.collections.a.G0(this.colorPositions), Shader.TileMode.REPEAT));
    }
}
