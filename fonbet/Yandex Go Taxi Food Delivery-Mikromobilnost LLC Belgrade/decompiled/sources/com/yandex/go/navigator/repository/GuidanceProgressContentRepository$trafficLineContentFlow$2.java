package com.yandex.go.navigator.repository;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.navigation.JamSegment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a(\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u0001 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\n"}, d2 = {"<anonymous>", "", "Lcom/yandex/mapkit/navigation/JamSegment;", "kotlin.jvm.PlatformType", "", "route", "Lcom/yandex/mapkit/directions/driving/DrivingRoute;", "<unused var>", "Lcom/yandex/go/navigator/domain/conditions_listener/ConditionsChangeType;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.repository.GuidanceProgressContentRepository$trafficLineContentFlow$2", f = "GuidanceProgressContentRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GuidanceProgressContentRepository$trafficLineContentFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GuidanceProgressContentRepository$trafficLineContentFlow$2 guidanceProgressContentRepository$trafficLineContentFlow$2 = new GuidanceProgressContentRepository$trafficLineContentFlow$2(3, (Continuation) obj3);
        guidanceProgressContentRepository$trafficLineContentFlow$2.L$0 = (DrivingRoute) obj;
        return guidanceProgressContentRepository$trafficLineContentFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<JamSegment> jamSegments;
        DrivingRoute drivingRoute = (DrivingRoute) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (drivingRoute == null || (jamSegments = drivingRoute.getJamSegments()) == null || drivingRoute.isAreConditionsOutdated()) {
            return null;
        }
        return jamSegments;
    }
}
