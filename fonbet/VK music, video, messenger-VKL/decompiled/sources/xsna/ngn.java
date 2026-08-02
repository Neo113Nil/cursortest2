package xsna;

import java.util.concurrent.ScheduledFuture;

/* compiled from: Executors.kt */
/* loaded from: classes8.dex */
public final class ngn implements ogn {
    public final ScheduledFuture b;

    public ngn(ScheduledFuture scheduledFuture) {
        this.b = scheduledFuture;
    }

    @Override // xsna.ogn
    public final void dispose() {
        this.b.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.b + ']';
    }
}
