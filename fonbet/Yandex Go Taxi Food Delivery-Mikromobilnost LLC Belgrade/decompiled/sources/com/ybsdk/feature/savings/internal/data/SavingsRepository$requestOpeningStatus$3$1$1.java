package com.ybsdk.feature.savings.internal.data;

import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.savings.internal.entities.SavingsAccountCreationStatusEntity$Status;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountOpeningStatusResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.odm0;
import defpackage.u4m0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpeningStatusResponse;", "response", "Lu4m0;", "<anonymous>", "(Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpeningStatusResponse;)Lu4m0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.data.SavingsRepository$requestOpeningStatus$3$1$1", f = "SavingsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsRepository$requestOpeningStatus$3$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsRepository$requestOpeningStatus$3$1$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SavingsRepository$requestOpeningStatus$3$1$1 savingsRepository$requestOpeningStatus$3$1$1 = new SavingsRepository$requestOpeningStatus$3$1$1(this.this$0, continuation);
        savingsRepository$requestOpeningStatus$3$1$1.L$0 = obj;
        return savingsRepository$requestOpeningStatus$3$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsRepository$requestOpeningStatus$3$1$1) create((SavingsAccountOpeningStatusResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SavingsAccountCreationStatusEntity$Status savingsAccountCreationStatusEntity$Status;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        SavingsAccountOpeningStatusResponse savingsAccountOpeningStatusResponse = (SavingsAccountOpeningStatusResponse) this.L$0;
        String requestId = savingsAccountOpeningStatusResponse.getRequestId();
        b bVar = this.this$0;
        SavingsAccountOpeningStatusResponse.Status requestStatus = savingsAccountOpeningStatusResponse.getRequestStatus();
        bVar.getClass();
        int i = odm0.a[requestStatus.ordinal()];
        if (i == 1) {
            savingsAccountCreationStatusEntity$Status = SavingsAccountCreationStatusEntity$Status.FAIL;
        } else if (i == 2) {
            savingsAccountCreationStatusEntity$Status = SavingsAccountCreationStatusEntity$Status.SUCCESS;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            savingsAccountCreationStatusEntity$Status = SavingsAccountCreationStatusEntity$Status.PROCESSING;
        }
        SavingsAccountCreationStatusEntity$Status savingsAccountCreationStatusEntity$Status2 = savingsAccountCreationStatusEntity$Status;
        String supportUrl = savingsAccountOpeningStatusResponse.getSupportUrl();
        String agreementId = savingsAccountOpeningStatusResponse.getAgreementId();
        String statusTitle = savingsAccountOpeningStatusResponse.getStatusTitle();
        String statusDescription = savingsAccountOpeningStatusResponse.getStatusDescription();
        String processingStatusTitle = savingsAccountOpeningStatusResponse.getProcessingStatusTitle();
        String processingStatusDescription = savingsAccountOpeningStatusResponse.getProcessingStatusDescription();
        ThemedParameter<String> requestStatusImage = savingsAccountOpeningStatusResponse.getRequestStatusImage();
        return new u4m0(requestId, savingsAccountCreationStatusEntity$Status2, statusTitle, statusDescription, requestStatusImage != null ? requestStatusImage.toEntity() : null, processingStatusTitle, processingStatusDescription, supportUrl, agreementId);
    }
}
