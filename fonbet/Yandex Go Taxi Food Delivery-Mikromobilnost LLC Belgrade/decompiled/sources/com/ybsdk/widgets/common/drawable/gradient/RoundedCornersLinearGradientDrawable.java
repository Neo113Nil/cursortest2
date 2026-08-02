package com.ybsdk.widgets.common.drawable.gradient;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.hyk0;
import defpackage.j73;
import defpackage.jxi;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/ybsdk/widgets/common/drawable/gradient/RoundedCornersLinearGradientDrawable;", "Landroid/graphics/drawable/Drawable;", "", "colors", "", "cornerRadiusPx", "angle", "<init>", "([IFF)V", "Landroid/graphics/Rect;", "bounds", "Lzy11;", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "[I", "F", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Companion", "hyk0", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RoundedCornersLinearGradientDrawable extends Drawable {

    @Deprecated
    public static final float ANGLE_CIRCLE = 360.0f;

    @Deprecated
    public static final float ANGLE_HALF_CIRCLE = 180.0f;
    private static final hyk0 Companion = new hyk0();
    private final float angle;
    private final int[] colors;
    private final float cornerRadiusPx;
    private final Paint paint = new Paint(1);

    public RoundedCornersLinearGradientDrawable(int[] iArr, float f, float f2) {
        this.colors = iArr;
        this.cornerRadiusPx = f;
        this.angle = f2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || this.paint.getShader() == null) {
            return;
        }
        int save = canvas.save();
        try {
            RectF rectF = new RectF(getBounds());
            float f = this.cornerRadiusPx;
            canvas.drawRoundRect(rectF, f, f, this.paint);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        if (bounds.isEmpty()) {
            this.paint.setShader(null);
            return;
        }
        double width = bounds.width();
        double height = bounds.height();
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        float f = ((this.angle % 360.0f) + 360.0f) % 360.0f;
        double radians = Math.toRadians(f % 180.0f);
        float cos = (float) Math.cos(radians);
        float f2 = -((float) Math.sin(radians));
        float hypot = ((float) Math.hypot(width, height)) / 2.0f;
        float f3 = cos * hypot;
        float f4 = exactCenterX - f3;
        float f5 = f2 * hypot;
        float f6 = exactCenterY - f5;
        float f7 = exactCenterX + f3;
        float f8 = exactCenterY + f5;
        int[] iArr = this.colors;
        if (f >= 180.0f) {
            iArr = j73.V(iArr);
        }
        this.paint.setShader(new LinearGradient(f4, f6, f7, f8, iArr, (float[]) null, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
