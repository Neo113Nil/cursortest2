package xsna;

import android.content.Context;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerMode;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayAudioIds;
import com.vk.music.player.e;
import com.vk.music.player.playback.PlayableType;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.music.snippet.api.player.SnippetPlayerMode;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.bx1;
import xsna.cz40;
import xsna.fu80;
import xsna.fx40;
import xsna.g650;
import xsna.go4;
import xsna.k840;
import xsna.ry40;
import xsna.v650;
import xsna.w650;

/* compiled from: MusicSnippetsFeature.kt */
/* loaded from: classes3.dex */
public final class l650 extends wk50<b750, a750, g650, w650> implements lck0 {
    public final w950 f;
    public final f4z g;
    public final eck0 h;
    public final rbk0 i;
    public final jck0 j;
    public boolean k;
    public g650 l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;

    /* compiled from: MusicSnippetsFeature.kt */
    public final class a extends e.a {
        public a() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            l650 l650Var = l650.this;
            if (l650Var.V().x1() != PlayerMode.ADVERTISEMENT) {
                g650 g650Var = l650Var.l;
                if (g650Var != null) {
                    l650Var.C(g650Var);
                }
                l650Var.l = null;
                l650Var.V().n0(this);
            }
        }
    }

    public l650(z650 z650Var, w950 w950Var, lx4 lx4Var, ca50 ca50Var) {
        super(g650.c.a.b, z650Var);
        this.f = w950Var;
        this.g = new f4z();
        cz40.b.C2691b c2691b = cz40.b.C2691b.a;
        Context context = e43.a;
        hx40 hx40Var = new hx40(c2691b, context != null ? context : null, (otp) null, new fx40.a(new bx1.a(true, true), null, null, null, 123), (oh6) null, 52);
        fck0 fck0Var = new fck0(new go4.a(2, false), new fu80.a(false, false), 4);
        Context context2 = e43.a;
        eck0 eck0Var = new eck0(hx40Var, fck0Var, context2 != null ? context2 : null, SnippetPlayerMode.SNIPPET, lx4Var, ca50Var);
        this.h = eck0Var;
        this.i = new rbk0(hx40Var);
        this.j = new jck0(eck0Var);
        yv2 yv2Var = new yv2(23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.m = msy.a(lazyThreadSafetyMode, yv2Var);
        this.n = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.props.a(18));
        this.o = msy.a(lazyThreadSafetyMode, new b410(this, 5));
        Lazy a2 = msy.a(lazyThreadSafetyMode, new pp00(this, 11));
        this.p = a2;
        eck0Var.r().c().c.add(this);
        eck0Var.n((px40) a2.getValue());
        r5v0 r5v0Var = k840.a.h;
        this.e.b((r5v0Var != null ? r5v0Var : null).a.a.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new f5y(new k650(1, this, l650.class, "onMusicEvent", "onMusicEvent(Lcom/vk/music/events/MusicEvent;)V", 0), 8)));
    }

    @Override // xsna.lck0
    public final void E(MusicTrack musicTrack, MusicTrack musicTrack2) {
        T(new w650.d(musicTrack, musicTrack2));
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wk50
    public final void N(a750 a750Var, g650 g650Var) {
        Context context;
        g650 g650Var2 = g650Var;
        int i = 6;
        if (g650Var2 instanceof g650.c) {
            g650.c cVar = (g650.c) g650Var2;
            boolean z = cVar instanceof g650.c.a;
            w650.b bVar = w650.b.b;
            if (z) {
                T(bVar);
                tx4 U = U();
                U.a().a(new dg(U, 5), new m7(U, i));
                return;
            } else {
                if (!epx.f(cVar, g650.c.b.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(bVar);
                tx4 U2 = U();
                U2.a().a(new dg(U2, 5), new m7(U2, i));
                return;
            }
        }
        boolean z2 = g650Var2 instanceof g650.a;
        int i2 = 2;
        f4z f4zVar = this.g;
        int i3 = 1;
        if (z2) {
            g650.a aVar = (g650.a) g650Var2;
            if (aVar instanceof g650.a.c) {
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.a(new vcw(this, i3));
                com.vk.mvi.core.internal.executors.a.a(new w8q(this, 26));
                f4zVar.b(new v650.b(((g650.a.c) aVar).b));
                return;
            }
            boolean z3 = aVar instanceof g650.a.C2913a;
            ?? r8 = this.m;
            io.reactivex.rxjava3.disposables.b bVar2 = this.e;
            if (z3) {
                a630 a630Var = (a630) r8.getValue();
                MusicTrack musicTrack = ((g650.a.C2913a) aVar).b;
                if (a630Var.i(musicTrack) || musicTrack.l) {
                    bVar2.b(((a630) r8.getValue()).e1(musicTrack.Ab(), null, true).F(new nex(new ulz(9), i)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tk40(new p650(1, this.i, pbk0.class, "trackAdded", "trackAdded(I)V", 0), i2)));
                    return;
                }
                return;
            }
            if (!(aVar instanceof g650.a.d)) {
                if (!epx.f(aVar, g650.a.b.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(v650.c.a);
                return;
            } else {
                a630 a630Var2 = (a630) r8.getValue();
                MusicTrack musicTrack2 = ((g650.a.d) aVar).b;
                if (a630Var2.i0(musicTrack2)) {
                    bVar2.b(((a630) r8.getValue()).u1(musicTrack2.Ab(), true).F(new m5y(new rvq(13), i)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io1(new b810(this, 7), 29)));
                    return;
                }
                return;
            }
        }
        if (g650Var2 instanceof g650.b) {
            if (!epx.f((g650.b) g650Var2, g650.b.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(v650.a.a);
            return;
        }
        if (!(g650Var2 instanceof g650.d)) {
            throw new NoWhenBranchMatchedException();
        }
        PlayerMode x1 = V().x1();
        PlayerMode playerMode = PlayerMode.ADVERTISEMENT;
        g650.d.C2914d c2914d = g650.d.C2914d.b;
        if (x1 == playerMode && !V().m0().i()) {
            this.l = g650Var2;
            jck0 jck0Var = this.j;
            jck0Var.c.post(new rc4(jck0Var, 18));
            V().P0((a) this.o.getValue(), true);
            g650.d dVar = (g650.d) g650Var2;
            if (epx.f(dVar, c2914d)) {
                V().w1(new PlaybackActionMeta(6, 0L, 2, null));
                return;
            }
            if (dVar instanceof g650.d.a) {
                return;
            }
            if (dVar instanceof g650.d.c) {
                g650.d.c cVar2 = (g650.d.c) dVar;
                if (cVar2.e) {
                    V().w1(new PlaybackActionMeta(6, 0L, 2, null));
                    return;
                } else {
                    if (cVar2.f) {
                        V().f(new PlaybackActionMeta(6, 0L, 2, null));
                        return;
                    }
                    return;
                }
            }
            if (!(dVar instanceof g650.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            fl4 g = lyd.g();
            Context context2 = e43.a;
            context = context2 != null ? context2 : null;
            int i4 = fl4.a;
            g.x(context, false);
            V().f(new PlaybackActionMeta(6, 0L, 2, null));
            return;
        }
        g650.d dVar2 = (g650.d) g650Var2;
        if (epx.f(dVar2, c2914d)) {
            ExecutorService executorService2 = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new ycw(this, i3));
            return;
        }
        boolean z4 = dVar2 instanceof g650.d.a;
        eck0 eck0Var = this.h;
        if (z4) {
            g650.d.a aVar2 = (g650.d.a) dVar2;
            boolean z5 = aVar2.c;
            boolean z6 = aVar2.b;
            if (!z6 && !z5) {
                ExecutorService executorService3 = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.a(new m650(0, this, this));
            }
            if (this.k) {
                this.k = false;
                if (z5) {
                    ExecutorService executorService4 = com.vk.mvi.core.internal.executors.a.a;
                    com.vk.mvi.core.internal.executors.a.a(new r650(this));
                    return;
                }
                return;
            }
            if (z6) {
                ry40 state = eck0Var.c.getState();
                if ((state instanceof ry40.c) || state.j()) {
                    this.k = true;
                    ExecutorService executorService5 = com.vk.mvi.core.internal.executors.a.a;
                    com.vk.mvi.core.internal.executors.a.a(new n650(this));
                    return;
                }
                return;
            }
            return;
        }
        if (!(dVar2 instanceof g650.d.c)) {
            if (!(dVar2 instanceof g650.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ExecutorService executorService6 = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new i440(this, 3));
            com.vk.mvi.core.internal.executors.a.a(new o650(this));
            tx4 U3 = U();
            g650.d.b bVar3 = (g650.d.b) dVar2;
            String str = bVar3.b;
            MusicTrack musicTrack3 = bVar3.c;
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = MusicPlaybackLaunchContext.N;
            ack0 e = U3.a().e(musicTrack3, str);
            ((u2b0) U3.d.getValue()).N0(new lqk0(new StartPlayAudioIds(e.b), e.a, (List) null, musicPlaybackLaunchContext, 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 884));
            fl4 g2 = lyd.g();
            Context context3 = e43.a;
            context = context3 != null ? context3 : null;
            int i5 = fl4.a;
            g2.x(context, false);
            return;
        }
        g650.d.c cVar3 = (g650.d.c) dVar2;
        if (this.k) {
            return;
        }
        bck0 bck0Var = new bck0(new kx40(null, cVar3.c, null, new PlaybackLaunchMeta(MusicPlaybackLaunchContext.N, "", PlayableType.SNIPPET, PlaySourceMeta.Default.b, null, 16, null), new PlaybackActionMeta(-3, 0L, 2, null), true, cVar3.c.a0, 389), yfb.b(new Pair("section_id", cVar3.b)), 2);
        boolean z7 = cVar3.d;
        ry40 state2 = eck0Var.c.getState();
        boolean f = epx.f(eck0Var.i(), bck0Var.a.b);
        if (f && state2.j()) {
            if (z7) {
                ExecutorService executorService7 = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.a(new s650(this));
                return;
            }
            return;
        }
        if (!f || !state2.i()) {
            ExecutorService executorService8 = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new u650(this, bck0Var));
        } else if (z7) {
            ExecutorService executorService9 = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new t650(this));
        }
    }

    public final tx4 U() {
        qx4 r = this.h.r();
        r.getClass();
        SnippetPlayerMode snippetPlayerMode = SnippetPlayerMode.SNIPPET;
        if (r.a == snippetPlayerMode) {
            return r.b();
        }
        throw new IllegalStateException("This action is only applicable to the player mode " + snippetPlayerMode);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final u2b0 V() {
        return (u2b0) this.n.getValue();
    }

    @Override // xsna.lck0
    public final void n(List<nck0> list) {
        T(new w650.c(list));
        w950.p(this.f, null, null, null, 7);
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        eck0 eck0Var = this.h;
        eck0Var.r().c().c.remove(this);
        eck0Var.o(36);
        eck0Var.n(null);
        this.i.b.h();
    }

    @Override // xsna.lck0
    public final void q(Throwable th) {
        T(new w650.a(th));
    }

    @Override // xsna.lck0
    public final void v(m80 m80Var) {
        rbk0 rbk0Var = this.i;
        rbk0Var.d = 0L;
        rbk0Var.e = m80Var;
    }
}
