package xsna;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* compiled from: JvmOkio.kt */
/* loaded from: classes11.dex */
public final class i3x implements agk0 {
    public final InputStream b;
    public final mxo0 c;

    public i3x(InputStream inputStream, mxo0 mxo0Var) {
        this.b = inputStream;
        this.c = mxo0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if ((r6 != null ? xsna.drm0.D(r6, "getsockname failed", false) : false) != false) goto L27;
     */
    @Override // xsna.agk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(vl8 vl8Var, long j) {
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount < 0: ").toString());
        }
        boolean z = true;
        try {
            this.c.f();
            m4i0 E = vl8Var.E(1);
            int read = this.b.read(E.a, E.c, (int) Math.min(j, 8192 - E.c));
            if (read != -1) {
                E.c += read;
                long j2 = read;
                vl8Var.c += j2;
                return j2;
            }
            if (E.b != E.c) {
                return -1L;
            }
            vl8Var.b = E.a();
            i5i0.a(E);
            return -1L;
        } catch (AssertionError e) {
            Logger logger = ez70.a;
            if (e.getCause() != null) {
                String message = e.getMessage();
            }
            z = false;
            if (z) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // xsna.agk0
    public final mxo0 timeout() {
        return this.c;
    }

    public final String toString() {
        return "source(" + this.b + ')';
    }
}
