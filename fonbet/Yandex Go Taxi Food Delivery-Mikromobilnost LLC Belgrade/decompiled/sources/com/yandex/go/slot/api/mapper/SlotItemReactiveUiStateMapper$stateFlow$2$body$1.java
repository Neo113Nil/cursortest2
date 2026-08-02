package com.yandex.go.slot.api.mapper;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.fef;
import defpackage.irs0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcss0;", "<anonymous>", "(Ltse;)Lcss0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.slot.api.mapper.SlotItemReactiveUiStateMapper$stateFlow$2$body$1", f = "SlotItemReactiveUiStateMapper.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SlotItemReactiveUiStateMapper$stateFlow$2$body$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ SlotItemDto $slotItemDto;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotItemReactiveUiStateMapper$stateFlow$2$body$1(a aVar, SlotItemDto slotItemDto, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$slotItemDto = slotItemDto;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SlotItemReactiveUiStateMapper$stateFlow$2$body$1(this.this$0, this.$slotItemDto, this.$currencyRules, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SlotItemReactiveUiStateMapper$stateFlow$2$body$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        List list = this.$slotItemDto.d;
        fef fefVar = this.$currencyRules;
        this.label = 1;
        Object k = ((com.yandex.go.slot.mapper.a) irs0Var).k(list, fefVar, this);
        return k == coroutineSingletons ? coroutineSingletons : k;
    }
}
