package xsna;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Configuration.kt */
/* loaded from: classes.dex */
public final class dzi implements ThreadFactory {
    public final AtomicInteger b = new AtomicInteger(0);
    public final /* synthetic */ boolean c;

    public dzi(boolean z) {
        this.c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder e = fw3.e(this.c ? "WM.task-" : "androidx.work-");
        e.append(this.b.incrementAndGet());
        return new Thread(runnable, e.toString());
    }
}
