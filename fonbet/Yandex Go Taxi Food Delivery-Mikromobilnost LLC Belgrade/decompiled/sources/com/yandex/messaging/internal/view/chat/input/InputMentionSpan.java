package com.yandex.messaging.internal.view.chat.input;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* loaded from: classes15.dex */
public class InputMentionSpan extends CharacterStyle implements UpdateAppearance {
    private final int mColor;
    private final String mGuid;

    public InputMentionSpan(int i, String str) {
        this.mGuid = str;
        this.mColor = i;
    }

    public String getGuid() {
        return this.mGuid;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.mColor);
    }
}
