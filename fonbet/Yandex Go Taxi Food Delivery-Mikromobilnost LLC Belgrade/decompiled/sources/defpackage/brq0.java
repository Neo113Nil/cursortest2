package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager;
import defpackage.brq0;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.in_app_calls.calls.SensorStreamHandler$createSensorEventListener$1;

/* loaded from: classes7.dex */
public final class brq0 implements zeo {
    public final SensorManager a;
    public SensorStreamHandler$createSensorEventListener$1 b;
    public final PowerManager.WakeLock c;
    public boolean w;

    public brq0(SensorManager sensorManager, PowerManager powerManager) {
        int i;
        this.a = sensorManager;
        if (powerManager != null) {
            try {
                i = PowerManager.class.getField("PROXIMITY_SCREEN_OFF_WAKE_LOCK").getInt(null);
            } catch (Exception unused) {
                i = 32;
            }
            this.c = powerManager.newWakeLock(i, "AllSensors::Wakelock");
        }
    }

    @Override // defpackage.zeo
    public final void onCancel(Object obj) {
        this.w = true;
        SensorStreamHandler$createSensorEventListener$1 sensorStreamHandler$createSensorEventListener$1 = this.b;
        if (sensorStreamHandler$createSensorEventListener$1 != null) {
            this.a.unregisterListener(sensorStreamHandler$createSensorEventListener$1);
        }
        PowerManager.WakeLock wakeLock = this.c;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        wakeLock.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.hardware.SensorEventListener, ru.yandex.in_app_calls.calls.SensorStreamHandler$createSensorEventListener$1] */
    @Override // defpackage.zeo
    public final void onListen(Object obj, final xeo xeoVar) {
        this.w = false;
        ?? r2 = new SensorEventListener() { // from class: ru.yandex.in_app_calls.calls.SensorStreamHandler$createSensorEventListener$1
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int accuracy) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent event) {
                if (brq0.this.w) {
                    return;
                }
                float[] fArr = event.values;
                ArrayList arrayList = new ArrayList(fArr.length);
                for (float f : fArr) {
                    arrayList.add(Double.valueOf(f));
                }
                double[] dArr = new double[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    dArr[i] = ((Number) it.next()).doubleValue();
                    i++;
                }
                if (event.sensor.getType() == 8) {
                    brq0 brq0Var = brq0.this;
                    double d = dArr[0];
                    PowerManager.WakeLock wakeLock = brq0Var.c;
                    if (d == 0.0d) {
                        if (wakeLock != null) {
                            try {
                                if (wakeLock.isHeld()) {
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (wakeLock != null) {
                            wakeLock.acquire();
                        }
                    }
                    if (d != 0.0d && wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                }
                xeoVar.success(dArr);
            }
        };
        this.b = r2;
        SensorManager sensorManager = this.a;
        sensorManager.registerListener((SensorEventListener) r2, sensorManager.getDefaultSensor(8), 3);
    }
}
