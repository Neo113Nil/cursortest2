package com.google.android.material.floatingtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import defpackage.dfz0;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.gym;
import defpackage.yvy0;
import defpackage.z2i0;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public class FloatingToolbarLayout extends FrameLayout {
    private static final int DEF_STYLE_RES = g2i0.Widget_Material3_FloatingToolbar;
    private static final String TAG = "FloatingToolbarLayout";
    private int bottomMarginWindowInset;
    private int leftMarginWindowInset;
    private boolean marginBottomSystemWindowInsets;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private Rect originalMargins;
    private int rightMarginWindowInset;
    private int topMarginWindowInset;

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(g810.b(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        dfz0 e = yvy0.e(context2, attributeSet, z2i0.FloatingToolbar, i, i2, new int[0]);
        int i3 = z2i0.FloatingToolbar_backgroundTint;
        TypedArray typedArray = e.b;
        if (typedArray.hasValue(i3)) {
            int color = typedArray.getColor(z2i0.FloatingToolbar_backgroundTint, 0);
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(b.j(context2, attributeSet, i, i2).a());
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
            setBackground(materialShapeDrawable);
        }
        this.marginLeftSystemWindowInsets = typedArray.getBoolean(z2i0.FloatingToolbar_marginLeftSystemWindowInsets, true);
        this.marginTopSystemWindowInsets = typedArray.getBoolean(z2i0.FloatingToolbar_marginTopSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = typedArray.getBoolean(z2i0.FloatingToolbar_marginRightSystemWindowInsets, true);
        this.marginBottomSystemWindowInsets = typedArray.getBoolean(z2i0.FloatingToolbar_marginBottomSystemWindowInsets, true);
        gym gymVar = new gym(this);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(this, gymVar);
        e.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMargins() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Rect rect = this.originalMargins;
        if (rect == null) {
            return;
        }
        int i = rect.left + (this.marginLeftSystemWindowInsets ? this.leftMarginWindowInset : 0);
        int i2 = rect.right + (this.marginRightSystemWindowInsets ? this.rightMarginWindowInset : 0);
        int i3 = rect.top + (this.marginTopSystemWindowInsets ? this.topMarginWindowInset : 0);
        int i4 = rect.bottom + (this.marginBottomSystemWindowInsets ? this.bottomMarginWindowInset : 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.bottomMargin == i4 && marginLayoutParams.leftMargin == i && marginLayoutParams.rightMargin == i2 && marginLayoutParams.topMargin == i3) {
            return;
        }
        marginLayoutParams.bottomMargin = i4;
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.rightMargin = i2;
        marginLayoutParams.topMargin = i3;
        requestLayout();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            this.originalMargins = null;
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.originalMargins = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        updateMargins();
    }

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.floatingToolbarStyle);
    }

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, DEF_STYLE_RES);
    }

    public FloatingToolbarLayout(Context context) {
        this(context, null);
    }
}
