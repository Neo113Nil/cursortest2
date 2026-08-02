package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import com.google.android.material.shape.c;
import defpackage.owt0;
import defpackage.tt91;
import defpackage.uir0;

/* loaded from: classes11.dex */
public class RippleDrawableCompat extends Drawable implements uir0 {
    private RippleDrawableCompatState drawableState;

    public RippleDrawableCompat(b bVar) {
        this(new RippleDrawableCompatState(new MaterialShapeDrawable(bVar)));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RippleDrawableCompatState rippleDrawableCompatState = this.drawableState;
        if (rippleDrawableCompatState.shouldDrawDelegate) {
            rippleDrawableCompatState.delegate.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.drawableState;
    }

    public owt0 getCornerSpringForce() {
        return this.drawableState.delegate.getCornerSpringForce();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.drawableState.delegate.getOpacity();
    }

    @Override // defpackage.uir0
    public b getShapeAppearanceModel() {
        return this.drawableState.delegate.getShapeAppearanceModel();
    }

    public c getStateListShapeAppearanceModel() {
        return this.drawableState.delegate.getStateListShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public RippleDrawableCompat mutate() {
        this.drawableState = new RippleDrawableCompatState(this.drawableState);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.drawableState.delegate.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.drawableState.delegate.setState(iArr)) {
            onStateChange = true;
        }
        boolean f = tt91.f(iArr);
        RippleDrawableCompatState rippleDrawableCompatState = this.drawableState;
        if (rippleDrawableCompatState.shouldDrawDelegate == f) {
            return onStateChange;
        }
        rippleDrawableCompatState.shouldDrawDelegate = f;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.drawableState.delegate.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.drawableState.delegate.setColorFilter(colorFilter);
    }

    public void setCornerSpringForce(owt0 owt0Var) {
        this.drawableState.delegate.setCornerSpringForce(owt0Var);
    }

    @Override // defpackage.uir0
    public void setShapeAppearanceModel(b bVar) {
        this.drawableState.delegate.setShapeAppearanceModel(bVar);
    }

    public void setStateListShapeAppearanceModel(c cVar) {
        this.drawableState.delegate.setShapeAppearance(cVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        this.drawableState.delegate.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.drawableState.delegate.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.drawableState.delegate.setTintMode(mode);
    }

    private RippleDrawableCompat(RippleDrawableCompatState rippleDrawableCompatState) {
        this.drawableState = rippleDrawableCompatState;
    }

    public static final class RippleDrawableCompatState extends Drawable.ConstantState {
        MaterialShapeDrawable delegate;
        boolean shouldDrawDelegate;

        public RippleDrawableCompatState(RippleDrawableCompatState rippleDrawableCompatState) {
            this.delegate = (MaterialShapeDrawable) rippleDrawableCompatState.delegate.getConstantState().newDrawable();
            this.shouldDrawDelegate = rippleDrawableCompatState.shouldDrawDelegate;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public RippleDrawableCompat newDrawable() {
            return new RippleDrawableCompat(new RippleDrawableCompatState(this));
        }

        public RippleDrawableCompatState(MaterialShapeDrawable materialShapeDrawable) {
            this.delegate = materialShapeDrawable;
            this.shouldDrawDelegate = false;
        }
    }
}
