package xsna;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: FocusContinuousManager.java */
/* loaded from: classes13.dex */
public final class hvr implements Runnable, SensorEventListener {
    public SensorManager b;
    public Sensor c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    public zd9 h;

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.c.getType() == 1) {
            zd9 zd9Var = this.h;
            if (zd9Var.o && zd9Var.m != null && zd9Var.m()) {
                float[] fArr = sensorEvent.values;
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                this.e = this.d;
                float f4 = f3 * f3;
                float sqrt = (float) Math.sqrt(f4 + (f2 * f2) + (f * f));
                this.d = sqrt;
                float f5 = (this.f * 0.9f) + (sqrt - this.e);
                this.f = f5;
                if (f5 > 0.3f) {
                    this.g = true;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        jhu0 jhu0Var;
        int i;
        jhu0 jhu0Var2;
        zd9 zd9Var = this.h;
        if (!zd9Var.o || zd9Var.m == null || !zd9Var.m()) {
            zd9 zd9Var2 = this.h;
            if (!zd9Var2.o || (jhu0Var = zd9Var2.m) == null) {
                return;
            }
            jhu0Var.i(zd9Var2);
            return;
        }
        if (this.g) {
            zd9 zd9Var3 = this.h;
            if (zd9Var3.o && (jhu0Var2 = zd9Var3.m) != null) {
                jhu0Var2.i(zd9Var3);
            }
        }
        if (this.c != null) {
            this.g = false;
            i = 1500;
        } else {
            i = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        }
        i0q0.d(i, this);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
