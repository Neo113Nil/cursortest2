package xsna;

import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerAdaptersKt;
import ru.ok.android.webrtc.features.CallFeature;

/* compiled from: CallParticipantPermissionsActionsFeature.kt */
/* loaded from: classes7.dex */
public final class m79 extends mcw0<n79> {
    @Override // xsna.mcw0
    public final io.reactivex.rxjava3.core.q<n79> k() {
        io.reactivex.rxjava3.core.q<VoipActionsFeatureState.n> h = h();
        io.reactivex.rxjava3.core.q<VoipActionsFeatureState.o> i = i();
        com.vk.voip.ui.c.b.getClass();
        kcx0 k0 = com.vk.voip.ui.c.k0();
        io.reactivex.rxjava3.core.q p = io.reactivex.rxjava3.core.q.l(com.vk.voip.ui.actions.feature.b.f(new mcd(0, this, com.vk.voip.ui.actions.feature.b.class, "getCanChangeMediaOptions", "getCanChangeMediaOptions()Z", 0, 6)), k0.d.f(true), com.vk.voip.ui.actions.feature.b.g(), new h8e0(new ouj(k0, 2), 5)).p(new rcw0(new VoipActionsFeatureState.y(false, true)));
        com.vk.voip.ui.c.I().e.getClass();
        ConversationFeatureManager g = com.vk.voip.ui.c.r.g();
        io.reactivex.rxjava3.core.q U = g == null ? io.reactivex.rxjava3.internal.operators.observable.g0.b : ConversationFeatureManagerAdaptersKt.observeFeatureRoles(g, CallFeature.RECORD).U(new yzt(new iiu0(6), 26));
        io.reactivex.rxjava3.internal.operators.observable.j1 U2 = com.vk.voip.ui.actions.feature.b.f(new xvc0(this)).U(new nh40(new gxj0(12), 25));
        com.vk.voip.ui.actions.feature.c cVar = this.f;
        cVar.d(cVar.d.b().b);
        io.reactivex.rxjava3.subjects.d<djw0> dVar = cVar.g;
        dVar.getClass();
        return io.reactivex.rxjava3.core.q.i(h, i, p, U, U2, new io.reactivex.rxjava3.internal.operators.observable.z0(dVar), new com.vk.movika.sdk.base.ui.j(new l79(), 8));
    }
}
