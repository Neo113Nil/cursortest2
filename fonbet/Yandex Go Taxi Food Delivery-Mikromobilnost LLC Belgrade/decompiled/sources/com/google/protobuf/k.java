package com.google.protobuf;

import defpackage.ny61;
import defpackage.wt10;
import defpackage.z321;
import java.io.OutputStream;

/* loaded from: classes11.dex */
public final class k extends l {
    public final byte[] d;
    public final int e;
    public int f;
    public final OutputStream g;

    public k(OutputStream outputStream, int i) {
        if (i < 0) {
            ny61.g("bufferSize must be >= 0");
            throw null;
        }
        int max = Math.max(i, 20);
        this.d = new byte[max];
        this.e = max;
        if (outputStream != null) {
            this.g = outputStream;
        } else {
            ny61.t("out");
            throw null;
        }
    }

    public final void A(int i) {
        int i2 = this.f;
        byte[] bArr = this.d;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f = i2 + 4;
    }

    public final void B(long j) {
        int i = this.f;
        byte[] bArr = this.d;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.f = i + 8;
    }

    public final void C(int i, int i2) {
        D((i << 3) | i2);
    }

    public final void D(int i) {
        boolean z = l.c;
        byte[] bArr = this.d;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f;
                if (i2 == 0) {
                    this.f = i3 + 1;
                    z321.k(bArr, i3, (byte) i);
                    return;
                } else {
                    this.f = i3 + 1;
                    z321.k(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f;
                if (i4 == 0) {
                    this.f = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    public final void E(long j) {
        boolean z = l.c;
        byte[] bArr = this.d;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f;
                if (j2 == 0) {
                    this.f = i + 1;
                    z321.k(bArr, i, (byte) j);
                    return;
                } else {
                    this.f = i + 1;
                    z321.k(bArr, i, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.f;
                if (j3 == 0) {
                    this.f = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.f = i2 + 1;
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void F() {
        this.g.write(this.d, 0, this.f);
        this.f = 0;
    }

    public final void G() {
        if (this.f > 0) {
            F();
        }
    }

    public final void H(int i) {
        if (this.e - this.f < i) {
            F();
        }
    }

    public final void I(byte[] bArr, int i, int i2) {
        int i3 = this.f;
        int i4 = this.e;
        int i5 = i4 - i3;
        byte[] bArr2 = this.d;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f = i4;
        F();
        if (i7 > i4) {
            this.g.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f = i7;
        }
    }

    @Override // defpackage.k77
    public final void a(int i, int i2, byte[] bArr) {
        I(bArr, i, i2);
    }

    @Override // com.google.protobuf.l
    public final void j(byte b) {
        if (this.f == this.e) {
            F();
        }
        int i = this.f;
        this.d[i] = b;
        this.f = i + 1;
    }

    @Override // com.google.protobuf.l
    public final void k(int i, boolean z) {
        H(11);
        C(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f;
        this.d[i2] = b;
        this.f = i2 + 1;
    }

    @Override // com.google.protobuf.l
    public final void l(int i, ByteString byteString) {
        v(i, 2);
        x(byteString.size());
        byteString.s(this);
    }

    @Override // com.google.protobuf.l
    public final void m(int i, int i2) {
        H(14);
        C(i, 5);
        A(i2);
    }

    @Override // com.google.protobuf.l
    public final void n(int i) {
        H(4);
        A(i);
    }

    @Override // com.google.protobuf.l
    public final void o(int i, long j) {
        H(18);
        C(i, 1);
        B(j);
    }

    @Override // com.google.protobuf.l
    public final void p(long j) {
        H(8);
        B(j);
    }

    @Override // com.google.protobuf.l
    public final void q(int i, int i2) {
        H(20);
        C(i, 0);
        if (i2 >= 0) {
            D(i2);
        } else {
            E(i2);
        }
    }

    @Override // com.google.protobuf.l
    public final void r(int i) {
        if (i >= 0) {
            x(i);
        } else {
            z(i);
        }
    }

    @Override // com.google.protobuf.l
    public final void s(int i, wt10 wt10Var) {
        v(1, 3);
        w(2, i);
        v(3, 2);
        x(wt10Var.getSerializedSize());
        wt10Var.writeTo(this);
        v(1, 4);
    }

    @Override // com.google.protobuf.l
    public final void t(int i, ByteString byteString) {
        v(1, 3);
        w(2, i);
        l(3, byteString);
        v(1, 4);
    }

    @Override // com.google.protobuf.l
    public final void u(int i, String str) {
        v(i, 2);
        try {
            int length = str.length() * 3;
            int g = l.g(length);
            int i2 = g + length;
            int i3 = this.e;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int k = x.a.k(0, length, str, bArr);
                x(k);
                I(bArr, 0, k);
                return;
            }
            if (i2 > i3 - this.f) {
                F();
            }
            int g2 = l.g(str.length());
            int i4 = this.f;
            byte[] bArr2 = this.d;
            try {
                try {
                    if (g2 != g) {
                        int b = x.b(str);
                        D(b);
                        this.f = x.a.k(this.f, b, str, bArr2);
                        return;
                    }
                    int i5 = i4 + g2;
                    this.f = i5;
                    int k2 = x.a.k(i5, i3 - i5, str, bArr2);
                    this.f = i4;
                    D((k2 - i4) - g2);
                    this.f = k2;
                } catch (Utf8$UnpairedSurrogateException e) {
                    this.f = i4;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException(e2);
            }
        } catch (Utf8$UnpairedSurrogateException e3) {
            i(str, e3);
        }
    }

    @Override // com.google.protobuf.l
    public final void v(int i, int i2) {
        x((i << 3) | i2);
    }

    @Override // com.google.protobuf.l
    public final void w(int i, int i2) {
        H(20);
        C(i, 0);
        D(i2);
    }

    @Override // com.google.protobuf.l
    public final void x(int i) {
        H(5);
        D(i);
    }

    @Override // com.google.protobuf.l
    public final void y(int i, long j) {
        H(20);
        C(i, 0);
        E(j);
    }

    @Override // com.google.protobuf.l
    public final void z(long j) {
        H(10);
        E(j);
    }
}
