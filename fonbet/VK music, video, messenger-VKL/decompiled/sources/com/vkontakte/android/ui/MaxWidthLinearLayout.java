package com.vkontakte.android.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes7.dex */
public class MaxWidthLinearLayout extends LinearLayout {
    public int b;
    public int c;

    public MaxWidthLinearLayout(Context context) {
        super(context);
    }

    public final void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.maxWidth, R.attr.maxHeight});
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View.MeasureSpec.toString(i);
        View.MeasureSpec.toString(i2);
        if (this.b > 0) {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.b;
            if (size > i3) {
                i = i3 | 1073741824;
            }
        }
        if (this.c > 0) {
            int size2 = View.MeasureSpec.getSize(i2);
            int i4 = this.c;
            if (size2 > i4) {
                i2 = i4 | 1073741824;
            }
        }
        View.MeasureSpec.toString(i);
        View.MeasureSpec.toString(i2);
        super.onMeasure(i, i2);
        getMeasuredWidth();
        getMeasuredHeight();
    }

    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }

    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(attributeSet);
    }
}
