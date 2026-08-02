package xsna;

import java.text.BreakIterator;

/* compiled from: AccessibilityIterators.android.kt */
/* loaded from: classes11.dex */
public final class el extends dl {
    public static el d;
    public BreakIterator c;

    @Override // xsna.dl
    public final int[] a(int i) {
        String str = (String) this.a;
        if (str == null) {
            str = null;
        }
        int length = str.length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    breakIterator2 = null;
                }
                int following = breakIterator2.following(i);
                if (following == -1) {
                    return null;
                }
                return b(i, following);
            }
            BreakIterator breakIterator3 = this.c;
            if (breakIterator3 == null) {
                breakIterator3 = null;
            }
            i = breakIterator3.following(i);
        } while (i != -1);
        return null;
    }

    @Override // xsna.dl
    public final int[] c(int i) {
        String str = (String) this.a;
        if (str == null) {
            str = null;
        }
        int length = str.length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    breakIterator2 = null;
                }
                int preceding = breakIterator2.preceding(i);
                if (preceding == -1) {
                    return null;
                }
                return b(preceding, i);
            }
            BreakIterator breakIterator3 = this.c;
            if (breakIterator3 == null) {
                breakIterator3 = null;
            }
            i = breakIterator3.preceding(i);
        } while (i != -1);
        return null;
    }
}
