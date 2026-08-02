package androidx.compose.animation;

import defpackage.e530;
import defpackage.j530;
import defpackage.jl40;
import defpackage.ox01;
import defpackage.oz40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/c;", "S", "Lj530;", "Landroidx/compose/animation/d;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class c<S> extends j530 {
    public final ox01 a;
    public final oz40 b;
    public final e c;

    public c(ox01 ox01Var, oz40 oz40Var, e eVar) {
        this.a = ox01Var;
        this.b = oz40Var;
        this.c = eVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        d dVar = new d();
        dVar.a = this.a;
        dVar.b = this.b;
        dVar.c = this.c;
        dVar.w = -9223372034707292160L;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return jl40.l(cVar.a, this.a) && jl40.l(cVar.b, this.b);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        d dVar = (d) e530Var;
        dVar.a = this.a;
        dVar.b = this.b;
        dVar.c = this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        ox01 ox01Var = this.a;
        return this.b.hashCode() + ((hashCode + (ox01Var != null ? ox01Var.hashCode() : 0)) * 31);
    }
}
