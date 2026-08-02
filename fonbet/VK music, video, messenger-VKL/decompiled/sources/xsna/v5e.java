package xsna;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ClipsFeedActivitiesStateHelper.kt */
/* loaded from: classes17.dex */
public final class v5e {
    public final ConcurrentHashMap<String, t80> a = new ConcurrentHashMap<>();

    public final t80 a(String str, t80 t80Var, boolean z) {
        ConcurrentHashMap<String, t80> concurrentHashMap = this.a;
        if (t80Var == null) {
            return concurrentHashMap.get(str);
        }
        t80 t80Var2 = concurrentHashMap.get(str);
        if ((t80Var2 != null ? t80Var2.d() : null) == null) {
            t80 a = new v80(t80Var.d()).a(z);
            concurrentHashMap.put(str, a);
            return a;
        }
        t80 a2 = t80Var2.a(z);
        if (!a2.equals(t80Var2)) {
            concurrentHashMap.put(str, a2);
        }
        return a2;
    }
}
