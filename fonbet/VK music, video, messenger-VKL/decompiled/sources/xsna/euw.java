package xsna;

/* compiled from: Indication.kt */
/* loaded from: classes11.dex */
final class euw extends d730<fuw> {
    public final wax a;
    public final guw b;

    public euw(wax waxVar, guw guwVar) {
        this.a = waxVar;
        this.b = guwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euw)) {
            return false;
        }
        euw euwVar = (euw) obj;
        return epx.f(this.a, euwVar.a) && epx.f(this.b, euwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // xsna.d730
    public final fuw r() {
        htl a = this.b.a(this.a);
        fuw fuwVar = new fuw();
        fuwVar.r = a;
        fuwVar.i2(a);
        return fuwVar;
    }

    @Override // xsna.d730
    public final void s(fuw fuwVar) {
        fuw fuwVar2 = fuwVar;
        htl a = this.b.a(this.a);
        fuwVar2.j2(fuwVar2.r);
        fuwVar2.r = a;
        fuwVar2.i2(a);
    }
}
