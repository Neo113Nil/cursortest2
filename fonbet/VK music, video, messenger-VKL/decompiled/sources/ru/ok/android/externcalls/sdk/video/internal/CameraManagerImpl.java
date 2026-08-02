package ru.ok.android.externcalls.sdk.video.internal;

import ru.ok.android.externcalls.sdk.video.CameraManager;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.enumerator.camera.CameraParams;
import xsna.gzs;
import xsna.zcl;

/* compiled from: CameraManagerImpl.kt */
/* loaded from: classes9.dex */
public final class CameraManagerImpl implements CameraManager {
    private final Call call;
    private final boolean isEarlyVideoEnabled;
    private final gzs<Boolean> isPrepared;

    public CameraManagerImpl(Call call, gzs<Boolean> gzsVar, boolean z) {
        this.call = call;
        this.isPrepared = gzsVar;
        this.isEarlyVideoEnabled = z;
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public int getNumberOfCameras() {
        return this.call.numberOfCameras;
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public boolean isCameraEnabled() {
        return this.call.isVideoEnabled();
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public boolean isCapturingFromFrontCamera() {
        return this.call.getVideoCaptureState() == 1;
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public void setCameraEnabled(boolean z) {
        if (this.isEarlyVideoEnabled || this.isPrepared.invoke().booleanValue()) {
            this.call.setVideoEnabled(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public void switchCamera(CameraParams cameraParams) {
        this.call.switchCamera(cameraParams);
    }

    public /* synthetic */ CameraManagerImpl(Call call, gzs gzsVar, boolean z, int i, zcl zclVar) {
        this(call, gzsVar, (i & 4) != 0 ? false : z);
    }
}
