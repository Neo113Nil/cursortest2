package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public final class es90 extends jse {
    public final jse b;
    public final AtomicInteger c = new AtomicInteger();
    public volatile boolean w = true;
    public final LinkedBlockingQueue x = new LinkedBlockingQueue();

    public es90(g6u g6uVar) {
        this.b = g6uVar;
    }

    @Override // defpackage.jse
    public final void o(fse fseVar, Runnable runnable) {
        this.c.incrementAndGet();
        jse jseVar = this.b;
        ds90 ds90Var = new ds90(fseVar, jseVar, runnable);
        if (this.w) {
            this.x.offer(ds90Var);
        } else {
            jseVar.o(fseVar, runnable);
        }
    }
}
