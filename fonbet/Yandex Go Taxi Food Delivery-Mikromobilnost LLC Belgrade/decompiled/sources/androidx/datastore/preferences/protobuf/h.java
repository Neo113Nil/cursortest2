package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import defpackage.a421;
import defpackage.mx11;
import defpackage.ny61;
import defpackage.tom0;
import defpackage.xt10;

/* loaded from: classes.dex */
public final class h extends i {
    public final byte[] d;
    public final int e;
    public int f;
    public final mx11 g;

    public h(mx11 mx11Var, int i) {
        if (i < 0) {
            ny61.g("bufferSize must be >= 0");
            throw null;
        }
        int max = Math.max(i, 20);
        this.d = new byte[max];
        this.e = max;
        this.g = mx11Var;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void A(int i) {
        J(5);
        G(i);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void B(int i, long j) {
        J(20);
        F(i, 0);
        H(j);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void C(long j) {
        J(10);
        H(j);
    }

    public final void D(int i) {
        int i2 = this.f;
        int i3 = i2 + 1;
        this.f = i3;
        byte[] bArr = this.d;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void E(long j) {
        int i = this.f;
        int i2 = i + 1;
        this.f = i2;
        byte[] bArr = this.d;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void F(int i, int i2) {
        G((i << 3) | i2);
    }

    public final void G(int i) {
        boolean z = i.c;
        byte[] bArr = this.d;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f;
                if (i2 == 0) {
                    this.f = i3 + 1;
                    a421.j(bArr, i3, (byte) i);
                    return;
                } else {
                    this.f = i3 + 1;
                    a421.j(bArr, i3, (byte) ((i | 128) & 255));
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
                    bArr[i5] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                }
            }
        }
    }

    public final void H(long j) {
        boolean z = i.c;
        byte[] bArr = this.d;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f;
                if (j2 == 0) {
                    this.f = i + 1;
                    a421.j(bArr, i, (byte) j);
                    return;
                } else {
                    this.f = i + 1;
                    a421.j(bArr, i, (byte) ((((int) j) | 128) & 255));
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
                    bArr[i2] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                }
            }
        }
    }

    public final void I() {
        this.g.write(this.d, 0, this.f);
        this.f = 0;
    }

    public final void J(int i) {
        if (this.e - this.f < i) {
            I();
        }
    }

    public final void K(byte[] bArr, int i, int i2) {
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
        I();
        if (i7 > i4) {
            this.g.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f = i7;
        }
    }

    @Override // defpackage.l77
    public final void a(int i, int i2, byte[] bArr) {
        K(bArr, i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void h(byte b) {
        if (this.f == this.e) {
            I();
        }
        int i = this.f;
        this.f = i + 1;
        this.d[i] = b;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void i(int i, boolean z) {
        J(11);
        F(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f;
        this.f = i2 + 1;
        this.d[i2] = b;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void j(int i, byte[] bArr) {
        A(i);
        K(bArr, 0, i);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void k(int i, ByteString byteString) {
        y(i, 2);
        l(byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void l(ByteString byteString) {
        A(byteString.size());
        ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
        a(literalByteString.j(), literalByteString.size(), literalByteString.bytes);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void m(int i, int i2) {
        J(14);
        F(i, 5);
        D(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void n(int i) {
        J(4);
        D(i);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void o(int i, long j) {
        J(18);
        F(i, 1);
        E(j);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void p(long j) {
        J(8);
        E(j);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void q(int i, int i2) {
        J(20);
        F(i, 0);
        if (i2 >= 0) {
            G(i2);
        } else {
            H(i2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void r(int i) {
        if (i >= 0) {
            A(i);
        } else {
            C(i);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void s(int i, xt10 xt10Var, tom0 tom0Var) {
        y(i, 2);
        A(((a) xt10Var).c(tom0Var));
        tom0Var.h(xt10Var, this.a);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void t(xt10 xt10Var) {
        A(((GeneratedMessageLite) xt10Var).c(null));
        ((GeneratedMessageLite) xt10Var).n(this);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void u(int i, xt10 xt10Var) {
        y(1, 3);
        z(2, i);
        y(3, 2);
        t(xt10Var);
        y(1, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void v(int i, ByteString byteString) {
        y(1, 3);
        z(2, i);
        k(3, byteString);
        y(1, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void w(int i, String str) {
        y(i, 2);
        x(str);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void x(String str) {
        try {
            int length = str.length() * 3;
            int e = i.e(length);
            int i = e + length;
            int i2 = this.e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int D = u.a.D(0, length, str, bArr);
                A(D);
                K(bArr, 0, D);
                return;
            }
            if (i > i2 - this.f) {
                I();
            }
            int e2 = i.e(str.length());
            int i3 = this.f;
            byte[] bArr2 = this.d;
            try {
                try {
                    if (e2 == e) {
                        int i4 = i3 + e2;
                        this.f = i4;
                        int D2 = u.a.D(i4, i2 - i4, str, bArr2);
                        this.f = i3;
                        G((D2 - i3) - e2);
                        this.f = D2;
                    } else {
                        int a = u.a(str);
                        G(a);
                        this.f = u.a.D(this.f, a, str, bArr2);
                    }
                } catch (Utf8$UnpairedSurrogateException e3) {
                    this.f = i3;
                    throw e3;
                }
            } catch (ArrayIndexOutOfBoundsException e4) {
                throw new CodedOutputStream$OutOfSpaceException(e4);
            }
        } catch (Utf8$UnpairedSurrogateException e5) {
            g(str, e5);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void y(int i, int i2) {
        A((i << 3) | i2);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void z(int i, int i2) {
        J(20);
        F(i, 0);
        G(i2);
    }
}
