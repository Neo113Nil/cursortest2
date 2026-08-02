package com.yandex.alicekit.core.views;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.AttributeSet;

/* loaded from: classes11.dex */
public class FillHeightTextView extends EllipsizingMultilineTextView {
    private int mLastEllipsizedHeight;

    public FillHeightTextView(Context context) {
        super(context);
    }

    private int getHeightChangeThreshold() {
        return Math.max(getLineHeight() / 8, 2);
    }

    @Override // com.yandex.alicekit.core.views.EllipsizingMultilineTextView
    public boolean checkLimit() {
        return getLimit() > 0;
    }

    @Override // com.yandex.alicekit.core.views.EllipsizingMultilineTextView
    public int getLimit() {
        return getHeight();
    }

    @Override // com.yandex.alicekit.core.views.EllipsizingMultilineTextView
    public int getMaxLineCount() {
        return getVisibleLinesOfMultiLineText(getText());
    }

    public int getVisibleLinesOfMultiLineText(CharSequence charSequence) {
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        int height = (getHeight() - getCompoundPaddingTop()) - getCompoundPaddingBottom();
        StaticLayout staticLayout = new StaticLayout(charSequence, getPaint(), width, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), true);
        int lineForVertical = staticLayout.getLineForVertical(height);
        return staticLayout.getLineBottom(lineForVertical) > height ? lineForVertical : lineForVertical + 1;
    }

    @Override // com.yandex.alicekit.core.views.EllipsizingMultilineTextView
    public boolean shouldEllipsizeOnSizeChange(int i, int i2, int i3, int i4) {
        if (i != i3) {
            return true;
        }
        if (Math.abs(i2 - this.mLastEllipsizedHeight) <= getHeightChangeThreshold()) {
            return false;
        }
        this.mLastEllipsizedHeight = i2;
        return true;
    }

    public FillHeightTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FillHeightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
