package ru.ok.android.webrtc.protocol.screenshare.send;

import org.webrtc.EncodedImage;
import org.webrtc.VideoSink;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes9.dex */
public interface FrameEncoder extends VideoSink {

    public interface Consumer {
        void onEncodedFrame(EncodedImage encodedImage);
    }

    public interface SenderBackpressure {
        boolean needsKeyFrame();

        boolean shouldSkipFrame();
    }

    default double droppedFps() {
        return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }

    default double fps() {
        return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }

    void release();

    void setEncodedImageConsumer(Consumer consumer);

    void setSenderBackpressure(SenderBackpressure senderBackpressure);

    void startEncoding();

    void stopEncoding();
}
