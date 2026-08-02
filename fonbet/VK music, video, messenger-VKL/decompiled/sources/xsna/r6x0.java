package xsna;

import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vk.voip.ui.watchmovie.player.VoipWatchMoviePlayerControlView;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherError;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.exceptions.WatchTogetherException;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieState;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStoppedData;
import ru.ok.android.webrtc.features.CallFeature;
import ru.ok.android.webrtc.participant.movie.Movie;
import ru.ok.android.webrtc.participant.movie.MovieId;
import ru.ok.android.webrtc.participant.movie.MoviePosition;
import ru.ok.android.webrtc.participant.movie.MoviePresetMeta;
import ru.ok.android.webrtc.participant.movie.MovieThumbnail;
import ru.ok.android.webrtc.participant.movie.MovieVolume;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.icx0;
import xsna.it80;

/* compiled from: VoipWatchMoviePlayerController.kt */
/* loaded from: classes7.dex */
public final class r6x0 implements icx0, ncx0 {
    public final com.vk.voip.b b;
    public final vqe0 c;
    public final ubx0 d;
    public final AccessibilityEvents e;
    public zsw0 g;
    public final io.reactivex.rxjava3.subjects.d<it80<p3x0>> i;
    public final LinkedHashMap j;
    public SessionRoomId k;
    public final io.reactivex.rxjava3.subjects.f<WatchTogetherError> l;
    public final EmptyDisposable m;
    public CallMemberId n;
    public p3x0 o;
    public final ConcurrentHashMap<icx0.a, Boolean> f = new ConcurrentHashMap<>();
    public final Handler h = new Handler(Looper.getMainLooper());

    /* compiled from: VoipWatchMoviePlayerController.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ p3x0 c;
        public final /* synthetic */ CallId d;
        public final /* synthetic */ String e;

        public a(p3x0 p3x0Var, CallId callId, String str) {
            this.c = p3x0Var;
            this.d = callId;
            this.e = str;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            r6x0 r6x0Var = r6x0.this;
            p3x0 p3x0Var = this.c;
            r6x0Var.s(p3x0Var);
            r6x0Var.n = r6x0Var.b.a();
            r6x0Var.d.f(p3x0Var.b, p3x0Var.e);
            L.e("watch movie started success call=" + this.d + ", v=" + this.e);
            return s3q0.a;
        }
    }

    /* compiled from: VoipWatchMoviePlayerController.kt */
    public static final class b implements izs<Throwable, s3q0> {
        public b() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            if (th2 instanceof WatchTogetherException) {
                r6x0.this.l.onNext(((WatchTogetherException) th2).getReason());
            }
            return s3q0.a;
        }
    }

    /* compiled from: Handler.kt */
    public static final class c implements Runnable {
        public final /* synthetic */ WatchTogetherPlayer b;
        public final /* synthetic */ r6x0 c;
        public final /* synthetic */ p3x0 d;
        public final /* synthetic */ float e;
        public final /* synthetic */ CallId f;
        public final /* synthetic */ String g;

        public c(WatchTogetherPlayer watchTogetherPlayer, r6x0 r6x0Var, p3x0 p3x0Var, float f, CallId callId, String str) {
            this.b = watchTogetherPlayer;
            this.c = r6x0Var;
            this.d = p3x0Var;
            this.e = f;
            this.f = callId;
            this.g = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            p3x0 p3x0Var = this.d;
            MovieId movieId = new MovieId(p3x0Var.a);
            float m365constructorimpl = MovieVolume.m365constructorimpl(this.e);
            String str = p3x0Var.c;
            List<Image> list = p3x0Var.h;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (Image image : list) {
                arrayList.add(new MovieThumbnail.Quality(image.d, image.b, image.c));
            }
            MoviePresetMeta moviePresetMeta = new MoviePresetMeta(str, arrayList);
            CallId callId = this.f;
            String str2 = this.g;
            r6x0 r6x0Var = this.c;
            this.b.mo352playyj_a6ag(movieId, m365constructorimpl, moviePresetMeta, false, r6x0Var.new a(p3x0Var, callId, str2), r6x0Var.new b());
        }
    }

    public r6x0(com.vk.voip.b bVar, vqe0 vqe0Var, ubx0 ubx0Var, AccessibilityEvents accessibilityEvents) {
        this.b = bVar;
        this.c = vqe0Var;
        this.d = ubx0Var;
        this.e = accessibilityEvents;
        it80.b.getClass();
        this.i = io.reactivex.rxjava3.subjects.d.O0(it80.a.a());
        this.j = new LinkedHashMap();
        this.k = SessionRoomId.MainCall.INSTANCE;
        this.l = new io.reactivex.rxjava3.subjects.f<>();
        this.m = EmptyDisposable.INSTANCE;
        com.vk.voip.ui.c.b.getClass();
        com.vk.voip.ui.sessionrooms.d dVar = com.vk.voip.ui.c.B0;
        dVar.getClass();
        io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.y(dVar.b().U(new hi70(new wvw0(1), 18)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), null, new xd8(L.a, 13), new wd8(1, this, r6x0.class, "onActiveRoomChanged", "onActiveRoomChanged(Lru/ok/android/webrtc/sessionroom/SessionRoomId;)V", 0, 15));
    }

    @Override // xsna.icx0
    public final io.reactivex.rxjava3.subjects.f a() {
        return this.l;
    }

    @Override // xsna.icx0
    public final p3x0 b() {
        return this.o;
    }

    @Override // xsna.icx0
    public final void c(icx0.a aVar, boolean z) {
        if (z) {
            return;
        }
        this.f.put(aVar, Boolean.TRUE);
    }

    @Override // xsna.icx0
    public final io.reactivex.rxjava3.internal.operators.observable.q d() {
        return new io.reactivex.rxjava3.internal.operators.observable.q(new a4x0());
    }

    @Override // xsna.icx0
    public final void e(VoipWatchMoviePlayerControlView voipWatchMoviePlayerControlView) {
        this.f.remove(voipWatchMoviePlayerControlView);
    }

    @Override // xsna.icx0
    public final io.reactivex.rxjava3.internal.operators.observable.q f(final boolean z) {
        return new io.reactivex.rxjava3.internal.operators.observable.q(new io.reactivex.rxjava3.core.s() { // from class: xsna.m6x0
            @Override // io.reactivex.rxjava3.core.s
            public final void subscribe(io.reactivex.rxjava3.core.r rVar) {
                q6x0 q6x0Var = new q6x0(rVar);
                r6x0 r6x0Var = r6x0.this;
                ulp h = r6x0Var.b.h();
                rVar.a(new ukt0(1, h, q6x0Var));
                if (!epx.f(r6x0Var.p(), FeatureRoles.Companion.createDisabledForAll()) || z) {
                    rVar.onNext(r6x0Var.p());
                }
                h.e(CallFeature.MOVIE_SHARE, q6x0Var);
            }
        });
    }

    @Override // xsna.icx0
    public final void g() {
        WatchTogetherPlayer watchTogetherPlayer = this.b.getWatchTogetherPlayer();
        zsw0 zsw0Var = this.g;
        if (watchTogetherPlayer == null || zsw0Var == null) {
            return;
        }
        MovieId movieId = new MovieId(zsw0Var.a);
        if (zsw0Var.b) {
            WatchTogetherPlayer.pause$default(watchTogetherPlayer, movieId, null, null, 6, null);
        } else {
            WatchTogetherPlayer.resume$default(watchTogetherPlayer, movieId, null, null, 6, null);
        }
    }

    @Override // xsna.icx0
    public final void h(VoipWatchMoviePlayerControlView voipWatchMoviePlayerControlView) {
        this.f.put(voipWatchMoviePlayerControlView, Boolean.FALSE);
    }

    @Override // xsna.icx0
    public final void i() {
        WatchTogetherPlayer watchTogetherPlayer = this.b.getWatchTogetherPlayer();
        zsw0 zsw0Var = this.g;
        if (watchTogetherPlayer == null || zsw0Var == null) {
            return;
        }
        MovieId movieId = new MovieId(zsw0Var.a);
        if (zsw0Var.b) {
            WatchTogetherPlayer.pause$default(watchTogetherPlayer, movieId, null, null, 6, null);
        }
    }

    @Override // xsna.icx0
    public final void j() {
        WatchTogetherPlayer watchTogetherPlayer = this.b.getWatchTogetherPlayer();
        p3x0 p3x0Var = this.o;
        if (watchTogetherPlayer == null || p3x0Var == null) {
            return;
        }
        UserId userId = p3x0Var.e;
        this.d.a(p3x0Var.b, userId);
        WatchTogetherPlayer.stop$default(watchTogetherPlayer, new MovieId(p3x0Var.a), null, null, 6, null);
        s(null);
        this.n = null;
        this.g = null;
    }

    @Override // xsna.icx0
    public final void k(long j) {
        WatchTogetherPlayer watchTogetherPlayer = this.b.getWatchTogetherPlayer();
        p3x0 p3x0Var = this.o;
        if (watchTogetherPlayer == null || p3x0Var == null) {
            return;
        }
        WatchTogetherPlayer.setPosition$default(watchTogetherPlayer, new MovieId(p3x0Var.a), j, TimeUnit.SECONDS, null, null, 24, null);
    }

    @Override // xsna.icx0
    public final void l(p3x0 p3x0Var) {
        com.vk.voip.b bVar = this.b;
        WatchTogetherPlayer watchTogetherPlayer = bVar.getWatchTogetherPlayer();
        if (watchTogetherPlayer != null) {
            p3x0 p3x0Var2 = this.o;
            zsw0 zsw0Var = this.g;
            float f = (zsw0Var != null ? zsw0Var.c : 50.0f) / 100;
            if (p3x0Var2 != null && n()) {
                this.d.a(p3x0Var2.b, p3x0Var2.e);
                WatchTogetherPlayer.stop$default(watchTogetherPlayer, new MovieId(p3x0Var2.a), null, null, 6, null);
                s(null);
                this.n = null;
                this.g = null;
                s(p3x0Var);
                this.n = bVar.a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(p3x0Var.e);
            sb.append('_');
            sb.append(p3x0Var.b);
            String sb2 = sb.toString();
            CallId b2 = bVar.b();
            L.e("try to start watch movie call=" + b2 + ", v=" + sb2);
            this.h.postDelayed(new c(watchTogetherPlayer, this, p3x0Var, f, b2, sb2), 500L);
        }
    }

    @Override // xsna.icx0
    public final CallMemberId m() {
        return this.n;
    }

    @Override // xsna.icx0
    public final void mute(boolean z) {
        WatchTogetherPlayer watchTogetherPlayer = this.b.getWatchTogetherPlayer();
        p3x0 p3x0Var = this.o;
        if (watchTogetherPlayer == null || p3x0Var == null) {
            return;
        }
        WatchTogetherPlayer.setMuted$default(watchTogetherPlayer, new MovieId(p3x0Var.a), z, null, null, 12, null);
    }

    @Override // xsna.icx0
    public final boolean n() {
        return o() || this.b.isMeCreatorOrAdmin();
    }

    public final boolean o() {
        CallMemberId callMemberId = this.n;
        String str = callMemberId != null ? callMemberId.b : null;
        CallMemberId a2 = this.b.a();
        return epx.f(str, a2 != null ? a2.b : null);
    }

    @Override // xsna.ncx0
    public final void onVideoStarted(MovieStartedData movieStartedData) {
        this.j.put(movieStartedData.getMovie().getMovieId(), movieStartedData);
        if (epx.f(movieStartedData.getRoomId(), this.k)) {
            q(movieStartedData);
            r(mnh0.E(movieStartedData.getParticipant()), true);
            return;
        }
        L.e("watch movie started not in room " + movieStartedData.getRoomId() + ", my room is " + this.k + ". ignore");
    }

    @Override // xsna.ncx0
    public final void onVideoStatesChanged(MovieStates movieStates) {
        long j;
        p3x0 b2;
        p3x0 p3x0Var = this.o;
        if (p3x0Var != null) {
            Map<MovieId, MovieState> states = movieStates.getStates();
            if (states.values().isEmpty()) {
                return;
            }
            Set<Map.Entry<MovieId, MovieState>> entrySet = states.entrySet();
            int e = on00.e(c5g.u(entrySet, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                long id = ((MovieId) entry.getKey()).getId();
                hl80 hl80Var = new hl80(id);
                MovieState movieState = (MovieState) entry.getValue();
                boolean isPlaying = movieState.isPlaying();
                float m360getVolume_pGdNCs = !movieState.isMuted() ? movieState.m360getVolume_pGdNCs() * 100 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                MoviePosition position = movieState.getPosition();
                if (position instanceof MoviePosition.Defined) {
                    MoviePosition.Defined defined = (MoviePosition.Defined) position;
                    j = defined.getTimeUnit().toSeconds(defined.getPosition());
                } else {
                    j = -1;
                }
                if (id == p3x0Var.a) {
                    b2 = p3x0Var;
                } else {
                    Movie movie = movieState.getMovie();
                    b2 = movie != null ? t3r0.b(movie) : null;
                }
                Pair pair = new Pair(hl80Var, new zsw0(id, isPlaying, m360getVolume_pGdNCs, j, b2));
                linkedHashMap.put(pair.i(), pair.j());
            }
            this.g = (zsw0) j5g.X(linkedHashMap.values());
            ConcurrentHashMap<icx0.a, Boolean> concurrentHashMap = this.f;
            for (Map.Entry<icx0.a, Boolean> entry2 : concurrentHashMap.entrySet()) {
                if (entry2.getValue().booleanValue()) {
                    concurrentHashMap.put(entry2.getKey(), Boolean.FALSE);
                } else {
                    entry2.getKey().a3(linkedHashMap);
                }
            }
        }
    }

    @Override // xsna.ncx0
    public final void onVideoStopped(MovieStoppedData movieStoppedData) {
        p3x0 p3x0Var = this.o;
        if (p3x0Var != null && p3x0Var.a == movieStoppedData.getMovieId().getId()) {
            s(null);
            this.n = null;
            this.g = null;
        }
        this.j.remove(movieStoppedData.getMovieId());
        r(mnh0.E(movieStoppedData.getParticipant()), false);
    }

    public final FeatureRoles p() {
        FeatureRoles featureRoles;
        ConversationFeatureManager g = this.b.g();
        return (g == null || (featureRoles = g.getFeatureRoles(CallFeature.MOVIE_SHARE)) == null) ? FeatureRoles.Companion.createDisabledForAll() : featureRoles;
    }

    public final void q(MovieStartedData movieStartedData) {
        p3x0 p3x0Var = this.o;
        if (p3x0Var == null || p3x0Var.a != movieStartedData.getMovie().getMovieId().getId()) {
            p3x0 b2 = t3r0.b(movieStartedData.getMovie());
            int i = b2.b;
            UserId userId = b2.e;
            this.d.f(i, userId);
            L.e("watch movie started call=" + this.b.b() + ", v=" + userId + '_' + i);
            s(b2);
            this.n = mnh0.E(movieStartedData.getParticipant());
        }
    }

    public final void r(CallMemberId callMemberId, boolean z) {
        AccessibilityEvents accessibilityEvents = this.e;
        if (z) {
            List singletonList = Collections.singletonList(callMemberId);
            accessibilityEvents.getClass();
            accessibilityEvents.d(new com.vk.movika.sdk.base.ui.r0(1, accessibilityEvents, singletonList));
        } else {
            List singletonList2 = Collections.singletonList(callMemberId);
            accessibilityEvents.getClass();
            accessibilityEvents.d(new mk(0, accessibilityEvents, singletonList2));
        }
    }

    public final void s(p3x0 p3x0Var) {
        it80.b.getClass();
        this.i.onNext(new it80<>(p3x0Var));
        this.o = p3x0Var;
    }

    @Override // xsna.icx0
    public final void setVolume(float f) {
        WatchTogetherPlayer watchTogetherPlayer = this.b.getWatchTogetherPlayer();
        p3x0 p3x0Var = this.o;
        if (watchTogetherPlayer == null || p3x0Var == null) {
            return;
        }
        WatchTogetherPlayer.m351setVolumeF2PwOSs$default(watchTogetherPlayer, new MovieId(p3x0Var.a), MovieVolume.m365constructorimpl(f), false, null, null, 24, null);
    }
}
