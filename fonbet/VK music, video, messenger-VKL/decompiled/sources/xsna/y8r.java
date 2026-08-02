package xsna;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: FileHandle.kt */
/* loaded from: classes11.dex */
public abstract class y8r implements Closeable {
    public final boolean b;
    public boolean c;
    public int d;
    public final ReentrantLock e = new ReentrantLock();

    /* compiled from: FileHandle.kt */
    public static final class a implements qwj0 {
        public final y8r b;
        public long c = 0;
        public boolean d;

        public a(y8r y8rVar) {
            this.b = y8rVar;
        }

        @Override // xsna.qwj0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.d) {
                return;
            }
            this.d = true;
            y8r y8rVar = this.b;
            ReentrantLock reentrantLock = y8rVar.e;
            reentrantLock.lock();
            try {
                int i = y8rVar.d - 1;
                y8rVar.d = i;
                if (i == 0 && y8rVar.c) {
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                    y8rVar.m();
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // xsna.qwj0, java.io.Flushable
        public final void flush() {
            if (this.d) {
                throw new IllegalStateException("closed");
            }
            this.b.n();
        }

        @Override // xsna.qwj0
        public final void n1(vl8 vl8Var, long j) {
            if (this.d) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.c;
            y8r y8rVar = this.b;
            y8rVar.getClass();
            e.b(vl8Var.c, 0L, j);
            long j3 = j2 + j;
            long j4 = j2;
            while (j4 < j3) {
                m4i0 m4i0Var = vl8Var.b;
                int min = (int) Math.min(j3 - j4, m4i0Var.c - m4i0Var.b);
                y8rVar.q(j4, m4i0Var.a, m4i0Var.b, min);
                int i = m4i0Var.b + min;
                m4i0Var.b = i;
                long j5 = min;
                j4 += j5;
                vl8Var.c -= j5;
                if (i == m4i0Var.c) {
                    vl8Var.b = m4i0Var.a();
                    i5i0.a(m4i0Var);
                }
            }
            this.c += j;
        }

        @Override // xsna.qwj0
        public final mxo0 timeout() {
            return mxo0.d;
        }
    }

    /* compiled from: FileHandle.kt */
    /* loaded from: classes8.dex */
    public static final class b implements agk0 {
        public final y8r b;
        public long c;
        public boolean d;

        public b(y8r y8rVar, long j) {
            this.b = y8rVar;
            this.c = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.d) {
                return;
            }
            this.d = true;
            y8r y8rVar = this.b;
            ReentrantLock reentrantLock = y8rVar.e;
            reentrantLock.lock();
            try {
                int i = y8rVar.d - 1;
                y8rVar.d = i;
                if (i == 0 && y8rVar.c) {
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                    y8rVar.m();
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // xsna.agk0
        public final long read(vl8 vl8Var, long j) {
            long j2;
            long j3;
            if (this.d) {
                throw new IllegalStateException("closed");
            }
            long j4 = this.c;
            if (j < 0) {
                throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount < 0: ").toString());
            }
            long j5 = j + j4;
            long j6 = j4;
            while (true) {
                if (j6 >= j5) {
                    j2 = -1;
                    break;
                }
                m4i0 E = vl8Var.E(1);
                j2 = -1;
                long j7 = j5;
                int o = this.b.o(j6, E.a, E.c, (int) Math.min(j5 - j6, 8192 - r10));
                if (o == -1) {
                    if (E.b == E.c) {
                        vl8Var.b = E.a();
                        i5i0.a(E);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                    }
                } else {
                    E.c += o;
                    long j8 = o;
                    j6 += j8;
                    vl8Var.c += j8;
                    j5 = j7;
                }
            }
            j3 = j6 - j4;
            if (j3 != j2) {
                this.c += j3;
            }
            return j3;
        }

        @Override // xsna.agk0
        public final mxo0 timeout() {
            return mxo0.d;
        }
    }

    public y8r(boolean z) {
        this.b = z;
    }

    public static a r(y8r y8rVar) throws IOException {
        if (!y8rVar.b) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = y8rVar.e;
        reentrantLock.lock();
        try {
            if (y8rVar.c) {
                throw new IllegalStateException("closed");
            }
            y8rVar.d++;
            reentrantLock.unlock();
            return new a(y8rVar);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (this.c) {
                return;
            }
            this.c = true;
            if (this.d != 0) {
                return;
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
            m();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() throws IOException {
        if (!this.b) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
            n();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public abstract void m() throws IOException;

    public abstract void n() throws IOException;

    public abstract int o(long j, byte[] bArr, int i, int i2) throws IOException;

    public abstract long p() throws IOException;

    public abstract void q(long j, byte[] bArr, int i, int i2) throws IOException;

    public final b s(long j) throws IOException {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            this.d++;
            reentrantLock.unlock();
            return new b(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() throws IOException {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
            return p();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
