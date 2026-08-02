package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.ByteString;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class jci0 implements qq6 {
    public final y9t0 a;
    public final yp6 b = new yp6();
    public boolean c;

    public jci0(y9t0 y9t0Var) {
        this.a = y9t0Var;
    }

    @Override // defpackage.qq6
    public final void B1(long j) {
        if (S(j)) {
            return;
        }
        ny61.b();
    }

    @Override // defpackage.qq6
    public final String C0(Charset charset) {
        y9t0 y9t0Var = this.a;
        yp6 yp6Var = this.b;
        yp6Var.N1(y9t0Var);
        return yp6Var.T(yp6Var.b, charset);
    }

    @Override // defpackage.qq6
    public final void C1(yp6 yp6Var, long j) {
        yp6 yp6Var2 = this.b;
        try {
            B1(j);
            yp6Var2.C1(yp6Var, j);
        } catch (EOFException e) {
            yp6Var.N1(yp6Var2);
            throw e;
        }
    }

    @Override // defpackage.qq6
    public final ByteString E0() {
        y9t0 y9t0Var = this.a;
        yp6 yp6Var = this.b;
        yp6Var.N1(y9t0Var);
        return yp6Var.l0(yp6Var.b);
    }

    @Override // defpackage.qq6
    public final String I0() {
        y9t0 y9t0Var = this.a;
        yp6 yp6Var = this.b;
        yp6Var.N1(y9t0Var);
        return yp6Var.I0();
    }

    @Override // defpackage.qq6
    public final boolean I1() {
        if (this.c) {
            ny61.r("closed");
            return false;
        }
        yp6 yp6Var = this.b;
        return yp6Var.I1() && this.a.read(yp6Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // defpackage.qq6
    public final long J(ByteString byteString) {
        return y5e.k(this, byteString, byteString.h(), 0L, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
    }

    @Override // defpackage.qq6
    public final long K(ByteString byteString) {
        long j = 0;
        if (this.c) {
            ny61.r("closed");
            return 0L;
        }
        while (true) {
            yp6 yp6Var = this.b;
            long o = yp6Var.o(j, byteString);
            if (o != -1) {
                return o;
            }
            long j2 = yp6Var.b;
            if (this.a.read(yp6Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    @Override // defpackage.qq6
    public final String L() {
        long e1 = e1((byte) 10, 0L, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        yp6 yp6Var = this.b;
        if (e1 != -1) {
            return b.c(yp6Var, e1);
        }
        long j = yp6Var.b;
        if (j != 0) {
            return j0(j);
        }
        return null;
    }

    @Override // defpackage.qq6
    public final boolean Q(long j, ByteString byteString) {
        int h = byteString.h();
        if (!this.c) {
            return h >= 0 && j >= 0 && h <= byteString.h() && (h == 0 || y5e.k(this, byteString, h, j, j + 1) != -1);
        }
        ny61.r("closed");
        return false;
    }

    @Override // defpackage.qq6
    public final boolean S(long j) {
        yp6 yp6Var;
        if (j < 0) {
            w511.f(qv10.j(j, "byteCount < 0: "));
            return false;
        }
        if (this.c) {
            ny61.r("closed");
            return false;
        }
        do {
            yp6Var = this.b;
            if (yp6Var.b >= j) {
                return true;
            }
        } while (this.a.read(yp6Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override // defpackage.qq6
    public final yp6 V0() {
        return this.b;
    }

    @Override // defpackage.qq6
    public final long X() {
        B1(8L);
        return this.b.X();
    }

    public final short a() {
        B1(2L);
        return this.b.R();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.clear();
    }

    @Override // defpackage.qq6
    public final int d2() {
        B1(4L);
        return this.b.d2();
    }

    @Override // defpackage.qq6
    public final long e1(byte b, long j, long j2) {
        if (this.c) {
            ny61.r("closed");
            return 0L;
        }
        if (0 > j || j > j2) {
            StringBuilder w = unr0.w(j, "fromIndex=", " toIndex=");
            w.append(j2);
            throw new IllegalArgumentException(w.toString().toString());
        }
        long j3 = j;
        while (j3 < j2) {
            byte b2 = b;
            long j4 = j2;
            long e1 = this.b.e1(b2, j3, j4);
            if (e1 == -1) {
                yp6 yp6Var = this.b;
                long j5 = yp6Var.b;
                if (j5 >= j4 || this.a.read(yp6Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return e1;
            }
        }
        return -1L;
    }

    @Override // defpackage.qq6
    public final yp6 h() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        return -1;
     */
    @Override // defpackage.qq6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h0(ng70 ng70Var) {
        if (this.c) {
            ny61.r("closed");
            return 0;
        }
        while (true) {
            yp6 yp6Var = this.b;
            int d = b.d(yp6Var, ng70Var, true);
            if (d != -2) {
                if (d != -1) {
                    yp6Var.skip(ng70Var.a[d].h());
                    return d;
                }
            } else if (this.a.read(yp6Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.qq6
    public final String j0(long j) {
        B1(j);
        yp6 yp6Var = this.b;
        yp6Var.getClass();
        return yp6Var.T(j, uza.a);
    }

    @Override // defpackage.qq6
    public final String j1(long j) {
        if (j < 0) {
            w511.f(qv10.j(j, "limit < 0: "));
            return null;
        }
        long j2 = j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED ? Long.MAX_VALUE : j + 1;
        long e1 = e1((byte) 10, 0L, j2);
        yp6 yp6Var = this.b;
        if (e1 != -1) {
            return b.c(yp6Var, e1);
        }
        if (j2 < ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED && S(j2) && yp6Var.e(j2 - 1) == 13 && S(j2 + 1) && yp6Var.e(j2) == 10) {
            return b.c(yp6Var, j2);
        }
        yp6 yp6Var2 = new yp6();
        yp6Var.d(yp6Var2, 0L, Math.min(32L, yp6Var.b));
        throw new EOFException("\\n not found: limit=" + Math.min(yp6Var.b, j) + " content=" + yp6Var2.l0(yp6Var2.b).i() + (char) 8230);
    }

    @Override // defpackage.qq6
    public final ByteString l0(long j) {
        B1(j);
        return this.b.l0(j);
    }

    @Override // defpackage.qq6
    public final byte[] p0() {
        y9t0 y9t0Var = this.a;
        yp6 yp6Var = this.b;
        yp6Var.N1(y9t0Var);
        return yp6Var.B(yp6Var.b);
    }

    @Override // defpackage.qq6
    public final InputStream p2() {
        return new wp6(this, 1);
    }

    @Override // defpackage.qq6
    public final jci0 peek() {
        return new jci0(new rra0(this));
    }

    @Override // defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        if (j < 0) {
            w511.f(qv10.j(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            ny61.r("closed");
            return 0L;
        }
        yp6 yp6Var2 = this.b;
        if (yp6Var2.b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.a.read(yp6Var2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
        }
        return yp6Var2.read(yp6Var, Math.min(j, yp6Var2.b));
    }

    @Override // defpackage.qq6
    public final byte readByte() {
        B1(1L);
        return this.b.readByte();
    }

    @Override // defpackage.qq6
    public final void readFully(byte[] bArr) {
        yp6 yp6Var = this.b;
        try {
            B1(bArr.length);
            yp6Var.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = yp6Var.b;
                if (j <= 0) {
                    throw e;
                }
                int read = yp6Var.read(bArr, i, (int) j);
                if (read == -1) {
                    ny61.w();
                    return;
                }
                i += read;
            }
        }
    }

    @Override // defpackage.qq6
    public final int readInt() {
        B1(4L);
        return this.b.readInt();
    }

    @Override // defpackage.qq6
    public final long readLong() {
        B1(8L);
        return this.b.readLong();
    }

    @Override // defpackage.qq6
    public final short readShort() {
        B1(2L);
        return this.b.readShort();
    }

    @Override // defpackage.qq6
    public final void skip(long j) {
        if (this.c) {
            ny61.r("closed");
            return;
        }
        while (j > 0) {
            yp6 yp6Var = this.b;
            if (yp6Var.b == 0 && this.a.read(yp6Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                ny61.b();
                return;
            } else {
                long min = Math.min(j, yp6Var.b);
                yp6Var.skip(min);
                j -= min;
            }
        }
    }

    @Override // defpackage.y9t0
    public final ydz0 timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.qq6
    public final String w1() {
        return j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
    }

    @Override // defpackage.qq6
    public final long y0(oq6 oq6Var) {
        yp6 yp6Var;
        long j = 0;
        while (true) {
            y9t0 y9t0Var = this.a;
            yp6Var = this.b;
            if (y9t0Var.read(yp6Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            long a = yp6Var.a();
            if (a > 0) {
                j += a;
                oq6Var.write(yp6Var, a);
            }
        }
        long j2 = yp6Var.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        oq6Var.write(yp6Var, j2);
        return j3;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        yp6 yp6Var = this.b;
        if (yp6Var.b == 0 && this.a.read(yp6Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return yp6Var.read(byteBuffer);
    }
}
