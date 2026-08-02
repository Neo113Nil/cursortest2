package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.d6x0;
import xsna.z5x0;

/* compiled from: VoipVmojiReducer.kt */
/* loaded from: classes7.dex */
public final class c6x0 extends dm50<h6x0, z5x0, d6x0> {
    @Override // xsna.dm50
    public final d6x0 c(d6x0 d6x0Var, z5x0 z5x0Var) {
        d6x0 d6x0Var2 = d6x0Var;
        z5x0 z5x0Var2 = z5x0Var;
        if (z5x0Var2 instanceof z5x0.e) {
            return d6x0.c.b;
        }
        if (z5x0Var2 instanceof z5x0.d) {
            return d6x0.f.b;
        }
        if (z5x0Var2 instanceof z5x0.f) {
            return d6x0.d.b;
        }
        if (z5x0Var2 instanceof z5x0.g) {
            z5x0.g gVar = (z5x0.g) z5x0Var2;
            return new d6x0.e(new d6x0.e.a(gVar.b, gVar.c), gVar.d);
        }
        if (z5x0Var2 instanceof z5x0.b) {
            return new d6x0.g(false);
        }
        if (z5x0Var2 instanceof z5x0.c) {
            if (d6x0Var2 instanceof d6x0.e) {
                return new d6x0.g(((d6x0.e) d6x0Var2).c);
            }
        } else {
            if (!(z5x0Var2 instanceof z5x0.h)) {
                if (z5x0Var2 instanceof z5x0.a) {
                    return d6x0.a.b;
                }
                throw new NoWhenBranchMatchedException();
            }
            z5x0.h hVar = (z5x0.h) z5x0Var2;
            if (d6x0Var2 instanceof d6x0.e) {
                return new d6x0.e(((d6x0.e) d6x0Var2).b, hVar.b);
            }
        }
        return d6x0Var2;
    }

    @Override // xsna.dm50
    public final h6x0 d() {
        return new h6x0(e(new pzt0(9)), e(new ygm0(11)), e(new ubj0(11)), e(new zzl0(13)), e(new hwi0(22)), e(new eni0(19)), e(new tml0(11)));
    }

    @Override // xsna.dm50
    public final void h(d6x0 d6x0Var, h6x0 h6x0Var) {
        d6x0 d6x0Var2 = d6x0Var;
        h6x0 h6x0Var2 = h6x0Var;
        if (d6x0Var2 instanceof d6x0.b) {
            f(h6x0Var2.a, d6x0Var2);
            return;
        }
        if (d6x0Var2 instanceof d6x0.f) {
            f(h6x0Var2.b, d6x0Var2);
            return;
        }
        if (d6x0Var2 instanceof d6x0.c) {
            f(h6x0Var2.c, d6x0Var2);
            return;
        }
        if (d6x0Var2 instanceof d6x0.d) {
            f(h6x0Var2.d, d6x0Var2);
            return;
        }
        if (d6x0Var2 instanceof d6x0.e) {
            f(h6x0Var2.e, d6x0Var2);
        } else if (d6x0Var2 instanceof d6x0.g) {
            f(h6x0Var2.f, d6x0Var2);
        } else {
            if (!(d6x0Var2 instanceof d6x0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(h6x0Var2.g, d6x0Var2);
        }
    }
}
