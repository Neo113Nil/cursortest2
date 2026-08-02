package xsna;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.time.Instant;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bJ;

/* compiled from: StreamInputStreamImpl.java */
/* loaded from: classes8.dex */
public final class fky0 extends dky0 {
    public final zjy0 b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile Thread e;
    public long h;
    public final long i;
    public long j;
    public long k;
    public volatile boolean l;
    public final Object g = new Object();
    public volatile long m = -1;
    public final aky0 f = new aky0();

    public fky0(zjy0 zjy0Var, long j, sp spVar) {
        this.b = zjy0Var;
        this.k = j;
        this.h = j;
        this.i = (long) (j * 0.1f);
    }

    @Override // xsna.dky0
    public final long a() {
        return this.j;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        aky0 aky0Var = this.f;
        long j = aky0Var.c - aky0Var.d;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    @Override // xsna.dky0
    public final long b(one.video.calls.sdk_private.w wVar) throws bJ {
        long max;
        if (this.m >= 0 && wVar.f() > this.m) {
            throw new bJ(ap$a.FINAL_SIZE_ERROR);
        }
        if (this.m >= 0 && wVar.g && wVar.f() != this.m) {
            throw new bJ(ap$a.FINAL_SIZE_ERROR);
        }
        if (wVar.g) {
            this.m = wVar.f();
        }
        if (this.l || this.c || this.d) {
            return 0L;
        }
        synchronized (this.g) {
            try {
                if (wVar.f() > this.k) {
                    int i = this.b.a;
                    throw new bJ(ap$a.FLOW_CONTROL_ERROR);
                }
                this.f.c(wVar);
                max = Long.max(0L, wVar.f() - this.j);
                this.j = Long.max(this.j, wVar.f());
                this.g.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        return max;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        h(0L);
    }

    @Override // xsna.dky0
    public final void h(long j) {
        aky0 aky0Var = this.f;
        if (aky0Var.e < 0 || aky0Var.c != aky0Var.e) {
            zjy0 zjy0Var = this.b;
            bE bEVar = zjy0Var.c;
            int i = zjy0Var.a;
            nhy0 nhy0Var = new nhy0();
            nhy0Var.b = i;
            nhy0Var.c = j;
            bEVar.j(nhy0Var, new uby0(this, 1), true);
        }
        this.c = true;
        aky0 aky0Var2 = this.f;
        aky0Var2.g = true;
        aky0Var2.a.clear();
        aky0Var2.b.clear();
        Thread thread = this.e;
        if (thread != null) {
            thread.interrupt();
        }
        this.b.g();
    }

    @Override // xsna.dky0
    public final long i(long j) throws bJ {
        if (this.m >= 0 && j != this.m) {
            throw new bJ(ap$a.FINAL_SIZE_ERROR);
        }
        long j2 = this.j;
        if (j < j2) {
            throw new bJ(ap$a.FINAL_SIZE_ERROR);
        }
        long j3 = j - j2;
        if (this.m < 0) {
            this.m = j;
        }
        if (!this.l && !this.c && !this.d) {
            this.d = true;
            this.b.c((int) (this.m - this.f.d));
            aky0 aky0Var = this.f;
            aky0Var.g = true;
            aky0Var.a.clear();
            aky0Var.b.clear();
            Thread thread = this.e;
            if (thread != null) {
                thread.interrupt();
            }
            this.b.g();
        }
        return j3;
    }

    @Override // xsna.dky0
    public final void m() {
        this.l = true;
        Thread thread = this.e;
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        if (read == 1) {
            return bArr[0] & 255;
        }
        if (read < 0) {
            return -1;
        }
        throw new RuntimeException();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        Instant now = Instant.now();
        long j = Long.MAX_VALUE;
        while (!this.l && !this.c && !this.d) {
            synchronized (this.g) {
                try {
                    this.e = Thread.currentThread();
                    int a = this.f.a(ByteBuffer.wrap(bArr, i, i2));
                    if (a > 0) {
                        this.k += a;
                        this.b.c(a);
                        long j2 = this.k;
                        if (j2 - this.h > this.i) {
                            zjy0 zjy0Var = this.b;
                            zjy0Var.c.j(new one.video.calls.sdk_private.d(zjy0Var.a, j2), new eky0(this), true);
                            this.h = this.k;
                        }
                        return a;
                    }
                    if (a < 0) {
                        this.b.g();
                        return -1;
                    }
                    try {
                        this.g.wait(j);
                    } catch (InterruptedException unused) {
                    }
                    aky0 aky0Var = this.f;
                    if (aky0Var.c - aky0Var.d == 0) {
                        long millis = Duration.between(now, Instant.now()).toMillis();
                        if (millis > Long.MAX_VALUE) {
                            throw new SocketTimeoutException("Read timeout on stream " + this.b.a + "; read up to " + this.f.d);
                        }
                        j = Long.max(1L, Long.MAX_VALUE - millis);
                    }
                } finally {
                    this.e = null;
                }
            }
        }
        throw new IOException(!this.l ? this.c ? "Stream closed" : "Stream reset by peer" : "Connection closed");
    }
}
