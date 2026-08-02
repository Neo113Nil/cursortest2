package ru.ok.android.webrtc.mediarecord;

import com.unity3d.services.UnityAdsConstants;
import org.webrtc.CapturerObserver;
import org.webrtc.VideoFrame;
import ru.ok.android.webrtc.LocalMediaStreamSource;
import ru.ok.android.webrtc.rotation.RotationProvider;

/* loaded from: classes9.dex */
public final class RtpScreenCapturerObserver implements CapturerObserver {
    public final RotationProvider a;
    public final LocalMediaStreamSource.ScreenCaptureStateListener b;
    public CapturerObserver c;

    public RtpScreenCapturerObserver(RotationProvider rotationProvider, LocalMediaStreamSource.ScreenCaptureStateListener screenCaptureStateListener) {
        this.a = rotationProvider;
        this.b = screenCaptureStateListener;
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
        if (z) {
            this.b.onScreenCaptureStarted(true);
        }
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        this.b.onScreenCaptureStopped(true);
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        if (videoFrame != null) {
            float currentRotation = this.a.currentRotation();
            if (currentRotation != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f = 360;
                videoFrame = new VideoFrame(videoFrame.getBuffer(), (int) (f - ((videoFrame.getRotation() + currentRotation) % f)), videoFrame.getTimestampNs());
            }
        } else {
            videoFrame = null;
        }
        CapturerObserver capturerObserver = this.c;
        if (capturerObserver != null) {
            capturerObserver.onFrameCaptured(videoFrame);
        }
    }

    public final void setCapturerObserver(CapturerObserver capturerObserver) {
        this.c = capturerObserver;
    }
}
