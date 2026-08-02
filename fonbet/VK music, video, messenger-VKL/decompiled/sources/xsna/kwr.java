package xsna;

import xsna.nwr;

/* compiled from: FocusProperties.kt */
/* loaded from: classes11.dex */
final class kwr extends d730<pwr> {
    public final nwr.a a;

    public kwr(nwr.a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kwr) && epx.f(this.a, ((kwr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final pwr r() {
        pwr pwrVar = new pwr();
        pwrVar.p = this.a;
        return pwrVar;
    }

    @Override // xsna.d730
    public final void s(pwr pwrVar) {
        pwrVar.p = this.a;
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.a + ')';
    }
}
