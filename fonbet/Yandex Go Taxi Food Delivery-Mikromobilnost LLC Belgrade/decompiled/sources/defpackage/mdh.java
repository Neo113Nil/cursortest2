package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes9.dex */
public final class mdh extends yko implements Executor {
    public static final mdh b = new mdh();
    public static final jse c;

    static {
        g221 g221Var = g221.b;
        int i = t3x0.a;
        if (64 >= i) {
            i = 64;
        }
        c = g221Var.P(bvf0.Y(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.jse
    public final void B(fse fseVar, Runnable runnable) {
        c.B(fseVar, runnable);
    }

    @Override // defpackage.jse
    public final jse P(int i) {
        return g221.b.P(i);
    }

    @Override // defpackage.yko
    public final Executor R() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        o(EmptyCoroutineContext.a, runnable);
    }

    @Override // defpackage.jse
    public final void o(fse fseVar, Runnable runnable) {
        c.o(fseVar, runnable);
    }

    @Override // defpackage.jse
    public final String toString() {
        return "Dispatchers.IO";
    }
}
