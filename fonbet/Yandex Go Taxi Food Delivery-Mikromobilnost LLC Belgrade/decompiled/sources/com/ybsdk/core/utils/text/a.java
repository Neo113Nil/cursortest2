package com.ybsdk.core.utils.text;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public abstract class a {
    public static final SpannableString a(SpannableString spannableString, Drawable drawable) {
        SpannableString spannableString2 = new SpannableString(TextUtils.concat(spannableString, " "));
        spannableString2.setSpan(new LineImageSpan(drawable), spannableString2.length() - 1, spannableString2.length(), 18);
        return spannableString2;
    }
}
