package defpackage;

import java.text.BreakIterator;

/* loaded from: classes10.dex */
public final class ah extends zg {
    public static ah e;
    public static ah f;
    public final /* synthetic */ int c;
    public BreakIterator d;

    @Override // defpackage.eh
    public final int[] a(int i) {
        switch (this.c) {
            case 0:
                String str = this.a;
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
                    BreakIterator breakIterator = this.d;
                    if (breakIterator == null) {
                        breakIterator = null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.d;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            breakIterator2 = null;
                        }
                        int following = breakIterator2.following(i);
                        if (following == -1) {
                            return null;
                        }
                        return c(i, following);
                    }
                    if (breakIterator2 == null) {
                        breakIterator2 = null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            default:
                String str2 = this.a;
                if (str2 == null) {
                    str2 = null;
                }
                if (str2.length() <= 0) {
                    return null;
                }
                String str3 = this.a;
                if (str3 == null) {
                    str3 = null;
                }
                if (i >= str3.length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!f(i) && (!f(i) || (i != 0 && f(i - 1)))) {
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 == null) {
                        breakIterator3 = null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.d;
                if (breakIterator4 == null) {
                    breakIterator4 = null;
                }
                int following2 = breakIterator4.following(i);
                if (following2 == -1 || !e(following2)) {
                    return null;
                }
                return c(i, following2);
        }
    }

    @Override // defpackage.eh
    public final int[] b(int i) {
        switch (this.c) {
            case 0:
                String str = this.a;
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
                    BreakIterator breakIterator = this.d;
                    if (breakIterator == null) {
                        breakIterator = null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.d;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            breakIterator2 = null;
                        }
                        int preceding = breakIterator2.preceding(i);
                        if (preceding == -1) {
                            return null;
                        }
                        return c(preceding, i);
                    }
                    if (breakIterator2 == null) {
                        breakIterator2 = null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            default:
                String str2 = this.a;
                if (str2 == null) {
                    str2 = null;
                }
                int length2 = str2.length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !f(i - 1) && !e(i)) {
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 == null) {
                        breakIterator3 = null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.d;
                if (breakIterator4 == null) {
                    breakIterator4 = null;
                }
                int preceding2 = breakIterator4.preceding(i);
                if (preceding2 == -1 || !f(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !f(preceding2 - 1)) {
                    return c(preceding2, i);
                }
                return null;
        }
    }

    @Override // defpackage.zg
    public final void d(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = this.d;
                (breakIterator != null ? breakIterator : null).setText(str);
                break;
            default:
                this.a = str;
                BreakIterator breakIterator2 = this.d;
                (breakIterator2 != null ? breakIterator2 : null).setText(str);
                break;
        }
    }

    public boolean e(int i) {
        if (i <= 0 || !f(i - 1)) {
            return false;
        }
        String str = this.a;
        if (str == null) {
            str = null;
        }
        return i == str.length() || !f(i);
    }

    public boolean f(int i) {
        if (i < 0) {
            return false;
        }
        String str = this.a;
        if (str == null) {
            str = null;
        }
        if (i >= str.length()) {
            return false;
        }
        String str2 = this.a;
        return Character.isLetterOrDigit((str2 != null ? str2 : null).codePointAt(i));
    }
}
