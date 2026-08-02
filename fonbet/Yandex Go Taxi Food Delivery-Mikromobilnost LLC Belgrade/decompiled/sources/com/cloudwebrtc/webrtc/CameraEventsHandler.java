package com.cloudwebrtc.webrtc;

import org.webrtc.CameraVideoCapturer;

/* loaded from: classes10.dex */
class CameraEventsHandler implements CameraVideoCapturer.CameraEventsHandler {
    private static final String TAG = "FlutterWebRTCPlugin";
    private CameraState state = CameraState.NEW;

    public enum CameraState {
        NEW,
        OPENING,
        OPENED,
        CLOSED,
        DISCONNECTED,
        ERROR,
        FREEZED
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraClosed() {
        this.state = CameraState.CLOSED;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraDisconnected() {
        this.state = CameraState.DISCONNECTED;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraError(String str) {
        new StringBuilder("CameraEventsHandler.onCameraError: errorDescription=").append(str);
        this.state = CameraState.ERROR;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraFreezed(String str) {
        new StringBuilder("CameraEventsHandler.onCameraFreezed: errorDescription=").append(str);
        this.state = CameraState.FREEZED;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraOpening(String str) {
        new StringBuilder("CameraEventsHandler.onCameraOpening: cameraName=").append(str);
        this.state = CameraState.OPENING;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onFirstFrameAvailable() {
        this.state = CameraState.OPENED;
    }

    public void waitForCameraClosed() {
        while (true) {
            CameraState cameraState = this.state;
            if (cameraState == CameraState.CLOSED || cameraState == CameraState.ERROR) {
                return;
            } else {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public void waitForCameraOpen() {
        while (true) {
            CameraState cameraState = this.state;
            if (cameraState == CameraState.OPENED || cameraState == CameraState.ERROR) {
                return;
            } else {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
