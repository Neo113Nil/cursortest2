package xsna;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* compiled from: WebvttCssParser.java */
/* loaded from: classes12.dex */
public final class vjx0 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final xi90 a = new xi90();
    public final StringBuilder b = new StringBuilder();

    public static String a(xi90 xi90Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = xi90Var.b;
        int i2 = xi90Var.c;
        while (i < i2 && !z) {
            char c2 = (char) xi90Var.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        xi90Var.Q(i - xi90Var.b);
        return sb.toString();
    }

    @Nullable
    public static String b(xi90 xi90Var, StringBuilder sb) {
        c(xi90Var);
        if (xi90Var.a() == 0) {
            return null;
        }
        String a = a(xi90Var, sb);
        if (!a.isEmpty()) {
            return a;
        }
        return "" + ((char) xi90Var.C());
    }

    public static void c(xi90 xi90Var) {
        while (true) {
            for (boolean z = true; xi90Var.a() > 0 && z; z = false) {
                int i = xi90Var.b;
                byte[] bArr = xi90Var.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    xi90Var.Q(1);
                } else {
                    int i2 = xi90Var.c;
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
                            xi90Var.Q(i2 - xi90Var.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
