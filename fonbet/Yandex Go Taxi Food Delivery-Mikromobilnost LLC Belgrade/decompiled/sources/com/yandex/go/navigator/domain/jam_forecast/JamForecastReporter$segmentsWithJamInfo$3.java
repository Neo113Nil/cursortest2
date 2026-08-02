package com.yandex.go.navigator.domain.jam_forecast;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.navigation.JamSegment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pwd;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvpr;", "", "Lx8q0;", "Lcom/yandex/mapkit/directions/driving/DrivingRoute;", "route", "Lzy11;", "<anonymous>", "(Lvpr;Lcom/yandex/mapkit/directions/driving/DrivingRoute;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.domain.jam_forecast.JamForecastReporter$segmentsWithJamInfo$3", f = "JamForecastReporter.kt", l = {29, 31, 35}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class JamForecastReporter$segmentsWithJamInfo$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JamForecastReporter$segmentsWithJamInfo$3(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        JamForecastReporter$segmentsWithJamInfo$3 jamForecastReporter$segmentsWithJamInfo$3 = new JamForecastReporter$segmentsWithJamInfo$3(this.this$0, (Continuation) obj3);
        jamForecastReporter$segmentsWithJamInfo$3.L$0 = (vpr) obj;
        jamForecastReporter$segmentsWithJamInfo$3.L$1 = (DrivingRoute) obj2;
        return jamForecastReporter$segmentsWithJamInfo$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r0.emit((java.util.List) r9, r8) == r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r9 == r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if (r0.emit(kotlin.collections.EmptyList.a, r8) == r2) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        DrivingRoute drivingRoute = (DrivingRoute) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.L$0 = vprVar;
            this.L$1 = drivingRoute;
            this.label = 1;
        } else if (i == 1) {
            b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
        }
        if (drivingRoute != null && !drivingRoute.isAreConditionsOutdated()) {
            pwd pwdVar = this.this$0.a;
            Polyline geometry = drivingRoute.getGeometry();
            List<JamSegment> jamSegments = drivingRoute.getJamSegments();
            this.L$0 = vprVar;
            this.L$1 = null;
            this.label = 2;
            pwdVar.a.getClass();
            obj = tje.k0(uyj.a, new ComputeSegmentsWithNearestJamInfoUseCase$execute$2(pwdVar, geometry, jamSegments, null), this);
        }
        return zy11.a;
    }
}
