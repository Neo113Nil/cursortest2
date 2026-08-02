package xsna;

import com.vk.video.growth.impl.ui.entity.TrapState;
import xsna.dpp0;
import xsna.kpp0;

/* compiled from: TrapActor.kt */
/* loaded from: classes6.dex */
public final class lpp0 extends bl50<TrapState, dpp0, on50, bwj, dwj, kpp0> {
    public final sj50<TrapState, on50, ll50<on50, bwj, dwj>, jl50<TrapState>, kpp0> c;

    public lpp0(sj50<TrapState, on50, ll50<on50, bwj, dwj>, jl50<TrapState>, kpp0> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<TrapState, on50, ll50<on50, bwj, dwj>, jl50<TrapState>, kpp0> W() {
        return this.c;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        dpp0 dpp0Var = (dpp0) lj50Var;
        if (dpp0Var instanceof dpp0.c) {
            c(kpp0.a.a);
        } else if (dpp0Var instanceof dpp0.a) {
            c(kpp0.b.a);
        }
    }
}
