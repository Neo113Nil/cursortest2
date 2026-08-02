package xsna;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: EditTextExt.kt */
/* loaded from: classes17.dex */
public final class fo10 implements InputFilter {
    public final int a;

    public fo10(int i) {
        this.a = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String obj = charSequence.subSequence(i, i2).toString();
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        sb.append((Object) spanned.subSequence(0, i3));
        sb.append((Object) spanned.subSequence(i4, spanned.length()));
        String sb2 = sb.toString();
        int i6 = 0;
        for (int i7 = 0; i7 < obj.length(); i7++) {
            if (obj.charAt(i7) == '\n') {
                i6++;
            }
        }
        int i8 = 0;
        for (int i9 = 0; i9 < sb2.length(); i9++) {
            if (sb2.charAt(i9) == '\n') {
                i8++;
            }
        }
        int i10 = i8 + i6 + 1;
        int i11 = this.a;
        if (i10 <= i11) {
            return null;
        }
        if (obj.length() < 2) {
            return "";
        }
        int i12 = (i11 - i8) - 1;
        if (i12 <= 0) {
            return obj.replace('\n', ' ');
        }
        if (i6 <= 0 || i12 <= 0) {
            return "";
        }
        char[] charArray = obj.toCharArray();
        int length = charArray.length;
        int i13 = i12;
        int i14 = 0;
        while (i5 < length) {
            char c = charArray[i5];
            int i15 = i14 + 1;
            if (charArray[drm0.H(obj) - i14] == '\n') {
                charArray[drm0.H(obj) - i14] = ' ';
                i13--;
                if (i13 <= 0) {
                    return new String(charArray);
                }
            }
            i5++;
            i14 = i15;
        }
        return new String(charArray);
    }
}
