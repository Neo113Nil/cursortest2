package xsna;

import java.io.IOException;

/* compiled from: ForwardingSink.kt */
/* loaded from: classes8.dex */
public abstract class bas implements qwj0 {
    public final qwj0 b;

    public bas(qwj0 qwj0Var) {
        this.b = qwj0Var;
    }

    @Override // xsna.qwj0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b.close();
    }

    @Override // xsna.qwj0, java.io.Flushable
    public void flush() throws IOException {
        this.b.flush();
    }

    @Override // xsna.qwj0
    public void n1(vl8 vl8Var, long j) throws IOException {
        this.b.n1(vl8Var, j);
    }

    @Override // xsna.qwj0
    public final mxo0 timeout() {
        return this.b.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.b + ')';
    }
}
