package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: ShadowSpan.kt */
/* loaded from: classes7.dex */
public final class ShadowSpan extends CharacterStyle {
    private final ShadowData shadow;

    public ShadowSpan(ShadowData shadowData) {
        this.shadow = shadowData;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        ShadowData shadowData = this.shadow;
        if (textPaint != null) {
            textPaint.setShadowLayer(shadowData.getRadius(), shadowData.getOffsetX(), shadowData.getOffsetY(), shadowData.getColor());
        }
    }
}
