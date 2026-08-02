package com.yandex.alicekit.core.views;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes11.dex */
public class EllipsizingTextViewWithMaxLine extends EllipsizingMultilineTextView {
    public EllipsizingTextViewWithMaxLine(Context context) {
        super(context);
    }

    @Override // com.yandex.alicekit.core.views.EllipsizingMultilineTextView
    public boolean checkLimit() {
        return getLimit() >= 0;
    }

    @Override // com.yandex.alicekit.core.views.EllipsizingMultilineTextView
    public int getLimit() {
        return getMaxLines();
    }

    @Override // com.yandex.alicekit.core.views.EllipsizingMultilineTextView
    public int getMaxLineCount() {
        return getMaxLines();
    }

    @Override // com.yandex.alicekit.core.views.EllipsizingMultilineTextView
    public boolean shouldEllipsizeOnSizeChange(int i, int i2, int i3, int i4) {
        return i != i3;
    }

    public EllipsizingTextViewWithMaxLine(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EllipsizingTextViewWithMaxLine(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
