package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import okio.ByteString;

/* compiled from: RealBufferedSink.kt */
/* loaded from: classes11.dex */
public final class d8f0 implements an8 {
    public final qwj0 b;
    public final vl8 c = new vl8();
    public boolean d;

    public d8f0(qwj0 qwj0Var) {
        this.b = qwj0Var;
    }

    @Override // xsna.an8
    public final vl8 C() {
        return this.c;
    }

    @Override // xsna.an8
    public final long L2(agk0 agk0Var) {
        long j = 0;
        while (true) {
            long read = agk0Var.read(this.c, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read == -1) {
                return j;
            }
            j += read;
            o1();
        }
    }

    @Override // xsna.an8
    public final an8 P0(ByteString byteString) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        this.c.H(byteString);
        o1();
        return this;
    }

    @Override // xsna.an8
    public final an8 W2(int i) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        vl8 vl8Var = this.c;
        vl8Var.getClass();
        vl8Var.N(e.c(i));
        o1();
        return this;
    }

    @Override // xsna.an8
    public final an8 a4(int i, int i2, byte[] bArr) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        this.c.write(bArr, i, i2);
        o1();
        return this;
    }

    @Override // xsna.an8
    public final OutputStream b4() {
        return new a();
    }

    @Override // xsna.qwj0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qwj0 qwj0Var = this.b;
        if (this.d) {
            return;
        }
        try {
            vl8 vl8Var = this.c;
            long j = vl8Var.c;
            if (j > 0) {
                qwj0Var.n1(vl8Var, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            qwj0Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // xsna.an8, xsna.qwj0, java.io.Flushable
    public final void flush() {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        vl8 vl8Var = this.c;
        long j = vl8Var.c;
        qwj0 qwj0Var = this.b;
        if (j > 0) {
            qwj0Var.n1(vl8Var, j);
        }
        qwj0Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.d;
    }

    @Override // xsna.qwj0
    public final void n1(vl8 vl8Var, long j) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        this.c.n1(vl8Var, j);
        o1();
    }

    @Override // xsna.an8
    public final an8 o1() {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        vl8 vl8Var = this.c;
        long o = vl8Var.o();
        if (o > 0) {
            this.b.n1(vl8Var, o);
        }
        return this;
    }

    @Override // xsna.an8
    public final an8 r3(long j) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        this.c.L(j);
        o1();
        return this;
    }

    @Override // xsna.an8
    public final an8 t3() {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        vl8 vl8Var = this.c;
        long j = vl8Var.c;
        if (j > 0) {
            this.b.n1(vl8Var, j);
        }
        return this;
    }

    @Override // xsna.qwj0
    public final mxo0 timeout() {
        return this.b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.b + ')';
    }

    @Override // xsna.an8
    public final an8 v0(long j) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        this.c.J(j);
        o1();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        int write = this.c.write(byteBuffer);
        o1();
        return write;
    }

    @Override // xsna.an8
    public final an8 writeByte(int i) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        this.c.I(i);
        o1();
        return this;
    }

    @Override // xsna.an8
    public final an8 writeInt(int i) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        this.c.N(i);
        o1();
        return this;
    }

    @Override // xsna.an8
    public final an8 writeShort(int i) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        this.c.P(i);
        o1();
        return this;
    }

    @Override // xsna.an8
    public final an8 y1(String str) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        this.c.S(str);
        o1();
        return this;
    }

    @Override // xsna.an8
    public final an8 y2(long j) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        vl8 vl8Var = this.c;
        vl8Var.getClass();
        vl8Var.O(e.d(j));
        o1();
        return this;
    }

    /* compiled from: RealBufferedSink.kt */
    public static final class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            d8f0.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            d8f0 d8f0Var = d8f0.this;
            if (d8f0Var.d) {
                return;
            }
            d8f0Var.flush();
        }

        public final String toString() {
            return d8f0.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            d8f0 d8f0Var = d8f0.this;
            if (d8f0Var.d) {
                throw new IOException("closed");
            }
            d8f0Var.c.I((byte) i);
            d8f0Var.o1();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            d8f0 d8f0Var = d8f0.this;
            if (!d8f0Var.d) {
                d8f0Var.c.write(bArr, i, i2);
                d8f0Var.o1();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // xsna.an8
    public final an8 write(byte[] bArr) {
        if (!this.d) {
            vl8 vl8Var = this.c;
            vl8Var.getClass();
            vl8Var.write(bArr, 0, bArr.length);
            o1();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
