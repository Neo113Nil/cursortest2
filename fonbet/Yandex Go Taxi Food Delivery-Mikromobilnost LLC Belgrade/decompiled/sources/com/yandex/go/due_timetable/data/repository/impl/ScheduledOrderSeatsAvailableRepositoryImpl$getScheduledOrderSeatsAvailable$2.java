package com.yandex.go.due_timetable.data.repository.impl;

import com.yandex.go.due.data.api.dto.DuePricingDataParam;
import com.yandex.go.due_timetable.data.api.ScheduledOrderSeatsAvailableApi;
import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderSeatsAvailableRequest;
import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderSeatsAvailableResponse;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderSeatsAvailableResponse;", "<anonymous>", "(Ltse;)Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderSeatsAvailableResponse;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.due_timetable.data.repository.impl.ScheduledOrderSeatsAvailableRepositoryImpl$getScheduledOrderSeatsAvailable$2", f = "ScheduledOrderSeatsAvailableRepositoryImpl.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ScheduledOrderSeatsAvailableRepositoryImpl$getScheduledOrderSeatsAvailable$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<Calendar> $dueTimePoints;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledOrderSeatsAvailableRepositoryImpl$getScheduledOrderSeatsAvailable$2(a aVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$dueTimePoints = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScheduledOrderSeatsAvailableRepositoryImpl$getScheduledOrderSeatsAvailable$2(this.this$0, this.$dueTimePoints, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScheduledOrderSeatsAvailableRepositoryImpl$getScheduledOrderSeatsAvailable$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        ScheduledOrderSeatsAvailableApi scheduledOrderSeatsAvailableApi = aVar.b;
        List<Calendar> list = this.$dueTimePoints;
        DuePricingDataParam a = aVar.d.a(null);
        pex0 m = ((k) aVar.c).m();
        if (m == null || (str = m.b) == null) {
            ny61.r("The information about selected class is missing");
            return null;
        }
        cmt<ScheduledOrderSeatsAvailableResponse> a2 = scheduledOrderSeatsAvailableApi.a(new ScheduledOrderSeatsAvailableRequest(list, a, str));
        this.label = 1;
        Object a3 = ru.yandex.taxi.network.api.a.a(a2, null, this);
        return a3 == coroutineSingletons ? coroutineSingletons : a3;
    }
}
