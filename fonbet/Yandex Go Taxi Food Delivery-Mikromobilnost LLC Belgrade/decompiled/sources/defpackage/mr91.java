package defpackage;

import com.google.android.gms.internal.play_billing.i;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class mr91 extends nq91 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public mr91(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        i iVar = new i(Executors.callable(runnable, null));
        return new tq91(iVar, this.b.schedule(iVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ar91 ar91Var = new ar91(runnable);
        return new tq91(ar91Var, this.b.scheduleAtFixedRate(ar91Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ar91 ar91Var = new ar91(runnable);
        return new tq91(ar91Var, this.b.scheduleWithFixedDelay(ar91Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        i iVar = new i(callable);
        return new tq91(iVar, this.b.schedule(iVar, j, timeUnit));
    }
}
