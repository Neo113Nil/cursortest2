package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class hw41 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final ef90 a = new ef90();
    public final StringBuilder b = new StringBuilder();

    public static String a(ef90 ef90Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = ef90Var.b;
        int i2 = ef90Var.c;
        while (i < i2 && !z) {
            char c2 = (char) ef90Var.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        ef90Var.L(i - ef90Var.b);
        return sb.toString();
    }

    public static String b(ef90 ef90Var, StringBuilder sb) {
        c(ef90Var);
        if (ef90Var.a() == 0) {
            return null;
        }
        String a = a(ef90Var, sb);
        if (!"".equals(a)) {
            return a;
        }
        return "" + ((char) ef90Var.y());
    }

    public static void c(ef90 ef90Var) {
        while (true) {
            for (boolean z = true; ef90Var.a() > 0 && z; z = false) {
                int i = ef90Var.b;
                byte[] bArr = ef90Var.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    ef90Var.L(1);
                } else {
                    int i2 = ef90Var.c;
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
                            ef90Var.L(i2 - ef90Var.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
