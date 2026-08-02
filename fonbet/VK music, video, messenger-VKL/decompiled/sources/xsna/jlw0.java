package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.flw0;
import xsna.klw0;

/* compiled from: VoipCallsJoinToCallByPasswordReducer.kt */
/* loaded from: classes7.dex */
public final class jlw0 extends dm50<plw0, flw0, klw0> {
    public jlw0() {
        super(new klw0(0));
    }

    @Override // xsna.dm50
    public final klw0 c(klw0 klw0Var, flw0 flw0Var) {
        klw0 klw0Var2 = klw0Var;
        flw0 flw0Var2 = flw0Var;
        klw0.c cVar = klw0Var2.c;
        if (flw0Var2 instanceof flw0.a) {
            return klw0Var2;
        }
        if (flw0Var2 instanceof flw0.c) {
            klw0.b bVar = klw0Var2.b;
            String str = ((flw0.c) flw0Var2).b;
            bVar.getClass();
            return klw0.a(klw0Var2, new klw0.b(str), null, null, 6);
        }
        if (flw0Var2 instanceof flw0.e) {
            ((flw0.e) flw0Var2).getClass();
            String str2 = cVar.a;
            cVar.getClass();
            return klw0.a(klw0Var2, null, new klw0.c(str2, true), null, 5);
        }
        if (flw0Var2 instanceof flw0.d) {
            String str3 = ((flw0.d) flw0Var2).b;
            boolean z = cVar.b;
            cVar.getClass();
            return klw0.a(klw0Var2, null, new klw0.c(str3, z), null, 5);
        }
        if (!(flw0Var2 instanceof flw0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        klw0.a aVar = klw0Var2.d;
        boolean z2 = ((flw0.b) flw0Var2).b;
        aVar.getClass();
        return klw0.a(klw0Var2, null, null, new klw0.a(z2), 3);
    }

    @Override // xsna.dm50
    public final plw0 d() {
        return new plw0(e(new ukv0(this, 5)));
    }

    @Override // xsna.dm50
    public final void h(klw0 klw0Var, plw0 plw0Var) {
        f(plw0Var.a, klw0Var);
    }
}
