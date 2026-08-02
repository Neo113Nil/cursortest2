package ru.ok.android.externcalls.sdk.video;

import ru.ok.android.webrtc.enumerator.camera.CameraParams;

/* compiled from: CameraManager.kt */
/* loaded from: classes9.dex */
public interface CameraManager {
    int getNumberOfCameras();

    boolean isCameraEnabled();

    boolean isCapturingFromFrontCamera();

    void setCameraEnabled(boolean z);

    void switchCamera(CameraParams cameraParams);
}
