package com.google.protobuf;

import com.google.protobuf.ByteString;
import defpackage.eac;
import defpackage.rqw;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes.dex */
public final class f extends eac {
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public f(byte[] bArr, int i, int i2, boolean z) {
        this.d = bArr;
        this.e = i2 + i;
        this.g = i;
        this.h = i;
    }

    @Override // defpackage.eac
    public final int A() {
        return G();
    }

    @Override // defpackage.eac
    public final long B() {
        return H();
    }

    @Override // defpackage.eac
    public final boolean C(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                K(8);
                return true;
            }
            if (i2 == 2) {
                K(G());
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
            K(4);
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
            throw InvalidProtocolBufferException.h();
        }
        while (i3 < 10) {
            int i6 = this.g;
            if (i6 == this.e) {
                throw InvalidProtocolBufferException.m();
            }
            this.g = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw InvalidProtocolBufferException.h();
        return true;
    }

    public final int E() {
        int i = this.g;
        if (this.e - i < 4) {
            throw InvalidProtocolBufferException.m();
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long F() {
        int i = this.g;
        if (this.e - i < 8) {
            throw InvalidProtocolBufferException.m();
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int G() {
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
        return (int) I();
    }

    public final long H() {
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
        return I();
    }

    public final long I() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.g;
            if (i2 == this.e) {
                throw InvalidProtocolBufferException.m();
            }
            this.g = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.d[i2] & DerValue.TAG_CONTEXT) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.h();
    }

    public final void J() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = i - this.h;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    public final void K(int i) {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3) {
                this.g = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw InvalidProtocolBufferException.m();
        }
        throw InvalidProtocolBufferException.i();
    }

    @Override // defpackage.eac
    public final void a(int i) {
        if (this.i != i) {
            throw InvalidProtocolBufferException.b();
        }
    }

    @Override // defpackage.eac
    public final int d() {
        return this.g - this.h;
    }

    @Override // defpackage.eac
    public final boolean e() {
        return this.g == this.e;
    }

    @Override // defpackage.eac
    public final void h(int i) {
        this.j = i;
        J();
    }

    @Override // defpackage.eac
    public final int i(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.i();
        }
        int d = d() + i;
        if (d < 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i2 = this.j;
        if (d > i2) {
            throw InvalidProtocolBufferException.m();
        }
        this.j = d;
        J();
        return i2;
    }

    @Override // defpackage.eac
    public final boolean j() {
        return H() != 0;
    }

    @Override // defpackage.eac
    public final ByteString k() {
        byte[] bArr;
        int G = G();
        byte[] bArr2 = this.d;
        if (G > 0) {
            int i = this.e;
            int i2 = this.g;
            if (G <= i - i2) {
                ByteString f = ByteString.f(i2, G, bArr2);
                this.g += G;
                return f;
            }
        }
        if (G == 0) {
            return ByteString.a;
        }
        if (G > 0) {
            int i3 = this.e;
            int i4 = this.g;
            if (G <= i3 - i4) {
                int i5 = G + i4;
                this.g = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                ByteString byteString = ByteString.a;
                return new ByteString.LiteralByteString(bArr);
            }
        }
        if (G > 0) {
            throw InvalidProtocolBufferException.m();
        }
        if (G != 0) {
            throw InvalidProtocolBufferException.i();
        }
        bArr = rqw.b;
        ByteString byteString2 = ByteString.a;
        return new ByteString.LiteralByteString(bArr);
    }

    @Override // defpackage.eac
    public final double l() {
        return Double.longBitsToDouble(F());
    }

    @Override // defpackage.eac
    public final int m() {
        return G();
    }

    @Override // defpackage.eac
    public final int n() {
        return E();
    }

    @Override // defpackage.eac
    public final long o() {
        return F();
    }

    @Override // defpackage.eac
    public final float p() {
        return Float.intBitsToFloat(E());
    }

    @Override // defpackage.eac
    public final int q() {
        return G();
    }

    @Override // defpackage.eac
    public final long r() {
        return H();
    }

    @Override // defpackage.eac
    public final int t() {
        return E();
    }

    @Override // defpackage.eac
    public final long u() {
        return F();
    }

    @Override // defpackage.eac
    public final int v() {
        return eac.b(G());
    }

    @Override // defpackage.eac
    public final long w() {
        return eac.c(H());
    }

    @Override // defpackage.eac
    public final String x() {
        int G = G();
        if (G > 0) {
            int i = this.e;
            int i2 = this.g;
            if (G <= i - i2) {
                String str = new String(this.d, i2, G, rqw.a);
                this.g += G;
                return str;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G < 0) {
            throw InvalidProtocolBufferException.i();
        }
        throw InvalidProtocolBufferException.m();
    }

    @Override // defpackage.eac
    public final String y() {
        int G = G();
        if (G > 0) {
            int i = this.e;
            int i2 = this.g;
            if (G <= i - i2) {
                String h = x.a.h(i2, G, this.d);
                this.g += G;
                return h;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G <= 0) {
            throw InvalidProtocolBufferException.i();
        }
        throw InvalidProtocolBufferException.m();
    }

    @Override // defpackage.eac
    public final int z() {
        if (e()) {
            this.i = 0;
            return 0;
        }
        int G = G();
        this.i = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        throw InvalidProtocolBufferException.c();
    }
}
