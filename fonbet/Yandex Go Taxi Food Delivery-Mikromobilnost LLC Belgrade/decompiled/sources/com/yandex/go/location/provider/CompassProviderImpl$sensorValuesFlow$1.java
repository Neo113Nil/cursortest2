package com.yandex.go.location.provider;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import defpackage.jst;
import defpackage.mvg;
import defpackage.n8a;
import defpackage.ni9;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.qwc;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.location.provider.CompassProviderImpl$sensorValuesFlow$1", f = "CompassProviderImpl.kt", l = {365}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CompassProviderImpl$sensorValuesFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ Sensor $sensor;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ qwc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompassProviderImpl$sensorValuesFlow$1(qwc qwcVar, Sensor sensor, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qwcVar;
        this.$sensor = sensor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CompassProviderImpl$sensorValuesFlow$1 compassProviderImpl$sensorValuesFlow$1 = new CompassProviderImpl$sensorValuesFlow$1(this.this$0, this.$sensor, continuation);
        compassProviderImpl$sensorValuesFlow$1.L$0 = obj;
        return compassProviderImpl$sensorValuesFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CompassProviderImpl$sensorValuesFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            final Sensor sensor = this.$sensor;
            SensorEventListener sensorEventListener = new SensorEventListener() { // from class: com.yandex.go.location.provider.CompassProviderImpl$sensorValuesFlow$1$listener$1
                @Override // android.hardware.SensorEventListener
                public void onAccuracyChanged(Sensor sensor2, int accuracy) {
                }

                @Override // android.hardware.SensorEventListener
                public void onSensorChanged(SensorEvent event) {
                    Throwable a;
                    Object d = ((x6f0) y6f0.this).y.d(event.values.clone());
                    Sensor sensor2 = sensor;
                    if (!(d instanceof ni9) || (a = oi9.a(d)) == null) {
                        return;
                    }
                    jst.e.k(a, "Failed to send sensor '" + sensor2.getName() + "' changed");
                }
            };
            qwc qwcVar = this.this$0;
            qwcVar.a.registerListener(sensorEventListener, this.$sensor, 2, 66000, (Handler) qwcVar.g.getValue());
            n8a n8aVar = new n8a(25, this.this$0, sensorEventListener);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, n8aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
