package xsna;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: Utf8ByteSizeFilter.kt */
/* loaded from: classes4.dex */
public final class m2r0 implements InputFilter {
    public final StringBuilder a = new StringBuilder();

    public static int a(int i, int i2, CharSequence charSequence) {
        int i3 = 0;
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            i3 += charAt <= 127 ? 1 : charAt <= 2047 ? 2 : Character.isHighSurrogate(charAt) ? 4 : 3;
            if (Character.isHighSurrogate(charAt)) {
                i++;
            }
            i++;
        }
        return i3;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence == null || charSequence.length() == 0 || spanned == null) {
            return "";
        }
        int i5 = 0;
        int a = 64 - (a(0, spanned.length(), spanned) - a(i3, i4, spanned));
        if (a <= 0) {
            return "";
        }
        if (a >= a(i, i2, charSequence)) {
            return null;
        }
        StringBuilder sb = this.a;
        sb.setLength(0);
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            i5 += charAt <= 127 ? 1 : charAt <= 2047 ? 2 : Character.isHighSurrogate(charAt) ? 4 : 3;
            if (i5 > a) {
                break;
            }
            sb.append(charAt);
            i++;
        }
        if (sb.length() == 0) {
            return "";
        }
        if (Character.isHighSurrogate(erm0.A0(sb))) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }
}
