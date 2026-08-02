package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public class evu0 extends cvu0 {
    public static boolean A(CharSequence charSequence, CharSequence charSequence2) {
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? cvu0.s((String) charSequence, (String) charSequence2, false) : P(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
    }

    public static boolean B(String str, char c) {
        return str.length() > 0 && sza.f(str.charAt(C(str)), c, false);
    }

    public static int C(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static int D(CharSequence charSequence, char c, int i, boolean z) {
        return (z || !(charSequence instanceof String)) ? I(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static final int E(CharSequence charSequence, String str, int i, boolean z) {
        return (z || !(charSequence instanceof String)) ? F(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int F(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        b6w i3;
        int i4 = i;
        int i5 = i2;
        if (z2) {
            int C = C(charSequence);
            if (i4 > C) {
                i4 = C;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            i3 = y6i0.i(i4, i5);
        } else {
            if (i4 < 0) {
                i4 = 0;
            }
            int length = charSequence.length();
            if (i5 > length) {
                i5 = length;
            }
            i3 = new d6w(i4, i5, 1);
        }
        int i6 = i3.c;
        int i7 = i3.b;
        int i8 = i3.a;
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            if ((i6 <= 0 || i8 > i7) && (i6 >= 0 || i7 > i8)) {
                return -1;
            }
            int i9 = i8;
            while (!P(charSequence2, 0, charSequence, i9, charSequence2.length(), z)) {
                if (i9 == i7) {
                    return -1;
                }
                i9 += i6;
            }
            return i9;
        }
        if ((i6 <= 0 || i8 > i7) && (i6 >= 0 || i7 > i8)) {
            return -1;
        }
        int i10 = i8;
        while (true) {
            String str = (String) charSequence2;
            String str2 = (String) charSequence;
            int length2 = str.length();
            if (!z ? str.regionMatches(0, str2, i10, length2) : str.regionMatches(z, 0, str2, i10, length2)) {
                return i10;
            }
            if (i10 == i7) {
                return -1;
            }
            i10 += i6;
        }
    }

    public static /* synthetic */ int G(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return D(charSequence, c, i, false);
    }

    public static /* synthetic */ int H(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return E(charSequence, str, i, z);
    }

    public static final int I(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                w511.i("Array is empty.");
                return 0;
            }
            if (length == 1) {
                return ((String) charSequence).indexOf(cArr[0], i);
            }
            ny61.g("Array has more than one element.");
            return 0;
        }
        if (i < 0) {
            i = 0;
        }
        int C = C(charSequence);
        if (i > C) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (sza.f(c, charAt, z)) {
                    return i;
                }
            }
            if (i == C) {
                return -1;
            }
            i++;
        }
    }

    public static boolean J(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!rza.b(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int K(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = C(charSequence);
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(cArr[0], i);
        }
        int C = C(charSequence);
        if (i > C) {
            i = C;
        }
        while (-1 < i) {
            if (sza.f(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int L(String str, CharSequence charSequence, int i) {
        int C = (i & 2) != 0 ? C(charSequence) : 0;
        return !(charSequence instanceof String) ? F(charSequence, str, C, 0, false, true) : ((String) charSequence).lastIndexOf(str, C);
    }

    public static List M(CharSequence charSequence) {
        jjy jjyVar = new jjy(charSequence);
        if (!jjyVar.hasNext()) {
            return EmptyList.a;
        }
        Object next = jjyVar.next();
        if (!jjyVar.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (jjyVar.hasNext()) {
            arrayList.add(jjyVar.next());
        }
        return arrayList;
    }

    public static String N(char c, int i, String str) {
        CharSequence charSequence;
        if (i < 0) {
            ny61.g(oyr.j(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static nsh O(CharSequence charSequence, char[] cArr, int i) {
        V(i);
        return new nsh(charSequence, i, new but0(4, cArr));
    }

    public static final boolean P(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!sza.f(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String Q(CharSequence charSequence, String str) {
        return b0(str, charSequence) ? str.substring(charSequence.length()) : str;
    }

    public static CharSequence R(int i, int i2, CharSequence charSequence) {
        if (i2 < i) {
            ny61.m(b64.d(i2, i, "End index (", ") is less than start index (", ")."));
            return null;
        }
        if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
        sb.append(charSequence, 0, i);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static String S(CharSequence charSequence, String str) {
        return A(str, charSequence) ? str.substring(0, str.length() - charSequence.length()) : str;
    }

    public static String T(String str, String str2, String str3) {
        return (str.length() >= str3.length() + str2.length() && b0(str, str2) && A(str, str3)) ? str.substring(str2.length(), str.length() - str3.length()) : str;
    }

    public static StringBuilder U(int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
        if (i2 < i) {
            ny61.m(b64.d(i2, i, "End index (", ") is less than start index (", ")."));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static final void V(int i) {
        if (i >= 0) {
            return;
        }
        w511.f(oyr.i(i, "Limit must be non-negative, but was "));
    }

    public static List W(CharSequence charSequence, String[] strArr, int i) {
        int i2 = 1;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return X(str, charSequence, i);
            }
        }
        V(i);
        nsh<d6w> nshVar = new nsh(charSequence, i, new zmi0(Arrays.asList(strArr), i2));
        ArrayList arrayList = new ArrayList(tcc.n(new g73(2, nshVar), 10));
        for (d6w d6wVar : nshVar) {
            arrayList.add(charSequence.subSequence(d6wVar.a, d6wVar.b + 1).toString());
        }
        return arrayList;
    }

    public static final List X(String str, CharSequence charSequence, int i) {
        V(i);
        int E = E(charSequence, str, 0, false);
        if (E == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        do {
            arrayList.add(charSequence.subSequence(i3, E).toString());
            i3 = str.length() + E;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            E = E(charSequence, str, i3, false);
        } while (E != -1);
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public static List Y(CharSequence charSequence, char[] cArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (cArr.length == 1) {
            return X(String.valueOf(cArr[0]), charSequence, i);
        }
        nsh<d6w> O = O(charSequence, cArr, i);
        ArrayList arrayList = new ArrayList(tcc.n(new g73(2, O), 10));
        for (d6w d6wVar : O) {
            arrayList.add(charSequence.subSequence(d6wVar.a, d6wVar.b + 1).toString());
        }
        return arrayList;
    }

    public static boolean a0(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && sza.f(charSequence.charAt(0), c, false);
    }

    public static boolean b0(CharSequence charSequence, CharSequence charSequence2) {
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? cvu0.x((String) charSequence, (String) charSequence2, false) : P(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
    }

    public static String c0(char c, String str, String str2) {
        int G = G(str, c, 0, 6);
        return G == -1 ? str2 : str.substring(G + 1, str.length());
    }

    public static String d0(String str, String str2, String str3) {
        int H = H(str, str2, 0, false, 6);
        return H == -1 ? str3 : str.substring(str2.length() + H, str.length());
    }

    public static String e0(char c, String str, String str2) {
        int K = K(str, c, 0, 6);
        return K == -1 ? str2 : str.substring(K + 1, str.length());
    }

    public static String f0(char c, String str, String str2) {
        int G = G(str, c, 0, 6);
        return G == -1 ? str2 : str.substring(0, G);
    }

    public static String g0(String str, String str2, String str3) {
        int H = H(str, str2, 0, false, 6);
        return H == -1 ? str3 : str.substring(0, H);
    }

    public static String h0(char c, String str, String str2) {
        int K = K(str, c, 0, 6);
        return K == -1 ? str2 : str.substring(0, K);
    }

    public static boolean i0(String str) {
        if (str.equals("true")) {
            return true;
        }
        if (str.equals("false")) {
            return false;
        }
        ny61.g("The string doesn't represent a boolean value: ".concat(str));
        return false;
    }

    public static Boolean j0(String str) {
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static CharSequence k0(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean b = rza.b(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!b) {
                    break;
                }
                length--;
            } else if (b) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String l0(String str, char... cArr) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean x = j73.x(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!x) {
                    break;
                }
                length--;
            } else if (x) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static CharSequence m0(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!rza.b(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static String n0(String str, char... cArr) {
        CharSequence charSequence;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!j73.x(cArr, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static CharSequence o0(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!rza.b(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static String p0(String str, char... cArr) {
        CharSequence charSequence;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequence = "";
                break;
            }
            if (!j73.x(cArr, str.charAt(i))) {
                charSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequence.toString();
    }

    public static boolean y(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (H(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (F(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean z(CharSequence charSequence, char c) {
        return G(charSequence, c, 0, 2) >= 0;
    }
}
