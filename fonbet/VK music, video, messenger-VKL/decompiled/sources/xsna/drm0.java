package xsna;

import androidx.credentials.provider.CredentialEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;

/* compiled from: _StringsJvm.kt */
/* loaded from: classes11.dex */
public class drm0 extends brm0 {
    public static boolean D(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (K(0, 2, charSequence, (String) charSequence2, z) >= 0) {
                return true;
            }
        } else if (J(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean E(CharSequence charSequence, char c) {
        return L(charSequence, c, 0, 2) >= 0;
    }

    public static boolean F(CharSequence charSequence, CharSequence charSequence2) {
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? brm0.v((String) charSequence, (String) charSequence2, false) : T(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
    }

    public static boolean G(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && ro.g(charSequence.charAt(H(charSequence)), c, false);
    }

    public static int H(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static int I(CharSequence charSequence, String str, int i, boolean z) {
        return (z || !(charSequence instanceof String)) ? J(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int J(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        i9x m;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int H = H(charSequence);
            if (i3 > H) {
                i3 = H;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            m = swe0.m(i3, i4);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            m = new k9x(i3, i4, 1);
        }
        int i5 = m.d;
        int i6 = m.c;
        int i7 = m.b;
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            if ((i5 <= 0 || i7 > i6) && (i5 >= 0 || i6 > i7)) {
                return -1;
            }
            int i8 = i7;
            while (!T(charSequence2, 0, charSequence, i8, charSequence2.length(), z)) {
                if (i8 == i6) {
                    return -1;
                }
                i8 += i5;
            }
            return i8;
        }
        if ((i5 <= 0 || i7 > i6) && (i5 >= 0 || i6 > i7)) {
            return -1;
        }
        int i9 = i7;
        while (true) {
            String str = (String) charSequence2;
            String str2 = (String) charSequence;
            int length2 = str.length();
            if (!z ? str.regionMatches(0, str2, i9, length2) : str.regionMatches(z, 0, str2, i9, length2)) {
                return i9;
            }
            if (i9 == i6) {
                return -1;
            }
            i9 += i5;
        }
    }

    public static /* synthetic */ int K(int i, int i2, CharSequence charSequence, String str, boolean z) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return I(charSequence, str, i, z);
    }

    public static int L(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return !(charSequence instanceof String) ? M(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static final int M(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int H = H(charSequence);
        if (i > H) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (ro.g(c, charAt, z)) {
                    return i;
                }
            }
            if (i == H) {
                return -1;
            }
            i++;
        }
    }

    public static boolean N(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!ro.j(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int O(int i, int i2, CharSequence charSequence, String str) {
        if ((i2 & 2) != 0) {
            i = H(charSequence);
        }
        int i3 = i;
        return !(charSequence instanceof String) ? J(charSequence, str, i3, 0, false, true) : ((String) charSequence).lastIndexOf(str, i3);
    }

    public static int P(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = H(charSequence);
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(cArr[0], i);
        }
        int H = H(charSequence);
        if (i > H) {
            i = H;
        }
        while (-1 < i) {
            if (ro.g(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static List Q(CharSequence charSequence) {
        o8z o8zVar = new o8z(charSequence);
        if (!o8zVar.hasNext()) {
            return EmptyList.b;
        }
        String next = o8zVar.next();
        if (!o8zVar.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList b = y57.b(next);
        while (o8zVar.hasNext()) {
            b.add(o8zVar.next());
        }
        return b;
    }

    public static String R(String str, int i, char c) {
        CharSequence charSequence;
        if (i < 0) {
            throw new IllegalArgumentException(tgw.b(i, "Desired length ", " is less than zero."));
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

    public static zvl S(CharSequence charSequence, String[] strArr, int i) {
        Z(i);
        return new zvl(charSequence, i, new aza(Arrays.asList(strArr), 10));
    }

    public static final boolean T(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!ro.g(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String U(String str, String str2) {
        return e0(str, str2) ? str.substring(str2.length()) : str;
    }

    public static CharSequence V(int i, int i2, CharSequence charSequence) {
        if (i2 < i) {
            throw new IndexOutOfBoundsException(sl9.c(i2, i, "End index (", ") is less than start index (", ")."));
        }
        if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
        sb.append(charSequence, 0, i);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static String W(String str, String str2) {
        return F(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static String X(String str) {
        return (str.length() >= 2 && e0(str, "\"") && F(str, "\"")) ? qoy.c(1, 1, str) : str;
    }

    public static StringBuilder Y(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 < i) {
            throw new IndexOutOfBoundsException(sl9.c(i2, i, "End index (", ") is less than start index (", ")."));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static final void Z(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List a0(String str, CharSequence charSequence, int i) {
        Z(i);
        int I = I(charSequence, str, 0, false);
        if (I == -1 || i == 1) {
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
            arrayList.add(charSequence.subSequence(i3, I).toString());
            i3 = str.length() + I;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            I = I(charSequence, str, i3, false);
        } while (I != -1);
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public static List b0(CharSequence charSequence, char[] cArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (cArr.length == 1) {
            return a0(String.valueOf(cArr[0]), charSequence, i);
        }
        Z(i);
        jli0 jli0Var = new jli0(new zvl(charSequence, i, new u70(cArr, 10)));
        ArrayList arrayList = new ArrayList(c5g.u(jli0Var, 10));
        Iterator<Object> it = jli0Var.iterator();
        while (it.hasNext()) {
            k9x k9xVar = (k9x) it.next();
            arrayList.add(charSequence.subSequence(k9xVar.b, k9xVar.c + 1).toString());
        }
        return arrayList;
    }

    public static List c0(CharSequence charSequence, String[] strArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return a0(str, charSequence, i);
            }
        }
        jli0 jli0Var = new jli0(S(charSequence, strArr, i));
        ArrayList arrayList = new ArrayList(c5g.u(jli0Var, 10));
        Iterator<Object> it = jli0Var.iterator();
        while (it.hasNext()) {
            k9x k9xVar = (k9x) it.next();
            arrayList.add(charSequence.subSequence(k9xVar.b, k9xVar.c + 1).toString());
        }
        return arrayList;
    }

    public static boolean d0(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && ro.g(charSequence.charAt(0), c, false);
    }

    public static boolean e0(CharSequence charSequence, CharSequence charSequence2) {
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? brm0.B((String) charSequence, (String) charSequence2, false) : T(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
    }

    public static CharSequence f0(CharSequence charSequence, k9x k9xVar) {
        return charSequence.subSequence(k9xVar.b, k9xVar.c + 1);
    }

    public static String g0(String str, String str2, String str3) {
        int K = K(0, 6, str, str2, false);
        return K == -1 ? str3 : str.substring(str2.length() + K, str.length());
    }

    public static String h0(String str, char c) {
        int L = L(str, c, 0, 6);
        return L == -1 ? str : str.substring(L + 1, str.length());
    }

    public static String i0(char c, String str, String str2) {
        int P = P(str, c, 0, 6);
        return P == -1 ? str2 : str.substring(P + 1, str.length());
    }

    public static String j0(String str, String str2, String str3) {
        int O = O(0, 6, str, str2);
        return O == -1 ? str3 : str.substring(str2.length() + O, str.length());
    }

    public static String k0(String str, String str2, String str3) {
        int K = K(0, 6, str, str2, false);
        return K == -1 ? str3 : str.substring(0, K);
    }

    public static String l0(String str, char c) {
        int L = L(str, c, 0, 6);
        return L == -1 ? str : str.substring(0, L);
    }

    public static String m0(char c, String str, String str2) {
        int P = P(str, c, 0, 6);
        return P == -1 ? str2 : str.substring(0, P);
    }

    public static String n0(String str, String str2) {
        int O = O(0, 6, str, str2);
        return O == -1 ? str : str.substring(0, O);
    }

    public static Boolean o0(String str) {
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals(CredentialEntry.FALSE_STRING)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static CharSequence p0(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean j = ro.j(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!j) {
                    break;
                }
                length--;
            } else if (j) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String q0(String str, char... cArr) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean F = rl3.F(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!F) {
                    break;
                }
                length--;
            } else if (F) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static CharSequence r0(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!ro.j(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static String s0(String str, char... cArr) {
        CharSequence charSequence;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!rl3.F(cArr, str.charAt(length))) {
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

    public static CharSequence t0(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!ro.j(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }
}
