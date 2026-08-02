package com.google.protobuf;

import com.google.protobuf.ByteString;
import defpackage.dac;
import defpackage.eac;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.rqw;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes11.dex */
public final class g extends eac {
    public final InputStream d;
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public g(InputStream inputStream) {
        rqw.a(inputStream, "input");
        this.d = inputStream;
        this.e = new byte[4096];
        this.f = 0;
        this.h = 0;
        this.j = 0;
    }

    @Override // defpackage.eac
    public final int A() {
        return J();
    }

    @Override // defpackage.eac
    public final long B() {
        return K();
    }

    @Override // defpackage.eac
    public final boolean C(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                O(8);
                return true;
            }
            if (i2 == 2) {
                O(J());
                return true;
            }
            if (i2 == 3) {
                D();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.b == 0) {
                    a(0);
                }
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.g();
            }
            O(4);
            return true;
        }
        int i4 = this.f - this.h;
        byte[] bArr = this.e;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.h;
                this.h = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.h();
        }
        while (i3 < 10) {
            if (this.h == this.f) {
                N(1);
            }
            int i6 = this.h;
            this.h = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw InvalidProtocolBufferException.h();
        return true;
    }

    public final byte[] E(int i) {
        byte[] F = F(i);
        if (F != null) {
            return F;
        }
        int i2 = this.h;
        int i3 = this.f;
        int i4 = i3 - i2;
        this.j += i3;
        this.h = 0;
        this.f = 0;
        ArrayList G = G(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, i4);
        Iterator it = G.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] F(int i) {
        if (i == 0) {
            return rqw.b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.i();
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.k;
        if (i4 > i5) {
            O((i5 - i2) - i3);
            throw InvalidProtocolBufferException.m();
        }
        int i6 = this.f - i3;
        int i7 = i - i6;
        InputStream inputStream = this.d;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.k();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, this.h, bArr, 0, i6);
        this.j += this.f;
        this.h = 0;
        this.f = 0;
        while (i6 < i) {
            try {
                int read = inputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw InvalidProtocolBufferException.m();
                }
                this.j += read;
                i6 += read;
            } catch (InvalidProtocolBufferException e2) {
                e2.k();
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList G(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.d.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw InvalidProtocolBufferException.m();
                }
                this.j += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int H() {
        int i = this.h;
        if (this.f - i < 4) {
            N(4);
            i = this.h;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long I() {
        int i = this.h;
        if (this.f - i < 8) {
            N(8);
            i = this.h;
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int J() {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
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
                this.h = i5;
                return i;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.h;
        int i2 = this.f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.e;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
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
                this.h = i4;
                return j;
            }
        }
        return L();
    }

    public final long L() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.h == this.f) {
                N(1);
            }
            int i2 = this.h;
            this.h = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.e[i2] & DerValue.TAG_CONTEXT) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.h();
    }

    public final void M() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = this.j + i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g = i4;
        this.f = i - i4;
    }

    public final void N(int i) {
        if (P(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.j) - this.h) {
            throw InvalidProtocolBufferException.m();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final void O(int i) {
        int i2 = this.f;
        int i3 = this.h;
        if (i <= i2 - i3 && i >= 0) {
            this.h = i3 + i;
            return;
        }
        InputStream inputStream = this.d;
        if (i < 0) {
            throw InvalidProtocolBufferException.i();
        }
        int i4 = this.j;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.k;
        if (i6 > i7) {
            O((i7 - i4) - i3);
            throw InvalidProtocolBufferException.m();
        }
        this.j = i5;
        int i8 = i2 - i3;
        this.f = 0;
        this.h = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long skip = inputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i8 += (int) skip;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.k();
                    throw e;
                }
            } catch (Throwable th) {
                this.j += i8;
                M();
                throw th;
            }
        }
        this.j += i8;
        M();
        if (i8 >= i) {
            return;
        }
        int i9 = this.f;
        int i10 = i9 - this.h;
        this.h = i9;
        N(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f;
            if (i11 <= i12) {
                this.h = i11;
                return;
            } else {
                i10 += i12;
                this.h = i12;
                N(1);
            }
        }
    }

    public final boolean P(int i) {
        InputStream inputStream = this.d;
        int i2 = this.h;
        int i3 = i2 + i;
        int i4 = this.f;
        if (i3 <= i4) {
            ny61.r(oyr.j(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.j;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.k) {
            byte[] bArr = this.e;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.j += i2;
                this.f -= i2;
                this.h = 0;
            }
            int i6 = this.f;
            try {
                int read = inputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.j) - i6));
                if (read == 0 || read < -1 || read > bArr.length) {
                    dac.d(read, inputStream.getClass());
                    return false;
                }
                if (read > 0) {
                    this.f += read;
                    M();
                    if (this.f >= i || P(i)) {
                        return true;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                e.k();
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.eac
    public final void a(int i) {
        if (this.i != i) {
            throw InvalidProtocolBufferException.b();
        }
    }

    @Override // defpackage.eac
    public final int d() {
        return this.j + this.h;
    }

    @Override // defpackage.eac
    public final boolean e() {
        return this.h == this.f && !P(1);
    }

    @Override // defpackage.eac
    public final void h(int i) {
        this.k = i;
        M();
    }

    @Override // defpackage.eac
    public final int i(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.i();
        }
        int i2 = this.j + this.h + i;
        if (i2 < 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.k;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.m();
        }
        this.k = i2;
        M();
        return i3;
    }

    @Override // defpackage.eac
    public final boolean j() {
        return K() != 0;
    }

    @Override // defpackage.eac
    public final ByteString k() {
        int J = J();
        int i = this.f;
        int i2 = this.h;
        int i3 = i - i2;
        byte[] bArr = this.e;
        if (J <= i3 && J > 0) {
            ByteString f = ByteString.f(i2, J, bArr);
            this.h += J;
            return f;
        }
        if (J == 0) {
            return ByteString.a;
        }
        if (J < 0) {
            throw InvalidProtocolBufferException.i();
        }
        byte[] F = F(J);
        if (F != null) {
            return ByteString.f(0, F.length, F);
        }
        int i4 = this.h;
        int i5 = this.f;
        int i6 = i5 - i4;
        this.j += i5;
        this.h = 0;
        this.f = 0;
        ArrayList G = G(J - i6);
        byte[] bArr2 = new byte[J];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        Iterator it = G.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        ByteString byteString = ByteString.a;
        return new ByteString.LiteralByteString(bArr2);
    }

    @Override // defpackage.eac
    public final double l() {
        return Double.longBitsToDouble(I());
    }

    @Override // defpackage.eac
    public final int m() {
        return J();
    }

    @Override // defpackage.eac
    public final int n() {
        return H();
    }

    @Override // defpackage.eac
    public final long o() {
        return I();
    }

    @Override // defpackage.eac
    public final float p() {
        return Float.intBitsToFloat(H());
    }

    @Override // defpackage.eac
    public final int q() {
        return J();
    }

    @Override // defpackage.eac
    public final long r() {
        return K();
    }

    @Override // defpackage.eac
    public final int t() {
        return H();
    }

    @Override // defpackage.eac
    public final long u() {
        return I();
    }

    @Override // defpackage.eac
    public final int v() {
        return eac.b(J());
    }

    @Override // defpackage.eac
    public final long w() {
        return eac.c(K());
    }

    @Override // defpackage.eac
    public final String x() {
        int J = J();
        byte[] bArr = this.e;
        if (J > 0) {
            int i = this.f;
            int i2 = this.h;
            if (J <= i - i2) {
                String str = new String(bArr, i2, J, rqw.a);
                this.h += J;
                return str;
            }
        }
        if (J == 0) {
            return "";
        }
        if (J < 0) {
            throw InvalidProtocolBufferException.i();
        }
        if (J > this.f) {
            return new String(E(J), rqw.a);
        }
        N(J);
        String str2 = new String(bArr, this.h, J, rqw.a);
        this.h += J;
        return str2;
    }

    @Override // defpackage.eac
    public final String y() {
        int J = J();
        int i = this.h;
        int i2 = this.f;
        int i3 = i2 - i;
        byte[] bArr = this.e;
        if (J <= i3 && J > 0) {
            this.h = i + J;
        } else {
            if (J == 0) {
                return "";
            }
            if (J < 0) {
                throw InvalidProtocolBufferException.i();
            }
            i = 0;
            if (J <= i2) {
                N(J);
                this.h = J;
            } else {
                bArr = E(J);
            }
        }
        return x.a.h(i, J, bArr);
    }

    @Override // defpackage.eac
    public final int z() {
        if (e()) {
            this.i = 0;
            return 0;
        }
        int J = J();
        this.i = J;
        if ((J >>> 3) != 0) {
            return J;
        }
        throw InvalidProtocolBufferException.c();
    }
}
