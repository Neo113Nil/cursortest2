package com.yandex.go.slot.api.mapper;

import com.yandex.go.slot.api.ui.SlotItemUiState$Size;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.b2;
import defpackage.fef;
import defpackage.irs0;
import defpackage.mvg;
import defpackage.nqs0;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.sqs0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00028\u0001*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltse;", "Ltpr;", "<anonymous>", "(Ltse;)Ltpr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.slot.api.mapper.SlotItemReactiveUiStateMapper$stateFlow$2", f = "SlotItemReactiveUiStateMapper.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SlotItemReactiveUiStateMapper$stateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ SlotItemDto $slotItemDto;
    final /* synthetic */ wls $uiStateProvider;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotItemReactiveUiStateMapper$stateFlow$2(a aVar, SlotItemDto slotItemDto, wls wlsVar, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$slotItemDto = slotItemDto;
        this.$uiStateProvider = wlsVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SlotItemReactiveUiStateMapper$stateFlow$2 slotItemReactiveUiStateMapper$stateFlow$2 = new SlotItemReactiveUiStateMapper$stateFlow$2(this.this$0, this.$slotItemDto, this.$uiStateProvider, this.$currencyRules, continuation);
        slotItemReactiveUiStateMapper$stateFlow$2.L$0 = obj;
        return slotItemReactiveUiStateMapper$stateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SlotItemReactiveUiStateMapper$stateFlow$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        qoh h = tje.h(tseVar, null, null, new SlotItemReactiveUiStateMapper$stateFlow$2$body$1(this.this$0, this.$slotItemDto, this.$currencyRules, null), 3);
        a aVar = this.this$0;
        irs0 irs0Var = aVar.a;
        sqs0 sqs0Var = aVar.b;
        b2 b2Var = this.$slotItemDto.a;
        irs0Var.getClass();
        nqs0 a = sqs0Var.a(b2Var);
        SlotItemUiState$Size o = ((com.yandex.go.slot.mapper.a) this.this$0.a).o(this.$slotItemDto.b);
        a aVar2 = this.this$0;
        SlotItemDto slotItemDto = this.$slotItemDto;
        wls wlsVar = this.$uiStateProvider;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 1;
        Object a2 = a.a(aVar2, slotItemDto, h, a, o, wlsVar, this);
        return a2 == coroutineSingletons ? coroutineSingletons : a2;
    }
}
