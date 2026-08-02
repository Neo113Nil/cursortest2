package defpackage;

import kotlinx.coroutines.c;
import kotlinx.coroutines.selects.b;

/* loaded from: classes9.dex */
public final class d9x extends t8x {
    public final fcq0 A;
    public final /* synthetic */ c B;

    public d9x(c cVar, fcq0 fcq0Var) {
        this.B = cVar;
        this.A = fcq0Var;
    }

    @Override // defpackage.t8x
    public final boolean n() {
        return false;
    }

    @Override // defpackage.t8x
    public final void o(Throwable th) {
        c cVar = this.B;
        Object N = cVar.N();
        if (!(N instanceof tzc)) {
            N = ffx.g0(N);
        }
        ((b) this.A).k(cVar, N);
    }
}
