package com.vkontakte.android.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: CentredLinearLayout.kt */
/* loaded from: classes7.dex */
public final class CentredLinearLayout extends LinearLayout {
    public CentredLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    private final int getSdkGravity() {
        return getGravity();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size != getMinimumWidth()) {
            setMinimumWidth(size);
        }
        super.onMeasure(0, i2);
        int sdkGravity = getSdkGravity();
        if (getMeasuredWidth() > size && sdkGravity != 0) {
            setGravity(8388611);
        } else if (sdkGravity != 1) {
            setGravity(1);
        }
    }
}
