package xsna;

import io.jsonwebtoken.JwtParser;
import java.util.Locale;
import xsna.ff;

/* compiled from: StringsJVM.kt */
/* loaded from: classes11.dex */
public class brm0 extends arm0 {
    public static String A(String str, String str2, String str3) {
        int K = drm0.K(0, 2, str, str2, false);
        return K < 0 ? str : drm0.Y(str, K, str2.length() + K, str3).toString();
    }

    public static boolean B(String str, String str2, boolean z) {
        if (!z) {
            return str.startsWith(str2);
        }
        int length = str2.length();
        return !z ? str.regionMatches(0, str2, 0, length) : str.regionMatches(z, 0, str2, 0, length);
    }

    @ozl
    public static String o(String str) {
        return p(str, Locale.getDefault());
    }

    @ozl
    public static String p(String str, Locale locale) {
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
        return up.b(1, str, sb);
    }

    public static String q(char[] cArr, int i, int i2) {
        ff.a aVar = ff.Companion;
        int length = cArr.length;
        aVar.getClass();
        ff.a.a(i, i2, length);
        return new String(cArr, i, i2 - i);
    }

    public static boolean r(CharSequence charSequence, CharSequence charSequence2) {
        boolean z = charSequence instanceof String;
        if (z && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z && (charSequence2 instanceof String)) {
            return epx.f(charSequence, charSequence2);
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

    public static boolean s(CharSequence charSequence, String str) {
        if (str != null && (charSequence instanceof String)) {
            return w(str, (String) charSequence, true);
        }
        if (str != charSequence) {
            if (str != null && charSequence != null && str.length() == charSequence.length()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    if (ro.g(str.charAt(i), charSequence.charAt(i), true)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @ozl
    public static String t(String str) {
        return (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) ? str : str.substring(0, 1).toLowerCase(Locale.getDefault()).concat(str.substring(1));
    }

    public static String u(byte[] bArr) {
        return new String(bArr, emb.b);
    }

    public static boolean v(String str, String str2, boolean z) {
        return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean w(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static String x(int i, CharSequence charSequence) {
        if (i < 0) {
            throw new IllegalArgumentException(uqi.a("Count 'n' must be non-negative, but was ", i, JwtParser.SEPARATOR_CHAR).toString());
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

    public static String y(String str, String str2, String str3) {
        int I = drm0.I(str, str2, 0, false);
        if (I < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, I);
            sb.append(str3);
            i2 = I + length;
            if (I >= str.length()) {
                break;
            }
            I = drm0.I(str, str2, I + i, false);
        } while (I > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }
}
