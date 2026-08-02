package com.cloudwebrtc.webrtc.video.camera;

import android.app.Activity;
import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.cloudwebrtc.webrtc.GetUserMediaImpl;
import com.cloudwebrtc.webrtc.utils.AnyThreadResult;
import defpackage.da20;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.x920;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation;
import java.lang.reflect.Field;
import java.util.List;
import org.webrtc.Camera1Capturer;
import org.webrtc.Camera2Capturer;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.VideoCapturer;

/* loaded from: classes10.dex */
public class CameraUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "CameraUtils";
    Activity activity;
    private DeviceOrientationManager deviceOrientationManager;
    private GetUserMediaImpl getUserMediaImpl;
    private boolean isTorchOn = false;

    /* renamed from: com.cloudwebrtc.webrtc.video.camera.CameraUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation;

        static {
            int[] iArr = new int[PlatformChannel$DeviceOrientation.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation = iArr;
            try {
                iArr[PlatformChannel$DeviceOrientation.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[PlatformChannel$DeviceOrientation.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[PlatformChannel$DeviceOrientation.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[PlatformChannel$DeviceOrientation.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class MeteringRectangleFactory {
        public static MeteringRectangle create(int i, int i2, int i3, int i4, int i5) {
            return new MeteringRectangle(i, i2, i3, i4, i5);
        }
    }

    public class NoSuchFieldWithNameException extends NoSuchFieldException {
        String className;
        String fieldName;

        public NoSuchFieldWithNameException(String str, String str2, NoSuchFieldException noSuchFieldException) {
            super(noSuchFieldException.getMessage());
            this.className = str;
            this.fieldName = str2;
        }
    }

    public CameraUtils(GetUserMediaImpl getUserMediaImpl, Activity activity) {
        this.getUserMediaImpl = getUserMediaImpl;
        this.activity = activity;
        DeviceOrientationManager deviceOrientationManager = new DeviceOrientationManager(activity, 0);
        this.deviceOrientationManager = deviceOrientationManager;
        deviceOrientationManager.start();
    }

    public static MeteringRectangle convertPointToMeteringRectangle(Size size, double d, double d2, PlatformChannel$DeviceOrientation platformChannel$DeviceOrientation) {
        int i = AnonymousClass1.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[platformChannel$DeviceOrientation.ordinal()];
        if (i == 1) {
            d2 = 1.0d - d;
            d = d2;
        } else if (i == 2) {
            double d3 = 1.0d - d2;
            d2 = d;
            d = d3;
        } else if (i == 4) {
            d = 1.0d - d;
            d2 = 1.0d - d2;
        }
        int round = (int) Math.round(d * (size.getWidth() - 1));
        int round2 = (int) Math.round(d2 * (size.getHeight() - 1));
        int round3 = (int) Math.round(size.getWidth() / 10.0d);
        int round4 = (int) Math.round(size.getHeight() / 10.0d);
        int i2 = round - (round3 / 2);
        int i3 = round2 - (round4 / 2);
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        int width = (size.getWidth() - 1) - round3;
        int height = (size.getHeight() - 1) - round4;
        if (i2 > width) {
            i2 = width;
        }
        if (i3 > height) {
            i3 = height;
        }
        return MeteringRectangleFactory.create(i2, i3, round3, round4, 1);
    }

    private Object getPrivateProperty(Class cls, Object obj, String str) throws NoSuchFieldWithNameException {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (IllegalAccessException e) {
            ny61.j(e);
            return null;
        } catch (NoSuchFieldException e2) {
            throw this.new NoSuchFieldWithNameException(cls.getName(), str, e2);
        }
    }

    private static void resultError(String str, String str2, da20 da20Var) {
        da20Var.error(str, g8e.p(str, "(): ", str2), null);
    }

    public void hasTorch(String str, da20 da20Var) {
        GetUserMediaImpl.VideoCapturerInfoEx capturerInfo = this.getUserMediaImpl.getCapturerInfo(str);
        if (capturerInfo == null) {
            resultError("hasTorch", g8e.o("Video capturer not found for id: ", str), da20Var);
            return;
        }
        VideoCapturer videoCapturer = capturerInfo.capturer;
        if (!(videoCapturer instanceof Camera2Capturer)) {
            if (!(videoCapturer instanceof Camera1Capturer)) {
                resultError("hasTorch", "[TORCH] Video capturer not compatible", da20Var);
                return;
            }
            try {
                Object privateProperty = getPrivateProperty(Camera1Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
                List<String> supportedFlashModes = ((Camera) getPrivateProperty(privateProperty.getClass(), privateProperty, "camera")).getParameters().getSupportedFlashModes();
                da20Var.success(Boolean.valueOf(supportedFlashModes != null && supportedFlashModes.contains("torch")));
                return;
            } catch (NoSuchFieldWithNameException e) {
                StringBuilder sb = new StringBuilder("[TORCH] Failed to get `");
                sb.append(e.fieldName);
                sb.append("` from `");
                resultError("hasTorch", oyr.t(sb, e.className, "`"), da20Var);
                return;
            }
        }
        try {
            Object privateProperty2 = getPrivateProperty(Camera2Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
            try {
                Boolean bool = (Boolean) ((CameraManager) getPrivateProperty(Camera2Capturer.class, capturerInfo.capturer, "cameraManager")).getCameraCharacteristics(((CameraDevice) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraDevice")).getId()).get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                bool.booleanValue();
                da20Var.success(bool);
            } catch (CameraAccessException e2) {
                ny61.j(e2);
            }
        } catch (NoSuchFieldWithNameException e3) {
            StringBuilder sb2 = new StringBuilder("[TORCH] Failed to get `");
            sb2.append(e3.fieldName);
            sb2.append("` from `");
            resultError("hasTorch", oyr.t(sb2, e3.className, "`"), da20Var);
        }
    }

    public void setExposureMode(x920 x920Var, AnyThreadResult anyThreadResult) {
    }

    public void setExposurePoint(x920 x920Var, Point point, AnyThreadResult anyThreadResult) {
        String str = (String) x920Var.a("trackId");
        GetUserMediaImpl.VideoCapturerInfoEx capturerInfo = this.getUserMediaImpl.getCapturerInfo(str);
        if (capturerInfo == null) {
            resultError("setExposurePoint", g8e.o("Video capturer not found for id: ", str), anyThreadResult);
            return;
        }
        VideoCapturer videoCapturer = capturerInfo.capturer;
        if (!(videoCapturer instanceof Camera2Capturer)) {
            if (videoCapturer instanceof Camera1Capturer) {
                try {
                    Object privateProperty = getPrivateProperty(Camera1Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
                    Camera.Parameters parameters = ((Camera) getPrivateProperty(privateProperty.getClass(), privateProperty, "camera")).getParameters();
                    parameters.setFlashMode(this.isTorchOn ? "torch" : "off");
                    parameters.setFocusAreas(null);
                } catch (NoSuchFieldWithNameException e) {
                    StringBuilder sb = new StringBuilder("[FocusMode] Failed to get `");
                    sb.append(e.fieldName);
                    sb.append("` from `");
                    resultError("setFocusMode", oyr.t(sb, e.className, "`"), anyThreadResult);
                    return;
                }
            }
            resultError("setFocusMode", "[FocusMode] Video capturer not compatible", anyThreadResult);
            return;
        }
        try {
            Object privateProperty2 = getPrivateProperty(Camera2Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
            CameraManager cameraManager = (CameraManager) getPrivateProperty(Camera2Capturer.class, capturerInfo.capturer, "cameraManager");
            CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "captureSession");
            CameraDevice cameraDevice = (CameraDevice) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraDevice");
            ((Integer) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "fpsUnitFactor")).getClass();
            Surface surface = (Surface) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "surface");
            Handler handler = (Handler) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraThreadHandler");
            try {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraDevice.getId());
                CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
                if (CameraRegionUtils.getControlMaxRegionsAutoExposure(cameraCharacteristics).intValue() <= 0) {
                    resultError("setExposurePoint", "[setExposurePoint] Camera does not support auto exposure", anyThreadResult);
                    return;
                }
                MeteringRectangle convertPointToMeteringRectangle = convertPointToMeteringRectangle(CameraRegionUtils.getCameraBoundaries(cameraCharacteristics, createCaptureRequest), point.x.doubleValue(), point.y.doubleValue(), this.deviceOrientationManager.getLastUIOrientation());
                if (convertPointToMeteringRectangle != null) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{convertPointToMeteringRectangle});
                } else {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_REGIONS;
                    createCaptureRequest.set(key, (MeteringRectangle[]) createCaptureRequest.get(key));
                }
                createCaptureRequest.addTarget(surface);
                cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), null, handler);
                anyThreadResult.success(null);
            } catch (CameraAccessException e2) {
                ny61.j(e2);
            }
        } catch (NoSuchFieldWithNameException e3) {
            StringBuilder sb2 = new StringBuilder("[setExposurePoint] Failed to get `");
            sb2.append(e3.fieldName);
            sb2.append("` from `");
            resultError("setExposurePoint", oyr.t(sb2, e3.className, "`"), anyThreadResult);
        }
    }

    public void setFocusMode(x920 x920Var, AnyThreadResult anyThreadResult) {
        String str = (String) x920Var.a("trackId");
        String str2 = (String) x920Var.a("mode");
        GetUserMediaImpl.VideoCapturerInfoEx capturerInfo = this.getUserMediaImpl.getCapturerInfo(str);
        if (capturerInfo == null) {
            resultError("setFocusMode", g8e.o("Video capturer not found for id: ", str), anyThreadResult);
            return;
        }
        VideoCapturer videoCapturer = capturerInfo.capturer;
        if (!(videoCapturer instanceof Camera2Capturer)) {
            if (videoCapturer instanceof Camera1Capturer) {
                try {
                    Object privateProperty = getPrivateProperty(Camera1Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
                    Camera.Parameters parameters = ((Camera) getPrivateProperty(privateProperty.getClass(), privateProperty, "camera")).getParameters();
                    parameters.setFlashMode(this.isTorchOn ? "torch" : "off");
                    if (!parameters.getSupportedFocusModes().isEmpty()) {
                        str2.getClass();
                        if (str2.equals("locked")) {
                            parameters.setFocusMode("fixed");
                        } else if (str2.equals("auto")) {
                            parameters.setFocusMode("auto");
                        }
                        anyThreadResult.success(null);
                        return;
                    }
                } catch (NoSuchFieldWithNameException e) {
                    StringBuilder sb = new StringBuilder("[FocusMode] Failed to get `");
                    sb.append(e.fieldName);
                    sb.append("` from `");
                    resultError("setFocusMode", oyr.t(sb, e.className, "`"), anyThreadResult);
                    return;
                }
            }
            resultError("setFocusMode", "[FocusMode] Video capturer not compatible", anyThreadResult);
            return;
        }
        try {
            Object privateProperty2 = getPrivateProperty(Camera2Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
            CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "captureSession");
            CameraDevice cameraDevice = (CameraDevice) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraDevice");
            CameraEnumerationAndroid.CaptureFormat captureFormat = (CameraEnumerationAndroid.CaptureFormat) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "captureFormat");
            int intValue = ((Integer) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "fpsUnitFactor")).intValue();
            Surface surface = (Surface) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "surface");
            Handler handler = (Handler) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraThreadHandler");
            try {
                CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
                int hashCode = str2.hashCode();
                if (hashCode != -1097452790) {
                    if (hashCode == 3005871 && str2.equals("auto")) {
                        createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    }
                } else if (str2.equals("locked")) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 1);
                }
                createCaptureRequest.set(CaptureRequest.FLASH_MODE, Integer.valueOf(this.isTorchOn ? 2 : 0));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(captureFormat.framerate.min / intValue), Integer.valueOf(captureFormat.framerate.max / intValue)));
                createCaptureRequest.addTarget(surface);
                cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), null, handler);
                anyThreadResult.success(null);
            } catch (CameraAccessException e2) {
                ny61.j(e2);
            }
        } catch (NoSuchFieldWithNameException e3) {
            StringBuilder sb2 = new StringBuilder("[FocusMode] Failed to get `");
            sb2.append(e3.fieldName);
            sb2.append("` from `");
            resultError("setFocusMode", oyr.t(sb2, e3.className, "`"), anyThreadResult);
        }
    }

    public void setFocusPoint(x920 x920Var, Point point, AnyThreadResult anyThreadResult) {
        String str = (String) x920Var.a("trackId");
        GetUserMediaImpl.VideoCapturerInfoEx capturerInfo = this.getUserMediaImpl.getCapturerInfo(str);
        if (capturerInfo == null) {
            resultError("setFocusMode", g8e.o("Video capturer not found for id: ", str), anyThreadResult);
            return;
        }
        VideoCapturer videoCapturer = capturerInfo.capturer;
        if (!(videoCapturer instanceof Camera2Capturer)) {
            if (!(videoCapturer instanceof Camera1Capturer)) {
                resultError("setFocusMode", "[FocusMode] Video capturer not compatible", anyThreadResult);
                return;
            }
            try {
                Object privateProperty = getPrivateProperty(Camera1Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
                Camera.Parameters parameters = ((Camera) getPrivateProperty(privateProperty.getClass(), privateProperty, "camera")).getParameters();
                parameters.setFlashMode(this.isTorchOn ? "torch" : "off");
                parameters.setFocusAreas(null);
                anyThreadResult.success(null);
                return;
            } catch (NoSuchFieldWithNameException e) {
                StringBuilder sb = new StringBuilder("[FocusMode] Failed to get `");
                sb.append(e.fieldName);
                sb.append("` from `");
                resultError("setFocusMode", oyr.t(sb, e.className, "`"), anyThreadResult);
                return;
            }
        }
        try {
            Object privateProperty2 = getPrivateProperty(Camera2Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
            CameraManager cameraManager = (CameraManager) getPrivateProperty(Camera2Capturer.class, capturerInfo.capturer, "cameraManager");
            CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "captureSession");
            CameraDevice cameraDevice = (CameraDevice) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraDevice");
            ((Integer) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "fpsUnitFactor")).getClass();
            Surface surface = (Surface) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "surface");
            Handler handler = (Handler) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraThreadHandler");
            try {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraDevice.getId());
                CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
                createCaptureRequest.set(CaptureRequest.CONTROL_AF_REGIONS, createCaptureRequest == null ? null : new MeteringRectangle[]{convertPointToMeteringRectangle(CameraRegionUtils.getCameraBoundaries(cameraCharacteristics, createCaptureRequest), point.x.doubleValue(), point.y.doubleValue(), this.deviceOrientationManager.getLastUIOrientation())});
                createCaptureRequest.addTarget(surface);
                cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), null, handler);
                anyThreadResult.success(null);
            } catch (CameraAccessException e2) {
                ny61.j(e2);
            }
        } catch (NoSuchFieldWithNameException e3) {
            StringBuilder sb2 = new StringBuilder("[FocusMode] Failed to get `");
            sb2.append(e3.fieldName);
            sb2.append("` from `");
            resultError("setFocusMode", oyr.t(sb2, e3.className, "`"), anyThreadResult);
        }
    }

    public void setTorch(String str, boolean z, da20 da20Var) {
        GetUserMediaImpl.VideoCapturerInfoEx capturerInfo = this.getUserMediaImpl.getCapturerInfo(str);
        if (capturerInfo == null) {
            resultError("setTorch", g8e.o("Video capturer not found for id: ", str), da20Var);
            return;
        }
        VideoCapturer videoCapturer = capturerInfo.capturer;
        if (!(videoCapturer instanceof Camera2Capturer)) {
            if (!(videoCapturer instanceof Camera1Capturer)) {
                resultError("setTorch", "[TORCH] Video capturer not compatible", da20Var);
                return;
            }
            try {
                Object privateProperty = getPrivateProperty(Camera1Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
                Camera camera = (Camera) getPrivateProperty(privateProperty.getClass(), privateProperty, "camera");
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFlashMode(z ? "torch" : "off");
                camera.setParameters(parameters);
                da20Var.success(null);
                this.isTorchOn = z;
                return;
            } catch (NoSuchFieldWithNameException e) {
                StringBuilder sb = new StringBuilder("[TORCH] Failed to get `");
                sb.append(e.fieldName);
                sb.append("` from `");
                resultError("setTorch", oyr.t(sb, e.className, "`"), da20Var);
                return;
            }
        }
        try {
            Object privateProperty2 = getPrivateProperty(Camera2Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
            CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "captureSession");
            CameraDevice cameraDevice = (CameraDevice) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraDevice");
            CameraEnumerationAndroid.CaptureFormat captureFormat = (CameraEnumerationAndroid.CaptureFormat) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "captureFormat");
            int intValue = ((Integer) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "fpsUnitFactor")).intValue();
            Surface surface = (Surface) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "surface");
            Handler handler = (Handler) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraThreadHandler");
            try {
                CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
                createCaptureRequest.set(CaptureRequest.FLASH_MODE, Integer.valueOf(z ? 2 : 0));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(captureFormat.framerate.min / intValue), Integer.valueOf(captureFormat.framerate.max / intValue)));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
                createCaptureRequest.addTarget(surface);
                cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), null, handler);
                da20Var.success(null);
                this.isTorchOn = z;
            } catch (CameraAccessException e2) {
                ny61.j(e2);
            }
        } catch (NoSuchFieldWithNameException e3) {
            StringBuilder sb2 = new StringBuilder("[TORCH] Failed to get `");
            sb2.append(e3.fieldName);
            sb2.append("` from `");
            resultError("setTorch", oyr.t(sb2, e3.className, "`"), da20Var);
        }
    }

    public void setZoom(String str, double d, da20 da20Var) {
        GetUserMediaImpl.VideoCapturerInfoEx capturerInfo = this.getUserMediaImpl.getCapturerInfo(str);
        if (capturerInfo == null) {
            resultError("setZoom", g8e.o("Video capturer not found for id: ", str), da20Var);
            return;
        }
        VideoCapturer videoCapturer = capturerInfo.capturer;
        if (!(videoCapturer instanceof Camera2Capturer)) {
            if (videoCapturer instanceof Camera1Capturer) {
                try {
                    Object privateProperty = getPrivateProperty(Camera1Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
                    Camera.Parameters parameters = ((Camera) getPrivateProperty(privateProperty.getClass(), privateProperty, "camera")).getParameters();
                    parameters.setFlashMode(this.isTorchOn ? "torch" : "off");
                    if (parameters.isZoomSupported()) {
                        parameters.setZoom((int) Math.max(0.0d, Math.min(d, parameters.getMaxZoom())));
                        da20Var.success(null);
                        return;
                    }
                } catch (NoSuchFieldWithNameException e) {
                    StringBuilder sb = new StringBuilder("[ZOOM] Failed to get `");
                    sb.append(e.fieldName);
                    sb.append("` from `");
                    resultError("setZoom", oyr.t(sb, e.className, "`"), da20Var);
                    return;
                }
            }
            resultError("setZoom", "[ZOOM] Video capturer not compatible", da20Var);
            return;
        }
        try {
            Object privateProperty2 = getPrivateProperty(Camera2Capturer.class.getSuperclass(), capturerInfo.capturer, "currentSession");
            CameraManager cameraManager = (CameraManager) getPrivateProperty(Camera2Capturer.class, capturerInfo.capturer, "cameraManager");
            CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "captureSession");
            CameraDevice cameraDevice = (CameraDevice) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraDevice");
            CameraEnumerationAndroid.CaptureFormat captureFormat = (CameraEnumerationAndroid.CaptureFormat) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "captureFormat");
            int intValue = ((Integer) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "fpsUnitFactor")).intValue();
            Surface surface = (Surface) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "surface");
            Handler handler = (Handler) getPrivateProperty(privateProperty2.getClass(), privateProperty2, "cameraThreadHandler");
            try {
                CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
                Rect rect = (Rect) cameraManager.getCameraCharacteristics(cameraDevice.getId()).get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                float max = 1.0f / ((float) Math.max(1.0d, Math.min(d, ((Float) r5.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue())));
                int i = 2;
                if (rect != null) {
                    int width = rect.width() - Math.round(rect.width() * max);
                    int height = rect.height() - Math.round(rect.height() * max);
                    createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, new Rect(width / 2, height / 2, rect.width() - (width / 2), rect.height() - (height / 2)));
                }
                CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
                if (!this.isTorchOn) {
                    i = 0;
                }
                createCaptureRequest.set(key, Integer.valueOf(i));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(captureFormat.framerate.min / intValue), Integer.valueOf(captureFormat.framerate.max / intValue)));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
                createCaptureRequest.addTarget(surface);
                cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), null, handler);
                da20Var.success(null);
            } catch (CameraAccessException e2) {
                ny61.j(e2);
            }
        } catch (NoSuchFieldWithNameException e3) {
            StringBuilder sb2 = new StringBuilder("[ZOOM] Failed to get `");
            sb2.append(e3.fieldName);
            sb2.append("` from `");
            resultError("setZoom", oyr.t(sb2, e3.className, "`"), da20Var);
        }
    }
}
