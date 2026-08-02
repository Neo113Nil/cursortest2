package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class lkh implements uis0 {
    public final OutputStream a;
    public final m5t0 b;
    public final /* synthetic */ cxq0 c;

    public lkh(cxq0 cxq0Var) {
        this.c = cxq0Var;
        Socket socket = (Socket) cxq0Var.b;
        this.a = socket.getOutputStream();
        this.b = new m5t0(socket);
    }

    @Override // defpackage.uis0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        OutputStream outputStream = this.a;
        cxq0 cxq0Var = this.c;
        m5t0 m5t0Var = this.b;
        m5t0Var.i();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) cxq0Var.c;
            Socket socket = (Socket) cxq0Var.b;
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
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

    @Override // defpackage.uis0, java.io.Flushable
    public final void flush() {
        m5t0 m5t0Var = this.b;
        m5t0Var.i();
        try {
            this.a.flush();
            if (m5t0Var.j()) {
                throw m5t0Var.k(null);
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

    @Override // defpackage.uis0
    public final ydz0 timeout() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.c.b) + ')';
    }

    @Override // defpackage.uis0
    public final void write(yp6 yp6Var, long j) {
        j.b(yp6Var.b, 0L, j);
        while (j > 0) {
            m5t0 m5t0Var = this.b;
            m5t0Var.f();
            t7q0 t7q0Var = yp6Var.a;
            int min = (int) Math.min(j, t7q0Var.c - t7q0Var.b);
            m5t0Var.i();
            try {
                try {
                    this.a.write(t7q0Var.a, t7q0Var.b, min);
                    if (m5t0Var.j()) {
                        throw m5t0Var.k(null);
                    }
                    int i = t7q0Var.b + min;
                    t7q0Var.b = i;
                    long j2 = min;
                    j -= j2;
                    yp6Var.b -= j2;
                    if (i == t7q0Var.c) {
                        yp6Var.a = t7q0Var.a();
                        p8q0.a(t7q0Var);
                    }
                } catch (IOException e) {
                    if (!m5t0Var.j()) {
                        throw e;
                    }
                    throw m5t0Var.k(e);
                }
            } catch (Throwable th) {
                m5t0Var.j();
                throw th;
            }
        }
    }
}
