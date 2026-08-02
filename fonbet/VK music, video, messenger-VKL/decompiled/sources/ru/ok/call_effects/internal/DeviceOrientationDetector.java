package ru.ok.call_effects.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes9.dex */
public class DeviceOrientationDetector implements SensorEventListener {
    private SensorManager mSensorManager;
    private float[] rotationMatrix = new float[16];
    private float[] m1 = new float[16];
    private float[] m2 = new float[16];

    public DeviceOrientationDetector(SensorManager sensorManager) {
        this.mSensorManager = sensorManager;
        this.mSensorManager.registerListener(this, sensorManager.getDefaultSensor(15), 1);
    }

    public static boolean isSupportSensor(Context context) {
        return ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(15) != null;
    }

    public float[] getRotationMatrix(int i) {
        Matrix.setIdentityM(this.m1, 0);
        Matrix.rotateM(this.m1, 0, i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        Matrix.multiplyMM(this.m2, 0, this.m1, 0, this.rotationMatrix, 0);
        return this.m2;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.rotationMatrix, sensorEvent.values);
    }

    public void release() {
        this.mSensorManager.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
