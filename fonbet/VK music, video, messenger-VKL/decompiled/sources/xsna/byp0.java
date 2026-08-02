package xsna;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: UTF8JsonGenerator.java */
/* loaded from: classes12.dex */
public final class byp0 extends l9y {
    public static final byte[] u = amb.a(true);
    public static final byte[] v = amb.a(false);
    public static final byte[] w = {110, 117, 108, 108};
    public static final byte[] x = {116, 114, 117, 101};
    public static final byte[] y = {102, 97, 108, 115, 101};
    public final OutputStream l;
    public final byte m;
    public byte[] n;
    public int o;
    public final int p;
    public final int q;
    public char[] r;
    public final int s;
    public final boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byp0(tnv tnvVar, int i, ip70 ip70Var, OutputStream outputStream, char c) {
        super(tnvVar, i, ip70Var);
        im8 im8Var = tnvVar.e;
        this.l = outputStream;
        this.m = (byte) c;
        if (c != '\"') {
            this.f = amb.c(c);
        }
        this.t = true;
        tnv.a(tnvVar.h);
        int i2 = im8.c[1];
        i2 = i2 <= 0 ? 0 : i2;
        byte[] andSet = im8Var.a.getAndSet(1, null);
        andSet = (andSet == null || andSet.length < i2) ? new byte[i2] : andSet;
        tnvVar.h = andSet;
        this.n = andSet;
        int length = andSet.length;
        this.p = length;
        this.q = length >> 3;
        tnv.a(tnvVar.j);
        char[] a = im8Var.a(1, 0);
        tnvVar.j = a;
        this.r = a;
        this.s = a.length;
        if (I(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            this.g = 127;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void A(String str) throws IOException {
        P("write a string");
        if (str == null) {
            S();
            return;
        }
        int length = str.length();
        if (length > this.q) {
            X(str, true);
            return;
        }
        int i = this.o + length;
        int i2 = this.p;
        if (i >= i2) {
            L();
        }
        byte[] bArr = this.n;
        int i3 = this.o;
        this.o = i3 + 1;
        byte b = this.m;
        bArr[i3] = b;
        U(0, length, str);
        if (this.o >= i2) {
            L();
        }
        byte[] bArr2 = this.n;
        int i4 = this.o;
        this.o = i4 + 1;
        bArr2[i4] = b;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void E(char[] cArr, int i, int i2) throws IOException {
        P("write a string");
        int i3 = this.o;
        int i4 = this.p;
        if (i3 >= i4) {
            L();
        }
        byte[] bArr = this.n;
        int i5 = this.o;
        int i6 = i5 + 1;
        this.o = i6;
        byte b = this.m;
        bArr[i5] = b;
        int i7 = this.q;
        if (i2 <= i7) {
            if (i6 + i2 > i4) {
                L();
            }
            V(cArr, i, i2);
        } else {
            do {
                int min = Math.min(i7, i2);
                if (this.o + min > i4) {
                    L();
                }
                V(cArr, i, min);
                i += min;
                i2 -= min;
            } while (i2 > 0);
        }
        if (this.o >= i4) {
            L();
        }
        byte[] bArr2 = this.n;
        int i8 = this.o;
        this.o = i8 + 1;
        bArr2[i8] = b;
    }

    public final void L() throws IOException {
        int i = this.o;
        if (i > 0) {
            this.o = 0;
            this.l.write(this.n, 0, i);
        }
    }

    public final int N(int i, int i2) throws IOException {
        byte[] bArr = this.j ? u : v;
        byte[] bArr2 = this.n;
        if (i < 55296 || i > 57343) {
            bArr2[i2] = (byte) ((i >> 12) | 224);
            int i3 = i2 + 2;
            bArr2[i2 + 1] = (byte) (((i >> 6) & 63) | 128);
            int i4 = i2 + 3;
            bArr2[i3] = (byte) ((i & 63) | 128);
            return i4;
        }
        bArr2[i2] = 92;
        bArr2[i2 + 1] = 117;
        bArr2[i2 + 2] = bArr[(i >> 12) & 15];
        bArr2[i2 + 3] = bArr[(i >> 8) & 15];
        int i5 = i2 + 5;
        bArr2[i2 + 4] = bArr[(i >> 4) & 15];
        int i6 = i2 + 6;
        bArr2[i5] = bArr[i & 15];
        return i6;
    }

    public final int O(int i, int i2, char[] cArr, int i3) throws IOException {
        if (i < 55296 || i > 57343) {
            byte[] bArr = this.n;
            int i4 = this.o;
            int i5 = i4 + 1;
            this.o = i5;
            bArr[i4] = (byte) ((i >> 12) | 224);
            int i6 = i4 + 2;
            this.o = i6;
            bArr[i5] = (byte) (((i >> 6) & 63) | 128);
            this.o = i4 + 3;
            bArr[i6] = (byte) ((i & 63) | 128);
            return i2;
        }
        if (i2 >= i3 || cArr == null) {
            JsonGenerator.i(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i)));
            throw null;
        }
        char c = cArr[i2];
        if (c < 56320 || c > 57343) {
            JsonGenerator.i(String.format("Incomplete surrogate pair: first char 0x%04X, second 0x%04X", Integer.valueOf(i), Integer.valueOf(c)));
            throw null;
        }
        int i7 = (c - 56320) + ((i - 55296) << 10) + 65536;
        if (this.o + 4 > this.p) {
            L();
        }
        byte[] bArr2 = this.n;
        int i8 = this.o;
        int i9 = i8 + 1;
        this.o = i9;
        bArr2[i8] = (byte) ((i7 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
        int i10 = i8 + 2;
        this.o = i10;
        bArr2[i9] = (byte) (((i7 >> 12) & 63) | 128);
        int i11 = i8 + 3;
        this.o = i11;
        bArr2[i10] = (byte) (((i7 >> 6) & 63) | 128);
        this.o = i8 + 4;
        bArr2[i11] = (byte) ((i7 & 63) | 128);
        return i2 + 1;
    }

    public final void P(String str) throws IOException {
        byte b;
        int g = this.d.g();
        if (g == 1) {
            b = 44;
        } else {
            if (g != 2) {
                if (g != 3) {
                    if (g != 5) {
                        return;
                    }
                    J(str);
                    throw null;
                }
                jmi0 jmi0Var = this.h;
                if (jmi0Var != null) {
                    byte[] d = ((SerializedString) jmi0Var).d();
                    if (d.length > 0) {
                        int length = d.length;
                        if (this.o + length > this.p) {
                            L();
                            if (length > 512) {
                                this.l.write(d, 0, length);
                                return;
                            }
                        }
                        System.arraycopy(d, 0, this.n, this.o, length);
                        this.o += length;
                        return;
                    }
                    return;
                }
                return;
            }
            b = 58;
        }
        if (this.o >= this.p) {
            L();
        }
        byte[] bArr = this.n;
        int i = this.o;
        this.o = i + 1;
        bArr[i] = b;
    }

    public final int Q(int i, int i2) throws IOException {
        int i3;
        byte[] bArr = this.n;
        byte[] bArr2 = this.j ? u : v;
        bArr[i2] = 92;
        int i4 = i2 + 2;
        bArr[i2 + 1] = 117;
        if (i > 255) {
            int i5 = i >> 8;
            int i6 = i2 + 3;
            bArr[i4] = bArr2[(i5 & 255) >> 4];
            i3 = i2 + 4;
            bArr[i6] = bArr2[i5 & 15];
            i &= 255;
        } else {
            int i7 = i2 + 3;
            bArr[i4] = 48;
            i3 = i2 + 4;
            bArr[i7] = 48;
        }
        int i8 = i3 + 1;
        bArr[i3] = bArr2[i >> 4];
        int i9 = i3 + 2;
        bArr[i8] = bArr2[i & 15];
        return i9;
    }

    public final void S() throws IOException {
        if (this.o + 4 >= this.p) {
            L();
        }
        System.arraycopy(w, 0, this.n, this.o, 4);
        this.o += 4;
    }

    public final void T(String str) throws IOException {
        int i = this.o;
        int i2 = this.p;
        if (i >= i2) {
            L();
        }
        byte[] bArr = this.n;
        int i3 = this.o;
        this.o = i3 + 1;
        byte b = this.m;
        bArr[i3] = b;
        Y(str);
        if (this.o >= i2) {
            L();
        }
        byte[] bArr2 = this.n;
        int i4 = this.o;
        this.o = i4 + 1;
        bArr2[i4] = b;
    }

    public final void U(int i, int i2, String str) throws IOException {
        char charAt;
        int i3 = i2 + i;
        int i4 = this.o;
        byte[] bArr = this.n;
        int[] iArr = this.f;
        while (i < i3 && (charAt = str.charAt(i)) <= 127 && iArr[charAt] == 0) {
            bArr[i4] = (byte) charAt;
            i++;
            i4++;
        }
        this.o = i4;
        if (i < i3) {
            int i5 = this.g;
            int i6 = this.p;
            if (i5 == 0) {
                if (ir.b(i3, i, 6, i4) > i6) {
                    L();
                }
                int i7 = this.o;
                byte[] bArr2 = this.n;
                int[] iArr2 = this.f;
                while (i < i3) {
                    int i8 = i + 1;
                    char charAt2 = str.charAt(i);
                    if (charAt2 <= 127) {
                        int i9 = iArr2[charAt2];
                        if (i9 == 0) {
                            bArr2[i7] = (byte) charAt2;
                            i = i8;
                            i7++;
                        } else if (i9 > 0) {
                            int i10 = i7 + 1;
                            bArr2[i7] = 92;
                            i7 += 2;
                            bArr2[i10] = (byte) i9;
                        } else {
                            i7 = Q(charAt2, i7);
                        }
                    } else if (charAt2 <= 2047) {
                        int i11 = i7 + 1;
                        bArr2[i7] = (byte) ((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        i7 += 2;
                        bArr2[i11] = (byte) ((charAt2 & '?') | 128);
                    } else {
                        i7 = N(charAt2, i7);
                    }
                    i = i8;
                }
                this.o = i7;
                return;
            }
            if (ir.b(i3, i, 6, i4) > i6) {
                L();
            }
            int i12 = this.o;
            byte[] bArr3 = this.n;
            int[] iArr3 = this.f;
            int i13 = this.g;
            while (i < i3) {
                int i14 = i + 1;
                char charAt3 = str.charAt(i);
                if (charAt3 <= 127) {
                    int i15 = iArr3[charAt3];
                    if (i15 == 0) {
                        bArr3[i12] = (byte) charAt3;
                        i = i14;
                        i12++;
                    } else if (i15 > 0) {
                        int i16 = i12 + 1;
                        bArr3[i12] = 92;
                        i12 += 2;
                        bArr3[i16] = (byte) i15;
                    } else {
                        i12 = Q(charAt3, i12);
                    }
                } else if (charAt3 > i13) {
                    i12 = Q(charAt3, i12);
                } else if (charAt3 <= 2047) {
                    int i17 = i12 + 1;
                    bArr3[i12] = (byte) ((charAt3 >> 6) | PsExtractor.AUDIO_STREAM);
                    i12 += 2;
                    bArr3[i17] = (byte) ((charAt3 & '?') | 128);
                } else {
                    i12 = N(charAt3, i12);
                }
                i = i14;
            }
            this.o = i12;
        }
    }

    public final void V(char[] cArr, int i, int i2) throws IOException {
        char c;
        int i3 = i2 + i;
        int i4 = this.o;
        byte[] bArr = this.n;
        int[] iArr = this.f;
        while (i < i3 && (c = cArr[i]) <= 127 && iArr[c] == 0) {
            bArr[i4] = (byte) c;
            i++;
            i4++;
        }
        this.o = i4;
        if (i < i3) {
            int i5 = this.g;
            int i6 = this.p;
            if (i5 == 0) {
                if (ir.b(i3, i, 6, i4) > i6) {
                    L();
                }
                int i7 = this.o;
                byte[] bArr2 = this.n;
                int[] iArr2 = this.f;
                while (i < i3) {
                    int i8 = i + 1;
                    char c2 = cArr[i];
                    if (c2 <= 127) {
                        int i9 = iArr2[c2];
                        if (i9 == 0) {
                            bArr2[i7] = (byte) c2;
                            i = i8;
                            i7++;
                        } else if (i9 > 0) {
                            int i10 = i7 + 1;
                            bArr2[i7] = 92;
                            i7 += 2;
                            bArr2[i10] = (byte) i9;
                        } else {
                            i7 = Q(c2, i7);
                        }
                    } else if (c2 <= 2047) {
                        int i11 = i7 + 1;
                        bArr2[i7] = (byte) ((c2 >> 6) | PsExtractor.AUDIO_STREAM);
                        i7 += 2;
                        bArr2[i11] = (byte) ((c2 & '?') | 128);
                    } else {
                        i7 = N(c2, i7);
                    }
                    i = i8;
                }
                this.o = i7;
                return;
            }
            if (ir.b(i3, i, 6, i4) > i6) {
                L();
            }
            int i12 = this.o;
            byte[] bArr3 = this.n;
            int[] iArr3 = this.f;
            int i13 = this.g;
            while (i < i3) {
                int i14 = i + 1;
                char c3 = cArr[i];
                if (c3 <= 127) {
                    int i15 = iArr3[c3];
                    if (i15 == 0) {
                        bArr3[i12] = (byte) c3;
                        i = i14;
                        i12++;
                    } else if (i15 > 0) {
                        int i16 = i12 + 1;
                        bArr3[i12] = 92;
                        i12 += 2;
                        bArr3[i16] = (byte) i15;
                    } else {
                        i12 = Q(c3, i12);
                    }
                } else if (c3 > i13) {
                    i12 = Q(c3, i12);
                } else if (c3 <= 2047) {
                    int i17 = i12 + 1;
                    bArr3[i12] = (byte) ((c3 >> 6) | PsExtractor.AUDIO_STREAM);
                    i12 += 2;
                    bArr3[i17] = (byte) ((c3 & '?') | 128);
                } else {
                    i12 = N(c3, i12);
                }
                i = i14;
            }
            this.o = i12;
        }
    }

    public final void X(String str, boolean z) throws IOException {
        byte b = this.m;
        int i = this.p;
        if (z) {
            if (this.o >= i) {
                L();
            }
            byte[] bArr = this.n;
            int i2 = this.o;
            this.o = i2 + 1;
            bArr[i2] = b;
        }
        int length = str.length();
        int i3 = 0;
        while (length > 0) {
            int min = Math.min(this.q, length);
            if (this.o + min > i) {
                L();
            }
            U(i3, min, str);
            i3 += min;
            length -= min;
        }
        if (z) {
            if (this.o >= i) {
                L();
            }
            byte[] bArr2 = this.n;
            int i4 = this.o;
            this.o = i4 + 1;
            bArr2[i4] = b;
        }
    }

    public final void Y(String str) throws IOException {
        char c;
        int length = str.length();
        char[] cArr = this.r;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            a0(cArr, length);
            return;
        }
        int length2 = str.length();
        if (((length2 - length) | length) < 0) {
            JsonGenerator.i(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `String` of length %d", 0, Integer.valueOf(length), Integer.valueOf(length2)));
            throw null;
        }
        char[] cArr2 = this.r;
        int length3 = cArr2.length;
        if (length <= length3) {
            str.getChars(0, length, cArr2, 0);
            a0(cArr2, length);
            return;
        }
        int i = this.p;
        int min = Math.min(length3, (i >> 2) + (i >> 4));
        int i2 = min * 3;
        int i3 = 0;
        while (length > 0) {
            int min2 = Math.min(min, length);
            str.getChars(i3, i3 + min2, cArr2, 0);
            if (this.o + i2 > i) {
                L();
            }
            if (min2 > 1 && (c = cArr2[min2 - 1]) >= 55296 && c <= 56319) {
                min2--;
            }
            int i4 = 0;
            while (i4 < min2) {
                do {
                    char c2 = cArr2[i4];
                    if (c2 > 127) {
                        i4++;
                        if (c2 < 2048) {
                            byte[] bArr = this.n;
                            int i5 = this.o;
                            int i6 = i5 + 1;
                            this.o = i6;
                            bArr[i5] = (byte) ((c2 >> 6) | PsExtractor.AUDIO_STREAM);
                            this.o = i5 + 2;
                            bArr[i6] = (byte) ((c2 & '?') | 128);
                        } else {
                            i4 = O(c2, i4, cArr2, min2);
                        }
                    } else {
                        byte[] bArr2 = this.n;
                        int i7 = this.o;
                        this.o = i7 + 1;
                        bArr2[i7] = (byte) c2;
                        i4++;
                    }
                } while (i4 < min2);
                i3 += min2;
                length -= min2;
            }
            i3 += min2;
            length -= min2;
        }
    }

    public final void a0(char[] cArr, int i) throws IOException {
        if (cArr == null) {
            JsonGenerator.i("Invalid `char[]` argument: `null`");
            throw null;
        }
        int length = cArr.length;
        int i2 = 0;
        if (((length - i) | i) < 0) {
            JsonGenerator.i(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", 0, Integer.valueOf(i), Integer.valueOf(length)));
            throw null;
        }
        int i3 = i + i + i;
        int i4 = this.o + i3;
        int i5 = this.p;
        if (i4 > i5) {
            if (i5 < i3) {
                byte[] bArr = this.n;
                while (i2 < i) {
                    do {
                        char c = cArr[i2];
                        if (c >= 128) {
                            if (this.o + 3 >= i5) {
                                L();
                            }
                            int i6 = i2 + 1;
                            char c2 = cArr[i2];
                            if (c2 < 2048) {
                                int i7 = this.o;
                                int i8 = i7 + 1;
                                this.o = i8;
                                bArr[i7] = (byte) ((c2 >> 6) | PsExtractor.AUDIO_STREAM);
                                this.o = i7 + 2;
                                bArr[i8] = (byte) ((c2 & '?') | 128);
                            } else {
                                i6 = O(c2, i6, cArr, i);
                            }
                            i2 = i6;
                        } else {
                            if (this.o >= i5) {
                                L();
                            }
                            int i9 = this.o;
                            this.o = i9 + 1;
                            bArr[i9] = (byte) c;
                            i2++;
                        }
                    } while (i2 < i);
                    return;
                }
                return;
            }
            L();
        }
        while (i2 < i) {
            do {
                char c3 = cArr[i2];
                if (c3 > 127) {
                    i2++;
                    if (c3 < 2048) {
                        byte[] bArr2 = this.n;
                        int i10 = this.o;
                        int i11 = i10 + 1;
                        this.o = i11;
                        bArr2[i10] = (byte) ((c3 >> 6) | PsExtractor.AUDIO_STREAM);
                        this.o = i10 + 2;
                        bArr2[i11] = (byte) ((c3 & '?') | 128);
                    } else {
                        i2 = O(c3, i2, cArr, i);
                    }
                } else {
                    byte[] bArr3 = this.n;
                    int i12 = this.o;
                    this.o = i12 + 1;
                    bArr3[i12] = (byte) c3;
                    i2++;
                }
            } while (i2 < i);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0055  */
    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws IOException {
        try {
            if (this.n != null && I(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
                while (true) {
                    pby pbyVar = this.d;
                    if (!pbyVar.b()) {
                        if (!pbyVar.c()) {
                            break;
                        } else {
                            n();
                        }
                    } else {
                        m();
                    }
                }
            }
            L();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        this.o = 0;
        tnv tnvVar = this.e;
        OutputStream outputStream = this.l;
        if (outputStream != null) {
            try {
                if (!tnvVar.d && !I(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                    if (I(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                        outputStream.flush();
                    }
                }
                outputStream.close();
            } catch (IOException e2) {
                e = e2;
                if (e != null) {
                    e.addSuppressed(e);
                }
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                if (e != null) {
                }
                throw e;
            }
        }
        byte[] bArr = this.n;
        if (bArr != null && this.t) {
            this.n = null;
            byte[] bArr2 = tnvVar.h;
            if (bArr != bArr2 && bArr.length < bArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            tnvVar.h = null;
            tnvVar.e.a.set(1, bArr);
        }
        char[] cArr = this.r;
        if (cArr != null) {
            this.r = null;
            char[] cArr2 = tnvVar.j;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            tnvVar.j = null;
            tnvVar.e.b.set(1, cArr);
        }
        if (e != null) {
            throw e;
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        L();
        OutputStream outputStream = this.l;
        if (outputStream == null || !I(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        outputStream.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void k(boolean z) throws IOException {
        P("write a boolean value");
        if (this.o + 5 >= this.p) {
            L();
        }
        byte[] bArr = z ? x : y;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.n, this.o, length);
        this.o += length;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void m() throws IOException {
        if (!this.d.b()) {
            JsonGenerator.i("Current context not Array but ".concat(this.d.e()));
            throw null;
        }
        if (this.o >= this.p) {
            L();
        }
        byte[] bArr = this.n;
        int i = this.o;
        this.o = i + 1;
        bArr[i] = 93;
        this.d = this.d.d;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void n() throws IOException {
        if (!this.d.c()) {
            JsonGenerator.i("Current context not Object but ".concat(this.d.e()));
            throw null;
        }
        if (this.o >= this.p) {
            L();
        }
        byte[] bArr = this.n;
        int i = this.o;
        this.o = i + 1;
        bArr[i] = 125;
        this.d = this.d.d;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void o(String str) throws IOException {
        int f = this.d.f(str);
        if (f == 4) {
            JsonGenerator.i("Can not write a field name, expecting a value");
            throw null;
        }
        int i = this.p;
        if (f == 1) {
            if (this.o >= i) {
                L();
            }
            byte[] bArr = this.n;
            int i2 = this.o;
            this.o = i2 + 1;
            bArr[i2] = 44;
        }
        int i3 = 0;
        if (this.i) {
            X(str, false);
            return;
        }
        int length = str.length();
        if (length > this.s) {
            X(str, true);
            return;
        }
        if (this.o >= i) {
            L();
        }
        byte[] bArr2 = this.n;
        int i4 = this.o;
        int i5 = i4 + 1;
        this.o = i5;
        byte b = this.m;
        bArr2[i4] = b;
        int i6 = this.q;
        if (length <= i6) {
            if (i5 + length > i) {
                L();
            }
            U(0, length, str);
        } else {
            do {
                int min = Math.min(i6, length);
                if (this.o + min > i) {
                    L();
                }
                U(i3, min, str);
                i3 += min;
                length -= min;
            } while (length > 0);
        }
        if (this.o >= i) {
            L();
        }
        byte[] bArr3 = this.n;
        int i7 = this.o;
        this.o = i7 + 1;
        bArr3[i7] = b;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void p() throws IOException {
        P("write a null");
        S();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void q(double d) throws IOException {
        if (!this.c) {
            String str = fn70.a;
            if (Double.isFinite(d) || !JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.i(this.b)) {
                P("write a number");
                Y(fn70.k(d, I(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
                return;
            }
        }
        A(fn70.k(d, I(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void r(float f) throws IOException {
        if (!this.c) {
            String str = fn70.a;
            if (Float.isFinite(f) || !JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.i(this.b)) {
                P("write a number");
                Y(fn70.l(f, I(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
                return;
            }
        }
        A(fn70.l(f, I(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void s(int i) throws IOException {
        P("write a number");
        int i2 = this.o + 11;
        int i3 = this.p;
        if (i2 >= i3) {
            L();
        }
        if (!this.c) {
            this.o = fn70.g(i, this.o, this.n);
            return;
        }
        if (this.o + 13 >= i3) {
            L();
        }
        byte[] bArr = this.n;
        int i4 = this.o;
        int i5 = i4 + 1;
        this.o = i5;
        byte b = this.m;
        bArr[i4] = b;
        int g = fn70.g(i, i5, bArr);
        byte[] bArr2 = this.n;
        this.o = g + 1;
        bArr2[g] = b;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void t(long j) throws IOException {
        P("write a number");
        boolean z = this.c;
        int i = this.p;
        if (!z) {
            if (this.o + 21 >= i) {
                L();
            }
            this.o = fn70.i(this.o, this.n, j);
            return;
        }
        if (this.o + 23 >= i) {
            L();
        }
        byte[] bArr = this.n;
        int i2 = this.o;
        int i3 = i2 + 1;
        this.o = i3;
        byte b = this.m;
        bArr[i2] = b;
        int i4 = fn70.i(i3, bArr, j);
        byte[] bArr2 = this.n;
        this.o = i4 + 1;
        bArr2[i4] = b;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void v(BigDecimal bigDecimal) throws IOException {
        P("write a number");
        if (bigDecimal == null) {
            S();
        } else if (this.c) {
            T(H(bigDecimal));
        } else {
            Y(H(bigDecimal));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void w(BigInteger bigInteger) throws IOException {
        P("write a number");
        if (bigInteger == null) {
            S();
        } else if (this.c) {
            T(bigInteger.toString());
        } else {
            Y(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void y() throws IOException {
        P("start an array");
        pby pbyVar = this.d;
        pby pbyVar2 = pbyVar.f;
        if (pbyVar2 == null) {
            xno xnoVar = pbyVar.e;
            pbyVar2 = new pby(1, pbyVar, xnoVar != null ? new xno((Closeable) xnoVar.a) : null);
            pbyVar.f = pbyVar2;
        } else {
            pbyVar2.a = 1;
            pbyVar2.b = -1;
            pbyVar2.g = null;
            pbyVar2.h = false;
            xno xnoVar2 = pbyVar2.e;
            if (xnoVar2 != null) {
                xnoVar2.b = null;
                xnoVar2.c = null;
                xnoVar2.d = null;
            }
        }
        this.d = pbyVar2;
        if (this.o >= this.p) {
            L();
        }
        byte[] bArr = this.n;
        int i = this.o;
        this.o = i + 1;
        bArr[i] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void z() throws IOException {
        P("start an object");
        pby pbyVar = this.d;
        pby pbyVar2 = pbyVar.f;
        if (pbyVar2 == null) {
            xno xnoVar = pbyVar.e;
            pbyVar2 = new pby(2, pbyVar, xnoVar != null ? new xno((Closeable) xnoVar.a) : null);
            pbyVar.f = pbyVar2;
        } else {
            pbyVar2.a = 2;
            pbyVar2.b = -1;
            pbyVar2.g = null;
            pbyVar2.h = false;
            xno xnoVar2 = pbyVar2.e;
            if (xnoVar2 != null) {
                xnoVar2.b = null;
                xnoVar2.c = null;
                xnoVar2.d = null;
            }
        }
        this.d = pbyVar2;
        if (this.o >= this.p) {
            L();
        }
        byte[] bArr = this.n;
        int i = this.o;
        this.o = i + 1;
        bArr[i] = 123;
    }
}
