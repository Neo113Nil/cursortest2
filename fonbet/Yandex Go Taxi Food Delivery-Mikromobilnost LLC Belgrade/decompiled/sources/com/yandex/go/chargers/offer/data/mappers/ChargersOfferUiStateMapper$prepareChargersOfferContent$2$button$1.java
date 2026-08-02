package com.yandex.go.chargers.offer.data.mappers;

import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import defpackage.bvf0;
import defpackage.d7a;
import defpackage.gl3;
import defpackage.hfa0;
import defpackage.hl3;
import defpackage.kyh0;
import defpackage.lea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t6a;
import defpackage.tse;
import defpackage.uo9;
import defpackage.v6a;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Luo9;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.data.mappers.ChargersOfferUiStateMapper$prepareChargersOfferContent$2$button$1", f = "ChargersOfferUiStateMapper.kt", l = {MSException.ERROR_NO_MORE_ITEMS}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateMapper$prepareChargersOfferContent$2$button$1 extends SuspendLambda implements wls {
    final /* synthetic */ hl3 $authStatus;
    final /* synthetic */ boolean $isMainButtonLoading;
    final /* synthetic */ hfa0 $paymentOptions;
    final /* synthetic */ ChargersOfferResponseDto $response;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateMapper$prepareChargersOfferContent$2$button$1(b bVar, hl3 hl3Var, hfa0 hfa0Var, ChargersOfferResponseDto chargersOfferResponseDto, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$authStatus = hl3Var;
        this.$paymentOptions = hfa0Var;
        this.$response = chargersOfferResponseDto;
        this.$isMainButtonLoading = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$button$1(this.this$0, this.$authStatus, this.$paymentOptions, this.$response, this.$isMainButtonLoading, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOfferUiStateMapper$prepareChargersOfferContent$2$button$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uo9 uo9Var;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        uo9 uo9Var2 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            if (this.$authStatus instanceof gl3) {
                uo9Var = new uo9(bVar.f.a.getString(kyh0.common_login), null, true, v6a.a, true, null, false, false, 224);
            } else {
                bVar.getClass();
                uo9Var = null;
            }
            if (uo9Var != null) {
                return Collections.singletonList(uo9Var);
            }
            b bVar2 = this.this$0;
            hfa0 hfa0Var = this.$paymentOptions;
            bVar2.getClass();
            lea0 b = hfa0Var.b();
            if (b == null || b.d()) {
                uo9Var2 = new uo9(bVar2.f.a.getString(kyh0.chargers_error_button_to_payment_methods), null, true, d7a.a, true, null, false, false, 224);
            }
            if (uo9Var2 != null) {
                return Collections.singletonList(uo9Var2);
            }
            b bVar3 = this.this$0;
            ChargersOfferResponseDto chargersOfferResponseDto = this.$response;
            String str = chargersOfferResponseDto.a;
            List list = chargersOfferResponseDto.l;
            boolean z = this.$isMainButtonLoading;
            this.label = 1;
            bVar3.getClass();
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                obj2 = EmptyList.a;
            } else if (str == null) {
                obj2 = Collections.singletonList(new uo9(bVar3.f.a.getString(kyh0.common_close), null, true, t6a.a, true, null, false, false, 224));
            } else {
                obj2 = bvf0.n(new ChargersOfferUiStateMapper$prepareOfferButtons$2(list, bVar3, str, z, null), this);
            }
            obj = obj2;
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
        return (List) obj;
    }
}
