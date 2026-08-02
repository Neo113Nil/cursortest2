package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class l2 extends b3 {
    public static final p1 c = new p1(9, l2.class);
    public final byte[] a;
    public final int b;

    public l2(byte[] bArr) {
        if (B(bArr)) {
            ny61.g("malformed integer");
            throw null;
        }
        this.a = bArr;
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            } else {
                i = i2;
            }
        }
        this.b = i;
    }

    public static boolean B(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || ltf0.b("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    public static l2 u(Object obj) {
        if (obj == null || (obj instanceof l2)) {
            return (l2) obj;
        }
        if (!(obj instanceof byte[])) {
            ny61.g(qv10.n(obj, "illegal object in getInstance: "));
            return null;
        }
        try {
            return (l2) c.Eg((byte[]) obj);
        } catch (Exception e) {
            xfo.l(e);
            return null;
        }
    }

    public static int z(int i, byte[] bArr) {
        int length = bArr.length;
        int max = Math.max(i, length - 4);
        int i2 = bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return i2;
            }
            i2 = (i2 << 8) | (bArr[max] & 255);
        }
    }

    public final int A() {
        byte[] bArr = this.a;
        int length = bArr.length;
        int i = this.b;
        if (length - i <= 4) {
            return z(i, bArr);
        }
        w511.w("ASN.1 Integer out of int range");
        return 0;
    }

    @Override // defpackage.b3, defpackage.o2
    public final int hashCode() {
        return rza1.e(this.a);
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        if (b3Var instanceof l2) {
            return Arrays.equals(this.a, ((l2) b3Var).a);
        }
        return false;
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.I(2, this.a, z);
    }

    @Override // defpackage.b3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        return ryh.w(this.a.length, z);
    }

    public final String toString() {
        return x().toString();
    }

    public final BigInteger x() {
        return new BigInteger(this.a);
    }

    public final boolean y(int i) {
        byte[] bArr = this.a;
        int length = bArr.length;
        int i2 = this.b;
        return length - i2 <= 4 && z(i2, bArr) == i;
    }

    public l2(BigInteger bigInteger) {
        this.a = bigInteger.toByteArray();
        this.b = 0;
    }

    public l2(long j) {
        this.a = BigInteger.valueOf(j).toByteArray();
        this.b = 0;
    }
}
