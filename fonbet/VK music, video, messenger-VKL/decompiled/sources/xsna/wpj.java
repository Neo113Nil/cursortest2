package xsna;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: ContinuousMovementDetector.kt */
/* loaded from: classes.dex */
public final class wpj {
    public final Context a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final bpn0 c = new bpn0(new bp(this, 1));
    public final bpn0 d = new bpn0(new cp(this, 1));
    public final a e = new a();
    public final CopyOnWriteArrayList<b> f = new CopyOnWriteArrayList<>();
    public int g;
    public volatile boolean h;
    public volatile long i;

    /* compiled from: ContinuousMovementDetector.kt */
    public interface b {
        void a();
    }

    public wpj(Context context) {
        this.a = context;
    }

    /* compiled from: ContinuousMovementDetector.kt */
    public final class a implements SensorEventListener {
        public final float[] b = new float[3];
        public final float[] c = new float[3];
        public int d;

        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = this.b;
            float f = fArr[0] * 0.8f;
            float f2 = 1 - 0.8f;
            float[] fArr2 = sensorEvent.values;
            float f3 = (fArr2[0] * f2) + f;
            fArr[0] = f3;
            float f4 = (fArr2[1] * f2) + (fArr[1] * 0.8f);
            fArr[1] = f4;
            float f5 = (f2 * fArr2[2]) + (0.8f * fArr[2]);
            fArr[2] = f5;
            float[] fArr3 = this.c;
            float f6 = fArr2[0] - f3;
            fArr3[0] = f6;
            float f7 = fArr2[1] - f4;
            fArr3[1] = f7;
            float f8 = fArr2[2] - f5;
            fArr3[2] = f8;
            double d = f6;
            double d2 = f7;
            double d3 = f8;
            float sqrt = (float) Math.sqrt((d3 * d3) + (d2 * d2) + (d * d));
            int i = this.d;
            if (i < 10) {
                this.d = i + 1;
                return;
            }
            if (sqrt > 0.03f) {
                wpj wpjVar = wpj.this;
                if (sqrt >= 1.0f) {
                    int i2 = wpjVar.g;
                    if (i2 < 5) {
                        wpjVar.g = i2 + 1;
                    }
                } else {
                    wpjVar.g = 0;
                }
                boolean z = wpjVar.h;
                if (wpjVar.g >= 5) {
                    wpjVar.i = SystemClock.elapsedRealtime();
                    wpjVar.h = true;
                } else {
                    wpjVar.h = false;
                }
                if (z != wpjVar.h) {
                    Iterator<b> it = wpjVar.f.iterator();
                    while (it.hasNext()) {
                        it.next().a();
                    }
                }
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }
    }
}
