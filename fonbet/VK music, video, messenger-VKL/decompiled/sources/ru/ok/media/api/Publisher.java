package ru.ok.media.api;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Collection;
import ru.ok.media.NetStats;
import ru.ok.media.PublisherImpl;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.utils.VideoSize;
import ru.ok.proto.PacketStats;
import ru.ok.proto.PublisherConfiguration;

/* loaded from: classes9.dex */
public interface Publisher {
    static Publisher create(Context context, PublisherConfiguration publisherConfiguration, boolean z, LoggerInterface loggerInterface) {
        return new PublisherImpl(context, publisherConfiguration, z, loggerInterface);
    }

    AudioEffectController getAudioEffectsController();

    long getAudioEncoderBitrate();

    long getBitrate();

    @NonNull
    PublisherCameraClient getCameraClient();

    long getCurrentBandwidth();

    long getCurrentPosition();

    @NonNull
    String getDebugInfo();

    @NonNull
    VideoSize getEncoderResolution();

    double getFps();

    NetStats getNetStats();

    @NonNull
    PacketStats getPacketStats();

    VideoSize getPerformanceLimitResolution();

    String getProtocolName();

    int getRotationAngle();

    long getVideoBitrate();

    long getVideoEncoderBitrate();

    boolean isClosed();

    boolean isPause();

    boolean isPublishing();

    boolean isStopping();

    void pause();

    void requestVoice(boolean z);

    boolean resume();

    void resumeConnection();

    void setCameraCallback(PublisherCameraCallback publisherCameraCallback);

    void setForceOpenSL(boolean z);

    void setMuted(boolean z);

    void setNativeAudioProcessingFactory(long j);

    void setStateChangeListener(PublisherStateChangeListener publisherStateChangeListener);

    void setStreamName(@NonNull String str);

    void setUrls(Collection<String> collection);

    void startPublishing();

    void stopNetworkLoad();

    void stopPublishing();
}
