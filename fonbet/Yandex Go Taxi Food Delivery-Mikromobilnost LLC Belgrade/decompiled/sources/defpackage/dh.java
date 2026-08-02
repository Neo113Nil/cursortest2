package defpackage;

/* loaded from: classes10.dex */
public final class dh extends zg {
    public static dh c;

    @Override // defpackage.eh
    public final int[] a(int i) {
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
        while (i < length) {
            String str2 = this.a;
            if (str2 == null) {
                str2 = null;
            }
            if (str2.charAt(i) != '\n' || f(i)) {
                break;
            }
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !e(i2)) {
            i2++;
        }
        return c(i, i2);
    }

    @Override // defpackage.eh
    public final int[] b(int i) {
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
        while (i > 0) {
            String str2 = this.a;
            if (str2 == null) {
                str2 = null;
            }
            if (str2.charAt(i - 1) != '\n' || e(i)) {
                break;
            }
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && !f(i2)) {
            i2--;
        }
        return c(i2, i);
    }

    public final boolean e(int i) {
        if (i <= 0) {
            return false;
        }
        String str = this.a;
        if (str == null) {
            str = null;
        }
        if (str.charAt(i - 1) == '\n') {
            return false;
        }
        String str2 = this.a;
        if (str2 == null) {
            str2 = null;
        }
        if (i == str2.length()) {
            return true;
        }
        String str3 = this.a;
        return (str3 != null ? str3 : null).charAt(i) == '\n';
    }

    public final boolean f(int i) {
        String str = this.a;
        if (str == null) {
            str = null;
        }
        if (str.charAt(i) == '\n') {
            return false;
        }
        if (i != 0) {
            String str2 = this.a;
            if ((str2 != null ? str2 : null).charAt(i - 1) != '\n') {
                return false;
            }
        }
        return true;
    }
}
