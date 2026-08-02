package xsna;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: CodePointCountFilter.kt */
/* loaded from: classes17.dex */
public final class dzf implements InputFilter {
    public final int a;

    public dzf(int i) {
        this.a = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int codePointCount = this.a - (Character.codePointCount(spanned, 0, spanned.length()) - Character.codePointCount(spanned, i3, i4));
        if (codePointCount <= 0) {
            return "";
        }
        if (codePointCount >= Character.codePointCount(charSequence, i, i2)) {
            return null;
        }
        int i5 = i;
        while (codePointCount > 0 && i5 < i2) {
            int i6 = i5 + 1;
            i5 = (Character.isHighSurrogate(charSequence.charAt(i5)) && i6 < i2 && Character.isLowSurrogate(charSequence.charAt(i6))) ? i5 + 2 : i6;
            codePointCount--;
        }
        return charSequence.subSequence(i, i5);
    }
}
