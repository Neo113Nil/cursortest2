package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class ft71 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final dl81 a = new dl81();
    public final StringBuilder b = new StringBuilder();

    public static String a(dl81 dl81Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = dl81Var.b;
        int i2 = dl81Var.c;
        while (i < i2 && !z) {
            char c2 = (char) dl81Var.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        int i3 = dl81Var.b;
        dl81Var.m((i - i3) + i3);
        return sb.toString();
    }

    public static void b(dl81 dl81Var) {
        int i;
        while (true) {
            boolean z = true;
            while (true) {
                int i2 = dl81Var.c;
                i = dl81Var.b;
                if (i2 - i <= 0 || !z) {
                    return;
                }
                byte[] bArr = dl81Var.a;
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
                        int i6 = dl81Var.b;
                        dl81Var.m((i2 - i6) + i6);
                    }
                }
                z = false;
            }
            dl81Var.m(i + 1);
        }
    }

    public static String c(dl81 dl81Var, StringBuilder sb) {
        b(dl81Var);
        if (dl81Var.c - dl81Var.b == 0) {
            return null;
        }
        String a = a(dl81Var, sb);
        if (!"".equals(a)) {
            return a;
        }
        return "" + ((char) dl81Var.s());
    }
}
