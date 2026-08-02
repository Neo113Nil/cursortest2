package ru.ok.android.webrtc.enumerator.base;

import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;
import ru.ok.android.webrtc.enumerator.camera.CameraInfo;
import ru.ok.android.webrtc.enumerator.camera.CameraParams;

/* loaded from: classes9.dex */
public interface CameraEnumeratorHandler extends CameraEnumerator {
    @Override // org.webrtc.CameraEnumerator
    CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CameraConfigurationProvider cameraConfigurationProvider);

    CameraInfo getCameraInfo(String str);

    List<CameraInfo> getCameraInfoList();

    @Override // org.webrtc.CameraEnumerator
    String[] getDeviceNames();

    CameraInfo getFirstCamera(CameraParams.Facing facing);

    @Override // org.webrtc.CameraEnumerator
    List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str);

    @Override // org.webrtc.CameraEnumerator
    boolean isBackFacing(String str);

    @Override // org.webrtc.CameraEnumerator
    boolean isFrontFacing(String str);
}
