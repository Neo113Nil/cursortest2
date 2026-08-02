package com.yandex.go.taxi.order.details.v2.state.elements.progress_bar;

import com.yandex.go.slot.dto.SlotItemBodyDto;
import defpackage.fef;
import defpackage.irs0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qrs0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "timerString", "Lcss0;", "<anonymous>", "(Ljava/lang/String;)Lcss0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.progress_bar.RideCardProgressBarItemDataSource$bodyState$1", f = "RideCardProgressBarItemDataSource.kt", l = {145}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardProgressBarItemDataSource$bodyState$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<SlotItemBodyDto> $body;
    final /* synthetic */ fef $currencyRules;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardProgressBarItemDataSource$bodyState$1(a aVar, List list, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$body = list;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardProgressBarItemDataSource$bodyState$1 rideCardProgressBarItemDataSource$bodyState$1 = new RideCardProgressBarItemDataSource$bodyState$1(this.this$0, this.$body, this.$currencyRules, continuation);
        rideCardProgressBarItemDataSource$bodyState$1.L$0 = obj;
        return rideCardProgressBarItemDataSource$bodyState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardProgressBarItemDataSource$bodyState$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
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
        irs0 irs0Var = this.this$0.a;
        ArrayList b = qrs0.b("$TIMER$", str, this.$body);
        fef fefVar = this.$currencyRules;
        this.L$0 = null;
        this.label = 1;
        Object k = ((com.yandex.go.slot.mapper.a) irs0Var).k(b, fefVar, this);
        return k == coroutineSingletons ? coroutineSingletons : k;
    }
}
