package xsna;

import com.facebook.soloader.MinElf;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.dto.common.ImageSizeKey;

/* compiled from: StringNumberConversions.kt */
/* loaded from: classes11.dex */
public class arm0 extends zqm0 {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean i(String str) {
        char c;
        boolean z;
        boolean z2;
        int charAt;
        int i;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        int length = str.length() - 1;
        int i2 = 0;
        while (true) {
            c = ' ';
            if (i2 > length || str.charAt(i2) > ' ') {
                break;
            }
            i2++;
        }
        if (i2 > length) {
            return false;
        }
        while (length > i2 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i2) == '+' || str.charAt(i2) == '-') {
            i2++;
        }
        if (i2 > length) {
            return false;
        }
        if (str.charAt(i2) == '0') {
            int i3 = i2 + 1;
            if (i3 > length) {
                return true;
            }
            if ((str.charAt(i3) | ' ') == 120) {
                int i4 = i2 + 2;
                int i5 = i4;
                while (true) {
                    if (i5 > length) {
                        z = z5;
                        break;
                    }
                    z = z5;
                    if (((str.charAt(i5) - '0') & MinElf.PN_XNUM) >= 10 && (((r15 | ' ') - 97) & MinElf.PN_XNUM) >= 6) {
                        break;
                    }
                    i5++;
                    z5 = z;
                }
                boolean z6 = i4 != i5 ? z : false;
                if (i5 <= length) {
                    if (str.charAt(i5) == '.') {
                        int i6 = i5 + 1;
                        int i7 = i6;
                        while (i7 <= length) {
                            char c2 = c;
                            if (((str.charAt(i7) - '0') & MinElf.PN_XNUM) >= 10 && (((r15 | ' ') - 97) & MinElf.PN_XNUM) >= 6) {
                                break;
                            }
                            i7++;
                            c = c2;
                        }
                        z4 = i6 != i7 ? z : false;
                        i5 = i7;
                    } else {
                        z4 = false;
                    }
                    if (z6 || z4) {
                        i2 = i5;
                        if (i2 != -1 || i2 > length) {
                            return false;
                        }
                        z2 = z;
                        if (!z2) {
                            int i8 = i2;
                            while (i8 <= length && ((str.charAt(i8) - ImageSizeKey.SIZE_KEY_UNDEFINED) & MinElf.PN_XNUM) < 10) {
                                i8++;
                            }
                            boolean z7 = i2 != i8 ? z : false;
                            if (i8 > length) {
                                i2 = i8;
                            } else {
                                if (str.charAt(i8) == '.') {
                                    int i9 = i8 + 1;
                                    i = i9;
                                    while (i <= length && ((str.charAt(i) - ImageSizeKey.SIZE_KEY_UNDEFINED) & MinElf.PN_XNUM) < 10) {
                                        i++;
                                    }
                                    if (i9 != i) {
                                        z3 = z;
                                        if (!z7 || z3) {
                                            i2 = i;
                                        } else {
                                            String str2 = length == i + 2 ? "NaN" : length == i + 7 ? "Infinity" : null;
                                            i2 = (str2 != null && drm0.I(str, str2, i, false) == i) ? length + 1 : -1;
                                        }
                                    }
                                } else {
                                    i = i8;
                                }
                                z3 = false;
                                if (z7) {
                                }
                                i2 = i;
                            }
                            if (i2 == -1) {
                                return false;
                            }
                            if (i2 > length) {
                                return z;
                            }
                        }
                        int i10 = i2 + 1;
                        charAt = str.charAt(i2) | ' ';
                        if (charAt == (!z2 ? 112 : 101)) {
                            if (z2 || (!(charAt == 102 || charAt == 100) || i10 <= length)) {
                                return false;
                            }
                            return z;
                        }
                        if (i10 > length) {
                            return false;
                        }
                        if ((str.charAt(i10) == '+' || str.charAt(i10) == '-') && (i10 = i2 + 2) > length) {
                            return false;
                        }
                        while (i10 <= length && ((str.charAt(i10) - ImageSizeKey.SIZE_KEY_UNDEFINED) & MinElf.PN_XNUM) < 10) {
                            i10++;
                        }
                        if (i10 > length) {
                            return z;
                        }
                        if (i10 != length) {
                            return false;
                        }
                        int charAt2 = str.charAt(i10) | ' ';
                        if (charAt2 == 102 || charAt2 == 100) {
                            return z;
                        }
                        return false;
                    }
                }
                i2 = -1;
                if (i2 != -1) {
                }
                return false;
            }
        }
        z = true;
        z2 = false;
        if (!z2) {
        }
        int i102 = i2 + 1;
        charAt = str.charAt(i2) | ' ';
        if (charAt == (!z2 ? 112 : 101)) {
        }
    }

    public static final void j(String str) {
        throw new NumberFormatException(air.b('\'', "Invalid number format: '", str));
    }

    public static Double k(String str) {
        try {
            if (i(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Float l(String str) {
        try {
            if (i(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Integer m(int i, String str) {
        boolean z;
        int i2;
        int i3;
        ro.d(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        if (epx.g(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i5 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), i);
            if (digit < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + digit) {
                return null;
            }
            i4 = i3 - digit;
            i2++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    public static Long n(String str) {
        boolean z;
        ro.d(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        int g = epx.g(charAt, 48);
        long j = C.TIME_UNSET;
        if (g < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
                i = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / 10;
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            long j5 = digit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }
}
