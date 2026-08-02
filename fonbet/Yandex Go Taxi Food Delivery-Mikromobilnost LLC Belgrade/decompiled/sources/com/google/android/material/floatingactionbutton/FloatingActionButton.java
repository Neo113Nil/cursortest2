package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.stateful.ExtendableSavedState;
import defpackage.ab30;
import defpackage.eja1;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.jx81;
import defpackage.mum;
import defpackage.ny61;
import defpackage.or2;
import defpackage.org0;
import defpackage.qw01;
import defpackage.rxi;
import defpackage.sr2;
import defpackage.tor;
import defpackage.tt91;
import defpackage.uir0;
import defpackage.uqg0;
import defpackage.wor;
import defpackage.ycs0;
import defpackage.yoo;
import defpackage.yvy0;
import defpackage.z2i0;
import defpackage.zoo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements yoo, uir0, androidx.coordinatorlayout.widget.a {
    static final String ACCESSIBIILTY_FAB_ROLE = "com.google.android.material.floatingactionbutton.FloatingActionButton";
    private static final int AUTO_MINI_LARGEST_SCREEN_WIDTH = 470;
    private static final int DEF_STYLE_RES = g2i0.Widget_Design_FloatingActionButton;
    private static final String EXPANDABLE_WIDGET_HELPER_KEY = "expandableWidgetHelper";
    private static final String LOG_TAG = "FloatingActionButton";
    public static final int NO_CUSTOM_SIZE = 0;
    public static final int SIZE_AUTO = -1;
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL = 0;
    private ColorStateList backgroundTint;
    private PorterDuff.Mode backgroundTintMode;
    private int borderWidth;
    boolean compatPadding;
    private int customSize;
    private final zoo expandableWidgetHelper;
    private final sr2 imageHelper;
    private PorterDuff.Mode imageMode;
    private int imagePadding;
    private ColorStateList imageTint;
    private f impl;
    private int maxImageSize;
    private ColorStateList rippleColor;
    final Rect shadowPadding;
    private int size;
    private final Rect touchArea;

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r5), attributeSet, i);
        ColorStateList colorStateList;
        FloatingActionButton floatingActionButton;
        Drawable drawable;
        Drawable drawable2;
        int i2 = DEF_STYLE_RES;
        this.shadowPadding = new Rect();
        this.touchArea = new Rect();
        Context context2 = getContext();
        TypedArray d = yvy0.d(context2, attributeSet, z2i0.FloatingActionButton, i, i2, new int[0]);
        this.backgroundTint = jx81.o(context2, d, z2i0.FloatingActionButton_backgroundTint);
        this.backgroundTintMode = com.google.android.material.internal.e.j(d.getInt(z2i0.FloatingActionButton_backgroundTintMode, -1), null);
        this.rippleColor = jx81.o(context2, d, z2i0.FloatingActionButton_rippleColor);
        this.size = d.getInt(z2i0.FloatingActionButton_fabSize, -1);
        this.customSize = d.getDimensionPixelSize(z2i0.FloatingActionButton_fabCustomSize, 0);
        this.borderWidth = d.getDimensionPixelSize(z2i0.FloatingActionButton_borderWidth, 0);
        float dimension = d.getDimension(z2i0.FloatingActionButton_elevation, 0.0f);
        float dimension2 = d.getDimension(z2i0.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = d.getDimension(z2i0.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.compatPadding = d.getBoolean(z2i0.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(org0.mtrl_fab_min_touch_target);
        setMaxImageSize(d.getDimensionPixelSize(z2i0.FloatingActionButton_maxImageSize, 0));
        ab30 a2 = ab30.a(context2, d, z2i0.FloatingActionButton_showMotionSpec);
        ab30 a3 = ab30.a(context2, d, z2i0.FloatingActionButton_hideMotionSpec);
        com.google.android.material.shape.b a4 = com.google.android.material.shape.b.h(context2, attributeSet, i, i2, com.google.android.material.shape.b.m).a();
        boolean z = d.getBoolean(z2i0.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(d.getBoolean(z2i0.FloatingActionButton_android_enabled, true));
        d.recycle();
        sr2 sr2Var = new sr2(this);
        this.imageHelper = sr2Var;
        sr2Var.b(attributeSet, i);
        this.expandableWidgetHelper = new zoo(this);
        getImpl().h(a4);
        f impl = getImpl();
        ColorStateList colorStateList2 = this.backgroundTint;
        PorterDuff.Mode mode = this.backgroundTintMode;
        ColorStateList colorStateList3 = this.rippleColor;
        int i3 = this.borderWidth;
        FloatingActionButton floatingActionButton2 = impl.v;
        final com.google.android.material.shape.b bVar = impl.a;
        bVar.getClass();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(bVar) { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$AlwaysStatefulMaterialShapeDrawable
            @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
            public boolean isStateful() {
                return true;
            }
        };
        impl.b = materialShapeDrawable;
        materialShapeDrawable.setTintList(colorStateList2);
        if (mode != null) {
            impl.b.setTintMode(mode);
        }
        impl.b.initializeElevationOverlay(floatingActionButton2.getContext());
        if (i3 > 0) {
            Context context3 = floatingActionButton2.getContext();
            com.google.android.material.shape.b bVar2 = impl.a;
            bVar2.getClass();
            BorderDrawable borderDrawable = new BorderDrawable(bVar2);
            colorStateList = colorStateList3;
            floatingActionButton = floatingActionButton2;
            borderDrawable.setGradientColors(context3.getColor(uqg0.design_fab_stroke_top_outer_color), context3.getColor(uqg0.design_fab_stroke_top_inner_color), context3.getColor(uqg0.design_fab_stroke_end_inner_color), context3.getColor(uqg0.design_fab_stroke_end_outer_color));
            borderDrawable.setBorderWidth(i3);
            borderDrawable.setBorderTint(colorStateList2);
            impl.d = borderDrawable;
            BorderDrawable borderDrawable2 = impl.d;
            borderDrawable2.getClass();
            MaterialShapeDrawable materialShapeDrawable2 = impl.b;
            materialShapeDrawable2.getClass();
            drawable2 = new LayerDrawable(new Drawable[]{borderDrawable2, materialShapeDrawable2});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            floatingActionButton = floatingActionButton2;
            drawable = null;
            impl.d = null;
            drawable2 = impl.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(tt91.e(colorStateList), drawable2, drawable);
        impl.c = rippleDrawable;
        FocusRingDrawable.layer(floatingActionButton.getContext(), rippleDrawable, impl.b);
        impl.e = rippleDrawable;
        getImpl().k = dimensionPixelSize;
        f impl2 = getImpl();
        if (impl2.h != dimension) {
            impl2.h = dimension;
            impl2.e(dimension, impl2.i, impl2.j);
        }
        f impl3 = getImpl();
        if (impl3.i != dimension2) {
            impl3.i = dimension2;
            impl3.e(impl3.h, dimension2, impl3.j);
        }
        f impl4 = getImpl();
        if (impl4.j != dimension3) {
            impl4.j = dimension3;
            impl4.e(impl4.h, impl4.i, dimension3);
        }
        getImpl().n = a2;
        getImpl().o = a3;
        getImpl().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private f getImpl() {
        if (this.impl == null) {
            this.impl = new f(this, new mum(this));
        }
        return this.impl;
    }

    private int getSizeDimension(int i) {
        int i2 = this.customSize;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(org0.design_fab_size_normal) : resources.getDimensionPixelSize(org0.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < AUTO_MINI_LARGEST_SCREEN_WIDTH ? getSizeDimension(1) : getSizeDimension(0);
    }

    private void getTouchTargetRect(Rect rect) {
        getMeasuredContentRect(rect);
        f fVar = this.impl;
        int i = -(fVar.f ? Math.max((fVar.k - fVar.v.getSizeDimension()) / 2, 0) : 0);
        rect.inset(i, i);
    }

    private void offsetRectWithShadow(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.shadowPadding;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void onApplySupportImageTint() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.imageTint;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.imageMode;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(or2.c(colorForState, mode));
    }

    private void updateTooltip() {
        setTooltipText(isClickable() ? getContentDescription() : null);
    }

    private wor wrapOnVisibilityChangedListener(a aVar) {
        if (aVar == null) {
            return null;
        }
        return new e(this, aVar);
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        f impl = getImpl();
        if (impl.t == null) {
            impl.t = new ArrayList();
        }
        impl.t.add(animatorListener);
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        f impl = getImpl();
        if (impl.s == null) {
            impl.s = new ArrayList();
        }
        impl.s.add(animatorListener);
    }

    public void addTransformationCallback(qw01 qw01Var) {
        f impl = getImpl();
        tor torVar = new tor(this, qw01Var);
        if (impl.u == null) {
            impl.u = new ArrayList();
        }
        impl.u.add(torVar);
    }

    public void clearCustomSize() {
        setCustomSize(0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ACCESSIBIILTY_FAB_ROLE;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.backgroundTint;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public CoordinatorLayout.a getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().v.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().e;
    }

    @Deprecated
    public boolean getContentRect(Rect rect) {
        if (!isLaidOut()) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        offsetRectWithShadow(rect);
        return true;
    }

    public int getCustomSize() {
        return this.customSize;
    }

    public int getExpandedComponentIdHint() {
        return this.expandableWidgetHelper.c;
    }

    public ab30 getHideMotionSpec() {
        return getImpl().o;
    }

    public void getMeasuredContentRect(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        offsetRectWithShadow(rect);
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.rippleColor;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.rippleColor;
    }

    @Override // defpackage.uir0
    public com.google.android.material.shape.b getShapeAppearanceModel() {
        com.google.android.material.shape.b bVar = getImpl().a;
        bVar.getClass();
        return bVar;
    }

    public ab30 getShowMotionSpec() {
        return getImpl().n;
    }

    public int getSize() {
        return this.size;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.imageTint;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.imageMode;
    }

    public boolean getUseCompatPadding() {
        return this.compatPadding;
    }

    public void hide(a aVar, final boolean z) {
        final f impl = getImpl();
        final wor wrapOnVisibilityChangedListener = wrapOnVisibilityChangedListener(aVar);
        FloatingActionButton floatingActionButton = impl.v;
        FloatingActionButton floatingActionButton2 = impl.v;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.r;
        if (visibility == 0) {
            if (i == 1) {
                return;
            }
        } else if (i != 2) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton2.internalSetVisibility(z ? 8 : 4, z);
            if (wrapOnVisibilityChangedListener != null) {
                e eVar = (e) wrapOnVisibilityChangedListener;
                eVar.a.a(eVar.b);
                return;
            }
            return;
        }
        ab30 ab30Var = impl.o;
        AnimatorSet b = ab30Var != null ? impl.b(ab30Var, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, f.E, f.F);
        b.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$1
            private boolean cancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                this.cancelled = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                f fVar = f.this;
                fVar.r = 0;
                fVar.m = null;
                if (this.cancelled) {
                    return;
                }
                FloatingActionButton floatingActionButton3 = fVar.v;
                boolean z2 = z;
                floatingActionButton3.internalSetVisibility(z2 ? 8 : 4, z2);
                wor worVar = wrapOnVisibilityChangedListener;
                if (worVar != null) {
                    e eVar2 = (e) worVar;
                    eVar2.a.a(eVar2.b);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                f.this.v.internalSetVisibility(0, z);
                f fVar = f.this;
                fVar.r = 1;
                fVar.m = animator2;
                this.cancelled = false;
            }
        });
        ArrayList arrayList = impl.t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b.addListener((Animator.AnimatorListener) it.next());
            }
        }
        b.start();
    }

    @Override // defpackage.yoo
    public boolean isExpanded() {
        return this.expandableWidgetHelper.b;
    }

    public boolean isOrWillBeHidden() {
        f impl = getImpl();
        int visibility = impl.v.getVisibility();
        int i = impl.r;
        if (visibility == 0) {
            if (i != 1) {
                return false;
            }
        } else if (i == 2) {
            return false;
        }
        return true;
    }

    public boolean isOrWillBeShown() {
        f impl = getImpl();
        int visibility = impl.v.getVisibility();
        int i = impl.r;
        if (visibility != 0) {
            if (i != 2) {
                return false;
            }
        } else if (i == 1) {
            return false;
        }
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f impl = getImpl();
        MaterialShapeDrawable materialShapeDrawable = impl.b;
        if (materialShapeDrawable != null) {
            eja1.B(impl.v, materialShapeDrawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().v.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.imagePadding = (sizeDimension - this.maxImageSize) / 2;
        getImpl().i();
        int min = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.shadowPadding;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.getSuperState());
        zoo zooVar = this.expandableWidgetHelper;
        Bundle bundle = (Bundle) extendableSavedState.extendableStates.get(EXPANDABLE_WIDGET_HELPER_KEY);
        bundle.getClass();
        zooVar.getClass();
        zooVar.b = bundle.getBoolean("expanded", false);
        zooVar.c = bundle.getInt("expandedComponentIdHint", 0);
        if (zooVar.b) {
            FloatingActionButton floatingActionButton = zooVar.a;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).dispatchDependentViewsChanged(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        ycs0 ycs0Var = extendableSavedState.extendableStates;
        zoo zooVar = this.expandableWidgetHelper;
        zooVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", zooVar.b);
        bundle.putInt("expandedComponentIdHint", zooVar.c);
        ycs0Var.put(EXPANDABLE_WIDGET_HELPER_KEY, bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getTouchTargetRect(this.touchArea);
            if (!this.touchArea.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = getImpl().t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = getImpl().s;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void removeTransformationCallback(qw01 qw01Var) {
        f impl = getImpl();
        tor torVar = new tor(this, qw01Var);
        ArrayList arrayList = impl.u;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(torVar);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i(LOG_TAG, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i(LOG_TAG, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i(LOG_TAG, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.backgroundTint != colorStateList) {
            this.backgroundTint = colorStateList;
            f impl = getImpl();
            MaterialShapeDrawable materialShapeDrawable = impl.b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintList(colorStateList);
            }
            BorderDrawable borderDrawable = impl.d;
            if (borderDrawable != null) {
                borderDrawable.setBorderTint(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.backgroundTintMode != mode) {
            this.backgroundTintMode = mode;
            MaterialShapeDrawable materialShapeDrawable = getImpl().b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        updateTooltip();
    }

    public void setCompatElevation(float f) {
        f impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.e(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        f impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.e(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        f impl = getImpl();
        if (impl.j != f) {
            impl.j = f;
            impl.e(impl.h, impl.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        updateTooltip();
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            ny61.g("Custom size must be non-negative");
        } else if (i != this.customSize) {
            this.customSize = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeDrawable materialShapeDrawable = getImpl().b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f) {
            getImpl().f = z;
            requestLayout();
        }
    }

    public boolean setExpanded(boolean z) {
        zoo zooVar = this.expandableWidgetHelper;
        if (zooVar.b == z) {
            return false;
        }
        zooVar.b = z;
        FloatingActionButton floatingActionButton = zooVar.a;
        ViewParent parent = floatingActionButton.getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return true;
        }
        ((CoordinatorLayout) parent).dispatchDependentViewsChanged(floatingActionButton);
        return true;
    }

    public void setExpandedComponentIdHint(int i) {
        this.expandableWidgetHelper.c = i;
    }

    public void setHideMotionSpec(ab30 ab30Var) {
        getImpl().o = ab30Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(ab30.b(i, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            f impl = getImpl();
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.A;
            impl.a(f, matrix);
            impl.v.setImageMatrix(matrix);
            if (this.imageTint != null) {
                onApplySupportImageTint();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.imageHelper.c(i);
        onApplySupportImageTint();
    }

    public void setMaxImageSize(int i) {
        this.maxImageSize = i;
        f impl = getImpl();
        if (impl.q != i) {
            impl.q = i;
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.A;
            impl.a(f, matrix);
            impl.v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            f impl = getImpl();
            ColorStateList colorStateList2 = this.rippleColor;
            RippleDrawable rippleDrawable = impl.c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(tt91.e(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(tt91.e(colorStateList2));
            }
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().f();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().f();
    }

    public void setShadowPaddingEnabled(boolean z) {
        f impl = getImpl();
        impl.g = z;
        impl.i();
    }

    @Override // defpackage.uir0
    public void setShapeAppearanceModel(com.google.android.material.shape.b bVar) {
        getImpl().h(bVar);
    }

    public void setShowMotionSpec(ab30 ab30Var) {
        getImpl().n = ab30Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(ab30.b(i, getContext()));
    }

    public void setSize(int i) {
        this.customSize = 0;
        if (i != this.size) {
            this.size = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.imageTint != colorStateList) {
            this.imageTint = colorStateList;
            onApplySupportImageTint();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.imageMode != mode) {
            this.imageMode = mode;
            onApplySupportImageTint();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().g();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().g();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().g();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.compatPadding != z) {
            this.compatPadding = z;
            getImpl().i();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return getImpl().f;
    }

    public void show(a aVar, final boolean z) {
        final f impl = getImpl();
        final wor wrapOnVisibilityChangedListener = wrapOnVisibilityChangedListener(aVar);
        FloatingActionButton floatingActionButton = impl.v;
        Matrix matrix = impl.A;
        FloatingActionButton floatingActionButton2 = impl.v;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.r;
        if (visibility != 0) {
            if (i == 2) {
                return;
            }
        } else if (i != 1) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = impl.n == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.internalSetVisibility(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            if (wrapOnVisibilityChangedListener != null) {
                ((e) wrapOnVisibilityChangedListener).a.b();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z2 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z2 ? 0.4f : 0.0f);
            float f = z2 ? 0.4f : 0.0f;
            impl.p = f;
            impl.a(f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        ab30 ab30Var = impl.n;
        AnimatorSet b = ab30Var != null ? impl.b(ab30Var, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, f.C, f.D);
        b.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                f fVar = f.this;
                fVar.r = 0;
                fVar.m = null;
                wor worVar = wrapOnVisibilityChangedListener;
                if (worVar != null) {
                    ((e) worVar).a.b();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                f.this.v.internalSetVisibility(0, z);
                f fVar = f.this;
                fVar.r = 2;
                fVar.m = animator2;
            }
        });
        ArrayList arrayList = impl.s;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b.addListener((Animator.AnimatorListener) it.next());
            }
        }
        b.start();
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.a {
        public Rect a;
        public final boolean b;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2i0.FloatingActionButton_Behavior_Layout);
            this.b = obtainStyledAttributes.getBoolean(z2i0.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final boolean a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.shadowPadding;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final void d(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                u(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) {
                    v(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = dependencies.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) && v(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (u(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i);
            Rect rect = floatingActionButton.shadowPadding;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    WeakHashMap weakHashMap = androidx.core.view.b.a;
                    floatingActionButton.offsetTopAndBottom(i2);
                }
                if (i4 != 0) {
                    WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                    floatingActionButton.offsetLeftAndRight(i4);
                }
            }
            return true;
        }

        public final boolean u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            if (!this.b || layoutParams.getAnchorId() != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            rxi.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.hide(null, false);
                return true;
            }
            floatingActionButton.show(null, false);
            return true;
        }

        public final boolean v(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            if (!this.b || layoutParams.getAnchorId() != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.hide(null, false);
                return true;
            }
            floatingActionButton.show(null, false);
            return true;
        }

        public BaseBehavior() {
            this.b = true;
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public int getSizeDimension() {
        return getSizeDimension(this.size);
    }

    public void hide(a aVar) {
        hide(aVar, true);
    }

    public void hide() {
        hide(null);
    }

    public void show(a aVar) {
        show(aVar, true);
    }

    public void show() {
        show(null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }
}
