package com.yandex.go.taxi.order.map.overlay.traffic;

import android.graphics.Bitmap;
import defpackage.mvg;
import defpackage.mzz;
import defpackage.ny61;
import defpackage.ob7;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.overlay.traffic.TrafficLightsWithSignalImagesGenerator$createTrafficLightBitmap$2", f = "TrafficLightsWithSignalImagesGenerator.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrafficLightsWithSignalImagesGenerator$createTrafficLightBitmap$2 extends SuspendLambda implements wls {
    final /* synthetic */ Integer $countDown;
    final /* synthetic */ TrafficLightWithSignal$Signal $signal;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrafficLightsWithSignalImagesGenerator$createTrafficLightBitmap$2(a aVar, TrafficLightWithSignal$Signal trafficLightWithSignal$Signal, Integer num, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$signal = trafficLightWithSignal$Signal;
        this.$countDown = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrafficLightsWithSignalImagesGenerator$createTrafficLightBitmap$2(this.this$0, this.$signal, this.$countDown, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrafficLightsWithSignalImagesGenerator$createTrafficLightBitmap$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer num;
        int min;
        int intValue;
        Bitmap c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ob7 a = a.a(this.this$0, this.$signal, this.$countDown);
        if (this.$signal == TrafficLightWithSignal$Signal.RED && (num = this.$countDown) != null && (intValue = this.$countDown.intValue()) <= (min = Math.min(num.intValue() + 5, 99))) {
            while (true) {
                ob7 a2 = a.a(this.this$0, this.$signal, new Integer(intValue));
                if (this.this$0.c.c(a2) == null && (c = this.this$0.c(this.$signal, new Integer(intValue))) != null) {
                    this.this$0.c.d(a2, c);
                }
                if (intValue == min) {
                    break;
                }
                intValue++;
            }
        }
        Bitmap bitmap = (Bitmap) this.this$0.c.c(a);
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap c2 = this.this$0.c(this.$signal, this.$countDown);
        a aVar = this.this$0;
        if (c2 != null) {
            aVar.c.d(a, c2);
            return c2;
        }
        aVar.getClass();
        TrafficLightWithSignal$Signal trafficLightWithSignal$Signal = TrafficLightWithSignal$Signal.UNKNOWN;
        ob7 ob7Var = new ob7(trafficLightWithSignal$Signal, null, null, 4);
        mzz mzzVar = aVar.c;
        Bitmap bitmap2 = (Bitmap) mzzVar.c(ob7Var);
        if (bitmap2 != null) {
            return bitmap2;
        }
        Bitmap c3 = aVar.c(trafficLightWithSignal$Signal, null);
        if (c3 == null) {
            c3 = Bitmap.createBitmap(aVar.g, aVar.h, Bitmap.Config.ARGB_8888);
        }
        mzzVar.d(ob7Var, c3);
        return c3;
    }
}
