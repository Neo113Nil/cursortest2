package xsna;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.u;

/* compiled from: Exchange.kt */
/* loaded from: classes8.dex */
public final class u1q {
    public final f8f0 a;
    public final okhttp3.g b;
    public final x1q c;
    public final w1q d;
    public boolean e;
    public boolean f;
    public final g8f0 g;

    /* compiled from: Exchange.kt */
    public final class a extends bas {
        public final long c;
        public boolean d;
        public long e;
        public boolean f;

        public a(qwj0 qwj0Var, long j) {
            super(qwj0Var);
            this.c = j;
        }

        public final <E extends IOException> E b(E e) {
            if (this.d) {
                return e;
            }
            this.d = true;
            return (E) u1q.this.a(this.e, false, true, e);
        }

        @Override // xsna.bas, xsna.qwj0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f) {
                return;
            }
            this.f = true;
            long j = this.c;
            if (j != -1 && this.e != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                b(null);
            } catch (IOException e) {
                throw b(e);
            }
        }

        @Override // xsna.bas, xsna.qwj0, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw b(e);
            }
        }

        @Override // xsna.bas, xsna.qwj0
        public final void n1(vl8 vl8Var, long j) throws IOException {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.c;
            if (j2 != -1 && this.e + j > j2) {
                StringBuilder b = fp.b(j2, "expected ", " bytes but received ");
                b.append(this.e + j);
                throw new ProtocolException(b.toString());
            }
            try {
                super.n1(vl8Var, j);
                this.e += j;
            } catch (IOException e) {
                throw b(e);
            }
        }
    }

    /* compiled from: Exchange.kt */
    public final class b extends cas {
        public final long b;
        public long c;
        public boolean d;
        public boolean e;
        public boolean f;

        public b(agk0 agk0Var, long j) {
            super(agk0Var);
            this.b = j;
            this.d = true;
            if (j == 0) {
                b(null);
            }
        }

        public final <E extends IOException> E b(E e) {
            if (this.e) {
                return e;
            }
            this.e = true;
            u1q u1qVar = u1q.this;
            if (e == null && this.d) {
                this.d = false;
                u1qVar.b.r(u1qVar.a);
            }
            return (E) u1qVar.a(this.c, true, false, e);
        }

        @Override // xsna.cas, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f) {
                return;
            }
            this.f = true;
            try {
                super.close();
                b(null);
            } catch (IOException e) {
                throw b(e);
            }
        }

        @Override // xsna.cas, xsna.agk0
        public final long read(vl8 vl8Var, long j) throws IOException {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            try {
                long read = delegate().read(vl8Var, j);
                if (this.d) {
                    this.d = false;
                    u1q u1qVar = u1q.this;
                    u1qVar.b.r(u1qVar.a);
                }
                if (read == -1) {
                    b(null);
                    return -1L;
                }
                long j2 = this.c + read;
                long j3 = this.b;
                if (j3 == -1 || j2 <= j3) {
                    this.c = j2;
                    if (j2 == j3) {
                        b(null);
                    }
                    return read;
                }
                throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
            } catch (IOException e) {
                throw b(e);
            }
        }
    }

    public u1q(f8f0 f8f0Var, okhttp3.g gVar, x1q x1qVar, w1q w1qVar) {
        this.a = f8f0Var;
        this.b = gVar;
        this.c = x1qVar;
        this.d = w1qVar;
        this.g = w1qVar.b();
    }

    public final <E extends IOException> E a(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            r(e);
        }
        okhttp3.g gVar = this.b;
        f8f0 f8f0Var = this.a;
        if (z2) {
            if (e != null) {
                gVar.n(f8f0Var);
            } else {
                gVar.l(f8f0Var, j);
            }
        }
        if (z) {
            if (e != null) {
                gVar.s(f8f0Var);
            } else {
                gVar.q(f8f0Var, j);
            }
        }
        return (E) f8f0Var.f(this, z2, z, e);
    }

    public final void b() {
        this.d.cancel();
    }

    public final a c(okhttp3.p pVar, boolean z) throws IOException {
        this.e = z;
        long contentLength = pVar.d.contentLength();
        this.b.m(this.a);
        return new a(this.d.f(pVar, contentLength), contentLength);
    }

    public final void d() {
        this.d.cancel();
        this.a.f(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.d.g();
        } catch (IOException e) {
            this.b.n(this.a);
            r(e);
            throw e;
        }
    }

    public final void f() throws IOException {
        try {
            this.d.c();
        } catch (IOException e) {
            this.b.n(this.a);
            r(e);
            throw e;
        }
    }

    public final g8f0 g() {
        return this.g;
    }

    public final x1q h() {
        return this.c;
    }

    public final boolean i() {
        return this.f;
    }

    public final boolean j() {
        return !epx.f(this.c.b.h.d, this.g.b.a.h.d);
    }

    public final boolean k() {
        return this.e;
    }

    public final void l() {
        this.d.b().n();
    }

    public final void m() {
        this.a.f(this, true, false, null);
    }

    public final n8f0 n(okhttp3.u uVar) throws IOException {
        w1q w1qVar = this.d;
        try {
            String a2 = uVar.g.a("Content-Type");
            if (a2 == null) {
                a2 = null;
            }
            long d = w1qVar.d(uVar);
            return new n8f0(a2, d, new e8f0(new b(w1qVar.a(uVar), d)));
        } catch (IOException e) {
            this.b.getClass();
            r(e);
            throw e;
        }
    }

    public final u.a o(boolean z) throws IOException {
        try {
            u.a h = this.d.h(z);
            if (h == null) {
                return h;
            }
            h.m = this;
            return h;
        } catch (IOException e) {
            this.b.s(this.a);
            r(e);
            throw e;
        }
    }

    public final void p(okhttp3.u uVar) {
        this.b.t(this.a, uVar);
    }

    public final void q() {
        this.b.u(this.a);
    }

    public final void r(IOException iOException) {
        this.f = true;
        this.c.b(iOException);
        g8f0 b2 = this.d.b();
        f8f0 f8f0Var = this.a;
        synchronized (b2) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(b2.g != null) || (iOException instanceof ConnectionShutdownException)) {
                        b2.j = true;
                        if (b2.m == 0) {
                            g8f0.g(f8f0Var.b, b2.b, iOException);
                            b2.l++;
                        }
                    }
                } else if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = b2.n + 1;
                    b2.n = i;
                    if (i > 1) {
                        b2.j = true;
                        b2.l++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !f8f0Var.q) {
                    b2.j = true;
                    b2.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(okhttp3.p pVar) throws IOException {
        f8f0 f8f0Var = this.a;
        okhttp3.g gVar = this.b;
        try {
            gVar.p(f8f0Var);
            this.d.e(pVar);
            gVar.o(f8f0Var, pVar);
        } catch (IOException e) {
            gVar.n(f8f0Var);
            r(e);
            throw e;
        }
    }
}
