package defpackage;

import kotlin.Result;
import kotlinx.coroutines.c;

/* loaded from: classes9.dex */
public final class l0k0 extends t8x {
    public final a9x A;

    public l0k0(a9x a9xVar) {
        this.A = a9xVar;
    }

    @Override // defpackage.t8x
    public final boolean n() {
        return false;
    }

    @Override // defpackage.t8x
    public final void o(Throwable th) {
        c cVar = this.z;
        if (cVar == null) {
            cVar = null;
        }
        Object N = cVar.N();
        boolean z = N instanceof tzc;
        a9x a9xVar = this.A;
        if (z) {
            a9xVar.resumeWith(new Result.Failure(((tzc) N).a));
        } else {
            a9xVar.resumeWith(ffx.g0(N));
        }
    }
}
