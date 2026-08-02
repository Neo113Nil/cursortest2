package ru.ok.android.webrtc;

import android.content.Intent;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import ru.ok.android.webrtc.enumerator.camera.CameraParams;

/* loaded from: classes9.dex */
public interface VideoCaptureFactory {
    @Nullable
    CameraCapturerAdapter createCameraCapturer();

    @Nullable
    default CameraCapturerAdapter createCameraCapturer(@Nullable CameraParams cameraParams) {
        return createCameraCapturer();
    }

    @Nullable
    ScreenCapturerAdapter createScreenCapturer(Intent intent, Executor executor);
}
