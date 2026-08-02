package xsna;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.datasource.cache.Cache;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.newtork.NetworkType;
import com.vk.dto.music.Artist;
import com.vk.dto.music.AudioStream;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vk.music.audioeffect.AudioEffectSettingsComponent;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PauseReason;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerAction;
import com.vk.music.player.PlayerInvalidateMessage;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.ResumeReason;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.player.ads.api.di.PlayerAdsComponent;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.music.player.api.di.EqualizerControllerComponent;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.player.cache.MusicPlayerCacheComponent;
import com.vk.music.player.cache.a;
import com.vk.music.player.error.ErrorType;
import com.vk.music.player.error.VkPlayerException;
import com.vk.music.player.f;
import com.vk.music.playerservice.impl.PlayerService;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.subscription.api.di.MusicSubscriptionComponent;
import com.vk.network.kbh.state.NetworkState;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.a9r;
import xsna.agl0;
import xsna.bx1;
import xsna.cz40;
import xsna.fiq;
import xsna.fu80;
import xsna.fx40;
import xsna.g8x;
import xsna.go4;
import xsna.hjk;
import xsna.jjb0;
import xsna.k840;
import xsna.kw40;
import xsna.ly40;
import xsna.ry40;
import xsna.vy40;

/* compiled from: PlayerImpl.java */
/* loaded from: classes3.dex */
public final class e2b0 implements kza0, w8i {
    public final iya0 A;
    public final clb0 B;
    public final o450 C;
    public final bpn0 D;
    public final bpn0 E;
    public final MusicPlayerCacheComponent F;
    public final OfflineAudioComponent G;
    public final PlayerUIComponent H;
    public final bpn0 I;
    public final com.vk.music.player.cache.a J;
    public final io.reactivex.rxjava3.disposables.c K;
    public com.vk.music.player.a L;
    public final com.vk.music.audioeffect.a M;
    public NetworkState N;
    public final a O;
    public final AtomicInteger P;
    public final PlayerService b;
    public final r950 c;
    public final com.vk.music.player.f e;
    public final d f;
    public fy10 g;
    public final s2b0 i;
    public final ko4 j;
    public boolean k;
    public long l;
    public final kjb0 m;
    public final pw5 n;
    public final vy40 o;
    public final vy40.a p;

    @NonNull
    public final com.vk.music.pref.a q;
    public final bx40 r;
    public final ca50 s;
    public MusicPlaybackLaunchContext t;

    @NonNull
    public ry40 u;
    public int v;
    public int w;
    public final HashSet x;
    public hxa0 y;
    public final mkl z;
    public final HashSet d = new HashSet();
    public final Handler h = new Handler(new e());

    /* compiled from: PlayerImpl.java */
    public class a implements q560 {
        public a() {
        }

        @Override // xsna.q560
        public final void a(NetworkState networkState) {
            e2b0.this.N = networkState;
        }
    }

    /* compiled from: PlayerImpl.java */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ErrorType.values().length];
            b = iArr;
            try {
                iArr[ErrorType.timeout.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ErrorType.unsupported.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PlayState.values().length];
            a = iArr2;
            try {
                iArr2[PlayState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[PlayState.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[PlayState.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[PlayState.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: PlayerImpl.java */
    public class c extends f.a.C1335a {
        public final d940 a;

        public c(d940 d940Var) {
            this.a = d940Var;
        }

        @Override // com.vk.music.player.f.a.C1335a, com.vk.music.player.f.a
        public final void a() {
            this.a.m();
        }

        @Override // com.vk.music.player.f.a.C1335a, com.vk.music.player.f.a
        public final void b() {
            this.a.o();
        }

        @Override // com.vk.music.player.f.a.C1335a, com.vk.music.player.f.a
        public final String c(com.vk.music.player.f fVar, int i) {
            if (i == 1) {
                return "";
            }
            MusicTrack f = fVar.m() ? fVar.f() : null;
            return f == null ? "" : f.e;
        }

        @Override // com.vk.music.player.f.a.C1335a, com.vk.music.player.f.a
        @Nullable
        public final AdvertisementInfo d(int i) {
            if (i == 1) {
                return this.a.y();
            }
            return null;
        }

        @Override // com.vk.music.player.f.a.C1335a, com.vk.music.player.f.a
        public final boolean e(int i) {
            return i == 0;
        }

        @Override // com.vk.music.player.f.a.C1335a, com.vk.music.player.f.a
        public final void f() {
            this.a.A();
        }

        @Override // com.vk.music.player.f.a.C1335a, com.vk.music.player.f.a
        public final CharSequence g(com.vk.music.player.f fVar, int i) {
            String str = "";
            if (i != 1) {
                MusicTrack f = fVar.m() ? fVar.f() : null;
                if (f != null) {
                    ucp ucpVar = ucp.a;
                    StringBuilder sb = new StringBuilder();
                    List<Artist> list = f.t;
                    if (list != null) {
                        str = s490.i(list);
                    } else {
                        String str2 = f.h;
                        if (str2 != null) {
                            str = str2;
                        }
                    }
                    sb.append(str);
                    sb.append(' ');
                    sb.append(s490.c(f.u));
                    return ucp.i(drm0.p0(sb.toString()).toString());
                }
            }
            return "";
        }

        @Override // com.vk.music.player.f.a.C1335a, com.vk.music.player.f.a
        @NonNull
        public final Set<PlayerAction> h(com.vk.music.player.f fVar, int i) {
            e2b0 e2b0Var = e2b0.this;
            HashSet hashSet = e2b0Var.x;
            if (i == 1) {
                r950 r950Var = e2b0Var.c;
                List<PlayerAction> k = r950Var != null ? r950Var.k() : null;
                EnumSet noneOf = EnumSet.noneOf(PlayerAction.class);
                if (k != null) {
                    noneOf.addAll(k);
                }
                return noneOf;
            }
            PlayerTrack last = e2b0Var.y.getLast();
            PlayerTrack playerTrack = fVar.c;
            if (last == null || playerTrack == null) {
                return Collections.EMPTY_SET;
            }
            if (e2b0Var.P()) {
                hashSet.add(PlayerAction.changeTrackNext);
            } else {
                boolean hasNext = e2b0Var.y.hasNext();
                PlayerAction playerAction = PlayerAction.changeTrackNext;
                if (hasNext) {
                    hashSet.add(playerAction);
                } else {
                    hashSet.remove(playerAction);
                }
            }
            return hashSet;
        }

        @Override // com.vk.music.player.f.a.C1335a, com.vk.music.player.f.a
        public final String i(com.vk.music.player.f fVar, int i) {
            if (i == 1) {
                return e2b0.this.b.getString(R.string.audio_ad_title);
            }
            MusicTrack f = fVar.m() ? fVar.f() : null;
            return f == null ? "" : f.d;
        }
    }

    /* compiled from: PlayerImpl.java */
    public class d {
        public long a;
        public long b;
        public int c;

        public d() {
        }

        public final boolean a() {
            e2b0 e2b0Var = e2b0.this;
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                long j = this.b;
                e2b0Var.getClass();
                if (uptimeMillis < j + 5000) {
                    int i = this.c + 1;
                    this.c = i;
                    e2b0Var.getClass();
                    if (i >= 3) {
                        return false;
                    }
                } else {
                    this.c = 0;
                }
                return true;
            } finally {
                this.b = uptimeMillis;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
        
            if (r3 == false) goto L26;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b(Object[] objArr, int i, boolean z) {
            boolean z2;
            String str;
            e2b0 e2b0Var = e2b0.this;
            r950 r950Var = e2b0Var.c;
            PlayerService playerService = e2b0Var.b;
            if (MusicFeatures.AUDIO_GET_ALL_PLAYING_FORMATS.h()) {
                r6m.a.getClass();
                if (r6m.j() && (str = r950Var.c.j.b) != null && !Objects.equals(str, "")) {
                    x6b0 x6b0Var = r950Var.c.j;
                    if (!x6b0Var.c) {
                        x6b0Var.c = true;
                        e2b0Var.g0(e2b0Var.e.c.f, false, true, false, "new", new PlaybackActionMeta(33, SystemClock.elapsedRealtime()), null);
                        return;
                    }
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis >= this.a + 1000 && z) {
                String string = playerService.getString(i, objArr);
                bn40.d("errorMes: ", string);
                cvk.w(string, true);
                this.a = uptimeMillis;
            }
            if (!a() || i == R.string.music_player_error_no_connection) {
                z2 = false;
            } else {
                boolean k0 = e2b0Var.k0(false, true, "error", new PlaybackActionMeta(27, SystemClock.elapsedRealtime()), null);
                z2 = !k0;
            }
            bn40.d("Stopping playback because of:  canPlayNext: ", Boolean.valueOf(a()), ", text: ", playerService.getString(i), "isFatalError: ", Boolean.valueOf(i == R.string.music_player_error_no_connection), ", playNext: ", Boolean.valueOf(z2));
            if (i == R.string.music_player_error_no_connection) {
                k840.a.d().y(playerService.getString(i, objArr), a());
            }
        }
    }

    /* compiled from: PlayerImpl.java */
    public class e implements Handler.Callback {
        public PlayState b = null;

        public e() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            e2b0 e2b0Var = e2b0.this;
            com.vk.music.player.f fVar = e2b0Var.e;
            HashSet hashSet = e2b0Var.d;
            switch (message.what) {
                case 1:
                    PlayState o0 = e2b0.o0(e2b0Var.u);
                    if (o0 != this.b) {
                        this.b = o0;
                        bn40.f("PlayerStateChanged: ", o0.name());
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((com.vk.music.player.e) it.next()).N3(o0, fVar);
                    }
                    return true;
                case 2:
                    List<PlayerTrack> n = e2b0Var.y.n();
                    e2b0Var.y.getClass();
                    com.vk.music.player.a aVar = e2b0Var.L;
                    if (aVar != null) {
                        PlayerTrack c = aVar.a.c();
                        if (!epx.f(aVar.g, c)) {
                            aVar.g = c;
                        }
                    }
                    try {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            ((com.vk.music.player.e) it2.next()).y4(n);
                        }
                        e2b0Var.y.getClass();
                        e2b0Var.w0();
                        return true;
                    } catch (Throwable th) {
                        e2b0Var.y.getClass();
                        throw th;
                    }
                case 3:
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        ((com.vk.music.player.e) it3.next()).W3(fVar);
                    }
                    return true;
                case 4:
                    Iterator it4 = hashSet.iterator();
                    while (it4.hasNext()) {
                        ((com.vk.music.player.e) it4.next()).o2(fVar);
                    }
                    return true;
                case 5:
                    Iterator it5 = hashSet.iterator();
                    while (it5.hasNext()) {
                        ((com.vk.music.player.e) it5.next()).z3();
                    }
                    return true;
                case 6:
                    Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        ((com.vk.music.player.e) it6.next()).K1();
                    }
                    return true;
                case 7:
                    Iterator it7 = hashSet.iterator();
                    while (it7.hasNext()) {
                        ((com.vk.music.player.e) it7.next()).n3();
                    }
                    return true;
                case 8:
                    Iterator it8 = hashSet.iterator();
                    while (it8.hasNext()) {
                        ((com.vk.music.player.e) it8.next()).B1();
                    }
                    return true;
                case 9:
                    Iterator it9 = hashSet.iterator();
                    while (it9.hasNext()) {
                        com.vk.music.player.e eVar = (com.vk.music.player.e) it9.next();
                        e2b0Var.f.getClass();
                        eVar.onError(null);
                    }
                    return true;
                case 10:
                    Iterator it10 = hashSet.iterator();
                    while (it10.hasNext()) {
                        com.vk.music.player.e eVar2 = (com.vk.music.player.e) it10.next();
                        e2b0Var.getVolume();
                        eVar2.x0();
                    }
                    return true;
                default:
                    return false;
            }
        }
    }

    public e2b0(PlayerService playerService, PlayerService.a aVar, clb0 clb0Var, o450 o450Var, u750 u750Var, @NonNull com.vk.music.pref.a aVar2, bx40 bx40Var) {
        MusicFeatures musicFeatures;
        VideoFeatures videoFeatures;
        tf40 tf40Var;
        Class cls;
        com.vk.toggle.b bVar;
        com.vk.music.audioeffect.a aVar3;
        Class cls2;
        OfflineAudioComponent offlineAudioComponent;
        gzs kfgVar;
        xv40 xv40Var = new xv40(new go4.a(3));
        xv40Var.d(this);
        this.j = new ko4(xv40Var, new fu80.a(), 2);
        kjb0 kjb0Var = new kjb0();
        kjb0Var.a = 0L;
        kjb0Var.b = false;
        kjb0Var.c = null;
        kjb0Var.d = this;
        this.m = kjb0Var;
        pw5 pw5Var = new pw5();
        this.n = pw5Var;
        this.p = new vy40.a();
        this.t = MusicPlaybackLaunchContext.d;
        this.u = ry40.c.d;
        this.v = 0;
        this.w = -1;
        HashSet hashSet = new HashSet();
        this.x = hashSet;
        this.D = new bpn0(new ko00(this, 18));
        this.E = new bpn0(new s1x(this, 23));
        bpn0 bpn0Var = new bpn0(new tzv(this, 23));
        MusicPlayerCacheComponent musicPlayerCacheComponent = (MusicPlayerCacheComponent) j6i.b(m7m.f(this), MusicPlayerCacheComponent.class);
        this.F = musicPlayerCacheComponent;
        OfflineAudioComponent offlineAudioComponent2 = (OfflineAudioComponent) j6i.b(m7m.f(this), OfflineAudioComponent.class);
        this.G = offlineAudioComponent2;
        this.H = (PlayerUIComponent) j6i.b(m7m.f(this), PlayerUIComponent.class);
        this.K = EmptyDisposable.INSTANCE;
        com.vk.music.audioeffect.a f0 = ((AudioEffectSettingsComponent) j6i.b(m7m.f(this), AudioEffectSettingsComponent.class)).f0();
        this.M = f0;
        this.O = new a();
        this.P = new AtomicInteger(0);
        this.b = playerService;
        this.C = o450Var;
        this.B = clb0Var;
        this.q = aVar2;
        this.r = bx40Var;
        this.s = ((PlayerAnalyticsComponent) j6i.b(m7m.f(this), PlayerAnalyticsComponent.class)).a1();
        bn40.f("Player hs:", Boolean.valueOf(((MusicSubscriptionComponent) j6i.b(m7m.f(this), MusicSubscriptionComponent.class)).q1().b()), " ads:", Boolean.valueOf(o25.a().V().f));
        tf40 tf40Var2 = new tf40(o25.a());
        otp F9 = ((EqualizerControllerComponent) j6i.b(m7m.f(this), EqualizerControllerComponent.class)).F9();
        VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_MUSIC_PLAYER;
        videoFeatures2.getClass();
        com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
        fx40.a aVar4 = new fx40.a(new bx1.a(3), new fiq.a(new hjk.a(0), 1500L), null, bVar2.a(videoFeatures2) ? a.b.a : musicPlayerCacheComponent.v0(), 81);
        MusicFeatures musicFeatures2 = MusicFeatures.PLAYER_REFACTORING;
        if (bVar2.a(musicFeatures2)) {
            emi emiVar = new emi(11);
            iya0 iya0Var = new iya0();
            iya0Var.a = null;
            iya0Var.c = emiVar;
            this.A = iya0Var;
            musicFeatures = musicFeatures2;
            zl20 zl20Var = new zl20(this, 16);
            nxa0 nxa0Var = (nxa0) bpn0Var.getValue();
            this.z = new mkl(aVar2, zl20Var, iya0Var, nxa0Var);
            hxa0 hxa0Var = iya0Var.a;
            this.y = hxa0Var == null ? new hya0(aVar2, zl20Var, iya0Var.c, nxa0Var).a() : hxa0Var;
            videoFeatures = videoFeatures2;
            offlineAudioComponent = offlineAudioComponent2;
            aVar3 = f0;
            cls2 = EqualizerControllerComponent.class;
            cls = PlayerAnalyticsComponent.class;
            tf40Var = tf40Var2;
            bVar = bVar2;
        } else {
            musicFeatures = musicFeatures2;
            r950 r950Var = this.c;
            xn4 xn4Var = new xn4(o25.a(), r950Var != null ? r950Var.k : new b370(), new ozd0());
            f2b0 f2b0Var = new f2b0(this);
            ozd0 ozd0Var = new ozd0();
            nxa0 nxa0Var2 = (nxa0) bpn0Var.getValue();
            r5v0 r5v0Var = k840.a.h;
            io.reactivex.rxjava3.subjects.f<yj40> fVar = (r5v0Var != null ? r5v0Var : null).a.a;
            jjx jjxVar = new jjx(this, 27);
            com.vk.core.utils.newtork.b bVar3 = com.vk.core.utils.newtork.b.a;
            Objects.requireNonNull(bVar3);
            gd70 gd70Var = new gd70(bVar3, 8);
            videoFeatures = videoFeatures2;
            tf40Var = tf40Var2;
            cls = PlayerAnalyticsComponent.class;
            bVar = bVar2;
            aVar3 = f0;
            cls2 = EqualizerControllerComponent.class;
            offlineAudioComponent = offlineAudioComponent2;
            this.y = new com.vk.music.player.playback.c(f2b0Var, ozd0Var, nxa0Var2, aVar2, fVar, jjxVar, gd70Var, xn4Var);
        }
        PlayerAnalyticsComponent playerAnalyticsComponent = (PlayerAnalyticsComponent) j6i.b(m7m.f(this), cls);
        mb4 mb4Var = new mb4();
        MusicFeatures musicFeatures3 = musicFeatures;
        com.vk.music.audioeffect.a aVar5 = aVar3;
        ojk ojkVar = new ojk(playerService, mb4Var, aVar4.b, playerAnalyticsComponent.he(), aVar2, aVar5, this.y);
        if (bVar.a(videoFeatures)) {
            this.J = offlineAudioComponent.v0();
            kfgVar = new ubw(this, 23);
        } else {
            this.J = musicPlayerCacheComponent.v0();
            kfgVar = new kfg(this, playerService, ojkVar, 1);
        }
        this.I = new bpn0(kfgVar);
        if (!(this.J instanceof a.b)) {
            com.vk.core.utils.newtork.b.a.getClass();
            this.K = com.vk.core.utils.newtork.b.f().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tl30(this, 13));
        }
        hx40 hx40Var = new hx40(cz40.b.a.a, playerService, ((EqualizerControllerComponent) m7m.e().a(fpf0.a(cls2))).F9(), aVar4, ojkVar, 16);
        fx40.a aVar6 = new fx40.a();
        r950 r950Var2 = new r950(playerService, hx40Var, new e940(((PlayerAdsComponent) j6i.b(m7m.f(this), PlayerAdsComponent.class)).N2(playerService, new hx40(cz40.a.a, playerService, F9, aVar6, new b370(), new oh6(aVar6.b, aVar5))), mb4Var), tf40Var, ojkVar, playerAnalyticsComponent.he());
        this.c = r950Var2;
        r950Var2.p(new f200(new f()));
        hashSet.add(PlayerAction.seek);
        hashSet.add(PlayerAction.other);
        hashSet.add(PlayerAction.more);
        hashSet.add(PlayerAction.playPause);
        hashSet.add(PlayerAction.repeat);
        hashSet.add(PlayerAction.shuffle);
        hashSet.add(PlayerAction.changeTrackPrev);
        hashSet.add(PlayerAction.changeTrackNext);
        com.vk.music.player.f fVar2 = new com.vk.music.player.f(2, new c(r950Var2));
        this.e = fVar2;
        fVar2.k = 0;
        this.L = new com.vk.music.player.a(aVar2, this.y, r950Var2.k);
        this.f = new d();
        if (bVar.a(musicFeatures3)) {
            s2b0 s2b0Var = new s2b0(new r2b0(new n7w(this, 20), new xsw(this, 21), new fm20(this, 14), new wt30(this, 6), new xrj(this, 29), new rkt(this, 19), new gj80(this, 3)));
            this.i = s2b0Var;
            s2b0Var.c.b(s2b0Var.b.subscribe(new zyu(new t2b0(1, s2b0Var, s2b0.class, "handleMessage", "handleMessage(Lcom/vk/music/player/PlayerInvalidateMessage;)Z", 8, 0), 18)));
        }
        this.o = new vy40(pw5Var, u750Var);
        u1u0.e(new tw3(aVar, 18));
    }

    public static boolean V() {
        int i;
        NetworkType d2 = com.vk.core.utils.newtork.b.c().d();
        d2.getClass();
        boolean z = d2 == NetworkType.WIFI;
        r6m.a.getClass();
        try {
            Context context = r6m.e;
            if (context == null) {
                context = null;
            }
            i = ((ConnectivityManager) context.getSystemService("connectivity")).getRestrictBackgroundStatus();
        } catch (Exception unused) {
            i = -1;
        }
        return z || !((i == 3) || Preference.j().getBoolean("isRoamingState", false) || com.vk.core.utils.newtork.b.c().e.a);
    }

    public static PlayState o0(@Nullable ry40 ry40Var) {
        return (ry40Var == null || !ry40Var.j()) ? (ry40Var == null || !ry40Var.i()) ? ry40Var instanceof ry40.f ? PlayState.STOPPED : PlayState.IDLE : PlayState.PAUSED : PlayState.PLAYING;
    }

    public static boolean u0(ry40 ry40Var) {
        if (!(ry40Var instanceof ry40.f)) {
            return ry40Var instanceof ry40.b;
        }
        ry40.f fVar = (ry40.f) ry40Var;
        kw40.c cVar = fVar.d;
        return !(fVar.c.a || (cVar.b instanceof agl0.b)) || cVar.a.e;
    }

    @Override // xsna.kza0
    public final void A() {
        this.y.z(new pf40(this, 6));
    }

    @Override // xsna.kza0
    public final void B(int i, @Nullable String str, boolean z) {
        bn40.f("reset: ", Boolean.valueOf(z), "reason:", "stop");
        this.j.G(false, true);
        com.vk.music.player.f fVar = this.e;
        if (fVar.f() != null) {
            vy40.a v0 = v0("stop", str);
            vy40 vy40Var = this.o;
            vy40Var.getClass();
            vy40Var.f(v0, null);
            vy40Var.c.w0();
            h();
        }
        r950 r950Var = this.c;
        if (r950Var != null) {
            r950Var.stop(i);
        }
        if (z) {
            this.y.j(null);
            fVar.a(false);
        } else {
            int i2 = fVar.i;
            fVar.g = new int[i2];
            fVar.h = new long[i2];
        }
    }

    @Override // xsna.kza0
    public final com.vk.music.player.f C() {
        return this.e;
    }

    @Override // xsna.kza0
    public final void D(List<MusicTrack> list, @Nullable Integer num, MusicPlaybackLaunchContext musicPlaybackLaunchContext, int i, boolean z, @Nullable String str, @Nullable StartPlaySource startPlaySource, @NonNull PlaybackActionMeta playbackActionMeta, @Nullable AdsAudioPixelsContainer adsAudioPixelsContainer) {
        r950 r950Var = this.c;
        boolean z2 = r950Var != null && r950Var.e();
        PlayerUIComponent playerUIComponent = this.H;
        if (!z2 || (ad0.u(list) && startPlaySource == null)) {
            bn40.f("Track was not started: player can Play = ", Boolean.valueOf(z2), " , track is empty = ", Boolean.valueOf(ad0.u(list)), " , source = ", startPlaySource);
            e5b0 w4 = playerUIComponent.w4();
            if (w4.b) {
                return;
            }
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            mzp0 e2 = rzp0.e(w4.a);
            if (e2 != null) {
                e2.f();
                I(e2.Y0());
                s3q0 s3q0Var = s3q0.a;
                return;
            }
            return;
        }
        if (com.vk.toggle.b.A.a(MusicFeatures.PLAYER_REFACTORING)) {
            hxa0 hxa0Var = this.y;
            iya0 iya0Var = this.A;
            iya0Var.a = hxa0Var;
            iya0Var.b = list;
            iya0Var.c = r950Var.k;
            mkl mklVar = this.z;
            iya0 iya0Var2 = (iya0) mklVar.d;
            hxa0 hxa0Var2 = iya0Var2.a;
            if (hxa0Var2 == null) {
                hxa0Var2 = new hya0((com.vk.music.pref.a) mklVar.b, (zl20) mklVar.c, iya0Var2.c, (nxa0) mklVar.e).a();
            }
            this.y = hxa0Var2;
            this.L = new com.vk.music.player.a(this.q, hxa0Var2, r950Var.k);
        }
        e5b0 w42 = playerUIComponent.w4();
        if (!w42.b) {
            LruCache<UUID, mzp0> lruCache2 = rzp0.a;
            mzp0 e3 = rzp0.e(w42.a);
            if (e3 != null) {
                e3.a();
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
        this.y.o(startPlaySource, num, list, z, musicPlaybackLaunchContext, adsAudioPixelsContainer, new y1b0(this, musicPlaybackLaunchContext, i, playbackActionMeta, str));
    }

    @Override // xsna.kza0
    public final boolean E() {
        return this.y.getSize() > 0;
    }

    @Override // xsna.kza0
    public final void F() {
        this.y.a();
        e5b0 w4 = this.H.w4();
        if (w4.b) {
            return;
        }
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 e2 = rzp0.e(w4.a);
        if (e2 != null) {
            e2.g();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void G(int i, VkPlayerException vkPlayerException) {
        boolean z;
        bn40.d("errorType: ", vkPlayerException.d().name());
        if (i == 0) {
            Iterator it = this.d.iterator();
            loop0: while (true) {
                z = false;
                while (it.hasNext()) {
                    if (((com.vk.music.player.e) it.next()).t3(vkPlayerException) || z) {
                        z = true;
                    }
                }
            }
            if (!z) {
                int i2 = b.b[vkPlayerException.d().ordinal()];
                d dVar = this.f;
                if (i2 == 1) {
                    dVar.b(new Object[0], R.string.music_player_error_timeout, true);
                } else if (i2 != 2) {
                    r6m.a.getClass();
                    if (!r6m.j()) {
                        dVar.b(new Object[0], R.string.music_player_error_no_connection, true);
                    } else if (vkPlayerException instanceof VkPlayerException.NoVkMixException) {
                        dVar.b(new Object[0], R.string.music_player_error_during_playback, false);
                    } else {
                        dVar.b(new Object[0], R.string.music_player_error_during_playback, true);
                    }
                } else {
                    dVar.b(new Object[0], R.string.music_player_error_unsupported_format, true);
                }
            }
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.t;
            kjb0 kjb0Var = this.m;
            e2b0 e2b0Var = kjb0Var.d;
            jjb0 jjb0Var = kjb0Var.c;
            if (jjb0Var != null) {
                jjb0Var.c("podcast_error", true, musicPlaybackLaunchContext, e2b0Var.q.l(), null);
            }
        }
    }

    @Override // xsna.kza0
    public final void H(String str) {
        bn40.f(go9.b("trackUUID: ", str));
        this.y.k(Collections.singletonList(str));
        k840.a.h.b(new bb50(this.t.Kb()));
        d0();
    }

    public final void I(UUID uuid) {
        PlayerUIComponent playerUIComponent = this.H;
        playerUIComponent.w4().a = uuid;
        playerUIComponent.w4().b = true;
    }

    @Override // xsna.kza0
    public final void J(boolean z, @NonNull agk agkVar) {
        this.h.post(new nx3(this, 13));
        this.y.y(z, new ke4(6, this, agkVar));
    }

    @Override // xsna.kza0
    public final boolean K(int i, @NonNull PauseReason pauseReason, @NonNull Runnable runnable, @Nullable String str) {
        this.j.c.i = false;
        r950 r950Var = this.c;
        if (r950Var == null) {
            return false;
        }
        e940 e940Var = r950Var.d;
        if (e940Var.j() && r950Var.j.j()) {
            r950Var.n = true;
            e940Var.l(i);
        } else if (!(r950Var.j instanceof ry40.f)) {
            r950Var.c.d(i, runnable);
        }
        com.vk.music.pref.a aVar = this.q;
        aVar.B0(false);
        aVar.Q0(false);
        aVar.u0();
        if (this.e.f() == null) {
            b0("forcePause");
            return true;
        }
        this.m.a(this.t);
        this.o.f(v0(null, str), pauseReason);
        h();
        return true;
    }

    @Override // xsna.kza0
    public final boolean L(PlaybackActionMeta playbackActionMeta, @Nullable String str) {
        bn40.f(new Object[0]);
        if (!T() || o0(this.u).h() || this.y.b() == null || this.y.b().b.S4()) {
            int i = b.a[o0(this.u).ordinal()];
            if (i == 1 || i == 2) {
                com.vk.music.player.f fVar = this.e;
                if (fVar.m()) {
                    g0(fVar.c.f, false, true, false, "new", playbackActionMeta, str);
                    return true;
                }
                z(playbackActionMeta, "auto", str, true);
                return true;
            }
            if (i == 3) {
                return m(str, playbackActionMeta.b, false, false);
            }
            if (i == 4) {
                return M(false, playbackActionMeta, str);
            }
        }
        return false;
    }

    @Override // xsna.xza0
    public final boolean M(boolean z, PlaybackActionMeta playbackActionMeta, @Nullable String str) {
        AdsAudioPixelsContainer adsAudioPixelsContainer;
        o450 o450Var = this.C;
        o450Var.e();
        bn40.f(new Object[0]);
        r950 r950Var = this.c;
        if (r950Var == null || !r950Var.f(playbackActionMeta)) {
            return false;
        }
        this.j.I();
        com.vk.music.player.f fVar = this.e;
        MusicTrack f2 = fVar.f();
        if (f2 != null) {
            if (!f2.Wb()) {
                o450Var.c(f2);
            }
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.t;
            kjb0 kjb0Var = this.m;
            e2b0 e2b0Var = kjb0Var.d;
            jjb0 jjb0Var = kjb0Var.c;
            if (jjb0Var != null) {
                jjb0Var.a(musicPlaybackLaunchContext, e2b0Var.q.l(), e2b0Var.e, z);
            }
            this.o.e(v0("continue", str), z ? ResumeReason.AUTO : null);
        } else {
            b0(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        }
        PlayerTrack playerTrack = fVar.c;
        if (playerTrack == null || (adsAudioPixelsContainer = playerTrack.c.f) == null) {
            return true;
        }
        ((cs4) this.E.getValue()).c(adsAudioPixelsContainer);
        return true;
    }

    @Override // xsna.kza0
    public final void N(String str) {
        this.C.e();
        PlayerTrack p0 = p0(Boolean.FALSE, str);
        i0(p0, new PlaybackActionMeta(29, SystemClock.elapsedRealtime()), false, null, new bl30(this, 7), new com.vk.movika.sdk.base.ui.s(15, this, p0));
    }

    @Override // xsna.kza0
    public final void O(String str, boolean z, String str2, PlaybackActionMeta playbackActionMeta, @Nullable String str3) {
        g0(str, z, true, false, str2, playbackActionMeta, str3);
    }

    @Override // xsna.kza0
    public final boolean P() {
        return this.L.d != null;
    }

    @Override // xsna.kza0
    public final long Q() {
        return this.n.a();
    }

    public final int R() {
        r950 r950Var = this.c;
        if (r950Var == null || !r950Var.z()) {
            return 0;
        }
        return r950Var.getAudioSessionId();
    }

    public final void S(@Nullable String str) {
        if (str != null) {
            com.vk.music.player.f fVar = this.e;
            PlayerTrack playerTrack = fVar.c;
            PlayerTrack t = this.y.t(str);
            boolean z = playerTrack != null && playerTrack.f.equals(str);
            if (t != null || !z) {
                playerTrack = t;
            }
            if (playerTrack != null) {
                fVar.a(z);
                fVar.q(playerTrack);
                fVar.e[0] = playerTrack.b.c0;
            }
        }
        d0();
    }

    public final boolean T() {
        CoreFeatures coreFeatures = CoreFeatures.KBH_DETECT;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            MusicTrack f2 = this.e.f();
            boolean z = f2 != null && f2.S4();
            if (this.N == NetworkState.UNSTABLE && !z) {
                return true;
            }
        }
        return false;
    }

    public final boolean U() {
        MusicTrack f2 = this.e.f();
        if (f2 == null) {
            return false;
        }
        return f2.Ob() || f2.Vb() || f2.Mb();
    }

    public final boolean W(PlayerTrack playerTrack) {
        MusicTrack musicTrack = playerTrack == null ? null : playerTrack.b;
        boolean z = musicTrack != null;
        Episode episode = z ? musicTrack.w : null;
        boolean z2 = episode != null;
        boolean z3 = z && musicTrack.Ub();
        boolean z4 = z && musicTrack.Mb();
        if (z2) {
            episode.d = 0L;
        }
        if (z3) {
            playerTrack.d = 0;
        }
        return (this.q.n0() != LoopMode.TRACK || z2 || z4 || z3) ? false : true;
    }

    public final void X(int i) {
        Handler handler = this.h;
        handler.removeMessages(i);
        Message.obtain(handler, i).sendToTarget();
    }

    public final void Y(PlayerInvalidateMessage playerInvalidateMessage) {
        this.i.b.onNext(playerInvalidateMessage);
    }

    public final void Z() {
        if (com.vk.toggle.b.A.a(MusicFeatures.PLAYER_REFACTORING)) {
            Y(PlayerInvalidateMessage.PARAMETERS_CHANGED);
        } else {
            X(5);
        }
    }

    @Override // xsna.kza0
    public final LoopMode a() {
        return this.q.n0();
    }

    public final void a0() {
        if (com.vk.toggle.b.A.a(MusicFeatures.PLAYER_REFACTORING)) {
            Y(PlayerInvalidateMessage.PROGRESS);
        } else {
            X(3);
        }
    }

    @Override // xsna.kza0
    public final void b(@NonNull LoopMode loopMode) {
        this.q.b(loopMode);
        com.vk.music.player.a aVar = this.L;
        if (aVar != null) {
            aVar.c = loopMode;
        }
        Z();
        if (com.vk.toggle.b.A.a(MusicFeatures.PLAYER_REFACTORING)) {
            Y(PlayerInvalidateMessage.LOOPING_MODE_CHANGED);
        } else {
            X(6);
        }
        this.y.p(new ekh(this, 26));
    }

    public final void b0(@NonNull String str) {
        com.vk.music.player.f fVar = this.e;
        boolean z = (fVar == null || fVar.n()) ? false : true;
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b2 = h5s.b("music_failed_send_stat");
        b2.c("refer", this.t.t());
        b2.a(Boolean.valueOf(z), "is_playing_ad");
        b2.c("reason", str);
        b2.f();
        bVar.k(b2.e());
    }

    @Override // xsna.kza0
    public final boolean c() {
        return this.q.M();
    }

    public final void c0() {
        this.g.d(o0(this.u), this.e, k(), this.y.getSize());
        if (com.vk.toggle.b.A.a(MusicFeatures.PLAYER_REFACTORING)) {
            Y(PlayerInvalidateMessage.STATE_CHANGED);
        } else {
            X(1);
        }
    }

    @Override // xsna.kza0
    public final List<gza0> d() {
        return this.y.d();
    }

    public final void d0() {
        if (com.vk.toggle.b.A.a(MusicFeatures.PLAYER_REFACTORING)) {
            Y(PlayerInvalidateMessage.TRACKS_CHANGED);
        } else {
            X(2);
        }
    }

    @Override // xsna.kza0
    public final void e() {
        bn40.f(new Object[0]);
        this.y.e();
        d0();
    }

    public final void e0() {
        this.o.d(v0("stop", null));
        h();
    }

    @Override // xsna.xza0
    public final boolean f(PlaybackActionMeta playbackActionMeta) {
        return M(false, playbackActionMeta, null);
    }

    public final boolean f0(int i) {
        bn40.f(new Object[0]);
        return m(null, i, false, false);
    }

    @Override // xsna.kza0
    public final List<PlayerTrack> g() {
        return this.y.n();
    }

    public final void g0(String str, boolean z, boolean z2, final boolean z3, final String str2, PlaybackActionMeta playbackActionMeta, @Nullable final String str3) {
        r950 r950Var = this.c;
        if (r950Var == null || !r950Var.e()) {
            bn40.f("Track was not started: player can't play");
            return;
        }
        this.C.e();
        PlayState o0 = o0(this.u);
        bn40.f("uuid: ", str, " preserveState: ", Boolean.valueOf(z), " clearPreserveProgress: ", Boolean.valueOf(z3), " previousState: ", o0);
        int i = playbackActionMeta.b;
        if (i == 35) {
            i = this.y.A(str) ? 7 : 8;
        }
        final PlayerTrack p0 = p0(Boolean.TRUE, str);
        PlaybackActionMeta playbackActionMeta2 = new PlaybackActionMeta(i, playbackActionMeta.c);
        boolean z4 = true;
        if (this.L != null && p0 != null && !(i() instanceof StartPlayVkMixSource)) {
            com.vk.music.player.a aVar = this.L;
            int size = this.y.getSize();
            int i2 = p0.d;
            uq50 uq50Var = new uq50(this, 13);
            if (!aVar.f && !aVar.j && aVar.i && size - 3 < i2 + 1) {
                aVar.c(uq50Var);
            }
        }
        if (!z2 || (z && o0 == PlayState.PAUSED)) {
            z4 = false;
        }
        i0(p0, playbackActionMeta2, z4, new na5(this, str2, playbackActionMeta, str3, 2), new el30(this, 16), new gzs() { // from class: xsna.d2b0
            @Override // xsna.gzs
            public final Object invoke() {
                e2b0 e2b0Var = e2b0.this;
                r950 r950Var2 = e2b0Var.c;
                e2b0Var.j.I();
                PlayerTrack playerTrack = p0;
                boolean z5 = z3;
                String str4 = str2;
                e2b0Var.s0(playerTrack, z5, str4);
                bpn0 bpn0Var = e2b0Var.I;
                if (MusicFeatures.AUDIO_AUTO_DOWNLOAD.h() && bpn0Var.isInitialized()) {
                    String valueOf = String.valueOf(o25.a().c().b);
                    String Fb = playerTrack.b.Fb();
                    ((mzc0) bpn0Var.getValue()).a(qni0.a(), valueOf, Fb);
                }
                if (!e2b0Var.k && (e2b0.o0(e2b0Var.u).h() || r950Var2 != null)) {
                    MusicTrack musicTrack = playerTrack.b;
                    if (!musicTrack.Wb()) {
                        e2b0Var.C.c(musicTrack);
                    }
                    e2b0Var.o.e(e2b0Var.v0(str4, str3), null);
                }
                if (r950Var2 != null && !e2b0.u0(r950Var2.j)) {
                    e2b0Var.c0();
                }
                e2b0Var.k = false;
                return s3q0.a;
            }
        });
    }

    @Override // xsna.kza0
    public final long getDuration() {
        r950 r950Var = this.c;
        if (r950Var == null) {
            return 0L;
        }
        e940 e940Var = r950Var.d;
        if (!e940Var.j()) {
            return r950Var.c.l();
        }
        g8x.c cVar = e940Var.f.d;
        return (long) (cVar != null ? cVar.a : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.kza0
    @Nullable
    public final MediaSessionCompat getMediaSession() {
        return this.g.c;
    }

    @Override // xsna.kza0
    @NonNull
    public final PlayState getState() {
        return o0(this.u);
    }

    @Override // xsna.xza0
    public final float getVolume() {
        r950 r950Var = this.c;
        if (r950Var == null || !r950Var.z()) {
            return 1.0f;
        }
        return r950Var.C();
    }

    public final void h() {
        com.vk.music.player.f fVar = this.e;
        MusicTrack f2 = fVar.f();
        AudioBookChapter audioBookChapter = f2 == null ? null : f2.O;
        if (audioBookChapter == null) {
            return;
        }
        ((r05) this.D.getValue()).a(fVar.h(), fVar.e(), f2.V, audioBookChapter.b);
    }

    public final void h0(@NonNull PlaybackActionMeta playbackActionMeta, boolean z, @Nullable gzs<s3q0> gzsVar) {
        com.vk.music.player.a aVar = this.L;
        if (aVar == null) {
            gzsVar.invoke();
            return;
        }
        dlb dlbVar = new dlb(this, gzsVar, playbackActionMeta, 9);
        PlayerTrack c2 = aVar.a.c();
        if (!epx.f(aVar.g, c2)) {
            aVar.g = c2;
        }
        if (!aVar.d()) {
            dlbVar.invoke(null);
            aVar.b();
            return;
        }
        lqk0 lqk0Var = aVar.d;
        if (lqk0Var != null) {
            dlbVar.invoke(lqk0Var);
            aVar.b();
        } else if (z) {
            dlbVar.invoke(null);
        } else if (aVar.e) {
            dlbVar.invoke(null);
            aVar.b();
        } else {
            aVar.l.b(aVar.e().subscribe(new defpackage.x(new nm1(1, dlbVar, aVar), 4), new ph3(new oh3(2, dlbVar, aVar), 3)));
        }
    }

    @Override // xsna.kza0
    @Nullable
    public final StartPlaySource i() {
        com.vk.music.player.playback.e i = this.y.i();
        if (i == null) {
            return null;
        }
        return i.a;
    }

    public final void i0(@Nullable final PlayerTrack playerTrack, final PlaybackActionMeta playbackActionMeta, final boolean z, @Nullable final na5 na5Var, @NonNull final izs izsVar, @NonNull final gzs gzsVar) {
        if (playerTrack == null) {
            bn40.d("No track found to play");
            izsVar.invoke(Integer.valueOf(R.string.music_player_error_unable_to_play));
            return;
        }
        bn40.f("Start play track: " + playerTrack);
        final int incrementAndGet = this.P.incrementAndGet();
        final MusicTrack musicTrack = playerTrack.b;
        asu0.a.getClass();
        asu0.n().submit(new Runnable() { // from class: xsna.b2b0
            /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:3:0x0007, B:24:0x0017, B:9:0x0034, B:10:0x003c, B:12:0x0042, B:6:0x0022, B:26:0x001d), top: B:2:0x0007, inners: #1 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                final File file;
                File a2;
                a9r a9rVar;
                boolean exists;
                try {
                    a2 = yx8.a(musicTrack.Fb());
                    a9rVar = new a9r(a2);
                    exists = a2.exists();
                } catch (Exception e2) {
                    L.i(e2);
                }
                if (exists) {
                    try {
                        a9rVar.a();
                    } catch (IOException unused) {
                        a2.delete();
                    }
                    if (exists) {
                        Iterator it = a9rVar.b().iterator();
                        while (it.hasNext()) {
                            if (!((a9r.a) it.next()).c) {
                            }
                        }
                        file = a2;
                        final e2b0 e2b0Var = e2b0.this;
                        Handler handler = e2b0Var.h;
                        final int i = incrementAndGet;
                        final gzs gzsVar2 = na5Var;
                        final PlayerTrack playerTrack2 = playerTrack;
                        final PlaybackActionMeta playbackActionMeta2 = playbackActionMeta;
                        final boolean z2 = z;
                        final gzs gzsVar3 = gzsVar;
                        final izs izsVar2 = izsVar;
                        handler.post(new Runnable() { // from class: xsna.c2b0
                            /* JADX WARN: Can't wrap try/catch for region: R(10:60|61|(7:72|(6:(1:75)(1:85)|76|(1:78)|79|(1:81)(1:84)|82)|86|87|88|89|90)|98|(0)|86|87|88|89|90) */
                            /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
                            
                                if (r9 == false) goto L29;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
                            
                                r14 = r2.l();
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
                            
                                r9 = new xsna.uz4(r4.toURI().toString(), false, false);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
                            
                                r4 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
                            
                                r3.u(new xsna.kx40(r9, r8, new xsna.wva0(r10, -1L), r5.c, r11, r12, r8.a0, r14, xsna.x6b0.d.getSTUB()));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
                            
                                r0 = e;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
                            
                                xsna.bn40.c(r0, new java.lang.Object[r4]);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:45:0x00a8, code lost:
                            
                                r0 = e;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
                            
                                r4 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:48:0x0075, code lost:
                            
                                r14 = 1.0f;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:92:0x016a, code lost:
                            
                                r0 = e;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                            
                                xsna.bn40.c(r0, new java.lang.Object[r15]);
                             */
                            /* JADX WARN: Removed duplicated region for block: B:35:0x0185  */
                            /* JADX WARN: Removed duplicated region for block: B:38:0x018b  */
                            /* JADX WARN: Removed duplicated region for block: B:74:0x0113  */
                            /* JADX WARN: Removed duplicated region for block: B:96:0x017c  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                int i2;
                                int i3;
                                int i4;
                                boolean z3;
                                int i5;
                                e2b0 e2b0Var2 = e2b0.this;
                                com.vk.music.pref.a aVar = e2b0Var2.q;
                                r950 r950Var = e2b0Var2.c;
                                if (i != e2b0Var2.P.get()) {
                                    return;
                                }
                                gzs gzsVar4 = gzsVar2;
                                if (gzsVar4 != null) {
                                    gzsVar4.invoke();
                                }
                                File file2 = file;
                                PlayerTrack playerTrack3 = playerTrack2;
                                PlaybackActionMeta playbackActionMeta3 = playbackActionMeta2;
                                boolean z4 = z2;
                                int i6 = R.string.music_player_error_unable_to_play;
                                boolean z5 = true;
                                if (file2 == null || !file2.exists()) {
                                    bpn0 bpn0Var = e2b0Var2.I;
                                    MusicTrack musicTrack2 = playerTrack3.b;
                                    String str = musicTrack2.i;
                                    if (str == null) {
                                        str = "";
                                    }
                                    bn40.f("playUrl: ", str, ", refer.source: ", MusicPlaybackLaunchContext.Mb(e2b0Var2.t));
                                    if ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(musicTrack2.Fb())) || musicTrack2.Sb()) {
                                        try {
                                            i4 = (int) playerTrack3.e;
                                        } catch (Exception e3) {
                                            e = e3;
                                            i3 = 0;
                                        }
                                        if (!musicTrack2.Ub() && !musicTrack2.Vb() && !musicTrack2.Mb() && (!musicTrack2.Qb() || musicTrack2.Wb())) {
                                            z3 = false;
                                            if (r950Var != null) {
                                                float l = z3 ? aVar.l() : 1.0f;
                                                if (bpn0Var.isInitialized()) {
                                                    ((mzc0) bpn0Var.getValue()).reset();
                                                }
                                                Cache cache = e2b0Var2.F.getCache();
                                                r950Var.u(new kx40(new uz4(str, true, cache != null ? ((androidx.media3.datasource.cache.c) cache).getKeys().contains(str) : false), musicTrack2, new wva0(i4, -1L), playerTrack3.c, playbackActionMeta3, z4, musicTrack2.a0, l, r950Var.c.j));
                                            }
                                            i3 = 0;
                                            e2b0Var2.v = 0;
                                            i2 = 0;
                                            i6 = i2;
                                        }
                                        z3 = true;
                                        if (r950Var != null) {
                                        }
                                        i3 = 0;
                                        e2b0Var2.v = 0;
                                        i2 = 0;
                                        i6 = i2;
                                    }
                                    r6m.a.getClass();
                                    if (!r6m.j()) {
                                        i6 = R.string.music_player_error_no_connection;
                                    }
                                    i2 = i6;
                                    i6 = i2;
                                } else {
                                    MusicTrack musicTrack3 = playerTrack3.b;
                                    bn40.f("playFile: ", file2, ", refer.source: ", MusicPlaybackLaunchContext.Mb(e2b0Var2.t));
                                    try {
                                        int i7 = (int) playerTrack3.e;
                                        if (!musicTrack3.Ub() && !musicTrack3.Vb() && (!musicTrack3.Qb() || musicTrack3.Wb())) {
                                            z5 = false;
                                        }
                                        i5 = 0;
                                        e2b0Var2.v = i5;
                                        i6 = i5;
                                    } catch (Exception e4) {
                                        e = e4;
                                        i5 = 0;
                                    }
                                }
                                if (i6 != 0) {
                                    gzsVar3.invoke();
                                } else {
                                    izsVar2.invoke(Integer.valueOf(i6));
                                }
                            }
                        });
                    }
                    file = null;
                    final e2b0 e2b0Var2 = e2b0.this;
                    Handler handler2 = e2b0Var2.h;
                    final int i2 = incrementAndGet;
                    final gzs gzsVar22 = na5Var;
                    final PlayerTrack playerTrack22 = playerTrack;
                    final PlaybackActionMeta playbackActionMeta22 = playbackActionMeta;
                    final boolean z22 = z;
                    final gzs gzsVar32 = gzsVar;
                    final izs izsVar22 = izsVar;
                    handler2.post(new Runnable() { // from class: xsna.c2b0
                        /* JADX WARN: Can't wrap try/catch for region: R(10:60|61|(7:72|(6:(1:75)(1:85)|76|(1:78)|79|(1:81)(1:84)|82)|86|87|88|89|90)|98|(0)|86|87|88|89|90) */
                        /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
                        
                            if (r9 == false) goto L29;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
                        
                            r14 = r2.l();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
                        
                            r9 = new xsna.uz4(r4.toURI().toString(), false, false);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
                        
                            r4 = 0;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
                        
                            r3.u(new xsna.kx40(r9, r8, new xsna.wva0(r10, -1L), r5.c, r11, r12, r8.a0, r14, xsna.x6b0.d.getSTUB()));
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
                        
                            r0 = e;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
                        
                            xsna.bn40.c(r0, new java.lang.Object[r4]);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:45:0x00a8, code lost:
                        
                            r0 = e;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
                        
                            r4 = 0;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:48:0x0075, code lost:
                        
                            r14 = 1.0f;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:92:0x016a, code lost:
                        
                            r0 = e;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                        
                            xsna.bn40.c(r0, new java.lang.Object[r15]);
                         */
                        /* JADX WARN: Removed duplicated region for block: B:35:0x0185  */
                        /* JADX WARN: Removed duplicated region for block: B:38:0x018b  */
                        /* JADX WARN: Removed duplicated region for block: B:74:0x0113  */
                        /* JADX WARN: Removed duplicated region for block: B:96:0x017c  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            int i22;
                            int i3;
                            int i4;
                            boolean z3;
                            int i5;
                            e2b0 e2b0Var22 = e2b0.this;
                            com.vk.music.pref.a aVar = e2b0Var22.q;
                            r950 r950Var = e2b0Var22.c;
                            if (i2 != e2b0Var22.P.get()) {
                                return;
                            }
                            gzs gzsVar4 = gzsVar22;
                            if (gzsVar4 != null) {
                                gzsVar4.invoke();
                            }
                            File file2 = file;
                            PlayerTrack playerTrack3 = playerTrack22;
                            PlaybackActionMeta playbackActionMeta3 = playbackActionMeta22;
                            boolean z4 = z22;
                            int i6 = R.string.music_player_error_unable_to_play;
                            boolean z5 = true;
                            if (file2 == null || !file2.exists()) {
                                bpn0 bpn0Var = e2b0Var22.I;
                                MusicTrack musicTrack2 = playerTrack3.b;
                                String str = musicTrack2.i;
                                if (str == null) {
                                    str = "";
                                }
                                bn40.f("playUrl: ", str, ", refer.source: ", MusicPlaybackLaunchContext.Mb(e2b0Var22.t));
                                if ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(musicTrack2.Fb())) || musicTrack2.Sb()) {
                                    try {
                                        i4 = (int) playerTrack3.e;
                                    } catch (Exception e3) {
                                        e = e3;
                                        i3 = 0;
                                    }
                                    if (!musicTrack2.Ub() && !musicTrack2.Vb() && !musicTrack2.Mb() && (!musicTrack2.Qb() || musicTrack2.Wb())) {
                                        z3 = false;
                                        if (r950Var != null) {
                                            float l = z3 ? aVar.l() : 1.0f;
                                            if (bpn0Var.isInitialized()) {
                                                ((mzc0) bpn0Var.getValue()).reset();
                                            }
                                            Cache cache = e2b0Var22.F.getCache();
                                            r950Var.u(new kx40(new uz4(str, true, cache != null ? ((androidx.media3.datasource.cache.c) cache).getKeys().contains(str) : false), musicTrack2, new wva0(i4, -1L), playerTrack3.c, playbackActionMeta3, z4, musicTrack2.a0, l, r950Var.c.j));
                                        }
                                        i3 = 0;
                                        e2b0Var22.v = 0;
                                        i22 = 0;
                                        i6 = i22;
                                    }
                                    z3 = true;
                                    if (r950Var != null) {
                                    }
                                    i3 = 0;
                                    e2b0Var22.v = 0;
                                    i22 = 0;
                                    i6 = i22;
                                }
                                r6m.a.getClass();
                                if (!r6m.j()) {
                                    i6 = R.string.music_player_error_no_connection;
                                }
                                i22 = i6;
                                i6 = i22;
                            } else {
                                MusicTrack musicTrack3 = playerTrack3.b;
                                bn40.f("playFile: ", file2, ", refer.source: ", MusicPlaybackLaunchContext.Mb(e2b0Var22.t));
                                try {
                                    int i7 = (int) playerTrack3.e;
                                    if (!musicTrack3.Ub() && !musicTrack3.Vb() && (!musicTrack3.Qb() || musicTrack3.Wb())) {
                                        z5 = false;
                                    }
                                    i5 = 0;
                                    e2b0Var22.v = i5;
                                    i6 = i5;
                                } catch (Exception e4) {
                                    e = e4;
                                    i5 = 0;
                                }
                            }
                            if (i6 != 0) {
                                gzsVar32.invoke();
                            } else {
                                izsVar22.invoke(Integer.valueOf(i6));
                            }
                        }
                    });
                }
                a9rVar.a.delete();
                a9rVar.c = 0L;
                a9rVar.d = null;
                a9rVar.b.b = null;
                exists = false;
                if (exists) {
                }
                file = null;
                final e2b0 e2b0Var22 = e2b0.this;
                Handler handler22 = e2b0Var22.h;
                final int i22 = incrementAndGet;
                final gzs gzsVar222 = na5Var;
                final PlayerTrack playerTrack222 = playerTrack;
                final PlaybackActionMeta playbackActionMeta222 = playbackActionMeta;
                final boolean z222 = z;
                final gzs gzsVar322 = gzsVar;
                final izs izsVar222 = izsVar;
                handler22.post(new Runnable() { // from class: xsna.c2b0
                    /* JADX WARN: Can't wrap try/catch for region: R(10:60|61|(7:72|(6:(1:75)(1:85)|76|(1:78)|79|(1:81)(1:84)|82)|86|87|88|89|90)|98|(0)|86|87|88|89|90) */
                    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
                    
                        if (r9 == false) goto L29;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
                    
                        r14 = r2.l();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
                    
                        r9 = new xsna.uz4(r4.toURI().toString(), false, false);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
                    
                        r4 = 0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
                    
                        r3.u(new xsna.kx40(r9, r8, new xsna.wva0(r10, -1L), r5.c, r11, r12, r8.a0, r14, xsna.x6b0.d.getSTUB()));
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
                    
                        r0 = e;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
                    
                        xsna.bn40.c(r0, new java.lang.Object[r4]);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a8, code lost:
                    
                        r0 = e;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
                    
                        r4 = 0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:48:0x0075, code lost:
                    
                        r14 = 1.0f;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:92:0x016a, code lost:
                    
                        r0 = e;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                    
                        xsna.bn40.c(r0, new java.lang.Object[r15]);
                     */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x0185  */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x018b  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x0113  */
                    /* JADX WARN: Removed duplicated region for block: B:96:0x017c  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        int i222;
                        int i3;
                        int i4;
                        boolean z3;
                        int i5;
                        e2b0 e2b0Var222 = e2b0.this;
                        com.vk.music.pref.a aVar = e2b0Var222.q;
                        r950 r950Var = e2b0Var222.c;
                        if (i22 != e2b0Var222.P.get()) {
                            return;
                        }
                        gzs gzsVar4 = gzsVar222;
                        if (gzsVar4 != null) {
                            gzsVar4.invoke();
                        }
                        File file2 = file;
                        PlayerTrack playerTrack3 = playerTrack222;
                        PlaybackActionMeta playbackActionMeta3 = playbackActionMeta222;
                        boolean z4 = z222;
                        int i6 = R.string.music_player_error_unable_to_play;
                        boolean z5 = true;
                        if (file2 == null || !file2.exists()) {
                            bpn0 bpn0Var = e2b0Var222.I;
                            MusicTrack musicTrack2 = playerTrack3.b;
                            String str = musicTrack2.i;
                            if (str == null) {
                                str = "";
                            }
                            bn40.f("playUrl: ", str, ", refer.source: ", MusicPlaybackLaunchContext.Mb(e2b0Var222.t));
                            if ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(musicTrack2.Fb())) || musicTrack2.Sb()) {
                                try {
                                    i4 = (int) playerTrack3.e;
                                } catch (Exception e3) {
                                    e = e3;
                                    i3 = 0;
                                }
                                if (!musicTrack2.Ub() && !musicTrack2.Vb() && !musicTrack2.Mb() && (!musicTrack2.Qb() || musicTrack2.Wb())) {
                                    z3 = false;
                                    if (r950Var != null) {
                                        float l = z3 ? aVar.l() : 1.0f;
                                        if (bpn0Var.isInitialized()) {
                                            ((mzc0) bpn0Var.getValue()).reset();
                                        }
                                        Cache cache = e2b0Var222.F.getCache();
                                        r950Var.u(new kx40(new uz4(str, true, cache != null ? ((androidx.media3.datasource.cache.c) cache).getKeys().contains(str) : false), musicTrack2, new wva0(i4, -1L), playerTrack3.c, playbackActionMeta3, z4, musicTrack2.a0, l, r950Var.c.j));
                                    }
                                    i3 = 0;
                                    e2b0Var222.v = 0;
                                    i222 = 0;
                                    i6 = i222;
                                }
                                z3 = true;
                                if (r950Var != null) {
                                }
                                i3 = 0;
                                e2b0Var222.v = 0;
                                i222 = 0;
                                i6 = i222;
                            }
                            r6m.a.getClass();
                            if (!r6m.j()) {
                                i6 = R.string.music_player_error_no_connection;
                            }
                            i222 = i6;
                            i6 = i222;
                        } else {
                            MusicTrack musicTrack3 = playerTrack3.b;
                            bn40.f("playFile: ", file2, ", refer.source: ", MusicPlaybackLaunchContext.Mb(e2b0Var222.t));
                            try {
                                int i7 = (int) playerTrack3.e;
                                if (!musicTrack3.Ub() && !musicTrack3.Vb() && (!musicTrack3.Qb() || musicTrack3.Wb())) {
                                    z5 = false;
                                }
                                i5 = 0;
                                e2b0Var222.v = i5;
                                i6 = i5;
                            } catch (Exception e4) {
                                e = e4;
                                i5 = 0;
                            }
                        }
                        if (i6 != 0) {
                            gzsVar322.invoke();
                        } else {
                            izsVar222.invoke(Integer.valueOf(i6));
                        }
                    }
                });
            }
        });
    }

    @Override // xsna.xza0
    public final boolean j(int i, PlaybackActionMeta playbackActionMeta) {
        boolean z;
        int i2;
        com.vk.music.player.f fVar = this.e;
        int h = fVar.h();
        bn40.f("millis: ", Integer.valueOf(i));
        r950 r950Var = this.c;
        if (r950Var != null) {
            z = r950Var.j(i, playbackActionMeta);
            i2 = !(r950Var.c() instanceof cz40.b) ? 1 : 0;
        } else {
            z = false;
            i2 = 0;
        }
        if (!z) {
            return false;
        }
        fVar.p(i2, i);
        this.g.d(o0(this.u), fVar, k(), this.y.getSize());
        a0();
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.t;
        kjb0 kjb0Var = this.m;
        e2b0 e2b0Var = kjb0Var.d;
        jjb0 jjb0Var = kjb0Var.c;
        if (jjb0Var != null) {
            float l = e2b0Var.q.l();
            com.vk.music.player.f fVar2 = e2b0Var.e;
            jjb0Var.c("podcast_play", true, musicPlaybackLaunchContext, l, pn00.k(new Pair("action", "seek"), new Pair("position_from", Integer.valueOf(h / 1000)), new Pair(X3.i.L, Integer.valueOf(fVar2 != null ? fVar2.h() / 1000 : 0))));
        }
        kjb0Var.b = true;
        this.p.h = h / 1000;
        vy40 vy40Var = this.o;
        vy40Var.g = true;
        vy40Var.c.r(i);
        h();
        return true;
    }

    public final boolean j0(PlaybackActionMeta playbackActionMeta, String str) {
        return z(playbackActionMeta, str, null, true);
    }

    @Override // xsna.kza0
    public final int k() {
        com.vk.music.player.f fVar = this.e;
        if (fVar.m()) {
            return fVar.c.d;
        }
        return -1;
    }

    public final boolean k0(final boolean z, final boolean z2, final String str, final PlaybackActionMeta playbackActionMeta, @Nullable final String str2) {
        bn40.f("checkTimeout: ", Boolean.valueOf(z), "reason: ", str);
        boolean z3 = this.y.b() == this.y.getLast() && this.q.n0() == LoopMode.NONE;
        JSONObject jSONObject = str2 != null ? new JSONObject(str2) : null;
        String D = jSONObject != null ? f370.D(jSONObject, "action") : null;
        if (D == null) {
            D = "";
        }
        boolean equals = D.equals("dislike");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if ((i() instanceof StartPlayVkMixSource) && equals) {
            this.y.x(new z1b0(this, atomicBoolean, z, z2, str, playbackActionMeta, str2));
            return atomicBoolean.get();
        }
        if (!equals && !z3) {
            return l0(z, z2, str, playbackActionMeta, str2);
        }
        h0(new PlaybackActionMeta(28, playbackActionMeta.c), false, new gzs() { // from class: xsna.a2b0
            @Override // xsna.gzs
            public final Object invoke() {
                atomicBoolean.set(e2b0.this.l0(z, z2, str, playbackActionMeta, str2));
                return s3q0.a;
            }
        });
        return atomicBoolean.get();
    }

    @Override // xsna.kza0
    public final void l(String str, String str2) {
        bn40.f("uuid1: ", str, ", uuid2: ", str2);
        this.y.l(str, str2);
        d0();
    }

    public final boolean l0(boolean z, boolean z2, String str, PlaybackActionMeta playbackActionMeta, @Nullable String str2) {
        if (!z || SystemClock.uptimeMillis() >= this.l + 300) {
            PlayerTrack c2 = this.y.c();
            if (!T() || c2 == null || c2.b.S4()) {
                com.vk.music.player.f fVar = this.e;
                this.w = fVar.h();
                fVar.a(false);
                int i = fVar.i;
                fVar.g = new int[i];
                fVar.h = new long[i];
                if (c2 == null) {
                    c2 = i() instanceof StartPlayVkMixSource ? this.y.getLast() : this.y.getFirst();
                    bn40.f("track == null");
                }
                if (c2 != null) {
                    this.l = SystemClock.uptimeMillis();
                    this.o.f(v0(str, str2), null);
                    h();
                    g0(c2.f, true, z2, false, str, playbackActionMeta, str2);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.xza0
    public final boolean m(@Nullable String str, int i, boolean z, boolean z2) {
        bn40.f("audioFocusLost: ", Boolean.valueOf(z), "transientAudioFocusLost: ", Boolean.valueOf(z2));
        r950 r950Var = this.c;
        if (r950Var == null || !r950Var.pause(i)) {
            return false;
        }
        this.j.G(z, false);
        com.vk.music.pref.a aVar = this.q;
        aVar.B0(z);
        aVar.Q0(z2);
        aVar.u0();
        if (this.e.f() == null) {
            b0("pause");
            return true;
        }
        this.m.a(this.t);
        PauseReason pauseReason = PauseReason.USER_CLICKED;
        if (z || z2) {
            pauseReason = PauseReason.FOCUS_LOST;
        }
        this.o.f(v0("pause", str), pauseReason);
        h();
        return true;
    }

    public final void m0(com.vk.music.player.e eVar) {
        if (eVar != null) {
            this.d.add(eVar);
        }
    }

    @Override // xsna.kza0
    @NonNull
    public final MusicPlaybackLaunchContext n() {
        return this.t;
    }

    public final void n0() {
        bn40.f(new Object[0]);
        e5b0 w4 = this.H.w4();
        if (!w4.b) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            mzp0 e2 = rzp0.e(w4.a);
            if (e2 != null) {
                e2.g();
                s3q0 s3q0Var = s3q0.a;
            }
        }
        this.o.d(v0("stop", null));
        h();
        this.j.R();
        ((lo4) mo4.d.getValue()).release();
        if (com.vk.toggle.b.A.a(MusicFeatures.PLAYER_REFACTORING)) {
            this.i.c.e();
        } else {
            this.h.removeCallbacksAndMessages(null);
        }
        d6q0.g(this.O);
        this.g.c();
        r950 r950Var = this.c;
        if (r950Var != null) {
            r950Var.release(36);
        }
        bpn0 bpn0Var = this.I;
        if (bpn0Var.isInitialized()) {
            ((mzc0) bpn0Var.getValue()).release();
        }
        this.K.dispose();
        this.d.clear();
        this.y.release();
        this.e.a(false);
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.t;
        kjb0 kjb0Var = this.m;
        e2b0 e2b0Var = kjb0Var.d;
        jjb0 jjb0Var = kjb0Var.c;
        if (jjb0Var != null) {
            jjb0Var.b(musicPlaybackLaunchContext, e2b0Var.q.l(), e2b0Var.e);
        }
    }

    @Override // xsna.kza0
    public final void o() {
        com.vk.music.pref.a aVar = this.q;
        boolean z = !aVar.M();
        if (!this.y.m()) {
            aVar.d(z);
            aVar.M0(z);
            this.y.q(z, new kb40(this, 11));
            Z();
            if (com.vk.toggle.b.A.a(MusicFeatures.PLAYER_REFACTORING)) {
                Y(PlayerInvalidateMessage.SHUFFLE_MODE_CHANGED);
            } else {
                X(7);
            }
        }
        c0();
    }

    @Override // xsna.kza0
    public final int p() {
        return this.y.getSize();
    }

    @Nullable
    public final PlayerTrack p0(Boolean bool, String str) {
        PlayerTrack t = this.y.t(str);
        PlayerTrack playerTrack = this.e.c;
        boolean z = playerTrack != null && playerTrack.f.equals(str);
        if (t == null && z) {
            t = playerTrack;
        }
        if (t != null) {
            if (t.b.Tb() && bool.booleanValue()) {
                t.e = 0L;
                return t;
            }
            t.e = Math.max(this.v, t.e);
        }
        return t;
    }

    public final void q() {
        com.vk.music.player.f fVar = this.e;
        PlayerTrack playerTrack = fVar == null ? null : fVar.c;
        if (W(playerTrack) && playerTrack != null) {
            k840.a.h.b(yv40.a);
            this.o.f(v0("auto", null), null);
            h();
            g0(playerTrack.f, false, true, true, "auto", new PlaybackActionMeta(30, SystemClock.elapsedRealtime()), null);
            return;
        }
        PlayerTrack c2 = this.y.c();
        boolean z = z(new PlaybackActionMeta(28, SystemClock.elapsedRealtime()), "auto", null, c2 != null);
        if (c2 != null) {
            k840.a.h.b(yv40.a);
        }
        if (z) {
            return;
        }
        PlayerTrack first = this.y.getFirst();
        if (first != null) {
            g0(first.f, false, false, false, "auto", new PlaybackActionMeta(28, SystemClock.elapsedRealtime()), null);
        }
        bn40.f("ended songs");
    }

    public final boolean q0(PlaybackActionMeta playbackActionMeta, @Nullable String str) {
        PlayerTrack b2 = this.y.b();
        if (b2 == null) {
            return j(0, playbackActionMeta);
        }
        g0(b2.f, true, true, true, "prev", playbackActionMeta, str);
        return true;
    }

    public final void r0(jg8 jg8Var) {
        this.g = new fy10(this.b, new dy10(this, jg8Var), this, this.r.a);
        CoreFeatures coreFeatures = CoreFeatures.KBH_DETECT;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            d6q0.c(this.O);
        }
    }

    @Override // xsna.kza0
    public final void s(float f2, boolean z) {
        bn40.f("playback: ", Float.valueOf(f2));
        if (z) {
            this.q.J0(f2);
        }
        r950 r950Var = this.c;
        if (r950Var != null) {
            r950Var.c.q(f2);
        }
        Z();
        if (com.vk.toggle.b.A.a(MusicFeatures.PLAYER_REFACTORING)) {
            Y(PlayerInvalidateMessage.PLAYBACK_SPEED_CHANGED);
        } else {
            X(8);
        }
    }

    @Deprecated
    public final void s0(PlayerTrack playerTrack, boolean z, String str) {
        com.vk.music.player.f fVar = this.e;
        PlayerTrack playerTrack2 = fVar.c;
        boolean z2 = playerTrack2 != null && TextUtils.equals(playerTrack2.f, playerTrack.f);
        this.y.j(playerTrack);
        fVar.a(z2 && !z);
        fVar.q(playerTrack);
        fVar.a = str;
        fVar.e[0] = playerTrack.b.c0;
        com.vk.music.player.a aVar = this.L;
        if (aVar != null) {
            PlayerTrack c2 = aVar.a.c();
            if (!epx.f(aVar.g, c2)) {
                aVar.g = c2;
            }
        }
        c0();
    }

    @Override // xsna.xza0
    public final void setVolume(float f2) {
        r950 r950Var = this.c;
        if (r950Var != null) {
            r950Var.s(f2);
        }
        if (com.vk.toggle.b.A.a(MusicFeatures.PLAYER_REFACTORING)) {
            Y(PlayerInvalidateMessage.VOLUME_CHANGED);
        } else {
            X(10);
        }
    }

    @Override // xsna.xza0
    public final void stop(int i) {
        B(i, null, false);
    }

    @Override // xsna.kza0
    public final void t(MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        if (musicPlaybackLaunchContext == null) {
            musicPlaybackLaunchContext = MusicPlaybackLaunchContext.d;
        }
        this.t = musicPlaybackLaunchContext;
    }

    public final void t0(boolean z) {
        PlayerTrack playerTrack;
        if (!z && (playerTrack = this.e.c) != null) {
            this.y.j(playerTrack);
        }
        this.n.e = z;
    }

    @Override // xsna.kza0
    public final void u(PlaybackActionMeta playbackActionMeta, @Nullable String str) {
        bn40.f(new Object[0]);
        com.vk.music.player.f fVar = this.e;
        int h = fVar.h();
        if (fVar.e() - h >= 15000) {
            j(h + 15000, playbackActionMeta);
            if (o0(this.u) == PlayState.PAUSED) {
                M(false, playbackActionMeta, str);
            }
        } else if (this.y.n().size() > 1) {
            j0(playbackActionMeta, "none");
        } else {
            q0(playbackActionMeta, str);
            if (o0(this.u) == PlayState.PAUSED) {
                M(false, playbackActionMeta, str);
            }
        }
        this.g.d(o0(this.u), fVar, k(), this.y.getSize());
    }

    @Override // xsna.kza0
    public final boolean v(PlaybackActionMeta playbackActionMeta, @Nullable String str) {
        boolean z;
        bn40.f(new Object[0]);
        com.vk.music.player.f fVar = this.e;
        int h = fVar.h();
        if (h > 5000 || this.y.u() == null) {
            boolean j = j(Math.max(0, h - 15000), playbackActionMeta);
            if (j && o0(this.u) == PlayState.PAUSED) {
                M(false, playbackActionMeta, str);
            }
            z = j;
        } else {
            z = y(false, playbackActionMeta, str);
        }
        this.g.d(o0(this.u), fVar, k(), this.y.getSize());
        return z;
    }

    @NonNull
    public final vy40.a v0(@Nullable String str, @Nullable String str2) {
        MusicTrack f2;
        AudioBookChapter audioBookChapter;
        if (str == null) {
            str = "none";
        }
        int i = this.w;
        com.vk.music.player.f fVar = this.e;
        if (i < 0) {
            i = fVar.h();
        }
        this.w = -1;
        r950 r950Var = this.c;
        String uuid = r950Var != null ? r950Var.l : UUID.randomUUID().toString();
        vy40.a aVar = this.p;
        aVar.a = uuid;
        aVar.f = i;
        aVar.b = fVar.f();
        aVar.g = fVar.e();
        aVar.j = str;
        aVar.k = str2;
        com.vk.music.pref.a aVar2 = this.q;
        aVar.d = aVar2.n0();
        aVar.e = aVar2.M();
        aVar.i = o0(this.u);
        aVar.l = this.t;
        com.vk.core.utils.newtork.b.a.getClass();
        aVar.m = com.vk.core.utils.newtork.b.d();
        aVar.n = getVolume();
        aVar.o = aVar2.l();
        if (fVar.f() != null && (audioBookChapter = (f2 = fVar.f()).O) != null) {
            aVar.p = audioBookChapter.b;
            Integer num = f2.d0;
            if (num != null) {
                aVar.c = num.intValue();
            }
        }
        boolean z = false;
        aVar.q = r950Var != null && r950Var.c.k;
        if (r950Var != null && r950Var.z() && r950Var.g()) {
            z = true;
        }
        aVar.r = z;
        x6b0 x6b0Var = r950Var.c.j;
        aVar.s = x6b0Var.a;
        aVar.t = x6b0Var.b;
        return aVar;
    }

    @Override // xsna.kza0
    public final void w(@Nullable StartPlaySource startPlaySource, ArrayList arrayList, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z) {
        if (z) {
            this.y.B(startPlaySource, arrayList, musicPlaybackLaunchContext);
        } else {
            this.y.v(startPlaySource, arrayList, musicPlaybackLaunchContext);
        }
        if (ad0.y(arrayList)) {
            k840.a.h.b(new bb50(musicPlaybackLaunchContext.Kb()));
        }
        d0();
    }

    public final void w0() {
        bpn0 bpn0Var = this.I;
        if (bpn0Var.isInitialized() && this.c.getBufferedPercentage() == 100 && V()) {
            ((mzc0) bpn0Var.getValue()).d(this.y.b(), this.y.s(this.J.b()));
        }
    }

    @Override // xsna.kza0
    public final void x(int i, boolean z) {
        B(i, null, z);
    }

    @Override // xsna.kza0
    public final boolean y(boolean z, PlaybackActionMeta playbackActionMeta, @Nullable String str) {
        bn40.f(new Object[0]);
        if (SystemClock.uptimeMillis() >= this.l + 300) {
            com.vk.music.player.f fVar = this.e;
            if (!z || !fVar.m() || fVar.h() <= 5000 || !q0(playbackActionMeta, str)) {
                PlayerTrack u = this.y.u();
                if (!T() || u == null || u.b.S4()) {
                    if (this.y.getSize() == 1 || ((this.q.n0() != LoopMode.LIST || (i() instanceof StartPlayVkMixSource)) && Objects.equals(this.y.getFirst(), fVar.c))) {
                        this.k = true;
                        return q0(playbackActionMeta, str);
                    }
                    if (u != null) {
                        this.l = SystemClock.uptimeMillis();
                        this.o.f(v0("prev", str), null);
                        g0(u.f, true, true, false, "prev", playbackActionMeta, str);
                        h();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // xsna.kza0
    public final boolean z(PlaybackActionMeta playbackActionMeta, String str, @Nullable String str2, boolean z) {
        bn40.f("reason: ", str);
        r950 r950Var = this.c;
        return (r950Var == null || !r950Var.d.j()) && k0(true, z, str, playbackActionMeta, str2);
    }

    /* compiled from: PlayerImpl.java */
    public class f implements px40 {
        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.px40
        public final void D(@NonNull v0q<?> v0qVar) {
            if (v0qVar.a().a.e) {
                return;
            }
            e2b0 e2b0Var = e2b0.this;
            ca50 ca50Var = e2b0Var.s;
            kw40 a = v0qVar.a();
            p4b0 p4b0Var = ((ry40) v0qVar).c;
            UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
            ak40 ak40Var = uiTrackingScreen == null ? new ak40(MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE, new ArrayList(), null) : new ak40(uiTrackingScreen.a, j5g.O0(uiTrackingScreen.e), uiTrackingScreen.f);
            float volume = e2b0Var.getVolume();
            com.vk.music.pref.a aVar = e2b0Var.q;
            r950 r950Var = e2b0Var.c;
            a3b0 a3b0Var = new a3b0(aVar.l(), aVar.M(), aVar.n0());
            boolean z = r950Var.c.k;
            boolean g = r950Var.g();
            x6b0 x6b0Var = r950Var.c.j;
            ca50Var.c(new iwa0(a, p4b0Var, ak40Var, "", volume, true, a3b0Var, z, g, new AudioStream(x6b0Var.a, x6b0Var.b, null)));
        }

        @Override // xsna.px40
        public final void F(@NonNull cz40 cz40Var) {
            if (e2b0.V()) {
                e2b0 e2b0Var = e2b0.this;
                ((mzc0) e2b0Var.I.getValue()).d(e2b0Var.y.b(), e2b0Var.y.s(e2b0Var.J.b()));
            }
        }

        @Override // xsna.px40
        public final void G() {
            e2b0 e2b0Var = e2b0.this;
            PlayerTrack c = e2b0Var.y.c();
            if (e2b0Var.y.getSize() == 1 || c == null) {
                e2b0Var.h0(new PlaybackActionMeta(37, SystemClock.elapsedRealtime()), true, new f540(this, 11));
            } else {
                e2b0Var.z(new PlaybackActionMeta(37, SystemClock.elapsedRealtime()), "none", null, true);
            }
        }

        /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.px40
        public final void a(@NonNull ry40 ry40Var) {
            PlayerTrack playerTrack;
            p4b0 p4b0Var = ry40Var.c;
            e2b0 e2b0Var = e2b0.this;
            ((cs4) e2b0Var.E.getValue()).a(ry40Var);
            if ((ry40Var instanceof v0q) && !p4b0Var.a && !p4b0Var.equals((p4b0) p4b0.e.getValue())) {
                MusicTrack musicTrack = p4b0Var.b.a;
                com.vk.music.player.f fVar = e2b0Var.e;
                PlayerTrack playerTrack2 = fVar.c;
                if (playerTrack2 != null && playerTrack2.b.hashCode() == musicTrack.hashCode() && (playerTrack = fVar.c) != null) {
                    e2b0Var.y.j(playerTrack);
                }
            }
            ry40 ry40Var2 = e2b0Var.u;
            e2b0Var.u = ry40Var;
            if (e2b0.u0(ry40Var)) {
                return;
            }
            if (ry40Var2.c.a == p4b0Var.a && e2b0.o0(ry40Var2) == e2b0.o0(ry40Var) && ry40Var2.c.b.a.hashCode() == p4b0Var.b.a.hashCode()) {
                return;
            }
            e2b0Var.c0();
        }

        @Override // xsna.px40
        public final void d(@NonNull cz40 cz40Var) {
            e2b0.this.e.k = !(cz40Var instanceof cz40.b) ? 1 : 0;
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.px40
        public final void i(@NonNull ly40 ly40Var) {
            bpn0 bpn0Var;
            MusicTrack musicTrack;
            pw5 pw5Var;
            long j;
            PlayerTrack playerTrack;
            MusicTrack musicTrack2;
            PlayerTrack playerTrack2;
            e2b0 e2b0Var = e2b0.this;
            bpn0 bpn0Var2 = e2b0Var.I;
            ly40.a aVar = ly40Var.c;
            long j2 = ly40Var.b;
            aVar.getClass();
            boolean equals = aVar.equals((ly40.a) ly40.a.c.getValue());
            p4b0 p4b0Var = aVar.a;
            if (!equals && !p4b0Var.a) {
                e2b0Var.h();
                MusicTrack musicTrack3 = p4b0Var.b.a;
                com.vk.music.player.f fVar = e2b0Var.e;
                PlayerTrack playerTrack3 = fVar.c;
                if (playerTrack3 != null && playerTrack3.b.hashCode() == musicTrack3.hashCode() && (playerTrack2 = fVar.c) != null) {
                    e2b0Var.y.j(playerTrack2);
                }
            }
            boolean z = ly40Var.a instanceof cz40.b;
            int i = !z ? 1 : 0;
            int i2 = (int) j2;
            String str = e2b0Var.p.j;
            com.vk.music.player.f fVar2 = e2b0Var.e;
            fVar2.p(i, i2);
            if (z) {
                com.vk.music.player.a aVar2 = e2b0Var.L;
                if (aVar2 != null && !aVar2.f && aVar2.d() && (playerTrack = aVar2.h) != null && (musicTrack2 = playerTrack.b) != null && musicTrack2.f - (i2 / 1000) <= 20) {
                    aVar2.c(null);
                }
                MusicTrack f = fVar2.f();
                if (f != null) {
                    long j3 = i2;
                    e2b0Var.o.c(j3, e2b0Var.v0(null, null));
                    kjb0 kjb0Var = e2b0Var.m;
                    MusicPlaybackLaunchContext musicPlaybackLaunchContext = e2b0Var.t;
                    e2b0 e2b0Var2 = kjb0Var.d;
                    com.vk.music.pref.a aVar3 = e2b0Var2.q;
                    jjb0 jjb0Var = kjb0Var.c;
                    if (jjb0Var != null) {
                        float l = aVar3.l();
                        com.vk.music.player.f fVar3 = e2b0Var2.e;
                        if (!jjb0Var.d) {
                            jjb0Var.a(musicPlaybackLaunchContext, l, fVar3, str.equals("auto"));
                            jjb0Var.d = true;
                        }
                    }
                    if (kjb0Var.b) {
                        kjb0Var.b = false;
                        kjb0Var.a = j3;
                    }
                    long j4 = kjb0Var.a;
                    if (j3 > j4) {
                        long j5 = j3 - j4;
                        if (j5 < 2000) {
                            jjb0 jjb0Var2 = kjb0Var.c;
                            if (jjb0Var2 != null) {
                                float l2 = aVar3.l();
                                HashSet<Integer> hashSet = jjb0Var2.c;
                                musicTrack = f;
                                jjb0Var2.e += (long) (j5 * l2);
                                long j6 = 1000;
                                long j7 = j4 / j6;
                                long j8 = j3 / j6;
                                Iterator it = jjb0Var2.b.iterator();
                                while (it.hasNext()) {
                                    jjb0.b bVar = (jjb0.b) it.next();
                                    jjb0 jjb0Var3 = jjb0Var2;
                                    MusicPlaybackLaunchContext musicPlaybackLaunchContext2 = musicPlaybackLaunchContext;
                                    long j9 = bVar.a;
                                    bpn0 bpn0Var3 = bpn0Var2;
                                    int i3 = bVar.c;
                                    if (j7 <= j9 && bVar.b <= j8) {
                                        hashSet.add(Integer.valueOf(i3));
                                        it.remove();
                                    } else if (j9 <= j7 && j8 <= bVar.b) {
                                        bVar.a = j8;
                                    } else if (j7 <= j9 && j9 <= j8 && j8 <= bVar.b) {
                                        bVar.b = j8;
                                    } else if (j9 <= j7) {
                                        long j10 = bVar.b;
                                        if (j7 <= j10 && j10 <= j8) {
                                            bVar.a = j7;
                                        }
                                    }
                                    long j11 = j8;
                                    if (bVar.a == bVar.b) {
                                        hashSet.add(Integer.valueOf(i3));
                                        it.remove();
                                    }
                                    musicPlaybackLaunchContext = musicPlaybackLaunchContext2;
                                    jjb0Var2 = jjb0Var3;
                                    bpn0Var2 = bpn0Var3;
                                    j8 = j11;
                                }
                                bpn0Var = bpn0Var2;
                                jjb0Var2.c("podcast_play", false, musicPlaybackLaunchContext, l2, dt.b("action", "heartbeat"));
                            } else {
                                musicTrack = f;
                                bpn0Var = bpn0Var2;
                            }
                            kjb0Var.a = j3;
                            pw5Var = e2b0Var.n;
                            j = pw5Var.b;
                            if (j3 > j && j3 - j < 2000 && !pw5Var.e && x93.b && !musicTrack.Vb()) {
                                pw5Var.d = (j3 - pw5Var.b) + pw5Var.d;
                            }
                            pw5Var.b = j3;
                        }
                    }
                    musicTrack = f;
                    bpn0Var = bpn0Var2;
                    pw5Var = e2b0Var.n;
                    j = pw5Var.b;
                    if (j3 > j) {
                        pw5Var.d = (j3 - pw5Var.b) + pw5Var.d;
                    }
                    pw5Var.b = j3;
                } else {
                    bpn0Var = bpn0Var2;
                    e2b0Var.b0("onProgress");
                }
            } else {
                bpn0Var = bpn0Var2;
            }
            e2b0Var.a0();
            e2b0Var.s.b();
            if (bpn0Var.isInitialized()) {
                ((mzc0) bpn0Var.getValue()).e(e2b0Var.y.b(), j2);
            }
        }

        @Override // xsna.px40
        public final void l(@NonNull cz40 cz40Var) {
            e2b0 e2b0Var = e2b0.this;
            e2b0Var.h();
            boolean z = !(cz40Var instanceof cz40.b);
            r950 r950Var = e2b0Var.c;
            if (!z) {
                if (r950Var.c.k) {
                    com.vk.music.player.f fVar = e2b0Var.e;
                    PlayerTrack playerTrack = fVar == null ? null : fVar.c;
                    PlayerTrack c = e2b0Var.y.c();
                    if (e2b0Var.W(playerTrack) && playerTrack != null) {
                        k840.a.h.b(yv40.a);
                    } else if (c != null) {
                        k840.a.h.b(yv40.a);
                    }
                    r950Var.c.o(false);
                } else {
                    e2b0Var.h0(new PlaybackActionMeta(28, SystemClock.elapsedRealtime()), false, new ufk(e2b0Var, 27));
                }
            }
            ((cs4) e2b0Var.E.getValue()).b(e2b0Var.u);
        }

        @Override // xsna.px40
        public final void n(@NonNull cz40 cz40Var, int i, long j) {
            int i2 = !(cz40Var instanceof cz40.b) ? 1 : 0;
            e2b0 e2b0Var = e2b0.this;
            com.vk.music.player.f fVar = e2b0Var.e;
            fVar.g[i2] = i;
            fVar.h[i2] = 0;
            if (com.vk.toggle.b.A.a(MusicFeatures.PLAYER_REFACTORING)) {
                e2b0Var.Y(PlayerInvalidateMessage.BUFFERING);
            } else {
                e2b0Var.X(4);
            }
            if (i == 100 && e2b0.V()) {
                ((mzc0) e2b0Var.I.getValue()).d(e2b0Var.y.b(), e2b0Var.y.s(e2b0Var.J.b()));
            }
        }

        @Override // xsna.px40
        public final void q(@NonNull ky40 ky40Var) {
            boolean z = ky40Var.a instanceof cz40.b;
            int i = !z ? 1 : 0;
            int i2 = (int) ky40Var.b;
            e2b0 e2b0Var = e2b0.this;
            com.vk.music.player.f fVar = e2b0Var.e;
            if (z) {
                e2b0Var.y.p(new h630(e2b0Var, 18));
                MusicTrack f = fVar.f();
                if (f != null) {
                    pw5 pw5Var = e2b0Var.n;
                    pw5Var.d = 0L;
                    pw5Var.c = i2;
                    vy40 vy40Var = e2b0Var.o;
                    vy40Var.h = 0L;
                    vy40Var.i = 0L;
                    kjb0 kjb0Var = e2b0Var.m;
                    MusicPlaybackLaunchContext musicPlaybackLaunchContext = e2b0Var.t;
                    e2b0 e2b0Var2 = kjb0Var.d;
                    jjb0 jjb0Var = kjb0Var.c;
                    if (jjb0Var != null) {
                        jjb0Var.b(musicPlaybackLaunchContext, e2b0Var2.q.l(), e2b0Var2.e);
                    }
                    if (f.Vb()) {
                        kjb0Var.c = new jjb0(f);
                    } else {
                        kjb0Var.c = null;
                    }
                    kjb0Var.a = 0L;
                } else {
                    e2b0Var.b0("onPrepared");
                }
                if (fVar.h() > 0) {
                    e2b0Var.j(fVar.h(), new PlaybackActionMeta(26, SystemClock.elapsedRealtime()));
                }
            }
            fVar.e[i] = i2;
            e2b0Var.a0();
            if (com.vk.toggle.b.A.a(MusicFeatures.PLAYER_REFACTORING)) {
                e2b0Var.Y(PlayerInvalidateMessage.BUFFERING);
            } else {
                e2b0Var.X(4);
            }
        }

        @Override // xsna.px40
        public final void v(@NonNull cz40 cz40Var, @Nullable VkPlayerException vkPlayerException) {
            e2b0.this.G(!(cz40Var instanceof cz40.b) ? 1 : 0, vkPlayerException);
        }

        @Override // xsna.px40
        public final void onStop() {
        }

        @Override // xsna.px40
        public final void B(@NonNull ky40 ky40Var) {
        }
    }
}
