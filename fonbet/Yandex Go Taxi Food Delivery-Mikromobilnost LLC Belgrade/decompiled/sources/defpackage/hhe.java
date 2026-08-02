package defpackage;

import coil.compose.d;
import coil.compose.g;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhhe;", "Lj530;", "Lcoil/compose/g;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class hhe extends j530 {
    public final pa90 a;
    public final jt1 b;
    public final nhe c;
    public final float w;
    public final wec x;

    public hhe(d dVar, jt1 jt1Var, nhe nheVar, float f, wec wecVar) {
        this.a = dVar;
        this.b = jt1Var;
        this.c = nheVar;
        this.w = f;
        this.x = wecVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        g gVar = new g();
        gVar.a = this.a;
        gVar.b = this.b;
        gVar.c = this.c;
        gVar.w = this.w;
        gVar.x = this.x;
        return gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhe)) {
            return false;
        }
        hhe hheVar = (hhe) obj;
        return jl40.l(this.a, hheVar.a) && jl40.l(this.b, hheVar.b) && jl40.l(this.c, hheVar.c) && Float.compare(this.w, hheVar.w) == 0 && jl40.l(this.x, hheVar.x);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        g gVar = (g) e530Var;
        long i = gVar.a.i();
        pa90 pa90Var = this.a;
        boolean a = cjs0.a(i, pa90Var.i());
        gVar.a = pa90Var;
        gVar.b = this.b;
        gVar.c = this.c;
        gVar.w = this.w;
        gVar.x = this.x;
        if (!a) {
            qje.P(gVar).C();
        }
        rzo.D(gVar);
    }

    public final int hashCode() {
        int c = g8e.c(this.w, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        wec wecVar = this.x;
        return c + (wecVar == null ? 0 : wecVar.hashCode());
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.a + ", alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.w + ", colorFilter=" + this.x + ')';
    }
}
