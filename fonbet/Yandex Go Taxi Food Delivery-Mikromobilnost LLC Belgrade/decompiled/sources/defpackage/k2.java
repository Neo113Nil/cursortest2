package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class k2 extends a3 {
    public static final q1 c = new q1(3, k2.class);
    public final byte[] a;
    public final int b;

    public k2(byte[] bArr) {
        if (r(bArr)) {
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

    public static k2 p(byte[] bArr) {
        return new k2(bArr);
    }

    public static boolean r(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || jtf0.b("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (a3Var instanceof k2) {
            return Arrays.equals(this.a, ((k2) a3Var).a);
        }
        return false;
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        return ffx.T(this.a);
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.Y(2, this.a, z);
    }

    @Override // defpackage.a3
    public final boolean j() {
        return false;
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        return g191.M(this.a.length, z);
    }

    public final boolean q(int i) {
        byte[] bArr = this.a;
        int length = bArr.length;
        int i2 = this.b;
        if (length - i2 > 4) {
            return false;
        }
        int length2 = bArr.length;
        int max = Math.max(i2, length2 - 4);
        int i3 = bArr[max];
        while (true) {
            max++;
            if (max >= length2) {
                break;
            }
            i3 = (i3 << 8) | (bArr[max] & 255);
        }
        return i3 == i;
    }

    public final String toString() {
        return new BigInteger(this.a).toString();
    }

    public k2(long j) {
        this.a = BigInteger.valueOf(j).toByteArray();
        this.b = 0;
    }
}
