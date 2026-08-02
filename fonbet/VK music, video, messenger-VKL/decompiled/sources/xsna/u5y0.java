package xsna;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class u5y0 implements hgn {
    public final AtomicBoolean b = new AtomicBoolean();
    public final /* synthetic */ ScheduledFuture<?> c;

    public u5y0(ScheduledFuture<?> scheduledFuture) {
        this.c = scheduledFuture;
    }

    @Override // xsna.hgn
    public final void dispose() {
        if (this.b.compareAndSet(false, true)) {
            this.c.cancel(false);
        }
    }
}
