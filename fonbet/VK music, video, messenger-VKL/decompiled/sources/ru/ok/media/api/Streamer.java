package ru.ok.media.api;

import java.net.URI;
import javax.microedition.khronos.opengles.GL10;
import ru.ok.media.StreamerPacketsInfo;
import ru.ok.media.StreamerStatistic;
import ru.ok.media.utils.VideoSize;
import xsna.yis0;

/* compiled from: Streamer.kt */
/* loaded from: classes9.dex */
public interface Streamer {

    /* compiled from: Streamer.kt */
    public interface Listener {
        void onStreamerStateChanged(StreamerState streamerState, StreamerState streamerState2);
    }

    /* compiled from: Streamer.kt */
    public static final class VideoFrame {
        private final VideoSize size;
        private final yis0 textureInfo;
        private final long timestampMs;
        private final int videoRotationAngle;

        public VideoFrame(VideoSize videoSize, yis0 yis0Var, int i, long j) {
            this.size = videoSize;
            this.textureInfo = yis0Var;
            this.videoRotationAngle = i;
            this.timestampMs = j;
        }

        public static /* synthetic */ VideoFrame copyWith$default(VideoFrame videoFrame, VideoSize videoSize, int i, float[] fArr, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                videoSize = videoFrame.size;
            }
            if ((i2 & 2) != 0) {
                i = videoFrame.videoRotationAngle;
            }
            if ((i2 & 4) != 0) {
                fArr = videoFrame.textureInfo.e;
            }
            if ((i2 & 8) != 0) {
                j = videoFrame.timestampMs;
            }
            float[] fArr2 = fArr;
            return videoFrame.copyWith(videoSize, i, fArr2, j);
        }

        public final VideoFrame copyWith(VideoSize videoSize, int i, float[] fArr, long j) {
            yis0 yis0Var = this.textureInfo;
            return new VideoFrame(videoSize, new yis0(yis0Var.a, yis0Var.d, yis0Var.b, yis0Var.c, fArr, yis0Var.f), i, j);
        }

        public final VideoSize getSize() {
            return this.size;
        }

        public final yis0 getTextureInfo() {
            return this.textureInfo;
        }

        public final long getTimestampMs() {
            return this.timestampMs;
        }

        public final int getVideoRotationAngle() {
            return this.videoRotationAngle;
        }

        public String toString() {
            return "{size: " + this.size + " rotation: " + this.videoRotationAngle + " ts: " + this.timestampMs + " texInfo: " + this.textureInfo + "}";
        }
    }

    void addListener(Listener listener);

    double getAverageBitrate();

    String getDebugInfo();

    StreamerPacketsInfo getPacketsInfo();

    StreamerState getState();

    StreamerStatistic getStatistic();

    LiveStreamStatReporter getStatsReporter();

    boolean getWasBound();

    boolean getWasConnected();

    void pause();

    void prepare(URI uri);

    void processVideoFrame(GL10 gl10, VideoFrame videoFrame);

    void reachabilityChanged(boolean z);

    void removeListener(Listener listener);

    void resume();

    void start();

    void stop();
}
