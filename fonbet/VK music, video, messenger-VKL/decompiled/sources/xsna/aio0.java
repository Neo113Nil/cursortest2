package xsna;

import io.jsonwebtoken.JwtParser;
import java.util.HashSet;

/* compiled from: TextHashtagsHelper.kt */
/* loaded from: classes4.dex */
public final class aio0 {
    public static final HashSet<Character> a = izi0.d(' ', ',', ';', Character.valueOf(JwtParser.SEPARATOR_CHAR), '!', '?', '-', '\n', '(', ')', '[', ']');

    public static int a(int i, String str) {
        while (-1 < i) {
            if (str.charAt(i) == '#') {
                return i;
            }
            i--;
        }
        return -1;
    }
}
