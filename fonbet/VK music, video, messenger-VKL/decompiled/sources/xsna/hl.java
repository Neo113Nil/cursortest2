package xsna;

/* compiled from: AccessibilityIterators.android.kt */
/* loaded from: classes11.dex */
public final class hl extends dl {
    public static hl c;

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
        while (i < length) {
            String str2 = (String) this.a;
            if (str2 == null) {
                str2 = null;
            }
            if (str2.charAt(i) != '\n' || e(i)) {
                break;
            }
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !d(i2)) {
            i2++;
        }
        return b(i, i2);
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
        while (i > 0) {
            String str2 = (String) this.a;
            if (str2 == null) {
                str2 = null;
            }
            if (str2.charAt(i - 1) != '\n' || d(i)) {
                break;
            }
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && !e(i2)) {
            i2--;
        }
        return b(i2, i);
    }

    public final boolean d(int i) {
        if (i <= 0) {
            return false;
        }
        String str = (String) this.a;
        if (str == null) {
            str = null;
        }
        if (str.charAt(i - 1) == '\n') {
            return false;
        }
        String str2 = (String) this.a;
        if (str2 == null) {
            str2 = null;
        }
        if (i == str2.length()) {
            return true;
        }
        String str3 = (String) this.a;
        return (str3 != null ? str3 : null).charAt(i) == '\n';
    }

    public final boolean e(int i) {
        String str = (String) this.a;
        if (str == null) {
            str = null;
        }
        if (str.charAt(i) == '\n') {
            return false;
        }
        if (i != 0) {
            String str2 = (String) this.a;
            if ((str2 != null ? str2 : null).charAt(i - 1) != '\n') {
                return false;
            }
        }
        return true;
    }
}
