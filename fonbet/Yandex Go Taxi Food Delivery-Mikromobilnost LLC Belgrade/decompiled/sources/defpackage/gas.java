package defpackage;

/* loaded from: classes9.dex */
public abstract class gas implements y9t0 {
    public final y9t0 a;

    public gas(y9t0 y9t0Var) {
        this.a = y9t0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.y9t0
    public long read(yp6 yp6Var, long j) {
        return this.a.read(yp6Var, j);
    }

    @Override // defpackage.y9t0
    public final ydz0 timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
