package defpackage;

/* loaded from: classes4.dex */
public final class hd4 extends w2 {
    public final int w;
    public final w2[] x;

    public hd4(byte[] bArr, w2[] w2VarArr) {
        super(bArr);
        this.x = w2VarArr;
        this.w = 1000;
    }

    public static byte[] y(w2[] w2VarArr) {
        int length = w2VarArr.length;
        if (length == 0) {
            return w2.c;
        }
        if (length == 1) {
            return w2VarArr[0].a;
        }
        int i = 0;
        for (w2 w2Var : w2VarArr) {
            i += w2Var.a.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (w2 w2Var2 : w2VarArr) {
            byte[] bArr2 = w2Var2.a;
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.M(36, z);
        ryhVar.E(128);
        w2[] w2VarArr = this.x;
        if (w2VarArr == null) {
            int i = 0;
            while (true) {
                byte[] bArr = this.a;
                if (i >= bArr.length) {
                    break;
                }
                int min = Math.min(bArr.length - i, this.w);
                ryhVar.J(this.a, 4, i, min, true);
                i += min;
            }
        } else {
            ryhVar.O(w2VarArr);
        }
        ryhVar.E(0);
        ryhVar.E(0);
    }

    @Override // defpackage.b3
    public final boolean o() {
        return true;
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        int i = z ? 4 : 3;
        w2[] w2VarArr = this.x;
        if (w2VarArr != null) {
            for (w2 w2Var : w2VarArr) {
                i += w2Var.p(true);
            }
            return i;
        }
        byte[] bArr = this.a;
        int length = bArr.length;
        int i2 = this.w;
        int i3 = length / i2;
        int w = (ryh.w(i2, true) * i3) + i;
        int length2 = bArr.length - (i3 * i2);
        return length2 > 0 ? ryh.w(length2, true) + w : w;
    }
}
