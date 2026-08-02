package xsna;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import okhttp3.k;
import okhttp3.u;
import xsna.uzk0;

/* compiled from: Http1ExchangeCodec.kt */
/* loaded from: classes8.dex */
public final class thv implements w1q {
    public final okhttp3.o a;
    public final g8f0 b;
    public final bn8 c;
    public final an8 d;
    public int e;
    public final qyu f;

    /* compiled from: Http1ExchangeCodec.kt */
    public abstract class a implements agk0 {
        public final eas b;
        public boolean c;

        public a() {
            this.b = new eas(thv.this.c.timeout());
        }

        public final void m() {
            thv thvVar = thv.this;
            int i = thvVar.e;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException("state: " + thvVar.e);
            }
            eas easVar = this.b;
            mxo0 mxo0Var = easVar.e;
            easVar.e = mxo0.d;
            mxo0Var.a();
            mxo0Var.b();
            thvVar.e = 6;
        }

        @Override // xsna.agk0
        public long read(vl8 vl8Var, long j) {
            thv thvVar = thv.this;
            try {
                return thvVar.c.read(vl8Var, j);
            } catch (IOException e) {
                thvVar.b.n();
                m();
                throw e;
            }
        }

        @Override // xsna.agk0
        public final mxo0 timeout() {
            return this.b;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class b implements qwj0 {
        public final eas b;
        public boolean c;

        public b() {
            this.b = new eas(thv.this.d.timeout());
        }

        @Override // xsna.qwj0, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.c) {
                return;
            }
            this.c = true;
            thv.this.d.y1("0\r\n\r\n");
            eas easVar = this.b;
            mxo0 mxo0Var = easVar.e;
            easVar.e = mxo0.d;
            mxo0Var.a();
            mxo0Var.b();
            thv.this.e = 3;
        }

        @Override // xsna.qwj0, java.io.Flushable
        public final synchronized void flush() {
            if (this.c) {
                return;
            }
            thv.this.d.flush();
        }

        @Override // xsna.qwj0
        public final void n1(vl8 vl8Var, long j) {
            an8 an8Var = thv.this.d;
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            an8Var.r3(j);
            an8Var.y1("\r\n");
            an8Var.n1(vl8Var, j);
            an8Var.y1("\r\n");
        }

        @Override // xsna.qwj0
        public final mxo0 timeout() {
            return this.b;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class c extends a {
        public final okhttp3.l e;
        public long f;
        public boolean g;

        public c(okhttp3.l lVar) {
            super();
            this.e = lVar;
            this.f = -1L;
            this.g = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean z;
            if (this.c) {
                return;
            }
            if (this.g) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                try {
                    z = x2r0.t(this, 100);
                } catch (IOException unused) {
                    z = false;
                }
                if (!z) {
                    thv.this.b.n();
                    m();
                }
            }
            this.c = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
        
            if (r11.g == false) goto L34;
         */
        @Override // xsna.thv.a, xsna.agk0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final long read(vl8 vl8Var, long j) {
            thv thvVar = thv.this;
            bn8 bn8Var = thvVar.c;
            if (j < 0) {
                throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount < 0: ").toString());
            }
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            if (this.g) {
                long j2 = this.f;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        bn8Var.D1();
                    }
                    try {
                        this.f = bn8Var.U0();
                        String obj = drm0.p0(bn8Var.D1()).toString();
                        if (this.f < 0 || (obj.length() > 0 && !brm0.B(obj, ";", false))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f + obj + '\"');
                        }
                        if (this.f == 0) {
                            this.g = false;
                            qyu qyuVar = thvVar.f;
                            k.a aVar = new k.a();
                            while (true) {
                                String s1 = qyuVar.a.s1(qyuVar.b);
                                qyuVar.b -= s1.length();
                                if (s1.length() == 0) {
                                    break;
                                }
                                aVar.c(s1);
                            }
                            njv.b(thvVar.a.k, this.e, aVar.e());
                            m();
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long read = super.read(vl8Var, Math.min(j, this.f));
                if (read != -1) {
                    this.f -= read;
                    return read;
                }
                thvVar.b.n();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m();
                throw protocolException;
            }
            return -1L;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class d extends a {
        public long e;

        public d(long j) {
            super();
            this.e = j;
            if (j == 0) {
                m();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean z;
            if (this.c) {
                return;
            }
            if (this.e != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                try {
                    z = x2r0.t(this, 100);
                } catch (IOException unused) {
                    z = false;
                }
                if (!z) {
                    thv.this.b.n();
                    m();
                }
            }
            this.c = true;
        }

        @Override // xsna.thv.a, xsna.agk0
        public final long read(vl8 vl8Var, long j) {
            if (j < 0) {
                throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount < 0: ").toString());
            }
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.e;
            if (j2 == 0) {
                return -1L;
            }
            long read = super.read(vl8Var, Math.min(j2, j));
            if (read == -1) {
                thv.this.b.n();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m();
                throw protocolException;
            }
            long j3 = this.e - read;
            this.e = j3;
            if (j3 == 0) {
                m();
            }
            return read;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class e implements qwj0 {
        public final eas b;
        public boolean c;

        public e() {
            this.b = new eas(thv.this.d.timeout());
        }

        @Override // xsna.qwj0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.c) {
                return;
            }
            this.c = true;
            eas easVar = this.b;
            mxo0 mxo0Var = easVar.e;
            easVar.e = mxo0.d;
            mxo0Var.a();
            mxo0Var.b();
            thv.this.e = 3;
        }

        @Override // xsna.qwj0, java.io.Flushable
        public final void flush() {
            if (this.c) {
                return;
            }
            thv.this.d.flush();
        }

        @Override // xsna.qwj0
        public final void n1(vl8 vl8Var, long j) {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            long j2 = vl8Var.c;
            byte[] bArr = x2r0.a;
            if (j < 0 || 0 > j2 || j2 < j) {
                throw new ArrayIndexOutOfBoundsException();
            }
            thv.this.d.n1(vl8Var, j);
        }

        @Override // xsna.qwj0
        public final mxo0 timeout() {
            return this.b;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class f extends a {
        public boolean e;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.c) {
                return;
            }
            if (!this.e) {
                m();
            }
            this.c = true;
        }

        @Override // xsna.thv.a, xsna.agk0
        public final long read(vl8 vl8Var, long j) {
            if (j < 0) {
                throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount < 0: ").toString());
            }
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            if (this.e) {
                return -1L;
            }
            long read = super.read(vl8Var, j);
            if (read != -1) {
                return read;
            }
            this.e = true;
            m();
            return -1L;
        }
    }

    public thv(okhttp3.o oVar, g8f0 g8f0Var, e8f0 e8f0Var, d8f0 d8f0Var) {
        this.a = oVar;
        this.b = g8f0Var;
        this.c = e8f0Var;
        this.d = d8f0Var;
        this.f = new qyu(e8f0Var);
    }

    @Override // xsna.w1q
    public final agk0 a(okhttp3.u uVar) {
        if (!njv.a(uVar)) {
            return i(0L);
        }
        String a2 = uVar.g.a("Transfer-Encoding");
        if (a2 == null) {
            a2 = null;
        }
        if ("chunked".equalsIgnoreCase(a2)) {
            okhttp3.l lVar = uVar.b.a;
            if (this.e == 4) {
                this.e = 5;
                return new c(lVar);
            }
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        long j = x2r0.j(uVar);
        if (j != -1) {
            return i(j);
        }
        if (this.e == 4) {
            this.e = 5;
            this.b.n();
            return new f();
        }
        throw new IllegalStateException(("state: " + this.e).toString());
    }

    @Override // xsna.w1q
    public final g8f0 b() {
        return this.b;
    }

    @Override // xsna.w1q
    public final void c() {
        this.d.flush();
    }

    @Override // xsna.w1q
    public final void cancel() {
        Socket socket = this.b.c;
        if (socket != null) {
            x2r0.d(socket);
        }
    }

    @Override // xsna.w1q
    public final long d(okhttp3.u uVar) {
        if (!njv.a(uVar)) {
            return 0L;
        }
        String a2 = uVar.g.a("Transfer-Encoding");
        if (a2 == null) {
            a2 = null;
        }
        if ("chunked".equalsIgnoreCase(a2)) {
            return -1L;
        }
        return x2r0.j(uVar);
    }

    @Override // xsna.w1q
    public final void e(okhttp3.p pVar) {
        Proxy.Type type = this.b.b.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(pVar.b);
        sb.append(' ');
        okhttp3.l lVar = pVar.a;
        if (lVar.j || type != Proxy.Type.HTTP) {
            String b2 = lVar.b();
            String d2 = lVar.d();
            if (d2 != null) {
                b2 = v1v.a('?', b2, d2);
            }
            sb.append(b2);
        } else {
            sb.append(lVar);
        }
        sb.append(" HTTP/1.1");
        k(pVar.c, sb.toString());
    }

    @Override // xsna.w1q
    public final qwj0 f(okhttp3.p pVar, long j) {
        okhttp3.t tVar = pVar.d;
        if (tVar != null && tVar.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(pVar.c.a("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = 2;
                return new b();
            }
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.e == 1) {
            this.e = 2;
            return new e();
        }
        throw new IllegalStateException(("state: " + this.e).toString());
    }

    @Override // xsna.w1q
    public final void g() {
        this.d.flush();
    }

    @Override // xsna.w1q
    public final u.a h(boolean z) {
        qyu qyuVar = this.f;
        bn8 bn8Var = qyuVar.a;
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        try {
            String s1 = bn8Var.s1(qyuVar.b);
            qyuVar.b -= s1.length();
            uzk0 a2 = uzk0.a.a(s1);
            int i2 = a2.b;
            u.a aVar = new u.a();
            aVar.b = a2.a;
            aVar.c = i2;
            aVar.d = a2.c;
            k.a aVar2 = new k.a();
            while (true) {
                String s12 = bn8Var.s1(qyuVar.b);
                qyuVar.b -= s12.length();
                if (s12.length() == 0) {
                    break;
                }
                aVar2.c(s12);
            }
            aVar.f = aVar2.e().d();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.e = 3;
                return aVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.e = 4;
                return aVar;
            }
            this.e = 3;
            return aVar;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(this.b.b.a.h.h()), e2);
        }
    }

    public final d i(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new d(j);
        }
        throw new IllegalStateException(("state: " + this.e).toString());
    }

    public final void j(okhttp3.u uVar) {
        long j = x2r0.j(uVar);
        if (j == -1) {
            return;
        }
        d i = i(j);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x2r0.t(i, Integer.MAX_VALUE);
        i.close();
    }

    public final void k(okhttp3.k kVar, String str) {
        if (this.e != 0) {
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        an8 an8Var = this.d;
        an8Var.y1(str).y1("\r\n");
        int size = kVar.size();
        for (int i = 0; i < size; i++) {
            an8Var.y1(kVar.c(i)).y1(": ").y1(kVar.f(i)).y1("\r\n");
        }
        an8Var.y1("\r\n");
        this.e = 1;
    }
}
