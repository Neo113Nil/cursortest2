package xsna;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: EllipsisLengthFilter.kt */
/* loaded from: classes6.dex */
public final class lbp implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = 1000 - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        if (Character.isHighSurrogate(charSequence.charAt(i5 - 1)) && i5 - 1 == i) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) charSequence.subSequence(i, i5));
        sb.append((char) 8230);
        return sb.toString();
    }
}
