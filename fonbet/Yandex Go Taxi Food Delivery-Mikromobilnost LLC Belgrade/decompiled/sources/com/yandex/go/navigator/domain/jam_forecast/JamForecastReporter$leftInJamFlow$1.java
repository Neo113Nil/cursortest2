package com.yandex.go.navigator.domain.jam_forecast;

import com.yandex.mapkit.geometry.PolylinePosition;
import defpackage.iby;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.x4e;
import defpackage.x8q0;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lx8q0;", "segmentsWithJamInfo", "Lcom/yandex/mapkit/geometry/PolylinePosition;", "position", "Liby;", "<anonymous>", "(Ljava/util/List;Lcom/yandex/mapkit/geometry/PolylinePosition;)Liby;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.domain.jam_forecast.JamForecastReporter$leftInJamFlow$1", f = "JamForecastReporter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class JamForecastReporter$leftInJamFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JamForecastReporter$leftInJamFlow$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        JamForecastReporter$leftInJamFlow$1 jamForecastReporter$leftInJamFlow$1 = new JamForecastReporter$leftInJamFlow$1(this.this$0, (Continuation) obj3);
        jamForecastReporter$leftInJamFlow$1.L$0 = (List) obj;
        jamForecastReporter$leftInJamFlow$1.L$1 = (PolylinePosition) obj2;
        return jamForecastReporter$leftInJamFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        PolylinePosition polylinePosition = (PolylinePosition) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (!list.isEmpty()) {
            this.this$0.b.getClass();
            if (polylinePosition.getSegmentIndex() <= scc.f(list)) {
                x8q0 x8q0Var = (x8q0) list.get(polylinePosition.getSegmentIndex());
                iby ibyVar = x8q0Var.a;
                iby ibyVar2 = x8q0Var.b;
                double a = ibyVar2.a - x4e.a(ibyVar.a, 0.0d, polylinePosition.getSegmentPosition(), 0.0d);
                if (a <= 2.0d) {
                    double a2 = x4e.a(x8q0Var.a.b, 0.0d, polylinePosition.getSegmentPosition(), 0.0d);
                    iby ibyVar3 = x8q0Var.c;
                    return new iby(ibyVar3.a + a, (ibyVar3.b + ibyVar2.b) - a2);
                }
            }
        }
        return null;
    }
}
