package ru.ok.android.webrtc.camera;

import org.webrtc.CameraVideoCapturer;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.CapturedFrameInterceptor;
import ru.ok.android.webrtc.OKCameraCapturer;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.camera.CameraStatCollector;

@CallInternalApi
/* loaded from: classes9.dex */
public final class DefaultCameraCapturerFactory implements OKCameraCapturer.Factory {
    public final CapturedFrameInterceptor a;
    public final RTCLog b;

    public DefaultCameraCapturerFactory(CapturedFrameInterceptor capturedFrameInterceptor, RTCLog rTCLog) {
        this.a = capturedFrameInterceptor;
        this.b = rTCLog;
    }

    @Override // ru.ok.android.webrtc.OKCameraCapturer.Factory
    public OKCameraCapturer create(CameraVideoCapturer cameraVideoCapturer) {
        return new OKCameraCapturer(new PatchedVideoCapturer(cameraVideoCapturer, this.a, new CameraStatCollector(this.b), this.b));
    }
}
