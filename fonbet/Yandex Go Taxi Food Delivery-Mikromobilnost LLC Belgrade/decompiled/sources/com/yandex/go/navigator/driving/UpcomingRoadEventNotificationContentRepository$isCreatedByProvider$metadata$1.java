package com.yandex.go.navigator.driving;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/mapkit/road_events/RoadEventMetadata;", "<anonymous>", "(Ltse;)Lcom/yandex/mapkit/road_events/RoadEventMetadata;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.UpcomingRoadEventNotificationContentRepository$isCreatedByProvider$metadata$1", f = "UpcomingRoadEventNotificationContentRepository.kt", l = {114}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class UpcomingRoadEventNotificationContentRepository$isCreatedByProvider$metadata$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $eventId;
    int label;
    final /* synthetic */ p0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpcomingRoadEventNotificationContentRepository$isCreatedByProvider$metadata$1(p0 p0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = p0Var;
        this.$eventId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpcomingRoadEventNotificationContentRepository$isCreatedByProvider$metadata$1(this.this$0, this.$eventId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpcomingRoadEventNotificationContentRepository$isCreatedByProvider$metadata$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        p0 p0Var = this.this$0;
        String str = this.$eventId;
        this.label = 1;
        Object a = p0.a(p0Var, str, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
