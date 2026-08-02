package xsna;

import com.vk.video.growth.impl.ui.entity.TrapState;
import xsna.dpp0;

/* compiled from: TrapAnalyticsMiddleware.kt */
/* loaded from: classes6.dex */
public final class fpp0 implements h7f0<TrapState, dpp0, on50, ll50<on50, bwj, dwj>, jl50<TrapState>, kpp0> {
    public final sl50<TrapState, dpp0, on50, ll50<on50, bwj, dwj>, jl50<TrapState>, kpp0> b;
    public final sos0 c;
    public final String d;

    public fpp0(sl50<TrapState, dpp0, on50, ll50<on50, bwj, dwj>, jl50<TrapState>, kpp0> sl50Var, sos0 sos0Var, String str) {
        this.b = sl50Var;
        this.c = sos0Var;
        this.d = str;
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        dpp0 dpp0Var = (dpp0) lj50Var;
        boolean z = dpp0Var instanceof dpp0.c;
        String str = this.d;
        sos0 sos0Var = this.c;
        if (z) {
            sos0Var.d(str);
        } else if (dpp0Var instanceof dpp0.b) {
            sos0Var.b(str);
        } else if (dpp0Var instanceof dpp0.d) {
            sos0Var.show(str);
        }
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void T(pk50 pk50Var) {
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void l(hn50 hn50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void o(yl50 yl50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void u(lm50 lm50Var) {
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }
}
