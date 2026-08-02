package ru.ok.proto;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import ru.ok.media.NetStats;
import ru.ok.media.utils.DataSample;
import ru.ok.media.utils.VideoSize;

@Keep
/* loaded from: classes9.dex */
public interface NetPublisher {

    @Keep
    public interface Callback {
        int getId();

        void handleError(int i, int i2);

        void handleHandshakeComplete(int i);

        void handlePublishingRestart(int i);

        void handlePublishingStart(int i);

        void handleRestarted(int i);

        void handleRetrying(int i);

        void handleStopped(int i);
    }

    void dropBenchBytes();

    long getBitrate();

    @NonNull
    String getDebugInfo();

    String getName();

    NetStats getNetStats();

    long getNetworkBW(long j);

    @NonNull
    PacketStats getPacketStats();

    QualityController getQualityController();

    boolean isConnectionChecked();

    boolean isPaused();

    void pause();

    void publishStream(String str);

    void pushAACAudioFrame(ByteBuffer byteBuffer, boolean z, int i, int i2);

    void pushH264Frame(DataSample dataSample, boolean z, int i, int i2);

    void pushH264Headers(byte[] bArr, int i);

    void resume();

    boolean sendBenchBytes(int i);

    void setBitrates(long j, long j2);

    void setCallback(Callback callback);

    void setVideoRotation(int i);

    void setVideoSize(VideoSize videoSize);

    void start();

    void stop();

    void updateBuffers();
}
