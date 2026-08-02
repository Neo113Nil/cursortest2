package xsna;

import java.util.concurrent.ScheduledFuture;

/* compiled from: Executors.kt */
/* loaded from: classes8.dex */
public final class lp9 implements mp9 {
    public final ScheduledFuture b;

    public lp9(ScheduledFuture scheduledFuture) {
        this.b = scheduledFuture;
    }

    @Override // xsna.mp9
    public final void a(Throwable th) {
        this.b.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.b + ']';
    }
}
