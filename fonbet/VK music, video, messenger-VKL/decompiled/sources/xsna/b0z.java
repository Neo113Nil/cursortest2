package xsna;

/* compiled from: LegacyAdaptingPlatformTextInputModifierNode.kt */
/* loaded from: classes11.dex */
final class b0z extends d730<d0z> {
    public final f1z a;
    public final j1z b;
    public final gho0 c;

    public b0z(f1z f1zVar, j1z j1zVar, gho0 gho0Var) {
        this.a = f1zVar;
        this.b = j1zVar;
        this.c = gho0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0z)) {
            return false;
        }
        b0z b0zVar = (b0z) obj;
        return epx.f(this.a, b0zVar.a) && epx.f(this.b, b0zVar.b) && epx.f(this.c, b0zVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // xsna.d730
    public final d0z r() {
        return new d0z(this.a, this.b, this.c);
    }

    @Override // xsna.d730
    public final void s(d0z d0zVar) {
        d0z d0zVar2 = d0zVar;
        if (d0zVar2.o) {
            ((na2) d0zVar2.p).a();
            d0zVar2.p.j(d0zVar2);
        }
        f1z f1zVar = this.a;
        d0zVar2.p = f1zVar;
        if (d0zVar2.o) {
            if (f1zVar.a != null) {
                xzw.c("Expected textInputModifierNode to be null");
            }
            f1zVar.a = d0zVar2;
        }
        d0zVar2.q = this.b;
        d0zVar2.r = this.c;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ')';
    }
}
