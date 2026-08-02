package com.yandex.div.evaluable.internal;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.TokenizingException;
import xsna.drm0;
import xsna.zr;

/* compiled from: LiteralsEscaper.kt */
/* loaded from: classes7.dex */
public final class LiteralsEscaper {
    public static final LiteralsEscaper INSTANCE = new LiteralsEscaper();
    private static final String[] ESCAPE_LITERALS = {"'", "@{"};

    private LiteralsEscaper() {
    }

    private final int countConsecutiveBackslashes(String str, int i) {
        int i2 = i;
        while (i2 < str.length() && str.charAt(i2) == '\\') {
            i2++;
        }
        return i2 - i;
    }

    private final String escapeLiteral(String str, int i, String[] strArr) {
        if (i == str.length() || str.charAt(i) == ' ') {
            String a = zr.a("Error tokenizing '", str, "'.");
            StringBuilder sb = new StringBuilder("Alone backslash at ");
            sb.append(i - 1);
            throw new EvaluableException(a, new TokenizingException(sb.toString(), null, 2, null));
        }
        for (String str2 : strArr) {
            if (isPossibleEscapeLiteral(str2, str, i)) {
                return str2;
            }
        }
        throw new EvaluableException("Incorrect string escape", null, 2, null);
    }

    private final boolean isPossibleEscapeLiteral(String str, String str2, int i) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + i2;
            if (i3 >= str2.length() || str2.charAt(i3) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String process$default(LiteralsEscaper literalsEscaper, String str, String[] strArr, int i, Object obj) {
        if ((i & 2) != 0) {
            strArr = ESCAPE_LITERALS;
        }
        return literalsEscaper.process(str, strArr);
    }

    public final String process(String str, String[] strArr) {
        if (!drm0.E(str, '\\')) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) != '\\') {
                sb.append(str.charAt(i));
                i++;
            } else {
                int countConsecutiveBackslashes = countConsecutiveBackslashes(str, i);
                i += countConsecutiveBackslashes;
                int i2 = countConsecutiveBackslashes / 2;
                for (int i3 = 0; i3 < i2; i3++) {
                    sb.append('\\');
                }
                if (countConsecutiveBackslashes % 2 == 1) {
                    String escapeLiteral = escapeLiteral(str, i, strArr);
                    sb.append(escapeLiteral);
                    i += escapeLiteral.length();
                }
            }
        }
        return sb.toString();
    }
}
