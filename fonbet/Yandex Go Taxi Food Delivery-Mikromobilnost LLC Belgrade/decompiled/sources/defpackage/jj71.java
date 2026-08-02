package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class jj71 {
    public final y071 a = new y071();

    public final String a(String str, Map map) {
        Map o = b.o(map, new Pair("{CLIENT_TIME}", String.valueOf(System.currentTimeMillis())));
        this.a.getClass();
        for (Map.Entry entry : o.entrySet()) {
            str = cvu0.v(str, (String) entry.getKey(), (String) entry.getValue(), false);
        }
        return str;
    }
}
