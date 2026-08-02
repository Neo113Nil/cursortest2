package androidx.media3.exoplayer;

import android.media.AudioDeviceInfo;
import android.os.Looper;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.exoplayer.image.ImageOutput;
import defpackage.b32;
import defpackage.fe10;
import defpackage.fyi0;
import defpackage.g7q0;
import defpackage.ga4;
import defpackage.j42;
import defpackage.kyg;
import defpackage.las0;
import defpackage.m001;
import defpackage.nno;
import defpackage.pno;
import defpackage.qr7;
import defpackage.uf10;
import defpackage.x001;
import defpackage.xl31;
import defpackage.xyc0;
import defpackage.y3c;
import defpackage.yyc0;
import defpackage.yzz0;
import defpackage.zxc0;
import java.util.List;

/* loaded from: classes10.dex */
public interface ExoPlayer extends zxc0 {
    void addAnalyticsListener(j42 j42Var);

    void addAudioOffloadListener(nno nnoVar);

    void addMediaSource(int i, uf10 uf10Var);

    void addMediaSource(uf10 uf10Var);

    void addMediaSources(int i, List list);

    void addMediaSources(List list);

    void clearAuxEffectInfo();

    void clearCameraMotionListener(qr7 qr7Var);

    void clearVideoFrameMetadataListener(xl31 xl31Var);

    yyc0 createMessage(xyc0 xyc0Var);

    b32 getAnalyticsCollector();

    kyg getAudioDecoderCounters();

    androidx.media3.common.a getAudioFormat();

    int getAudioSessionId();

    y3c getClock();

    yzz0 getCurrentTrackGroups();

    m001 getCurrentTrackSelections();

    boolean getPauseAtEndOfMediaItems();

    Looper getPlaybackLooper();

    @Override // defpackage.zxc0
    ExoPlaybackException getPlayerError();

    pno getPreloadConfiguration();

    fyi0 getRenderer(int i);

    int getRendererCount();

    int getRendererType(int i);

    fyi0 getSecondaryRenderer(int i);

    g7q0 getSeekParameters();

    boolean getSkipSilenceEnabled();

    x001 getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    kyg getVideoDecoderCounters();

    androidx.media3.common.a getVideoFormat();

    int getVideoScalingMode();

    boolean isReleased();

    boolean isSleepingForOffload();

    boolean isTunnelingEnabled();

    void prepare(uf10 uf10Var);

    void prepare(uf10 uf10Var, boolean z, boolean z2);

    void removeAnalyticsListener(j42 j42Var);

    void removeAudioOffloadListener(nno nnoVar);

    void replaceMediaItem(int i, fe10 fe10Var);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(ga4 ga4Var);

    void setCameraMotionListener(qr7 qr7Var);

    void setForegroundMode(boolean z);

    void setHandleAudioBecomingNoisy(boolean z);

    void setImageOutput(ImageOutput imageOutput);

    void setMediaSource(uf10 uf10Var);

    void setMediaSource(uf10 uf10Var, long j);

    void setMediaSource(uf10 uf10Var, boolean z);

    void setMediaSources(List list);

    void setMediaSources(List list, int i, long j);

    void setMediaSources(List list, boolean z);

    void setPauseAtEndOfMediaItems(boolean z);

    void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo);

    void setPreloadConfiguration(pno pnoVar);

    void setPriority(int i);

    void setPriorityTaskManager(PriorityTaskManager priorityTaskManager);

    void setSeekParameters(g7q0 g7q0Var);

    void setShuffleOrder(las0 las0Var);

    void setSkipSilenceEnabled(boolean z);

    void setVideoChangeFrameRateStrategy(int i);

    void setVideoEffects(List list);

    void setVideoFrameMetadataListener(xl31 xl31Var);

    void setVideoScalingMode(int i);

    void setWakeMode(int i);
}
