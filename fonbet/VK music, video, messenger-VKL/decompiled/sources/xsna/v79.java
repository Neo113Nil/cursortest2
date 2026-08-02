package xsna;

import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vk.voip.ui.ns.NoiseSuppressorFeature$State;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: CallParticipantSettingsActionsFeature.kt */
/* loaded from: classes7.dex */
public final class v79 extends mcw0<w79> {
    @Override // xsna.mcw0
    public final io.reactivex.rxjava3.core.q<w79> k() {
        io.reactivex.rxjava3.core.q<VoipActionsFeatureState.e> e = e();
        io.reactivex.rxjava3.internal.operators.observable.q qVar = new io.reactivex.rxjava3.internal.operators.observable.q(new wul0(7));
        io.reactivex.rxjava3.internal.operators.observable.j1 U = io.reactivex.rxjava3.core.q.P(0L, 1000L, TimeUnit.MILLISECONDS).U(new qw80(new z4t0(this, 9), 19));
        nzs0 nzs0Var = new nzs0(new b8j0(this, 25), 5);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 E = U.E(nzs0Var, lVar, kVar, kVar);
        Boolean bool = Boolean.FALSE;
        io.reactivex.rxjava3.core.q s = io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(bool), E);
        s.getClass();
        io.reactivex.rxjava3.internal.operators.observable.q2 q2Var = new io.reactivex.rxjava3.internal.operators.observable.q2(new io.reactivex.rxjava3.internal.operators.observable.y(s, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new yul0(new fuh0(11)));
        com.vk.voip.ui.c.b.getClass();
        k570 k570Var = (k570) com.vk.voip.ui.c.x0.getValue();
        io.reactivex.rxjava3.core.q p = io.reactivex.rxjava3.core.q.l(qVar, q2Var, (io.reactivex.rxjava3.subjects.d) ((ConcurrentHashMap) k570Var.b.b).get(new o620(0, k570Var, k570.class, "selectedState", "getSelectedState()Lcom/vk/voip/ui/ns/NoiseSuppressorFeature$State;", 1).getName()), new p5w(new ux6(7), 26)).p(new rcw0(new VoipActionsFeatureState.p(false, false, false, NoiseSuppressorFeature$State.NONE)));
        io.reactivex.rxjava3.core.q p2 = io.reactivex.rxjava3.core.q.m(c(), com.vk.voip.ui.actions.feature.b.j(), new yiz()).p(new rcw0(new VoipActionsFeatureState.c(false, false)));
        io.reactivex.rxjava3.core.t p3 = this.d.d().U(new x6h0(new pcw0(0), 7)).p(new rcw0(new VoipActionsFeatureState.g(false, true)));
        wot wotVar = this.e;
        return io.reactivex.rxjava3.core.q.k(e, p, p2, p3, (!((Boolean) wotVar.c.invoke()).booleanValue() ? io.reactivex.rxjava3.core.q.T(bool) : wotVar.e.a()).U(new i4f0(new xau0(this, 3), 14)).p(new rcw0(new VoipActionsFeatureState.h(false, true))), new nm3(new u79(), 2));
    }
}
