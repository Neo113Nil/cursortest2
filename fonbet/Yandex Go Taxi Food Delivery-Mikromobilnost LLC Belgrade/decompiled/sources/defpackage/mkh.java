package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class mkh implements y9t0 {
    public final InputStream a;
    public final m5t0 b;
    public final /* synthetic */ cxq0 c;

    public mkh(cxq0 cxq0Var) {
        this.c = cxq0Var;
        Socket socket = (Socket) cxq0Var.b;
        this.a = socket.getInputStream();
        this.b = new m5t0(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        cxq0 cxq0Var = this.c;
        m5t0 m5t0Var = this.b;
        m5t0Var.i();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) cxq0Var.c;
            Socket socket = (Socket) cxq0Var.b;
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.a.close();
                    }
                }
                if (m5t0Var.j()) {
                    throw m5t0Var.k(null);
                }
            }
        } catch (IOException e) {
            if (!m5t0Var.j()) {
                throw e;
            }
            throw m5t0Var.k(e);
        } finally {
            m5t0Var.j();
        }
    }

    @Override // defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            w511.f(qv10.j(j, "byteCount < 0: "));
            return 0L;
        }
        m5t0 m5t0Var = this.b;
        m5t0Var.f();
        t7q0 a0 = yp6Var.a0(1);
        int min = (int) Math.min(j, 8192 - a0.c);
        try {
            m5t0Var.i();
            try {
                int read = this.a.read(a0.a, a0.c, min);
                if (m5t0Var.j()) {
                    throw m5t0Var.k(null);
                }
                if (read != -1) {
                    a0.c += read;
                    long j2 = read;
                    yp6Var.b += j2;
                    return j2;
                }
                if (a0.b != a0.c) {
                    return -1L;
                }
                yp6Var.a = a0.a();
                p8q0.a(a0);
                return -1L;
            } catch (IOException e) {
                if (m5t0Var.j()) {
                    throw m5t0Var.k(e);
                }
                throw e;
            } finally {
                m5t0Var.j();
            }
        } catch (AssertionError e2) {
            if (!xf61.b(e2)) {
                throw e2;
            }
            kbs.r(e2);
            return 0L;
        }
    }

    @Override // defpackage.y9t0
    public final ydz0 timeout() {
        return this.b;
    }

    public final String toString() {
        return "source(" + ((Socket) this.c.b) + ')';
    }
}
