package defpackage;

import java.util.Locale;

/* loaded from: classes9.dex */
public class cvu0 extends bvu0 {
    public static String n(String str) {
        Locale locale = Locale.getDefault();
        if (str.length() <= 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb.append(titleCase);
        } else {
            sb.append(str.substring(0, 1).toUpperCase(locale));
        }
        sb.append(str.substring(1));
        return sb.toString();
    }

    public static String o(char[] cArr, int i, int i2) {
        g8 g8Var = k8.Companion;
        int length = cArr.length;
        g8Var.getClass();
        g8.a(i, i2, length);
        return new String(cArr, i, i2 - i);
    }

    public static boolean p(CharSequence charSequence, CharSequence charSequence2) {
        boolean z = charSequence instanceof String;
        if (z && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (charSequence.charAt(i) == charSequence2.charAt(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String q(byte[] bArr) {
        return new String(bArr, uza.a);
    }

    public static String r(int i, int i2, int i3, byte[] bArr) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        g8 g8Var = k8.Companion;
        int length = bArr.length;
        g8Var.getClass();
        g8.a(i, i2, length);
        return new String(bArr, i, i2 - i, uza.a);
    }

    public static boolean s(String str, String str2, boolean z) {
        return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean t(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static String u(int i, CharSequence charSequence) {
        if (i < 0) {
            w511.f(oyr.e('.', i, "Count 'n' must be non-negative, but was "));
            return null;
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb = new StringBuilder(charSequence.length() * i);
            if (1 <= i) {
                while (true) {
                    sb.append(charSequence);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            return sb.toString();
        }
        char charAt = charSequence.charAt(0);
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = charAt;
        }
        return new String(cArr);
    }

    public static String v(String str, String str2, String str3, boolean z) {
        int i = 0;
        int E = evu0.E(str, str2, 0, z);
        if (E < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, E);
            sb.append(str3);
            i = E + length;
            if (E >= str.length()) {
                break;
            }
            E = evu0.E(str, str2, E + i2, z);
        } while (E > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    public static String w(String str, String str2, String str3) {
        int H = evu0.H(str, str2, 0, false, 2);
        return H < 0 ? str : evu0.U(H, str2.length() + H, str, str3).toString();
    }

    public static boolean x(String str, String str2, boolean z) {
        if (!z) {
            return str.startsWith(str2);
        }
        int length = str2.length();
        return !z ? str.regionMatches(0, str2, 0, length) : str.regionMatches(z, 0, str2, 0, length);
    }
}
