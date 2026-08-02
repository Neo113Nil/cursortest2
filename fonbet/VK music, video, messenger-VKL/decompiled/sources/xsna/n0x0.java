package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a990;
import xsna.g0x0;
import xsna.o0x0;

/* compiled from: VoipSelectVideoPlaylistsReducer.kt */
/* loaded from: classes7.dex */
public final class n0x0 extends dm50<p0x0, g0x0, o0x0> {
    public final l0x0 d;

    public n0x0(l0x0 l0x0Var) {
        super(o0x0.c.b);
        this.d = l0x0Var;
    }

    @Override // xsna.dm50
    public final o0x0 c(o0x0 o0x0Var, g0x0 g0x0Var) {
        o0x0 o0x0Var2 = o0x0Var;
        g0x0 g0x0Var2 = g0x0Var;
        if (g0x0Var2 instanceof g0x0.a.e) {
            g0x0.a.e eVar = (g0x0.a.e) g0x0Var2;
            return new o0x0.a(new o0x0.d(eVar.b, new a990(Integer.valueOf(eVar.c), eVar.d, a990.a.b.a, a990.b.a.a)), false);
        }
        if (g0x0Var2 instanceof g0x0.a.C2905a) {
            return new o0x0.a(new o0x0.d(EmptyList.b, new a990(null, false, a990.a.b.a, a990.b.a.a)), false);
        }
        if (g0x0Var2 instanceof g0x0.a.c.C2906a) {
            g0x0.a.c.C2906a c2906a = (g0x0.a.c.C2906a) g0x0Var2;
            if (o0x0Var2 instanceof o0x0.a) {
                o0x0.a aVar = (o0x0.a) o0x0Var2;
                o0x0.d dVar = aVar.b;
                return o0x0.a.a(aVar, new o0x0.d(dVar.a, a990.a(dVar.b, null, false, new a990.a.C2530a(c2906a.b), null, 11)), false, 2);
            }
        } else if (g0x0Var2 instanceof g0x0.a.c.b) {
            if (o0x0Var2 instanceof o0x0.a) {
                o0x0.a aVar2 = (o0x0.a) o0x0Var2;
                o0x0.d dVar2 = aVar2.b;
                return o0x0.a.a(aVar2, new o0x0.d(dVar2.a, a990.a(dVar2.b, null, false, a990.a.c.a, null, 11)), false, 2);
            }
        } else if (g0x0Var2 instanceof g0x0.a.c.C2907c) {
            g0x0.a.c.C2907c c2907c = (g0x0.a.c.C2907c) g0x0Var2;
            if (o0x0Var2 instanceof o0x0.a) {
                o0x0.a aVar3 = (o0x0.a) o0x0Var2;
                o0x0.d dVar3 = aVar3.b;
                return o0x0.a.a(aVar3, new o0x0.d(j5g.u0(c2907c.b, dVar3.a), a990.a(dVar3.b, Integer.valueOf(c2907c.c), c2907c.d, a990.a.b.a, null, 8)), false, 2);
            }
        } else {
            if (g0x0Var2 instanceof g0x0.a.d) {
                return o0x0.c.b;
            }
            if (g0x0Var2 instanceof g0x0.a.b) {
                return new o0x0.b(((g0x0.a.b) g0x0Var2).b);
            }
            if (!(g0x0Var2 instanceof g0x0.a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            g0x0.a.f fVar = (g0x0.a.f) g0x0Var2;
            if (o0x0Var2 instanceof o0x0.a) {
                return o0x0.a.a((o0x0.a) o0x0Var2, null, fVar.b, 1);
            }
        }
        return o0x0Var2;
    }

    @Override // xsna.dm50
    public final p0x0 d() {
        return new p0x0(e(new hfm0(this, 26)));
    }

    @Override // xsna.dm50
    public final void h(o0x0 o0x0Var, p0x0 p0x0Var) {
        f(p0x0Var.a, o0x0Var);
    }
}
