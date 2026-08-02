package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.cpg0;
import defpackage.o3i0;
import defpackage.v0i0;
import defpackage.wp8;
import defpackage.xp8;
import defpackage.yng0;

/* loaded from: classes10.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final xp8 IMPL = new b();
    private final wp8 mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        a aVar = new a(this);
        this.mCardViewDelegate = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o3i0.CardView, i, v0i0.CardView);
        if (obtainStyledAttributes.hasValue(o3i0.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(o3i0.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(cpg0.cardview_light_background) : getResources().getColor(cpg0.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(o3i0.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(o3i0.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(o3i0.CardView_cardMaxElevation, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(o3i0.CardView_cardUseCompatPadding, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(o3i0.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(o3i0.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(o3i0.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(o3i0.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(o3i0.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(o3i0.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(o3i0.CardView_android_minWidth, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(o3i0.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        b bVar = (b) IMPL;
        bVar.getClass();
        RoundRectDrawable roundRectDrawable = new RoundRectDrawable(valueOf, dimension);
        aVar.a = roundRectDrawable;
        setBackgroundDrawable(roundRectDrawable);
        setClipToOutline(true);
        setElevation(dimension2);
        bVar.b(aVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        xp8 xp8Var = IMPL;
        wp8 wp8Var = this.mCardViewDelegate;
        ((b) xp8Var).getClass();
        return b.a(wp8Var).getColor();
    }

    public float getCardElevation() {
        xp8 xp8Var = IMPL;
        wp8 wp8Var = this.mCardViewDelegate;
        ((b) xp8Var).getClass();
        return ((a) wp8Var).b.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        xp8 xp8Var = IMPL;
        wp8 wp8Var = this.mCardViewDelegate;
        ((b) xp8Var).getClass();
        return b.a(wp8Var).getPadding();
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        xp8 xp8Var = IMPL;
        wp8 wp8Var = this.mCardViewDelegate;
        ((b) xp8Var).getClass();
        return b.a(wp8Var).getRadius();
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        xp8 xp8Var = IMPL;
        if (xp8Var instanceof b) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            wp8 wp8Var = this.mCardViewDelegate;
            ((b) xp8Var).getClass();
            i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(b.a(wp8Var).getRadius() * 2.0f), View.MeasureSpec.getSize(i)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            wp8 wp8Var2 = this.mCardViewDelegate;
            ((b) xp8Var).getClass();
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(b.a(wp8Var2).getRadius() * 2.0f), View.MeasureSpec.getSize(i2)), mode2);
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        xp8 xp8Var = IMPL;
        wp8 wp8Var = this.mCardViewDelegate;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        ((b) xp8Var).getClass();
        b.a(wp8Var).setColor(valueOf);
    }

    public void setCardElevation(float f) {
        xp8 xp8Var = IMPL;
        wp8 wp8Var = this.mCardViewDelegate;
        ((b) xp8Var).getClass();
        ((a) wp8Var).b.setElevation(f);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        ((b) IMPL).c(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f) {
        ((b) IMPL).b(this.mCardViewDelegate, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.mUserSetMinHeight = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.mUserSetMinWidth = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z;
            xp8 xp8Var = IMPL;
            wp8 wp8Var = this.mCardViewDelegate;
            b bVar = (b) xp8Var;
            bVar.getClass();
            bVar.b(wp8Var, b.a(wp8Var).getPadding());
        }
    }

    public void setRadius(float f) {
        xp8 xp8Var = IMPL;
        wp8 wp8Var = this.mCardViewDelegate;
        ((b) xp8Var).getClass();
        b.a(wp8Var).setRadius(f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            xp8 xp8Var = IMPL;
            wp8 wp8Var = this.mCardViewDelegate;
            b bVar = (b) xp8Var;
            bVar.getClass();
            bVar.b(wp8Var, b.a(wp8Var).getPadding());
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        xp8 xp8Var = IMPL;
        wp8 wp8Var = this.mCardViewDelegate;
        ((b) xp8Var).getClass();
        b.a(wp8Var).setColor(colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, yng0.cardViewStyle);
    }

    public CardView(Context context) {
        this(context, null);
    }
}
