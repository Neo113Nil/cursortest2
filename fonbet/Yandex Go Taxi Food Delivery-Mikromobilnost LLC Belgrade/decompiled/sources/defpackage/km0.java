package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class km0 {
    public final ConcurrentHashMap a;
    public final ConcurrentHashMap b;

    public km0() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.a = concurrentHashMap;
        this.b = concurrentHashMap;
    }

    public final LinkedHashMap a() {
        return new LinkedHashMap(this.b);
    }

    public final void b(String str, String str2) {
        this.a.put(str, str2);
    }
}
