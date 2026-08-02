package com.yandex.alicekit.core.views;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes11.dex */
public class TightTextView extends AppCompatTextView {
    private boolean mCropEnabled;
    private boolean mUseMaxLineWidth;

    public TightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCropEnabled = true;
        this.mUseMaxLineWidth = false;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mCropEnabled) {
            Layout layout = getLayout();
            int lineCount = layout.getLineCount();
            float f = 0.0f;
            for (int i3 = 0; i3 < lineCount; i3++) {
                f = Math.max(f, layout.getLineWidth(i3));
            }
            int ceil = (int) Math.ceil(f + getPaddingRight() + getPaddingLeft());
            if (!this.mUseMaxLineWidth && ceil < getMeasuredWidth()) {
                setMeasuredDimension(ceil, getMeasuredHeightAndState());
            } else {
                if (!this.mUseMaxLineWidth || ceil <= getMeasuredWidth()) {
                    return;
                }
                setMeasuredDimension(ceil, getMeasuredHeightAndState());
            }
        }
    }

    public void setCropEnabled(boolean z) {
        this.mCropEnabled = z;
    }

    public void setUseMaxLineWidth(boolean z) {
        this.mUseMaxLineWidth = z;
    }

    public TightTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TightTextView(Context context) {
        this(context, null);
    }
}
