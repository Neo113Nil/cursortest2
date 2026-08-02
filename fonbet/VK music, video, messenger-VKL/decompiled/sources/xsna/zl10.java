package xsna;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.MaterialShapeDrawable;

/* compiled from: MaterialCardView.java */
/* loaded from: classes13.dex */
public class zl10 extends CardView implements Checkable, l6j0 {
    public static final int[] m = {R.attr.state_checkable};
    public static final int[] n = {R.attr.state_checked};
    public static final int[] o = {R$attr.state_dragged};
    public static final int p = R$style.Widget_MaterialComponents_CardView;

    @NonNull
    public final bm10 i;
    public final boolean j;
    public boolean k;
    public boolean l;

    /* compiled from: MaterialCardView.java */
    public interface a {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zl10(Context context) {
        super(zm10.a(context, null, r3, r4), null, r3);
        int i = R$attr.materialCardViewStyle;
        int i2 = p;
        this.k = false;
        this.l = false;
        this.j = true;
        TypedArray d = fpo0.d(getContext(), null, R$styleable.MaterialCardView, i, i2, new int[0]);
        bm10 bm10Var = new bm10(this, i);
        this.i = bm10Var;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        MaterialShapeDrawable materialShapeDrawable = bm10Var.c;
        materialShapeDrawable.setFillColor(cardBackgroundColor);
        bm10Var.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        bm10Var.l();
        zl10 zl10Var = bm10Var.a;
        ColorStateList a2 = qm10.a(zl10Var.getContext(), d, R$styleable.MaterialCardView_strokeColor);
        bm10Var.n = a2;
        if (a2 == null) {
            bm10Var.n = ColorStateList.valueOf(-1);
        }
        bm10Var.h = d.getDimensionPixelSize(R$styleable.MaterialCardView_strokeWidth, 0);
        boolean z = d.getBoolean(R$styleable.MaterialCardView_android_checkable, false);
        bm10Var.s = z;
        zl10Var.setLongClickable(z);
        bm10Var.l = qm10.a(zl10Var.getContext(), d, R$styleable.MaterialCardView_checkedIconTint);
        bm10Var.g(qm10.d(zl10Var.getContext(), d, R$styleable.MaterialCardView_checkedIcon));
        bm10Var.f = d.getDimensionPixelSize(R$styleable.MaterialCardView_checkedIconSize, 0);
        bm10Var.e = d.getDimensionPixelSize(R$styleable.MaterialCardView_checkedIconMargin, 0);
        bm10Var.g = d.getInteger(R$styleable.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList a3 = qm10.a(zl10Var.getContext(), d, R$styleable.MaterialCardView_rippleColor);
        bm10Var.k = a3;
        if (a3 == null) {
            bm10Var.k = ColorStateList.valueOf(dm10.d(R$attr.colorControlHighlight, zl10Var));
        }
        ColorStateList a4 = qm10.a(zl10Var.getContext(), d, R$styleable.MaterialCardView_cardForegroundColor);
        a4 = a4 == null ? ColorStateList.valueOf(0) : a4;
        MaterialShapeDrawable materialShapeDrawable2 = bm10Var.d;
        materialShapeDrawable2.setFillColor(a4);
        RippleDrawable rippleDrawable = bm10Var.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(bm10Var.k);
        }
        materialShapeDrawable.setElevation(zl10Var.getCardElevation());
        materialShapeDrawable2.setStroke(bm10Var.h, bm10Var.n);
        zl10Var.setBackgroundInternal(bm10Var.d(materialShapeDrawable));
        Drawable c = bm10Var.j() ? bm10Var.c() : materialShapeDrawable2;
        bm10Var.i = c;
        zl10Var.setForeground(bm10Var.d(c));
        d.recycle();
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.i.c.getBounds());
        return rectF;
    }

    public final void d() {
        bm10 bm10Var = this.i;
        RippleDrawable rippleDrawable = bm10Var.o;
        if (rippleDrawable != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i = bounds.bottom;
            bm10Var.o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            bm10Var.o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.i.c.getFillColor();
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.i.d.getFillColor();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.i.j;
    }

    public int getCheckedIconGravity() {
        return this.i.g;
    }

    public int getCheckedIconMargin() {
        return this.i.e;
    }

    public int getCheckedIconSize() {
        return this.i.f;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.i.l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.i.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.i.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.i.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.i.b.top;
    }

    public float getProgress() {
        return this.i.c.getInterpolation();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.i.c.getTopLeftCornerResolvedSize();
    }

    public ColorStateList getRippleColor() {
        return this.i.k;
    }

    @Override // xsna.l6j0
    @NonNull
    public com.google.android.material.shape.a getShapeAppearanceModel() {
        return this.i.m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.i.n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.i.n;
    }

    public int getStrokeWidth() {
        return this.i.h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bm10 bm10Var = this.i;
        bm10Var.k();
        bdl.e(this, bm10Var.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        bm10 bm10Var = this.i;
        if (bm10Var != null && bm10Var.s) {
            View.mergeDrawableStates(onCreateDrawableState, m);
        }
        if (this.k) {
            View.mergeDrawableStates(onCreateDrawableState, n);
        }
        if (this.l) {
            View.mergeDrawableStates(onCreateDrawableState, o);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.k);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        bm10 bm10Var = this.i;
        accessibilityNodeInfo.setCheckable(bm10Var != null && bm10Var.s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.k);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.i.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.j) {
            bm10 bm10Var = this.i;
            if (!bm10Var.r) {
                bm10Var.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.i.c.setFillColor(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        bm10 bm10Var = this.i;
        bm10Var.c.setElevation(bm10Var.a.getCardElevation());
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.i.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.setFillColor(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.i.s = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.k != z) {
            toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        this.i.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        bm10 bm10Var = this.i;
        if (bm10Var.g != i) {
            bm10Var.g = i;
            zl10 zl10Var = bm10Var.a;
            bm10Var.e(zl10Var.getMeasuredWidth(), zl10Var.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.i.e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.i.e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.i.g(m33.a(i, getContext()));
    }

    public void setCheckedIconSize(int i) {
        this.i.f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.i.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        bm10 bm10Var = this.i;
        bm10Var.l = colorStateList;
        Drawable drawable = bm10Var.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        bm10 bm10Var = this.i;
        if (bm10Var != null) {
            bm10Var.k();
        }
    }

    public void setDragged(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
            d();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.i.m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        bm10 bm10Var = this.i;
        bm10Var.m();
        bm10Var.l();
    }

    public void setProgress(float f) {
        bm10 bm10Var = this.i;
        bm10Var.c.setInterpolation(f);
        MaterialShapeDrawable materialShapeDrawable = bm10Var.d;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setInterpolation(f);
        }
        MaterialShapeDrawable materialShapeDrawable2 = bm10Var.q;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setInterpolation(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        bm10 bm10Var = this.i;
        bm10Var.h(bm10Var.m.f(f));
        bm10Var.i.invalidateSelf();
        if (bm10Var.i() || (bm10Var.a.getPreventCornerOverlap() && !bm10Var.c.isRoundRect())) {
            bm10Var.l();
        }
        if (bm10Var.i()) {
            bm10Var.m();
        }
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        bm10 bm10Var = this.i;
        bm10Var.k = colorStateList;
        RippleDrawable rippleDrawable = bm10Var.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList b = anj.b(i, getContext());
        bm10 bm10Var = this.i;
        bm10Var.k = b;
        RippleDrawable rippleDrawable = bm10Var.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(b);
        }
    }

    @Override // xsna.l6j0
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.a aVar) {
        setClipToOutline(aVar.e(getBoundsAsRectF()));
        this.i.h(aVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        bm10 bm10Var = this.i;
        if (i != bm10Var.h) {
            bm10Var.h = i;
            bm10Var.d.setStroke(i, bm10Var.n);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        bm10 bm10Var = this.i;
        bm10Var.m();
        bm10Var.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        bm10 bm10Var = this.i;
        if (bm10Var != null && bm10Var.s && isEnabled()) {
            this.k = !this.k;
            refreshDrawableState();
            d();
            bm10Var.f(this.k, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        bm10 bm10Var = this.i;
        if (bm10Var.n != colorStateList) {
            bm10Var.n = colorStateList;
            bm10Var.d.setStroke(bm10Var.h, colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        this.i.c.setFillColor(colorStateList);
    }

    public void setOnCheckedChangeListener(@Nullable a aVar) {
    }
}
