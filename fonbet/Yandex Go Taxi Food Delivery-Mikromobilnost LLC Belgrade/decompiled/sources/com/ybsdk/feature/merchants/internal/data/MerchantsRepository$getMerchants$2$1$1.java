package com.ybsdk.feature.merchants.internal.data;

import com.ybsdk.feature.divkit.api.dto.DivScreenDto;
import defpackage.cr10;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/divkit/api/dto/DivScreenDto;", "divScreen", "Lcr10;", "<anonymous>", "(Lcom/ybsdk/feature/divkit/api/dto/DivScreenDto;)Lcr10;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.merchants.internal.data.MerchantsRepository$getMerchants$2$1$1", f = "MerchantsRepository.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MerchantsRepository$getMerchants$2$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantsRepository$getMerchants$2$1$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MerchantsRepository$getMerchants$2$1$1 merchantsRepository$getMerchants$2$1$1 = new MerchantsRepository$getMerchants$2$1$1(this.this$0, continuation);
        merchantsRepository$getMerchants$2$1$1.L$0 = obj;
        return merchantsRepository$getMerchants$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MerchantsRepository$getMerchants$2$1$1) create((DivScreenDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            DivScreenDto divScreenDto = (DivScreenDto) this.L$0;
            a aVar = this.this$0;
            this.label = 1;
            obj = a.a(aVar, divScreenDto, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        cr10 cr10Var = (cr10) obj;
        if (cr10Var != null) {
            return cr10Var;
        }
        ny61.t("merchantsEntity = null");
        return null;
    }
}
