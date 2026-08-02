package com.ybsdk.feature.partnerpayments.internal.data;

import com.ybsdk.feature.partnerpayments.internal.network.dto.save.AutoPaymentsSaveDto;
import defpackage.d7j0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentsSaveDto;", "dto", "Ld7j0;", "<anonymous>", "(Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentsSaveDto;)Ld7j0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.partnerpayments.internal.data.PartnerPaymentsRepository$savePartnerId$3$1", f = "PartnerPaymentsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PartnerPaymentsRepository$savePartnerId$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PartnerPaymentsRepository$savePartnerId$3$1 partnerPaymentsRepository$savePartnerId$3$1 = new PartnerPaymentsRepository$savePartnerId$3$1(2, continuation);
        partnerPaymentsRepository$savePartnerId$3$1.L$0 = obj;
        return partnerPaymentsRepository$savePartnerId$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PartnerPaymentsRepository$savePartnerId$3$1) create((AutoPaymentsSaveDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new d7j0(((AutoPaymentsSaveDto) this.L$0).getRequestId());
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
