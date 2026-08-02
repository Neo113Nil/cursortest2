package xsna;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: DefaultExecutorSupplier.kt */
/* loaded from: classes.dex */
public final class sel implements r3q {
    public final ExecutorService b;
    public final ExecutorService c;
    public final ScheduledExecutorService e;
    public final ExecutorService a = Executors.newFixedThreadPool(2, new jcd0("FrescoIoBoundExecutor"));
    public final ExecutorService d = Executors.newFixedThreadPool(1, new jcd0("FrescoLightWeightBackgroundExecutor"));

    public sel(int i) {
        this.b = Executors.newFixedThreadPool(i, new jcd0("FrescoDecodeExecutor"));
        this.c = Executors.newFixedThreadPool(i, new jcd0("FrescoBackgroundExecutor"));
        this.e = Executors.newScheduledThreadPool(i, new jcd0("FrescoBackgroundExecutor"));
    }

    @Override // xsna.r3q
    public final ExecutorService a() {
        return this.c;
    }

    @Override // xsna.r3q
    public final ExecutorService b() {
        return this.a;
    }

    @Override // xsna.r3q
    public final ExecutorService c() {
        return this.a;
    }

    @Override // xsna.r3q
    public final ExecutorService d() {
        return this.d;
    }

    @Override // xsna.r3q
    public final ExecutorService e() {
        return this.a;
    }

    @Override // xsna.r3q
    public final ExecutorService f() {
        return this.b;
    }
}
