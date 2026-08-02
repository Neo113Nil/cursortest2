package ru.ok.android.externcalls.sdk.watch_together;

import io.reactivex.rxjava3.core.a;
import io.reactivex.rxjava3.core.b;
import io.reactivex.rxjava3.core.d;
import io.reactivex.rxjava3.internal.operators.completable.e;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayerAdapterKt;
import ru.ok.android.webrtc.participant.movie.MovieId;
import ru.ok.android.webrtc.participant.movie.MovieVolume;
import xsna.g8n;
import xsna.nui;
import xsna.za6;

/* compiled from: WatchTogetherPlayerAdapter.kt */
/* loaded from: classes9.dex */
public final class WatchTogetherPlayerAdapterKt {
    public static final a pauseCompletable(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId) {
        return new e(new za6(watchTogetherPlayer, movieId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pauseCompletable$lambda$0(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId, b bVar) {
        watchTogetherPlayer.pause(movieId, new WatchTogetherPlayerAdapterKt$pauseCompletable$1$1(bVar), new WatchTogetherPlayerAdapterKt$pauseCompletable$1$2(bVar));
    }

    /* renamed from: playCompletable-7oW5DGo, reason: not valid java name */
    public static final a m354playCompletable7oW5DGo(final WatchTogetherPlayer watchTogetherPlayer, final MovieId movieId, final float f) {
        return new e(new d() { // from class: xsna.scx0
            @Override // io.reactivex.rxjava3.core.d
            public final void subscribe(io.reactivex.rxjava3.core.b bVar) {
                WatchTogetherPlayerAdapterKt.playCompletable_7oW5DGo$lambda$0(WatchTogetherPlayer.this, movieId, f, bVar);
            }
        });
    }

    /* renamed from: playCompletable-7oW5DGo$default, reason: not valid java name */
    public static /* synthetic */ a m355playCompletable7oW5DGo$default(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = MovieVolume.Companion.m375getFULL_pGdNCs();
        }
        return m354playCompletable7oW5DGo(watchTogetherPlayer, movieId, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playCompletable_7oW5DGo$lambda$0(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId, float f, b bVar) {
        WatchTogetherPlayer.m350playyj_a6ag$default(watchTogetherPlayer, movieId, f, null, false, new WatchTogetherPlayerAdapterKt$playCompletable$1$1(bVar), new WatchTogetherPlayerAdapterKt$playCompletable$1$2(bVar), 12, null);
    }

    public static final a resumeCompletable(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId) {
        return new e(new nui(watchTogetherPlayer, movieId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resumeCompletable$lambda$0(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId, b bVar) {
        watchTogetherPlayer.resume(movieId, new WatchTogetherPlayerAdapterKt$resumeCompletable$1$1(bVar), new WatchTogetherPlayerAdapterKt$resumeCompletable$1$2(bVar));
    }

    public static final a setPositionCompletable(final WatchTogetherPlayer watchTogetherPlayer, final MovieId movieId, final long j, final TimeUnit timeUnit) {
        return new e(new d() { // from class: xsna.ucx0
            @Override // io.reactivex.rxjava3.core.d
            public final void subscribe(io.reactivex.rxjava3.core.b bVar) {
                WatchTogetherPlayerAdapterKt.setPositionCompletable$lambda$0(WatchTogetherPlayer.this, movieId, j, timeUnit, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPositionCompletable$lambda$0(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId, long j, TimeUnit timeUnit, b bVar) {
        watchTogetherPlayer.setPosition(movieId, j, timeUnit, new WatchTogetherPlayerAdapterKt$setPositionCompletable$1$1(bVar), new WatchTogetherPlayerAdapterKt$setPositionCompletable$1$2(bVar));
    }

    /* renamed from: setVolumeCompletable-ggaNb7w, reason: not valid java name */
    public static final a m356setVolumeCompletableggaNb7w(final WatchTogetherPlayer watchTogetherPlayer, final MovieId movieId, final float f, final boolean z) {
        return new e(new d() { // from class: xsna.tcx0
            @Override // io.reactivex.rxjava3.core.d
            public final void subscribe(io.reactivex.rxjava3.core.b bVar) {
                WatchTogetherPlayerAdapterKt.setVolumeCompletable_ggaNb7w$lambda$0(WatchTogetherPlayer.this, movieId, f, z, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setVolumeCompletable_ggaNb7w$lambda$0(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId, float f, boolean z, b bVar) {
        watchTogetherPlayer.mo353setVolumeF2PwOSs(movieId, f, z, new WatchTogetherPlayerAdapterKt$setVolumeCompletable$1$1(bVar), new WatchTogetherPlayerAdapterKt$setVolumeCompletable$1$2(bVar));
    }

    public static final a setVolumeMuteCompletable(final WatchTogetherPlayer watchTogetherPlayer, final MovieId movieId, final boolean z) {
        return new e(new d() { // from class: xsna.vcx0
            @Override // io.reactivex.rxjava3.core.d
            public final void subscribe(io.reactivex.rxjava3.core.b bVar) {
                WatchTogetherPlayerAdapterKt.setVolumeMuteCompletable$lambda$0(WatchTogetherPlayer.this, movieId, z, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setVolumeMuteCompletable$lambda$0(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId, boolean z, b bVar) {
        watchTogetherPlayer.setMuted(movieId, z, new WatchTogetherPlayerAdapterKt$setVolumeMuteCompletable$1$1(bVar), new WatchTogetherPlayerAdapterKt$setVolumeMuteCompletable$1$2(bVar));
    }

    public static final a stopCompletable(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId) {
        return new e(new g8n(watchTogetherPlayer, movieId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopCompletable$lambda$0(WatchTogetherPlayer watchTogetherPlayer, MovieId movieId, b bVar) {
        watchTogetherPlayer.stop(movieId, new WatchTogetherPlayerAdapterKt$stopCompletable$1$1(bVar), new WatchTogetherPlayerAdapterKt$stopCompletable$1$2(bVar));
    }
}
