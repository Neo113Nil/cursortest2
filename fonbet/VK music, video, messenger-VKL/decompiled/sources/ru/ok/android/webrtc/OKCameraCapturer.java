package ru.ok.android.webrtc;

import org.webrtc.CameraVideoCapturer;

/* loaded from: classes9.dex */
public class OKCameraCapturer {
    public final CameraVideoCapturer instance;

    public interface Factory {
        OKCameraCapturer create(CameraVideoCapturer cameraVideoCapturer);
    }

    public OKCameraCapturer(CameraVideoCapturer cameraVideoCapturer) {
        this.instance = cameraVideoCapturer;
    }
}
