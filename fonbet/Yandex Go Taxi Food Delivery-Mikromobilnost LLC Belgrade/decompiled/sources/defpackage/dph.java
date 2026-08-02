package defpackage;

import java.util.zip.Deflater;

/* loaded from: classes4.dex */
public final class dph implements uis0 {
    public final ici0 a;
    public final Deflater b;
    public boolean c;

    public dph(yp6 yp6Var, Deflater deflater) {
        this.a = new ici0(yp6Var);
        this.b = deflater;
    }

    public final void a(boolean z) {
        t7q0 a0;
        int deflate;
        ici0 ici0Var = this.a;
        yp6 yp6Var = ici0Var.b;
        while (true) {
            a0 = yp6Var.a0(1);
            byte[] bArr = a0.a;
            int i = a0.c;
            Deflater deflater = this.b;
            if (z) {
                try {
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    dac.g("Deflater already closed", e);
                    return;
                }
            } else {
                deflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (deflate > 0) {
                a0.c += deflate;
                yp6Var.b += deflate;
                ici0Var.a();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (a0.b == a0.c) {
            yp6Var.a = a0.a();
            p8q0.a(a0);
        }
    }

    @Override // defpackage.uis0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.b;
        if (this.c) {
            return;
        }
        try {
            deflater.finish();
            a(false);
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
            this.a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.uis0, java.io.Flushable
    public final void flush() {
        a(true);
        this.a.flush();
    }

    @Override // defpackage.uis0
    public final ydz0 timeout() {
        return this.a.a.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.a + ')';
    }

    @Override // defpackage.uis0
    public final void write(yp6 yp6Var, long j) {
        j.b(yp6Var.b, 0L, j);
        while (true) {
            Deflater deflater = this.b;
            if (j <= 0) {
                deflater.setInput(jaa1.a, 0, 0);
                return;
            }
            t7q0 t7q0Var = yp6Var.a;
            int min = (int) Math.min(j, t7q0Var.c - t7q0Var.b);
            deflater.setInput(t7q0Var.a, t7q0Var.b, min);
            a(false);
            long j2 = min;
            yp6Var.b -= j2;
            int i = t7q0Var.b + min;
            t7q0Var.b = i;
            if (i == t7q0Var.c) {
                yp6Var.a = t7q0Var.a();
                p8q0.a(t7q0Var);
            }
            j -= j2;
        }
    }
}
