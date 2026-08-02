package defpackage;

/* loaded from: classes4.dex */
public class mpf extends s1 {
    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        byte[] bArr = this.a;
        int i = bArr[0] & 255;
        int length = bArr.length;
        int i2 = length - 1;
        byte b = bArr[i2];
        byte b2 = (byte) ((255 << i) & b);
        if (b == b2) {
            ryhVar.I(3, bArr, z);
            return;
        }
        ryhVar.M(3, z);
        ryhVar.G(length);
        ryhVar.F(bArr, 0, i2);
        ryhVar.E(b2);
    }

    @Override // defpackage.b3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        return ryh.w(this.a.length, z);
    }

    @Override // defpackage.s1, defpackage.b3
    public final b3 s() {
        return this;
    }

    @Override // defpackage.s1, defpackage.b3
    public final b3 t() {
        return this;
    }
}
