package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class h270 {
    public final AtomicBoolean a = new AtomicBoolean(false);

    public final void a(Runnable runnable) {
        if (this.a.compareAndSet(false, true)) {
            runnable.run();
        }
    }
}
