package ru.ok.android.webrtc.protocol.screenshare.send;

import android.content.Intent;
import android.media.projection.MediaProjection;
import org.webrtc.Size;
import org.webrtc.VideoSink;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes9.dex */
public interface FrameCapturer {
    default double fps() {
        return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }

    MediaProjection getMediaProjection();

    void release();

    void setFrameConsumer(VideoSink videoSink);

    void startCapturing(Size size, Intent intent);

    void stopCapturing();

    void waitUntilReleased();
}
