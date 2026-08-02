package defpackage;

/* loaded from: classes4.dex */
public final class o16 implements uis0 {
    @Override // defpackage.uis0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.uis0, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.uis0
    public final ydz0 timeout() {
        return ydz0.d;
    }

    @Override // defpackage.uis0
    public final void write(yp6 yp6Var, long j) {
        yp6Var.skip(j);
    }
}
