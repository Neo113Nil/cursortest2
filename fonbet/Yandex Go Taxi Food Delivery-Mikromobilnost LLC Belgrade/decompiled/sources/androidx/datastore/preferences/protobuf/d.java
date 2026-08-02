package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import defpackage.tqw;
import defpackage.yv4;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes.dex */
public final class d extends yv4 {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int h;
    public int i = Integer.MAX_VALUE;

    public d(byte[] bArr, int i, int i2, boolean z) {
        this.c = bArr;
        this.d = i2 + i;
        this.f = i;
        this.g = i;
    }

    @Override // defpackage.yv4
    public final long A() {
        return G();
    }

    @Override // defpackage.yv4
    public final boolean B(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                J(8);
                return true;
            }
            if (i2 == 2) {
                J(F());
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
            J(4);
            return true;
        }
        int i4 = this.d - this.f;
        byte[] bArr = this.c;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f;
                this.f = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.f();
        }
        while (i3 < 10) {
            int i6 = this.f;
            if (i6 == this.d) {
                throw InvalidProtocolBufferException.j();
            }
            this.f = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw InvalidProtocolBufferException.f();
        return true;
    }

    public final int D() {
        int i = this.f;
        if (this.d - i < 4) {
            throw InvalidProtocolBufferException.j();
        }
        this.f = i + 4;
        byte[] bArr = this.c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long E() {
        int i = this.f;
        if (this.d - i < 8) {
            throw InvalidProtocolBufferException.j();
        }
        this.f = i + 8;
        byte[] bArr = this.c;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int F() {
        int i;
        int i2 = this.f;
        int i3 = this.d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f = i4;
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
                this.f = i5;
                return i;
            }
        }
        return (int) H();
    }

    public final long G() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f;
        int i2 = this.d;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.c;
            byte b = bArr[i];
            if (b >= 0) {
                this.f = i3;
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
                this.f = i4;
                return j;
            }
        }
        return H();
    }

    public final long H() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 == this.d) {
                throw InvalidProtocolBufferException.j();
            }
            this.f = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.c[i2] & DerValue.TAG_CONTEXT) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.f();
    }

    public final void I() {
        int i = this.d + this.e;
        this.d = i;
        int i2 = i - this.g;
        int i3 = this.i;
        if (i2 <= i3) {
            this.e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.e = i4;
        this.d = i - i4;
    }

    public final void J(int i) {
        if (i >= 0) {
            int i2 = this.d;
            int i3 = this.f;
            if (i <= i2 - i3) {
                this.f = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw InvalidProtocolBufferException.j();
        }
        throw InvalidProtocolBufferException.g();
    }

    @Override // defpackage.yv4
    public final void a(int i) {
        if (this.h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.yv4
    public final int d() {
        return this.f - this.g;
    }

    @Override // defpackage.yv4
    public final boolean e() {
        return this.f == this.d;
    }

    @Override // defpackage.yv4
    public final void g(int i) {
        this.i = i;
        I();
    }

    @Override // defpackage.yv4
    public final int h(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int d = d() + i;
        if (d < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i2 = this.i;
        if (d > i2) {
            throw InvalidProtocolBufferException.j();
        }
        this.i = d;
        I();
        return i2;
    }

    @Override // defpackage.yv4
    public final boolean i() {
        return G() != 0;
    }

    @Override // defpackage.yv4
    public final ByteString j() {
        byte[] bArr;
        int F = F();
        byte[] bArr2 = this.c;
        if (F > 0) {
            int i = this.d;
            int i2 = this.f;
            if (F <= i - i2) {
                ByteString f = ByteString.f(i2, F, bArr2);
                this.f += F;
                return f;
            }
        }
        if (F == 0) {
            return ByteString.a;
        }
        if (F > 0) {
            int i3 = this.d;
            int i4 = this.f;
            if (F <= i3 - i4) {
                int i5 = F + i4;
                this.f = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                ByteString byteString = ByteString.a;
                return new ByteString.LiteralByteString(bArr);
            }
        }
        if (F > 0) {
            throw InvalidProtocolBufferException.j();
        }
        if (F != 0) {
            throw InvalidProtocolBufferException.g();
        }
        bArr = tqw.b;
        ByteString byteString2 = ByteString.a;
        return new ByteString.LiteralByteString(bArr);
    }

    @Override // defpackage.yv4
    public final double l() {
        return Double.longBitsToDouble(E());
    }

    @Override // defpackage.yv4
    public final int m() {
        return F();
    }

    @Override // defpackage.yv4
    public final int n() {
        return D();
    }

    @Override // defpackage.yv4
    public final long o() {
        return E();
    }

    @Override // defpackage.yv4
    public final float p() {
        return Float.intBitsToFloat(D());
    }

    @Override // defpackage.yv4
    public final int q() {
        return F();
    }

    @Override // defpackage.yv4
    public final long r() {
        return G();
    }

    @Override // defpackage.yv4
    public final int s() {
        return D();
    }

    @Override // defpackage.yv4
    public final long t() {
        return E();
    }

    @Override // defpackage.yv4
    public final int u() {
        int F = F();
        return (-(F & 1)) ^ (F >>> 1);
    }

    @Override // defpackage.yv4
    public final long v() {
        long G = G();
        return (-(G & 1)) ^ (G >>> 1);
    }

    @Override // defpackage.yv4
    public final String w() {
        int F = F();
        if (F > 0) {
            int i = this.d;
            int i2 = this.f;
            if (F <= i - i2) {
                String str = new String(this.c, i2, F, tqw.a);
                this.f += F;
                return str;
            }
        }
        if (F == 0) {
            return "";
        }
        if (F < 0) {
            throw InvalidProtocolBufferException.g();
        }
        throw InvalidProtocolBufferException.j();
    }

    @Override // defpackage.yv4
    public final String x() {
        int F = F();
        if (F > 0) {
            int i = this.d;
            int i2 = this.f;
            if (F <= i - i2) {
                String B = u.a.B(i2, F, this.c);
                this.f += F;
                return B;
            }
        }
        if (F == 0) {
            return "";
        }
        if (F <= 0) {
            throw InvalidProtocolBufferException.g();
        }
        throw InvalidProtocolBufferException.j();
    }

    @Override // defpackage.yv4
    public final int y() {
        if (e()) {
            this.h = 0;
            return 0;
        }
        int F = F();
        this.h = F;
        if ((F >>> 3) != 0) {
            return F;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.yv4
    public final int z() {
        return F();
    }
}
