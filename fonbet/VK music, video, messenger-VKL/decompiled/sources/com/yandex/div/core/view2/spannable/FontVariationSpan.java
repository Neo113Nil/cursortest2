package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: FontVariationSpan.kt */
/* loaded from: classes7.dex */
public final class FontVariationSpan extends MetricAffectingSpan {
    private final String settings;

    public FontVariationSpan(String str) {
        this.settings = str;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFontVariationSettings(this.settings);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontVariationSettings(this.settings);
    }
}
