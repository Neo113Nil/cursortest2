package xsna;

/* compiled from: LazyLayoutPrefetchState.kt */
/* loaded from: classes11.dex */
final class opp0 extends d730<ppp0> {
    public final cuy a;

    public opp0(cuy cuyVar) {
        this.a = cuyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof opp0) && epx.f(this.a, ((opp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final ppp0 r() {
        return new ppp0(this.a);
    }

    @Override // xsna.d730
    public final void s(ppp0 ppp0Var) {
        ppp0Var.p = this.a;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ')';
    }
}
