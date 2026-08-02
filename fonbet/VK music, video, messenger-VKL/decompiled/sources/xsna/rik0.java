package xsna;

import android.text.Spannable;
import android.text.SpannableString;

/* compiled from: SpannableUtils.kt */
/* loaded from: classes17.dex */
public final class rik0 {
    public static final SpannableString a = new SpannableString(" · ");

    public static final SpannableString a(int i, String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new m7s(i), 0, str.length(), 0);
        return spannableString;
    }

    public static final Spannable b(float f) {
        int a2 = iah0.a(f);
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
        newSpannable.setSpan(new elx0(a2), 0, 1, 0);
        return newSpannable;
    }
}
