package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import defpackage.dac;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tqw;
import defpackage.yv4;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes.dex */
public final class e extends yv4 {
    public final FileInputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public e(FileInputStream fileInputStream) {
        Charset charset = tqw.a;
        this.c = fileInputStream;
        this.d = new byte[4096];
        this.e = 0;
        this.g = 0;
        this.i = 0;
    }

    @Override // defpackage.yv4
    public final long A() {
        return J();
    }

    @Override // defpackage.yv4
    public final boolean B(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                N(8);
                return true;
            }
            if (i2 == 2) {
                N(I());
                return true;
            }
            if (i2 == 3) {
                C();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            N(4);
            return true;
        }
        int i4 = this.e - this.g;
        byte[] bArr = this.d;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.g;
                this.g = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.f();
        }
        while (i3 < 10) {
            if (this.g == this.e) {
                M(1);
            }
            int i6 = this.g;
            this.g = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw InvalidProtocolBufferException.f();
        return true;
    }

    public final byte[] D(int i) {
        byte[] E = E(i);
        if (E != null) {
            return E;
        }
        int i2 = this.g;
        int i3 = this.e;
        int i4 = i3 - i2;
        this.i += i3;
        this.g = 0;
        this.e = 0;
        ArrayList F = F(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, i2, bArr, 0, i4);
        Iterator it = F.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] E(int i) {
        if (i == 0) {
            return tqw.b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.j;
        if (i4 > i5) {
            N((i5 - i2) - i3);
            throw InvalidProtocolBufferException.j();
        }
        int i6 = this.e - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.c;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.h();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, this.g, bArr, 0, i6);
        this.i += this.e;
        this.g = 0;
        this.e = 0;
        while (i6 < i) {
            try {
                int read = fileInputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw InvalidProtocolBufferException.j();
                }
                this.i += read;
                i6 += read;
            } catch (InvalidProtocolBufferException e2) {
                e2.h();
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList F(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.c.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw InvalidProtocolBufferException.j();
                }
                this.i += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int G() {
        int i = this.g;
        if (this.e - i < 4) {
            M(4);
            i = this.g;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long H() {
        int i = this.g;
        if (this.e - i < 8) {
            M(8);
            i = this.g;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int I() {
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << PKIBody._CCR) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << DerValue.tag_UniversalString)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.g = i5;
                return i;
            }
        }
        return (int) K();
    }

    public final long J() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.g;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << PKIBody._CCR) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.g = i4;
                return j;
            }
        }
        return K();
    }

    public final long K() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.g == this.e) {
                M(1);
            }
            int i2 = this.g;
            this.g = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.d[i2] & DerValue.TAG_CONTEXT) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.f();
    }

    public final void L() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = this.i + i;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    public final void M(int i) {
        if (O(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.i) - this.g) {
            throw InvalidProtocolBufferException.j();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void N(int i) {
        int i2 = this.e;
        int i3 = this.g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.g = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.c;
        if (i < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int i5 = this.i;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.j;
        if (i7 > i8) {
            N((i8 - i5) - i3);
            throw InvalidProtocolBufferException.j();
        }
        this.i = i6;
        this.e = 0;
        this.g = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long skip = fileInputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.h();
                    throw e;
                }
            } catch (Throwable th) {
                this.i += i4;
                L();
                throw th;
            }
        }
        this.i += i4;
        L();
        if (i4 >= i) {
            return;
        }
        int i9 = this.e;
        int i10 = i9 - this.g;
        this.g = i9;
        M(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.e;
            if (i11 <= i12) {
                this.g = i11;
                return;
            } else {
                i10 += i12;
                this.g = i12;
                M(1);
            }
        }
    }

    public final boolean O(int i) {
        FileInputStream fileInputStream = this.c;
        int i2 = this.g;
        int i3 = i2 + i;
        int i4 = this.e;
        if (i3 <= i4) {
            ny61.r(oyr.j(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.i;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.j) {
            byte[] bArr = this.d;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.i += i2;
                this.e -= i2;
                this.g = 0;
            }
            int i6 = this.e;
            try {
                int read = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.i) - i6));
                if (read == 0 || read < -1 || read > bArr.length) {
                    dac.d(read, fileInputStream.getClass());
                    return false;
                }
                if (read > 0) {
                    this.e += read;
                    L();
                    if (this.e >= i) {
                        return true;
                    }
                    return O(i);
                }
            } catch (InvalidProtocolBufferException e) {
                e.h();
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.yv4
    public final void a(int i) {
        if (this.h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.yv4
    public final int d() {
        return this.i + this.g;
    }

    @Override // defpackage.yv4
    public final boolean e() {
        return this.g == this.e && !O(1);
    }

    @Override // defpackage.yv4
    public final void g(int i) {
        this.j = i;
        L();
    }

    @Override // defpackage.yv4
    public final int h(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int i2 = this.i + this.g + i;
        if (i2 < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i3 = this.j;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.j();
        }
        this.j = i2;
        L();
        return i3;
    }

    @Override // defpackage.yv4
    public final boolean i() {
        return J() != 0;
    }

    @Override // defpackage.yv4
    public final ByteString j() {
        int I = I();
        int i = this.e;
        int i2 = this.g;
        int i3 = i - i2;
        byte[] bArr = this.d;
        if (I <= i3 && I > 0) {
            ByteString f = ByteString.f(i2, I, bArr);
            this.g += I;
            return f;
        }
        if (I == 0) {
            return ByteString.a;
        }
        if (I < 0) {
            throw InvalidProtocolBufferException.g();
        }
        byte[] E = E(I);
        if (E != null) {
            return ByteString.f(0, E.length, E);
        }
        int i4 = this.g;
        int i5 = this.e;
        int i6 = i5 - i4;
        this.i += i5;
        this.g = 0;
        this.e = 0;
        ArrayList F = F(I - i6);
        byte[] bArr2 = new byte[I];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        Iterator it = F.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        ByteString byteString = ByteString.a;
        return new ByteString.LiteralByteString(bArr2);
    }

    @Override // defpackage.yv4
    public final double l() {
        return Double.longBitsToDouble(H());
    }

    @Override // defpackage.yv4
    public final int m() {
        return I();
    }

    @Override // defpackage.yv4
    public final int n() {
        return G();
    }

    @Override // defpackage.yv4
    public final long o() {
        return H();
    }

    @Override // defpackage.yv4
    public final float p() {
        return Float.intBitsToFloat(G());
    }

    @Override // defpackage.yv4
    public final int q() {
        return I();
    }

    @Override // defpackage.yv4
    public final long r() {
        return J();
    }

    @Override // defpackage.yv4
    public final int s() {
        return G();
    }

    @Override // defpackage.yv4
    public final long t() {
        return H();
    }

    @Override // defpackage.yv4
    public final int u() {
        int I = I();
        return (-(I & 1)) ^ (I >>> 1);
    }

    @Override // defpackage.yv4
    public final long v() {
        long J = J();
        return (-(J & 1)) ^ (J >>> 1);
    }

    @Override // defpackage.yv4
    public final String w() {
        int I = I();
        byte[] bArr = this.d;
        if (I > 0) {
            int i = this.e;
            int i2 = this.g;
            if (I <= i - i2) {
                String str = new String(bArr, i2, I, tqw.a);
                this.g += I;
                return str;
            }
        }
        if (I == 0) {
            return "";
        }
        if (I < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (I > this.e) {
            return new String(D(I), tqw.a);
        }
        M(I);
        String str2 = new String(bArr, this.g, I, tqw.a);
        this.g += I;
        return str2;
    }

    @Override // defpackage.yv4
    public final String x() {
        int I = I();
        int i = this.g;
        int i2 = this.e;
        int i3 = i2 - i;
        byte[] bArr = this.d;
        if (I <= i3 && I > 0) {
            this.g = i + I;
        } else {
            if (I == 0) {
                return "";
            }
            if (I < 0) {
                throw InvalidProtocolBufferException.g();
            }
            i = 0;
            if (I <= i2) {
                M(I);
                this.g = I;
            } else {
                bArr = D(I);
            }
        }
        return u.a.B(i, I, bArr);
    }

    @Override // defpackage.yv4
    public final int y() {
        if (e()) {
            this.h = 0;
            return 0;
        }
        int I = I();
        this.h = I;
        if ((I >>> 3) != 0) {
            return I;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.yv4
    public final int z() {
        return I();
    }
}
