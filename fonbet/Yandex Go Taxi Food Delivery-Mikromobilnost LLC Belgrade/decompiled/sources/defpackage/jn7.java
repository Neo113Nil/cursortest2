package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.b;
import androidx.camera.core.impl.CameraCaptureMetaData$AeMode;
import androidx.camera.core.impl.CameraCaptureMetaData$AfMode;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbMode;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class jn7 {
    public final b a;
    public final w7o b;
    public final boolean c;
    public final a73 d;
    public final androidx.camera.core.impl.utils.executor.b e;
    public final k6u f;
    public final boolean g;
    public int h = 1;

    public jn7(b bVar, ep7 ep7Var, a73 a73Var, androidx.camera.core.impl.utils.executor.b bVar2, k6u k6uVar) {
        this.a = bVar;
        Integer num = (Integer) ep7Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.g = num != null && num.intValue() == 2;
        this.e = bVar2;
        this.f = k6uVar;
        this.d = a73Var;
        this.b = new w7o(a73Var, 4);
        this.c = dpa1.d(new qm7(ep7Var, 1));
    }

    public static boolean b(TotalCaptureResult totalCaptureResult, boolean z) {
        CameraCaptureMetaData$AfMode cameraCaptureMetaData$AfMode;
        CameraCaptureMetaData$AeMode cameraCaptureMetaData$AeMode;
        CameraCaptureMetaData$AwbMode cameraCaptureMetaData$AwbMode;
        if (totalCaptureResult != null) {
            c06 c06Var = new c06((CaptureResult) totalCaptureResult);
            Set set = tme.a;
            Integer num = (Integer) ((CaptureResult) c06Var.b).get(CaptureResult.CONTROL_AF_MODE);
            if (num == null) {
                cameraCaptureMetaData$AfMode = CameraCaptureMetaData$AfMode.UNKNOWN;
            } else {
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue == 1 || intValue == 2) {
                        cameraCaptureMetaData$AfMode = CameraCaptureMetaData$AfMode.ON_MANUAL_AUTO;
                    } else if (intValue == 3 || intValue == 4) {
                        cameraCaptureMetaData$AfMode = CameraCaptureMetaData$AfMode.ON_CONTINUOUS_AUTO;
                    } else if (intValue != 5) {
                        sgb1.d("C2CameraCaptureResult", "Undefined af mode: " + num);
                        cameraCaptureMetaData$AfMode = CameraCaptureMetaData$AfMode.UNKNOWN;
                    }
                }
                cameraCaptureMetaData$AfMode = CameraCaptureMetaData$AfMode.OFF;
            }
            boolean z2 = cameraCaptureMetaData$AfMode == CameraCaptureMetaData$AfMode.OFF || tme.a.contains(c06Var.f());
            Integer num2 = (Integer) ((CaptureResult) c06Var.b).get(CaptureResult.CONTROL_AE_MODE);
            if (num2 == null) {
                cameraCaptureMetaData$AeMode = CameraCaptureMetaData$AeMode.UNKNOWN;
            } else {
                int intValue2 = num2.intValue();
                cameraCaptureMetaData$AeMode = intValue2 != 0 ? intValue2 != 1 ? intValue2 != 2 ? intValue2 != 3 ? intValue2 != 4 ? intValue2 != 5 ? CameraCaptureMetaData$AeMode.UNKNOWN : CameraCaptureMetaData$AeMode.ON_EXTERNAL_FLASH : CameraCaptureMetaData$AeMode.ON_AUTO_FLASH_REDEYE : CameraCaptureMetaData$AeMode.ON_ALWAYS_FLASH : CameraCaptureMetaData$AeMode.ON_AUTO_FLASH : CameraCaptureMetaData$AeMode.ON : CameraCaptureMetaData$AeMode.OFF;
            }
            boolean z3 = cameraCaptureMetaData$AeMode == CameraCaptureMetaData$AeMode.OFF;
            boolean z4 = !z ? !(z3 || tme.c.contains(c06Var.l())) : !(z3 || tme.d.contains(c06Var.l()));
            Integer num3 = (Integer) ((CaptureResult) c06Var.b).get(CaptureResult.CONTROL_AWB_MODE);
            if (num3 != null) {
                switch (num3.intValue()) {
                    case 0:
                        cameraCaptureMetaData$AwbMode = CameraCaptureMetaData$AwbMode.OFF;
                        break;
                    case 1:
                        cameraCaptureMetaData$AwbMode = CameraCaptureMetaData$AwbMode.AUTO;
                        break;
                    case 2:
                        cameraCaptureMetaData$AwbMode = CameraCaptureMetaData$AwbMode.INCANDESCENT;
                        break;
                    case 3:
                        cameraCaptureMetaData$AwbMode = CameraCaptureMetaData$AwbMode.FLUORESCENT;
                        break;
                    case 4:
                        cameraCaptureMetaData$AwbMode = CameraCaptureMetaData$AwbMode.WARM_FLUORESCENT;
                        break;
                    case 5:
                        cameraCaptureMetaData$AwbMode = CameraCaptureMetaData$AwbMode.DAYLIGHT;
                        break;
                    case 6:
                        cameraCaptureMetaData$AwbMode = CameraCaptureMetaData$AwbMode.CLOUDY_DAYLIGHT;
                        break;
                    case 7:
                        cameraCaptureMetaData$AwbMode = CameraCaptureMetaData$AwbMode.TWILIGHT;
                        break;
                    case 8:
                        cameraCaptureMetaData$AwbMode = CameraCaptureMetaData$AwbMode.SHADE;
                        break;
                    default:
                        cameraCaptureMetaData$AwbMode = CameraCaptureMetaData$AwbMode.UNKNOWN;
                        break;
                }
            } else {
                cameraCaptureMetaData$AwbMode = CameraCaptureMetaData$AwbMode.UNKNOWN;
            }
            boolean z5 = cameraCaptureMetaData$AwbMode == CameraCaptureMetaData$AwbMode.OFF || tme.b.contains(c06Var.i());
            Objects.toString(c06Var.l());
            Objects.toString(c06Var.f());
            Objects.toString(c06Var.i());
            sgb1.g(3, "ConvergenceUtils");
            if (z2 && z4 && z5) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(TotalCaptureResult totalCaptureResult, int i) {
        sgb1.g(3, "Camera2CapturePipeline");
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            sgb1.g(3, "Camera2CapturePipeline");
            return num != null && num.intValue() == 4;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r3 > 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final an7 a(int i, int i2, int i3) {
        a73 a73Var = this.d;
        zy2 zy2Var = new zy2(a73Var, 2);
        int i4 = this.h;
        k6u k6uVar = this.f;
        boolean z = this.g;
        androidx.camera.core.impl.utils.executor.b bVar = this.e;
        b bVar2 = this.a;
        an7 an7Var = new an7(i4, bVar, k6uVar, bVar2, z, zy2Var);
        ArrayList arrayList = an7Var.h;
        if (i == 0) {
            arrayList.add(new um7(bVar2));
        }
        if (i2 == 3) {
            arrayList.add(new gn7(bVar2, this.e, this.f, new eg01(a73Var)));
        } else if (this.c) {
            boolean z2 = this.b.a;
            boolean z3 = true;
            if (z2 || this.h == 3 || i3 == 1) {
                if (!z2) {
                    int i5 = ((AtomicInteger) bVar2.p.b).get();
                    sgb1.g(3, "Camera2CameraControlImp");
                }
                z3 = false;
                arrayList.add(new in7(bVar2, i2, this.e, this.f, z3));
            } else {
                arrayList.add(new tm7(bVar2, i2, zy2Var));
            }
        }
        Objects.toString(arrayList);
        sgb1.g(3, "Camera2CapturePipeline");
        return an7Var;
    }
}
