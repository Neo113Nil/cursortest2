package ru.ok.proto;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes9.dex */
public interface QualityController {
    boolean canSwitchUp();

    void debugForceTargetBitrate(long j);

    boolean getAndResetKeyFrameRequest();

    long getBandwidth();

    long getSelectedBandwidth();

    int getVideoFrameSkipCounter();

    boolean isAudioFrameAllowed();

    boolean isVideoFrameAllowed();

    void pause();

    void requestKeyFrame();

    void resume();

    void setKeyFrameInterval(int i);

    void setSlowpokeIdx(int i);

    void setTargetBitrate(long j);

    void start(long j);

    long update();

    void videoSizeChanged();
}
