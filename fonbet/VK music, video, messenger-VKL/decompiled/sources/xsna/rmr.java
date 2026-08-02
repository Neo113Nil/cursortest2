package xsna;

import com.vk.log.L;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: FixSwallowedInterruptionsThread.kt */
/* loaded from: classes5.dex */
public final class rmr extends Thread {
    public final AtomicBoolean b;

    public rmr(Runnable runnable) {
        super(runnable);
        this.b = new AtomicBoolean(false);
        setName("queue-sync-manager-worker");
        setPriority(1);
    }

    public final void a() {
        if (this.b.compareAndSet(true, false)) {
            L.e("Clear custom interrupted flag in FixSwallowedInterruptionsThread");
        }
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        this.b.set(true);
        super.interrupt();
    }
}
