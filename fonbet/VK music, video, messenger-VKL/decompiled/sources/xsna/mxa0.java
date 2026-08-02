package xsna;

import com.vk.log.L;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.internal.a;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: PlaybackQueueCacheCheckerDelegate.kt */
/* loaded from: classes3.dex */
public final class mxa0 {
    public final b25 a;
    public final nxa0 b;
    public final PlayerUIComponent c;
    public final bpn0 d = new bpn0(new yo80(1));

    public mxa0(b25 b25Var, nxa0 nxa0Var, PlayerUIComponent playerUIComponent) {
        this.a = b25Var;
        this.b = nxa0Var;
        this.c = playerUIComponent;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 a() {
        io.reactivex.rxjava3.core.q U;
        MusicFeatures musicFeatures = MusicFeatures.SAVING_PLAYER_STATE;
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.b()) {
            U = io.reactivex.rxjava3.core.q.T(Boolean.valueOf(bVar.a(musicFeatures)));
        } else {
            if (this.a.b() && bVar.c()) {
                asu0.a.getClass();
                asu0.n().execute(new lxa0());
            }
            U = bVar.k().a.b0(a.c.class).U(new a840(new o0p0(0, bVar, musicFeatures), 12));
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 U2 = U.a0(asu0.a.c()).U(new xq70(new lw20(this, 16), 2)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new kxa0(new tcu(17), 0));
        g600 g600Var = new g600(new t440(this, 9), 12);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U2.E(g600Var, lVar, kVar, kVar).F(new kjs(new q1(L.a, 5), 13));
    }
}
