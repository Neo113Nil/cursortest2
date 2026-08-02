package defpackage;

import com.yandex.go.routestops.RouteStopsPresenter$askAddOrUpdateStop$$inlined$safeCollectIn$1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class idl0 extends ad5 {
    public final aah A;
    public final wiq0 B;
    public final zuj0 C;
    public final aye0 D;
    public final n0 E;
    public final n0 F;
    public final ea80 G;
    public pzt0 H;
    public pzt0 I;
    public mdl0 J;
    public o8g0 K;
    public final w4l0 x;
    public final w810 y;
    public final cwb z;

    public idl0(w4l0 w4l0Var, w810 w810Var, cwb cwbVar, aah aahVar, wiq0 wiq0Var, zuj0 zuj0Var) {
        super(adl0.class);
        this.x = w4l0Var;
        this.y = w810Var;
        this.z = cwbVar;
        this.A = aahVar;
        this.B = wiq0Var;
        this.C = zuj0Var;
        this.D = new aye0(21, this);
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.E = ffx.b(0, 1, bufferOverflow);
        this.F = ffx.b(0, 1, bufferOverflow);
        this.G = new ea80(3, this);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.J = null;
    }

    public final void Kg() {
        pzt0 pzt0Var = this.I;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.I = tje.N(Jg(), null, null, new RouteStopsPresenter$askAddOrUpdateStop$$inlined$safeCollectIn$1(this.F, null, this), 3);
    }
}
