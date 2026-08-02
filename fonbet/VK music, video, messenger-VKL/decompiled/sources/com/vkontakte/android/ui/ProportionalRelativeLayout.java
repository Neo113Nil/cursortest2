package com.vkontakte.android.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.vkontakte.android.R;

/* loaded from: classes7.dex */
public class ProportionalRelativeLayout extends RelativeLayout {
    public float b;

    public ProportionalRelativeLayout(Context context) {
        super(context);
        this.b = 1.0f;
    }

    public final void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.heightRatio});
        this.b = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, ((int) (View.MeasureSpec.getSize(i) * this.b)) | 1073741824);
    }

    public ProportionalRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 1.0f;
        a(attributeSet);
    }

    public ProportionalRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 1.0f;
        a(attributeSet);
    }

    public ProportionalRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = 1.0f;
        a(attributeSet);
    }
}
