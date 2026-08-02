package defpackage;

/* loaded from: classes9.dex */
public final class pq11 extends d2f0 {
    public static final pq11 c = new pq11(qq11.a);

    @Override // defpackage.a7
    public final int d(Object obj) {
        return ((nq11) obj).a.length;
    }

    @Override // defpackage.jcc, defpackage.a7
    public final void f(sjd sjdVar, int i, Object obj) {
        ((oq11) obj).e(sjdVar.e(this.b, i).F());
    }

    @Override // defpackage.a7
    public final Object g(Object obj) {
        return new oq11(((nq11) obj).a);
    }

    @Override // defpackage.d2f0
    public final Object j() {
        return new nq11(new byte[0]);
    }

    @Override // defpackage.d2f0
    public final void k(yjd yjdVar, Object obj, int i) {
        byte[] bArr = ((nq11) obj).a;
        for (int i2 = 0; i2 < i; i2++) {
            yjdVar.x(this.b, i2).encodeByte(bArr[i2]);
        }
    }
}
