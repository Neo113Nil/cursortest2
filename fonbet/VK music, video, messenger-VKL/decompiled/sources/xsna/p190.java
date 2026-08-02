package xsna;

import java.io.OutputStream;

/* compiled from: JvmOkio.kt */
/* loaded from: classes11.dex */
public final class p190 implements qwj0 {
    public final OutputStream b;
    public final mxo0 c;

    public p190(OutputStream outputStream, mxo0 mxo0Var) {
        this.b = outputStream;
        this.c = mxo0Var;
    }

    @Override // xsna.qwj0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // xsna.qwj0, java.io.Flushable
    public final void flush() {
        this.b.flush();
    }

    @Override // xsna.qwj0
    public final void n1(vl8 vl8Var, long j) {
        e.b(vl8Var.c, 0L, j);
        while (j > 0) {
            this.c.f();
            m4i0 m4i0Var = vl8Var.b;
            int min = (int) Math.min(j, m4i0Var.c - m4i0Var.b);
            this.b.write(m4i0Var.a, m4i0Var.b, min);
            int i = m4i0Var.b + min;
            m4i0Var.b = i;
            long j2 = min;
            j -= j2;
            vl8Var.c -= j2;
            if (i == m4i0Var.c) {
                vl8Var.b = m4i0Var.a();
                i5i0.a(m4i0Var);
            }
        }
    }

    @Override // xsna.qwj0
    public final mxo0 timeout() {
        return this.c;
    }

    public final String toString() {
        return "sink(" + this.b + ')';
    }
}
