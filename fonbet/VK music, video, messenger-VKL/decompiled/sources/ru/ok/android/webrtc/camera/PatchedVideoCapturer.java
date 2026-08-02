package ru.ok.android.webrtc.camera;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Build;
import java.lang.reflect.Field;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.YuvConverter;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.CapturedFrameInterceptor;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.camera.CameraStatCollector;
import ru.ok.android.webrtc.stat.camera.CameraStatProvider;
import xsna.brm0;
import xsna.ozl;

@CallInternalApi
/* loaded from: classes9.dex */
public final class PatchedVideoCapturer implements CameraVideoCapturer, CameraPreviewSupport {
    public final CameraVideoCapturer a;
    public final CapturedFrameInterceptor b;
    public final CameraStatCollector c;
    public final RTCLog d;
    public YuvConverter e;
    public SurfaceTextureHelper f;
    public volatile VideoSink g;

    public final class FrameProcessor implements CapturerObserver {
        public final CapturerObserver a;

        public FrameProcessor(CapturerObserver capturerObserver) {
            this.a = capturerObserver;
        }

        @Override // org.webrtc.CapturerObserver
        public void onCapturerStarted(boolean z) {
            PatchedVideoCapturer.this.d.log("PatchedVideoCapturer", "onCapturerStarted");
            CapturerObserver capturerObserver = this.a;
            if (capturerObserver != null) {
                capturerObserver.onCapturerStarted(z);
            }
            CapturedFrameInterceptor capturedFrameInterceptor = PatchedVideoCapturer.this.b;
            if (capturedFrameInterceptor != null) {
                capturedFrameInterceptor.onStart(z);
            }
        }

        @Override // org.webrtc.CapturerObserver
        public void onCapturerStopped() {
            PatchedVideoCapturer.this.d.log("PatchedVideoCapturer", "onCapturerStopped");
            CapturerObserver capturerObserver = this.a;
            if (capturerObserver != null) {
                capturerObserver.onCapturerStopped();
            }
            CapturedFrameInterceptor capturedFrameInterceptor = PatchedVideoCapturer.this.b;
            if (capturedFrameInterceptor != null) {
                capturedFrameInterceptor.onStop();
            }
        }

        @Override // org.webrtc.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            PatchedVideoCapturer.this.c.onCameraFrame$webrtc_android_sdk_release(videoFrame);
            if (this.a == null) {
                return;
            }
            VideoSink previewRenderer = PatchedVideoCapturer.this.getPreviewRenderer();
            if (PatchedVideoCapturer.this.b != null) {
                VideoFrame onFrameCaptured = PatchedVideoCapturer.this.b.onFrameCaptured(videoFrame);
                if (onFrameCaptured != null) {
                    if (previewRenderer != null) {
                        try {
                            previewRenderer.onFrame(onFrameCaptured);
                        } catch (Throwable th) {
                            onFrameCaptured.release();
                            throw th;
                        }
                    }
                    this.a.onFrameCaptured(onFrameCaptured);
                    onFrameCaptured.release();
                    return;
                }
            } else if (!brm0.w(Build.MANUFACTURER, "xiaomi", true) && (videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer)) {
                VideoFrame videoFrame2 = new VideoFrame(new RotatedTextureBufferWrapper((VideoFrame.TextureBuffer) videoFrame.getBuffer(), videoFrame.getRotation(), PatchedVideoCapturer.this.f.getHandler(), PatchedVideoCapturer.this.e), 0, videoFrame.getTimestampNs());
                if (previewRenderer != null) {
                    previewRenderer.onFrame(videoFrame2);
                }
                this.a.onFrameCaptured(videoFrame2);
                return;
            }
            if (previewRenderer != null) {
                previewRenderer.onFrame(videoFrame);
            }
            this.a.onFrameCaptured(videoFrame);
        }
    }

    public PatchedVideoCapturer(CameraVideoCapturer cameraVideoCapturer, CapturedFrameInterceptor capturedFrameInterceptor, CameraStatCollector cameraStatCollector, RTCLog rTCLog) {
        this.a = cameraVideoCapturer;
        this.b = capturedFrameInterceptor;
        this.c = cameraStatCollector;
        this.d = rTCLog;
    }

    @Override // org.webrtc.CameraVideoCapturer
    @ozl
    public void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        this.d.log("PatchedVideoCapturer", "addMediaRecorderToCamera");
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i, int i2, int i3) {
        this.a.changeCaptureFormat(i, i2, i3);
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        this.a.dispose();
    }

    public final CameraStatProvider getCameraStatProvider() {
        return this.c;
    }

    @Override // ru.ok.android.webrtc.camera.CameraPreviewSupport
    public VideoSink getPreviewRenderer() {
        return this.g;
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.d.log("PatchedVideoCapturer", "initialize");
        if (this.f != null) {
            throw new IllegalStateException("Repeated initialization");
        }
        this.f = surfaceTextureHelper;
        try {
            Field declaredField = SurfaceTextureHelper.class.getDeclaredField("yuvConverter");
            declaredField.setAccessible(true);
            this.e = (YuvConverter) declaredField.get(surfaceTextureHelper);
        } catch (IllegalAccessException e) {
            this.d.logException("PatchedVideoCapturer", "Cant get yuv converter", e);
        } catch (NoSuchFieldException e2) {
            this.d.logException("PatchedVideoCapturer", "Cant get yuv converter", e2);
        }
        this.a.initialize(surfaceTextureHelper, context, new FrameProcessor(capturerObserver));
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        this.d.log("PatchedVideoCapturer", "isScreencast");
        return this.a.isScreencast();
    }

    @Override // org.webrtc.CameraVideoCapturer
    @ozl
    public void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        this.d.log("PatchedVideoCapturer", "removeMediaRecorderFromCamera");
    }

    @Override // ru.ok.android.webrtc.camera.CameraPreviewSupport
    public void setPreviewRenderer(VideoSink videoSink) {
        this.g = videoSink;
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i, int i2, int i3) {
        this.d.log("PatchedVideoCapturer", "startCapture");
        this.a.startCapture(i, i2, i3);
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() throws InterruptedException {
        this.d.log("PatchedVideoCapturer", "stopCapture");
        this.a.stopCapture();
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        this.d.log("PatchedVideoCapturer", "switchCamera");
        this.a.switchCamera(cameraSwitchHandler);
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        this.d.log("PatchedVideoCapturer", "switchCamera");
        this.a.switchCamera(cameraSwitchHandler, str);
    }
}
