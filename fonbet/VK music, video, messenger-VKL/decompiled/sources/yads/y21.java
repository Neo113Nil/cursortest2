package yads;

import java.io.EOFException;

/* loaded from: classes10.dex */
public final class y21 {
    public final kc2 a = new kc2(10);

    public final ut1 a(ld0 ld0Var, u21 u21Var) {
        ut1 ut1Var = null;
        int i = 0;
        while (true) {
            try {
                ld0Var.b(this.a.a, 0, 10, false);
                this.a.e(0);
                if (this.a.o() != 4801587) {
                    break;
                }
                kc2 kc2Var = this.a;
                kc2Var.e(kc2Var.b + 3);
                int l = this.a.l();
                int i2 = l + 10;
                if (ut1Var == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    ld0Var.b(bArr, 10, l, false);
                    ut1Var = new w21(u21Var).a(i2, bArr);
                } else {
                    ld0Var.a(false, l);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        ld0Var.f = 0;
        ld0Var.a(false, i);
        return ut1Var;
    }
}
