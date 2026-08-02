package xsna;

import java.util.TimerTask;
import java.util.concurrent.ExecutorService;

/* compiled from: ExecutorExt.kt */
/* loaded from: classes.dex */
public final class k3q extends TimerTask {
    public final /* synthetic */ ExecutorService b;
    public final /* synthetic */ Runnable c;

    public k3q(ExecutorService executorService, Runnable runnable) {
        this.b = executorService;
        this.c = runnable;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.b.submit(this.c);
    }
}
