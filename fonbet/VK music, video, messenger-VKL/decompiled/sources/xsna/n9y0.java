package xsna;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.o9y0;

/* compiled from: AndroidSensorListener.kt */
/* loaded from: classes2.dex */
public final class n9y0<T extends o9y0> implements SensorEventListener {
    public final int c;
    public final FunctionReferenceImpl d;
    public final SensorManager f;
    public final Sensor g;
    public final poy0 b = (poy0) afy0.a.getValue();
    public izs<? super T, s3q0> e = weh0.k;

    /* JADX WARN: Multi-variable type inference failed */
    public n9y0(int i, Context context, izs izsVar) {
        this.c = i;
        this.d = (FunctionReferenceImpl) izsVar;
        Object systemService = context.getSystemService("sensor");
        SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
        this.f = sensorManager;
        this.g = sensorManager != null ? sensorManager.getDefaultSensor(i) : null;
    }

    public final void a() {
        SensorManager sensorManager = this.f;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        poy0 poy0Var = (poy0) afy0.a.getValue();
        if (poy0Var.b == null) {
            poy0Var.c.decrementAndGet();
            return;
        }
        synchronized (poy0Var) {
            try {
                if (poy0Var.c.decrementAndGet() == 0) {
                    HandlerThread handlerThread = poy0Var.b;
                    if (handlerThread != null) {
                        handlerThread.quit();
                    }
                    poy0Var.b = null;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        SensorManager sensorManager;
        Sensor sensor = this.g;
        if (sensor == null || (sensorManager = this.f) == null) {
            return;
        }
        sensorManager.registerListener(this, sensor, i * 1000, new Handler(this.b.a().getLooper()));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor;
        if (sensorEvent == null || (sensor = sensorEvent.sensor) == null || sensor.getType() != this.c) {
            return;
        }
        this.e.invoke((o9y0) this.d.invoke(sensorEvent.values));
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
