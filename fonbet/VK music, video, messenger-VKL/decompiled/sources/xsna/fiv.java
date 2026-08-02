package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* compiled from: Http2Stream.kt */
/* loaded from: classes8.dex */
public final class fiv {
    public final int a;
    public final vhv b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque<okhttp3.k> g;
    public boolean h;
    public final b i;
    public final a j;
    public final c k;
    public final c l;
    public ErrorCode m;
    public IOException n;

    /* compiled from: Http2Stream.kt */
    public final class a implements qwj0 {
        public final boolean b;
        public final vl8 c = new vl8();
        public boolean d;

        public a(boolean z) {
            this.b = z;
        }

        /* JADX WARN: Finally extract failed */
        public final void b(boolean z) throws IOException {
            long min;
            boolean z2;
            fiv fivVar = fiv.this;
            synchronized (fivVar) {
                try {
                    fivVar.l.i();
                    while (fivVar.e >= fivVar.f && !this.b && !this.d) {
                        try {
                            synchronized (fivVar) {
                                ErrorCode errorCode = fivVar.m;
                                if (errorCode != null) {
                                    break;
                                }
                                try {
                                    fivVar.wait();
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            }
                        } catch (Throwable th) {
                            fivVar.l.l();
                            throw th;
                        }
                    }
                    fivVar.l.l();
                    fivVar.b();
                    min = Math.min(fivVar.f - fivVar.e, this.c.c);
                    fivVar.e += min;
                    z2 = z && min == this.c.c;
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            fiv.this.l.i();
            try {
                fiv fivVar2 = fiv.this;
                fivVar2.b.o(fivVar2.a, z2, this.c, min);
            } finally {
                fiv.this.l.l();
            }
        }

        @Override // xsna.qwj0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            boolean z;
            fiv fivVar = fiv.this;
            byte[] bArr = x2r0.a;
            synchronized (fivVar) {
                if (this.d) {
                    return;
                }
                synchronized (fivVar) {
                    z = fivVar.m == null;
                    s3q0 s3q0Var = s3q0.a;
                }
                fiv fivVar2 = fiv.this;
                if (!fivVar2.j.b) {
                    if (this.c.c > 0) {
                        while (this.c.c > 0) {
                            b(true);
                        }
                    } else if (z) {
                        fivVar2.b.o(fivVar2.a, true, null, 0L);
                    }
                }
                synchronized (fiv.this) {
                    this.d = true;
                    s3q0 s3q0Var2 = s3q0.a;
                }
                fiv.this.b.flush();
                fiv.this.a();
            }
        }

        @Override // xsna.qwj0, java.io.Flushable
        public final void flush() throws IOException {
            fiv fivVar = fiv.this;
            byte[] bArr = x2r0.a;
            synchronized (fivVar) {
                fivVar.b();
                s3q0 s3q0Var = s3q0.a;
            }
            while (this.c.c > 0) {
                b(false);
                fiv.this.b.flush();
            }
        }

        @Override // xsna.qwj0
        public final void n1(vl8 vl8Var, long j) throws IOException {
            byte[] bArr = x2r0.a;
            vl8 vl8Var2 = this.c;
            vl8Var2.n1(vl8Var, j);
            while (vl8Var2.c >= PlaybackStateCompat.ACTION_PREPARE) {
                b(false);
            }
        }

        @Override // xsna.qwj0
        public final mxo0 timeout() {
            return fiv.this.l;
        }
    }

    /* compiled from: Http2Stream.kt */
    public final class b implements agk0 {
        public final long b;
        public boolean c;
        public final vl8 d = new vl8();
        public final vl8 e = new vl8();
        public boolean f;

        public b(long j, boolean z) {
            this.b = j;
            this.c = z;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long j;
            fiv fivVar = fiv.this;
            synchronized (fivVar) {
                this.f = true;
                vl8 vl8Var = this.e;
                j = vl8Var.c;
                vl8Var.m();
                fivVar.notifyAll();
                s3q0 s3q0Var = s3q0.a;
            }
            if (j > 0) {
                fiv fivVar2 = fiv.this;
                byte[] bArr = x2r0.a;
                fivVar2.b.n(j);
            }
            fiv.this.a();
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0094 A[LOOP:0: B:3:0x000a->B:40:0x0094, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0098 A[SYNTHETIC] */
        @Override // xsna.agk0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final long read(vl8 vl8Var, long j) throws IOException {
            ErrorCode errorCode;
            Throwable th;
            boolean z;
            long j2;
            long j3 = 0;
            if (j < 0) {
                throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount < 0: ").toString());
            }
            while (true) {
                fiv fivVar = fiv.this;
                synchronized (fivVar) {
                    fivVar.k.i();
                    try {
                        synchronized (fivVar) {
                            errorCode = fivVar.m;
                        }
                        if (z) {
                            if (j2 != -1) {
                                return j2;
                            }
                            if (th == null) {
                                return -1L;
                            }
                            throw th;
                        }
                        j3 = 0;
                    } catch (Throwable th2) {
                        fivVar.k.l();
                        throw th2;
                    }
                }
                if (errorCode == null || this.c) {
                    th = null;
                } else {
                    th = fivVar.n;
                    if (th == null) {
                        synchronized (fivVar) {
                            th = new StreamResetException(fivVar.m);
                        }
                    }
                }
                if (this.f) {
                    throw new IOException("stream closed");
                }
                vl8 vl8Var2 = this.e;
                long j4 = vl8Var2.c;
                z = false;
                if (j4 > j3) {
                    j2 = vl8Var2.read(vl8Var, Math.min(j, j4));
                    long j5 = fivVar.c + j2;
                    fivVar.c = j5;
                    long j6 = j5 - fivVar.d;
                    if (th == null && j6 >= fivVar.b.r.a() / 2) {
                        fivVar.b.q(fivVar.a, j6);
                        fivVar.d = fivVar.c;
                    }
                } else {
                    if (!this.c && th == null) {
                        try {
                            fivVar.wait();
                            z = true;
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                    j2 = -1;
                }
                fivVar.k.l();
                s3q0 s3q0Var = s3q0.a;
                if (z) {
                }
            }
        }

        @Override // xsna.agk0
        public final mxo0 timeout() {
            return fiv.this.k;
        }
    }

    /* compiled from: Http2Stream.kt */
    public final class c extends oz3 {
        public c() {
        }

        @Override // xsna.oz3
        public final void k() {
            fiv.this.e(ErrorCode.CANCEL);
            vhv vhvVar = fiv.this.b;
            synchronized (vhvVar) {
                long j = vhvVar.p;
                long j2 = vhvVar.o;
                if (j < j2) {
                    return;
                }
                vhvVar.o = j2 + 1;
                vhvVar.q = System.nanoTime() + 1000000000;
                s3q0 s3q0Var = s3q0.a;
                vhvVar.i.c(new div(i5s.a(new StringBuilder(), vhvVar.d, " ping"), vhvVar), 0L);
            }
        }

        public final void l() throws IOException {
            if (j()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public fiv(int i, vhv vhvVar, boolean z, boolean z2, okhttp3.k kVar) {
        this.a = i;
        this.b = vhvVar;
        this.f = vhvVar.s.a();
        ArrayDeque<okhttp3.k> arrayDeque = new ArrayDeque<>();
        this.g = arrayDeque;
        this.i = new b(vhvVar.r.a(), z2);
        this.j = new a(z);
        this.k = new c();
        this.l = new c();
        if (kVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(kVar);
        }
    }

    public final void a() throws IOException {
        boolean z;
        boolean h;
        byte[] bArr = x2r0.a;
        synchronized (this) {
            try {
                b bVar = this.i;
                if (!bVar.c && bVar.f) {
                    a aVar = this.j;
                    if (!aVar.b) {
                        if (aVar.d) {
                        }
                    }
                    z = true;
                    h = h();
                    s3q0 s3q0Var = s3q0.a;
                }
                z = false;
                h = h();
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(ErrorCode.CANCEL, null);
        } else {
            if (h) {
                return;
            }
            this.b.j(this.a);
        }
    }

    public final void b() throws IOException {
        a aVar = this.j;
        if (aVar.d) {
            throw new IOException("stream closed");
        }
        if (aVar.b) {
            throw new IOException("stream finished");
        }
        if (this.m != null) {
            IOException iOException = this.n;
            if (iOException == null) {
                throw new StreamResetException(this.m);
            }
        }
    }

    public final void c(ErrorCode errorCode, IOException iOException) throws IOException {
        if (d(errorCode, iOException)) {
            this.b.y.m(this.a, errorCode);
        }
    }

    public final boolean d(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = x2r0.a;
        synchronized (this) {
            if (this.m != null) {
                return false;
            }
            this.m = errorCode;
            this.n = iOException;
            notifyAll();
            if (this.i.c && this.j.b) {
                return false;
            }
            s3q0 s3q0Var = s3q0.a;
            this.b.j(this.a);
            return true;
        }
    }

    public final void e(ErrorCode errorCode) {
        if (d(errorCode, null)) {
            this.b.p(this.a, errorCode);
        }
    }

    public final a f() {
        synchronized (this) {
            try {
                if (!this.h && !g()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.j;
    }

    public final boolean g() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final synchronized boolean h() {
        try {
            if (this.m != null) {
                return false;
            }
            b bVar = this.i;
            if (!bVar.c) {
                if (bVar.f) {
                }
                return true;
            }
            a aVar = this.j;
            if (aVar.b || aVar.d) {
                if (this.h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x001c, B:11:0x0020, B:19:0x0013), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(okhttp3.k kVar, boolean z) {
        boolean h;
        byte[] bArr = x2r0.a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                    if (z) {
                        this.i.c = true;
                    }
                    h = h();
                    notifyAll();
                    s3q0 s3q0Var = s3q0.a;
                }
                this.h = true;
                this.g.add(kVar);
                if (z) {
                }
                h = h();
                notifyAll();
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (h) {
            return;
        }
        this.b.j(this.a);
    }
}
