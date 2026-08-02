package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class hnw {
    public static final s6x c;
    public final k6x a;
    public final cir b;

    static {
        Map z = g8e.z("send-to-backend", "*");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(z.size()));
        for (Map.Entry entry : z.entrySet()) {
            linkedHashMap.put(entry.getKey(), sb2.P(entry.getValue()));
        }
        c = new s6x(linkedHashMap);
    }

    public hnw(k6x k6xVar, cir cirVar) {
        this.a = k6xVar;
        this.b = cirVar;
    }
}
