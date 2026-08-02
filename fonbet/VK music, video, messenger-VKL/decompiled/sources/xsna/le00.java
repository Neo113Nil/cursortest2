package xsna;

import com.vk.toggle.features.VoipFeatures;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vk.voip.ui.c;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.concurrent.Callable;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerAdaptersKt;
import ru.ok.android.webrtc.features.CallFeature;
import xsna.k5x0;

/* compiled from: MainMenuActionsFeature.kt */
/* loaded from: classes7.dex */
public final class le00 extends mcw0<me00> {
    @Override // xsna.mcw0
    public final io.reactivex.rxjava3.core.q<me00> k() {
        char c;
        io.reactivex.rxjava3.core.q T;
        com.vk.voip.ui.c.b.getClass();
        final rah0 rah0Var = com.vk.voip.ui.c.g;
        if (rah0Var == null) {
            rah0Var = null;
        }
        io.reactivex.rxjava3.internal.operators.observable.y c2 = rah0Var.c();
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        cr crVar = new cr(25);
        fVar.getClass();
        io.reactivex.rxjava3.core.q o0 = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, crVar).U(new u9c0(rah0Var, 5)).o0(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.pah0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(rah0.this.a());
            }
        }));
        o0.getClass();
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        io.reactivex.rxjava3.core.q p = io.reactivex.rxjava3.core.q.m(c2, new io.reactivex.rxjava3.internal.operators.observable.y(o0, qVar, aVar), new mh40(new e6g(8), 24)).p(new rcw0(new VoipActionsFeatureState.s(false, false)));
        r4x0 I = com.vk.voip.ui.c.I();
        I.getClass();
        c.d dVar = I.g;
        io.reactivex.rxjava3.internal.operators.observable.y a = dVar.a(true, new icn0(I, 23));
        io.reactivex.rxjava3.internal.operators.observable.y a2 = dVar.a(true, new wcs0(I, 10));
        io.reactivex.rxjava3.internal.operators.observable.y a3 = dVar.a(true, new mwm0(I, 24));
        io.reactivex.rxjava3.internal.operators.observable.y a4 = dVar.a(true, new hvr0(I, 21));
        io.reactivex.rxjava3.internal.operators.observable.y a5 = dVar.a(true, new rqs0(I, 9));
        io.reactivex.rxjava3.internal.operators.observable.y g = com.vk.voip.ui.actions.feature.b.g();
        I.e.getClass();
        OKVoipEngine oKVoipEngine = com.vk.voip.ui.c.r;
        ConversationFeatureManager g2 = oKVoipEngine.g();
        io.reactivex.rxjava3.core.q p2 = io.reactivex.rxjava3.core.q.g(a, a2, a3, a4, a5, g, g2 == null ? io.reactivex.rxjava3.internal.operators.observable.g0.b : ConversationFeatureManagerAdaptersKt.observeFeatureEnabled(g2, CallFeature.RECORD), new atv0()).p(new rcw0(new VoipActionsFeatureState.v(false, false, false, false, false, null)));
        r4x0 I2 = com.vk.voip.ui.c.I();
        I2.getClass();
        c.d dVar2 = I2.g;
        io.reactivex.rxjava3.internal.operators.observable.y a6 = dVar2.a(true, new yei0(I2, 29));
        io.reactivex.rxjava3.internal.operators.observable.y a7 = dVar2.a(true, new guw0(I2, 1));
        io.reactivex.rxjava3.internal.operators.observable.y a8 = dVar2.a(true, new dtv0(I2, 4));
        io.reactivex.rxjava3.internal.operators.observable.y a9 = dVar2.a(true, new rqs0(I2, 9));
        io.reactivex.rxjava3.internal.operators.observable.y g3 = com.vk.voip.ui.actions.feature.b.g();
        I2.e.getClass();
        ConversationFeatureManager g4 = oKVoipEngine.g();
        io.reactivex.rxjava3.core.q p3 = io.reactivex.rxjava3.core.q.i(a6, a7, a8, a9, g3, g4 == null ? io.reactivex.rxjava3.internal.operators.observable.g0.b : ConversationFeatureManagerAdaptersKt.observeFeatureEnabled(g4, CallFeature.RECORD), new cvk()).p(new rcw0(new VoipActionsFeatureState.r(false, false, false, false)));
        io.reactivex.rxjava3.core.q<VoipActionsFeatureState.e> e = e();
        io.reactivex.rxjava3.core.q p4 = io.reactivex.rxjava3.core.q.j(c(), d(), com.vk.voip.ui.actions.feature.b.j(), com.vk.voip.ui.c.h0().b.U(new g7r0(new wfl0(8))), new vii0(new wfi(1), 9)).p(new rcw0(new VoipActionsFeatureState.w(false, false, false, k5x0.b.c)));
        io.reactivex.rxjava3.core.q p5 = io.reactivex.rxjava3.core.q.j(c(), d(), com.vk.voip.ui.actions.feature.b.j(), com.vk.voip.ui.c.h0().b.U(new zzq0(new k4x0(1))), new osk0(new eni(1), 17)).p(new rcw0(new VoipActionsFeatureState.k(false, false, false, k5x0.a.c)));
        io.reactivex.rxjava3.internal.operators.observable.y f = com.vk.voip.ui.actions.feature.b.f(new om60(this));
        o4x0 G = com.vk.voip.ui.c.G();
        io.reactivex.rxjava3.core.q o02 = G.i.U(new mvc0(new wgm0(G, 22), 14)).o0(new io.reactivex.rxjava3.internal.operators.single.v(new ha20(G, 3)));
        o02.getClass();
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(o02, qVar, aVar);
        o4x0 G2 = com.vk.voip.ui.c.G();
        io.reactivex.rxjava3.core.q o03 = G2.i.U(new s1j0(new lbt0(G2, 8), 16)).o0(new io.reactivex.rxjava3.internal.operators.single.v(new ibm0(G2, 1)));
        o03.getClass();
        io.reactivex.rxjava3.core.q p6 = io.reactivex.rxjava3.core.q.j(f, yVar, new io.reactivex.rxjava3.internal.operators.observable.y(o03, qVar, aVar), com.vk.voip.ui.actions.feature.b.g(), new utg0(new tcw0(), 10)).p(new rcw0(new VoipActionsFeatureState.b(false, false, false)));
        io.reactivex.rxjava3.core.q<VoipActionsFeatureState.n> h = h();
        io.reactivex.rxjava3.core.q<VoipActionsFeatureState.o> i = i();
        io.reactivex.rxjava3.core.q p7 = com.vk.voip.ui.c.E0().U(new mau(new z7w(29), 20)).p(new rcw0(new VoipActionsFeatureState.m(false, CallsAudioDeviceInfo.Companion.getNONE())));
        io.reactivex.rxjava3.core.q p8 = com.vk.voip.ui.actions.feature.b.f(new fog0(this)).p(new rcw0(new VoipActionsFeatureState.l(false, false)));
        io.reactivex.rxjava3.core.q s = io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(Boolean.valueOf(com.vk.voip.ui.c.r0())), com.vk.voip.ui.c.H0(false).U(new hkc0(new wss0(7), 12)));
        s.getClass();
        io.reactivex.rxjava3.core.q p9 = new io.reactivex.rxjava3.internal.operators.observable.y(s, qVar, aVar).U(new oq80(new com.vk.voip.ui.actions.feature.a(1, this, com.vk.voip.ui.actions.feature.b.class, "mapIsUserAuthorizedToUserType", "mapIsUserAuthorizedToUserType(Z)Lcom/vk/voip/ui/actions/feature/VoipActionsFeatureState$UserType;", 0), 15)).p(new rcw0(com.vk.voip.ui.c.r0() ? VoipActionsFeatureState.UserType.AUTHORIZED : VoipActionsFeatureState.UserType.ANONYM));
        nav navVar = com.vk.voip.ui.c.S;
        io.reactivex.rxjava3.internal.operators.observable.y yVar2 = new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.y((navVar != null ? navVar : null).a.c.U(new rj4(new b95(dvq.a, 5), 17)), qVar, aVar).U(new s1j0(new qcw0(0), 11)).p(new rcw0(new VoipActionsFeatureState.i(false, "", ""))), qVar, aVar);
        io.reactivex.rxjava3.internal.operators.observable.q2 c3 = c();
        io.reactivex.rxjava3.internal.operators.mixed.a h2 = com.vk.voip.ui.c.i0().h();
        r5x0 i0 = com.vk.voip.ui.c.i0();
        io.reactivex.rxjava3.core.q p10 = io.reactivex.rxjava3.core.q.k(c3, h2, a201.b().b().a().d(new io.reactivex.rxjava3.internal.operators.observable.y(i0.d.b().U(new p7(new com.vk.im.engine.internal.api_commands.messages.a(i0, 9), 7)), qVar, aVar)), com.vk.voip.ui.c.i0().i(), com.vk.voip.ui.actions.feature.b.g(), new mvc0(new ocw0(), 11)).p(new rcw0(new VoipActionsFeatureState.x(false, false, false, va9.r)));
        io.reactivex.rxjava3.core.q p11 = com.vk.voip.ui.actions.feature.b.f(new fa6(0, this, com.vk.voip.ui.actions.feature.b.class, "getCanChangeParticipantPermissions", "getCanChangeParticipantPermissions()Z", 0, 6)).U(new gwn0(new fyi0(12), 8)).p(new rcw0(new VoipActionsFeatureState.q(false)));
        io.reactivex.rxjava3.core.q p12 = io.reactivex.rxjava3.core.q.m(new io.reactivex.rxjava3.internal.operators.observable.y(com.vk.voip.ui.c.B0.b(), qVar, aVar).a0(asu0.a.d()), com.vk.voip.ui.actions.feature.b.g(), new he40(new mq2(15), 23)).p(new rcw0(new VoipActionsFeatureState.t(0, null, false, false, false, false, false, false, false)));
        p490 a10 = r99.a.a();
        io.reactivex.rxjava3.internal.operators.observable.y yVar3 = new io.reactivex.rxjava3.internal.operators.observable.y(a10.v().f.U(new koi0(new lir0(9))), qVar, aVar);
        a10.w();
        io.reactivex.rxjava3.core.q p13 = io.reactivex.rxjava3.core.q.m(yVar3, com.vk.voip.ui.actions.feature.b.g(), new a840(new dmi((byte) 0, 7), 17)).p(new rcw0(new VoipActionsFeatureState.u(false)));
        nfw0 nfw0Var = com.vk.voip.ui.c.D0;
        io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(nfw0Var.b.b(), nfw0Var.b.c(), new f0j0(new z2(13), 13));
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new ucw0());
        p4x0 p4x0Var = com.vk.voip.ui.c.G;
        p4x0Var.getClass();
        VoipFeatures voipFeatures = VoipFeatures.ENABLE_FULL_AUDIO_DUMP_RECORD;
        voipFeatures.getClass();
        if (com.vk.toggle.b.A.a(voipFeatures)) {
            c = 17;
            T = p4x0Var.b.U(new oq80(new l4k0(16), 16)).U(new khc0(new scw0(0), 15));
        } else {
            c = 17;
            T = io.reactivex.rxjava3.core.q.T(new VoipActionsFeatureState.d(false, false, 0));
        }
        io.reactivex.rxjava3.core.q[] qVarArr = new io.reactivex.rxjava3.core.q[20];
        qVarArr[0] = p;
        qVarArr[1] = p2;
        qVarArr[2] = p3;
        qVarArr[3] = e;
        qVarArr[4] = p4;
        qVarArr[5] = p5;
        qVarArr[6] = p6;
        qVarArr[7] = h;
        qVarArr[8] = i;
        qVarArr[9] = p7;
        qVarArr[10] = p8;
        qVarArr[11] = p9;
        qVarArr[12] = yVar2;
        qVarArr[13] = p10;
        qVarArr[14] = p11;
        qVarArr[15] = p12;
        qVarArr[16] = p13;
        qVarArr[c] = m;
        qVarArr[18] = s0Var;
        qVarArr[19] = T;
        return io.reactivex.rxjava3.core.q.n(e43.l(qVarArr), new adz(new ept(5), 1));
    }
}
