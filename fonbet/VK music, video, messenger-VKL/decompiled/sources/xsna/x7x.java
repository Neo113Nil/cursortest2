package xsna;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: InstrHttpInputStream.java */
/* loaded from: classes13.dex */
public final class x7x extends InputStream {
    public final InputStream b;
    public final e560 c;
    public final Timer d;
    public long f;
    public long e = -1;
    public long g = -1;

    public x7x(InputStream inputStream, e560 e560Var, Timer timer) {
        this.d = timer;
        this.b = inputStream;
        this.c = e560Var;
        this.f = e560Var.e.n();
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.b.available();
        } catch (IOException e) {
            Timer timer = this.d;
            e560 e560Var = this.c;
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        e560 e560Var = this.c;
        Timer timer = this.d;
        long d = timer.d();
        if (this.g == -1) {
            this.g = d;
        }
        try {
            this.b.close();
            long j = this.e;
            if (j != -1) {
                e560Var.k(j);
            }
            long j2 = this.f;
            if (j2 != -1) {
                e560Var.e.A(j2);
            }
            e560Var.l(this.g);
            e560Var.d();
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.b.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.b.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        Timer timer = this.d;
        e560 e560Var = this.c;
        try {
            int read = this.b.read();
            long d = timer.d();
            if (this.f == -1) {
                this.f = d;
            }
            if (read == -1 && this.g == -1) {
                this.g = d;
                e560Var.l(d);
                e560Var.d();
                return read;
            }
            long j = this.e + 1;
            this.e = j;
            e560Var.k(j);
            return read;
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.b.reset();
        } catch (IOException e) {
            Timer timer = this.d;
            e560 e560Var = this.c;
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        Timer timer = this.d;
        e560 e560Var = this.c;
        try {
            long skip = this.b.skip(j);
            long d = timer.d();
            if (this.f == -1) {
                this.f = d;
            }
            if (skip == -1 && this.g == -1) {
                this.g = d;
                e560Var.l(d);
                return skip;
            }
            long j2 = this.e + skip;
            this.e = j2;
            e560Var.k(j2);
            return skip;
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Timer timer = this.d;
        e560 e560Var = this.c;
        try {
            int read = this.b.read(bArr, i, i2);
            long d = timer.d();
            if (this.f == -1) {
                this.f = d;
            }
            if (read == -1 && this.g == -1) {
                this.g = d;
                e560Var.l(d);
                e560Var.d();
                return read;
            }
            long j = this.e + read;
            this.e = j;
            e560Var.k(j);
            return read;
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        Timer timer = this.d;
        e560 e560Var = this.c;
        try {
            int read = this.b.read(bArr);
            long d = timer.d();
            if (this.f == -1) {
                this.f = d;
            }
            if (read == -1 && this.g == -1) {
                this.g = d;
                e560Var.l(d);
                e560Var.d();
                return read;
            }
            long j = this.e + read;
            this.e = j;
            e560Var.k(j);
            return read;
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }
}
