package defpackage;

import skeletor.parser.a;
import skeletor.parser.exception.SkeletorParsingException;
import skeletor.parser.exception.TokenCreationException;

/* loaded from: classes10.dex */
public final class pf90 {
    public static rms0 a(String str) {
        rms0 rms0Var;
        StringBuilder sb = new StringBuilder(str.length());
        x43 x43Var = new x43(str.length());
        x43 x43Var2 = new x43(str.length());
        String[] strArr = new String[4];
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '(') {
                x43Var2.addLast(Integer.valueOf(x43Var.size()));
                while (true) {
                    i++;
                    if (i > evu0.C(str) || str.charAt(i) == ' ') {
                        break;
                    }
                    sb.append(str.charAt(i));
                }
                String sb2 = sb.toString();
                try {
                    tfx tfxVar = (tfx) a.a.get(sb2);
                    if (tfxVar == null || (rms0Var = (rms0) ((sls) tfxVar).invoke()) == null) {
                        throw new TokenCreationException(sb2);
                    }
                    strArr = new String[4];
                    rms0Var.a = strArr;
                    x43Var.addLast(rms0Var);
                    i2 = 0;
                } catch (RuntimeException e) {
                    throw new SkeletorParsingException(e, new vf90(x43Var, sb, str, i));
                }
            } else {
                if (charAt == ')') {
                    int intValue = ((Number) x43Var2.removeLast()).intValue();
                    try {
                        rms0 rms0Var2 = (rms0) x43Var.get(intValue);
                        int i3 = intValue + 1;
                        if (uh6.q(rms0Var2, x43Var.subList(i3, x43Var.size()))) {
                            while (x43Var.size() != i3) {
                                x43Var.removeLast();
                            }
                        }
                    } catch (RuntimeException e2) {
                        throw new SkeletorParsingException(e2, new vf90(x43Var, sb, str, i));
                    }
                } else if (charAt == ' ') {
                    sb.setLength(0);
                } else {
                    while (i <= evu0.C(str) && str.charAt(i) != ')' && str.charAt(i) != ' ') {
                        sb.append(str.charAt(i));
                        i++;
                    }
                    strArr[i2] = sb.toString();
                    i2++;
                }
                i++;
            }
        }
        return (rms0) x43Var.first();
    }
}
