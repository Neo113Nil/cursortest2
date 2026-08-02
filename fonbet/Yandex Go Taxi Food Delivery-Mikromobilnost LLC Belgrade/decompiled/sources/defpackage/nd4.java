package defpackage;

/* loaded from: classes4.dex */
public class nd4 extends i3 {
    @Override // defpackage.i3
    public final s1 C() {
        return new bd4(u());
    }

    @Override // defpackage.i3
    public final opf E() {
        return ((i3) t()).E();
    }

    @Override // defpackage.i3
    public final w2 F() {
        w2[] x = x();
        return new hd4(hd4.y(x), x);
    }

    @Override // defpackage.i3
    public final m3 G() {
        return new rd4(false, this.a);
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.K(z, 48, this.a);
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        int i = z ? 4 : 3;
        int length = this.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.a[i2].toASN1Primitive().p(true);
        }
        return i;
    }
}
