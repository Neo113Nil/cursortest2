package com.yandex.go.walking.navigation.impl.guidance.interactor;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteMetadata;
import com.yandex.mapkit.transport.masstransit.Weight;
import defpackage.a341;
import defpackage.b741;
import defpackage.bms;
import defpackage.gci0;
import defpackage.k4u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.guidance.interactor.WalkNavGuidanceInProgressAnalyticsInteractor$start$1", f = "WalkNavGuidanceInProgressAnalyticsInteractor.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavGuidanceInProgressAnalyticsInteractor$start$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $hubSessionId;
    int label;
    final /* synthetic */ n this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "passedDistance", "Lcom/yandex/mapkit/transport/masstransit/Route;", "route", "Lk4u;", "progress", "<anonymous>", "(DLcom/yandex/mapkit/transport/masstransit/Route;Lk4u;)D"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.walking.navigation.impl.guidance.interactor.WalkNavGuidanceInProgressAnalyticsInteractor$start$1$1", f = "WalkNavGuidanceInProgressAnalyticsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.walking.navigation.impl.guidance.interactor.WalkNavGuidanceInProgressAnalyticsInteractor$start$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements bms {
        /* synthetic */ double D$0;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // defpackage.bms
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            double doubleValue = ((Number) obj).doubleValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(4, (Continuation) obj4);
            anonymousClass1.D$0 = doubleValue;
            anonymousClass1.L$0 = (Route) obj2;
            anonymousClass1.L$1 = (k4u) obj3;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RouteMetadata metadata;
            Weight weight;
            LocalizedValue walkingDistance;
            double d = this.D$0;
            Route route = (Route) this.L$0;
            k4u k4uVar = (k4u) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            double value = (route == null || (metadata = route.getMetadata()) == null || (weight = metadata.getWeight()) == null || (walkingDistance = weight.getWalkingDistance()) == null) ? 0.0d : walkingDistance.getValue();
            double d2 = value - (k4uVar != null ? k4uVar.b : value);
            return new Double(d + (d2 >= 0.0d ? d2 : 0.0d));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavGuidanceInProgressAnalyticsInteractor$start$1(n nVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$hubSessionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkNavGuidanceInProgressAnalyticsInteractor$start$1(this.this$0, this.$hubSessionId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkNavGuidanceInProgressAnalyticsInteractor$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RouteMetadata metadata;
        String routeId;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n nVar = this.this$0;
            gci0 gci0Var = nVar.b.h;
            a341 a341Var = nVar.c;
            m mVar = new m(kotlinx.coroutines.flow.e.n(gci0Var, a341Var.d, a341Var.e(), new AnonymousClass1(4, null)));
            this.label = 1;
            if (kotlinx.coroutines.flow.e.y(mVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Route route = (Route) this.this$0.c.d.a.getValue();
        zy11 zy11Var = zy11.a;
        if (route != null && (metadata = route.getMetadata()) != null && (routeId = metadata.getRouteId()) != null) {
            b741 b741Var = this.this$0.d;
            String str = this.$hubSessionId;
            b741Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("hub_session_id", str);
            hashMap.put("walking_id", routeId);
            b741Var.a.a("WalkingNavigation.Guidance.InProgress", hashMap, 1, new HashMap());
            this.this$0.f = true;
        }
        return zy11Var;
    }
}
