package xsna;

import java.io.IOException;
import java.util.zip.Deflater;

/* compiled from: DeflaterSink.kt */
/* loaded from: classes8.dex */
public final class nsl implements qwj0 {
    public final d8f0 b;
    public final Deflater c;
    public boolean d;

    public nsl(d8f0 d8f0Var, Deflater deflater) {
        this.b = d8f0Var;
        this.c = deflater;
    }

    public final void b(boolean z) {
        m4i0 E;
        int deflate;
        d8f0 d8f0Var = this.b;
        vl8 vl8Var = d8f0Var.c;
        while (true) {
            E = vl8Var.E(1);
            byte[] bArr = E.a;
            Deflater deflater = this.c;
            if (z) {
                try {
                    int i = E.c;
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                int i2 = E.c;
                deflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (deflate > 0) {
                E.c += deflate;
                vl8Var.c += deflate;
                d8f0Var.o1();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (E.b == E.c) {
            vl8Var.b = E.a();
            i5i0.a(E);
        }
    }

    @Override // xsna.qwj0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Deflater deflater = this.c;
        if (this.d) {
            return;
        }
        try {
            deflater.finish();
            b(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // xsna.qwj0, java.io.Flushable
    public final void flush() throws IOException {
        b(true);
        this.b.flush();
    }

    @Override // xsna.qwj0
    public final void n1(vl8 vl8Var, long j) throws IOException {
        e.b(vl8Var.c, 0L, j);
        while (j > 0) {
            m4i0 m4i0Var = vl8Var.b;
            int min = (int) Math.min(j, m4i0Var.c - m4i0Var.b);
            this.c.setInput(m4i0Var.a, m4i0Var.b, min);
            b(false);
            long j2 = min;
            vl8Var.c -= j2;
            int i = m4i0Var.b + min;
            m4i0Var.b = i;
            if (i == m4i0Var.c) {
                vl8Var.b = m4i0Var.a();
                i5i0.a(m4i0Var);
            }
            j -= j2;
        }
    }

    @Override // xsna.qwj0
    public final mxo0 timeout() {
        return this.b.b.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.b + ')';
    }
}
