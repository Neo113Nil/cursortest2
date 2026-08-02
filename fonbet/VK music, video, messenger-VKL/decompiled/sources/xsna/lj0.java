package xsna;

import xsna.cwb0;
import xsna.i5e0;

/* compiled from: AdapterCallbackImpl.kt */
/* loaded from: classes2.dex */
public final class lj0 implements hj0 {
    public final vtm a;

    public lj0(vtm vtmVar) {
        this.a = vtmVar;
    }

    @Override // xsna.xur0.a
    public final void I(i5e0.a aVar) {
        vtm vtmVar = this.a;
        vtmVar.G.b(new cwb0.t0(), new utm(vtmVar, aVar), null);
    }

    @Override // xsna.xur0.a
    public final void u(i5e0.a aVar) {
        vtm vtmVar = this.a;
        vtmVar.h.k().b(vtmVar.d, aVar.f);
        xtm xtmVar = vtmVar.F;
        if (xtmVar != null) {
            xtmVar.q(aVar.a);
        }
    }
}
