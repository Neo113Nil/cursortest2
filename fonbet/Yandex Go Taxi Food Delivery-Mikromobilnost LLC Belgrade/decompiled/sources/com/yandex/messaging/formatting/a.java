package com.yandex.messaging.formatting;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import defpackage.w511;
import defpackage.x4k0;

/* loaded from: classes15.dex */
public final class a {
    public final x4k0 a;

    public a(x4k0 x4k0Var) {
        this.a = x4k0Var;
    }

    public final String a(String str) {
        int i = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str, 0, null, new CodeTagHandler()));
        UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), UnderlineSpan.class);
        while (i < underlineSpanArr.length) {
            int i2 = i + 1;
            try {
                UnderlineSpan underlineSpan = underlineSpanArr[i];
                if (!(underlineSpan instanceof UnderlineSpanWrapper)) {
                    int spanStart = spannableStringBuilder.getSpanStart(underlineSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(underlineSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(underlineSpan);
                    spannableStringBuilder.removeSpan(underlineSpan);
                    spannableStringBuilder.setSpan(new UnderlineSpanWrapper(), spanStart, spanEnd, spanFlags);
                }
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
                w511.i(e.getMessage());
                return null;
            }
        }
        return this.a.a(spannableStringBuilder);
    }
}
