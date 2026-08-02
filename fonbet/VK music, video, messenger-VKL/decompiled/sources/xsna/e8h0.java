package xsna;

import java.util.concurrent.Executor;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* compiled from: Dispatcher.kt */
/* loaded from: classes11.dex */
public class e8h0 extends i3q {
    public CoroutineScheduler c;

    @Override // xsna.ovj
    public final void P(kotlin.coroutines.d dVar, Runnable runnable) {
        CoroutineScheduler.o(this.c, runnable, 6);
    }

    @Override // xsna.ovj
    public final void Q(kotlin.coroutines.d dVar, Runnable runnable) {
        CoroutineScheduler.o(this.c, runnable, 2);
    }

    @Override // xsna.i3q
    public final Executor U() {
        return this.c;
    }
}
