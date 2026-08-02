package defpackage;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes4.dex */
public final class l1k implements m1k {
    public final ScheduledFuture a;

    public l1k(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // defpackage.m1k
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
