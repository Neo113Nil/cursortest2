package xsna;

import java.util.Collection;

/* compiled from: TableInfo.kt */
/* loaded from: classes12.dex */
public final class oxn0 {
    public static final boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return epx.f(drm0.p0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final String b(Collection<?> collection) {
        if (collection.isEmpty()) {
            return " }";
        }
        return xqm0.f(j5g.g0(collection, ",\n", "\n", "\n", 0, null, 56)) + "},";
    }
}
