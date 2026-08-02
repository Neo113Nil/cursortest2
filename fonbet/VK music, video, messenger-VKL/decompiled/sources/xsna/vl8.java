package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.ByteString;
import okio.SegmentedByteString;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: Buffer.kt */
/* loaded from: classes11.dex */
public final class vl8 implements bn8, an8, Cloneable, ByteChannel {
    public m4i0 b;
    public long c;

    /* compiled from: Buffer.kt */
    /* loaded from: classes8.dex */
    public static final class b extends OutputStream {
        public b() {
        }

        public final String toString() {
            return vl8.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            vl8.this.I(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            vl8.this.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
        }
    }

    /* compiled from: Buffer.kt */
    public static final class c implements Closeable {
        public vl8 b;
        public boolean c;
        public m4i0 d;
        public byte[] f;
        public long e = -1;
        public int g = -1;
        public int h = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.b == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.b = null;
            this.d = null;
            this.e = -1L;
            this.f = null;
            this.g = -1;
            this.h = -1;
        }

        public final void h(long j) {
            vl8 vl8Var = this.b;
            if (vl8Var == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.c) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j2 = vl8Var.c;
            if (j <= j2) {
                if (j < 0) {
                    throw new IllegalArgumentException(defpackage.k0.a(j, "newSize < 0: ").toString());
                }
                long j3 = j2 - j;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    m4i0 m4i0Var = vl8Var.b.g;
                    int i = m4i0Var.c;
                    long j4 = i - m4i0Var.b;
                    if (j4 > j3) {
                        m4i0Var.c = i - ((int) j3);
                        break;
                    } else {
                        vl8Var.b = m4i0Var.a();
                        i5i0.a(m4i0Var);
                        j3 -= j4;
                    }
                }
                this.d = null;
                this.e = j;
                this.f = null;
                this.g = -1;
                this.h = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                int i2 = 1;
                boolean z = true;
                for (long j6 = 0; j5 > j6; j6 = 0) {
                    m4i0 E = vl8Var.E(i2);
                    int min = (int) Math.min(j5, 8192 - E.c);
                    int i3 = E.c + min;
                    E.c = i3;
                    j5 -= min;
                    if (z) {
                        this.d = E;
                        this.e = j2;
                        this.f = E.a;
                        this.g = i3 - min;
                        this.h = i3;
                        z = false;
                    }
                    i2 = 1;
                }
            }
            vl8Var.c = j;
        }

        public final int i(long j) {
            vl8 vl8Var = this.b;
            if (vl8Var == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j >= -1) {
                long j2 = vl8Var.c;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.d = null;
                        this.e = j;
                        this.f = null;
                        this.g = -1;
                        this.h = -1;
                        return -1;
                    }
                    m4i0 m4i0Var = vl8Var.b;
                    m4i0 m4i0Var2 = this.d;
                    long j3 = 0;
                    if (m4i0Var2 != null) {
                        long j4 = this.e - (this.g - m4i0Var2.b);
                        if (j4 > j) {
                            m4i0Var2 = m4i0Var;
                            m4i0Var = m4i0Var2;
                            j2 = j4;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        m4i0Var2 = m4i0Var;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            long j5 = (m4i0Var2.c - m4i0Var2.b) + j3;
                            if (j < j5) {
                                break;
                            }
                            m4i0Var2 = m4i0Var2.f;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            m4i0Var = m4i0Var.g;
                            j2 -= m4i0Var.c - m4i0Var.b;
                        }
                        m4i0Var2 = m4i0Var;
                        j3 = j2;
                    }
                    if (this.c && m4i0Var2.d) {
                        byte[] bArr = m4i0Var2.a;
                        m4i0 m4i0Var3 = new m4i0(Arrays.copyOf(bArr, bArr.length), m4i0Var2.b, m4i0Var2.c, false, true);
                        if (vl8Var.b == m4i0Var2) {
                            vl8Var.b = m4i0Var3;
                        }
                        m4i0Var2.b(m4i0Var3);
                        m4i0Var3.g.a();
                        m4i0Var2 = m4i0Var3;
                    }
                    this.d = m4i0Var2;
                    this.e = j;
                    this.f = m4i0Var2.a;
                    int i = m4i0Var2.b + ((int) (j - j3));
                    this.g = i;
                    int i2 = m4i0Var2.c;
                    this.h = i2;
                    return i2 - i;
                }
            }
            StringBuilder b = fp.b(j, "offset=", " > size=");
            b.append(vl8Var.c);
            throw new ArrayIndexOutOfBoundsException(b.toString());
        }
    }

    public final ByteString A(int i) {
        if (i == 0) {
            return ByteString.d;
        }
        e.b(this.c, 0L, i);
        m4i0 m4i0Var = this.b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = m4i0Var.c;
            int i6 = m4i0Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            m4i0Var = m4i0Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        m4i0 m4i0Var2 = this.b;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = m4i0Var2.a;
            i2 += m4i0Var2.c - m4i0Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = m4i0Var2.b;
            m4i0Var2.d = true;
            i7++;
            m4i0Var2 = m4i0Var2.f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // xsna.bn8
    public final String D1() throws EOFException {
        return s1(Long.MAX_VALUE);
    }

    public final m4i0 E(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        m4i0 m4i0Var = this.b;
        if (m4i0Var == null) {
            m4i0 b2 = i5i0.b();
            this.b = b2;
            b2.g = b2;
            b2.f = b2;
            return b2;
        }
        m4i0 m4i0Var2 = m4i0Var.g;
        if (m4i0Var2.c + i <= 8192 && m4i0Var2.e) {
            return m4i0Var2;
        }
        m4i0 b3 = i5i0.b();
        m4i0Var2.b(b3);
        return b3;
    }

    @Override // xsna.bn8
    public final ByteString F0(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount: ").toString());
        }
        if (this.c < j) {
            throw new EOFException();
        }
        if (j < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new ByteString(v(j));
        }
        ByteString A = A((int) j);
        skip(j);
        return A;
    }

    @Override // xsna.bn8
    public final int F3(zt80 zt80Var) {
        int d;
        d = xsna.b.d(this, zt80Var, false);
        if (d == -1) {
            return -1;
        }
        skip(zt80Var.b[d].n());
        return d;
    }

    @Override // xsna.bn8
    public final void G2(long j) throws EOFException {
        if (this.c < j) {
            throw new EOFException();
        }
    }

    public final void H(ByteString byteString) {
        byteString.B(this, byteString.n());
    }

    @Override // xsna.bn8
    public final ByteString H0() {
        return F0(this.c);
    }

    public final void I(int i) {
        m4i0 E = E(1);
        byte[] bArr = E.a;
        int i2 = E.c;
        E.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.c++;
    }

    public final void J(long j) {
        if (j == 0) {
            I(48);
            return;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                Q(0, 20, "-9223372036854775808");
                return;
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        m4i0 E = E(i);
        byte[] bArr = E.a;
        int i2 = E.c + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = xsna.b.b()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        E.c += i;
        this.c += i;
    }

    public final void L(long j) {
        if (j == 0) {
            I(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        m4i0 E = E(i);
        byte[] bArr = E.a;
        int i2 = E.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = xsna.b.b()[(int) (15 & j)];
            j >>>= 4;
        }
        E.c += i;
        this.c += i;
    }

    @Override // xsna.an8
    public final long L2(agk0 agk0Var) throws IOException {
        long j = 0;
        while (true) {
            long read = agk0Var.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public final void N(int i) {
        m4i0 E = E(4);
        byte[] bArr = E.a;
        int i2 = E.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        E.c = i2 + 4;
        this.c += 4;
    }

    public final void O(long j) {
        m4i0 E = E(8);
        byte[] bArr = E.a;
        int i = E.c;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        E.c = i + 8;
        this.c += 8;
    }

    public final void P(int i) {
        m4i0 E = E(2);
        byte[] bArr = E.a;
        int i2 = E.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        E.c = i2 + 2;
        this.c += 2;
    }

    @Override // xsna.an8
    public final /* bridge */ /* synthetic */ an8 P0(ByteString byteString) {
        H(byteString);
        return this;
    }

    public final void Q(int i, int i2, String str) {
        char charAt;
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(efz.a(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > str.length()) {
            StringBuilder b2 = ji.b(i2, "endIndex > string.length: ", " > ");
            b2.append(str.length());
            throw new IllegalArgumentException(b2.toString().toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                m4i0 E = E(1);
                byte[] bArr = E.a;
                int i3 = E.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = E.c;
                int i6 = (i3 + i) - i5;
                E.c = i5 + i6;
                this.c += i6;
            } else {
                if (charAt2 < 2048) {
                    m4i0 E2 = E(2);
                    byte[] bArr2 = E2.a;
                    int i7 = E2.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    E2.c = i7 + 2;
                    this.c += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    m4i0 E3 = E(3);
                    byte[] bArr3 = E3.a;
                    int i8 = E3.c;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    E3.c = i8 + 3;
                    this.c += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        I(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        m4i0 E4 = E(4);
                        byte[] bArr4 = E4.a;
                        int i11 = E4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        E4.c = i11 + 4;
                        this.c += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // xsna.bn8
    public final String Q2(long j) throws EOFException {
        return w(j, emb.b);
    }

    public final void S(String str) {
        Q(0, str.length(), str);
    }

    public final void T(int i) {
        String str;
        if (i < 128) {
            I(i);
            return;
        }
        if (i < 2048) {
            m4i0 E = E(2);
            byte[] bArr = E.a;
            int i2 = E.c;
            bArr[i2] = (byte) ((i >> 6) | PsExtractor.AUDIO_STREAM);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            E.c = i2 + 2;
            this.c += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            I(63);
            return;
        }
        if (i < 65536) {
            m4i0 E2 = E(3);
            byte[] bArr2 = E2.a;
            int i3 = E2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            E2.c = i3 + 3;
            this.c += 3;
            return;
        }
        if (i <= 1114111) {
            m4i0 E3 = E(4);
            byte[] bArr3 = E3.a;
            int i4 = E3.c;
            bArr3[i4] = (byte) ((i >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            E3.c = i4 + 4;
            this.c += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        c cVar = e.a;
        if (i != 0) {
            char[] cArr = xsna.c.a;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            int i5 = 0;
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            str = brm0.q(cArr2, i5, 8);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a A[EDGE_INSN: B:40:0x008a->B:37:0x008a BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    @Override // xsna.bn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long U0() throws EOFException {
        int i;
        if (this.c == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            m4i0 m4i0Var = this.b;
            byte[] bArr = m4i0Var.a;
            int i3 = m4i0Var.b;
            int i4 = m4i0Var.c;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    i = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i = b2 - 87;
                } else if (b2 >= 65 && b2 <= 70) {
                    i = b2 - 55;
                } else {
                    if (i2 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(e.e(b2)));
                    }
                    z = true;
                    if (i3 != i4) {
                        this.b = m4i0Var.a();
                        i5i0.a(m4i0Var);
                    } else {
                        m4i0Var.b = i3;
                    }
                    if (!z) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j) != 0) {
                    vl8 vl8Var = new vl8();
                    vl8Var.L(j);
                    vl8Var.I(b2);
                    throw new NumberFormatException("Number too large: ".concat(vl8Var.x()));
                }
                j = (j << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.b != null);
        this.c -= i2;
        return j;
    }

    @Override // xsna.bn8
    public final byte[] V2() {
        return v(this.c);
    }

    @Override // xsna.bn8
    public final boolean W1() {
        return this.c == 0;
    }

    @Override // xsna.an8
    public final an8 W2(int i) {
        N(e.c(i));
        return this;
    }

    @Override // xsna.bn8
    public final short Z() throws EOFException {
        short readShort = readShort();
        c cVar = e.a;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // xsna.an8
    public final /* bridge */ /* synthetic */ an8 a4(int i, int i2, byte[] bArr) {
        write(bArr, i, i2);
        return this;
    }

    @Override // xsna.an8
    public final OutputStream b4() {
        return new b();
    }

    @Override // xsna.bn8
    public final long d(ByteString byteString) {
        return s(0L, byteString);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl8)) {
            return false;
        }
        long j = this.c;
        vl8 vl8Var = (vl8) obj;
        if (j != vl8Var.c) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        m4i0 m4i0Var = this.b;
        m4i0 m4i0Var2 = vl8Var.b;
        int i = m4i0Var.b;
        int i2 = m4i0Var2.b;
        long j2 = 0;
        while (j2 < this.c) {
            long min = Math.min(m4i0Var.c - i, m4i0Var2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (m4i0Var.a[i] != m4i0Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == m4i0Var.c) {
                m4i0Var = m4i0Var.f;
                i = m4i0Var.b;
            }
            if (i2 == m4i0Var2.c) {
                m4i0Var2 = m4i0Var2.f;
                i2 = m4i0Var2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // xsna.bn8
    public final InputStream f4() {
        return new a();
    }

    public final int hashCode() {
        m4i0 m4i0Var = this.b;
        if (m4i0Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = m4i0Var.c;
            for (int i3 = m4i0Var.b; i3 < i2; i3++) {
                i = (i * 31) + m4i0Var.a[i3];
            }
            m4i0Var = m4i0Var.f;
        } while (m4i0Var != this.b);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // xsna.bn8
    public final long l0() throws EOFException {
        return e.d(readLong());
    }

    public final void m() {
        skip(this.c);
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final vl8 clone() {
        vl8 vl8Var = new vl8();
        if (this.c == 0) {
            return vl8Var;
        }
        m4i0 m4i0Var = this.b;
        m4i0 c2 = m4i0Var.c();
        vl8Var.b = c2;
        c2.g = c2;
        c2.f = c2;
        for (m4i0 m4i0Var2 = m4i0Var.f; m4i0Var2 != m4i0Var; m4i0Var2 = m4i0Var2.f) {
            c2.g.b(m4i0Var2.c());
        }
        vl8Var.c = this.c;
        return vl8Var;
    }

    @Override // xsna.qwj0
    public final void n1(vl8 vl8Var, long j) {
        m4i0 b2;
        if (vl8Var == this) {
            throw new IllegalArgumentException("source == this");
        }
        e.b(vl8Var.c, 0L, j);
        while (j > 0) {
            m4i0 m4i0Var = vl8Var.b;
            int i = m4i0Var.c - m4i0Var.b;
            if (j < i) {
                m4i0 m4i0Var2 = this.b;
                m4i0 m4i0Var3 = m4i0Var2 != null ? m4i0Var2.g : null;
                if (m4i0Var3 != null && m4i0Var3.e) {
                    if ((m4i0Var3.c + j) - (m4i0Var3.d ? 0 : m4i0Var3.b) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        m4i0Var.d(m4i0Var3, (int) j);
                        vl8Var.c -= j;
                        this.c += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i2 >= 1024) {
                    b2 = m4i0Var.c();
                } else {
                    b2 = i5i0.b();
                    byte[] bArr = m4i0Var.a;
                    byte[] bArr2 = b2.a;
                    int i3 = m4i0Var.b;
                    jw5.j(bArr, i3, i3 + i2, bArr2, 2);
                }
                b2.c = b2.b + i2;
                m4i0Var.b += i2;
                m4i0Var.g.b(b2);
                vl8Var.b = b2;
            }
            m4i0 m4i0Var4 = vl8Var.b;
            long j2 = m4i0Var4.c - m4i0Var4.b;
            vl8Var.b = m4i0Var4.a();
            m4i0 m4i0Var5 = this.b;
            if (m4i0Var5 == null) {
                this.b = m4i0Var4;
                m4i0Var4.g = m4i0Var4;
                m4i0Var4.f = m4i0Var4;
            } else {
                m4i0Var5.g.b(m4i0Var4);
                m4i0 m4i0Var6 = m4i0Var4.g;
                if (m4i0Var6 == m4i0Var4) {
                    throw new IllegalStateException("cannot compact");
                }
                if (m4i0Var6.e) {
                    int i4 = m4i0Var4.c - m4i0Var4.b;
                    if (i4 <= (8192 - m4i0Var6.c) + (m4i0Var6.d ? 0 : m4i0Var6.b)) {
                        m4i0Var4.d(m4i0Var6, i4);
                        m4i0Var4.a();
                        i5i0.a(m4i0Var4);
                    }
                }
            }
            vl8Var.c -= j2;
            this.c += j2;
            j -= j2;
        }
    }

    public final long o() {
        long j = this.c;
        if (j == 0) {
            return 0L;
        }
        m4i0 m4i0Var = this.b.g;
        return (m4i0Var.c >= 8192 || !m4i0Var.e) ? j : j - (r3 - m4i0Var.b);
    }

    @Override // xsna.bn8
    public final int o2() throws EOFException {
        return e.c(readInt());
    }

    @Override // xsna.bn8
    public final boolean o3(long j) {
        return this.c >= j;
    }

    public final void p(vl8 vl8Var, long j, long j2) {
        long j3 = j;
        e.b(this.c, j3, j2);
        if (j2 == 0) {
            return;
        }
        vl8Var.c += j2;
        m4i0 m4i0Var = this.b;
        while (true) {
            long j4 = m4i0Var.c - m4i0Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            m4i0Var = m4i0Var.f;
        }
        m4i0 m4i0Var2 = m4i0Var;
        long j5 = j2;
        while (j5 > 0) {
            m4i0 c2 = m4i0Var2.c();
            int i = c2.b + ((int) j3);
            c2.b = i;
            c2.c = Math.min(i + ((int) j5), c2.c);
            m4i0 m4i0Var3 = vl8Var.b;
            if (m4i0Var3 == null) {
                c2.g = c2;
                c2.f = c2;
                vl8Var.b = c2;
            } else {
                m4i0Var3.g.b(c2);
            }
            j5 -= c2.c - c2.b;
            m4i0Var2 = m4i0Var2.f;
            j3 = 0;
        }
    }

    @Override // xsna.bn8
    public final String p3(Charset charset) {
        return w(this.c, charset);
    }

    public final byte q(long j) {
        e.b(this.c, j, 1L);
        m4i0 m4i0Var = this.b;
        m4i0Var.getClass();
        long j2 = this.c;
        if (j2 - j < j) {
            while (j2 > j) {
                m4i0Var = m4i0Var.g;
                j2 -= m4i0Var.c - m4i0Var.b;
            }
            return m4i0Var.a[(int) ((m4i0Var.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = m4i0Var.c;
            int i2 = m4i0Var.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return m4i0Var.a[(int) ((i2 + j) - j3)];
            }
            m4i0Var = m4i0Var.f;
            j3 = j4;
        }
    }

    public final long r(byte b2, long j, long j2) {
        m4i0 m4i0Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.c);
            tj0.d(sb, " fromIndex=", j, " toIndex=");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j4 = this.c;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (m4i0Var = this.b) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                m4i0Var = m4i0Var.g;
                j4 -= m4i0Var.c - m4i0Var.b;
            }
            while (j4 < j2) {
                byte[] bArr = m4i0Var.a;
                int min = (int) Math.min(m4i0Var.c, (m4i0Var.b + j2) - j4);
                for (int i = (int) ((m4i0Var.b + j) - j4); i < min; i++) {
                    if (bArr[i] == b2) {
                        return (i - m4i0Var.b) + j4;
                    }
                }
                j4 += m4i0Var.c - m4i0Var.b;
                m4i0Var = m4i0Var.f;
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = (m4i0Var.c - m4i0Var.b) + j3;
            if (j5 > j) {
                break;
            }
            m4i0Var = m4i0Var.f;
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = m4i0Var.a;
            int min2 = (int) Math.min(m4i0Var.c, (m4i0Var.b + j2) - j3);
            for (int i2 = (int) ((m4i0Var.b + j) - j3); i2 < min2; i2++) {
                if (bArr2[i2] == b2) {
                    return (i2 - m4i0Var.b) + j3;
                }
            }
            j3 += m4i0Var.c - m4i0Var.b;
            m4i0Var = m4i0Var.f;
            j = j3;
        }
        return -1L;
    }

    @Override // xsna.an8
    public final /* bridge */ /* synthetic */ an8 r3(long j) {
        L(j);
        return this;
    }

    @Override // xsna.agk0
    public final long read(vl8 vl8Var, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount < 0: ").toString());
        }
        long j2 = this.c;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        vl8Var.n1(this, j);
        return j;
    }

    @Override // xsna.bn8
    public final byte readByte() throws EOFException {
        long j = this.c;
        if (j == 0) {
            throw new EOFException();
        }
        m4i0 m4i0Var = this.b;
        int i = m4i0Var.b;
        int i2 = m4i0Var.c;
        int i3 = i + 1;
        byte b2 = m4i0Var.a[i];
        this.c = j - 1;
        if (i3 != i2) {
            m4i0Var.b = i3;
            return b2;
        }
        this.b = m4i0Var.a();
        i5i0.a(m4i0Var);
        return b2;
    }

    @Override // xsna.bn8
    public final void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    @Override // xsna.bn8
    public final int readInt() throws EOFException {
        long j = this.c;
        if (j < 4) {
            throw new EOFException();
        }
        m4i0 m4i0Var = this.b;
        int i = m4i0Var.b;
        int i2 = m4i0Var.c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = m4i0Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.c = j - 4;
        if (i5 != i2) {
            m4i0Var.b = i5;
            return i6;
        }
        this.b = m4i0Var.a();
        i5i0.a(m4i0Var);
        return i6;
    }

    @Override // xsna.bn8
    public final long readLong() throws EOFException {
        long j = this.c;
        if (j < 8) {
            throw new EOFException();
        }
        m4i0 m4i0Var = this.b;
        int i = m4i0Var.b;
        int i2 = m4i0Var.c;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = m4i0Var.a;
        int i3 = i + 7;
        long j2 = ((bArr[i + 1] & 255) << 48) | ((bArr[i] & 255) << 56) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j3 = j2 | (bArr[i3] & 255);
        this.c = j - 8;
        if (i4 != i2) {
            m4i0Var.b = i4;
            return j3;
        }
        this.b = m4i0Var.a();
        i5i0.a(m4i0Var);
        return j3;
    }

    @Override // xsna.bn8
    public final short readShort() throws EOFException {
        long j = this.c;
        if (j < 2) {
            throw new EOFException();
        }
        m4i0 m4i0Var = this.b;
        int i = m4i0Var.b;
        int i2 = m4i0Var.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = m4i0Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.c = j - 2;
        if (i5 == i2) {
            this.b = m4i0Var.a();
            i5i0.a(m4i0Var);
        } else {
            m4i0Var.b = i5;
        }
        return (short) i6;
    }

    public final long s(long j, ByteString byteString) {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "fromIndex < 0: ").toString());
        }
        m4i0 m4i0Var = this.b;
        if (m4i0Var == null) {
            return -1L;
        }
        long j3 = this.c;
        if (j3 - j < j) {
            while (j3 > j) {
                m4i0Var = m4i0Var.g;
                j3 -= m4i0Var.c - m4i0Var.b;
            }
            if (byteString.n() == 2) {
                byte s = byteString.s(0);
                byte s2 = byteString.s(1);
                while (j3 < this.c) {
                    byte[] bArr = m4i0Var.a;
                    int i = m4i0Var.c;
                    for (int i2 = (int) ((m4i0Var.b + j) - j3); i2 < i; i2++) {
                        byte b2 = bArr[i2];
                        if (b2 == s || b2 == s2) {
                            return (i2 - m4i0Var.b) + j3;
                        }
                    }
                    j3 += m4i0Var.c - m4i0Var.b;
                    m4i0Var = m4i0Var.f;
                    j = j3;
                }
            } else {
                byte[] r = byteString.r();
                while (j3 < this.c) {
                    byte[] bArr2 = m4i0Var.a;
                    int i3 = m4i0Var.c;
                    for (int i4 = (int) ((m4i0Var.b + j) - j3); i4 < i3; i4++) {
                        byte b3 = bArr2[i4];
                        for (byte b4 : r) {
                            if (b3 == b4) {
                                return (i4 - m4i0Var.b) + j3;
                            }
                        }
                    }
                    j3 += m4i0Var.c - m4i0Var.b;
                    m4i0Var = m4i0Var.f;
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = (m4i0Var.c - m4i0Var.b) + j2;
            if (j4 > j) {
                break;
            }
            m4i0Var = m4i0Var.f;
            j2 = j4;
        }
        if (byteString.n() == 2) {
            byte s3 = byteString.s(0);
            byte s4 = byteString.s(1);
            while (j2 < this.c) {
                byte[] bArr3 = m4i0Var.a;
                int i5 = m4i0Var.c;
                for (int i6 = (int) ((m4i0Var.b + j) - j2); i6 < i5; i6++) {
                    byte b5 = bArr3[i6];
                    if (b5 == s3 || b5 == s4) {
                        return (i6 - m4i0Var.b) + j2;
                    }
                }
                j2 += m4i0Var.c - m4i0Var.b;
                m4i0Var = m4i0Var.f;
                j = j2;
            }
        } else {
            byte[] r2 = byteString.r();
            while (j2 < this.c) {
                byte[] bArr4 = m4i0Var.a;
                int i7 = m4i0Var.c;
                for (int i8 = (int) ((m4i0Var.b + j) - j2); i8 < i7; i8++) {
                    byte b6 = bArr4[i8];
                    for (byte b7 : r2) {
                        if (b6 == b7) {
                            return (i8 - m4i0Var.b) + j2;
                        }
                    }
                }
                j2 += m4i0Var.c - m4i0Var.b;
                m4i0Var = m4i0Var.f;
                j = j2;
            }
        }
        return -1L;
    }

    @Override // xsna.bn8
    public final String s1(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "limit < 0: ").toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long r = r((byte) 10, 0L, j2);
        if (r != -1) {
            return xsna.b.c(this, r);
        }
        if (j2 < this.c && q(j2 - 1) == 13 && q(j2) == 10) {
            return xsna.b.c(this, j2);
        }
        vl8 vl8Var = new vl8();
        p(vl8Var, 0L, Math.min(32, this.c));
        throw new EOFException("\\n not found: limit=" + Math.min(this.c, j) + " content=" + vl8Var.F0(vl8Var.c).o() + (char) 8230);
    }

    @Override // xsna.bn8
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            m4i0 m4i0Var = this.b;
            if (m4i0Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, m4i0Var.c - m4i0Var.b);
            long j2 = min;
            this.c -= j2;
            j -= j2;
            int i = m4i0Var.b + min;
            m4i0Var.b = i;
            if (i == m4i0Var.c) {
                this.b = m4i0Var.a();
                i5i0.a(m4i0Var);
            }
        }
    }

    public final boolean t(long j, ByteString byteString) {
        int n = byteString.n();
        if (j >= 0 && n >= 0 && this.c - j >= n && byteString.n() >= n) {
            for (int i = 0; i < n; i++) {
                if (q(i + j) == byteString.s(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // xsna.agk0
    public final mxo0 timeout() {
        return mxo0.d;
    }

    public final String toString() {
        return z().toString();
    }

    public final byte[] v(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount: ").toString());
        }
        if (this.c < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // xsna.an8
    public final /* bridge */ /* synthetic */ an8 v0(long j) {
        J(j);
        return this;
    }

    public final String w(long j, Charset charset) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount: ").toString());
        }
        if (this.c < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        m4i0 m4i0Var = this.b;
        int i = m4i0Var.b;
        if (i + j > m4i0Var.c) {
            return new String(v(j), charset);
        }
        int i2 = (int) j;
        String str = new String(m4i0Var.a, i, i2, charset);
        int i3 = m4i0Var.b + i2;
        m4i0Var.b = i3;
        this.c -= j;
        if (i3 == m4i0Var.c) {
            this.b = m4i0Var.a();
            i5i0.a(m4i0Var);
        }
        return str;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            m4i0 E = E(1);
            int min = Math.min(i, 8192 - E.c);
            byteBuffer.get(E.a, E.c, min);
            i -= min;
            E.c += min;
        }
        this.c += remaining;
        return remaining;
    }

    @Override // xsna.an8
    public final /* bridge */ /* synthetic */ an8 writeByte(int i) {
        I(i);
        return this;
    }

    @Override // xsna.an8
    public final /* bridge */ /* synthetic */ an8 writeInt(int i) {
        N(i);
        return this;
    }

    @Override // xsna.an8
    public final /* bridge */ /* synthetic */ an8 writeShort(int i) {
        P(i);
        return this;
    }

    public final String x() {
        return w(this.c, emb.b);
    }

    public final int y() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.c == 0) {
            throw new EOFException();
        }
        byte q = q(0L);
        if ((q & 128) == 0) {
            i = q & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((q & 224) == 192) {
            i = q & 31;
            i2 = 2;
            i3 = 128;
        } else if ((q & 240) == 224) {
            i = q & AmfConstants.TYPE_XML_DOCUMENT_MARKER;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((q & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = q & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.c < j) {
            StringBuilder b2 = ji.b(i2, "size < ", ": ");
            b2.append(this.c);
            b2.append(" (to read code point prefixed 0x");
            b2.append(e.e(q));
            b2.append(')');
            throw new EOFException(b2.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte q2 = q(j2);
            if ((q2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (q2 & CharsetEncoder.DEFAULT_REPLACEMENT);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // xsna.an8
    public final /* bridge */ /* synthetic */ an8 y1(String str) {
        S(str);
        return this;
    }

    @Override // xsna.an8
    public final an8 y2(long j) {
        O(e.d(j));
        return this;
    }

    public final ByteString z() {
        long j = this.c;
        if (j <= 2147483647L) {
            return A((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.c).toString());
    }

    @Override // xsna.bn8
    public final void z1(vl8 vl8Var, long j) throws EOFException {
        long j2 = this.c;
        if (j2 >= j) {
            vl8Var.n1(this, j);
        } else {
            vl8Var.n1(this, j2);
            throw new EOFException();
        }
    }

    @Override // xsna.bn8
    public final long z3(vl8 vl8Var) throws IOException {
        long j = this.c;
        if (j > 0) {
            vl8Var.n1(this, j);
        }
        return j;
    }

    /* compiled from: Buffer.kt */
    /* loaded from: classes8.dex */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(vl8.this.c, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public final int read() {
            vl8 vl8Var = vl8.this;
            if (vl8Var.c > 0) {
                return vl8Var.readByte() & 255;
            }
            return -1;
        }

        public final String toString() {
            return vl8.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            return vl8.this.read(bArr, i, i2);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    @Override // xsna.an8
    public final an8 write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    public final void write(byte[] bArr, int i, int i2) {
        long j = i2;
        e.b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            m4i0 E = E(1);
            int min = Math.min(i3 - i, 8192 - E.c);
            int i4 = i + min;
            jw5.f(bArr, E.c, i, E.a, i4);
            E.c += min;
            i = i4;
        }
        this.c += j;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        m4i0 m4i0Var = this.b;
        if (m4i0Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), m4i0Var.c - m4i0Var.b);
        byteBuffer.put(m4i0Var.a, m4i0Var.b, min);
        int i = m4i0Var.b + min;
        m4i0Var.b = i;
        this.c -= min;
        if (i == m4i0Var.c) {
            this.b = m4i0Var.a();
            i5i0.a(m4i0Var);
        }
        return min;
    }

    public final int read(byte[] bArr, int i, int i2) {
        e.b(bArr.length, i, i2);
        m4i0 m4i0Var = this.b;
        if (m4i0Var == null) {
            return -1;
        }
        int min = Math.min(i2, m4i0Var.c - m4i0Var.b);
        byte[] bArr2 = m4i0Var.a;
        int i3 = m4i0Var.b;
        jw5.f(bArr2, i, i3, bArr, i3 + min);
        int i4 = m4i0Var.b + min;
        m4i0Var.b = i4;
        this.c -= min;
        if (i4 == m4i0Var.c) {
            this.b = m4i0Var.a();
            i5i0.a(m4i0Var);
        }
        return min;
    }

    @Override // xsna.bn8
    public final vl8 C() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, xsna.qwj0
    public final void close() {
    }

    @Override // xsna.an8, xsna.qwj0, java.io.Flushable
    public final void flush() {
    }

    @Override // xsna.an8
    public final an8 o1() {
        return this;
    }

    @Override // xsna.an8
    public final an8 t3() {
        return this;
    }
}
