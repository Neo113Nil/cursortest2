package defpackage;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes4.dex */
public final class pv7 implements rv7 {
    public final ScheduledFuture a;

    public pv7(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // defpackage.rv7
    public final void a(Throwable th) {
        this.a.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.a + ']';
    }
}
