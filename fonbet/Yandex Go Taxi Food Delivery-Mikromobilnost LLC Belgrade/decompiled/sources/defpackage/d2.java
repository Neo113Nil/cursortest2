package defpackage;

import java.util.Arrays;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public final class d2 extends a3 {
    public static final d2[] b = new d2[12];
    public final byte[] a;

    public d2(byte[] bArr, boolean z) {
        if (k2.r(bArr)) {
            ny61.g("malformed enumerated");
            throw null;
        }
        int i = 0;
        if ((bArr[0] & DerValue.TAG_CONTEXT) != 0) {
            ny61.g("enumerated must be non-negative");
            throw null;
        }
        this.a = z ? ffx.v(bArr) : bArr;
        int length = bArr.length - 1;
        while (i < length) {
            byte b2 = bArr[i];
            i++;
            if (b2 != (bArr[i] >> 7)) {
                return;
            }
        }
    }

    public static d2 p(byte[] bArr, boolean z) {
        if (bArr.length > 1) {
            return new d2(bArr, z);
        }
        if (bArr.length == 0) {
            ny61.g("ENUMERATED has zero length");
            return null;
        }
        int i = bArr[0] & 255;
        if (i >= 12) {
            return new d2(bArr, z);
        }
        d2[] d2VarArr = b;
        d2 d2Var = d2VarArr[i];
        if (d2Var != null) {
            return d2Var;
        }
        d2 d2Var2 = new d2(bArr, z);
        d2VarArr[i] = d2Var2;
        return d2Var2;
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (a3Var instanceof d2) {
            return Arrays.equals(this.a, ((d2) a3Var).a);
        }
        return false;
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        return ffx.T(this.a);
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.Y(10, this.a, z);
    }

    @Override // defpackage.a3
    public final boolean j() {
        return false;
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        return g191.M(this.a.length, z);
    }
}
