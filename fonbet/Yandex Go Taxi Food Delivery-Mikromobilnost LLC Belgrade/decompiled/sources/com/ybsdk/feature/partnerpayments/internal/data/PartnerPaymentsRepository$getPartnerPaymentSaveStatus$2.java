package com.ybsdk.feature.partnerpayments.internal.data;

import com.ybsdk.feature.partnerpayments.internal.network.PartnerPaymentsApi;
import com.ybsdk.feature.partnerpayments.internal.network.dto.status.PartnerPaymentsStatusRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/status/PartnerPaymentsStatusDto;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/status/PartnerPaymentsStatusResponse;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.partnerpayments.internal.data.PartnerPaymentsRepository$getPartnerPaymentSaveStatus$2", f = "PartnerPaymentsRepository.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PartnerPaymentsRepository$getPartnerPaymentSaveStatus$2 extends SuspendLambda implements tls {
    final /* synthetic */ int $attemptNumber;
    final /* synthetic */ PartnerPaymentsStatusRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerPaymentsRepository$getPartnerPaymentSaveStatus$2(a aVar, PartnerPaymentsStatusRequest partnerPaymentsStatusRequest, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$request = partnerPaymentsStatusRequest;
        this.$attemptNumber = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PartnerPaymentsRepository$getPartnerPaymentSaveStatus$2(this.this$0, this.$request, this.$attemptNumber, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PartnerPaymentsRepository$getPartnerPaymentSaveStatus$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            PartnerPaymentsApi partnerPaymentsApi = this.this$0.a;
            PartnerPaymentsStatusRequest partnerPaymentsStatusRequest = this.$request;
            int i2 = this.$attemptNumber;
            this.label = 1;
            a = partnerPaymentsApi.a(partnerPaymentsStatusRequest, i2, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
