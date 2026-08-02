package xsna;

import androidx.annotation.Nullable;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.b;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: MemoryGaugeCollector.java */
/* loaded from: classes13.dex */
public final class v220 {
    public static final ra2 f = ra2.d();
    public final ScheduledExecutorService a;
    public final ConcurrentLinkedQueue<com.google.firebase.perf.v1.b> b;
    public final Runtime c;

    @Nullable
    public ScheduledFuture d;
    public long e;

    public v220() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.d = null;
        this.e = -1L;
        this.a = newSingleThreadScheduledExecutor;
        this.b = new ConcurrentLinkedQueue<>();
        this.c = runtime;
    }

    public final synchronized void a(long j, Timer timer) {
        this.e = j;
        try {
            this.d = this.a.scheduleAtFixedRate(new d7n(4, this, timer), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            ra2 ra2Var = f;
            e.getMessage();
            ra2Var.h();
        }
    }

    @Nullable
    public final com.google.firebase.perf.v1.b b(Timer timer) {
        if (timer == null) {
            return null;
        }
        long d = timer.d() + timer.b;
        b.C0142b f2 = com.google.firebase.perf.v1.b.f();
        f2.b(d);
        StorageUnit storageUnit = StorageUnit.BYTES;
        Runtime runtime = this.c;
        f2.c(i3r0.b(storageUnit.a(runtime.totalMemory() - runtime.freeMemory())));
        return f2.build();
    }
}
