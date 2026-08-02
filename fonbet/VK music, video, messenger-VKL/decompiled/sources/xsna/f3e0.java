package xsna;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.StreamResetException;

/* compiled from: ProgressRequestBody.kt */
/* loaded from: classes15.dex */
public final class f3e0 extends okhttp3.t {
    public static final long g = TimeUnit.MILLISECONDS.toMillis(160);
    public final okhttp3.t c;
    public final m7r0 d;
    public long e;
    public final bpn0 f = new bpn0(new bi80(this, 9));

    /* compiled from: ProgressRequestBody.kt */
    public final class a extends bas {
        public long c;
        public long d;

        public a(an8 an8Var) {
            super(an8Var);
            this.d = -1L;
        }

        @Override // xsna.bas, xsna.qwj0
        public final void n1(vl8 vl8Var, long j) throws IOException {
            super.n1(vl8Var, j);
            this.c += j;
            long j2 = this.d;
            f3e0 f3e0Var = f3e0.this;
            if (j2 < 0) {
                this.d = f3e0Var.c.contentLength();
            }
            long j3 = this.d;
            if (j3 < 0) {
                f3e0.a(f3e0Var, 0L, 1L);
            } else {
                f3e0.a(f3e0Var, this.c, j3);
            }
        }
    }

    public f3e0(okhttp3.t tVar, m7r0 m7r0Var) {
        this.c = tVar;
        this.d = m7r0Var;
    }

    public static final void a(f3e0 f3e0Var, long j, long j2) {
        m7r0 m7r0Var = f3e0Var.d;
        if (m7r0Var != null && System.currentTimeMillis() - f3e0Var.e >= g) {
            float f = j2;
            float f2 = 1000.0f / f;
            m7r0Var.onProgress((int) (j * f2), (int) (f * f2));
            f3e0Var.e = System.currentTimeMillis();
        }
    }

    @Override // okhttp3.t
    public final long contentLength() throws IOException {
        return this.c.contentLength();
    }

    @Override // okhttp3.t
    public final okhttp3.m contentType() {
        return this.c.contentType();
    }

    @Override // okhttp3.t
    public final boolean isDuplex() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    @Override // okhttp3.t
    public final void writeTo(an8 an8Var) throws IOException {
        d8f0 d8f0Var = new d8f0(new a(an8Var));
        try {
            this.c.writeTo(d8f0Var);
            d8f0Var.flush();
            d8f0Var.close();
        } catch (StreamResetException e) {
            if (!isDuplex()) {
                throw e;
            }
        }
    }
}
