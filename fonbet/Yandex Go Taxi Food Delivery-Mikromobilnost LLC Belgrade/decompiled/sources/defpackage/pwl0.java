package defpackage;

import kotlin.text.Regex;

/* loaded from: classes12.dex */
public final class pwl0 {
    public static final Regex a = new Regex("\\s{2,}");

    public static boolean a(String str) {
        String obj = evu0.k0(str).toString();
        if (obj.length() != 0) {
            int i = 0;
            while (true) {
                if (i >= obj.length()) {
                    break;
                }
                if (Character.isLetter(obj.charAt(i))) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= obj.length()) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= obj.length()) {
                                    if (evu0.y(obj, "--", false) || evu0.y(obj, "''", false) || a.a(obj)) {
                                        break;
                                    }
                                    return true;
                                }
                                char charAt = obj.charAt(i3);
                                if (!Character.isLetter(charAt) && charAt != ' ' && charAt != '-' && charAt != '\'') {
                                    break;
                                }
                                i3++;
                            }
                        } else {
                            if (Character.isDigit(obj.charAt(i2))) {
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        return false;
    }
}
