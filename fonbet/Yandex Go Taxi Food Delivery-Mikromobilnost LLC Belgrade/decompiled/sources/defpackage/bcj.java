package defpackage;

import kotlin.a;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes2.dex */
public abstract class bcj {
    public static final i3y a = a.a(new acj(0));
    public static final dj9 b = new dj9(HexString.CHAR_SPACE, '~');

    public static String a(String str) {
        if (evu0.J(str)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        for (char c : str.toCharArray()) {
            if ((ref$BooleanRef.element && Character.isLetter(c)) || Character.isWhitespace(c)) {
                c = Character.toUpperCase(c);
                ref$BooleanRef.element = Character.isWhitespace(c);
            }
            dj9 dj9Var = b;
            if (dj9Var.a <= c && c <= dj9Var.b) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
