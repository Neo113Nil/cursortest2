package xsna;

import java.io.IOException;

/* compiled from: AsyncTimeout.kt */
/* loaded from: classes11.dex */
public final class qz3 implements agk0 {
    public final /* synthetic */ jek0 b;
    public final /* synthetic */ i3x c;

    public qz3(jek0 jek0Var, i3x i3xVar) {
        this.b = jek0Var;
        this.c = i3xVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        i3x i3xVar = this.c;
        jek0 jek0Var = this.b;
        jek0Var.i();
        try {
            i3xVar.close();
            s3q0 s3q0Var = s3q0.a;
            if (jek0Var.j()) {
                throw jek0Var.l(null);
            }
        } catch (IOException e) {
            if (!jek0Var.j()) {
                throw e;
            }
            throw jek0Var.l(e);
        } finally {
            jek0Var.j();
        }
    }

    @Override // xsna.agk0
    public final long read(vl8 vl8Var, long j) {
        i3x i3xVar = this.c;
        jek0 jek0Var = this.b;
        jek0Var.i();
        try {
            long read = i3xVar.read(vl8Var, j);
            if (jek0Var.j()) {
                throw jek0Var.l(null);
            }
            return read;
        } catch (IOException e) {
            if (jek0Var.j()) {
                throw jek0Var.l(e);
            }
            throw e;
        } finally {
            jek0Var.j();
        }
    }

    @Override // xsna.agk0
    public final mxo0 timeout() {
        return this.b;
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.c + ')';
    }
}
