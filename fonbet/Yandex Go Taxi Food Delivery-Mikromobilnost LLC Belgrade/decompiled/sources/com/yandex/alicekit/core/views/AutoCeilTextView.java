package com.yandex.alicekit.core.views;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes11.dex */
public class AutoCeilTextView extends AppCompatTextView {
    public AutoCeilTextView(Context context) {
        super(context);
    }

    private float getMaxLineWidth(Layout layout) {
        int lineCount = layout.getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            if (layout.getLineWidth(i) > f) {
                f = layout.getLineWidth(i);
            }
        }
        return f;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Layout layout;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == 1073741824 || (layout = getLayout()) == null) {
            return;
        }
        setMeasuredDimension(Math.min(getCompoundPaddingRight() + getCompoundPaddingLeft() + ((int) Math.ceil(getMaxLineWidth(layout))), getMeasuredWidth()), getMeasuredHeight());
    }

    public AutoCeilTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AutoCeilTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
