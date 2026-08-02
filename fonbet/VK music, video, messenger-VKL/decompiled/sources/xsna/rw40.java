package xsna;

import android.content.Context;
import android.media.AudioManager;
import com.google.zxing.pdf417.PDF417Common;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.reactions.Reaction;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayAudioBookSource;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.player.StartPlaySimilarTracksSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayUserSource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.player.domain.state.LyricsScrollMode;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.music.pref.CrossfadeOnboarding;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.stats.MusicActionTracker;
import com.vk.music.stickyplayer.domain.CoverSwipeDirection;
import com.vk.music.stickyplayer.domain.PlayerUiMode;
import com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy;
import com.vk.network.kbh.state.NetworkState;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistViewItem;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.MusicFeatures;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.by40;
import xsna.e8v0;
import xsna.hn40;
import xsna.k840;
import xsna.ls4;
import xsna.qy40;
import xsna.sx40;
import xsna.tx40;

/* compiled from: MusicPlayerFeature.kt */
/* loaded from: classes3.dex */
public final class rw40 extends wk50<dz40, sy40, sx40, by40> {
    public final u750 A;
    public Playlist B;
    public final vm4 C;
    public boolean D;
    public final Object E;
    public final Object F;
    public boolean G;
    public boolean H;
    public final Object I;
    public final xw40 J;
    public final tw40 K;
    public final zw40 L;
    public final yep0 M;
    public final sw40 N;
    public final uw40 O;
    public final my40 f;
    public final a630 g;
    public final hx4 h;
    public final com.vk.music.pref.a i;
    public final b25 j;
    public final ls4 k;
    public final xl40 l;
    public final b4b0 m;
    public final qww n;
    public final ny40 o;
    public final sxi p;
    public final io.reactivex.rxjava3.disposables.g q;
    public final io.reactivex.rxjava3.disposables.g r;
    public final io.reactivex.rxjava3.disposables.g s;
    public final io.reactivex.rxjava3.disposables.g t;
    public final f4z u;
    public final f4z v;
    public final f4z w;
    public final f4z x;
    public final u2b0 y;
    public final ArrayList z;

    /* compiled from: MusicPlayerFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoverSwipeDirection.values().length];
            try {
                iArr[CoverSwipeDirection.Next.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoverSwipeDirection.Prev.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MusicPlayerFeature.kt */
    public final class b implements izs<Long, s3q0> {
        public b() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(Long l) {
            rw40.this.T(by40.q.b);
            return s3q0.a;
        }
    }

    /* compiled from: MusicPlayerFeature.kt */
    public final class c implements izs<da00, s3q0> {
        public c() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(da00 da00Var) {
            da00 da00Var2 = da00Var;
            rw40 rw40Var = rw40.this;
            ((mzp0) rw40Var.p.b).c(false);
            rw40Var.q.b(null);
            if (epx.f(da00Var2, ggp.a)) {
                rw40Var.T(by40.r.b);
            } else {
                rw40Var.T(new by40.p(da00Var2));
            }
            return s3q0.a;
        }
    }

    /* compiled from: MusicPlayerFeature.kt */
    public final class d implements izs<Throwable, s3q0> {
        public d() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            rw40 rw40Var = rw40.this;
            io.reactivex.rxjava3.disposables.g gVar = rw40Var.q;
            sxi sxiVar = rw40Var.p;
            gVar.b(null);
            if ((th2 instanceof VKApiExecutionException) && ((VKApiExecutionException) th2).s() == 104) {
                ((mzp0) sxiVar.b).c(false);
                rw40Var.T(by40.r.b);
            } else {
                ((mzp0) sxiVar.b).f();
                rw40Var.T(by40.o.b);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MusicPlayerFeature.kt */
    public final class e implements gzs<s3q0> {
        public final /* synthetic */ sx40.n c;

        public e(sx40.n nVar) {
            this.c = nVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            rw40.this.y.G0(((sx40.n.e) this.c).b, new PlaybackActionMeta(17, 0L, 2, null));
            return s3q0.a;
        }
    }

    /* compiled from: MusicPlayerFeature.kt */
    public static final class f implements io.reactivex.rxjava3.functions.f {
        public final /* synthetic */ izs b;

        public f(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final /* synthetic */ void accept(Object obj) {
            this.b.invoke(obj);
        }
    }

    public rw40(sx40 sx40Var, my40 my40Var, com.vk.music.track.a aVar, hx4 hx4Var, com.vk.music.pref.a aVar2, b25 b25Var, ls4 ls4Var, xl40 xl40Var, b4b0 b4b0Var, qww qwwVar, ny40 ny40Var, sxi sxiVar, g950 g950Var) {
        super(sx40Var, my40Var);
        this.f = my40Var;
        this.g = aVar;
        this.h = hx4Var;
        this.i = aVar2;
        this.j = b25Var;
        this.k = ls4Var;
        this.l = xl40Var;
        this.m = b4b0Var;
        this.n = qwwVar;
        this.o = ny40Var;
        this.p = sxiVar;
        io.reactivex.rxjava3.disposables.g gVar = new io.reactivex.rxjava3.disposables.g();
        this.q = new io.reactivex.rxjava3.disposables.g();
        this.r = new io.reactivex.rxjava3.disposables.g();
        io.reactivex.rxjava3.disposables.g gVar2 = new io.reactivex.rxjava3.disposables.g();
        this.s = gVar2;
        this.t = new io.reactivex.rxjava3.disposables.g();
        f4z f4zVar = new f4z();
        this.u = f4zVar;
        this.v = new f4z();
        f4z f4zVar2 = new f4z();
        this.w = f4zVar2;
        f4z f4zVar3 = new f4z();
        this.x = f4zVar3;
        u2b0 b2 = k840.a.g().b();
        this.y = b2;
        this.z = new ArrayList();
        s750 s750Var = k840.a.e;
        this.A = s750Var == null ? null : s750Var;
        com.vk.music.notifications.restriction.a aVar3 = k840.a.d;
        com.vk.music.notifications.restriction.a aVar4 = aVar3 != null ? aVar3 : null;
        iz3 iz3Var = new iz3(14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E = msy.a(lazyThreadSafetyMode, iz3Var);
        this.F = msy.a(lazyThreadSafetyMode, new x0(25));
        this.I = msy.a(lazyThreadSafetyMode, new ubw(this, 13));
        xw40 xw40Var = new xw40(this);
        this.J = xw40Var;
        tw40 tw40Var = new tw40(this);
        this.K = tw40Var;
        zw40 zw40Var = new zw40(this);
        this.L = zw40Var;
        m840 m840Var = new m840(aVar, b2, f4zVar, f4zVar3, aVar4, this.e);
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        this.M = new yep0(m840Var, new agb0(aVar, f4zVar, f4zVar2, bVar), new uc4(b2, f4zVar), new kte0(aVar, f4zVar, f4zVar2, f4zVar3, bVar));
        this.N = new sw40(this);
        uw40 uw40Var = new uw40(this);
        this.O = uw40Var;
        b2.P0(xw40Var, true);
        com.vk.music.player.d dVar = k840.a.f;
        (dVar == null ? null : dVar).a(zw40Var);
        qwwVar.a(uw40Var);
        vm4 vm4Var = new vm4(this);
        this.C = vm4Var;
        Context context = e43.a;
        ((AudioManager) (context == null ? null : context).getSystemService("audio")).registerAudioDeviceCallback(vm4Var, null);
        r5v0 r5v0Var = k840.a.h;
        gVar.b((r5v0Var != null ? r5v0Var : null).a.a.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new pdw(new td5(1, this, rw40.class, "resolveMusicEvent", "resolveMusicEvent(Lcom/vk/music/events/MusicEvent;)V", 0, 13), 7)));
        this.e.d(gVar, gVar2);
        boolean b3 = g950Var.b();
        hn40 o = com.vk.toggle.d.o();
        if ((o instanceof hn40.b) && (((hn40.b) o).b || b3)) {
            VkOnboardingCampaign vkOnboardingCampaign = b4b0Var.b;
            q7v0 q7v0Var = b4b0Var.a;
            if (q7v0Var.isReady() && vkOnboardingCampaign != null && q7v0Var.d(vkOnboardingCampaign) && q7v0Var.b(vkOnboardingCampaign, false) && fg40.a() == null) {
                aVar2.D(CrossfadeOnboarding.BothOnboardings);
            }
        }
        CoreFeatures coreFeatures = CoreFeatures.KBH_DETECT;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            d6q0.c(tw40Var);
        }
    }

    public static final void U(rw40 rw40Var, MusicTrack musicTrack) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String str = vm40.a;
        mhy.a(context, vm40.d(musicTrack));
        rw40Var.w.b(qy40.a.e.b);
    }

    public static void c0(String str) {
        String valueOf = String.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
        UiTracker uiTracker = UiTracker.a;
        new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.EVENT, null, null, null, null, null, 62, null), valueOf, valueOf, null, new CommonAudioStat$TypeAudioArtistViewItem(new CommonStat$TypeTrackCodeItem(str), CommonAudioStat$TypeAudioArtistViewItem.RefSource.CONCERT_PLAYER_CHIPS), 8)).q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x03e1, code lost:
    
        r7 = r6.incrementalCount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03e7, code lost:
    
        if ((r7 instanceof com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy.b.a) == false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x03e9, code lost:
    
        r7 = r6.preciseCount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03f3, code lost:
    
        if (r2 <= ((com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy.b.a) r7).a) goto L801;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03f5, code lost:
    
        r7 = r6.preciseCount;
        r7 = r2 - ((com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy.b.a) r7).a;
        r6 = r6.incrementalCount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x040c, code lost:
    
        if ((r7 % ((com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy.b.a) r6).a) != 0) goto L802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x040e, code lost:
    
        r15 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0411, code lost:
    
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0414, code lost:
    
        if (r2 != null) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0416, code lost:
    
        r2 = com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy.None;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0410, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0419, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03bf, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03c2, code lost:
    
        if (r4 != null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03c4, code lost:
    
        r4 = com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy.h().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03d0, code lost:
    
        if (r4.hasNext() == false) goto L793;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03d2, code lost:
    
        r5 = r4.next();
        r6 = (com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy) r5;
        r7 = r6.preciseCount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03df, code lost:
    
        if ((r7 instanceof com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy.b.a) == false) goto L799;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x033b  */
    /* JADX WARN: Type inference failed for: r13v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object] */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(sy40 sy40Var, sx40 sx40Var) {
        com.vk.music.pref.a aVar;
        u2b0 u2b0Var;
        String str;
        b4b0 b4b0Var;
        VkOnboardingCampaign vkOnboardingCampaign;
        MusicTrack musicTrack;
        MusicTrack musicTrack2;
        MusicTrack musicTrack3;
        MusicTrack musicTrack4;
        PlayerTrack playerTrack;
        String str2;
        AudioBook audioBook;
        MusicTrack musicTrack5;
        MusicTrack musicTrack6;
        MusicTrack musicTrack7;
        iw40 dw40Var;
        AudioBook audioBook2;
        iw40 fw40Var;
        AudioBook audioBook3;
        iw40 hw40Var;
        AudioBook audioBook4;
        MusicTrack musicTrack8;
        n10 a2;
        n10 a3;
        PlayerTrack playerTrack2;
        MusicTrack musicTrack9;
        ArrayList arrayList;
        MusicTrack musicTrack10;
        MusicTrack musicTrack11;
        OnboardingStrategy onboardingStrategy;
        OnboardingStrategy onboardingStrategy2;
        OnboardingStrategy.b bVar;
        OnboardingStrategy.b bVar2;
        MusicTrack musicTrack12;
        List<izs<sx40, Boolean>> list;
        Iterator it;
        MusicTrack musicTrack13;
        yza0 yza0Var;
        MusicTrack b2;
        sy40 sy40Var2 = sy40Var;
        sx40 sx40Var2 = sx40Var;
        com.vk.music.pref.a aVar2 = this.i;
        f4z f4zVar = this.w;
        u2b0 u2b0Var2 = this.y;
        f4z f4zVar2 = this.x;
        f4z f4zVar3 = this.u;
        yep0 yep0Var = this.M;
        StartPlaySource startPlaySource = sy40Var2.t;
        dy40 dy40Var = sy40Var2.e;
        List<PlayerTrack> list2 = sy40Var2.f;
        PlayerTrack playerTrack3 = sy40Var2.d;
        boolean z = sy40Var2.h;
        if (this.K.a == NetworkState.UNSTABLE && ((sx40Var2 instanceof sx40.b.k) || (sx40Var2 instanceof sx40.r0) || ((b2 = u2b0Var2.b()) != null && !b2.S4() && (((sx40Var2 instanceof sx40.o0) && !z) || (sx40Var2 instanceof sx40.h0) || (sx40Var2 instanceof sx40.g0) || (sx40Var2 instanceof sx40.f))))) {
            d6q0.a.getClass();
            d6q0.l(true, false);
            return;
        }
        ls4 ls4Var = this.k;
        PlayState m0 = u2b0Var2.m0();
        boolean z2 = sy40Var2.B;
        boolean z3 = sy40Var2.b == PlayerUiMode.ADVERTISEMENT;
        ls4Var.getClass();
        if (playerTrack3 != null && (musicTrack13 = playerTrack3.b) != null && !z2) {
            boolean z4 = z3;
            z290 z290Var = ls4Var.b;
            if (z4) {
                yza0Var = (yza0) z290Var.c.getValue();
            } else {
                z290Var.getClass();
                yza0Var = musicTrack13.Wb() ? (yza0) z290Var.a.getValue() : musicTrack13.Tb() ? (yza0) z290Var.b.getValue() : null;
            }
            if (yza0Var != null) {
                aVar = aVar2;
                int i = musicTrack13.b;
                u2b0Var = u2b0Var2;
                if (sx40Var2 instanceof sx40.g0) {
                    yza0Var.q(i, ((sx40.g0) sx40Var2).b);
                } else if (sx40Var2 instanceof sx40.h0) {
                    yza0Var.t(i, ((sx40.h0) sx40Var2).b);
                } else if (sx40Var2.equals(sx40.s0.b)) {
                    yza0Var.l();
                } else if (sx40Var2.equals(sx40.k0.b)) {
                    yza0Var.B();
                } else if (sx40Var2 instanceof sx40.l) {
                    Iterator<PlayerTrack> it2 = list2.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i2 = -1;
                            break;
                        } else if (epx.f(it2.next().f, ((sx40.l) sx40Var2).b)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 >= 0) {
                        yza0Var.u(list2.get(i2).b.b, i2);
                    }
                } else if (sx40Var2.equals(sx40.p0.b)) {
                    int i3 = ls4.a.$EnumSwitchMapping$0[m0.ordinal()];
                    if (i3 == 1) {
                        yza0Var.g(i);
                    } else if (i3 == 2) {
                        Iterator<PlayerTrack> it3 = list2.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                i4 = -1;
                                break;
                            }
                            Iterator<PlayerTrack> it4 = it3;
                            if (epx.f(it3.next().b, musicTrack13)) {
                                break;
                            }
                            i4++;
                            it3 = it4;
                        }
                        yza0Var.u(i, i4);
                    }
                } else if (sx40Var2 instanceof sx40.o0) {
                    int i5 = ls4.a.$EnumSwitchMapping$0[m0.ordinal()];
                    if (i5 == 1) {
                        yza0Var.h(i, ((sx40.o0) sx40Var2).b);
                    } else if (i5 == 2) {
                        yza0Var.i(musicTrack13, ((sx40.o0) sx40Var2).b);
                    }
                } else if (sx40Var2.equals(sx40.s.b)) {
                    yza0Var.E();
                } else if (sx40Var2.equals(sx40.d.b)) {
                    yza0Var.r();
                } else if (sx40Var2.equals(sx40.f.b)) {
                    yza0Var.w();
                } else if (sx40Var2.equals(sx40.v.b)) {
                    yza0Var.a(playerTrack3.c.e instanceof PlaySourceMeta.VKMixPlaySourceMeta);
                } else if (sx40Var2 instanceof sx40.m0) {
                    sx40.m0 m0Var = (sx40.m0) sx40Var2;
                    yza0Var.k(m0Var.b, m0Var.c);
                } else if (sx40Var2 instanceof sx40.t) {
                    yza0Var.b(((sx40.t) sx40Var2).b);
                } else if (sx40Var2 instanceof sx40.c0) {
                    yza0Var.x();
                } else if (sx40Var2 instanceof sx40.q0) {
                    yza0Var.C(((sx40.q0) sx40Var2).b);
                } else if (sx40Var2 instanceof sx40.n0) {
                    yza0Var.e(((sx40.n0) sx40Var2).b);
                } else if (sx40Var2 instanceof sx40.r0) {
                    yza0Var.p();
                } else if (sx40Var2.equals(sx40.x.b)) {
                    yza0Var.F();
                } else if (sx40Var2.equals(sx40.l0.b)) {
                    yza0Var.s();
                } else if (sx40Var2 instanceof sx40.i0) {
                    yza0Var.d(((sx40.i0) sx40Var2).c);
                } else if (sx40Var2.equals(sx40.b.a.b)) {
                    yza0Var.D();
                } else if (sx40Var2.equals(sx40.b.c.b)) {
                    yza0Var.c();
                } else if (sx40Var2.equals(sx40.b.g.b)) {
                    yza0Var.y();
                } else if (sx40Var2 instanceof sx40.b.i) {
                    yza0Var.G(((sx40.b.i) sx40Var2).b);
                } else if (sx40Var2 instanceof sx40.b.j) {
                    yza0Var.m(((sx40.b.j) sx40Var2).b, ls4Var.a.b(), musicTrack13.U);
                } else if (sx40Var2.equals(sx40.b.k.b)) {
                    yza0Var.A();
                } else if (sx40Var2.equals(sx40.a0.b)) {
                    yza0Var.H();
                } else if (sx40Var2 instanceof sx40.y) {
                    yza0Var.o();
                } else if (sx40Var2 instanceof sx40.j) {
                    yza0Var.v();
                } else if (sx40Var2.equals(sx40.c.b)) {
                    yza0Var.f();
                } else if (sx40Var2 instanceof sx40.a.d) {
                    yza0Var.b(((sx40.a.d) sx40Var2).b);
                } else if (sx40Var2 instanceof sx40.a.c) {
                    yza0Var.z();
                } else if (sx40Var2 instanceof sx40.a.b) {
                    yza0Var.j();
                } else if (sx40Var2 instanceof sx40.a.C3698a) {
                    yza0Var.n();
                }
                yep0Var.getClass();
                m840 m840Var = yep0Var.a;
                if (playerTrack3 != null && (musicTrack12 = playerTrack3.b) != null && musicTrack12.Rb()) {
                    list = yep0Var.e;
                    if ((list instanceof Collection) || !list.isEmpty()) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (((Boolean) ((izs) it.next()).invoke(sx40Var2)).booleanValue()) {
                                f4zVar.b(qy40.a.q.b);
                                f4zVar2.b(MusicHapticEvent.ERROR);
                                return;
                            }
                        }
                    }
                }
                if (!(sx40Var2 instanceof sx40.i)) {
                    PlayerUiMode playerUiMode = !u2b0Var.I1() ? PlayerUiMode.ADVERTISEMENT : u2b0Var.A0() ? PlayerUiMode.VK_MIX : u2b0Var.z0() ? PlayerUiMode.RADIO : u2b0Var.T0() ? PlayerUiMode.PODCAST : u2b0Var.E0() ? PlayerUiMode.AUDIOBOOK : PlayerUiMode.MUSIC;
                    if (aVar.R()) {
                        OnboardingStrategy.Companion.getClass();
                        long s = aVar.s();
                        if (aVar.q() != CrossfadeOnboarding.BothOnboardings) {
                            Iterator it5 = OnboardingStrategy.h().iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    onboardingStrategy2 = 0;
                                    break;
                                }
                                onboardingStrategy2 = it5.next();
                                OnboardingStrategy onboardingStrategy3 = (OnboardingStrategy) onboardingStrategy2;
                                bVar = onboardingStrategy3.preciseCount;
                                if (bVar instanceof OnboardingStrategy.b.a) {
                                    bVar2 = onboardingStrategy3.preciseCount;
                                    if (((OnboardingStrategy.b.a) bVar2).a == s) {
                                        break;
                                    }
                                } else if (!epx.f(bVar, OnboardingStrategy.b.C1357b.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        } else {
                            onboardingStrategy = OnboardingStrategy.CrossfadeAnimation;
                        }
                    } else {
                        onboardingStrategy = OnboardingStrategy.None;
                    }
                    T(new by40.m(playerUiMode, onboardingStrategy, MusicFeatures.AUDIO_KIDS_MODE_PLAYER_UI.h() && this.l.isEnabled().getValue().booleanValue()));
                    return;
                }
                if (sx40Var2.equals(sx40.d.b)) {
                    this.G = false;
                    f4zVar3.b(tx40.b.a);
                    return;
                }
                int i6 = 10;
                if (sx40Var2.equals(sx40.f.b)) {
                    this.G = true;
                    if (this.H) {
                        List<Artist> list3 = (playerTrack3 == null || (musicTrack11 = playerTrack3.b) == null) ? null : musicTrack11.t;
                        List<Artist> list4 = (playerTrack3 == null || (musicTrack10 = playerTrack3.b) == null) ? null : musicTrack10.u;
                        if (list3 != null) {
                            List<Artist> list5 = list3;
                            ArrayList arrayList2 = new ArrayList(c5g.u(list5, 10));
                            Iterator it6 = list5.iterator();
                            while (it6.hasNext()) {
                                arrayList2.add(((Artist) it6.next()).b);
                            }
                            if (list4 != null) {
                                List<Artist> list6 = list4;
                                arrayList = new ArrayList(c5g.u(list6, 10));
                                Iterator it7 = list6.iterator();
                                while (it7.hasNext()) {
                                    arrayList.add(((Artist) it7.next()).b);
                                }
                            } else {
                                arrayList = null;
                            }
                            X(new lt3(arrayList2, arrayList));
                            this.H = false;
                        }
                    }
                    f4zVar3.b(tx40.c.a);
                    return;
                }
                if (sx40Var2 instanceof sx40.s) {
                    if (playerTrack3 == null || (musicTrack9 = playerTrack3.b) == null) {
                        return;
                    }
                    f4zVar3.b(new tx40.o(musicTrack9));
                    return;
                }
                if (sx40Var2 instanceof sx40.v) {
                    PlayerTrack playerTrack4 = sy40Var2.d;
                    n10 a4 = playerTrack4 != null ? yep0Var.a(playerTrack4) : null;
                    if (a4 != null) {
                        a4.e(sy40Var2);
                        return;
                    }
                    return;
                }
                if (!(sx40Var2 instanceof sx40.t)) {
                    if (sx40Var2 instanceof sx40.a) {
                        m840Var.f(sy40Var2, (sx40.a) sx40Var2);
                        return;
                    }
                    if (sx40Var2 instanceof sx40.r) {
                        PlayerTrack o0 = u2b0Var.o0();
                        if (o0 != null) {
                            Reaction reaction = sy40Var2.A.get(o0.b);
                            f4zVar3.b(new tx40.n(o0, reaction != null ? reaction.b : null));
                            return;
                        }
                        return;
                    }
                    if (sx40Var2 instanceof sx40.d0) {
                        sx40.d0 d0Var = (sx40.d0) sx40Var2;
                        T(new by40.z(d0Var.b, d0Var.c));
                        return;
                    }
                    if (sx40Var2 instanceof sx40.r0) {
                        yep0Var.b(sy40Var2, ((sx40.r0) sx40Var2).b);
                        return;
                    }
                    if (sx40Var2 instanceof sx40.m0) {
                        if (dy40Var.b == ((sx40.m0) sx40Var2).b || playerTrack3 == null || (a2 = yep0Var.a(playerTrack3)) == null) {
                            return;
                        }
                        if (dy40Var.a) {
                            a2.c(sy40Var2, playerTrack3.b);
                            return;
                        } else {
                            if (dy40Var.b) {
                                a2.a(sy40Var2, playerTrack3.b);
                                return;
                            }
                            return;
                        }
                    }
                    int i7 = 3;
                    int i8 = 21;
                    if (sx40Var2 instanceof sx40.b) {
                        sx40.b bVar3 = (sx40.b) sx40Var2;
                        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                        if (bVar3.equals(sx40.b.a.b)) {
                            f4zVar2.b(MusicHapticEvent.LIGHT);
                            if (playerTrack3 != null) {
                                PlaybackLaunchMeta playbackLaunchMeta = playerTrack3.c;
                                f4zVar3.b(new tx40.a(playbackLaunchMeta.e instanceof PlaySourceMeta.PlaylistPlaySourceMeta ? ((PlaySourceMeta.PlaylistPlaySourceMeta) r3).e : -1L, playerTrack3.b, playbackLaunchMeta.b));
                                return;
                            }
                            return;
                        }
                        if (bVar3 instanceof sx40.b.i) {
                            com.vk.core.utils.newtork.b.a.getClass();
                            if (!com.vk.core.utils.newtork.b.d()) {
                                f4zVar.b(qy40.a.f.b);
                                f4zVar2.b(MusicHapticEvent.ERROR);
                                return;
                            }
                            if (playerTrack3 == null || (musicTrack8 = playerTrack3.b) == null) {
                                return;
                            }
                            if (!dy40Var.c) {
                                Z(musicTrack8);
                                return;
                            }
                            a630 a630Var = this.g;
                            if (musicTrack8.P) {
                                return;
                            }
                            boolean i0 = a630Var.i0(musicTrack8);
                            if (a630Var.i0(musicTrack8)) {
                                itg0.m(a630Var.u1(musicTrack8, false).E(new oo20(new e5e(this, musicTrack8, i0, 1), i7), lVar, kVar, kVar).F(new ow40(new zl20(this, 7), 0)));
                                return;
                            } else {
                                W(musicTrack8, i0);
                                return;
                            }
                        }
                        if (bVar3 instanceof sx40.b.j) {
                            f4z f4zVar4 = this.v;
                            if (playerTrack3 == null || (musicTrack7 = playerTrack3.b) == null) {
                                return;
                            }
                            AudioBookChapter audioBookChapter = musicTrack7.O;
                            DownloadingState downloadingState = musicTrack7.J;
                            if (epx.f(downloadingState, DownloadingState.PendingDownload.b) || (downloadingState instanceof DownloadingState.Downloading)) {
                                f4zVar2.b(MusicHapticEvent.LIGHT);
                                if (musicTrack7.Mb()) {
                                    StartPlayAudioBookSource startPlayAudioBookSource = startPlaySource instanceof StartPlayAudioBookSource ? (StartPlayAudioBookSource) startPlaySource : null;
                                    if (startPlayAudioBookSource == null || (audioBook2 = startPlayAudioBookSource.c) == null) {
                                        return;
                                    }
                                    int i9 = audioBook2.b;
                                    if (audioBookChapter == null) {
                                        return;
                                    } else {
                                        dw40Var = new cw40(i9, audioBookChapter);
                                    }
                                } else {
                                    dw40Var = new dw40(musicTrack7);
                                }
                                f4zVar4.b(dw40Var);
                                return;
                            }
                            if (epx.f(downloadingState, DownloadingState.Downloaded.b) || epx.f(downloadingState, DownloadingState.Corrupted.b)) {
                                f4zVar2.b(MusicHapticEvent.LIGHT);
                                if (musicTrack7.Mb()) {
                                    StartPlayAudioBookSource startPlayAudioBookSource2 = startPlaySource instanceof StartPlayAudioBookSource ? (StartPlayAudioBookSource) startPlaySource : null;
                                    if (startPlayAudioBookSource2 == null || (audioBook3 = startPlayAudioBookSource2.c) == null) {
                                        return;
                                    }
                                    int i10 = audioBook3.b;
                                    if (audioBookChapter == null) {
                                        return;
                                    } else {
                                        fw40Var = new ew40(i10, audioBookChapter);
                                    }
                                } else {
                                    fw40Var = new fw40(musicTrack7);
                                }
                                f4zVar4.b(fw40Var);
                                return;
                            }
                            com.vk.core.utils.newtork.b.a.getClass();
                            if (!com.vk.core.utils.newtork.b.d()) {
                                f4zVar.b(qy40.a.f.b);
                                f4zVar2.b(MusicHapticEvent.ERROR);
                                return;
                            }
                            f4zVar2.b(MusicHapticEvent.LIGHT);
                            com.vk.music.stats.a aVar3 = this.f.d;
                            if (aVar3 != null) {
                                aVar3.a(MusicActionTracker.Action.Download, new MusicActionTracker.a.b(musicTrack7.y));
                            }
                            if (musicTrack7.Mb()) {
                                StartPlayAudioBookSource startPlayAudioBookSource3 = startPlaySource instanceof StartPlayAudioBookSource ? (StartPlayAudioBookSource) startPlaySource : null;
                                if (startPlayAudioBookSource3 == null || (audioBook4 = startPlayAudioBookSource3.c) == null || audioBookChapter == null) {
                                    return;
                                } else {
                                    hw40Var = new gw40(audioBook4, audioBookChapter);
                                }
                            } else {
                                hw40Var = new hw40(musicTrack7);
                            }
                            f4zVar4.b(hw40Var);
                            return;
                        }
                        if (bVar3.equals(sx40.b.k.b)) {
                            com.vk.core.utils.newtork.b.a.getClass();
                            if (!com.vk.core.utils.newtork.b.d()) {
                                f4zVar.b(qy40.a.f.b);
                                f4zVar2.b(MusicHapticEvent.ERROR);
                                return;
                            }
                            f4zVar2.b(MusicHapticEvent.LIGHT);
                            if (playerTrack3 == null || (musicTrack6 = playerTrack3.b) == null) {
                                return;
                            }
                            int i11 = musicTrack6.V;
                            if (ob50.d(musicTrack6)) {
                                com.vk.music.notifications.restriction.a aVar4 = k840.a.d;
                                (aVar4 != null ? aVar4 : null).g(musicTrack6);
                                return;
                            }
                            if (!jnj.g(i11)) {
                                String Hb = musicTrack6.Hb();
                                String str3 = musicTrack6.d;
                                StartPlayVkMixSource startPlayVkMixSource = new StartPlayVkMixSource("", "", "track_mix", false, str3 == null ? "" : str3, null, Hb, null, null, null, PDF417Common.MAX_CODEWORDS_IN_BARCODE, null);
                                MusicPlaybackLaunchContext zb = MusicPlaybackLaunchContext.F.zb();
                                zb.b.putString("__META_LAUNCH_POINT", "player");
                                u2b0Var.N0(new lqk0(startPlayVkMixSource, (MusicTrack) null, (List) null, zb, 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 886));
                                return;
                            }
                            u2b0 u2b0Var3 = u2b0Var;
                            String str4 = musicTrack6.d;
                            if (str4 == null) {
                                str4 = "";
                            }
                            StartPlaySimilarTracksSource startPlaySimilarTracksSource = new StartPlaySimilarTracksSource(new PlaySourceMeta.SimilarTrackPlaySourceMeta(str4, musicTrack6.Fb(), jnj.g(i11)));
                            MusicPlaybackLaunchContext zb2 = MusicPlaybackLaunchContext.F.zb();
                            zb2.b.putString("__META_LAUNCH_POINT", "player");
                            u2b0Var3.N0(new lqk0(startPlaySimilarTracksSource, (MusicTrack) null, (List) null, zb2.Cb(jnj.a(i11)), 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 886));
                            return;
                        }
                        if (bVar3.equals(sx40.b.c.b)) {
                            m840Var.g(sy40Var2);
                            return;
                        }
                        if (bVar3.equals(sx40.b.g.b)) {
                            this.A.Y(null);
                            ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                            com.vk.mvi.core.internal.executors.a.b(new ww40(this, this));
                            return;
                        }
                        if (bVar3.equals(sx40.b.d.b)) {
                            agb0 agb0Var = yep0Var.b;
                            if (playerTrack3 == null || (musicTrack5 = playerTrack3.b) == null) {
                                return;
                            }
                            agb0Var.d.b(itg0.m(agb0Var.a.X0(musicTrack5, MusicPlaybackLaunchContext.A).E(new k130(new eiz(agb0Var, i8), 13), lVar, kVar, kVar)));
                            return;
                        }
                        if (bVar3.equals(sx40.b.h.b)) {
                            yep0Var.b(sy40Var2, null);
                            return;
                        }
                        if (bVar3.equals(sx40.b.e.b)) {
                            PlayerTrack playerTrack5 = sy40Var2.d;
                            n10 a5 = playerTrack5 != null ? yep0Var.a(playerTrack5) : null;
                            if (a5 != null) {
                                a5.e(sy40Var2);
                                return;
                            }
                            return;
                        }
                        if (bVar3.equals(sx40.b.f.b)) {
                            uc4 uc4Var = yep0Var.c;
                            StartPlayAudioBookSource startPlayAudioBookSource4 = startPlaySource instanceof StartPlayAudioBookSource ? (StartPlayAudioBookSource) startPlaySource : null;
                            if (startPlayAudioBookSource4 == null || (audioBook = startPlayAudioBookSource4.c) == null) {
                                return;
                            }
                            uc4Var.b.b(new tx40.f(audioBook.m, uc4Var.a.x0()));
                            return;
                        }
                        if (!(bVar3 instanceof sx40.b.C3699b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lac lacVar = sy40Var2.D;
                        if (lacVar != null && (str2 = lacVar.d) != null) {
                            UiTracker uiTracker = UiTracker.a;
                            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new CommonAudioStat$TypeAudioArtistClickItem(new CommonStat$TypeTrackCodeItem(str2), CommonAudioStat$TypeAudioArtistClickItem.RefSource.CONCERT_PLAYER_CHIPS, CommonAudioStat$TypeAudioArtistClickItem.EventType.ITEM_CLICK), 2)).q();
                        }
                        f4zVar3.b(new tx40.s(((sx40.b.C3699b) bVar3).b));
                        return;
                    }
                    int i12 = 28;
                    if (sx40Var2.equals(sx40.p0.b) || (sx40Var2 instanceof sx40.o0)) {
                        i0q0.f(new wzh(this, i12));
                        return;
                    }
                    if (sx40Var2 instanceof sx40.h0) {
                        i0q0.f(new nuj(this, 23));
                        return;
                    }
                    if (sx40Var2 instanceof sx40.g0) {
                        i0q0.f(new v3n(this, 21));
                        return;
                    }
                    int i13 = 4;
                    if (sx40Var2.equals(sx40.z.b)) {
                        i0q0.f(new q010(this, i13));
                        return;
                    }
                    if (sx40Var2.equals(sx40.g.b)) {
                        i0q0.f(new nwk(this, i8));
                        return;
                    }
                    if (sx40Var2 instanceof sx40.u) {
                        f4zVar3.b(tx40.i.a);
                        return;
                    }
                    if (sx40Var2 instanceof sx40.j0) {
                        f4zVar3.b(tx40.q.a);
                        return;
                    }
                    if (sx40Var2.equals(sx40.c.b)) {
                        i0q0.f(new cnh(this, 26));
                        return;
                    }
                    if (sx40Var2 instanceof sx40.i0) {
                        PlayerTrack playerTrack6 = (PlayerTrack) j5g.b0(((sx40.i0) sx40Var2).b, list2);
                        if (playerTrack6 != null) {
                            if (epx.f(playerTrack6.f, playerTrack3 != null ? playerTrack3.f : null)) {
                                return;
                            }
                            i0q0.f(new q34(this, playerTrack6, sx40Var2, i13));
                            return;
                        }
                        return;
                    }
                    if (sx40Var2 instanceof sx40.l) {
                        Iterator it8 = list2.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                playerTrack = null;
                                break;
                            }
                            ?? next = it8.next();
                            if (epx.f(((PlayerTrack) next).f, ((sx40.l) sx40Var2).b)) {
                                playerTrack = next;
                                break;
                            }
                        }
                        PlayerTrack playerTrack7 = playerTrack;
                        if (playerTrack7 != null) {
                            i0q0.f(new eg1(11, this, playerTrack7));
                            return;
                        }
                        return;
                    }
                    if (sx40Var2 instanceof sx40.c0) {
                        i0q0.f(new fg1(18, this, sx40Var2));
                        return;
                    }
                    if (sx40Var2 instanceof sx40.q0) {
                        f4zVar2.b(MusicHapticEvent.SOFT);
                        i0q0.f(new flu(this, i8));
                        return;
                    }
                    if (sx40Var2 instanceof sx40.n0) {
                        f4zVar2.b(MusicHapticEvent.SOFT);
                        i0q0.f(new nly(this, i6));
                        return;
                    }
                    if (sx40Var2 instanceof sx40.n) {
                        sx40.n nVar = (sx40.n) sx40Var2;
                        sxi sxiVar = this.p;
                        u750 u750Var = this.A;
                        if (nVar instanceof sx40.n.d) {
                            T(new by40.e(((sx40.n.d) nVar).b ? LyricsScrollMode.AUTO : LyricsScrollMode.MANUAL));
                            return;
                        }
                        if (nVar instanceof sx40.n.b) {
                            PlayerTrack playerTrack8 = sy40Var2.d;
                            if (playerTrack8 == null || (musicTrack4 = playerTrack8.b) == null) {
                                return;
                            }
                            u750Var.a0(musicTrack4.b, musicTrack4.c);
                            this.D = true;
                            mzp0 mzp0Var = (mzp0) sxiVar.b;
                            mzp0Var.init();
                            mzp0Var.start();
                            mzp0Var.a();
                            this.q.b(io.reactivex.rxjava3.core.q.B0(1L, TimeUnit.SECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new f(new b())));
                            ny40 ny40Var = this.o;
                            this.r.b(rsg0.y0(yfb.x(ny40Var.a.b(musicTrack4.Ib())), null, null, 3).U(new e40(new lw3(1, ny40Var, ny40.class, "convertLyricsDto", "convertLyricsDto(Lcom/vk/api/generated/audio/dto/AudioLyricsDto;)Lcom/vk/music/player/domain/model/LyricsContent;", 0, 6), i8)).subscribe(new f(new c()), new f(new d())));
                            return;
                        }
                        if (nVar instanceof sx40.n.e) {
                            PlayerTrack playerTrack9 = sy40Var2.d;
                            if (playerTrack9 == null || (musicTrack3 = playerTrack9.b) == null) {
                                return;
                            }
                            u750Var.s(musicTrack3.b, musicTrack3.c);
                            i0q0.f(new e(nVar));
                            T(new by40.e(LyricsScrollMode.AUTO));
                            return;
                        }
                        if (!(nVar instanceof sx40.n.a)) {
                            if (!epx.f(nVar, sx40.n.c.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            T(by40.q.b);
                            return;
                        }
                        PlayerTrack playerTrack10 = sy40Var2.d;
                        if (playerTrack10 == null || (musicTrack2 = playerTrack10.b) == null || !this.D) {
                            return;
                        }
                        ((mzp0) sxiVar.b).g();
                        u750Var.F0(musicTrack2.b, musicTrack2.c);
                        this.D = false;
                        return;
                    }
                    if (sx40Var2.equals(sx40.a0.b)) {
                        f4z f4zVar5 = this.w;
                        if (this.B != null) {
                            f4zVar5.b(qy40.a.l.b);
                            return;
                        }
                        if (this.y.g().size() > 1000) {
                            this.u.b(tx40.u.a);
                            return;
                        }
                        com.vk.core.utils.newtork.b.a.getClass();
                        if (com.vk.core.utils.newtork.b.d()) {
                            b0();
                            return;
                        } else {
                            f4zVar5.b(qy40.a.f.b);
                            this.x.b(MusicHapticEvent.ERROR);
                            return;
                        }
                    }
                    if (sx40Var2.equals(sx40.b0.b)) {
                        b0();
                        return;
                    }
                    if (sx40Var2.equals(sx40.q.b)) {
                        Playlist playlist = this.B;
                        if (playlist != null) {
                            this.u.b(new tx40.k(playlist.c, playlist.b, jnj.a(playlist.O)));
                            return;
                        }
                        return;
                    }
                    if (sx40Var2.equals(sx40.m.b)) {
                        com.vk.core.utils.newtork.b.a.getClass();
                        if (com.vk.core.utils.newtork.b.d()) {
                            i0q0.f(new bzj(this, i12));
                            return;
                        } else {
                            f4zVar.b(qy40.a.f.b);
                            f4zVar2.b(MusicHapticEvent.ERROR);
                            return;
                        }
                    }
                    if (sx40Var2 instanceof sx40.y) {
                        i0q0.f(new com.vk.movika.sdk.base.ui.k(17, this, ((sx40.y) sx40Var2).b));
                        return;
                    }
                    if (sx40Var2 instanceof sx40.k) {
                        sx40.k kVar2 = (sx40.k) sx40Var2;
                        int i14 = kVar2.b;
                        int i15 = kVar2.c;
                        this.y.H0(sy40Var2.f.get(i14), sy40Var2.f.get(i15));
                        T(new by40.d0(i14, i15));
                        return;
                    }
                    if (sx40Var2.equals(sx40.o.b)) {
                        f4zVar.b(qy40.a.f.b);
                        f4zVar2.b(MusicHapticEvent.ERROR);
                        return;
                    }
                    if (sx40Var2 instanceof sx40.t0) {
                        Z(null);
                        throw null;
                    }
                    if (sx40Var2 instanceof sx40.p) {
                        T(new by40.t(((sx40.p) sx40Var2).b));
                        return;
                    }
                    if (sx40Var2 instanceof sx40.w) {
                        V(sy40Var2);
                        return;
                    }
                    if (sx40Var2 instanceof sx40.e) {
                        PlayerTrack playerTrack11 = sy40Var2.d;
                        if (playerTrack11 == null || (musicTrack = playerTrack11.b) == null) {
                            return;
                        }
                        U(this, musicTrack);
                        return;
                    }
                    if (sx40Var2 instanceof sx40.e0) {
                        com.vk.music.pref.a aVar5 = aVar;
                        aVar5.D(CrossfadeOnboarding.MenuOnboarding);
                        if (!aVar5.c() || (vkOnboardingCampaign = (b4b0Var = this.m).b) == null) {
                            return;
                        }
                        b4b0Var.a.a(vkOnboardingCampaign, VkOnboardingType.Tooltip, e8v0.e.b);
                        return;
                    }
                    if (sx40Var2 instanceof sx40.f0) {
                        if (!((Boolean) this.F.getValue()).booleanValue() || sy40Var2.w == OnboardingStrategy.ChipsAnimation) {
                            return;
                        }
                        sx40.f0 f0Var = (sx40.f0) sx40Var2;
                        String r = f0Var.b.r();
                        c0(r != null ? r : "");
                        T(new by40.g0(new lac(true, f0Var.b.d(), f0Var.b.getUrl(), f0Var.b.r())));
                        return;
                    }
                    if (!epx.f(sx40Var2, sx40.h.b)) {
                        if (!epx.f(sx40Var2, sx40.s0.b) && !epx.f(sx40Var2, sx40.k0.b) && !epx.f(sx40Var2, sx40.x.b) && !epx.f(sx40Var2, sx40.j.b) && !epx.f(sx40Var2, sx40.l0.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return;
                    }
                    lac lacVar2 = sy40Var2.D;
                    if (qjg.e(lacVar2 != null ? Boolean.valueOf(lacVar2.a) : null)) {
                        lac lacVar3 = sy40Var2.D;
                        if (lacVar3 == null || (str = lacVar3.a()) == null) {
                            str = "";
                        }
                        T(new by40.g0(new lac(str)));
                        return;
                    }
                    return;
                }
                sx40.t tVar = (sx40.t) sx40Var2;
                String str5 = tVar.c;
                if (str5 != null) {
                    Iterator it9 = list2.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            playerTrack2 = null;
                            break;
                        }
                        ?? next2 = it9.next();
                        if (epx.f(((PlayerTrack) next2).f, str5)) {
                            playerTrack2 = next2;
                            break;
                        }
                    }
                    PlayerTrack playerTrack12 = playerTrack2;
                    if (playerTrack12 != null) {
                        playerTrack3 = playerTrack12;
                        a3 = yep0Var.a(playerTrack3);
                        if (a3 == null) {
                            a3.b(sy40Var2, playerTrack3, tVar.b);
                            return;
                        }
                        return;
                    }
                }
                if (playerTrack3 == null) {
                    return;
                }
                a3 = yep0Var.a(playerTrack3);
                if (a3 == null) {
                }
            }
        }
        aVar = aVar2;
        u2b0Var = u2b0Var2;
        yep0Var.getClass();
        m840 m840Var2 = yep0Var.a;
        if (playerTrack3 != null) {
            list = yep0Var.e;
            if (list instanceof Collection) {
            }
            it = list.iterator();
            while (it.hasNext()) {
            }
        }
        if (!(sx40Var2 instanceof sx40.i)) {
        }
    }

    public final void V(sy40 sy40Var) {
        com.vk.music.pref.a aVar = this.i;
        boolean R = aVar.R();
        boolean z = sy40Var.w == OnboardingStrategy.SheetAnimation && !sy40Var.e.f;
        boolean z2 = aVar.q() == CrossfadeOnboarding.BothOnboardings;
        if (R && !z && !z2) {
            aVar.s0();
            aVar.F(false);
        }
        if (R && aVar.q() == CrossfadeOnboarding.MenuOnboarding) {
            aVar.D(CrossfadeOnboarding.None);
        }
    }

    public final void W(MusicTrack musicTrack, boolean z) {
        this.s.b(this.g.q1(musicTrack, z).subscribe(new qw40(new pf40(this, 1), 0), new rkz(new gmj(this, 29), 8)));
    }

    public final void X(lt3 lt3Var) {
        this.t.b(ny40.a(this.o, lt3Var, 2).subscribe(new ljs(new f0z(this, 10), 10), new k2y(new w910(this, 5), 7)));
    }

    public final hg40 Y(int i, MusicTrack musicTrack) {
        Integer num;
        Long l;
        int i2;
        Long valueOf;
        StartPlaySource j = this.y.j();
        if (j instanceof StartPlayPlaylistSource) {
            StartPlayPlaylistSource startPlayPlaylistSource = (StartPlayPlaylistSource) j;
            i2 = Integer.valueOf(startPlayPlaylistSource.c.e);
            valueOf = Long.valueOf(startPlayPlaylistSource.c.d.b);
        } else {
            if (!(j instanceof StartPlayUserSource)) {
                num = null;
                l = null;
                return new hg40(Integer.valueOf(i), Integer.valueOf(musicTrack.b), num, Long.valueOf(musicTrack.c.b), l, musicTrack.y);
            }
            i2 = -1;
            valueOf = Long.valueOf(((StartPlayUserSource) j).c.b);
        }
        l = valueOf;
        num = i2;
        return new hg40(Integer.valueOf(i), Integer.valueOf(musicTrack.b), num, Long.valueOf(musicTrack.c.b), l, musicTrack.y);
    }

    public final void Z(MusicTrack musicTrack) {
        if (musicTrack.P) {
            a630 a630Var = this.g;
            this.s.b(a630Var.p1(musicTrack, false, true).subscribe(new j41(new ayo(this, 23), 26), new cx00(new o440(this, 4), 5)));
            if (musicTrack.l && musicTrack.m) {
                io.reactivex.rxjava3.core.q<Integer> e1 = a630Var.e1(musicTrack, MusicPlaybackLaunchContext.A, true);
                q440 q440Var = new q440(new bv1(23, this, musicTrack), 1);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                itg0.i(7, e1.E(q440Var, lVar, kVar, kVar), null, null, null);
            }
        }
    }

    public final void b0() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String e2 = c9b0.e(context);
        UserId c2 = this.j.c();
        u2b0 u2b0Var = this.y;
        List<PlayerTrack> g = u2b0Var.g();
        ArrayList arrayList = new ArrayList(c5g.u(g, 10));
        Iterator<T> it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlayerTrack) it.next()).b.Fb());
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        List<gza0> d2 = u2b0Var.d();
        ArrayList arrayList3 = new ArrayList(c5g.u(d2, 10));
        Iterator<T> it2 = d2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((gza0) it2.next()).a);
        }
        arrayList2.addAll(arrayList3);
        this.e.b(new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(yfb.x(hx4.v(this.h, c2, e2, null, j5g.H0(j5g.y0(arrayList2), 1000), null, 52))), new pw40(new ap30(this, 2), 0)).subscribe(new wmz(new nt10(this, 5), 6), new kjs(new mi10(this, 5), 5)));
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        vm4 vm4Var = this.C;
        if (vm4Var != null) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            ((AudioManager) context.getSystemService("audio")).unregisterAudioDeviceCallback(vm4Var);
        }
        this.y.n0(this.J);
        d6q0.g(this.K);
        com.vk.music.player.d dVar = k840.a.f;
        (dVar != null ? dVar : null).c(this.L);
        this.n.b(this.O);
    }
}
