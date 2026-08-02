package xsna;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;

/* compiled from: RotationSensorEventProvider.kt */
/* loaded from: classes17.dex */
public final class gng0 implements SensorEventListener {
    public static final gng0 b = new gng0();
    public static final fng0 c = new fng0();
    public static final ArrayList<hng0> d = new ArrayList<>();
    public static final ArrayList<hng0> e = new ArrayList<>();
    public static float f;
    public static float g;

    /* JADX WARN: Removed duplicated region for block: B:5:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007f  */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSensorChanged(SensorEvent sensorEvent) {
        fng0 fng0Var = c;
        float[] fArr = fng0Var.b;
        float[] fArr2 = fng0Var.d;
        float[] fArr3 = fng0Var.a;
        float[] fArr4 = fng0Var.c;
        if (sensorEvent != null) {
            float[] fArr5 = sensorEvent.values;
            if (fArr5.length > 4) {
                if (fng0Var.e == null) {
                    fng0Var.e = new float[4];
                }
                System.arraycopy(fArr5, 0, fng0Var.e, 0, 4);
                fArr5 = fng0Var.e;
            }
            if (fng0Var.g) {
                SensorManager.getRotationMatrixFromVector(fArr4, fArr5);
                int i = fng0Var.f;
                if (i == 0) {
                    SensorManager.getAngleChange(fArr3, fArr4, fArr);
                } else {
                    if (i == 1) {
                        SensorManager.remapCoordinateSystem(fArr4, 2, 129, fArr2);
                    } else if (i == 2) {
                        SensorManager.remapCoordinateSystem(fArr4, 129, 130, fArr2);
                    } else if (i == 3) {
                        SensorManager.remapCoordinateSystem(fArr4, 130, 1, fArr2);
                    }
                    SensorManager.getAngleChange(fArr3, fArr2, fArr);
                }
                int length = fArr3.length;
                for (int i2 = 0; i2 < length; i2++) {
                    float f2 = fArr3[i2] / 3.1415927f;
                    fArr3[i2] = f2;
                    float f3 = f2 * 2.0f;
                    fArr3[i2] = f3;
                    if (f3 > 1.0f) {
                        fArr3[i2] = 1.0f;
                    } else if (f3 < -1.0f) {
                        fArr3[i2] = -1.0f;
                    }
                }
                if (fArr3 != null) {
                    return;
                }
                float f4 = fArr3[2];
                float f5 = -fArr3[1];
                ArrayList<hng0> arrayList = d;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.get(i3).h4(f4, f5);
                }
                ArrayList<hng0> arrayList2 = e;
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList2.get(i4).A1(f4 - f, f5 - g);
                }
                f = f4;
                g = f5;
                return;
            }
            SensorManager.getRotationMatrixFromVector(fArr, fArr5);
            fng0Var.g = true;
        }
        fArr3 = null;
        if (fArr3 != null) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
