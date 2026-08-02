package com.google.protobuf;

import defpackage.ny61;
import defpackage.oyr;
import defpackage.wt10;
import defpackage.z321;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j extends l {
    public final byte[] d;
    public final int e;
    public int f;

    public j(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            Locale locale = Locale.US;
            ny61.g(oyr.h(bArr.length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.d = bArr;
        this.f = 0;
        this.e = i;
    }

    public final int A() {
        return this.e - this.f;
    }

    @Override // defpackage.k77
    public final void a(int i, int i2, byte[] bArr) {
        try {
            System.arraycopy(bArr, i, this.d, this.f, i2);
            this.f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(this.f, this.e, i2, e);
        }
    }

    @Override // com.google.protobuf.l
    public final void j(byte b) {
        int i = this.f;
        try {
            int i2 = i + 1;
            try {
                this.d[i] = b;
                this.f = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new CodedOutputStream$OutOfSpaceException(i, this.e, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // com.google.protobuf.l
    public final void k(int i, boolean z) {
        v(i, 0);
        j(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.l
    public final void l(int i, ByteString byteString) {
        v(i, 2);
        x(byteString.size());
        byteString.s(this);
    }

    @Override // com.google.protobuf.l
    public final void m(int i, int i2) {
        v(i, 5);
        n(i2);
    }

    @Override // com.google.protobuf.l
    public final void n(int i) {
        int i2 = this.f;
        try {
            byte[] bArr = this.d;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(i2, this.e, 4, e);
        }
    }

    @Override // com.google.protobuf.l
    public final void o(int i, long j) {
        v(i, 1);
        p(j);
    }

    @Override // com.google.protobuf.l
    public final void p(long j) {
        int i = this.f;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(i, this.e, 8, e);
        }
    }

    @Override // com.google.protobuf.l
    public final void q(int i, int i2) {
        v(i, 0);
        r(i2);
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
        int i2 = this.f;
        try {
            int g = l.g(str.length() * 3);
            int g2 = l.g(str.length());
            byte[] bArr = this.d;
            if (g2 != g) {
                x(x.b(str));
                this.f = x.a.k(this.f, A(), str, bArr);
                return;
            }
            int i3 = i2 + g2;
            this.f = i3;
            int k = x.a.k(i3, A(), str, bArr);
            this.f = i2;
            x((k - i2) - g2);
            this.f = k;
        } catch (Utf8$UnpairedSurrogateException e) {
            this.f = i2;
            i(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(e2);
        }
    }

    @Override // com.google.protobuf.l
    public final void v(int i, int i2) {
        x((i << 3) | i2);
    }

    @Override // com.google.protobuf.l
    public final void w(int i, int i2) {
        v(i, 0);
        x(i2);
    }

    @Override // com.google.protobuf.l
    public final void x(int i) {
        int i2;
        int i3 = this.f;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.d;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(i2, this.e, 1, e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(i2, this.e, 1, e);
        }
    }

    @Override // com.google.protobuf.l
    public final void y(int i, long j) {
        v(i, 0);
        z(j);
    }

    @Override // com.google.protobuf.l
    public final void z(long j) {
        int i;
        int i2 = this.f;
        boolean z = l.c;
        byte[] bArr = this.d;
        if (!z || A() < 10) {
            while ((j & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(i, this.e, 1, e);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while ((j & (-128)) != 0) {
                z321.k(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            z321.k(bArr, i2, (byte) j);
        }
        this.f = i;
    }
}
