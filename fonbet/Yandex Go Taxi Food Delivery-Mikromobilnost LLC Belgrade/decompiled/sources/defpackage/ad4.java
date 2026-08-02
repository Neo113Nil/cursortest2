package defpackage;

/* loaded from: classes4.dex */
public final class ad4 extends r1 {
    public final int w;
    public final r1[] x;

    public ad4(r1[] r1VarArr) {
        super(q(r1VarArr), false);
        this.x = r1VarArr;
        this.w = 1000;
    }

    public static byte[] q(r1[] r1VarArr) {
        int length = r1VarArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return r1VarArr[0].a;
        }
        int i = length - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr = r1VarArr[i3].a;
            if (bArr[0] != 0) {
                ny61.g("only the last nested bitstring can have padding");
                return null;
            }
            i2 += bArr.length - 1;
        }
        byte[] bArr2 = r1VarArr[i].a;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[i2 + bArr2.length];
        bArr3[0] = b;
        int i4 = 1;
        for (r1 r1Var : r1VarArr) {
            byte[] bArr4 = r1Var.a;
            int length2 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i4, length2);
            i4 += length2;
        }
        return bArr3;
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        boolean j = j();
        byte[] bArr = this.a;
        if (!j) {
            g191Var.Z(bArr, 3, 0, bArr.length, z);
            return;
        }
        g191Var.c0(35, z);
        g191Var.U(128);
        r1[] r1VarArr = this.x;
        if (r1VarArr != null) {
            g191Var.e0(r1VarArr);
        } else if (bArr.length >= 2) {
            byte b = bArr[0];
            int length = bArr.length;
            int i = length - 1;
            int i2 = this.w;
            int i3 = i2 - 1;
            while (i > i3) {
                g191Var.U(3);
                g191Var.W(i2);
                g191Var.U(0);
                g191Var.V(bArr, length - i, i3);
                i -= i3;
            }
            g191Var.U(3);
            g191Var.W(i + 1);
            g191Var.U(b);
            g191Var.V(bArr, length - i, i);
        }
        g191Var.U(0);
        g191Var.U(0);
    }

    @Override // defpackage.a3
    public final boolean j() {
        return this.x != null || this.a.length > this.w;
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        boolean j = j();
        byte[] bArr = this.a;
        if (!j) {
            return g191.M(bArr.length, z);
        }
        int i = z ? 4 : 3;
        r1[] r1VarArr = this.x;
        if (r1VarArr != null) {
            for (r1 r1Var : r1VarArr) {
                i += r1Var.k(true);
            }
            return i;
        }
        if (bArr.length < 2) {
            return i;
        }
        int length = bArr.length - 2;
        int i2 = this.w;
        int i3 = i2 - 1;
        int i4 = length / i3;
        return g191.M(bArr.length - (i3 * i4), true) + (g191.M(i2, true) * i4) + i;
    }

    public ad4(byte[] bArr, int i) {
        super(bArr, i);
        this.x = null;
        this.w = 1000;
    }
}
