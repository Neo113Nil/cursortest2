package com.yandex.div.core.util.text;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import com.yandex.div2.ec;
import com.yandex.div2.zb;

/* compiled from: DivBackgroundSpan.kt */
/* loaded from: classes7.dex */
public final class DivBackgroundSpan extends UnderlineSpan {
    private final zb background;
    private final ec border;

    public DivBackgroundSpan(ec ecVar, zb zbVar) {
        this.border = ecVar;
        this.background = zbVar;
    }

    public final zb getBackground() {
        return this.background;
    }

    public final ec getBorder() {
        return this.border;
    }

    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
