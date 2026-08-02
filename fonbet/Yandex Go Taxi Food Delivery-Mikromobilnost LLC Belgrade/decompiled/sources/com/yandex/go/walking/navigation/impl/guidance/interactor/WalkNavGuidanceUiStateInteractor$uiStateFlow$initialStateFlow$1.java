package com.yandex.go.walking.navigation.impl.guidance.interactor;

import com.yandex.go.walking.navigation.impl.model.WalkNavFocusButtonState;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteMetadata;
import defpackage.a640;
import defpackage.avj0;
import defpackage.dms;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o341;
import defpackage.t7s;
import defpackage.z041;
import defpackage.zy11;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/yandex/mapkit/transport/masstransit/Route;", "route", "", "Lcom/yandex/go/address/models/Address;", "addresses", "", "startTimeMillis", "", "passedDistance", "Lo341;", "<anonymous>", "(Lcom/yandex/mapkit/transport/masstransit/Route;Ljava/util/List;JD)Lo341;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.guidance.interactor.WalkNavGuidanceUiStateInteractor$uiStateFlow$initialStateFlow$1", f = "WalkNavGuidanceUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavGuidanceUiStateInteractor$uiStateFlow$initialStateFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ double D$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavGuidanceUiStateInteractor$uiStateFlow$initialStateFlow$1(x xVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = xVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        double doubleValue = ((Number) obj4).doubleValue();
        WalkNavGuidanceUiStateInteractor$uiStateFlow$initialStateFlow$1 walkNavGuidanceUiStateInteractor$uiStateFlow$initialStateFlow$1 = new WalkNavGuidanceUiStateInteractor$uiStateFlow$initialStateFlow$1(this.this$0, (Continuation) obj5);
        walkNavGuidanceUiStateInteractor$uiStateFlow$initialStateFlow$1.L$0 = (Route) obj;
        walkNavGuidanceUiStateInteractor$uiStateFlow$initialStateFlow$1.L$1 = (List) obj2;
        walkNavGuidanceUiStateInteractor$uiStateFlow$initialStateFlow$1.L$2 = (Long) obj3;
        walkNavGuidanceUiStateInteractor$uiStateFlow$initialStateFlow$1.D$0 = doubleValue;
        return walkNavGuidanceUiStateInteractor$uiStateFlow$initialStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Route route = (Route) this.L$0;
        List list = (List) this.L$1;
        Long l = (Long) this.L$2;
        double d = this.D$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        RouteMetadata metadata = route.getMetadata();
        long value = (long) metadata.getWeight().getTime().getValue();
        double value2 = metadata.getWeight().getWalkingDistance().getValue();
        double d2 = value2 + d;
        List list2 = this.this$0.a.o(route, list, d).e;
        String c = this.this$0.f.c(value2, value);
        a640 a640Var = this.this$0.f;
        String d3 = a640Var.d(a640Var.c(value2, value));
        a640 a640Var2 = this.this$0.f;
        a640Var2.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, (int) value);
        String c2 = t7s.c(a640Var2.a, calendar, 1);
        return new o341(c, d3, ((avj0) a640Var2.b).i(kyh0.walking_navigation_arrival_time, c2), list2, ((avj0) this.this$0.f.b).h(kyh0.navigator_driving_screen_finish_button), new z041(false, 0.0f), WalkNavFocusButtonState.FOCUS_USER_LOCATION, false, l, d2, null, false, this.this$0.j.a.isEnabled());
    }
}
