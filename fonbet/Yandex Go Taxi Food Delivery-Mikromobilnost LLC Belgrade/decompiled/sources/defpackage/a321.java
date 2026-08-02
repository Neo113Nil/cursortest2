package defpackage;

/* loaded from: classes9.dex */
public final class a321 extends rvj0 implements y9t0 {
    public final wg10 a;
    public final long b;

    public a321(long j, wg10 wg10Var) {
        this.a = wg10Var;
        this.b = j;
    }

    @Override // defpackage.rvj0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.rvj0
    public final long contentLength() {
        return this.b;
    }

    @Override // defpackage.rvj0
    public final wg10 contentType() {
        return this.a;
    }

    @Override // defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.rvj0
    public final qq6 source() {
        return new jci0(this);
    }

    @Override // defpackage.y9t0
    public final ydz0 timeout() {
        return ydz0.d;
    }
}
