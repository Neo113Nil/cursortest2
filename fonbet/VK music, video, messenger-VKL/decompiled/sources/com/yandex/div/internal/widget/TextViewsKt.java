package com.yandex.div.internal.widget;

import android.widget.TextView;

/* compiled from: TextViews.kt */
/* loaded from: classes7.dex */
public final class TextViewsKt {
    public static final boolean checkHyphenationSupported() {
        return true;
    }

    public static final float getFontHeight(TextView textView) {
        return textView.getPaint().getFontMetrics(null);
    }

    public static final int getFontHeightInt(TextView textView) {
        return textView.getPaint().getFontMetricsInt(null);
    }

    public static final boolean isHyphenationEnabled(TextView textView) {
        return checkHyphenationSupported() && textView.getHyphenationFrequency() != 0;
    }

    public static final int lineAt(TextView textView, int i) {
        if (textView.getLayout() == null) {
            return 0;
        }
        return textView.getLayout().getLineForVertical(i);
    }

    public static final int textHeight(TextView textView, int i) {
        if (textView.getLayout() == null) {
            return 0;
        }
        return i <= 0 ? textView.getLayout().getHeight() : i > textView.getLayout().getLineCount() ? textView.getLayout().getHeight() : textView.getLayout().getLineTop(i) - textView.getLayout().getLineTop(0);
    }
}
