package xsna;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: ProximityDetector.kt */
/* loaded from: classes.dex */
public final class h9e0 {
    public final Context a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final bpn0 c = new bpn0(new wg9(this, 3));
    public final bpn0 d = new bpn0(new os0(this, 3));
    public final bpn0 e = new bpn0(new vwk(this, 4));
    public final b f = new b();
    public final CopyOnWriteArrayList<a> g = new CopyOnWriteArrayList<>();
    public volatile boolean h;

    /* compiled from: ProximityDetector.kt */
    public interface a {
        void a();
    }

    public h9e0(Context context) {
        this.a = context;
    }

    /* compiled from: ProximityDetector.kt */
    public final class b implements SensorEventListener {
        public b() {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            h9e0 h9e0Var = h9e0.this;
            float f = sensorEvent.values[0];
            boolean z = h9e0Var.h;
            h9e0Var.h = f < Math.min(3.0f, ((Number) h9e0Var.e.getValue()).floatValue());
            if (z != h9e0Var.h) {
                Iterator<a> it = h9e0Var.g.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }
    }
}
