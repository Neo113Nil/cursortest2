package ru.ok.android.externcalls.sdk.watch_together;

import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.webrtc.participant.movie.MovieId;
import ru.ok.android.webrtc.participant.movie.MoviePresetMeta;
import ru.ok.android.webrtc.participant.movie.MovieVolume;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: WatchTogetherPlayer.kt */
/* loaded from: classes9.dex */
public interface WatchTogetherPlayer {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void pause$default(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        if ((i & 2) != 0) {
            gzsVar = null;
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        watchTogetherPlayer.pause(movieId, gzsVar, izsVar);
    }

    /* renamed from: play-yj_a6ag$default, reason: not valid java name */
    static /* synthetic */ void m350playyj_a6ag$default(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId, float f, MoviePresetMeta moviePresetMeta, boolean z, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play-yj_a6ag");
        }
        if ((i & 2) != 0) {
            f = MovieVolume.Companion.m375getFULL_pGdNCs();
        }
        float f2 = f;
        MoviePresetMeta moviePresetMeta2 = (i & 4) != 0 ? null : moviePresetMeta;
        if ((i & 8) != 0) {
            z = false;
        }
        watchTogetherPlayer.mo352playyj_a6ag(movieId, f2, moviePresetMeta2, z, (i & 16) != 0 ? null : gzsVar, (i & 32) != 0 ? null : izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void resume$default(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resume");
        }
        if ((i & 2) != 0) {
            gzsVar = null;
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        watchTogetherPlayer.resume(movieId, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void setMuted$default(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId, boolean z, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMuted");
        }
        if ((i & 4) != 0) {
            gzsVar = null;
        }
        if ((i & 8) != 0) {
            izsVar = null;
        }
        watchTogetherPlayer.setMuted(movieId, z, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void setPosition$default(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId, long j, TimeUnit timeUnit, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPosition");
        }
        if ((i & 8) != 0) {
            gzsVar = null;
        }
        if ((i & 16) != 0) {
            izsVar = null;
        }
        watchTogetherPlayer.setPosition(movieId, j, timeUnit, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setVolume-F2PwOSs$default, reason: not valid java name */
    static /* synthetic */ void m351setVolumeF2PwOSs$default(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId, float f, boolean z, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setVolume-F2PwOSs");
        }
        if ((i & 8) != 0) {
            gzsVar = null;
        }
        if ((i & 16) != 0) {
            izsVar = null;
        }
        watchTogetherPlayer.mo353setVolumeF2PwOSs(movieId, f, z, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void stop$default(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
        }
        if ((i & 2) != 0) {
            gzsVar = null;
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        watchTogetherPlayer.stop(movieId, gzsVar, izsVar);
    }

    void addListener(WatchTogetherListener watchTogetherListener);

    MovieStates getMovieStates();

    void pause(MovieId movieId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    /* renamed from: play-yj_a6ag, reason: not valid java name */
    void mo352playyj_a6ag(MovieId movieId, float f, MoviePresetMeta moviePresetMeta, boolean z, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void removeListener(WatchTogetherListener watchTogetherListener);

    void resume(MovieId movieId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void setMuted(MovieId movieId, boolean z, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void setPosition(MovieId movieId, long j, TimeUnit timeUnit, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    /* renamed from: setVolume-F2PwOSs, reason: not valid java name */
    void mo353setVolumeF2PwOSs(MovieId movieId, float f, boolean z, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void stop(MovieId movieId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);
}
