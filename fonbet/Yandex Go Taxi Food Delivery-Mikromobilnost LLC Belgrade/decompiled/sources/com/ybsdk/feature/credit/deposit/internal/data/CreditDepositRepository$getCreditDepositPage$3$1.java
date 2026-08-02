package com.ybsdk.feature.credit.deposit.internal.data;

import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositPageResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositPageResponse;", "it", "Lpaf;", "<anonymous>", "(Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositPageResponse;)Lpaf;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.credit.deposit.internal.data.CreditDepositRepository$getCreditDepositPage$3$1", f = "CreditDepositRepository.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CreditDepositRepository$getCreditDepositPage$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditDepositRepository$getCreditDepositPage$3$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreditDepositRepository$getCreditDepositPage$3$1 creditDepositRepository$getCreditDepositPage$3$1 = new CreditDepositRepository$getCreditDepositPage$3$1(this.this$0, continuation);
        creditDepositRepository$getCreditDepositPage$3$1.L$0 = obj;
        return creditDepositRepository$getCreditDepositPage$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreditDepositRepository$getCreditDepositPage$3$1) create((CreditDepositPageResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        CreditDepositPageResponse creditDepositPageResponse = (CreditDepositPageResponse) this.L$0;
        com.ybsdk.feature.credit.deposit.internal.domain.entities.b bVar = this.this$0.e;
        this.label = 1;
        Object a = bVar.a(creditDepositPageResponse, false, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
