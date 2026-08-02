package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import defpackage.a421;
import defpackage.kbs;
import defpackage.tom0;
import defpackage.xt10;

/* loaded from: classes10.dex */
public final class g extends i {
    public final byte[] d;
    public final int e;
    public int f;

    public g(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            kbs.o("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
            throw null;
        }
        this.d = bArr;
        this.f = 0;
        this.e = i;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void A(int i) {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.f;
            byte[] bArr = this.d;
            if (i2 == 0) {
                this.f = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.f = i3 + 1;
                    bArr[i3] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void B(int i, long j) {
        y(i, 0);
        C(j);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void C(long j) {
        boolean z = i.c;
        int i = this.e;
        byte[] bArr = this.d;
        if (!z || i - this.f < 10) {
            while (true) {
                long j2 = j & (-128);
                int i2 = this.f;
                if (j2 == 0) {
                    this.f = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    try {
                        this.f = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) | 128) & 255);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(i), 1), e);
                    }
                }
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(i), 1), e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = this.f;
            if (j3 == 0) {
                this.f = i3 + 1;
                a421.j(bArr, i3, (byte) j);
                return;
            } else {
                this.f = i3 + 1;
                a421.j(bArr, i3, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
        }
    }

    public final void D(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.d, this.f, i2);
            this.f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
        }
    }

    @Override // defpackage.l77
    public final void a(int i, int i2, byte[] bArr) {
        D(bArr, i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void h(byte b) {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            this.f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void i(int i, boolean z) {
        y(i, 0);
        h(z ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void j(int i, byte[] bArr) {
        A(i);
        D(bArr, 0, i);
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
        y(i, 5);
        n(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void n(int i) {
        try {
            byte[] bArr = this.d;
            int i2 = this.f;
            int i3 = i2 + 1;
            this.f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void o(int i, long j) {
        y(i, 1);
        p(j);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void p(long j) {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            int i2 = i + 1;
            this.f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
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
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void q(int i, int i2) {
        y(i, 0);
        r(i2);
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
        int i = this.f;
        try {
            int e = i.e(str.length() * 3);
            int e2 = i.e(str.length());
            int i2 = this.e;
            byte[] bArr = this.d;
            if (e2 != e) {
                A(u.a(str));
                int i3 = this.f;
                this.f = u.a.D(i3, i2 - i3, str, bArr);
                return;
            }
            int i4 = i + e2;
            this.f = i4;
            int D = u.a.D(i4, i2 - i4, str, bArr);
            this.f = i;
            A((D - i) - e2);
            this.f = D;
        } catch (Utf8$UnpairedSurrogateException e3) {
            this.f = i;
            g(str, e3);
        } catch (IndexOutOfBoundsException e4) {
            throw new CodedOutputStream$OutOfSpaceException(e4);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void y(int i, int i2) {
        A((i << 3) | i2);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void z(int i, int i2) {
        y(i, 0);
        A(i2);
    }
}
