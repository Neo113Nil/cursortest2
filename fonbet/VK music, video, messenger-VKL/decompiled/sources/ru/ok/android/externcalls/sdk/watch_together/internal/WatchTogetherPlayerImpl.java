package ru.ok.android.externcalls.sdk.watch_together.internal;

import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.webrtc.participant.movie.MovieId;
import ru.ok.android.webrtc.participant.movie.MoviePresetMeta;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: WatchTogetherPlayerImpl.kt */
/* loaded from: classes9.dex */
public final class WatchTogetherPlayerImpl implements WatchTogetherPlayer, WatchTogetherCommandsExecutor, WatchTogetherListenerManager {
    private final WatchTogetherCommandsExecutor commandExecutor;
    private final WatchTogetherListenerManager listenerManager;

    public WatchTogetherPlayerImpl(WatchTogetherCommandsExecutor watchTogetherCommandsExecutor, WatchTogetherListenerManager watchTogetherListenerManager) {
        this.commandExecutor = watchTogetherCommandsExecutor;
        this.listenerManager = watchTogetherListenerManager;
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public void addListener(WatchTogetherListener watchTogetherListener) {
        this.listenerManager.addListener(watchTogetherListener);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public MovieStates getMovieStates() {
        return this.listenerManager.getMovieStates();
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void pause(MovieId movieId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.pause(movieId, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    /* renamed from: play-yj_a6ag */
    public void mo352playyj_a6ag(MovieId movieId, float f, MoviePresetMeta moviePresetMeta, boolean z, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.mo352playyj_a6ag(movieId, f, moviePresetMeta, z, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public void removeListener(WatchTogetherListener watchTogetherListener) {
        this.listenerManager.removeListener(watchTogetherListener);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void resume(MovieId movieId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.resume(movieId, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void setMuted(MovieId movieId, boolean z, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.setMuted(movieId, z, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void setPosition(MovieId movieId, long j, TimeUnit timeUnit, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.setPosition(movieId, j, timeUnit, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    /* renamed from: setVolume-F2PwOSs */
    public void mo353setVolumeF2PwOSs(MovieId movieId, float f, boolean z, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.mo353setVolumeF2PwOSs(movieId, f, z, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer, ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void stop(MovieId movieId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.stop(movieId, gzsVar, izsVar);
    }
}
