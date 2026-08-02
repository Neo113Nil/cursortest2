package xsna;

/* compiled from: LazyLayoutItemAnimation.kt */
/* loaded from: classes11.dex */
public final class osy extends d730<psy> {
    public final phr<Float> a;
    public final phr<h9x> b;
    public final phr<Float> c;

    public osy(phr<Float> phrVar, phr<h9x> phrVar2, phr<Float> phrVar3) {
        this.a = phrVar;
        this.b = phrVar2;
        this.c = phrVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osy)) {
            return false;
        }
        osy osyVar = (osy) obj;
        return epx.f(this.a, osyVar.a) && epx.f(this.b, osyVar.b) && epx.f(this.c, osyVar.c);
    }

    public final int hashCode() {
        phr<Float> phrVar = this.a;
        int hashCode = (phrVar == null ? 0 : phrVar.hashCode()) * 31;
        phr<h9x> phrVar2 = this.b;
        int hashCode2 = (hashCode + (phrVar2 == null ? 0 : phrVar2.hashCode())) * 31;
        phr<Float> phrVar3 = this.c;
        return hashCode2 + (phrVar3 != null ? phrVar3.hashCode() : 0);
    }

    @Override // xsna.d730
    public final psy r() {
        psy psyVar = new psy();
        psyVar.p = this.a;
        psyVar.q = this.b;
        psyVar.r = this.c;
        return psyVar;
    }

    @Override // xsna.d730
    public final void s(psy psyVar) {
        psy psyVar2 = psyVar;
        psyVar2.p = this.a;
        psyVar2.q = this.b;
        psyVar2.r = this.c;
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.a + ", placementSpec=" + this.b + ", fadeOutSpec=" + this.c + ')';
    }
}
