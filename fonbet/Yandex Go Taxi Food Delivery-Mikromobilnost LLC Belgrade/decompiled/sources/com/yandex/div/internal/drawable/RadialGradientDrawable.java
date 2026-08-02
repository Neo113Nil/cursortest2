package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.q5i0;
import defpackage.u5i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 <2\u00020\u0001:\u0003\u0004=\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010%\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable;", "Landroid/graphics/drawable/Drawable;", "Lu5i0;", "radius", "Lq5i0;", "centerX", "centerY", "", "colors", "", "positions", "<init>", "(Lu5i0;Lq5i0;Lq5i0;[I[F)V", "Landroid/graphics/Rect;", "bounds", "Lzy11;", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "getOpacity", "()I", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "Lu5i0;", "getRadius", "()Lu5i0;", "setRadius", "(Lu5i0;)V", "Lq5i0;", "getCenterX", "()Lq5i0;", "setCenterX", "(Lq5i0;)V", "getCenterY", "setCenterY", "[I", "getColors", "()[I", "setColors", "([I)V", "[F", "getPositions", "()[F", "setPositions", "([F)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "Companion", "com/yandex/div/internal/drawable/a", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RadialGradientDrawable extends Drawable {
    public static final a Companion = new a();
    private static final float MIN_GRADIENT_RADIUS = 0.01f;
    private q5i0 centerX;
    private q5i0 centerY;
    private int[] colors;
    private final Paint paint;
    private float[] positions;
    private u5i0 radius;
    private RectF rect;

    public RadialGradientDrawable(u5i0 u5i0Var, q5i0 q5i0Var, q5i0 q5i0Var2, int[] iArr, float[] fArr) {
        this.radius = u5i0Var;
        this.centerX = q5i0Var;
        this.centerY = q5i0Var2;
        this.colors = iArr;
        this.positions = fArr;
        this.paint = new Paint();
        this.rect = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawRect(this.rect, this.paint);
    }

    public final q5i0 getCenterX() {
        return this.centerX;
    }

    public final q5i0 getCenterY() {
        return this.centerY;
    }

    public final int[] getColors() {
        return this.colors;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    public final float[] getPositions() {
        return this.positions;
    }

    public final u5i0 getRadius() {
        return this.radius;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        Paint paint = this.paint;
        a aVar = Companion;
        u5i0 u5i0Var = this.radius;
        q5i0 q5i0Var = this.centerX;
        q5i0 q5i0Var2 = this.centerY;
        int[] iArr = this.colors;
        float[] fArr = this.positions;
        int width = bounds.width();
        int height = bounds.height();
        aVar.getClass();
        paint.setShader(a.b(u5i0Var, q5i0Var, q5i0Var2, iArr, fArr, width, height));
        this.rect.set(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
        invalidateSelf();
    }

    public final void setCenterX(q5i0 q5i0Var) {
        this.centerX = q5i0Var;
    }

    public final void setCenterY(q5i0 q5i0Var) {
        this.centerY = q5i0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setColors(int[] iArr) {
        this.colors = iArr;
    }

    public final void setPositions(float[] fArr) {
        this.positions = fArr;
    }

    public final void setRadius(u5i0 u5i0Var) {
        this.radius = u5i0Var;
    }

    public /* synthetic */ RadialGradientDrawable(u5i0 u5i0Var, q5i0 q5i0Var, q5i0 q5i0Var2, int[] iArr, float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(u5i0Var, q5i0Var, q5i0Var2, iArr, (i & 16) != 0 ? null : fArr);
    }
}
