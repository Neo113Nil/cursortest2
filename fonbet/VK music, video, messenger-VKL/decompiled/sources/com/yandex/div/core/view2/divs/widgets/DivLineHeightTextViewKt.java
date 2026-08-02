package com.yandex.div.core.view2.divs.widgets;

import com.yandex.div.core.util.text.DivBackgroundSpan;
import com.yandex.div.core.util.text.DivTextRangesBackgroundHelper;
import com.yandex.div.json.expressions.ExpressionResolver;

/* compiled from: DivLineHeightTextView.kt */
/* loaded from: classes7.dex */
public final class DivLineHeightTextViewKt {
    public static final boolean hasBackgroundSpan(DivLineHeightTextView divLineHeightTextView, CharSequence charSequence, DivBackgroundSpan divBackgroundSpan, int i, int i2, ExpressionResolver expressionResolver) {
        if (divLineHeightTextView.getTextRoundedBgHelper$div_release() != null) {
            return divLineHeightTextView.getTextRoundedBgHelper$div_release().hasSameSpan$div_release(charSequence, divBackgroundSpan, i, i2);
        }
        divLineHeightTextView.setTextRoundedBgHelper$div_release(new DivTextRangesBackgroundHelper(divLineHeightTextView, expressionResolver));
        return false;
    }
}
