package com.cloudwebrtc.webrtc.video.camera;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Size;
import defpackage.ts7;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class CameraRegionUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: com.cloudwebrtc.webrtc.video.camera.CameraRegionUtils$1, reason: invalid class name */
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

    public static class SizeFactory {
        public static Size create(int i, int i2) {
            return new Size(i, i2);
        }
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

    public static Size getCameraBoundaries(CameraCharacteristics cameraCharacteristics, CaptureRequest.Builder builder) {
        if (!SdkCapabilityChecker.supportsDistortionCorrection() || !supportsDistortionCorrection(cameraCharacteristics)) {
            return getSensorInfoPixelArraySize(cameraCharacteristics);
        }
        Integer num = (Integer) builder.get(CaptureRequest.DISTORTION_CORRECTION_MODE);
        Rect sensorInfoPreCorrectionActiveArraySize = (num == null || num.intValue() == 0) ? getSensorInfoPreCorrectionActiveArraySize(cameraCharacteristics) : getSensorInfoActiveArraySize(cameraCharacteristics);
        return SizeFactory.create(sensorInfoPreCorrectionActiveArraySize.width(), sensorInfoPreCorrectionActiveArraySize.height());
    }

    public static Integer getControlMaxRegionsAutoExposure(CameraCharacteristics cameraCharacteristics) {
        return (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
    }

    public static int[] getDistortionCorrectionAvailableModes(CameraCharacteristics cameraCharacteristics) {
        return (int[]) cameraCharacteristics.get(CameraCharacteristics.DISTORTION_CORRECTION_AVAILABLE_MODES);
    }

    public static Rect getSensorInfoActiveArraySize(CameraCharacteristics cameraCharacteristics) {
        return (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    public static Size getSensorInfoPixelArraySize(CameraCharacteristics cameraCharacteristics) {
        return (Size) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
    }

    public static Rect getSensorInfoPreCorrectionActiveArraySize(CameraCharacteristics cameraCharacteristics) {
        return (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$supportsDistortionCorrection$0(int i) {
        return i != 0;
    }

    private static boolean supportsDistortionCorrection(CameraCharacteristics cameraCharacteristics) {
        int[] distortionCorrectionAvailableModes = getDistortionCorrectionAvailableModes(cameraCharacteristics);
        if (distortionCorrectionAvailableModes == null) {
            distortionCorrectionAvailableModes = new int[0];
        }
        return Arrays.stream(distortionCorrectionAvailableModes).filter(new ts7()).count() > 0;
    }
}
