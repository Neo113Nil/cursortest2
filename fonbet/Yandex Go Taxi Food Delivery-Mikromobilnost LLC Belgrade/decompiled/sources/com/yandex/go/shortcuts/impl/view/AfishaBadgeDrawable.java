package com.yandex.go.shortcuts.impl.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import defpackage.ui1;
import defpackage.vi1;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.background.PathFillDrawable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0002%B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u001c\u0010&\u001a\b\u0018\u00010%R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R*\u0010)\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u001e8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010 \"\u0004\b,\u0010-R*\u0010.\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u001e8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010*\u001a\u0004\b/\u0010 \"\u0004\b0\u0010-¨\u00061"}, d2 = {"Lcom/yandex/go/shortcuts/impl/view/AfishaBadgeDrawable;", "Lru/yandex/taxi/widget/background/PathFillDrawable;", "Lvi1;", "resourcesCache", "<init>", "(Lvi1;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Lzy11;", "resetPaint", "()V", "updatePaintIfNeeded", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "freeResources", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "padding", "", "getPadding", "(Landroid/graphics/Rect;)Z", "", "getIntrinsicHeight", "()I", "getIntrinsicWidth", "isAutoMirrored", "()Z", "Lvi1;", "Lui1;", "logoShaderContainer", "Lui1;", "value", "logoColor", CA20Status.STATUS_USER_I, "getLogoColor", "setLogoColor", "(I)V", "fillColor", "getFillColor", "setFillColor", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AfishaBadgeDrawable extends PathFillDrawable {
    private int fillColor;
    private int logoColor;
    private ui1 logoShaderContainer;
    private final vi1 resourcesCache;

    private AfishaBadgeDrawable(vi1 vi1Var) {
        this.resourcesCache = vi1Var;
        this.logoColor = vi1Var.e;
        this.fillColor = vi1Var.f;
    }

    private final void resetPaint() {
        getPaint().setShader(null);
        clearBitmap();
    }

    private final void updatePaintIfNeeded() {
        Drawable drawable;
        if (getPaint().getShader() != null) {
            return;
        }
        if (this.logoShaderContainer == null && (drawable = this.resourcesCache.g) != null) {
            this.logoShaderContainer = new ui1(drawable);
        }
        ui1 ui1Var = this.logoShaderContainer;
        if (ui1Var != null) {
            int i = this.logoColor;
            int i2 = this.fillColor;
            Canvas canvas = ui1Var.d;
            canvas.drawColor(i2);
            Drawable drawable2 = ui1Var.a;
            drawable2.setTint(i);
            drawable2.draw(canvas);
            getPaint().setShader(ui1Var.c);
            clearBitmap();
        }
    }

    @Override // ru.yandex.taxi.widget.background.PathFillDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        updatePaintIfNeeded();
        super.draw(canvas);
    }

    @Override // ru.yandex.taxi.widget.background.PathFillDrawable
    public void freeResources() {
        super.freeResources();
        resetPaint();
        ui1 ui1Var = this.logoShaderContainer;
        if (ui1Var != null) {
            ui1Var.b.recycle();
        }
        this.logoShaderContainer = null;
    }

    public final int getFillColor() {
        return this.fillColor;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.resourcesCache.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Rect rect = this.resourcesCache.b;
        return rect.left + rect.right;
    }

    public final int getLogoColor() {
        return this.logoColor;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        boolean isRtl = isRtl();
        vi1 vi1Var = this.resourcesCache;
        if (!isRtl) {
            padding.set(vi1Var.b);
            return true;
        }
        Rect rect = vi1Var.b;
        padding.set(rect.right, rect.top, rect.left, rect.bottom);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.background.PathFillDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        Path path = getPath();
        path.rewind();
        path.moveTo(bounds.right, bounds.top);
        path.lineTo(bounds.right - (bounds.width() * this.resourcesCache.c), bounds.bottom);
        path.lineTo(bounds.left, bounds.bottom);
        path.lineTo(bounds.left, (bounds.height() * this.resourcesCache.d) + bounds.top);
        path.close();
    }

    public final void setFillColor(int i) {
        if (this.fillColor != i) {
            this.fillColor = i;
            resetPaint();
            invalidateSelf();
        }
    }

    public final void setLogoColor(int i) {
        if (this.logoColor != i) {
            this.logoColor = i;
            resetPaint();
            invalidateSelf();
        }
    }

    @Override // ru.yandex.taxi.widget.background.PathFillDrawable, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
        setFillColor(tint != null ? tint.getDefaultColor() : this.resourcesCache.f);
    }

    public AfishaBadgeDrawable(Context context) {
        this(new vi1(context));
    }
}
