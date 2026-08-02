package com.yandex.plus.home.common.utils;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.jxi;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0012J\u0019\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00152\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0001H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000fH\u0017¢\u0006\u0004\b1\u0010\u0014J\u0011\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b5\u0010\u0014J\u000f\u00106\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u0010\u0014J\u000f\u00107\u001a\u00020\u000fH\u0016¢\u0006\u0004\b7\u0010\u0014J\u000f\u00108\u001a\u00020\u000fH\u0016¢\u0006\u0004\b8\u0010\u0014J\u0017\u0010:\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u000bH\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u0001H\u0016¢\u0006\u0004\b=\u0010\u0005J'\u0010B\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00152\u0006\u0010F\u001a\u00020\u000fH\u0014¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\b2\u0006\u0010I\u001a\u00020\u0015H\u0016¢\u0006\u0004\bJ\u0010\u0018J\u000f\u0010K\u001a\u00020\u0015H\u0016¢\u0006\u0004\bK\u0010\"J\u0017\u0010M\u001a\u00020\b2\u0006\u0010L\u001a\u00020\u000fH\u0016¢\u0006\u0004\bM\u0010\u0012J\u0019\u0010O\u001a\u00020\b2\b\u0010L\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bO\u0010PJ\u0019\u0010S\u001a\u00020\b2\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010X\u001a\u00020\b2\u0006\u0010V\u001a\u00020U2\u0006\u0010W\u001a\u00020UH\u0016¢\u0006\u0004\bX\u0010YJ/\u0010^\u001a\u00020\b2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000f2\u0006\u0010\\\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\u000fH\u0016¢\u0006\u0004\b^\u0010_R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010`¨\u0006a"}, d2 = {"Lcom/yandex/plus/home/common/utils/DrawableWrapper;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "wrapped", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "", "configs", "setChangingConfigurations", "(I)V", "getChangingConfigurations", "()I", "", "dither", "setDither", "(Z)V", "filter", "setFilterBitmap", CaretView.ALPHA_PROPERTY, "setAlpha", "Landroid/graphics/ColorFilter;", "cf", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "isStateful", "()Z", "", "stateSet", "setState", "([I)Z", "getState", "()[I", "jumpToCurrentState", "()V", "getCurrent", "()Landroid/graphics/drawable/Drawable;", "visible", "restart", "setVisible", "(ZZ)Z", "getOpacity", "Landroid/graphics/Region;", "getTransparentRegion", "()Landroid/graphics/Region;", "getIntrinsicWidth", "getIntrinsicHeight", "getMinimumWidth", "getMinimumHeight", "padding", "getPadding", "(Landroid/graphics/Rect;)Z", "who", "invalidateDrawable", "Ljava/lang/Runnable;", "what", "", "when", "scheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V", "unscheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V", "level", "onLevelChange", "(I)Z", "mirrored", "setAutoMirrored", "isAutoMirrored", "tint", "setTint", "Landroid/content/res/ColorStateList;", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "", RemoteBioParameters.X, RemoteBioParameters.Y, "setHotspot", "(FF)V", "left", "top", "right", "bottom", "setHotspotBounds", "(IIII)V", "Landroid/graphics/drawable/Drawable;", "homeless-core-android-extensions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public class DrawableWrapper extends Drawable implements Drawable.Callback {
    private final Drawable wrapped;

    public DrawableWrapper(Drawable drawable) {
        this.wrapped = drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.wrapped.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.wrapped.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.wrapped.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.wrapped.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.wrapped.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.wrapped.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.wrapped.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public int getOpacity() {
        return this.wrapped.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        return this.wrapped.getPadding(padding);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.wrapped.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.wrapped.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.wrapped.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.wrapped.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.wrapped.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        this.wrapped.setBounds(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int level) {
        return this.wrapped.setLevel(level);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        scheduleSelf(what, when);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.wrapped.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean mirrored) {
        this.wrapped.setAutoMirrored(mirrored);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int configs) {
        this.wrapped.setChangingConfigurations(configs);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter cf) {
        this.wrapped.setColorFilter(cf);
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public void setDither(boolean dither) {
        this.wrapped.setDither(dither);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean filter) {
        this.wrapped.setFilterBitmap(filter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float x, float y) {
        this.wrapped.setHotspot(x, y);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int left, int top, int right, int bottom) {
        this.wrapped.setHotspotBounds(left, top, right, bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] stateSet) {
        return this.wrapped.setState(stateSet);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int tint) {
        this.wrapped.setTint(tint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
        this.wrapped.setTintList(tint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode tintMode) {
        this.wrapped.setTintMode(tintMode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        return super.setVisible(visible, restart) || this.wrapped.setVisible(visible, restart);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable who, Runnable what) {
        unscheduleSelf(what);
    }
}
