package ru.ok.android.webrtc.utils;

import androidx.annotation.NonNull;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;

/* loaded from: classes9.dex */
public final class VideoRendererProxy implements VideoSink {
    public volatile VideoSink a;
    public volatile boolean b;

    @Override // org.webrtc.VideoSink
    public void onFrame(@NonNull VideoFrame videoFrame) {
        if (this.b) {
            return;
        }
        onFrameForced(videoFrame);
    }

    public void onFrameForced(@NonNull VideoFrame videoFrame) {
        VideoSink videoSink = this.a;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    public void safelyRemoveSelf(@NonNull VideoTrack videoTrack) {
        try {
            videoTrack.removeSink(this);
        } catch (Exception unused) {
        }
    }

    public void setDelegate(VideoSink videoSink) {
        this.a = videoSink;
    }

    public void setDisableVideoSink(boolean z) {
        this.b = z;
    }
}
