package xsna;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: OrientationListener.java */
/* loaded from: classes12.dex */
public final class wy80 implements SensorEventListener {
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] d = new float[16];
    public final float[] e = new float[3];
    public final Display f;
    public final a[] g;
    public boolean h;

    /* compiled from: OrientationListener.java */
    public interface a {
        void d(float[] fArr, float f);
    }

    public wy80(Display display, a... aVarArr) {
        this.f = display;
        this.g = aVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.b;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f.getRotation();
        float[] fArr3 = this.c;
        if (rotation != 0) {
            int i2 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i2 = 130;
                    i = 1;
                }
            } else {
                i = 129;
                i2 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i2, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, fArr3);
        float[] fArr4 = this.e;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        boolean z = this.h;
        float[] fArr5 = this.d;
        if (!z) {
            cgs.a(fArr5, fArr2);
            this.h = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (int i3 = 0; i3 < 2; i3++) {
            this.g[i3].d(fArr2, f);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
