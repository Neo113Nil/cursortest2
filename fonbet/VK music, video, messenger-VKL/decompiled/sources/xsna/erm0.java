package xsna;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: _Strings.kt */
/* loaded from: classes11.dex */
public class erm0 extends drm0 {
    public static char A0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(drm0.H(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static Character B0(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static CharSequence C0(int i, CharSequence charSequence) {
        if (i < 0) {
            throw new IllegalArgumentException(tgw.b(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static String D0(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(tgw.b(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static String E0(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(tgw.b(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(length - i);
    }

    public static ArrayList u0(int i, String str) {
        ygm0 ygm0Var = new ygm0(1);
        f2k0.a(i, i);
        int length = str.length();
        int i2 = 0;
        ArrayList arrayList = new ArrayList((length / i) + (length % i == 0 ? 0 : 1));
        while (i2 >= 0 && i2 < length) {
            int i3 = i2 + i;
            arrayList.add(ygm0Var.invoke(str.subSequence(i2, (i3 < 0 || i3 > length) ? length : i3)));
            i2 = i3;
        }
        return arrayList;
    }

    public static String v0(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(tgw.b(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static String w0(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(tgw.b(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return D0(length, str);
    }

    public static char x0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static Character y0(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static Character z0(int i, CharSequence charSequence) {
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }
}
