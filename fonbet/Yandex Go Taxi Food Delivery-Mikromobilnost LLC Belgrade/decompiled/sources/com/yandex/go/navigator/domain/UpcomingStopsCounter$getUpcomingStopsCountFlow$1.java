package com.yandex.go.navigator.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "stopsPositionsIndices", "", "userPositionIdx"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.domain.UpcomingStopsCounter$getUpcomingStopsCountFlow$1", f = "UpcomingStopsCounter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class UpcomingStopsCounter$getUpcomingStopsCountFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpcomingStopsCounter$getUpcomingStopsCountFlow$1(a0 a0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = a0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        UpcomingStopsCounter$getUpcomingStopsCountFlow$1 upcomingStopsCounter$getUpcomingStopsCountFlow$1 = new UpcomingStopsCounter$getUpcomingStopsCountFlow$1(this.this$0, (Continuation) obj3);
        upcomingStopsCounter$getUpcomingStopsCountFlow$1.L$0 = (List) obj;
        upcomingStopsCounter$getUpcomingStopsCountFlow$1.I$0 = intValue;
        return upcomingStopsCounter$getUpcomingStopsCountFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (i < ((Number) obj2).intValue()) {
                arrayList.add(obj2);
            }
        }
        return new Integer(arrayList.size());
    }
}
