package com.yandex.passport.internal.flags.experiments;

import java.util.Map;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes8.dex */
public final class a {
    public final Map a;
    public final Map b;
    public final String c;

    public a(Map map, String str, Map map2) {
        this.a = map;
        this.b = map2;
        this.c = str;
    }

    public final String toString() {
        return this.a + HexString.CHAR_SPACE + this.b + HexString.CHAR_SPACE + this.c;
    }
}
