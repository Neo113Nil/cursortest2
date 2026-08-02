package xsna;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import io.reactivex.rxjava3.internal.operators.flowable.j;
import xsna.uvg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class pvg0 implements io.reactivex.rxjava3.core.i {
    public final /* synthetic */ SensorManager a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ izs d;

    public /* synthetic */ pvg0(SensorManager sensorManager, int i, int i2, izs izsVar) {
        this.a = sensorManager;
        this.b = i;
        this.c = i2;
        this.d = izsVar;
    }

    @Override // io.reactivex.rxjava3.core.i
    public final void subscribe(io.reactivex.rxjava3.core.h hVar) {
        SensorManager sensorManager = this.a;
        int i = this.b;
        int i2 = this.c;
        uvg0.a aVar = new uvg0.a(i, this.d, hVar);
        j.b bVar = (j.b) hVar;
        if (!bVar.g()) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(i);
            ntu ntuVar = (ntu) uvg0.a.getValue();
            HandlerThread handlerThread = ntuVar.a;
            if (handlerThread != null) {
                ntuVar.b.incrementAndGet();
            } else {
                synchronized (ntuVar) {
                    handlerThread = ntuVar.a;
                    if (handlerThread != null) {
                        ntuVar.b.incrementAndGet();
                    } else {
                        handlerThread = new HandlerThread("vk-rx-sensor-thread");
                        handlerThread.start();
                        ntuVar.a = handlerThread;
                        ntuVar.b.incrementAndGet();
                    }
                }
            }
            sensorManager.registerListener(aVar, defaultSensor, i2, new Handler(handlerThread.getLooper()));
        }
        bVar.i(new io.reactivex.rxjava3.disposables.a(new cwc(2, sensorManager, aVar)));
    }
}
