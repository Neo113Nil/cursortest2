package xsna;

import com.vk.network.msgpack.internal.LimitException;
import java.io.EOFException;

/* compiled from: LimitBufferedSource.kt */
/* loaded from: classes3.dex */
public final class f7z implements agk0 {
    public final agk0 b;
    public final e8f0 c;
    public long d = 1;
    public long e;

    public f7z(agk0 agk0Var) {
        this.b = agk0Var;
        this.c = new e8f0(agk0Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
        this.c.close();
    }

    public final void h(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount < 0: ").toString());
        }
        e8f0 e8f0Var = this.c;
        if (e8f0Var.d) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            vl8 vl8Var = e8f0Var.c;
            if (vl8Var.c >= j) {
                return;
            }
            long j2 = this.d;
            if (j2 == 0) {
                throw new LimitException();
            }
            long read = this.b.read(vl8Var, j2);
            if (read == -1) {
                throw new EOFException();
            }
            this.e += read;
            this.d -= read;
        }
    }

    @Override // xsna.agk0
    public final long read(vl8 vl8Var, long j) {
        return this.b.read(vl8Var, j);
    }

    public final byte readByte() {
        h(1L);
        return this.c.readByte();
    }

    public final int readInt() {
        h(4L);
        return this.c.readInt();
    }

    @Override // xsna.agk0
    public final mxo0 timeout() {
        return this.b.timeout();
    }
}
