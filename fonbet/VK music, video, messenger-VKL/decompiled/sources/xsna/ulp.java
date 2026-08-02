package xsna;

import com.vk.log.L;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.webrtc.features.CallFeature;

/* compiled from: EngineListenersImpl.kt */
/* loaded from: classes11.dex */
public final class ulp implements tlp, qcx0, muq {
    public final kl90 b;
    public final wsw c;
    public final q49 d;
    public final ch8 e;
    public final pcx0 f;
    public final ouq g;
    public final i6r h;
    public final gw3 i;
    public final h8j j;
    public final dxi0 k;
    public final ysu l;
    public final kx3 m;
    public final iv3 n;
    public final zs10 o;
    public final g1l0 p;
    public final hfq0 q;
    public final nsb r;
    public final us10 s;

    public ulp() {
        kl90 kl90Var = new kl90();
        wsw wswVar = new wsw();
        q49 q49Var = new q49();
        ch8 ch8Var = new ch8();
        pcx0 pcx0Var = new pcx0();
        ouq ouqVar = new ouq();
        i6r i6rVar = new i6r();
        gw3 gw3Var = new gw3();
        h8j h8jVar = new h8j();
        dxi0 dxi0Var = new dxi0();
        ysu ysuVar = new ysu();
        kx3 kx3Var = new kx3();
        iv3 iv3Var = new iv3();
        zs10 zs10Var = new zs10();
        g1l0 g1l0Var = new g1l0();
        hfq0 hfq0Var = new hfq0();
        nsb nsbVar = new nsb();
        us10 us10Var = new us10();
        this.b = kl90Var;
        this.c = wswVar;
        this.d = q49Var;
        this.e = ch8Var;
        this.f = pcx0Var;
        this.g = ouqVar;
        this.h = i6rVar;
        this.i = gw3Var;
        this.j = h8jVar;
        this.k = dxi0Var;
        this.l = ysuVar;
        this.m = kx3Var;
        this.n = iv3Var;
        this.o = zs10Var;
        this.p = g1l0Var;
        this.q = hfq0Var;
        this.r = nsbVar;
        this.s = us10Var;
    }

    @Override // xsna.qcx0
    public final void a(ncx0 ncx0Var) {
        this.f.a(ncx0Var);
    }

    @Override // xsna.qcx0
    public final void b(ncx0 ncx0Var) {
        this.f.b(ncx0Var);
    }

    @Override // xsna.muq
    public final void c(CallFeature callFeature, luq luqVar) {
        this.g.c(callFeature, luqVar);
    }

    public final void d(g49 g49Var) {
        StringBuilder sb = new StringBuilder("callLifecycleListeners: ");
        CopyOnWriteArraySet<g49> copyOnWriteArraySet = this.d.b;
        L.e("CallLifecycleListenerProxy", fw3.d(copyOnWriteArraySet, sb));
        copyOnWriteArraySet.add(g49Var);
    }

    public final void e(CallFeature callFeature, luq luqVar) {
        Set<luq> putIfAbsent;
        ConcurrentHashMap<CallFeature, Set<luq>> concurrentHashMap = this.g.b;
        Set<luq> set = concurrentHashMap.get(callFeature);
        if (set == null && (putIfAbsent = concurrentHashMap.putIfAbsent(callFeature, (set = new CopyOnWriteArraySet<>()))) != null) {
            set = putIfAbsent;
        }
        set.add(luqVar);
    }

    public final void f(f39 f39Var) {
        StringBuilder sb = new StringBuilder("feedbackListeners: ");
        CopyOnWriteArraySet<f39> copyOnWriteArraySet = this.h.b;
        L.e("FeedbackListenerProxyImpl", fw3.d(copyOnWriteArraySet, sb));
        copyOnWriteArraySet.add(f39Var);
    }

    public final void g(ParticipantStatesManager.Listener listener) {
        this.l.a.add(listener);
    }

    public final void h(il90 il90Var) {
        StringBuilder sb = new StringBuilder("participantsListeners: ");
        CopyOnWriteArraySet<il90> copyOnWriteArraySet = this.b.b;
        L.e("ParticipantListenerProxy", fw3.d(copyOnWriteArraySet, sb));
        copyOnWriteArraySet.add(il90Var);
    }

    public final void i(g49 g49Var) {
        StringBuilder sb = new StringBuilder("callLifecycleListeners: ");
        CopyOnWriteArraySet<g49> copyOnWriteArraySet = this.d.b;
        L.e("CallLifecycleListenerProxy", fw3.d(copyOnWriteArraySet, sb));
        copyOnWriteArraySet.remove(g49Var);
    }

    public final void j(f39 f39Var) {
        StringBuilder sb = new StringBuilder("feedbackListeners: ");
        CopyOnWriteArraySet<f39> copyOnWriteArraySet = this.h.b;
        L.e("FeedbackListenerProxyImpl", fw3.d(copyOnWriteArraySet, sb));
        copyOnWriteArraySet.remove(f39Var);
    }

    public final void k(ParticipantStatesManager.Listener listener) {
        this.l.a.remove(listener);
    }

    public final void l(il90 il90Var) {
        StringBuilder sb = new StringBuilder("participantsListeners: ");
        CopyOnWriteArraySet<il90> copyOnWriteArraySet = this.b.b;
        L.e("ParticipantListenerProxy", fw3.d(copyOnWriteArraySet, sb));
        copyOnWriteArraySet.remove(il90Var);
    }
}
