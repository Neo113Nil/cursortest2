package xsna;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: InstrHttpOutputStream.java */
/* loaded from: classes13.dex */
public final class y7x extends OutputStream {
    public final OutputStream b;
    public final Timer c;
    public final e560 d;
    public long e = -1;

    public y7x(OutputStream outputStream, e560 e560Var, Timer timer) {
        this.b = outputStream;
        this.d = e560Var;
        this.c = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j = this.e;
        e560 e560Var = this.d;
        if (j != -1) {
            e560Var.g(j);
        }
        Timer timer = this.c;
        e560Var.e.y(timer.d());
        try {
            this.b.close();
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.b.flush();
        } catch (IOException e) {
            Timer timer = this.c;
            e560 e560Var = this.d;
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        e560 e560Var = this.d;
        try {
            this.b.write(i);
            long j = this.e + 1;
            this.e = j;
            e560Var.g(j);
        } catch (IOException e) {
            kq.c(this.c, e560Var, e560Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        e560 e560Var = this.d;
        try {
            this.b.write(bArr);
            long length = this.e + bArr.length;
            this.e = length;
            e560Var.g(length);
        } catch (IOException e) {
            kq.c(this.c, e560Var, e560Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        e560 e560Var = this.d;
        try {
            this.b.write(bArr, i, i2);
            long j = this.e + i2;
            this.e = j;
            e560Var.g(j);
        } catch (IOException e) {
            kq.c(this.c, e560Var, e560Var);
            throw e;
        }
    }
}
