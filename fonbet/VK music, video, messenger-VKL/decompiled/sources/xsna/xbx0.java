package xsna;

import com.vk.voip.ui.VoipViewModelState;
import java.util.Set;

/* compiled from: WatchTogetherButtonFeature.kt */
/* loaded from: classes7.dex */
public final class xbx0 {
    public static final Set<VoipViewModelState> b = rl3.y0(new VoipViewModelState[]{VoipViewModelState.InCall, VoipViewModelState.CallingPeer});
    public final jcx0 a;

    public xbx0(kcx0 kcx0Var) {
        this.a = kcx0Var;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 a() {
        r6x0 b2 = this.a.b();
        io.reactivex.rxjava3.subjects.d<it80<p3x0>> dVar = b2.i;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.q(new cxd0(b2, 18)).U(new i630(new l9v0(b2, 7), 24));
        io.reactivex.rxjava3.internal.operators.observable.q d = b2.d();
        com.vk.voip.ui.c.b.getClass();
        io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(com.vk.voip.ui.c.H0(true), com.vk.voip.ui.c.G0(true), new h8e0(new ug4((byte) 0, 9), 8));
        m.getClass();
        return io.reactivex.rxjava3.core.q.k(dVar, U, d, new io.reactivex.rxjava3.internal.operators.observable.y(m, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), com.vk.voip.ui.c.W().b(true), new mvc0(new wbx0(this), 15)).a0(asu0.a.d());
    }
}
