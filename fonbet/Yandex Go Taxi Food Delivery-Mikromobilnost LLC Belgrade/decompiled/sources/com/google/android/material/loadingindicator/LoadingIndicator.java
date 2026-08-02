package com.google.android.material.loadingindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import defpackage.bk2;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.iog0;
import defpackage.ny61;
import defpackage.org0;
import defpackage.szy;
import defpackage.uzy;
import defpackage.vez0;
import defpackage.vzy;
import defpackage.yvy0;
import defpackage.z2i0;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class LoadingIndicator extends View implements Drawable.Callback {
    static final int DEF_STYLE_RES = g2i0.Widget_Material3_LoadingIndicator;
    static final int MAX_HIDE_DELAY = 1000;
    private final Runnable delayedHide;
    private final Runnable delayedShow;
    private final LoadingIndicatorDrawable drawable;
    private long lastShowStartTime;
    private final int minHideDelay;
    private final int showDelay;
    private final vzy specs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LoadingIndicator(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r4), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        this.lastShowStartTime = -1L;
        this.delayedShow = new szy(this, 0);
        this.delayedHide = new szy(this, 1);
        Context context2 = getContext();
        vzy vzyVar = new vzy();
        vzyVar.d = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(org0.m3_loading_indicator_shape_size);
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(org0.m3_loading_indicator_container_size);
        int[] iArr = z2i0.LoadingIndicator;
        yvy0.a(context2, attributeSet, i, i2);
        yvy0.b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        vzyVar.a = obtainStyledAttributes.getDimensionPixelSize(z2i0.LoadingIndicator_indicatorSize, dimensionPixelSize);
        vzyVar.b = obtainStyledAttributes.getDimensionPixelSize(z2i0.LoadingIndicator_containerWidth, dimensionPixelSize2);
        vzyVar.c = obtainStyledAttributes.getDimensionPixelSize(z2i0.LoadingIndicator_containerHeight, dimensionPixelSize2);
        if (!obtainStyledAttributes.hasValue(z2i0.LoadingIndicator_indicatorColor)) {
            Integer y = vez0.y(iog0.colorPrimary, context2);
            vzyVar.d = new int[]{y != null ? y.intValue() : -1};
        } else if (obtainStyledAttributes.peekValue(z2i0.LoadingIndicator_indicatorColor).type != 1) {
            vzyVar.d = new int[]{obtainStyledAttributes.getColor(z2i0.LoadingIndicator_indicatorColor, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(obtainStyledAttributes.getResourceId(z2i0.LoadingIndicator_indicatorColor, -1));
            vzyVar.d = intArray;
            if (intArray.length == 0) {
                ny61.g("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        vzyVar.e = obtainStyledAttributes.getColor(z2i0.LoadingIndicator_containerColor, 0);
        obtainStyledAttributes.recycle();
        LoadingIndicatorDrawable create = LoadingIndicatorDrawable.create(context2, vzyVar);
        this.drawable = create;
        create.setCallback(this);
        this.specs = create.getDrawingDelegate().a;
        int[] iArr2 = z2i0.LoadingIndicator;
        yvy0.a(context2, attributeSet, i, i2);
        yvy0.b(context2, attributeSet, iArr2, i, i2, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr2, i, i2);
        this.showDelay = obtainStyledAttributes2.getInt(z2i0.LoadingIndicator_showDelay, -1);
        this.minHideDelay = Math.min(obtainStyledAttributes2.getInt(z2i0.LoadingIndicator_minHideDelay, -1), 1000);
        obtainStyledAttributes2.recycle();
        setAnimatorDurationScaleProvider(new bk2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalHide() {
        getDrawable().setVisible(false, false, true);
        if (getDrawable().isVisible()) {
            return;
        }
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalShow() {
        if (this.minHideDelay > 0) {
            this.lastShowStartTime = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    public int getContainerColor() {
        return this.specs.e;
    }

    public int getContainerHeight() {
        return this.specs.c;
    }

    public int getContainerWidth() {
        return this.specs.b;
    }

    public LoadingIndicatorDrawable getDrawable() {
        return this.drawable;
    }

    public int[] getIndicatorColor() {
        return this.specs.d;
    }

    public int getIndicatorSize() {
        return this.specs.a;
    }

    public void hide() {
        if (getVisibility() != 0) {
            removeCallbacks(this.delayedShow);
            return;
        }
        removeCallbacks(this.delayedHide);
        long uptimeMillis = SystemClock.uptimeMillis() - this.lastShowStartTime;
        int i = this.minHideDelay;
        long j = i;
        Runnable runnable = this.delayedHide;
        if (uptimeMillis >= j) {
            runnable.run();
        } else {
            postDelayed(runnable, i - uptimeMillis);
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    public boolean isEffectivelyVisible() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (visibleToUser()) {
            internalShow();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingRight() + getPaddingLeft()), getHeight() - (getPaddingBottom() + getPaddingTop()));
        }
        this.drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        uzy drawingDelegate = this.drawable.getDrawingDelegate();
        vzy vzyVar = drawingDelegate.a;
        int paddingRight = getPaddingRight() + getPaddingLeft() + Math.max(vzyVar.c, vzyVar.a);
        vzy vzyVar2 = drawingDelegate.a;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + Math.max(vzyVar2.b, vzyVar2.a);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(size, paddingRight), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824);
        }
        if (mode2 == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size2, paddingBottom), 1073741824);
        } else if (mode2 == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.drawable.setBounds(0, 0, i, i2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.drawable.setVisible(visibleToUser(), false, i == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.drawable.setVisible(visibleToUser(), false, i == 0);
    }

    public void setAnimatorDurationScaleProvider(bk2 bk2Var) {
        this.drawable.animatorDurationScaleProvider = bk2Var;
    }

    public void setContainerColor(int i) {
        vzy vzyVar = this.specs;
        if (vzyVar.e != i) {
            vzyVar.e = i;
            invalidate();
        }
    }

    public void setContainerHeight(int i) {
        vzy vzyVar = this.specs;
        if (vzyVar.c != i) {
            vzyVar.c = i;
            requestLayout();
            invalidate();
        }
    }

    public void setContainerWidth(int i) {
        vzy vzyVar = this.specs;
        if (vzyVar.b != i) {
            vzyVar.b = i;
            requestLayout();
            invalidate();
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{vez0.x(getContext(), iog0.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.specs.d = iArr;
        a animatorDelegate = this.drawable.getAnimatorDelegate();
        animatorDelegate.a = 1;
        animatorDelegate.a(0.0f);
        animatorDelegate.h.a = animatorDelegate.f.d[0];
        invalidate();
    }

    public void setIndicatorSize(int i) {
        vzy vzyVar = this.specs;
        if (vzyVar.a != i) {
            vzyVar.a = i;
            requestLayout();
            invalidate();
        }
    }

    public void show() {
        int i = this.showDelay;
        Runnable runnable = this.delayedShow;
        if (i <= 0) {
            runnable.run();
        } else {
            removeCallbacks(runnable);
            postDelayed(this.delayedShow, this.showDelay);
        }
    }

    public boolean visibleToUser() {
        return isAttachedToWindow() && getWindowVisibility() == 0 && isEffectivelyVisible();
    }

    public LoadingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.loadingIndicatorStyle);
    }

    public LoadingIndicator(Context context) {
        this(context, null);
    }
}
