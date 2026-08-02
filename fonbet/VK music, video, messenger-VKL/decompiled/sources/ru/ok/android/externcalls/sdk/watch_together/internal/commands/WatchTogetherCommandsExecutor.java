package ru.ok.android.externcalls.sdk.watch_together.internal.commands;

import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.participant.movie.MovieId;
import ru.ok.android.webrtc.participant.movie.MoviePresetMeta;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: WatchTogetherCommandsExecutor.kt */
/* loaded from: classes9.dex */
public interface WatchTogetherCommandsExecutor {
    void pause(MovieId movieId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    /* renamed from: play-yj_a6ag */
    void mo352playyj_a6ag(MovieId movieId, float f, MoviePresetMeta moviePresetMeta, boolean z, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void resume(MovieId movieId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void setMuted(MovieId movieId, boolean z, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void setPosition(MovieId movieId, long j, TimeUnit timeUnit, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    /* renamed from: setVolume-F2PwOSs */
    void mo353setVolumeF2PwOSs(MovieId movieId, float f, boolean z, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void stop(MovieId movieId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);
}
