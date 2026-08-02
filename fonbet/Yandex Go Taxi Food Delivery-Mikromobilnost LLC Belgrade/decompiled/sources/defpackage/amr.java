package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class amr {
    public static final amr c = new amr();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final Object a(g0c g0cVar) {
        Object obj = this.a.get(g0cVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
