package xsna;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* compiled from: WatchdogTimer.java */
/* loaded from: classes12.dex */
public final class bdx0 {
    public final long a;
    public final hkc0 b;
    public final ScheduledExecutorService c;
    public ScheduledFuture<?> d;

    public bdx0(long j, hkc0 hkc0Var) {
        this.a = j;
        this.b = hkc0Var;
        String str = y2r0.a;
        this.c = Executors.newSingleThreadScheduledExecutor(new q2r0("WatchdogTimer"));
    }
}
