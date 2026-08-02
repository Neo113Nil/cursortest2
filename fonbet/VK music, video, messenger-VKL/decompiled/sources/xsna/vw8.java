package xsna;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.b;

/* compiled from: CacheInterceptor.kt */
/* loaded from: classes8.dex */
public final class vw8 implements agk0 {
    public boolean b;
    public final /* synthetic */ bn8 c;
    public final /* synthetic */ b.d d;
    public final /* synthetic */ d8f0 e;

    public vw8(bn8 bn8Var, b.d dVar, d8f0 d8f0Var) {
        this.c = bn8Var;
        this.d = dVar;
        this.e = d8f0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean z;
        if (!this.b) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                z = x2r0.t(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.b = true;
                this.d.a();
            }
        }
        this.c.close();
    }

    @Override // xsna.agk0
    public final long read(vl8 vl8Var, long j) throws IOException {
        try {
            long read = this.c.read(vl8Var, j);
            d8f0 d8f0Var = this.e;
            if (read != -1) {
                vl8Var.p(d8f0Var.c, vl8Var.c - read, read);
                d8f0Var.o1();
                return read;
            }
            if (!this.b) {
                this.b = true;
                d8f0Var.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.b) {
                throw e;
            }
            this.b = true;
            this.d.a();
            throw e;
        }
    }

    @Override // xsna.agk0
    public final mxo0 timeout() {
        return this.c.timeout();
    }
}
