package xsna;

import java.io.IOException;

/* compiled from: ForwardingSource.kt */
/* loaded from: classes8.dex */
public abstract class cas implements agk0 {
    private final agk0 delegate;

    public cas(agk0 agk0Var) {
        this.delegate = agk0Var;
    }

    @ozl
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final agk0 m406deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final agk0 delegate() {
        return this.delegate;
    }

    @Override // xsna.agk0
    public long read(vl8 vl8Var, long j) throws IOException {
        return this.delegate.read(vl8Var, j);
    }

    @Override // xsna.agk0
    public mxo0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
