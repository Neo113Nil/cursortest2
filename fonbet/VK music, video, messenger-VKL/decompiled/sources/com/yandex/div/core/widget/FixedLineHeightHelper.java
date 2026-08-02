package com.yandex.div.core.widget;

import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.internal.widget.TextViewsKt;

/* compiled from: FixedLineHeightHelper.kt */
/* loaded from: classes7.dex */
public final class FixedLineHeightHelper {
    private int lineHeight = -1;
    private int textPaddingBottom;
    private int textPaddingTop;
    private final TextView view;

    public FixedLineHeightHelper(TextView textView) {
        this.view = textView;
        textView.setIncludeFontPadding(false);
    }

    private final void applyLineHeight(int i) {
        if (i == -1) {
            resetLineHeight();
            return;
        }
        int fontHeightInt = i - TextViewsKt.getFontHeightInt(this.view);
        if (fontHeightInt < 0) {
            int i2 = fontHeightInt / 2;
            this.textPaddingTop = i2;
            this.textPaddingBottom = fontHeightInt - i2;
        } else {
            int i3 = fontHeightInt / 2;
            this.textPaddingBottom = i3;
            this.textPaddingTop = fontHeightInt - i3;
        }
        this.view.setLineSpacing(i - TextViewsKt.getFontHeight(this.view), 1.0f);
        setFallbackLineSpacing(false);
    }

    private final void resetLineHeight() {
        this.textPaddingTop = 0;
        this.textPaddingBottom = 0;
        this.view.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        setFallbackLineSpacing(true);
    }

    private final void setFallbackLineSpacing(boolean z) {
        this.view.setFallbackLineSpacing(z);
    }

    public final int getExtraPaddingBottom() {
        return this.textPaddingBottom;
    }

    public final int getExtraPaddingTop() {
        return this.textPaddingTop;
    }

    public final int getLineHeight() {
        return this.lineHeight;
    }

    public final void onFontSizeChanged() {
        applyLineHeight(this.lineHeight);
    }

    public final void setLineHeight(int i) {
        if (this.lineHeight == i) {
            return;
        }
        this.lineHeight = i;
        applyLineHeight(i);
    }
}
