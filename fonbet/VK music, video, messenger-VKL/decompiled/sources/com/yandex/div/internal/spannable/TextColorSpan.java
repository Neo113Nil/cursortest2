package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;

/* compiled from: TextColorSpan.kt */
/* loaded from: classes7.dex */
public final class TextColorSpan extends ForegroundColorSpan {
    public TextColorSpan(int i) {
        super(i);
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setShader(null);
    }
}
