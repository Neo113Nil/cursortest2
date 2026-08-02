package xsna;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableSet;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: ParsableByteArray.java */
/* loaded from: classes12.dex */
public final class xi90 {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final ImmutableSet<Charset> f = ImmutableSet.m(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public static final AtomicBoolean g = new AtomicBoolean();
    public byte[] a;
    public int b;
    public int c;

    public xi90() {
        this.a = y2r0.b;
    }

    public static int c(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return ipx.u((byte) 0, hr80.q(((i & 7) << 2) | ((i2 & 48) >> 4)), hr80.q(((((byte) i2) & AmfConstants.TYPE_XML_DOCUMENT_MARKER) << 4) | ((b & 60) >> 2)), hr80.q(((b & 3) << 6) | (((byte) i4) & CharsetEncoder.DEFAULT_REPLACEMENT)));
    }

    public static int g(Charset charset) {
        fxc0.o(charset, "Unsupported charset: %s", f.contains(charset));
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean h(byte b) {
        return (b & 192) == 128;
    }

    public final String A(int i, Charset charset) {
        i(i);
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final int B() {
        return (C() << 21) | (C() << 14) | (C() << 7) | C();
    }

    public final int C() {
        i(1);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int D() {
        i(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.b = i + 4;
        return i4;
    }

    public final long E() {
        i(4);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r3] & 255) << 16) | ((bArr[r8] & 255) << 8);
        this.b = i + 4;
        return (bArr[r5] & 255) | j;
    }

    public final int F() {
        i(3);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public final int G() {
        int p = p();
        if (p >= 0) {
            return p;
        }
        throw new IllegalStateException(lhg.a(p, "Top bit not zero: "));
    }

    public final int H() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.b == this.c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long C = C();
            j |= (127 & C) << (i * 7);
            if ((C & 128) == 0) {
                break;
            }
        }
        return ipx.s(j);
    }

    public final long I() {
        long w = w();
        if (w >= 0) {
            return w;
        }
        throw new IllegalStateException(defpackage.k0.a(w, "Top bit not zero: "));
    }

    public final int J() {
        i(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public final long K() {
        int i;
        i(1);
        long j = this.a[this.b];
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                break;
            }
            if (((1 << i2) & j) != 0) {
                i2--;
            } else if (i2 < 6) {
                j &= r6 - 1;
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        i = 0;
        if (i == 0) {
            throw new NumberFormatException(defpackage.k0.a(j, "Invalid UTF-8 sequence first byte: "));
        }
        i(i);
        for (int i3 = 1; i3 < i; i3++) {
            if ((this.a[this.b + i3] & 192) != 128) {
                throw new NumberFormatException(defpackage.k0.a(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | (r4 & CharsetEncoder.DEFAULT_REPLACEMENT);
        }
        this.b += i;
        return j;
    }

    @Nullable
    public final Charset L() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i2 = this.b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.b = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void M(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        N(bArr, i);
    }

    public final void N(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void O(int i) {
        fxc0.p(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public final void P(int i) {
        fxc0.p(i >= 0 && i <= this.c);
        this.b = i;
    }

    public final void Q(int i) {
        P(this.b + i);
    }

    public final int a() {
        return Math.max(this.c - this.b, 0);
    }

    public final int b() {
        return this.a.length;
    }

    public final void d(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final byte[] e() {
        return this.a;
    }

    public final int f() {
        return this.b;
    }

    public final void i(int i) {
        if (!g.get() || a() >= i) {
            return;
        }
        StringBuilder b = ji.b(i, "bytesNeeded= ", ", bytesLeft=");
        b.append(a());
        throw new IndexOutOfBoundsException(b.toString());
    }

    public final char j(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        i(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.a;
            int i2 = this.b + i;
            b = bArr[i2];
            b2 = bArr[i2 + 1];
        } else {
            byte[] bArr2 = this.a;
            int i3 = this.b + i;
            b = bArr2[i3 + 1];
            b2 = bArr2[i3];
        }
        return (char) ((b << 8) | (b2 & 255));
    }

    public final int k(Charset charset) {
        int i;
        int i2;
        fxc0.o(charset, "Unsupported charset: %s", f.contains(charset));
        if (a() < g(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.b + ", limit=" + this.c);
        }
        int i3 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.a[this.b];
            if ((b & 128) != 0) {
                return 0;
            }
            i = b & 255;
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.a[this.b];
            int i4 = (b2 & 128) == 0 ? 1 : ((b2 & 224) == 192 && a() >= 2 && h(this.a[this.b + 1])) ? 2 : ((this.a[this.b] & 240) == 224 && a() >= 3 && h(this.a[this.b + 1]) && h(this.a[this.b + 2])) ? 3 : ((this.a[this.b] & 248) == 240 && a() >= 4 && h(this.a[this.b + 1]) && h(this.a[this.b + 2]) && h(this.a[this.b + 3])) ? 4 : 0;
            if (i4 == 1) {
                i2 = this.a[this.b] & 255;
            } else if (i4 == 2) {
                byte[] bArr = this.a;
                int i5 = this.b;
                i2 = c(0, 0, bArr[i5], bArr[i5 + 1]);
            } else if (i4 == 3) {
                byte[] bArr2 = this.a;
                int i6 = this.b;
                i2 = c(0, bArr2[i6] & AmfConstants.TYPE_XML_DOCUMENT_MARKER, bArr2[i6 + 1], bArr2[i6 + 2]);
            } else {
                if (i4 != 4) {
                    return 0;
                }
                byte[] bArr3 = this.a;
                int i7 = this.b;
                i2 = c(bArr3[i7], bArr3[i7 + 1], bArr3[i7 + 2], bArr3[i7 + 3]);
            }
            i3 = i4;
            i = i2;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char j = j(0, byteOrder);
            if (!Character.isHighSurrogate(j) || a() < 4) {
                i = j;
                i3 = 2;
            } else {
                i = Character.toCodePoint(j, j(2, byteOrder));
                i3 = 4;
            }
        }
        return (i << 8) | i3;
    }

    public final int l() {
        if (a() >= 4) {
            int p = p();
            this.b -= 4;
            return p;
        }
        throw new IndexOutOfBoundsException("position=" + this.b + ", limit=" + this.c);
    }

    public final int m() {
        i(1);
        return this.a[this.b] & 255;
    }

    public final void n(byte[] bArr, int i, int i2) {
        i(i2);
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final char o(Charset charset, char[] cArr) {
        int k;
        if (a() >= g(charset) && (k = k(charset)) != 0) {
            long j = k >>> 8;
            fxc0.n(j, "out of range: %s", (j >> 32) == 0);
            int i = (int) j;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c = (char) j2;
                fxc0.n(j2, "Out of range: %s", ((long) c) == j2);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.b = ipx.s(k & 255) + this.b;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int p() {
        i(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    @Nullable
    public final String q(Charset charset) {
        int i;
        fxc0.o(charset, "Unsupported charset: %s", f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            L();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && y2r0.O(this.a[i2])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.a;
                if (bArr[i2] == 0 && y2r0.O(bArr[i2 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.a;
                if (bArr2[i2 + 1] == 0 && y2r0.O(bArr2[i2])) {
                    break;
                }
            }
            i2 += i;
        }
        String A = A(i2 - this.b, charset);
        if (this.b != this.c && o(charset, d) == '\r') {
            o(charset, e);
        }
        return A;
    }

    public final int r() {
        i(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public final long s() {
        i(8);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r3] & 255) << 8) | ((bArr[r8] & 255) << 16);
        this.b = i + 4;
        long j2 = j | ((bArr[r5] & 255) << 24);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r8] & 255) << 32);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r5] & 255) << 40);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r8] & 255) << 48);
        this.b = i + 8;
        return ((bArr[r5] & 255) << 56) | j5;
    }

    public final long t() {
        i(4);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r3] & 255) << 8) | ((bArr[r8] & 255) << 16);
        this.b = i + 4;
        return ((bArr[r5] & 255) << 24) | j;
    }

    public final int u() {
        int r = r();
        if (r >= 0) {
            return r;
        }
        throw new IllegalStateException(lhg.a(r, "Top bit not zero: "));
    }

    public final int v() {
        i(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final long w() {
        i(8);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r3] & 255) << 48) | ((bArr[r8] & 255) << 40);
        this.b = i + 4;
        long j2 = j | ((bArr[r5] & 255) << 32);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r8] & 255) << 24);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r5] & 255) << 16);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r8] & 255) << 8);
        this.b = i + 8;
        return (bArr[r5] & 255) | j5;
    }

    @Nullable
    public final String x() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = y2r0.a;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str2;
    }

    public final String y(int i) {
        i(i);
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.a;
        String str = y2r0.a;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.b += i;
        return str2;
    }

    public final short z() {
        i(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public xi90(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public xi90(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public xi90(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }
}
