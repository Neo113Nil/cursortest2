package xsna;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* compiled from: GzipSink.kt */
/* loaded from: classes8.dex */
public final class csu implements qwj0 {
    public final d8f0 b;
    public final Deflater c;
    public final nsl d;
    public boolean e;
    public final CRC32 f;

    public csu(vl8 vl8Var) {
        d8f0 d8f0Var = new d8f0(vl8Var);
        this.b = d8f0Var;
        Deflater deflater = new Deflater(-1, true);
        this.c = deflater;
        this.d = new nsl(d8f0Var, deflater);
        this.f = new CRC32();
        vl8 vl8Var2 = d8f0Var.c;
        vl8Var2.P(8075);
        vl8Var2.I(8);
        vl8Var2.I(0);
        vl8Var2.N(0);
        vl8Var2.I(0);
        vl8Var2.I(0);
    }

    @Override // xsna.qwj0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Deflater deflater = this.c;
        d8f0 d8f0Var = this.b;
        if (this.e) {
            return;
        }
        try {
            nsl nslVar = this.d;
            nslVar.c.finish();
            nslVar.b(false);
            d8f0Var.W2((int) this.f.getValue());
            d8f0Var.W2((int) deflater.getBytesRead());
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
            d8f0Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.e = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // xsna.qwj0, java.io.Flushable
    public final void flush() throws IOException {
        this.d.flush();
    }

    @Override // xsna.qwj0
    public final void n1(vl8 vl8Var, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return;
        }
        m4i0 m4i0Var = vl8Var.b;
        long j2 = j;
        while (j2 > 0) {
            int min = (int) Math.min(j2, m4i0Var.c - m4i0Var.b);
            this.f.update(m4i0Var.a, m4i0Var.b, min);
            j2 -= min;
            m4i0Var = m4i0Var.f;
        }
        this.d.n1(vl8Var, j);
    }

    @Override // xsna.qwj0
    public final mxo0 timeout() {
        return this.b.b.timeout();
    }
}
