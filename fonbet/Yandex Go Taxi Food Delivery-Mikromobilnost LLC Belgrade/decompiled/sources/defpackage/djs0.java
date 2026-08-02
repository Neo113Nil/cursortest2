package defpackage;

import androidx.compose.animation.n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldjs0;", "Lj530;", "Landroidx/compose/animation/n;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class djs0 extends j530 {
    public final qar a;
    public final uo5 b;

    public djs0(qar qarVar, uo5 uo5Var) {
        this.a = qarVar;
        this.b = uo5Var;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new n(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof djs0)) {
            return false;
        }
        djs0 djs0Var = (djs0) obj;
        return jl40.l(djs0Var.a, this.a) && jl40.l(djs0Var.b, this.b);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        n nVar = (n) e530Var;
        nVar.a = this.a;
        nVar.b = this.b;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }
}
