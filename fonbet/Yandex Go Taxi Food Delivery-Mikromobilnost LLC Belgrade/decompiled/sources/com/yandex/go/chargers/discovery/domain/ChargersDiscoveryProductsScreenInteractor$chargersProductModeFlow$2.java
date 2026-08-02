package com.yandex.go.chargers.discovery.domain;

import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;
import com.yandex.go.shortcuts.dto.response.ProductMode$Chargers;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rpa;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ProductMode$Chargers;", "chargersProductMode", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/shortcuts/dto/response/ProductMode$Chargers;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.discovery.domain.ChargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$2", f = "ChargersDiscoveryProductsScreenInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$2 chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$2 = new ChargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$2(this.this$0, continuation);
        chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$2.L$0 = obj;
        return chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$2 chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$2 = (ChargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$2) create((ProductMode$Chargers) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProductMode$Chargers productMode$Chargers = (ProductMode$Chargers) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ChargersDiscountDto chargersDiscountDto = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        rpa rpaVar = this.this$0.b;
        ProductMode$Chargers.ChargersDiscount chargersDiscount = productMode$Chargers.d;
        if (chargersDiscount != null) {
            ChargersDiscountTypeDto chargersDiscountTypeDto = (ChargersDiscountTypeDto) kotlin.collections.a.S(ChargersDiscountTypeDto.Companion.serializer().getDescriptor().c(chargersDiscount.a), ChargersDiscountTypeDto.b());
            if (chargersDiscountTypeDto != null) {
                chargersDiscountDto = new ChargersDiscountDto(chargersDiscountTypeDto, chargersDiscount.b);
            }
        }
        rpaVar.Jg(chargersDiscountDto);
        return zy11.a;
    }
}
