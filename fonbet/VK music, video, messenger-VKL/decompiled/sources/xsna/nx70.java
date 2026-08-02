package xsna;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: OkHttpCallRegistry.kt */
/* loaded from: classes2.dex */
public final class nx70 implements ox70 {
    public static final nx70 a = new nx70();
    public static final ConcurrentHashMap<Thread, Set<okhttp3.d>> b = new ConcurrentHashMap<>();

    public static void c(Thread thread) {
        Set<okhttp3.d> set = b.get(thread);
        if (set == null) {
            return;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            ((okhttp3.d) it.next()).cancel();
        }
    }

    @Override // xsna.ox70
    public final void a(f8f0 f8f0Var) {
        Set<okhttp3.d> putIfAbsent;
        String name = Thread.currentThread().getName();
        if (brm0.B(name, "im-", false) || rl3.y0(new String[]{"register-device", "msg-request-change-status-cmd", "msg-request-change-status-job", "msg-attaches-updates", "storage-changes-handlers", "cached"}).contains(name)) {
            Thread currentThread = Thread.currentThread();
            ConcurrentHashMap<Thread, Set<okhttp3.d>> concurrentHashMap = b;
            Set<okhttp3.d> set = concurrentHashMap.get(currentThread);
            if (set == null && (putIfAbsent = concurrentHashMap.putIfAbsent(currentThread, (set = tj0.c()))) != null) {
                set = putIfAbsent;
            }
            set.add(f8f0Var);
        }
    }

    @Override // xsna.ox70
    public final void b(f8f0 f8f0Var) {
        Thread currentThread = Thread.currentThread();
        ConcurrentHashMap<Thread, Set<okhttp3.d>> concurrentHashMap = b;
        Set<okhttp3.d> set = concurrentHashMap.get(currentThread);
        if (set == null) {
            return;
        }
        set.remove(f8f0Var);
        if (set.isEmpty()) {
            concurrentHashMap.remove(currentThread, set);
        }
    }
}
