package xsna;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PhotoEditorStatTrackersProviderImpl.kt */
/* loaded from: classes15.dex */
public final class e7a0 implements d7a0 {
    public final q010 a;
    public final ConcurrentHashMap<String, a7a0> b = new ConcurrentHashMap<>();

    public e7a0(q010 q010Var) {
        this.a = q010Var;
    }

    @Override // xsna.d7a0
    public final a7a0 a(String str) {
        ConcurrentHashMap<String, a7a0> concurrentHashMap = this.b;
        a7a0 a7a0Var = concurrentHashMap.get(str);
        if (a7a0Var != null) {
            return a7a0Var;
        }
        c7a0 c7a0Var = new c7a0(str, new ei90((naa0) this.a.invoke()), new t9b(11, this, str));
        concurrentHashMap.put(str, c7a0Var);
        return c7a0Var;
    }
}
