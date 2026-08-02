package ru.ok.android.webrtc;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.HardwareVideoEncoderFactory;
import ru.ok.android.webrtc.OKCameraCapturer;
import ru.ok.android.webrtc.camera.CaptureFormatHelper;
import ru.ok.android.webrtc.enumerator.Camera1EnumeratorHandlerImpl;
import ru.ok.android.webrtc.enumerator.Camera2EnumeratorHandlerImpl;
import ru.ok.android.webrtc.enumerator.base.CameraEnumeratorHandler;
import ru.ok.android.webrtc.enumerator.camera.CameraInfo;
import ru.ok.android.webrtc.enumerator.camera.CameraParams;
import ru.ok.android.webrtc.utils.MiscHelper;
import xsna.bjn0;
import xsna.go9;

/* loaded from: classes9.dex */
public final class SimpleVideoCaptureFactory implements VideoCaptureFactory {
    public final OKCameraCapturer.Factory a;
    public final RTCLog b;
    public final LocalMediaPermissionProvider c;
    public final CameraEventsHandler d;
    public final CaptureFormatHelper e;
    public final CameraConfigurationProvider f;
    public boolean g;
    public Context h;

    public static final class Builder {
        public OKCameraCapturer.Factory a;
        public RTCLog b;
        public List c;
        public LocalMediaPermissionProvider d;
        public boolean e = false;
        public final Context f;

        public Builder(Context context) {
            this.f = context;
        }

        @NonNull
        public SimpleVideoCaptureFactory build() {
            if (this.a == null || this.b == null || this.d == null) {
                throw new IllegalStateException();
            }
            return new SimpleVideoCaptureFactory(this);
        }

        public Builder setAdditionalWhitelistedCodecPrefixes(List<String> list) {
            this.c = list;
            return this;
        }

        public Builder setMediaPermissionsProvider(LocalMediaPermissionProvider localMediaPermissionProvider) {
            this.d = localMediaPermissionProvider;
            return this;
        }

        public Builder setOkCameraCapturerFactory(@NonNull OKCameraCapturer.Factory factory) {
            this.a = factory;
            return this;
        }

        public Builder setRtcLog(@NonNull RTCLog rTCLog) {
            this.b = rTCLog;
            return this;
        }

        @NonNull
        public Builder setUseCamera2Api(boolean z) {
            this.e = z;
            return this;
        }
    }

    public static class CameraConfigurationProvider implements CameraVideoCapturer.CameraConfigurationProvider {
        public volatile CameraToggles a = new CameraToggles();
        public final Object b = new Object();

        @Override // org.webrtc.CameraVideoCapturer.CameraConfigurationProvider
        public boolean isCrashOnCameraCloseRequired() {
            return this.a.isCrashOnCameraCloseRequired();
        }
    }

    public SimpleVideoCaptureFactory(Builder builder) {
        this.c = builder.d;
        RTCLog rTCLog = builder.b;
        this.b = rTCLog;
        this.a = builder.a;
        rTCLog.log("OKRTCSvcFactory", "Is VIDEO HW acceleration enabled ? " + MiscHelper.toYesNo(Boolean.valueOf(MiscHelper.isVideoHwAccelerationEnabled())));
        rTCLog.log("OKRTCSvcFactory", "Is Camera2 API enabled ? " + builder.e);
        this.g = builder.e;
        this.h = builder.f;
        this.d = new CameraEventsHandler(rTCLog);
        this.e = new CaptureFormatHelper(rTCLog);
        this.f = new CameraConfigurationProvider();
        HardwareVideoEncoderFactory.odklSupportedH264HwCodecPrefixes.clear();
        HardwareVideoEncoderFactory.odklSupportedH264HwCodecPrefixes.addAll(builder.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CameraCapturerAdapter a(CameraParams cameraParams) {
        boolean z;
        CameraEnumeratorHandler camera1EnumeratorHandlerImpl;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        CameraVideoCapturer createCapturer;
        Context context = this.h;
        try {
            RTCLog rTCLog = this.b;
            StringBuilder sb = new StringBuilder("creating camera capturer adapter using camera api ");
            z = true;
            sb.append(this.g ? 2 : 1);
            rTCLog.log("OKRTCSvcFactory", sb.toString());
            if (cameraParams != null && cameraParams.getFacing() != CameraParams.Facing.UNKNOWN) {
                this.b.log("OKRTCSvcFactory", "requested initial facing is " + cameraParams.getFacing());
            }
            camera1EnumeratorHandlerImpl = (!this.g || context == null) ? new Camera1EnumeratorHandlerImpl(this.b, MiscHelper.isVideoHwAccelerationEnabled()) : new Camera2EnumeratorHandlerImpl(this.b, context);
            arrayList = null;
            arrayList2 = null;
            str = null;
            str2 = null;
        } catch (IllegalArgumentException unused) {
            this.b.log("OKRTCSvcFactory", "IAE @ camera enumeration");
        }
        for (CameraInfo cameraInfo : camera1EnumeratorHandlerImpl.getCameraInfoList()) {
            if (!(cameraInfo instanceof CameraInfo.Front)) {
                if ((cameraInfo instanceof CameraInfo.Back) && arrayList2 == null) {
                    if (!cameraInfo.getCameraParameterList().isEmpty()) {
                        arrayList2 = new ArrayList(cameraInfo.getCameraParameterList());
                        str = cameraInfo.getCameraId();
                        if (arrayList != null) {
                            break;
                        }
                    } else {
                        this.b.reportException("OKRTCSvcFactory", "camera.enumeratore.npe.back", new RuntimeException("No supported formats for back camera"));
                    }
                }
            } else if (arrayList == null) {
                if (!cameraInfo.getCameraParameterList().isEmpty()) {
                    arrayList = new ArrayList(cameraInfo.getCameraParameterList());
                    str2 = cameraInfo.getCameraId();
                    if (arrayList2 != null) {
                        break;
                    }
                } else {
                    this.b.reportException("OKRTCSvcFactory", "camera.enumerator.npe.front", new RuntimeException("No supported formats for front camera"));
                }
            } else {
                continue;
            }
            this.b.log("OKRTCSvcFactory", "IAE @ camera enumeration");
            this.b.reportException("OKRTCSvcFactory", "camera.enumerator.null", new RuntimeException("Cant find camera capturer"));
            return null;
        }
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        if (cameraParams != null && cameraParams.getFacing() != CameraParams.Facing.FRONT) {
            z = false;
        }
        boolean z2 = z;
        if (!z2) {
            str2 = str;
        }
        if (str2 != null) {
            try {
                createCapturer = camera1EnumeratorHandlerImpl.createCapturer(str2, this.d, this.e, this.f);
            } catch (Exception e) {
                this.b.reportException("OKRTCSvcFactory", "camera.enumerator.create", new RuntimeException("Cant create front camera capturer", e));
            }
            if (createCapturer == null && arrayList3 != null) {
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList(arrayList3);
                }
                return new CameraCapturerAdapter(this.a, createCapturer, camera1EnumeratorHandlerImpl, arrayList3, arrayList4, z2, this.b);
            }
            if (arrayList4 != null) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList(arrayList4);
                }
                return new CameraCapturerAdapter(this.a, camera1EnumeratorHandlerImpl.createCapturer(str, this.d, this.e, this.f), camera1EnumeratorHandlerImpl, arrayList3, arrayList4, false, this.b);
            }
            this.b.reportException("OKRTCSvcFactory", "camera.enumerator.null", new RuntimeException("Cant find camera capturer"));
            return null;
        }
        createCapturer = null;
        if (createCapturer == null) {
        }
        if (arrayList4 != null) {
        }
        this.b.reportException("OKRTCSvcFactory", "camera.enumerator.null", new RuntimeException("Cant find camera capturer"));
        return null;
    }

    @Override // ru.ok.android.webrtc.VideoCaptureFactory
    @Nullable
    public CameraCapturerAdapter createCameraCapturer() {
        return createCameraCapturer(null);
    }

    @Override // ru.ok.android.webrtc.VideoCaptureFactory
    @Nullable
    public ScreenCapturerAdapter createScreenCapturer(Intent intent, Executor executor) {
        try {
            return new ScreenCapturerAdapter(intent, executor, this.b);
        } catch (Exception e) {
            this.b.reportException("OKRTCSvcFactory", "screen.capture.adapter", new RuntimeException("Cant create screen capturer", e));
            return null;
        }
    }

    public void release() {
        this.h = null;
    }

    public String toString() {
        return MiscHelper.identity2(this);
    }

    @Override // ru.ok.android.webrtc.VideoCaptureFactory
    @Nullable
    public CameraCapturerAdapter createCameraCapturer(CameraParams cameraParams) {
        this.b.log("OKRTCSvcFactory", "createCameraCapturer");
        LocalMediaPermissionProvider localMediaPermissionProvider = this.c;
        if (localMediaPermissionProvider == null || !localMediaPermissionProvider.isCameraPermissionGranted()) {
            this.b.log("OKRTCSvcFactory", "No video permissions");
            return null;
        }
        try {
            return a(cameraParams);
        } catch (Throwable th) {
            this.b.reportException("OKRTCSvcFactory", "Camera capturer creation failed. Is Camera2: " + this.g, th);
            if (!this.g) {
                return null;
            }
            this.b.log("OKRTCSvcFactory", "Failed to create camera capturer using camera2 API. Fallback to camera1");
            this.g = false;
            try {
                return a(cameraParams);
            } catch (Throwable th2) {
                this.b.reportException("OKRTCSvcFactory", "Camera capturer creation failed after fallback to camera1", th2);
                return null;
            }
        }
    }

    public static class CameraEventsHandler implements CameraVideoCapturer.CameraEventsHandler {
        public final RTCLog a;

        public CameraEventsHandler(RTCLog rTCLog) {
            this.a = rTCLog;
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraError(String str, Throwable th) {
            RuntimeException runtimeException = new RuntimeException(go9.b("Camera error: ", str), th);
            this.a.reportException("OKRTCSvcFactory", "onCameraError(): " + str, runtimeException);
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraFreezed(String str) {
            bjn0.b("onCameraFreezed(): ", str, this.a, "OKRTCSvcFactory");
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraClosed() {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraDisconnected() {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onFirstFrameAvailable() {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraOpening(String str) {
        }
    }
}
