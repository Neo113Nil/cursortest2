package defpackage;

/* loaded from: classes4.dex */
public final class lpf extends r1 {
    public static lpf q(Object obj) {
        if (obj == null || (obj instanceof lpf)) {
            return (lpf) obj;
        }
        if (obj instanceof r1) {
            return (lpf) ((r1) obj).n();
        }
        if (!(obj instanceof byte[])) {
            ny61.g(qv10.n(obj, "illegal object in getInstance: "));
            return null;
        }
        try {
            return (lpf) ((r1) a3.m((byte[]) obj)).n();
        } catch (Exception e) {
            xfo.l(e);
            return null;
        }
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        byte[] bArr = this.a;
        int i = bArr[0] & 255;
        int length = bArr.length;
        int i2 = length - 1;
        byte b = bArr[i2];
        byte b2 = (byte) ((255 << i) & b);
        if (b == b2) {
            g191Var.Y(3, bArr, z);
            return;
        }
        g191Var.c0(3, z);
        g191Var.W(length);
        g191Var.V(bArr, 0, i2);
        g191Var.U(b2);
    }

    @Override // defpackage.a3
    public final boolean j() {
        return false;
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        return g191.M(this.a.length, z);
    }

    @Override // defpackage.r1, defpackage.a3
    public final a3 n() {
        return this;
    }

    @Override // defpackage.r1, defpackage.a3
    public final a3 o() {
        return this;
    }
}
