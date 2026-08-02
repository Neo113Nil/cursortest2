package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg2w;", "Lj530;", "Li2w;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class g2w extends j530 {
    public final p651 a;
    public final tls b;

    public g2w(p651 p651Var, tls tlsVar) {
        this.a = p651Var;
        this.b = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new i2w(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g2w) {
            return jl40.l(((g2w) obj).a, this.a);
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        i2w i2wVar = (i2w) e530Var;
        p651 p651Var = i2wVar.c;
        p651 p651Var2 = this.a;
        if (jl40.l(p651Var2, p651Var)) {
            return;
        }
        i2wVar.c = p651Var2;
        i2wVar.F0();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
