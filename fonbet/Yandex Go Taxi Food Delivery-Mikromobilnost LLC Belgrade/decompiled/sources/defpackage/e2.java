package defpackage;

import java.math.BigInteger;
import java.util.Arrays;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public final class e2 extends b3 {
    public static final p1 c = new p1(3, e2.class);
    public static final e2[] w = new e2[12];
    public final byte[] a;
    public final int b;

    public e2(byte[] bArr, boolean z) {
        if (l2.B(bArr)) {
            ny61.g("malformed enumerated");
            throw null;
        }
        int i = 0;
        if ((bArr[0] & DerValue.TAG_CONTEXT) != 0) {
            ny61.g("enumerated must be non-negative");
            throw null;
        }
        this.a = z ? rza1.b(bArr) : bArr;
        int length = bArr.length - 1;
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

    public static e2 u(byte[] bArr, boolean z) {
        if (bArr.length > 1) {
            return new e2(bArr, z);
        }
        if (bArr.length == 0) {
            ny61.g("ENUMERATED has zero length");
            return null;
        }
        int i = bArr[0] & 255;
        if (i >= 12) {
            return new e2(bArr, z);
        }
        e2[] e2VarArr = w;
        e2 e2Var = e2VarArr[i];
        if (e2Var != null) {
            return e2Var;
        }
        e2 e2Var2 = new e2(bArr, z);
        e2VarArr[i] = e2Var2;
        return e2Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e2 x(a2 a2Var) {
        if (a2Var == 0 || (a2Var instanceof e2)) {
            return (e2) a2Var;
        }
        if (!(a2Var instanceof byte[])) {
            ny61.g("illegal object in getInstance: ".concat(a2Var.getClass().getName()));
            return null;
        }
        try {
            return (e2) c.Eg((byte[]) a2Var);
        } catch (Exception e) {
            xfo.l(e);
            return null;
        }
    }

    @Override // defpackage.b3, defpackage.o2
    public final int hashCode() {
        return rza1.e(this.a);
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        if (b3Var instanceof e2) {
            return Arrays.equals(this.a, ((e2) b3Var).a);
        }
        return false;
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.I(10, this.a, z);
    }

    @Override // defpackage.b3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        return ryh.w(this.a.length, z);
    }

    public final BigInteger y() {
        return new BigInteger(this.a);
    }

    public final int z() {
        byte[] bArr = this.a;
        int length = bArr.length;
        int i = this.b;
        if (length - i <= 4) {
            return l2.z(i, bArr);
        }
        w511.w("ASN.1 Enumerated out of int range");
        return 0;
    }

    public e2(int i) {
        if (i < 0) {
            ny61.g("enumerated must be non-negative");
            throw null;
        }
        this.a = BigInteger.valueOf(i).toByteArray();
        this.b = 0;
    }
}
