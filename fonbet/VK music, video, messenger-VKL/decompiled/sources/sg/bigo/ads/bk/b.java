package sg.bigo.ads.bk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes9.dex */
public final class b {
    public final WeakReference<Context> a;
    public a b;
    public SensorManager c;

    @NonNull
    public final List<Integer> f;
    long d = 0;
    final float[] e = new float[3];
    private final float h = 1.0E-9f;
    public SensorEventListener g = new SensorEventListener() { // from class: sg.bigo.ads.bk.b.1
        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Sensor sensor;
            if (sensorEvent == null || (sensor = sensorEvent.sensor) == null || sensorEvent.values.length < 3) {
                return;
            }
            int type = sensor.getType();
            if (type != 4) {
                if (type == 9 || type == 1) {
                    b.this.b.a(type, sensorEvent.values, new float[3]);
                    return;
                }
                return;
            }
            float[] fArr = new float[3];
            b bVar = b.this;
            if (bVar.d != 0) {
                float f = (sensorEvent.timestamp - r4) * 1.0E-9f;
                float[] fArr2 = bVar.e;
                float f2 = fArr2[0];
                float[] fArr3 = sensorEvent.values;
                float f3 = (fArr3[0] * f) + f2;
                fArr2[0] = f3;
                fArr2[1] = (fArr3[1] * f) + fArr2[1];
                fArr2[2] = (fArr3[2] * f) + fArr2[2];
                float abs = Math.abs((float) Math.toDegrees(f3));
                float abs2 = Math.abs((float) Math.toDegrees(b.this.e[1]));
                float abs3 = Math.abs((float) Math.toDegrees(b.this.e[2]));
                fArr[0] = abs;
                fArr[1] = abs2;
                fArr[2] = abs3;
            }
            b bVar2 = b.this;
            bVar2.d = sensorEvent.timestamp;
            bVar2.b.a(type, sensorEvent.values, fArr);
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }
    };

    public b(@NonNull Context context, @NonNull List<Integer> list, @NonNull a aVar) {
        this.a = new WeakReference<>(context);
        this.f = list;
        this.b = aVar;
    }
}
