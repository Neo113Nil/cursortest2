package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public class mom0 extends yko {
    public final sse b;

    public mom0(int i, int i2, String str, long j) {
        this.b = new sse(i, i2, str, j);
    }

    @Override // defpackage.jse
    public final void B(fse fseVar, Runnable runnable) {
        sse.d(this.b, runnable, 2);
    }

    @Override // defpackage.yko
    public final Executor R() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // defpackage.jse
    public final void o(fse fseVar, Runnable runnable) {
        sse.d(this.b, runnable, 6);
    }

    public mom0() {
        this(otx0.c, otx0.d, "CoroutineScheduler", otx0.e);
    }
}
