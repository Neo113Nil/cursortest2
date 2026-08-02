package ru.ok.android.webrtc.camera;

import org.webrtc.VideoSink;

/* loaded from: classes9.dex */
public interface CameraPreviewSupport {
    VideoSink getPreviewRenderer();

    void setPreviewRenderer(VideoSink videoSink);
}
