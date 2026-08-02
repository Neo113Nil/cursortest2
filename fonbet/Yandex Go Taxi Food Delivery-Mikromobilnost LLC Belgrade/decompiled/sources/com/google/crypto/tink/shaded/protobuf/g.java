package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import defpackage.j77;
import defpackage.kbs;
import defpackage.qqw;
import defpackage.rom0;
import defpackage.t3y;
import defpackage.vt10;
import defpackage.y321;
import java.util.logging.Logger;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public final class g extends j77 {
    public static final Logger e = Logger.getLogger(g.class.getName());
    public static final boolean f = y321.e;
    public h a;
    public final byte[] b;
    public final int c;
    public int d;

    public g(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            kbs.o("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
            throw null;
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int a(int i, ByteString byteString) {
        return b(byteString) + i(i);
    }

    public static int b(ByteString byteString) {
        int size = byteString.size();
        return j(size) + size;
    }

    public static int c(int i) {
        return i(i) + 4;
    }

    public static int d(int i) {
        return i(i) + 8;
    }

    public static int e(int i, vt10 vt10Var, rom0 rom0Var) {
        return ((a) vt10Var).b(rom0Var) + (i(i) * 2);
    }

    public static int f(int i) {
        if (i >= 0) {
            return j(i);
        }
        return 10;
    }

    public static int g(t3y t3yVar) {
        int length = t3yVar.b != null ? ((ByteString.LiteralByteString) t3yVar.b).bytes.length : t3yVar.a != null ? ((GeneratedMessageLite) t3yVar.a).b(null) : 0;
        return j(length) + length;
    }

    public static int h(String str) {
        int length;
        try {
            length = u.b(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(qqw.a).length;
        }
        return j(length) + length;
    }

    public static int i(int i) {
        return j(i << 3);
    }

    public static int j(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int k(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public final void l(byte b) {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void m(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i2)), e2);
        }
    }

    public final void n(int i, int i2) {
        s(i, 5);
        o(i2);
    }

    public final void o(int i) {
        try {
            byte[] bArr = this.b;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.d = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.d = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.d = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void p(int i, long j) {
        s(i, 1);
        q(j);
    }

    public final void q(long j) {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.d = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.d = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.d = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.d = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void r(int i) {
        if (i >= 0) {
            t(i);
        } else {
            v(i);
        }
    }

    public final void s(int i, int i2) {
        t((i << 3) | i2);
    }

    public final void t(int i) {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.d;
            byte[] bArr = this.b;
            if (i2 == 0) {
                this.d = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.d = i3 + 1;
                    bArr[i3] = (byte) ((i & HProv.PP_VERSION_TIMESTAMP) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void u(int i, long j) {
        s(i, 0);
        v(j);
    }

    public final void v(long j) {
        boolean z = f;
        int i = this.c;
        byte[] bArr = this.b;
        if (!z || i - this.d < 10) {
            while (true) {
                long j2 = j & (-128);
                int i2 = this.d;
                if (j2 == 0) {
                    this.d = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    try {
                        this.d = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) & HProv.PP_VERSION_TIMESTAMP) | 128);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2);
                    }
                }
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = this.d;
            if (j3 == 0) {
                this.d = i3 + 1;
                y321.k(bArr, i3, (byte) j);
                return;
            } else {
                this.d = i3 + 1;
                y321.k(bArr, i3, (byte) ((((int) j) & HProv.PP_VERSION_TIMESTAMP) | 128));
                j >>>= 7;
            }
        }
    }
}
