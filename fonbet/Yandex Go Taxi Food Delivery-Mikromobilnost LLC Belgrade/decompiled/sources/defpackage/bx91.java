package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class bx91 {
    public final Intent a;
    public final BroadcastReceiver.PendingResult b;
    public boolean c = false;
    public final ScheduledFuture d;

    public bx91(Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.a = intent;
        this.b = pendingResult;
        this.d = scheduledExecutorService.schedule(new tqs((Object) this, (Object) intent, false, 25), 9500L, TimeUnit.MILLISECONDS);
    }

    public final synchronized void a() {
        if (!this.c) {
            this.b.finish();
            this.d.cancel(false);
            this.c = true;
        }
    }
}
