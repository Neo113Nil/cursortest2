package xsna;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: Dispatcher.kt */
/* loaded from: classes11.dex */
public final class wgl extends i3q implements Executor {
    public static final wgl c = new wgl();
    public static final ovj d;

    static {
        n4q0 n4q0Var = n4q0.c;
        int i = crn0.a;
        if (64 >= i) {
            i = 64;
        }
        d = n4q0Var.T(m9u0.c(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // xsna.ovj
    public final void P(kotlin.coroutines.d dVar, Runnable runnable) {
        d.P(dVar, runnable);
    }

    @Override // xsna.ovj
    public final void Q(kotlin.coroutines.d dVar, Runnable runnable) {
        d.Q(dVar, runnable);
    }

    @Override // xsna.ovj
    public final ovj T(int i) {
        return n4q0.c.T(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        P(EmptyCoroutineContext.b, runnable);
    }

    @Override // xsna.ovj
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // xsna.i3q
    public final Executor U() {
        return this;
    }
}
