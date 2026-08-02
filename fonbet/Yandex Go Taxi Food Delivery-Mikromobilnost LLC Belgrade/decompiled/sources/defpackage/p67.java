package defpackage;

/* loaded from: classes9.dex */
public final class p67 extends d2f0 {
    public static final p67 c = new p67(m77.a);

    @Override // defpackage.a7
    public final int d(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // defpackage.jcc, defpackage.a7
    public final void f(sjd sjdVar, int i, Object obj) {
        ((f67) obj).e(sjdVar.g(this.b, i));
    }

    @Override // defpackage.a7
    public final Object g(Object obj) {
        return new f67((byte[]) obj);
    }

    @Override // defpackage.d2f0
    public final Object j() {
        return new byte[0];
    }

    @Override // defpackage.d2f0
    public final void k(yjd yjdVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            yjdVar.f(this.b, i2, bArr[i2]);
        }
    }
}
