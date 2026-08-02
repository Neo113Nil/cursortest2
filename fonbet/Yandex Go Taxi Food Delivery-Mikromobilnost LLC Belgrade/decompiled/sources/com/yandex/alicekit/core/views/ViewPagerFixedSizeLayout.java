package com.yandex.alicekit.core.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.c3i0;
import defpackage.jy4;
import defpackage.ot31;
import defpackage.r3k0;
import defpackage.r810;
import defpackage.u4x0;
import defpackage.ydz;

/* loaded from: classes11.dex */
public class ViewPagerFixedSizeLayout extends FrameLayout {
    private int mCollapsiblePaddingBottom;
    private ot31 mHeightCalculator;

    public ViewPagerFixedSizeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCollapsiblePaddingBottom = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c3i0.ViewPagerFixedSizeLayout);
        this.mCollapsiblePaddingBottom = obtainStyledAttributes.getDimensionPixelSize(c3i0.ViewPagerFixedSizeLayout_collapsiblePaddingBottom, 0);
        obtainStyledAttributes.recycle();
    }

    public int getCollapsiblePaddingBottom() {
        return this.mCollapsiblePaddingBottom;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int round;
        int i3;
        ot31 ot31Var = this.mHeightCalculator;
        if (ot31Var != null) {
            r810 r810Var = (r810) ot31Var;
            SparseArray sparseArray = r810Var.c;
            u4x0 u4x0Var = (u4x0) sparseArray.get(i);
            if (u4x0Var == null) {
                r3k0 r3k0Var = r810Var.b.a.m;
                i3 = 0;
                int size = r3k0Var == null ? 0 : r3k0Var.c().size();
                if (size != 0) {
                    u4x0 u4x0Var2 = new u4x0(size, new jy4(r810Var, View.MeasureSpec.getSize(i), i3));
                    sparseArray.put(i, u4x0Var2);
                    u4x0Var = u4x0Var2;
                }
                i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
            int i4 = r810Var.d;
            float f = r810Var.e;
            if (i4 > 0) {
                round = u4x0Var.b();
            } else if (f < 0.01f) {
                round = u4x0Var.a();
            } else {
                round = Math.round(((u4x0Var.b() - r8) * f) + u4x0Var.a());
            }
            i3 = round;
            ydz.a();
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setCollapsiblePaddingBottom(int i) {
        if (this.mCollapsiblePaddingBottom != i) {
            this.mCollapsiblePaddingBottom = i;
        }
    }

    public void setHeightCalculator(ot31 ot31Var) {
        this.mHeightCalculator = ot31Var;
    }

    public ViewPagerFixedSizeLayout(Context context) {
        super(context);
        this.mCollapsiblePaddingBottom = 0;
    }

    public ViewPagerFixedSizeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCollapsiblePaddingBottom = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c3i0.ViewPagerFixedSizeLayout, i, 0);
        this.mCollapsiblePaddingBottom = obtainStyledAttributes.getDimensionPixelSize(c3i0.ViewPagerFixedSizeLayout_collapsiblePaddingBottom, 0);
        obtainStyledAttributes.recycle();
    }
}
