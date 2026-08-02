package com.google.android.material.dockedtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.e;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import defpackage.dfz0;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.qnh;
import defpackage.yvy0;
import defpackage.z2i0;

/* loaded from: classes11.dex */
public class DockedToolbarLayout extends FrameLayout {
    private static final int DEF_STYLE_RES = g2i0.Widget_Material3_DockedToolbar;
    private static final String TAG = "DockedToolbarLayout";
    private Boolean paddingBottomSystemWindowInsets;
    private Boolean paddingTopSystemWindowInsets;

    public DockedToolbarLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(g810.b(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        dfz0 e = yvy0.e(context2, attributeSet, z2i0.DockedToolbar, i, i2, new int[0]);
        int i3 = z2i0.DockedToolbar_backgroundTint;
        TypedArray typedArray = e.b;
        if (typedArray.hasValue(i3)) {
            int color = typedArray.getColor(z2i0.DockedToolbar_backgroundTint, 0);
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(b.j(context2, attributeSet, i, i2).a());
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
            setBackground(materialShapeDrawable);
        }
        if (typedArray.hasValue(z2i0.DockedToolbar_paddingTopSystemWindowInsets)) {
            this.paddingTopSystemWindowInsets = Boolean.valueOf(typedArray.getBoolean(z2i0.DockedToolbar_paddingTopSystemWindowInsets, true));
        }
        if (typedArray.hasValue(z2i0.DockedToolbar_paddingBottomSystemWindowInsets)) {
            this.paddingBottomSystemWindowInsets = Boolean.valueOf(typedArray.getBoolean(z2i0.DockedToolbar_paddingBottomSystemWindowInsets, true));
        }
        e.c(this, new qnh(this));
        setImportantForAccessibility(1);
        e.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasGravity(ViewGroup.LayoutParams layoutParams, int i) {
        return layoutParams instanceof CoordinatorLayout.LayoutParams ? (((CoordinatorLayout.LayoutParams) layoutParams).gravity & i) == i : (layoutParams instanceof FrameLayout.LayoutParams) && (((FrameLayout.LayoutParams) layoutParams).gravity & i) == i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            int childCount = getChildCount();
            int max = Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight());
            for (int i3 = 0; i3 < childCount; i3++) {
                measureChild(getChildAt(i3), i, View.MeasureSpec.makeMeasureSpec(max, 1073741824));
            }
            setMeasuredDimension(getMeasuredWidth(), max);
        }
    }

    public DockedToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.dockedToolbarStyle);
    }

    public DockedToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, DEF_STYLE_RES);
    }

    public DockedToolbarLayout(Context context) {
        this(context, null);
    }
}
