package xsna;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: DeviceOrientationDetector.java */
/* loaded from: classes3.dex */
public final class i6m implements SensorEventListener {
    public final SensorManager b;
    public final float[] c = new float[16];
    public final float[] d = new float[16];
    public final float[] e = new float[16];

    public i6m(SensorManager sensorManager) {
        this.b = sensorManager;
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(15), 1);
    }

    public static boolean b(SensorManager sensorManager) {
        return sensorManager.getDefaultSensor(15) != null;
    }

    public final float[] a(int i) {
        Matrix.setIdentityM(this.d, 0);
        Matrix.rotateM(this.d, 0, i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        Matrix.multiplyMM(this.e, 0, this.d, 0, this.c, 0);
        return this.e;
    }

    public final void c() {
        this.b.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.c, sensorEvent.values);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
