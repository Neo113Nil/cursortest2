package xsna;

import java.text.BreakIterator;

/* compiled from: AccessibilityIterators.android.kt */
/* loaded from: classes11.dex */
public final class il extends dl {
    public static il d;
    public BreakIterator c;

    @Override // xsna.dl
    public final int[] a(int i) {
        String str = (String) this.a;
        if (str == null) {
            str = null;
        }
        if (str.length() > 0) {
            String str2 = (String) this.a;
            if (str2 == null) {
                str2 = null;
            }
            if (i < str2.length()) {
                if (i < 0) {
                    i = 0;
                }
                while (!e(i) && (!e(i) || (i != 0 && e(i - 1)))) {
                    BreakIterator breakIterator = this.c;
                    if (breakIterator == null) {
                        breakIterator = null;
                    }
                    i = breakIterator.following(i);
                    if (i == -1) {
                        break;
                    }
                }
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    breakIterator2 = null;
                }
                int following = breakIterator2.following(i);
                if (following != -1 && d(following)) {
                    return b(i, following);
                }
            }
        }
        return null;
    }

    @Override // xsna.dl
    public final int[] c(int i) {
        String str = (String) this.a;
        if (str == null) {
            str = null;
        }
        int length = str.length();
        if (length > 0 && i > 0) {
            if (i > length) {
                i = length;
            }
            while (i > 0 && !e(i - 1) && !d(i)) {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    breakIterator = null;
                }
                i = breakIterator.preceding(i);
                if (i == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.c;
            if (breakIterator2 == null) {
                breakIterator2 = null;
            }
            int preceding = breakIterator2.preceding(i);
            if (preceding != -1 && e(preceding) && (preceding == 0 || !e(preceding - 1))) {
                return b(preceding, i);
            }
        }
        return null;
    }

    public final boolean d(int i) {
        if (i <= 0 || !e(i - 1)) {
            return false;
        }
        String str = (String) this.a;
        if (str == null) {
            str = null;
        }
        return i == str.length() || !e(i);
    }

    public final boolean e(int i) {
        if (i < 0) {
            return false;
        }
        String str = (String) this.a;
        if (str == null) {
            str = null;
        }
        if (i >= str.length()) {
            return false;
        }
        String str2 = (String) this.a;
        return Character.isLetterOrDigit((str2 != null ? str2 : null).codePointAt(i));
    }
}
