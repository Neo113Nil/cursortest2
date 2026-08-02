package com.yandex.go.navigator.domain.jam_forecast;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n"}, d2 = {"<anonymous>", "Lcom/yandex/mapkit/directions/driving/DrivingRoute;", "route", "<unused var>", "Lcom/yandex/go/navigator/domain/conditions_listener/ConditionsChangeType;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.domain.jam_forecast.JamForecastReporter$segmentsWithJamInfo$2", f = "JamForecastReporter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class JamForecastReporter$segmentsWithJamInfo$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        JamForecastReporter$segmentsWithJamInfo$2 jamForecastReporter$segmentsWithJamInfo$2 = new JamForecastReporter$segmentsWithJamInfo$2(3, (Continuation) obj3);
        jamForecastReporter$segmentsWithJamInfo$2.L$0 = (DrivingRoute) obj;
        return jamForecastReporter$segmentsWithJamInfo$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DrivingRoute drivingRoute = (DrivingRoute) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return drivingRoute;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
