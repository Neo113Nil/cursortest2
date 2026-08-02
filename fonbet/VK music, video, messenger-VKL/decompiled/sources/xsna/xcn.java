package xsna;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Dispatchers.kt */
/* loaded from: classes9.dex */
public final class xcn implements hgn {
    public final AtomicBoolean b = new AtomicBoolean();
    public final /* synthetic */ ScheduledFuture<?> c;

    public xcn(ScheduledFuture<?> scheduledFuture) {
        this.c = scheduledFuture;
    }

    @Override // xsna.hgn
    public final void dispose() {
        if (this.b.compareAndSet(false, true)) {
            this.c.cancel(false);
        }
    }
}
