package com.yandex.go.taxi.order.promotions.modal_default.interactor;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.fef;
import defpackage.irs0;
import defpackage.mvg;
import defpackage.my20;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xss0;
import defpackage.zq70;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzq70;", "<anonymous>", "(Ltse;)Lzq70;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promotions.modal_default.interactor.OrderDefaultModalInteractor$mapBullets$2$1$1", f = "OrderDefaultModalInteractor.kt", l = {101}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderDefaultModalInteractor$mapBullets$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ SlotItemDto $slot;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDefaultModalInteractor$mapBullets$2$1$1(c cVar, SlotItemDto slotItemDto, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$slot = slotItemDto;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderDefaultModalInteractor$mapBullets$2$1$1(this.this$0, this.$slot, this.$currencyRules, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderDefaultModalInteractor$mapBullets$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            irs0 irs0Var = cVar.e;
            SlotItemDto slotItemDto = this.$slot;
            my20 my20Var = cVar.f;
            fef fefVar = this.$currencyRules;
            this.label = 1;
            obj = ((com.yandex.go.slot.mapper.a) irs0Var).e(slotItemDto, my20Var, false, false, fefVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return new zq70((xss0) obj);
    }
}
