package xsna;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: TaskSchedulers.kt */
/* loaded from: classes12.dex */
public final class nz3 implements a7o0 {
    public static final nz3 a = new nz3();
    public static final bpn0 b = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.b(1));
    public static final ConcurrentHashMap<Runnable, Future<?>> c = new ConcurrentHashMap<>();

    @Override // xsna.a7o0
    public final void a(long j, Runnable runnable) {
        c.put(runnable, ((ScheduledExecutorService) b.getValue()).schedule(runnable, j, TimeUnit.MILLISECONDS));
    }

    @Override // xsna.a7o0
    public final void b(Runnable runnable) {
        Future<?> remove = c.remove(runnable);
        if (remove != null) {
            remove.cancel(true);
        }
    }
}
