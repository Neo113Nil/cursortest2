package com.google.protobuf;

import com.google.protobuf.ByteString;
import defpackage.eac;
import defpackage.q791;
import defpackage.rqw;
import defpackage.w321;
import defpackage.z321;
import java.nio.ByteBuffer;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes11.dex */
public final class h extends eac {
    public final ByteBuffer d;
    public final long e;
    public long f;
    public long g;
    public final long h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public h(ByteBuffer byteBuffer, boolean z) {
        this.d = byteBuffer.duplicate();
        long j = z321.c.j(z321.g, byteBuffer);
        this.e = j;
        this.f = byteBuffer.limit() + j;
        long position = j + byteBuffer.position();
        this.g = position;
        this.h = position;
    }

    public static boolean E() {
        return z321.d;
    }

    @Override // defpackage.eac
    public final int A() {
        return H();
    }

    @Override // defpackage.eac
    public final long B() {
        return I();
    }

    @Override // defpackage.eac
    public final boolean C(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (((int) (this.f - this.g)) >= 10) {
                while (i3 < 10) {
                    long j = this.g;
                    this.g = j + 1;
                    if (z321.c.e(j) < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.h();
            }
            while (i3 < 10) {
                long j2 = this.g;
                if (j2 == this.f) {
                    throw InvalidProtocolBufferException.m();
                }
                this.g = j2 + 1;
                if (z321.c.e(j2) < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.h();
            return true;
        }
        if (i2 == 1) {
            L(8);
            return true;
        }
        if (i2 == 2) {
            L(H());
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
        L(4);
        return true;
    }

    public final int F() {
        long j = this.g;
        if (this.f - j < 4) {
            throw InvalidProtocolBufferException.m();
        }
        this.g = 4 + j;
        w321 w321Var = z321.c;
        return ((w321Var.e(j + 3) & 255) << 24) | (w321Var.e(j) & 255) | ((w321Var.e(1 + j) & 255) << 8) | ((w321Var.e(2 + j) & 255) << 16);
    }

    public final long G() {
        long j = this.g;
        if (this.f - j < 8) {
            throw InvalidProtocolBufferException.m();
        }
        this.g = 8 + j;
        w321 w321Var = z321.c;
        return ((w321Var.e(j + 7) & 255) << 56) | (w321Var.e(j) & 255) | ((w321Var.e(1 + j) & 255) << 8) | ((w321Var.e(2 + j) & 255) << 16) | ((w321Var.e(3 + j) & 255) << 24) | ((w321Var.e(4 + j) & 255) << 32) | ((w321Var.e(5 + j) & 255) << 40) | ((w321Var.e(6 + j) & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r4.e(r8) < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int H() {
        int i;
        long j = this.g;
        if (this.f != j) {
            long j2 = 1 + j;
            w321 w321Var = z321.c;
            byte e = w321Var.e(j);
            if (e >= 0) {
                this.g = j2;
                return e;
            }
            if (this.f - j2 >= 9) {
                long j3 = 2 + j;
                int e2 = (w321Var.e(j2) << 7) ^ e;
                if (e2 < 0) {
                    i = e2 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int e3 = e2 ^ (w321Var.e(j3) << PKIBody._CCR);
                    if (e3 >= 0) {
                        i = e3 ^ 16256;
                    } else {
                        j3 = j + 4;
                        int e4 = e3 ^ (w321Var.e(j4) << 21);
                        if (e4 < 0) {
                            i = (-2080896) ^ e4;
                        } else {
                            j4 = 5 + j;
                            byte e5 = w321Var.e(j3);
                            int i2 = (e4 ^ (e5 << DerValue.tag_UniversalString)) ^ 266354560;
                            if (e5 < 0) {
                                j3 = j + 6;
                                if (w321Var.e(j4) < 0) {
                                    j4 = 7 + j;
                                    if (w321Var.e(j3) < 0) {
                                        j3 = j + 8;
                                        if (w321Var.e(j4) < 0) {
                                            long j5 = 9 + j;
                                            if (w321Var.e(j3) < 0) {
                                                j3 = j + 10;
                                            } else {
                                                i = i2;
                                                j3 = j5;
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                    }
                    j3 = j4;
                }
                this.g = j3;
                return i;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j;
        long j2;
        long j3;
        int i;
        long j4 = this.g;
        if (this.f != j4) {
            long j5 = 1 + j4;
            w321 w321Var = z321.c;
            byte e = w321Var.e(j4);
            if (e >= 0) {
                this.g = j5;
                return e;
            }
            if (this.f - j5 >= 9) {
                long j6 = 2 + j4;
                int e2 = (w321Var.e(j5) << 7) ^ e;
                if (e2 >= 0) {
                    long j7 = 3 + j4;
                    int e3 = e2 ^ (w321Var.e(j6) << PKIBody._CCR);
                    if (e3 >= 0) {
                        j = e3 ^ 16256;
                    } else {
                        j6 = j4 + 4;
                        int e4 = e3 ^ (w321Var.e(j7) << 21);
                        if (e4 < 0) {
                            i = (-2080896) ^ e4;
                        } else {
                            j7 = 5 + j4;
                            long e5 = e4 ^ (w321Var.e(j6) << 28);
                            if (e5 < 0) {
                                long j8 = 6 + j4;
                                long e6 = e5 ^ (w321Var.e(j7) << 35);
                                if (e6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = 7 + j4;
                                    e5 = e6 ^ (w321Var.e(j8) << 42);
                                    if (e5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j8 = 8 + j4;
                                        e6 = e5 ^ (w321Var.e(j7) << 49);
                                        if (e6 >= 0) {
                                            long j9 = j4 + 9;
                                            long e7 = (e6 ^ (w321Var.e(j8) << 56)) ^ 71499008037633920L;
                                            if (e7 < 0) {
                                                long j10 = j4 + 10;
                                                if (w321Var.e(j9) >= 0) {
                                                    j6 = j10;
                                                    j = e7;
                                                }
                                            } else {
                                                j = e7;
                                                j6 = j9;
                                            }
                                            this.g = j6;
                                            return j;
                                        }
                                        j2 = -558586000294016L;
                                    }
                                }
                                j = j2 ^ e6;
                                j6 = j8;
                                this.g = j6;
                                return j;
                            }
                            j3 = 266354560;
                            j = j3 ^ e5;
                        }
                    }
                    j6 = j7;
                    this.g = j6;
                    return j;
                }
                i = e2 ^ (-128);
                j = i;
                this.g = j6;
                return j;
            }
        }
        return J();
    }

    public final long J() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            long j2 = this.g;
            if (j2 == this.f) {
                throw InvalidProtocolBufferException.m();
            }
            this.g = 1 + j2;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((z321.c.e(j2) & DerValue.TAG_CONTEXT) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.h();
    }

    public final void K() {
        long j = this.f + this.i;
        this.f = j;
        int i = (int) (j - this.h);
        int i2 = this.k;
        if (i <= i2) {
            this.i = 0;
            return;
        }
        int i3 = i - i2;
        this.i = i3;
        this.f = j - i3;
    }

    public final void L(int i) {
        if (i >= 0) {
            long j = this.f;
            long j2 = this.g;
            if (i <= ((int) (j - j2))) {
                this.g = j2 + i;
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
        if (this.j != i) {
            throw InvalidProtocolBufferException.b();
        }
    }

    @Override // defpackage.eac
    public final int d() {
        return (int) (this.g - this.h);
    }

    @Override // defpackage.eac
    public final boolean e() {
        return this.g == this.f;
    }

    @Override // defpackage.eac
    public final void h(int i) {
        this.k = i;
        K();
    }

    @Override // defpackage.eac
    public final int i(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.i();
        }
        int d = d() + i;
        int i2 = this.k;
        if (d > i2) {
            throw InvalidProtocolBufferException.m();
        }
        this.k = d;
        K();
        return i2;
    }

    @Override // defpackage.eac
    public final boolean j() {
        return I() != 0;
    }

    @Override // defpackage.eac
    public final ByteString k() {
        int H = H();
        if (H > 0) {
            long j = this.f;
            long j2 = this.g;
            if (H <= ((int) (j - j2))) {
                byte[] bArr = new byte[H];
                long j3 = H;
                z321.c.c(j2, bArr, j3);
                this.g += j3;
                ByteString byteString = ByteString.a;
                return new ByteString.LiteralByteString(bArr);
            }
        }
        if (H == 0) {
            return ByteString.a;
        }
        if (H < 0) {
            throw InvalidProtocolBufferException.i();
        }
        throw InvalidProtocolBufferException.m();
    }

    @Override // defpackage.eac
    public final double l() {
        return Double.longBitsToDouble(G());
    }

    @Override // defpackage.eac
    public final int m() {
        return H();
    }

    @Override // defpackage.eac
    public final int n() {
        return F();
    }

    @Override // defpackage.eac
    public final long o() {
        return G();
    }

    @Override // defpackage.eac
    public final float p() {
        return Float.intBitsToFloat(F());
    }

    @Override // defpackage.eac
    public final int q() {
        return H();
    }

    @Override // defpackage.eac
    public final long r() {
        return I();
    }

    @Override // defpackage.eac
    public final int t() {
        return F();
    }

    @Override // defpackage.eac
    public final long u() {
        return G();
    }

    @Override // defpackage.eac
    public final int v() {
        return eac.b(H());
    }

    @Override // defpackage.eac
    public final long w() {
        return eac.c(I());
    }

    @Override // defpackage.eac
    public final String x() {
        int H = H();
        if (H > 0) {
            long j = this.f;
            long j2 = this.g;
            if (H <= ((int) (j - j2))) {
                byte[] bArr = new byte[H];
                long j3 = H;
                z321.c.c(j2, bArr, j3);
                String str = new String(bArr, rqw.a);
                this.g += j3;
                return str;
            }
        }
        if (H == 0) {
            return "";
        }
        if (H < 0) {
            throw InvalidProtocolBufferException.i();
        }
        throw InvalidProtocolBufferException.m();
    }

    @Override // defpackage.eac
    public final String y() {
        int H = H();
        if (H > 0) {
            long j = this.f;
            long j2 = this.g;
            if (H <= ((int) (j - j2))) {
                int i = (int) (j2 - this.e);
                q791 q791Var = x.a;
                q791Var.getClass();
                ByteBuffer byteBuffer = this.d;
                String h = byteBuffer.hasArray() ? q791Var.h(byteBuffer.arrayOffset() + i, H, byteBuffer.array()) : byteBuffer.isDirect() ? q791Var.j(i, H, byteBuffer) : q791.i(i, H, byteBuffer);
                this.g += H;
                return h;
            }
        }
        if (H == 0) {
            return "";
        }
        if (H <= 0) {
            throw InvalidProtocolBufferException.i();
        }
        throw InvalidProtocolBufferException.m();
    }

    @Override // defpackage.eac
    public final int z() {
        if (e()) {
            this.j = 0;
            return 0;
        }
        int H = H();
        this.j = H;
        if ((H >>> 3) != 0) {
            return H;
        }
        throw InvalidProtocolBufferException.c();
    }
}
