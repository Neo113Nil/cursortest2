package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Liyu0;", "Lj530;", "Ljyu0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class iyu0 extends j530 {
    public final tb2 a = w4a1.a;
    public final d8m b;

    public iyu0(d8m d8mVar) {
        this.b = d8mVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new jyu0(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyu0)) {
            return false;
        }
        iyu0 iyu0Var = (iyu0) obj;
        return jl40.l(this.a, iyu0Var.a) && jl40.l(this.b, iyu0Var.b);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        jyu0 jyu0Var = (jyu0) e530Var;
        wvd0 wvd0Var = jyu0Var.b;
        tb2 tb2Var = this.a;
        if (!jl40.l(wvd0Var, tb2Var)) {
            jyu0Var.b = tb2Var;
            if (jyu0Var.c) {
                jyu0Var.G0();
            }
        }
        jyu0Var.a = this.b;
    }

    public final int hashCode() {
        int e = unr0.e(this.a.b * 31, 31, false);
        d8m d8mVar = this.b;
        return e + (d8mVar != null ? d8mVar.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false, touchBoundsExpansion=" + this.b + ')';
    }
}
