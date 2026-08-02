package xsna;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.R$attr;

/* compiled from: MaterialSwitch.java */
/* loaded from: classes.dex */
public final class tm10 extends SwitchCompat {
    public static final int[] k0 = {R$attr.state_with_icon};

    @Nullable
    public Drawable U;

    @Nullable
    public Drawable V;
    public int W;

    @Nullable
    public Drawable a0;

    @Nullable
    public Drawable b0;

    @Nullable
    public ColorStateList c0;

    @Nullable
    public ColorStateList d0;

    @NonNull
    public PorterDuff.Mode e0;

    @Nullable
    public ColorStateList f0;

    @Nullable
    public ColorStateList g0;

    @NonNull
    public PorterDuff.Mode h0;
    public int[] i0;
    public int[] j0;

    public static void g(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @NonNull int[] iArr, @NonNull int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(n8g.d(f, colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0)));
    }

    public final void e() {
        this.U = tko.b(this.U, this.c0, getThumbTintMode());
        this.V = tko.b(this.V, this.d0, this.e0);
        h();
        Drawable drawable = this.U;
        Drawable drawable2 = this.V;
        int i = this.W;
        super.setThumbDrawable(tko.a(i, i, drawable, drawable2));
        refreshDrawableState();
    }

    public final void f() {
        this.a0 = tko.b(this.a0, this.f0, getTrackTintMode());
        this.b0 = tko.b(this.b0, this.g0, this.h0);
        h();
        Drawable drawable = this.a0;
        if (drawable != null && this.b0 != null) {
            drawable = new LayerDrawable(new Drawable[]{this.a0, this.b0});
        } else if (drawable == null) {
            drawable = this.b0;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getThumbDrawable() {
        return this.U;
    }

    @Nullable
    public Drawable getThumbIconDrawable() {
        return this.V;
    }

    public int getThumbIconSize() {
        return this.W;
    }

    @Nullable
    public ColorStateList getThumbIconTintList() {
        return this.d0;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.e0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getThumbTintList() {
        return this.c0;
    }

    @Nullable
    public Drawable getTrackDecorationDrawable() {
        return this.b0;
    }

    @Nullable
    public ColorStateList getTrackDecorationTintList() {
        return this.g0;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.h0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getTrackDrawable() {
        return this.a0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f0;
    }

    public final void h() {
        if (this.c0 == null && this.d0 == null && this.f0 == null && this.g0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.c0;
        if (colorStateList != null) {
            g(this.U, colorStateList, this.i0, this.j0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.d0;
        if (colorStateList2 != null) {
            g(this.V, colorStateList2, this.i0, this.j0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f0;
        if (colorStateList3 != null) {
            g(this.a0, colorStateList3, this.i0, this.j0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.g0;
        if (colorStateList4 != null) {
            g(this.b0, colorStateList4, this.i0, this.j0, thumbPosition);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        h();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.V != null) {
            View.mergeDrawableStates(onCreateDrawableState, k0);
        }
        int[] iArr = new int[onCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : onCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.i0 = iArr;
        this.j0 = tko.c(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@Nullable Drawable drawable) {
        this.U = drawable;
        e();
    }

    public void setThumbIconDrawable(@Nullable Drawable drawable) {
        this.V = drawable;
        e();
    }

    public void setThumbIconResource(int i) {
        setThumbIconDrawable(m33.a(i, getContext()));
    }

    public void setThumbIconSize(int i) {
        if (this.W != i) {
            this.W = i;
            e();
        }
    }

    public void setThumbIconTintList(@Nullable ColorStateList colorStateList) {
        this.d0 = colorStateList;
        e();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.e0 = mode;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.c0 = colorStateList;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        e();
    }

    public void setTrackDecorationDrawable(@Nullable Drawable drawable) {
        this.b0 = drawable;
        f();
    }

    public void setTrackDecorationResource(int i) {
        setTrackDecorationDrawable(m33.a(i, getContext()));
    }

    public void setTrackDecorationTintList(@Nullable ColorStateList colorStateList) {
        this.g0 = colorStateList;
        f();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.h0 = mode;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@Nullable Drawable drawable) {
        this.a0 = drawable;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f0 = colorStateList;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        f();
    }
}
