package xsna;

/* compiled from: FocusRequesterModifier.kt */
/* loaded from: classes11.dex */
final class swr extends d730<vwr> {
    public final rwr a;

    public swr(rwr rwrVar) {
        this.a = rwrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swr) && epx.f(this.a, ((swr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final vwr r() {
        vwr vwrVar = new vwr();
        vwrVar.p = this.a;
        return vwrVar;
    }

    @Override // xsna.d730
    public final void s(vwr vwrVar) {
        vwr vwrVar2 = vwrVar;
        vwrVar2.p.a.j(vwrVar2);
        rwr rwrVar = this.a;
        vwrVar2.p = rwrVar;
        rwrVar.a.b(vwrVar2);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
