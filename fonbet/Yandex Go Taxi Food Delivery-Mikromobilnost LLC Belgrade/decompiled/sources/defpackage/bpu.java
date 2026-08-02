package defpackage;

import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes2.dex */
public abstract class bpu {
    public static final List a = scc.g(c(), c(), b('.'), c(), c(), b('.'), c(), c(), c(), c());
    public static final List b = scc.g(c(), c(), c(), c(), b(HexString.CHAR_SPACE), c(), c(), c(), c(), c(), c());
    public static final List c = scc.g(c(), c(), c(), c(), b(HexString.CHAR_SPACE), c(), c(), c(), c(), b(HexString.CHAR_SPACE), c(), c(), c(), c(), b(HexString.CHAR_SPACE), c(), c(), c(), c());
    public static final List d = scc.g(c(), c(), c(), c(), c(), c(), c(), c(), c(), c(), c(), c());

    public static List a() {
        return a;
    }

    public static apu b(char c2) {
        return new apu(false, Character.valueOf(c2), null, 24);
    }

    public static apu c() {
        return new apu(true, null, Collections.singletonList(new pjj()), 20);
    }
}
