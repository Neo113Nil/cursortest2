package xsna;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: RxSensors.kt */
/* loaded from: classes17.dex */
public final class uvg0 {
    public static final bpn0 a = new bpn0(new zo80(5));

    public static final boolean a(int i, Context context) {
        Object systemService = context.getSystemService("sensor");
        SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
        return (sensorManager == null || sensorManager.getDefaultSensor(i) == null) ? false : true;
    }

    public static final <D> io.reactivex.rxjava3.core.g<D> b(Context context, int i, int i2, izs<? super SensorEvent, ? extends D> izsVar) {
        Object systemService = context.getSystemService("sensor");
        SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
        if (sensorManager == null) {
            int i3 = io.reactivex.rxjava3.core.g.b;
            return io.reactivex.rxjava3.internal.operators.flowable.p.c;
        }
        pvg0 pvg0Var = new pvg0(sensorManager, i, i2, izsVar);
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.MISSING;
        int i4 = io.reactivex.rxjava3.core.g.b;
        Objects.requireNonNull(backpressureStrategy, "mode is null");
        return new io.reactivex.rxjava3.internal.operators.flowable.j(pvg0Var, backpressureStrategy).o(i2, TimeUnit.MICROSECONDS);
    }

    /* compiled from: RxSensors.kt */
    public static final class a implements SensorEventListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ izs<SensorEvent, D> c;
        public final /* synthetic */ io.reactivex.rxjava3.core.h<D> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, izs<? super SensorEvent, ? extends D> izsVar, io.reactivex.rxjava3.core.h<D> hVar) {
            this.b = i;
            this.c = izsVar;
            this.d = hVar;
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Sensor sensor;
            Object invoke;
            if (sensorEvent == null || (sensor = sensorEvent.sensor) == null || sensor.getType() != this.b || (invoke = this.c.invoke(sensorEvent)) == null) {
                return;
            }
            this.d.onNext(invoke);
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }
    }
}
