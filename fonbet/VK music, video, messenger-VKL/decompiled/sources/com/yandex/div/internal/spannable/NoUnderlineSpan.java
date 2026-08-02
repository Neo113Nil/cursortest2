package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;

/* compiled from: NoUnderlineSpan.kt */
/* loaded from: classes7.dex */
public final class NoUnderlineSpan extends UnderlineSpan {
    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
