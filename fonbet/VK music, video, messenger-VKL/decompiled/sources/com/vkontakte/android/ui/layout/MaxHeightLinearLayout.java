package com.vkontakte.android.ui.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.app.shared.R$styleable;

/* loaded from: classes7.dex */
public class MaxHeightLinearLayout extends LinearLayout {
    public int b;

    public MaxHeightLinearLayout(Context context) {
        super(context);
        this.b = 0;
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        if (obtainStyledAttributes != null) {
            this.b = obtainStyledAttributes.getDimensionPixelSize(0, this.b);
            obtainStyledAttributes.recycle();
        }
    }

    public int getMaxHeight() {
        return this.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.b;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.b = i;
    }

    public MaxHeightLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        a(context, attributeSet);
    }

    public MaxHeightLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 0;
        a(context, attributeSet);
    }

    @TargetApi(21)
    public MaxHeightLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = 0;
        a(context, attributeSet);
    }
}
