package xsna;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfMode;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import androidx.camera.core.impl.utils.ExifData;
import com.facebook.soloader.MinElf;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: Camera2CameraCaptureResult.java */
/* loaded from: classes11.dex */
public final class he9 implements androidx.camera.core.impl.c {
    public final d0o0 a;
    public final CaptureResult b;

    public he9(@NonNull d0o0 d0o0Var, @NonNull TotalCaptureResult totalCaptureResult) {
        this.a = d0o0Var;
        this.b = totalCaptureResult;
    }

    @Override // androidx.camera.core.impl.c
    public final void a(@NonNull ExifData.b bVar) {
        super.a(bVar);
        ArrayList arrayList = bVar.a;
        CaptureResult.Key key = CaptureResult.SCALER_CROP_REGION;
        CaptureResult captureResult = this.b;
        Rect rect = (Rect) captureResult.get(key);
        if (rect != null) {
            bVar.c("ImageWidth", String.valueOf(rect.width()), arrayList);
            bVar.c("ImageLength", String.valueOf(rect.height()), arrayList);
        }
        Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
        if (num != null) {
            bVar.d(num.intValue());
        }
        if (((Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME)) != null) {
            bVar.c("ExposureTime", String.valueOf(r1.longValue() / TimeUnit.SECONDS.toNanos(1L)), arrayList);
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            bVar.c("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        Integer num2 = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (((Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (r3.intValue() / 100.0f)));
            }
            int intValue = num2.intValue();
            bVar.c("SensitivityType", String.valueOf(3), arrayList);
            bVar.c("PhotographicSensitivity", String.valueOf(Math.min(MinElf.PN_XNUM, intValue)), arrayList);
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            bVar.c("FocalLength", ((long) (f2.floatValue() * 1000.0f)) + "/1000", arrayList);
        }
        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            ExifData.WhiteBalanceMode whiteBalanceMode = ExifData.WhiteBalanceMode.AUTO;
            if (num3.intValue() == 0) {
                whiteBalanceMode = ExifData.WhiteBalanceMode.MANUAL;
            }
            int i = ExifData.a.b[whiteBalanceMode.ordinal()];
            bVar.c("WhiteBalance", i != 1 ? i != 2 ? null : String.valueOf(1) : String.valueOf(0), arrayList);
        }
    }

    @Override // androidx.camera.core.impl.c
    @NonNull
    public final CameraCaptureMetaData$FlashState b() {
        Integer num = (Integer) this.b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return CameraCaptureMetaData$FlashState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return CameraCaptureMetaData$FlashState.NONE;
        }
        if (intValue == 2) {
            return CameraCaptureMetaData$FlashState.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return CameraCaptureMetaData$FlashState.FIRED;
        }
        s100.a("C2CameraCaptureResult", "Undefined flash state: " + num, null);
        return CameraCaptureMetaData$FlashState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.c
    @NonNull
    public final CameraCaptureMetaData$AfState c() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AfState.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
            case 6:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                s100.a("C2CameraCaptureResult", "Undefined af state: " + num, null);
                break;
        }
        return CameraCaptureMetaData$AfState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.c
    @NonNull
    public final CameraCaptureMetaData$AfMode d() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return CameraCaptureMetaData$AfMode.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return CameraCaptureMetaData$AfMode.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return CameraCaptureMetaData$AfMode.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                s100.a("C2CameraCaptureResult", "Undefined af mode: " + num, null);
                return CameraCaptureMetaData$AfMode.UNKNOWN;
            }
        }
        return CameraCaptureMetaData$AfMode.OFF;
    }

    @Override // androidx.camera.core.impl.c
    @NonNull
    public final CameraCaptureMetaData$AeState e() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AeState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return CameraCaptureMetaData$AeState.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return CameraCaptureMetaData$AeState.CONVERGED;
            }
            if (intValue == 3) {
                return CameraCaptureMetaData$AeState.LOCKED;
            }
            if (intValue == 4) {
                return CameraCaptureMetaData$AeState.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                s100.a("C2CameraCaptureResult", "Undefined ae state: " + num, null);
                return CameraCaptureMetaData$AeState.UNKNOWN;
            }
        }
        return CameraCaptureMetaData$AeState.SEARCHING;
    }

    public final long f() {
        Long l = (Long) this.b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }
}
