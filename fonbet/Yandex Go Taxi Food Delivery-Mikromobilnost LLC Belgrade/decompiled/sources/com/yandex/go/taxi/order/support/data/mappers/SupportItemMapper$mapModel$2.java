package com.yandex.go.taxi.order.support.data.mappers;

import com.yandex.go.taxi.order.models.api.cancel.n;
import com.yandex.go.taxi.order.models.api.ride_support.OrderRideSupportNotification;
import defpackage.ijw0;
import defpackage.m7x0;
import defpackage.miw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lijw0;", "<anonymous>", "(Ltse;)Lijw0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.support.data.mappers.SupportItemMapper$mapModel$2", f = "SupportItemMapper.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SupportItemMapper$mapModel$2 extends SuspendLambda implements wls {
    final /* synthetic */ OrderRideSupportNotification.SupportItemDto $dto;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportItemMapper$mapModel$2(OrderRideSupportNotification.SupportItemDto supportItemDto, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$dto = supportItemDto;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SupportItemMapper$mapModel$2 supportItemMapper$mapModel$2 = new SupportItemMapper$mapModel$2(this.$dto, this.this$0, continuation);
        supportItemMapper$mapModel$2.L$0 = obj;
        return supportItemMapper$mapModel$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SupportItemMapper$mapModel$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String a;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            OrderRideSupportNotification.SupportItemDto supportItemDto = this.$dto;
            n nVar = supportItemDto.e.a;
            a aVar = this.this$0;
            String str = supportItemDto.a;
            aVar.getClass();
            qoh h = tje.h(tseVar, null, null, new SupportItemMapper$convertAction$1(nVar, aVar, str, null), 3);
            String str2 = this.$dto.d;
            a = str2 != null ? ((m7x0) this.this$0.b).a(str2) : null;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = a;
            this.label = 1;
            obj = h.s(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a = (String) this.L$2;
            kotlin.b.b(obj);
        }
        String str3 = a;
        miw0 miw0Var = (miw0) obj;
        if (miw0Var == null) {
            return null;
        }
        OrderRideSupportNotification.SupportItemDto supportItemDto2 = this.$dto;
        return new ijw0(supportItemDto2.a, supportItemDto2.b, supportItemDto2.c, str3, miw0Var);
    }
}
