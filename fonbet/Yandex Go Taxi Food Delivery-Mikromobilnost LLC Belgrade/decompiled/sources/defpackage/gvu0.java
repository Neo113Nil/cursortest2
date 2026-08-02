package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public class gvu0 extends fvu0 {
    public static String A0(int i, String str) {
        if (i < 0) {
            w511.f(oyr.j(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static String B0(int i, String str) {
        if (i < 0) {
            w511.f(oyr.j(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(length - i);
    }

    public static List C0(String str) {
        int length = str.length();
        if (length == 0) {
            return EmptyList.a;
        }
        if (length == 1) {
            return Collections.singletonList(Character.valueOf(str.charAt(0)));
        }
        ArrayList arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(Character.valueOf(str.charAt(i)));
        }
        return arrayList;
    }

    public static ArrayList q0(int i, String str) {
        omu0 omu0Var = new omu0(2);
        y5e.j(i, i);
        int length = str.length();
        int i2 = 0;
        ArrayList arrayList = new ArrayList((length / i) + (length % i == 0 ? 0 : 1));
        while (i2 >= 0 && i2 < length) {
            int i3 = i2 + i;
            arrayList.add(omu0Var.invoke(str.subSequence(i2, (i3 < 0 || i3 > length) ? length : i3)));
            i2 = i3;
        }
        return arrayList;
    }

    public static String r0(int i, String str) {
        if (i < 0) {
            w511.f(oyr.j(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static CharSequence s0(int i, CharSequence charSequence) {
        if (i < 0) {
            w511.f(oyr.j(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = charSequence.length() - i;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            w511.f(oyr.j(length, "Requested character count ", " is less than zero."));
            return null;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        return charSequence.subSequence(0, length);
    }

    public static String t0(int i, String str) {
        if (i < 0) {
            w511.f(oyr.j(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return A0(length, str);
    }

    public static char u0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        w511.i("Char sequence is empty.");
        return (char) 0;
    }

    public static Character v0(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static Character w0(int i, CharSequence charSequence) {
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    public static char x0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(evu0.C(charSequence));
        }
        w511.i("Char sequence is empty.");
        return (char) 0;
    }

    public static Character y0(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static StringBuilder z0(String str) {
        return new StringBuilder((CharSequence) str).reverse();
    }
}
