package xsna;

/* compiled from: CloseableCoroutineScope.kt */
/* loaded from: classes12.dex */
public final class rvf implements AutoCloseable, yvj {
    public final kotlin.coroutines.d b;

    public rvf(kotlin.coroutines.d dVar) {
        this.b = dVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        iyx.b(this.b, null);
    }

    @Override // xsna.yvj
    public final kotlin.coroutines.d getCoroutineContext() {
        return this.b;
    }
}
