package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import okio.ByteString;

/* loaded from: classes9.dex */
public final class ici0 implements oq6 {
    public final uis0 a;
    public final yp6 b = new yp6();
    public boolean c;

    public ici0(uis0 uis0Var) {
        this.a = uis0Var;
    }

    @Override // defpackage.oq6
    public final oq6 H(long j) {
        if (this.c) {
            ny61.r("closed");
            return null;
        }
        yp6 yp6Var = this.b;
        yp6Var.getClass();
        yp6Var.q0(j.d(j));
        a();
        return this;
    }

    @Override // defpackage.oq6
    public final oq6 N0(ByteString byteString) {
        if (this.c) {
            ny61.r("closed");
            return null;
        }
        this.b.b0(byteString);
        a();
        return this;
    }

    @Override // defpackage.oq6
    public final long N1(y9t0 y9t0Var) {
        long j = 0;
        while (true) {
            long read = y9t0Var.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read == -1) {
                return j;
            }
            j += read;
            a();
        }
    }

    public final oq6 a() {
        if (this.c) {
            ny61.r("closed");
            return null;
        }
        yp6 yp6Var = this.b;
        long a = yp6Var.a();
        if (a > 0) {
            this.a.write(yp6Var, a);
        }
        return this;
    }

    @Override // defpackage.oq6
    public final oq6 a2(int i, int i2, String str) {
        if (this.c) {
            ny61.r("closed");
            return null;
        }
        this.b.w0(i, i2, str);
        a();
        return this;
    }

    @Override // defpackage.uis0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        uis0 uis0Var = this.a;
        if (this.c) {
            return;
        }
        try {
            yp6 yp6Var = this.b;
            long j = yp6Var.b;
            if (j > 0) {
                uis0Var.write(yp6Var, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            uis0Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.oq6
    public final oq6 d0(long j) {
        if (this.c) {
            ny61.r("closed");
            return null;
        }
        this.b.f0(j);
        a();
        return this;
    }

    @Override // defpackage.oq6, defpackage.uis0, java.io.Flushable
    public final void flush() {
        if (this.c) {
            ny61.r("closed");
            return;
        }
        yp6 yp6Var = this.b;
        long j = yp6Var.b;
        uis0 uis0Var = this.a;
        if (j > 0) {
            uis0Var.write(yp6Var, j);
        }
        uis0Var.flush();
    }

    @Override // defpackage.oq6
    public final yp6 h() {
        return this.b;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.oq6
    public final oq6 n2(int i, int i2, byte[] bArr) {
        if (this.c) {
            ny61.r("closed");
            return null;
        }
        this.b.write(bArr, i, i2);
        a();
        return this;
    }

    @Override // defpackage.oq6
    public final oq6 p1(String str) {
        if (this.c) {
            ny61.r("closed");
            return null;
        }
        this.b.x0(str);
        a();
        return this;
    }

    @Override // defpackage.oq6
    public final oq6 t0(int i) {
        if (this.c) {
            ny61.r("closed");
            return null;
        }
        yp6 yp6Var = this.b;
        yp6Var.getClass();
        yp6Var.n0(j.c(i));
        a();
        return this;
    }

    @Override // defpackage.uis0
    public final ydz0 timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.c) {
            ny61.r("closed");
            return 0;
        }
        int write = this.b.write(byteBuffer);
        a();
        return write;
    }

    @Override // defpackage.oq6
    public final oq6 writeByte(int i) {
        if (this.c) {
            ny61.r("closed");
            return null;
        }
        this.b.e0(i);
        a();
        return this;
    }

    @Override // defpackage.oq6
    public final oq6 writeInt(int i) {
        if (this.c) {
            ny61.r("closed");
            return null;
        }
        this.b.n0(i);
        a();
        return this;
    }

    @Override // defpackage.oq6
    public final oq6 writeShort(int i) {
        if (this.c) {
            ny61.r("closed");
            return null;
        }
        this.b.u0(i);
        a();
        return this;
    }

    @Override // defpackage.uis0
    public final void write(yp6 yp6Var, long j) {
        if (!this.c) {
            this.b.write(yp6Var, j);
            a();
        } else {
            ny61.r("closed");
        }
    }

    @Override // defpackage.oq6
    public final oq6 write(byte[] bArr) {
        if (!this.c) {
            this.b.m968write(bArr);
            a();
            return this;
        }
        ny61.r("closed");
        return null;
    }
}
