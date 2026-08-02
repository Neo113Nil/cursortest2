package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: AsyncTimeout.kt */
/* loaded from: classes11.dex */
public final class pz3 implements qwj0 {
    public final /* synthetic */ jek0 b;
    public final /* synthetic */ p190 c;

    public pz3(jek0 jek0Var, p190 p190Var) {
        this.b = jek0Var;
        this.c = p190Var;
    }

    @Override // xsna.qwj0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        p190 p190Var = this.c;
        jek0 jek0Var = this.b;
        jek0Var.i();
        try {
            p190Var.close();
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

    @Override // xsna.qwj0, java.io.Flushable
    public final void flush() {
        p190 p190Var = this.c;
        jek0 jek0Var = this.b;
        jek0Var.i();
        try {
            p190Var.flush();
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

    @Override // xsna.qwj0
    public final void n1(vl8 vl8Var, long j) {
        e.b(vl8Var.c, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            m4i0 m4i0Var = vl8Var.b;
            while (true) {
                if (j2 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    break;
                }
                j2 += m4i0Var.c - m4i0Var.b;
                if (j2 >= j) {
                    j2 = j;
                    break;
                }
                m4i0Var = m4i0Var.f;
            }
            p190 p190Var = this.c;
            jek0 jek0Var = this.b;
            jek0Var.i();
            try {
                try {
                    p190Var.n1(vl8Var, j2);
                    s3q0 s3q0Var = s3q0.a;
                    if (jek0Var.j()) {
                        throw jek0Var.l(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!jek0Var.j()) {
                        throw e;
                    }
                    throw jek0Var.l(e);
                }
            } catch (Throwable th) {
                jek0Var.j();
                throw th;
            }
        }
    }

    @Override // xsna.qwj0
    public final mxo0 timeout() {
        return this.b;
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.c + ')';
    }
}
