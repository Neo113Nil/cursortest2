package yads;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import xsna.brm0;
import xsna.on00;
import xsna.pn00;

/* loaded from: classes10.dex */
public final class be0 {
    public final an2 a;

    public /* synthetic */ be0() {
        this(new an2());
    }

    public final String a(String str, Map map) {
        LinkedHashMap n = pn00.n(map, on00.f(new Pair("{CLIENT_TIME}", String.valueOf(System.currentTimeMillis()))));
        this.a.getClass();
        for (Map.Entry entry : n.entrySet()) {
            str = brm0.y(str, (String) entry.getKey(), (String) entry.getValue());
        }
        return str;
    }

    public be0(an2 an2Var) {
        this.a = an2Var;
    }
}
