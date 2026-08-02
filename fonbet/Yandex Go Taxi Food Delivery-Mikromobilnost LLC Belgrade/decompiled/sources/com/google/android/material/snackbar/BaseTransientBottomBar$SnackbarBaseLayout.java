package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.internal.e;
import com.google.android.material.shape.MaterialShapeDrawable;
import defpackage.bc5;
import defpackage.cc5;
import defpackage.d1t0;
import defpackage.eng0;
import defpackage.g810;
import defpackage.jx81;
import defpackage.org0;
import defpackage.vez0;
import defpackage.z2i0;
import defpackage.z610;

/* loaded from: classes11.dex */
public class BaseTransientBottomBar$SnackbarBaseLayout extends FrameLayout {
    private static final View.OnTouchListener consumeAllTouchListener = new View.OnTouchListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private final float actionTextColorAlpha;
    private boolean addingToTargetParent;
    private int animationMode;
    private final float backgroundOverlayColorAlpha;
    private ColorStateList backgroundTint;
    private PorterDuff.Mode backgroundTintMode;
    private b baseTransientBottomBar;
    private final int maxInlineActionWidth;
    private final int maxWidth;
    private Rect originalMargins;
    private final int originalPaddingEnd;
    com.google.android.material.shape.b shapeAppearanceModel;

    public BaseTransientBottomBar$SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
        super(g810.b(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, z2i0.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(z2i0.SnackbarLayout_elevation)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(z2i0.SnackbarLayout_elevation, 0));
        }
        this.animationMode = obtainStyledAttributes.getInt(z2i0.SnackbarLayout_animationMode, 0);
        if (obtainStyledAttributes.hasValue(z2i0.SnackbarLayout_shapeAppearance) || obtainStyledAttributes.hasValue(z2i0.SnackbarLayout_shapeAppearanceOverlay)) {
            this.shapeAppearanceModel = com.google.android.material.shape.b.j(context2, attributeSet, 0, 0).a();
        }
        this.backgroundOverlayColorAlpha = obtainStyledAttributes.getFloat(z2i0.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        setBackgroundTintList(jx81.o(context2, obtainStyledAttributes, z2i0.SnackbarLayout_backgroundTint));
        setBackgroundTintMode(e.j(obtainStyledAttributes.getInt(z2i0.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
        this.actionTextColorAlpha = obtainStyledAttributes.getFloat(z2i0.SnackbarLayout_actionTextColorAlpha, 1.0f);
        this.maxWidth = obtainStyledAttributes.getDimensionPixelSize(z2i0.SnackbarLayout_android_maxWidth, -1);
        this.maxInlineActionWidth = obtainStyledAttributes.getDimensionPixelSize(z2i0.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
        this.originalPaddingEnd = getPaddingEnd();
        setOnTouchListener(consumeAllTouchListener);
        setFocusable(true);
        if (getBackground() == null) {
            setBackground(createThemedBackground());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable createThemedBackground() {
        GradientDrawable gradientDrawable;
        int Q = vez0.Q(getBackgroundOverlayColorAlpha(), vez0.w(eng0.colorSurface, this), vez0.T(getContext(), z610.e(eng0.colorOnSurface, this)));
        com.google.android.material.shape.b bVar = this.shapeAppearanceModel;
        if (bVar != null) {
            FastOutSlowInInterpolator fastOutSlowInInterpolator = b.t;
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(bVar);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(Q));
            gradientDrawable = materialShapeDrawable;
        } else {
            Resources resources = getResources();
            FastOutSlowInInterpolator fastOutSlowInInterpolator2 = b.t;
            float dimension = resources.getDimension(org0.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(dimension);
            gradientDrawable2.setColor(Q);
            gradientDrawable = gradientDrawable2;
        }
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            gradientDrawable.setTintList(colorStateList);
        }
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(b bVar) {
        this.baseTransientBottomBar = bVar;
    }

    private void updateOriginalMargins(ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.originalMargins = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }

    public void addToTargetParent(ViewGroup viewGroup) {
        this.addingToTargetParent = true;
        viewGroup.addView(this);
        this.addingToTargetParent = false;
    }

    public float getActionTextColorAlpha() {
        return this.actionTextColorAlpha;
    }

    public int getAnimationMode() {
        return this.animationMode;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.backgroundOverlayColorAlpha;
    }

    public int getMaxInlineActionWidth() {
        return this.maxInlineActionWidth;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        b bVar = this.baseTransientBottomBar;
        if (bVar != null && (rootWindowInsets = bVar.i.getRootWindowInsets()) != null) {
            bVar.o = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            bVar.e();
        }
        requestApplyInsets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if ((r0 != null && r0.a.get() == r1) != false) goto L15;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDetachedFromWindow() {
        int i;
        boolean z;
        super.onDetachedFromWindow();
        b bVar = this.baseTransientBottomBar;
        if (bVar != null) {
            d b = d.b();
            cc5 cc5Var = bVar.s;
            synchronized (b.a) {
                i = 1;
                if (!b.c(cc5Var)) {
                    d1t0 d1t0Var = b.d;
                    z = false;
                }
                z = true;
            }
            if (z) {
                b.w.post(new bc5(bVar, i));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b bVar = this.baseTransientBottomBar;
        if (bVar == null || !bVar.q) {
            return;
        }
        bVar.d();
        bVar.q = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.maxWidth > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.maxWidth;
            if (measuredWidth > i3) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }
    }

    public void removeOrRestorePaddingEnd(boolean z) {
        setPaddingRelative(getPaddingStart(), getPaddingTop(), z ? 0 : this.originalPaddingEnd, getPaddingBottom());
    }

    public void setAnimationMode(int i) {
        this.animationMode = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.backgroundTint != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.backgroundTint);
            drawable.setTintMode(this.backgroundTintMode);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.backgroundTint = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.backgroundTintMode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.backgroundTintMode = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.addingToTargetParent || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        updateOriginalMargins((ViewGroup.MarginLayoutParams) layoutParams);
        b bVar = this.baseTransientBottomBar;
        if (bVar != null) {
            FastOutSlowInInterpolator fastOutSlowInInterpolator = b.t;
            bVar.e();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : consumeAllTouchListener);
        super.setOnClickListener(onClickListener);
    }

    public BaseTransientBottomBar$SnackbarBaseLayout(Context context) {
        this(context, null);
    }
}
