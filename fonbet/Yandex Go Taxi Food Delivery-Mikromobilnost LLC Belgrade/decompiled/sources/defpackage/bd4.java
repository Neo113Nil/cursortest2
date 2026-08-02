package defpackage;

/* loaded from: classes4.dex */
public final class bd4 extends s1 {
    public final int w;
    public final s1[] x;

    public bd4(s1[] s1VarArr) {
        super(A(s1VarArr));
        this.x = s1VarArr;
        this.w = 1000;
    }

    public static byte[] A(s1[] s1VarArr) {
        int length = s1VarArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return s1VarArr[0].a;
        }
        int i = length - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr = s1VarArr[i3].a;
            if (bArr[0] != 0) {
                ny61.g("only the last nested bitstring can have padding");
                return null;
            }
            i2 += bArr.length - 1;
        }
        byte[] bArr2 = s1VarArr[i].a;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[i2 + bArr2.length];
        bArr3[0] = b;
        int i4 = 1;
        for (s1 s1Var : s1VarArr) {
            byte[] bArr4 = s1Var.a;
            int length2 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i4, length2);
            i4 += length2;
        }
        return bArr3;
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        boolean o = o();
        byte[] bArr = this.a;
        if (!o) {
            ryhVar.J(bArr, 3, 0, bArr.length, z);
            return;
        }
        ryhVar.M(35, z);
        ryhVar.E(128);
        s1[] s1VarArr = this.x;
        if (s1VarArr != null) {
            ryhVar.O(s1VarArr);
        } else if (bArr.length >= 2) {
            byte b = bArr[0];
            int length = bArr.length;
            int i = length - 1;
            int i2 = this.w;
            int i3 = i2 - 1;
            while (i > i3) {
                ryhVar.E(3);
                ryhVar.G(i2);
                ryhVar.E(0);
                ryhVar.F(bArr, length - i, i3);
                i -= i3;
            }
            ryhVar.E(3);
            ryhVar.G(i + 1);
            ryhVar.E(b);
            ryhVar.F(bArr, length - i, i);
        }
        ryhVar.E(0);
        ryhVar.E(0);
    }

    @Override // defpackage.b3
    public final boolean o() {
        return this.x != null || this.a.length > this.w;
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        boolean o = o();
        byte[] bArr = this.a;
        if (!o) {
            return ryh.w(bArr.length, z);
        }
        int i = z ? 4 : 3;
        s1[] s1VarArr = this.x;
        if (s1VarArr != null) {
            for (s1 s1Var : s1VarArr) {
                i += s1Var.p(true);
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
        return ryh.w(bArr.length - (i3 * i4), true) + (ryh.w(i2, true) * i4) + i;
    }

    public bd4(byte[] bArr, int i) {
        super(bArr, i);
        this.x = null;
        this.w = 1000;
    }
}
