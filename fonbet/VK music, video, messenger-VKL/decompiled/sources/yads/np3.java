package yads;

import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class np3 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final kc2 a = new kc2();
    public final StringBuilder b = new StringBuilder();

    public static String a(kc2 kc2Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = kc2Var.b;
        int i2 = kc2Var.c;
        while (i < i2 && !z) {
            char c2 = (char) kc2Var.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        int i3 = kc2Var.b;
        kc2Var.e((i - i3) + i3);
        return sb.toString();
    }

    public static String b(kc2 kc2Var, StringBuilder sb) {
        a(kc2Var);
        if (kc2Var.c - kc2Var.b == 0) {
            return null;
        }
        String a = a(kc2Var, sb);
        if (!"".equals(a)) {
            return a;
        }
        return "" + ((char) kc2Var.m());
    }

    public static void a(kc2 kc2Var) {
        int i;
        while (true) {
            boolean z = true;
            while (true) {
                int i2 = kc2Var.c;
                i = kc2Var.b;
                if (i2 - i <= 0 || !z) {
                    return;
                }
                byte[] bArr = kc2Var.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    break;
                }
                int i3 = i + 2;
                if (i3 <= i2) {
                    int i4 = i + 1;
                    if (b == 47 && bArr[i4] == 42) {
                        while (true) {
                            int i5 = i3 + 1;
                            if (i5 >= i2) {
                                break;
                            }
                            if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                i3 += 2;
                                i2 = i3;
                            } else {
                                i3 = i5;
                            }
                        }
                        int i6 = kc2Var.b;
                        kc2Var.e((i2 - i6) + i6);
                    }
                }
                z = false;
            }
            kc2Var.e(i + 1);
        }
    }
}
