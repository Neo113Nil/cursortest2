package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class k4c {
    public final sls a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public k4c(sls slsVar) {
        this.a = slsVar;
    }

    public final boolean a() {
        synchronized (this) {
            if (this.c.get()) {
                return false;
            }
            this.b.incrementAndGet();
            return true;
        }
    }

    public final void b() {
        synchronized (this) {
            this.b.decrementAndGet();
            if (this.b.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }
}
