package xsna;

import xsna.d080;
import xsna.e080;

/* compiled from: OldUserOnBoardingReducer.kt */
/* loaded from: classes5.dex */
public final class h080 extends dm50<o080, e080, i080> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h080() {
        super(i080.e);
        i080 i080Var = i080.e;
    }

    @Override // xsna.dm50
    public final i080 c(i080 i080Var, e080 e080Var) {
        i080 i080Var2 = i080Var;
        e080 e080Var2 = e080Var;
        if (!(e080Var2 instanceof e080.b)) {
            return i080Var2;
        }
        e080.b bVar = (e080.b) e080Var2;
        d080.a<c280, ? extends b280> aVar = bVar.b;
        return new i080(aVar.a, aVar.b, bVar.c);
    }

    @Override // xsna.dm50
    public final o080 d() {
        return new o080(e(new y160(2)));
    }

    @Override // xsna.dm50
    public final void h(i080 i080Var, o080 o080Var) {
        f(o080Var.a, i080Var);
    }
}
