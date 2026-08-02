package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: FontFeatureSpan.kt */
/* loaded from: classes7.dex */
public final class FontFeatureSpan extends MetricAffectingSpan {
    private final String settings;

    public FontFeatureSpan(String str) {
        this.settings = str;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.settings);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.settings);
    }
}
