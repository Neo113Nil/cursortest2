package defpackage;

/* loaded from: classes4.dex */
public final class ohx extends o2 implements y1 {
    public p0x a;
    public qgi0 b = null;

    public ohx(p0x p0xVar) {
        this.a = p0xVar;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        p0x p0xVar = this.a;
        return p0xVar != null ? p0xVar.toASN1Primitive() : new oqf(false, 0, this.b, 0);
    }
}
