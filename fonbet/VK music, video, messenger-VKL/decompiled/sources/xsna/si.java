package xsna;

import android.graphics.PointF;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: AccelerometerController.kt */
/* loaded from: classes3.dex */
public final class si implements SensorEventListener {
    public long b = System.currentTimeMillis();
    public final /* synthetic */ ti c;

    public si(ti tiVar) {
        this.c = tiVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (System.currentTimeMillis() - this.b < 50) {
            return;
        }
        this.b = System.currentTimeMillis();
        ti tiVar = this.c;
        PointF pointF = new PointF(ti.a(tiVar, tiVar.d.x, -sensorEvent.values[0], 0.001f), ti.a(tiVar, tiVar.d.y, sensorEvent.values[1], 0.01f));
        tiVar.d = pointF;
        tiVar.b.invoke(pointF);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
