package xsna;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.vk.log.L;
import ru.ok.android.externcalls.sdk.audio.ProximityTracker;

/* compiled from: ProximityManager.kt */
/* loaded from: classes7.dex */
public final class i9e0 implements SensorEventListener, ProximityTracker {
    public final Context b;
    public final bpn0 c = new bpn0(new ye80(this, 10));
    public final bpn0 d = new bpn0(new akd0(this, 3));
    public boolean e;
    public boolean f;

    public i9e0(Context context) {
        this.b = context;
    }

    public final boolean a() {
        return this.f;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.ProximityTracker
    public final boolean getCanUseSpeaker() {
        return this.f || !this.e;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        boolean z = false;
        float f = sensorEvent.values[0];
        bpn0 bpn0Var = this.d;
        if (f < 5.0f) {
            Sensor sensor = (Sensor) bpn0Var.getValue();
            if (!epx.a(f, sensor != null ? Float.valueOf(sensor.getMaximumRange()) : null)) {
                z = true;
            }
        }
        boolean z2 = !z;
        if (z2 != this.f) {
            this.f = z2;
        }
        StringBuilder sb = new StringBuilder("onSensorChanged(distance=");
        sb.append(f);
        sb.append(", maximumRange=");
        Sensor sensor2 = (Sensor) bpn0Var.getValue();
        L.A("ProximityManager", so.b(sb, sensor2 != null ? Float.valueOf(sensor2.getMaximumRange()) : null, ')'));
    }

    @Override // ru.ok.android.externcalls.sdk.audio.ProximityTracker
    public final void startTrackingProximity() {
        if (this.e) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) this.c.getValue();
            if (sensorManager != null) {
                sensorManager.registerListener(this, (Sensor) this.d.getValue(), 3);
            }
            this.e = true;
        } catch (Exception e) {
            L.f("ProximityManager", "Failed to start monitoring", e);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.audio.ProximityTracker
    public final void stopTrackingProximity() {
        if (this.e) {
            SensorManager sensorManager = (SensorManager) this.c.getValue();
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
            this.e = false;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
