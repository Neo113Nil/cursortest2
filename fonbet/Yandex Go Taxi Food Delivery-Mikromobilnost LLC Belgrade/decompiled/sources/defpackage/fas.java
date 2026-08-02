package defpackage;

import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class fas implements uis0 {
    public final uis0 a;

    public fas(uis0 uis0Var) {
        this.a = uis0Var;
    }

    @jxi
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final uis0 m482deprecated_delegate() {
        return this.a;
    }

    @Override // defpackage.uis0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    public final uis0 delegate() {
        return this.a;
    }

    @Override // defpackage.uis0, java.io.Flushable
    public void flush() throws IOException {
        this.a.flush();
    }

    @Override // defpackage.uis0
    public ydz0 timeout() {
        return this.a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }

    @Override // defpackage.uis0
    public void write(yp6 yp6Var, long j) throws IOException {
        this.a.write(yp6Var, j);
    }
}
