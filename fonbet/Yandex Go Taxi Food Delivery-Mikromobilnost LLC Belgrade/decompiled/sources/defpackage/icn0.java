package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes13.dex */
public final class icn0 {
    public static final s6x b;
    public final k6x a = new k6x();

    static {
        Map i = b.i(new Pair("sync-with-divkit", "*"), new Pair("send-to-backend", "*"));
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(i.size()));
        for (Map.Entry entry : i.entrySet()) {
            linkedHashMap.put(entry.getKey(), sb2.P(entry.getValue()));
        }
        b = new s6x(linkedHashMap);
    }

    public static r5x a(String... strArr) {
        return eja1.q(a.m0(j73.d0(strArr), Collections.singletonList("user_pd_data_form")));
    }
}
