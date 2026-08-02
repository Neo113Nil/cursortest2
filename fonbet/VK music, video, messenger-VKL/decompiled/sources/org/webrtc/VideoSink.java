package org.webrtc;

/* loaded from: classes11.dex */
public interface VideoSink {
    @CalledByNative
    void onFrame(VideoFrame videoFrame);
}
