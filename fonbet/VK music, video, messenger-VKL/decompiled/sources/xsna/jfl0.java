package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import com.vk.bridges.di.BridgeComponent;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.AudioBookBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.AudioBookPersonBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.player.domain.state.LyricsScrollMode;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.music.stickyplayer.domain.PlayerUiMode;
import com.vk.music.stickyplayer.domain.lyrics.TabLyricsMode;
import com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import com.vk.mvi.MviLazyViewContainer;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioAttachment;
import java.util.HashMap;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.dw20;
import xsna.h1h0;
import xsna.i940;
import xsna.k840;
import xsna.mk50;
import xsna.qy90;
import xsna.sx40;
import xsna.tx40;
import xsna.tzp0;
import xsna.y050;

/* compiled from: StickyMusicPlayerMviView.kt */
/* loaded from: classes3.dex */
public final class jfl0 extends MviLazyViewContainer<rw40, dz40, sx40> {
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public qy90.c s;
    public final my40 t;
    public final com.vk.music.track.a u;
    public final sxi v;
    public cfl0 w;
    public dw20 x;

    public jfl0(Context context) {
        super(context);
        su80 su80Var = new su80(this, 23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, su80Var);
        this.h = msy.a(lazyThreadSafetyMode, new uq50(this, 29));
        this.i = msy.a(lazyThreadSafetyMode, new x850(this, 28));
        this.j = msy.a(lazyThreadSafetyMode, new odc0(this, 16));
        this.k = msy.a(lazyThreadSafetyMode, new wf40(this, 29));
        this.l = msy.a(lazyThreadSafetyMode, new pvh0(this, 3));
        this.m = msy.a(lazyThreadSafetyMode, new rme0(this, 7));
        this.n = msy.a(lazyThreadSafetyMode, new wt30(this, 21));
        this.o = msy.a(lazyThreadSafetyMode, new ajd0(this, 9));
        this.p = msy.a(lazyThreadSafetyMode, new f540(this, 28));
        this.q = msy.a(lazyThreadSafetyMode, new wm80(this, 22));
        this.r = msy.a(lazyThreadSafetyMode, new iri0(this, 5));
        PlayerUiMode playerUiMode = PlayerUiMode.LOADING;
        long j = l5g.d;
        EmptyList emptyList = EmptyList.b;
        this.t = new my40(new sy40(playerUiMode, j, null, new dy40(false, false, false, false, false, true), emptyList, emptyList, false, false, LoopMode.NONE, 0, 0, 0, DownloadingState.NotLoaded.b, LyricsScrollMode.AUTO, TabLyricsMode.PLACEHOLDER, ggp.a, false, null, null, false, false, OnboardingStrategy.None, null, 1.0f, false, new HashMap(), false, false, null));
        this.u = new com.vk.music.track.a();
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        this.v = new sxi((mzp0) rzp0.c(UiMeasuringScreen.MUSIC_PLAYER_LYRICS, null, false, 62).j(), rzp0.e(((PlayerUIComponent) ((k7m) m7m.c(this)).a(fpf0.a(PlayerUIComponent.class))).w4().a));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final i940 getAddTrackToPlaylistLauncher() {
        return (i940) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ch4 getAudioBookInteractor() {
        return (ch4) this.m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ic40 getBottomSheetLauncher() {
        return (ic40) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final BridgeComponent getBridgeComponent() {
        return (BridgeComponent) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final xl40 getKidsModeManager() {
        return (xl40) this.n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final qdz getLinksBridge() {
        return (qdz) this.q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ny40 getMusicPlayerRepository() {
        return (ny40) this.p.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final MusicPrefsComponent getMusicPrefsComponent() {
        return (MusicPrefsComponent) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final x2b0 getPlayerNavigationAnalyticsTracker() {
        return (x2b0) this.r.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final PlayerUIComponent getPlayerUiComponent() {
        return (PlayerUIComponent) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final b4b0 getSettingsOnboardingDelegate() {
        return (b4b0) this.o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final g950 getSubscriptionProvider() {
        return (g950) this.k.getValue();
    }

    public static s3q0 k(jfl0 jfl0Var, tx40 tx40Var) {
        qy90.c cVar;
        if (epx.f(tx40Var, tx40.c.a)) {
            qy90.c cVar2 = jfl0Var.s;
            if (cVar2 != null) {
                cVar2.c();
            }
        } else if (epx.f(tx40Var, tx40.b.a)) {
            qy90.c cVar3 = jfl0Var.s;
            if (cVar3 != null) {
                cVar3.q();
            }
        } else if (tx40Var instanceof tx40.o) {
            tx40.o oVar = (tx40.o) tx40Var;
            if (oVar.a.Mb()) {
                Integer num = oVar.a.d0;
                if (num != null) {
                    int intValue = num.intValue();
                    kbj0.c(jfl0Var.getBridgeComponent().h8(), jfl0Var.getContext(), i5s.a(new StringBuilder("https://"), a0a.d, "/audiobook") + intValue, true, null, null, false, 120);
                }
            } else {
                kbj0.e(jfl0Var.getBridgeComponent().h8(), jfl0Var.getContext(), new AudioAttachment(oVar.a), false, null, true, null, 44);
            }
        } else if (tx40Var instanceof tx40.k) {
            tx40.k kVar = (tx40.k) tx40Var;
            Activity h = e3m.h(jfl0Var.getContext());
            if (h != null) {
                jfl0Var.getBridgeComponent().Le().U().a(h, new y050.b.C4065b(kVar.a, kVar.b, null, null, null, kVar.c, 60));
            }
        } else if (tx40Var instanceof tx40.l) {
            tx40.l lVar = (tx40.l) tx40Var;
            Activity h2 = e3m.h(jfl0Var.getContext());
            if (h2 != null) {
                jfl0Var.getBridgeComponent().Le().v(h2, lVar.a, MusicPlaybackLaunchContext.v.Cb(lVar.b));
            }
        } else if (tx40Var instanceof tx40.m) {
            tx40.m mVar = (tx40.m) tx40Var;
            Activity h3 = e3m.h(jfl0Var.getContext());
            if (h3 != null) {
                MusicPlaybackLaunchContext Cb = MusicPlaybackLaunchContext.Fb(mVar.c).Cb(mVar.d);
                fl4 Le = jfl0Var.getBridgeComponent().Le();
                UserId userId = mVar.a;
                int i = mVar.b;
                int i2 = fl4.a;
                Le.O(h3, userId, i, Cb, null);
            }
        } else if (tx40Var instanceof tx40.g) {
            tx40.g gVar = (tx40.g) tx40Var;
            Activity h4 = e3m.h(jfl0Var.getContext());
            if (h4 != null) {
                jfl0Var.getBridgeComponent().Le().s(h4, gVar.a, gVar.b);
            }
        } else if (tx40Var instanceof tx40.e) {
            tx40.e eVar = (tx40.e) tx40Var;
            Activity h5 = e3m.h(jfl0Var.getContext());
            if (h5 != null) {
                ic40 w = jfl0Var.getBridgeComponent().Le().w();
                AudioBookBottomSheetLaunchPoint audioBookBottomSheetLaunchPoint = eVar.b;
                w.o(h5, eVar.a, audioBookBottomSheetLaunchPoint, eVar.c, epx.f(audioBookBottomSheetLaunchPoint, AudioBookBottomSheetLaunchPoint.BigPlayer.b));
            }
        } else if (tx40Var instanceof tx40.f) {
            tx40.f fVar = (tx40.f) tx40Var;
            Activity h6 = e3m.h(jfl0Var.getContext());
            if (h6 != null) {
                jfl0Var.getAudioBookInteractor().d(h6, fVar.a, AudioBookPersonBottomSheetLaunchPoint.Player.b, fVar.b);
            }
        } else {
            if (tx40Var instanceof tx40.p) {
                tx40.p pVar = (tx40.p) tx40Var;
                Activity h7 = e3m.h(jfl0Var.getContext());
                if (h7 != null) {
                    fl4 Le2 = jfl0Var.getBridgeComponent().Le();
                    String str = pVar.a;
                    Boolean valueOf = Boolean.valueOf(pVar.b);
                    int i3 = fl4.a;
                    Le2.M(h7, str, null, valueOf);
                }
            } else if (tx40Var instanceof tx40.r) {
                tx40.r rVar = (tx40.r) tx40Var;
                Activity h8 = e3m.h(jfl0Var.getContext());
                if (h8 != null) {
                    MusicPlaybackLaunchContext musicPlaybackLaunchContext = MusicPlaybackLaunchContext.A;
                    PlayerTrack playerTrack = rVar.a;
                    ic40.r(jfl0Var.getBridgeComponent().Le().w(), h8, new MusicBottomSheetLaunchPoint.Player.Full(playerTrack), playerTrack.b, musicPlaybackLaunchContext.Cb(jnj.a(playerTrack.b.V)), null, rVar.c, rVar.b, null, null, 384);
                }
            } else if (tx40Var instanceof tx40.d) {
                tx40.d dVar = (tx40.d) tx40Var;
                Activity h9 = e3m.h(jfl0Var.getContext());
                if (h9 != null) {
                    fl4 Le3 = jfl0Var.getBridgeComponent().Le();
                    MusicTrack musicTrack = dVar.a;
                    Le3.m(h9, musicTrack, true, MusicPlaybackLaunchContext.A.Cb(jnj.a(musicTrack.V)));
                }
            } else if (tx40Var instanceof tx40.a) {
                tx40.a aVar = (tx40.a) tx40Var;
                Activity h10 = e3m.h(jfl0Var.getContext());
                if (h10 != null) {
                    if (!jfl0Var.getAddTrackToPlaylistLauncher().b(h10, new i940.b(aVar.a, aVar.b, aVar.c)).a() && (cVar = jfl0Var.s) != null) {
                        cVar.q();
                    }
                }
            } else if (tx40Var instanceof tx40.h) {
                tx40.h hVar = (tx40.h) tx40Var;
                Activity h11 = e3m.h(jfl0Var.getContext());
                if (h11 != null) {
                    jfl0Var.getBridgeComponent().Le().q(h11, hVar.a, hVar.b.equals("kids_section") ? hVar.b : null);
                }
            } else if (epx.f(tx40Var, tx40.u.a)) {
                Context context = jfl0Var.getContext();
                lpj lpjVar = context instanceof lpj ? (lpj) context : null;
                Integer valueOf2 = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                dhr0.a.getClass();
                int i4 = dhr0.u().c;
                if (valueOf2 == null || valueOf2.intValue() != i4) {
                    context = new l7s(context, dhr0.u().c);
                }
                jfl0Var.x = new h1h0.a(context, new in60(jfl0Var, 18), new lva0(jfl0Var, 21)).I0("SaveTracksInPlaylistBottomSheet");
            } else if (tx40Var instanceof tx40.t) {
                tx40.t tVar = (tx40.t) tx40Var;
                Activity h12 = e3m.h(jfl0Var.getContext());
                if (h12 != null) {
                    jfl0Var.getBridgeComponent().Le().w().c(h12, tVar.b, new MusicBottomSheetLaunchPoint.Player.Full(tVar.a), true);
                }
            } else if (tx40Var instanceof tx40.j) {
                boolean z = ((tx40.j) tx40Var).a;
                Activity h13 = e3m.h(jfl0Var.getContext());
                if (h13 != null) {
                    jfl0Var.getBridgeComponent().Le().w().i(h13, false, true, z, false);
                }
            } else if (epx.f(tx40Var, tx40.i.a)) {
                Activity h14 = e3m.h(jfl0Var.getContext());
                if (h14 != null) {
                    l7s u = bwt0.u(h14);
                    new dw20.b(u, new tzp0.c(null, false)).v0(R.string.music_playback_speed).c(new cpo(false, 0, 6)).D0(new nib0(u), false).h0(R.string.done, new im80(3)).I0(null);
                }
            } else if (epx.f(tx40Var, tx40.q.a)) {
                Activity h15 = e3m.h(jfl0Var.getContext());
                if (h15 != null) {
                    jfl0Var.getBottomSheetLauncher().g(h15, true);
                }
            } else if (tx40Var instanceof tx40.n) {
                tx40.n nVar = (tx40.n) tx40Var;
                Activity h16 = e3m.h(jfl0Var.getContext());
                if (h16 != null) {
                    jfl0Var.getBridgeComponent().Le().w().q(h16, nVar.b, new twi0(4, jfl0Var, nVar), new MusicBottomSheetLaunchPoint.Player.Full(nVar.a));
                }
            } else {
                if (!(tx40Var instanceof tx40.s)) {
                    throw new NoWhenBranchMatchedException();
                }
                maz.c(jfl0Var.getLinksBridge().e(), jfl0Var.getContext(), ((tx40.s) tx40Var).a, LaunchContext.A, null, null, 24);
            }
        }
        return s3q0.a;
    }

    public static s3q0 l(jfl0 jfl0Var, iw40 iw40Var) {
        ms1 ms1Var = new ms1(jfl0Var.u, new w1i(0, jfl0Var.getSubscriptionProvider(), g950.class, "hasMusicSubscriptionForOffline", "hasMusicSubscriptionForOffline()Z", 0, 2));
        Activity h = e3m.h(jfl0Var.getContext());
        if (h != null) {
            if (iw40Var instanceof fw40) {
                a630.d1(ms1Var, h, ((fw40) iw40Var).a, true);
            } else if (iw40Var instanceof hw40) {
                ms1Var.M(h, ((hw40) iw40Var).a);
            } else if (iw40Var instanceof dw40) {
                MusicTrack musicTrack = ((dw40) iw40Var).a;
                ms1Var.h = true;
                ic40 w = lyd.g().w();
                MusicBottomSheetLaunchPoint.Delete delete = MusicBottomSheetLaunchPoint.Delete.b;
                MusicPlaybackLaunchContext musicPlaybackLaunchContext = MusicPlaybackLaunchContext.d;
                u2b0 b = k840.a.g().b();
                bpn0 bpn0Var = enj.a;
                w.e(delete, musicPlaybackLaunchContext, ms1Var, ms1Var.e, b, musicTrack, ms1Var.b, true, e3m.h(h));
            } else if (iw40Var instanceof ew40) {
                ew40 ew40Var = (ew40) iw40Var;
                ms1Var.P(h, ew40Var.a, ew40Var.b, true);
            } else if (iw40Var instanceof gw40) {
                gw40 gw40Var = (gw40) iw40Var;
                ms1Var.y1(h, gw40Var.a, gw40Var.b);
            } else {
                if (!(iw40Var instanceof cw40)) {
                    throw new NoWhenBranchMatchedException();
                }
                cw40 cw40Var = (cw40) iw40Var;
                ms1Var.P(h, cw40Var.a, cw40Var.b, false);
            }
        }
        return s3q0.a;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        cfl0 cfl0Var = new cfl0(getViewOwner(), getContext(), this.v, getMusicPrefsComponent().Q0(), getPlayerUiComponent().Ra().a, getSubscriptionProvider());
        this.w = cfl0Var;
        mzp0 mzp0Var = (mzp0) this.v.c;
        if (mzp0Var != null) {
            mzp0Var.e(cfl0Var.c());
        }
        return new mk50.c(cfl0Var.d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        dz40 dz40Var = (dz40) ao50Var;
        cfl0 cfl0Var = this.w;
        if (cfl0Var != null) {
            cfl0Var.f(dz40Var, new xd8(1, this, jfl0.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 9));
        }
    }

    @Override // com.vk.mvi.MviLazyViewContainer, xsna.xn50
    public final void R4(vk50 vk50Var) {
        rw40 rw40Var = (rw40) vk50Var;
        rw40Var.u.a(new svk0(this, 3), getViewOwner());
        rw40Var.v.a(new gqe0(this, 8), getViewOwner());
        rw40Var.w.a(new xc50(this, 23), getViewOwner());
        rw40Var.x.a(new i750(this, 29), getViewOwner());
    }

    public final qy90.c getController() {
        return this.s;
    }

    public final void m(ParentBottomSheetState parentBottomSheetState) {
        cfl0 cfl0Var = this.w;
        if (cfl0Var != null) {
            ((zak0) cfl0Var.i.d).setValue(parentBottomSheetState);
        }
        Activity h = e3m.h(getContext());
        if (h != null) {
            sw40 sw40Var = getFeature().N;
            if (parentBottomSheetState != ParentBottomSheetState.EXPANDED) {
                sw40Var = null;
            }
            getAddTrackToPlaylistLauncher().a(h, sw40Var);
        }
    }

    @Override // com.vk.mvi.MviLazyViewContainer, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dw20 dw20Var = this.x;
        if (dw20Var != null) {
            dw20Var.hide();
        }
        Activity h = e3m.h(getContext());
        if (h != null) {
            getAddTrackToPlaylistLauncher().a(h, null);
        }
    }

    public final void setController(qy90.c cVar) {
        this.s = cVar;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        sx40.i iVar = sx40.i.b;
        ix4 ix4Var = k840.b;
        com.vk.music.pref.a Q0 = getMusicPrefsComponent().Q0();
        b25 s = getBridgeComponent().s();
        s750 s750Var = k840.a.e;
        if (s750Var == null) {
            s750Var = null;
        }
        return new rw40(iVar, this.t, this.u, ix4Var, Q0, s, new ls4(getSubscriptionProvider(), getPlayerNavigationAnalyticsTracker(), s750Var), getKidsModeManager(), getSettingsOnboardingDelegate(), getPlayerUiComponent().O6(), getMusicPlayerRepository(), this.v, getSubscriptionProvider());
    }
}
