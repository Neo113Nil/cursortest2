package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import com.google.android.material.shape.c;
import defpackage.eja1;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.iog0;
import defpackage.jx81;
import defpackage.kp50;
import defpackage.n710;
import defpackage.owt0;
import defpackage.qke;
import defpackage.uir0;
import defpackage.vez0;
import defpackage.vng;
import defpackage.yvy0;
import defpackage.z2i0;
import defpackage.z610;

/* loaded from: classes11.dex */
public class MaterialCardView extends CardView implements Checkable, uir0 {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.cardview.widget.CardView";
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_END = 8388693;
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_START = 8388691;
    public static final int CHECKED_ICON_GRAVITY_TOP_END = 8388661;
    public static final int CHECKED_ICON_GRAVITY_TOP_START = 8388659;
    private static final String LOG_TAG = "MaterialCardView";
    private final a cardViewHelper;
    private boolean checked;
    private boolean dragged;
    private boolean isParentCardViewDoneInitializing;
    private n710 onCheckedChangeListener;
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DRAGGED_STATE_SET = {eng0.state_dragged};
    private static final int[] HOVERED_STATE_SET = {R.attr.state_hovered};
    private static final int DEF_STYLE_RES = g2i0.Widget_MaterialComponents_CardView;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r4), attributeSet, i);
        c h;
        int i2 = DEF_STYLE_RES;
        this.checked = false;
        this.dragged = false;
        this.isParentCardViewDoneInitializing = true;
        TypedArray d = yvy0.d(getContext(), attributeSet, z2i0.MaterialCardView, i, i2, new int[0]);
        a aVar = new a(this, attributeSet, i, i2);
        this.cardViewHelper = aVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        MaterialShapeDrawable materialShapeDrawable = aVar.c;
        materialShapeDrawable.setFillColor(cardBackgroundColor);
        aVar.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        aVar.l();
        MaterialCardView materialCardView = aVar.a;
        ColorStateList o = jx81.o(materialCardView.getContext(), d, z2i0.MaterialCardView_strokeColor);
        aVar.o = o;
        if (o == null) {
            aVar.o = ColorStateList.valueOf(-1);
        }
        aVar.i = d.getDimensionPixelSize(z2i0.MaterialCardView_strokeWidth, 0);
        boolean z = d.getBoolean(z2i0.MaterialCardView_android_checkable, false);
        aVar.t = z;
        materialCardView.setLongClickable(z);
        aVar.m = jx81.o(materialCardView.getContext(), d, z2i0.MaterialCardView_checkedIconTint);
        aVar.g(jx81.q(materialCardView.getContext(), d, z2i0.MaterialCardView_checkedIcon));
        aVar.g = d.getDimensionPixelSize(z2i0.MaterialCardView_checkedIconSize, 0);
        aVar.f = d.getDimensionPixelSize(z2i0.MaterialCardView_checkedIconMargin, 0);
        aVar.h = d.getInteger(z2i0.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList o2 = jx81.o(materialCardView.getContext(), d, z2i0.MaterialCardView_rippleColor);
        aVar.l = o2;
        if (o2 == null) {
            aVar.l = ColorStateList.valueOf(vez0.T(materialCardView.getContext(), z610.e(iog0.colorControlHighlight, materialCardView)));
        }
        ColorStateList o3 = jx81.o(materialCardView.getContext(), d, z2i0.MaterialCardView_cardForegroundColor);
        o3 = o3 == null ? ColorStateList.valueOf(0) : o3;
        MaterialShapeDrawable materialShapeDrawable2 = aVar.d;
        materialShapeDrawable2.setFillColor(o3);
        RippleDrawable rippleDrawable = aVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(aVar.l);
        }
        materialShapeDrawable.setElevation(materialCardView.getCardElevation());
        materialShapeDrawable2.setStroke(aVar.i, aVar.o);
        materialCardView.setBackgroundInternal(aVar.d(materialShapeDrawable));
        Drawable c = aVar.j() ? aVar.c() : materialShapeDrawable2;
        aVar.j = c;
        materialCardView.setForeground(aVar.d(c));
        if (aVar.e == -1.0f && (h = c.h(materialCardView.getContext(), d, z2i0.MaterialCardView_shapeAppearance)) != null) {
            owt0 Q = kp50.Q(materialCardView.getContext(), eng0.motionSpringFastSpatial, g2i0.Motion_Material3_Spring_Standard_Fast_Spatial);
            materialShapeDrawable.setCornerSpringForce(Q);
            materialShapeDrawable2.setCornerSpringForce(Q);
            MaterialShapeDrawable materialShapeDrawable3 = aVar.r;
            if (materialShapeDrawable3 != null) {
                materialShapeDrawable3.setCornerSpringForce(Q);
            }
            aVar.h(h);
        }
        d.recycle();
    }

    private void forceRippleRedrawIfNeeded() {
        a aVar = this.cardViewHelper;
        RippleDrawable rippleDrawable = aVar.p;
        if (rippleDrawable != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i = bounds.bottom;
            aVar.p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            aVar.p.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.cardViewHelper.c.getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.cardViewHelper.c.getFillColor();
    }

    public ColorStateList getCardForegroundColor() {
        return this.cardViewHelper.d.getFillColor();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.cardViewHelper.k;
    }

    public int getCheckedIconGravity() {
        return this.cardViewHelper.h;
    }

    public int getCheckedIconMargin() {
        return this.cardViewHelper.f;
    }

    public int getCheckedIconSize() {
        return this.cardViewHelper.g;
    }

    public ColorStateList getCheckedIconTint() {
        return this.cardViewHelper.m;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.cardViewHelper.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.cardViewHelper.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.cardViewHelper.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.cardViewHelper.b.top;
    }

    public float getProgress() {
        return this.cardViewHelper.c.getInterpolation();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.cardViewHelper.c.getTopLeftCornerResolvedSize();
    }

    public ColorStateList getRippleColor() {
        return this.cardViewHelper.l;
    }

    @Override // defpackage.uir0
    public b getShapeAppearanceModel() {
        return this.cardViewHelper.n.c();
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.cardViewHelper.o;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.cardViewHelper.o;
    }

    public int getStrokeWidth() {
        return this.cardViewHelper.i;
    }

    public boolean isCheckable() {
        a aVar = this.cardViewHelper;
        return aVar != null && aVar.t;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    public boolean isDragged() {
        return this.dragged;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.cardViewHelper.k();
        eja1.B(this, this.cardViewHelper.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 8);
        if (isCheckable()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        if (isDragged()) {
            View.mergeDrawableStates(onCreateDrawableState, DRAGGED_STATE_SET);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.PRESSED_STATE_SET);
            }
            if (isHovered()) {
                View.mergeDrawableStates(onCreateDrawableState, HOVERED_STATE_SET);
            }
            if (isEnabled()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.ENABLED_STATE_SET);
            }
            if (isFocused()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.FOCUSED_STATE_SET);
            }
            if (isSelected()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.SELECTED_STATE_SET);
            }
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.cardViewHelper.e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAncestorContentPadding(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.isParentCardViewDoneInitializing) {
            if (!this.cardViewHelper.s) {
                Log.i(LOG_TAG, "Setting a custom background is not supported.");
                this.cardViewHelper.s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        a aVar = this.cardViewHelper;
        aVar.c.setFillColor(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        a aVar = this.cardViewHelper;
        aVar.c.setElevation(aVar.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.cardViewHelper.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.setFillColor(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.cardViewHelper.t = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.checked != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.cardViewHelper.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        a aVar = this.cardViewHelper;
        if (aVar.h != i) {
            aVar.h = i;
            MaterialCardView materialCardView = aVar.a;
            aVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.cardViewHelper.f = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.cardViewHelper.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.cardViewHelper.g(vng.t(i, getContext()));
    }

    public void setCheckedIconSize(int i) {
        this.cardViewHelper.g = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.cardViewHelper.g = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a aVar = this.cardViewHelper;
        aVar.m = colorStateList;
        Drawable drawable = aVar.k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        a aVar = this.cardViewHelper;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i, int i2, int i3, int i4) {
        a aVar = this.cardViewHelper;
        aVar.b.set(i, i2, i3, i4);
        aVar.l();
    }

    public void setDragged(boolean z) {
        if (this.dragged != z) {
            this.dragged = z;
            refreshDrawableState();
            forceRippleRedrawIfNeeded();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.cardViewHelper.m();
    }

    public void setOnCheckedChangeListener(n710 n710Var) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.cardViewHelper.m();
        this.cardViewHelper.l();
    }

    public void setProgress(float f) {
        a aVar = this.cardViewHelper;
        aVar.c.setInterpolation(f);
        MaterialShapeDrawable materialShapeDrawable = aVar.d;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setInterpolation(f);
        }
        MaterialShapeDrawable materialShapeDrawable2 = aVar.r;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setInterpolation(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        a aVar = this.cardViewHelper;
        aVar.e = f;
        aVar.h(aVar.n.c().a(f));
        aVar.j.invalidateSelf();
        if (aVar.i() || (aVar.a.getPreventCornerOverlap() && !aVar.c.isRoundRect())) {
            aVar.l();
        }
        if (aVar.i()) {
            aVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.cardViewHelper;
        aVar.l = colorStateList;
        RippleDrawable rippleDrawable = aVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        a aVar = this.cardViewHelper;
        ColorStateList m = qke.m(i, getContext());
        aVar.l = m;
        RippleDrawable rippleDrawable = aVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(m);
        }
    }

    @Override // defpackage.uir0
    public void setShapeAppearanceModel(b bVar) {
        setClipToOutline(bVar.l(getBoundsAsRectF()));
        this.cardViewHelper.h(bVar);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        a aVar = this.cardViewHelper;
        if (aVar.o != colorStateList) {
            aVar.o = colorStateList;
            aVar.d.setStroke(aVar.i, colorStateList);
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        a aVar = this.cardViewHelper;
        if (i != aVar.i) {
            aVar.i = i;
            aVar.d.setStroke(i, aVar.o);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.cardViewHelper.m();
        this.cardViewHelper.l();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (isCheckable() && isEnabled()) {
            this.checked = !this.checked;
            refreshDrawableState();
            forceRippleRedrawIfNeeded();
            this.cardViewHelper.f(this.checked, true);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.cardViewHelper.c.setFillColor(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.materialCardViewStyle);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
