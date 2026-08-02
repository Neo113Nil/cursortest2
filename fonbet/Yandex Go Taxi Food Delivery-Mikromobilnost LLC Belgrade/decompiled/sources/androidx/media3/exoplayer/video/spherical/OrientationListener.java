package androidx.media3.exoplayer.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import defpackage.hfs;
import defpackage.mq80;
import defpackage.ny61;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
final class OrientationListener implements SensorEventListener {
    private final Display display;
    private final mq80[] listeners;
    private boolean recenterMatrixComputed;
    private final float[] deviceOrientationMatrix4x4 = new float[16];
    private final float[] tempMatrix4x4 = new float[16];
    private final float[] recenterMatrix4x4 = new float[16];
    private final float[] angles = new float[3];

    public OrientationListener(Display display, mq80... mq80VarArr) {
        this.display = display;
        this.listeners = mq80VarArr;
    }

    private float extractRoll(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, HProv.PP_FAST_CODE, this.tempMatrix4x4);
        SensorManager.getOrientation(this.tempMatrix4x4, this.angles);
        return this.angles[2];
    }

    private void notifyListeners(float[] fArr, float f) {
        for (mq80 mq80Var : this.listeners) {
            mq80Var.onOrientationChange(fArr, f);
        }
    }

    private void recenter(float[] fArr) {
        if (!this.recenterMatrixComputed) {
            hfs.a(this.recenterMatrix4x4, fArr);
            this.recenterMatrixComputed = true;
        }
        float[] fArr2 = this.tempMatrix4x4;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.tempMatrix4x4, 0, this.recenterMatrix4x4, 0);
    }

    private void rotateAroundZ(float[] fArr, int i) {
        if (i != 0) {
            int i2 = HProv.PP_SECURITY_LEVEL;
            int i3 = 1;
            if (i == 1) {
                i3 = 129;
                i2 = 2;
            } else if (i == 2) {
                i3 = 130;
            } else {
                if (i != 3) {
                    ny61.k();
                    return;
                }
                i2 = 130;
            }
            float[] fArr2 = this.tempMatrix4x4;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.tempMatrix4x4, i2, i3, fArr);
        }
    }

    private static void rotateYtoSky(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.deviceOrientationMatrix4x4, sensorEvent.values);
        rotateAroundZ(this.deviceOrientationMatrix4x4, this.display.getRotation());
        float extractRoll = extractRoll(this.deviceOrientationMatrix4x4);
        rotateYtoSky(this.deviceOrientationMatrix4x4);
        recenter(this.deviceOrientationMatrix4x4);
        notifyListeners(this.deviceOrientationMatrix4x4, extractRoll);
    }
}
