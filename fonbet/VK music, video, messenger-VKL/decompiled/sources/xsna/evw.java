package xsna;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: InflaterSource.kt */
/* loaded from: classes8.dex */
public final class evw implements agk0 {
    public final e8f0 b;
    public final Inflater c;
    public int d;
    public boolean e;

    public evw(e8f0 e8f0Var, Inflater inflater) {
        this.b = e8f0Var;
        this.c = inflater;
    }

    public final long b(vl8 vl8Var, long j) throws IOException {
        Inflater inflater = this.c;
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount < 0: ").toString());
        }
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        if (j != 0) {
            try {
                m4i0 E = vl8Var.E(1);
                int min = (int) Math.min(j, 8192 - E.c);
                boolean needsInput = inflater.needsInput();
                e8f0 e8f0Var = this.b;
                if (needsInput && !e8f0Var.W1()) {
                    m4i0 m4i0Var = e8f0Var.c.b;
                    int i = m4i0Var.c;
                    int i2 = m4i0Var.b;
                    int i3 = i - i2;
                    this.d = i3;
                    inflater.setInput(m4i0Var.a, i2, i3);
                }
                int inflate = inflater.inflate(E.a, E.c, min);
                int i4 = this.d;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.d -= remaining;
                    e8f0Var.skip(remaining);
                }
                if (inflate > 0) {
                    E.c += inflate;
                    long j2 = inflate;
                    vl8Var.c += j2;
                    return j2;
                }
                if (E.b == E.c) {
                    vl8Var.b = E.a();
                    i5i0.a(E);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.e) {
            return;
        }
        this.c.end();
        this.e = true;
        this.b.close();
    }

    @Override // xsna.agk0
    public final long read(vl8 vl8Var, long j) throws IOException {
        do {
            long b = b(vl8Var, j);
            if (b > 0) {
                return b;
            }
            Inflater inflater = this.c;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.b.W1());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // xsna.agk0
    public final mxo0 timeout() {
        return this.b.b.timeout();
    }

    public evw(agk0 agk0Var, Inflater inflater) {
        this(new e8f0(agk0Var), inflater);
    }
}
