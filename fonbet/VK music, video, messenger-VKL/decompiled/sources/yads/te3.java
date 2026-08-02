package yads;

import io.jsonwebtoken.JwtParser;
import java.util.List;
import xsna.arm0;
import xsna.drm0;
import xsna.e43;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class te3 {
    public static se3 a(String str) {
        Integer m;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (str.charAt(i) == '-') {
                    str = str.substring(0, i);
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        List b0 = drm0.b0(str, new char[]{JwtParser.SEPARATOR_CHAR}, 0, 6);
        String str2 = (String) j5g.b0(0, b0);
        if (str2 == null || (m = arm0.m(10, str2)) == null) {
            return null;
        }
        int intValue = m.intValue();
        Integer m2 = arm0.m(10, (String) (1 <= e43.h(b0) ? b0.get(1) : "0"));
        if (m2 == null) {
            return null;
        }
        int intValue2 = m2.intValue();
        Integer m3 = arm0.m(10, (String) (2 <= e43.h(b0) ? b0.get(2) : "0"));
        if (m3 != null) {
            return new se3(intValue, intValue2, m3.intValue());
        }
        return null;
    }
}
