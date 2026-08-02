package xsna;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: EventBus.java */
/* loaded from: classes.dex */
public final class ayp implements bxm0, gfe0 {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public ayp(Executor executor) {
        this.c = executor;
    }

    @Override // xsna.bxm0
    public final void a(cjr cjrVar) {
        b(this.c, cjrVar);
    }

    @Override // xsna.bxm0
    public final synchronized void b(Executor executor, azp azpVar) {
        try {
            executor.getClass();
            if (!this.a.containsKey(ytk.class)) {
                this.a.put(ytk.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(ytk.class)).put(azpVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
