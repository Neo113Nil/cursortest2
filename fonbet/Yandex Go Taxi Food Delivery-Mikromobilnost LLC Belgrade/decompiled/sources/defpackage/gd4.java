package defpackage;

/* loaded from: classes4.dex */
public final class gd4 extends v2 {
    public final int w;
    public final v2[] x;

    public gd4(byte[] bArr, v2[] v2VarArr) {
        super(bArr);
        this.x = v2VarArr;
        this.w = 1000;
    }

    public static byte[] q(v2[] v2VarArr) {
        int length = v2VarArr.length;
        if (length == 0) {
            return v2.c;
        }
        if (length == 1) {
            return v2VarArr[0].a;
        }
        int i = 0;
        for (v2 v2Var : v2VarArr) {
            i += v2Var.a.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (v2 v2Var2 : v2VarArr) {
            byte[] bArr2 = v2Var2.a;
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        boolean j = j();
        byte[] bArr = this.a;
        if (!j) {
            g191Var.Z(bArr, 4, 0, bArr.length, z);
            return;
        }
        g191Var.c0(36, z);
        g191Var.U(128);
        v2[] v2VarArr = this.x;
        if (v2VarArr != null) {
            g191Var.e0(v2VarArr);
        } else {
            int i = 0;
            while (i < bArr.length) {
                int min = Math.min(bArr.length - i, this.w);
                g191Var.Z(this.a, 4, i, min, true);
                i += min;
            }
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
        v2[] v2VarArr = this.x;
        if (v2VarArr != null) {
            for (v2 v2Var : v2VarArr) {
                i += v2Var.k(true);
            }
            return i;
        }
        int length = bArr.length;
        int i2 = this.w;
        int i3 = length / i2;
        int M = (g191.M(i2, true) * i3) + i;
        int length2 = bArr.length - (i3 * i2);
        return length2 > 0 ? g191.M(length2, true) + M : M;
    }

    public gd4(v2[] v2VarArr) {
        this(q(v2VarArr), v2VarArr);
    }
}
