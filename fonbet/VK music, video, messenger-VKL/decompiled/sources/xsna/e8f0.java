package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.ByteString;

/* compiled from: RealBufferedSource.kt */
/* loaded from: classes11.dex */
public final class e8f0 implements bn8 {
    public final agk0 b;
    public final vl8 c = new vl8();
    public boolean d;

    public e8f0(agk0 agk0Var) {
        this.b = agk0Var;
    }

    @Override // xsna.bn8
    public final vl8 C() {
        return this.c;
    }

    @Override // xsna.bn8
    public final String D1() {
        return s1(Long.MAX_VALUE);
    }

    @Override // xsna.bn8
    public final ByteString F0(long j) {
        G2(j);
        return this.c.F0(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        return -1;
     */
    @Override // xsna.bn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F3(zt80 zt80Var) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            vl8 vl8Var = this.c;
            int d = b.d(vl8Var, zt80Var, true);
            if (d != -2) {
                if (d != -1) {
                    vl8Var.skip(zt80Var.b[d].n());
                    return d;
                }
            } else if (this.b.read(vl8Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
        }
    }

    @Override // xsna.bn8
    public final void G2(long j) {
        if (!o3(j)) {
            throw new EOFException();
        }
    }

    @Override // xsna.bn8
    public final ByteString H0() {
        agk0 agk0Var = this.b;
        vl8 vl8Var = this.c;
        vl8Var.L2(agk0Var);
        return vl8Var.F0(vl8Var.c);
    }

    @Override // xsna.bn8
    public final String Q2(long j) {
        G2(j);
        vl8 vl8Var = this.c;
        vl8Var.getClass();
        return vl8Var.w(j, emb.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        xsna.ro.d(16);
        xsna.ro.d(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(java.lang.Integer.toString(r2, 16)));
     */
    @Override // xsna.bn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long U0() {
        vl8 vl8Var;
        G2(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean o3 = o3(i2);
            vl8Var = this.c;
            if (!o3) {
                break;
            }
            byte q = vl8Var.q(i);
            if ((q < 48 || q > 57) && ((q < 97 || q > 102) && (q < 65 || q > 70))) {
                break;
            }
            i = i2;
        }
        return vl8Var.U0();
    }

    @Override // xsna.bn8
    public final byte[] V2() {
        agk0 agk0Var = this.b;
        vl8 vl8Var = this.c;
        vl8Var.L2(agk0Var);
        return vl8Var.v(vl8Var.c);
    }

    @Override // xsna.bn8
    public final boolean W1() {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        vl8 vl8Var = this.c;
        return vl8Var.W1() && this.b.read(vl8Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // xsna.bn8
    public final short Z() {
        G2(2L);
        return this.c.Z();
    }

    public final long b(byte b, long j, long j2) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        if (0 > j2) {
            throw new IllegalArgumentException(defpackage.k0.a(j2, "fromIndex=0 toIndex=").toString());
        }
        long j3 = 0;
        while (j3 < j2) {
            byte b2 = b;
            long j4 = j2;
            long r = this.c.r(b2, j3, j4);
            if (r == -1) {
                vl8 vl8Var = this.c;
                long j5 = vl8Var.c;
                if (j5 >= j4 || this.b.read(vl8Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return r;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.b.close();
        this.c.m();
    }

    @Override // xsna.bn8
    public final long d(ByteString byteString) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        long j = 0;
        while (true) {
            vl8 vl8Var = this.c;
            long s = vl8Var.s(j, byteString);
            if (s != -1) {
                return s;
            }
            long j2 = vl8Var.c;
            if (this.b.read(vl8Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    @Override // xsna.bn8
    public final InputStream f4() {
        return new a();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.d;
    }

    @Override // xsna.bn8
    public final long l0() {
        G2(8L);
        return this.c.l0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r5 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        xsna.ro.d(16);
        xsna.ro.d(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(java.lang.Integer.toString(r9, 16)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00da, code lost:
    
        r3 = r10.c - r1;
        r10.c = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
    
        if (r2 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e2, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e5, code lost:
    
        if (r1 >= r15) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e9, code lost:
    
        if (r3 == r16) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00eb, code lost:
    
        if (r2 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ed, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f2, code lost:
    
        r1 = xsna.ho8.b(r1, " but was 0x");
        r1.append(xsna.e.e(r10.q(r16)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010e, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f0, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0114, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0115, code lost:
    
        if (r2 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0119, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e4, code lost:
    
        r15 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m() {
        vl8 vl8Var;
        long j;
        byte b;
        boolean z;
        G2(1L);
        long j2 = 0;
        while (true) {
            long j3 = j2 + 1;
            boolean o3 = o3(j3);
            vl8Var = this.c;
            if (!o3) {
                break;
            }
            byte q = vl8Var.q(j2);
            if ((q < 48 || q > 57) && !(j2 == 0 && q == 45)) {
                break;
            }
            j2 = j3;
        }
        long j4 = 0;
        if (vl8Var.c == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z2 = false;
        long j5 = 0;
        long j6 = -7;
        boolean z3 = false;
        loop1: while (true) {
            m4i0 m4i0Var = vl8Var.b;
            byte[] bArr = m4i0Var.a;
            int i2 = m4i0Var.b;
            int i3 = m4i0Var.c;
            while (i2 < i3) {
                b = bArr[i2];
                j = j4;
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j5 < -922337203685477580L) {
                        break loop1;
                    }
                    z = z3;
                    if (j5 == -922337203685477580L && i4 < j6) {
                        break loop1;
                    }
                    j5 = (j5 * 10) + i4;
                } else {
                    z = z3;
                    if (b != 45 || i != 0) {
                        z3 = true;
                        break;
                    }
                    j6--;
                    z2 = true;
                }
                i2++;
                i++;
                j4 = j;
                z3 = z;
            }
            j = j4;
            if (i2 == i3) {
                vl8Var.b = m4i0Var.a();
                i5i0.a(m4i0Var);
            } else {
                m4i0Var.b = i2;
            }
            if (z3 || vl8Var.b == null) {
                break;
            }
            j4 = j;
        }
        vl8 vl8Var2 = new vl8();
        vl8Var2.J(j5);
        vl8Var2.I(b);
        if (!z2) {
            vl8Var2.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(vl8Var2.x()));
    }

    @Override // xsna.bn8
    public final int o2() {
        G2(4L);
        return this.c.o2();
    }

    @Override // xsna.bn8
    public final boolean o3(long j) {
        vl8 vl8Var;
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount < 0: ").toString());
        }
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        do {
            vl8Var = this.c;
            if (vl8Var.c >= j) {
                return true;
            }
        } while (this.b.read(vl8Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override // xsna.bn8
    public final String p3(Charset charset) {
        agk0 agk0Var = this.b;
        vl8 vl8Var = this.c;
        vl8Var.L2(agk0Var);
        return vl8Var.w(vl8Var.c, charset);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        vl8 vl8Var = this.c;
        if (vl8Var.c == 0 && this.b.read(vl8Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return vl8Var.read(byteBuffer);
    }

    @Override // xsna.bn8
    public final byte readByte() {
        G2(1L);
        return this.c.readByte();
    }

    @Override // xsna.bn8
    public final void readFully(byte[] bArr) {
        vl8 vl8Var = this.c;
        try {
            G2(bArr.length);
            vl8Var.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = vl8Var.c;
                if (j <= 0) {
                    throw e;
                }
                int read = vl8Var.read(bArr, i, (int) j);
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
        }
    }

    @Override // xsna.bn8
    public final int readInt() {
        G2(4L);
        return this.c.readInt();
    }

    @Override // xsna.bn8
    public final long readLong() {
        G2(8L);
        return this.c.readLong();
    }

    @Override // xsna.bn8
    public final short readShort() {
        G2(2L);
        return this.c.readShort();
    }

    @Override // xsna.bn8
    public final String s1(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long b = b((byte) 10, 0L, j2);
        vl8 vl8Var = this.c;
        if (b != -1) {
            return b.c(vl8Var, b);
        }
        if (j2 < Long.MAX_VALUE && o3(j2) && vl8Var.q(j2 - 1) == 13 && o3(j2 + 1) && vl8Var.q(j2) == 10) {
            return b.c(vl8Var, j2);
        }
        vl8 vl8Var2 = new vl8();
        vl8Var.p(vl8Var2, 0L, Math.min(32, vl8Var.c));
        throw new EOFException("\\n not found: limit=" + Math.min(vl8Var.c, j) + " content=" + vl8Var2.F0(vl8Var2.c).o() + (char) 8230);
    }

    @Override // xsna.bn8
    public final void skip(long j) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            vl8 vl8Var = this.c;
            if (vl8Var.c == 0 && this.b.read(vl8Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, vl8Var.c);
            vl8Var.skip(min);
            j -= min;
        }
    }

    @Override // xsna.agk0
    public final mxo0 timeout() {
        return this.b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.b + ')';
    }

    @Override // xsna.bn8
    public final void z1(vl8 vl8Var, long j) {
        vl8 vl8Var2 = this.c;
        try {
            G2(j);
            vl8Var2.z1(vl8Var, j);
        } catch (EOFException e) {
            vl8Var.L2(vl8Var2);
            throw e;
        }
    }

    @Override // xsna.bn8
    public final long z3(vl8 vl8Var) {
        vl8 vl8Var2;
        long j = 0;
        while (true) {
            agk0 agk0Var = this.b;
            vl8Var2 = this.c;
            if (agk0Var.read(vl8Var2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            long o = vl8Var2.o();
            if (o > 0) {
                j += o;
                vl8Var.n1(vl8Var2, o);
            }
        }
        long j2 = vl8Var2.c;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        vl8Var.n1(vl8Var2, j2);
        return j3;
    }

    @Override // xsna.agk0
    public final long read(vl8 vl8Var, long j) {
        if (j >= 0) {
            if (!this.d) {
                vl8 vl8Var2 = this.c;
                if (vl8Var2.c == 0 && this.b.read(vl8Var2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1L;
                }
                return vl8Var2.read(vl8Var, Math.min(j, vl8Var2.c));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount < 0: ").toString());
    }

    /* compiled from: RealBufferedSource.kt */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            e8f0 e8f0Var = e8f0.this;
            if (e8f0Var.d) {
                throw new IOException("closed");
            }
            return (int) Math.min(e8f0Var.c.c, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            e8f0.this.close();
        }

        @Override // java.io.InputStream
        public final int read() {
            e8f0 e8f0Var = e8f0.this;
            vl8 vl8Var = e8f0Var.c;
            if (e8f0Var.d) {
                throw new IOException("closed");
            }
            if (vl8Var.c == 0 && e8f0Var.b.read(vl8Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return vl8Var.readByte() & 255;
        }

        public final String toString() {
            return e8f0.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            e8f0 e8f0Var = e8f0.this;
            vl8 vl8Var = e8f0Var.c;
            if (!e8f0Var.d) {
                e.b(bArr.length, i, i2);
                if (vl8Var.c == 0 && e8f0Var.b.read(vl8Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return vl8Var.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
