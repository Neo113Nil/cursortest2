package com.yandex.go.chargers.offer.data.mappers;

import com.yandex.go.chargers.data.model.ChargersAttributeDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tn9;
import defpackage.tse;
import defpackage.wls;
import defpackage.x7a;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lx7a;", "<anonymous>", "(Ltse;)Lx7a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.data.mappers.ChargersOfferUiStateMapper$prepareChargersOfferContent$2$discountsEntryPoint$1$1", f = "ChargersOfferUiStateMapper.kt", l = {294}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateMapper$prepareChargersOfferContent$2$discountsEntryPoint$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersOfferResponseDto.DiscountsEntryPoint $it;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateMapper$prepareChargersOfferContent$2$discountsEntryPoint$1$1(ChargersOfferResponseDto.DiscountsEntryPoint discountsEntryPoint, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$it = discountsEntryPoint;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$discountsEntryPoint$1$1(this.$it, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOfferUiStateMapper$prepareChargersOfferContent$2$discountsEntryPoint$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String a;
        String str;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        tn9 tn9Var = null;
        if (i == 0) {
            kotlin.b.b(obj);
            String str3 = this.$it.a;
            a = str3 != null ? ((m7x0) this.this$0.d).a(str3) : null;
            ChargersOfferResponseDto.DiscountsEntryPoint discountsEntryPoint = this.$it;
            str = discountsEntryPoint.a;
            ChargersAttributeDto chargersAttributeDto = discountsEntryPoint.b;
            if (chargersAttributeDto != null) {
                com.yandex.go.chargers.domain.mapper.a aVar = this.this$0.k;
                this.L$0 = null;
                this.L$1 = a;
                this.L$2 = str;
                this.label = 1;
                obj = aVar.a(chargersAttributeDto, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str2 = str;
            }
            return new x7a(a, str, tn9Var);
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = (String) this.L$2;
        a = (String) this.L$1;
        kotlin.b.b(obj);
        tn9Var = (tn9) obj;
        str = str2;
        return new x7a(a, str, tn9Var);
    }
}
