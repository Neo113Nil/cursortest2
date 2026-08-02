package com.ybsdk.feature.partnerpayments.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.partnerpayments.internal.network.dto.save.AutoPaymentsSaveDto;
import com.ybsdk.feature.partnerpayments.internal.network.dto.save.AutoPaymentsSaveRequest;
import com.ybsdk.feature.partnerpayments.internal.network.dto.status.PartnerPaymentsStatusDto;
import com.ybsdk.feature.partnerpayments.internal.network.dto.status.PartnerPaymentsStatusRequest;
import defpackage.iyd0;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J6\u0010\n\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00100\u0007j\u0002`\u00110\u000f0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/PartnerPaymentsApi;", "", "", "idempotencyToken", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentsSaveRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentsSaveDto;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentsSaveResponse;", "b", "(Ljava/lang/String;Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentsSaveRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/status/PartnerPaymentsStatusRequest;", "Ltq11;", "attemptNumber", "Liyd0;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/status/PartnerPaymentsStatusDto;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/status/PartnerPaymentsStatusResponse;", "a", "(Lcom/ybsdk/feature/partnerpayments/internal/network/dto/status/PartnerPaymentsStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PartnerPaymentsApi {
    @s490("v1/external_bank_payments/request/status")
    Object a(@q76 PartnerPaymentsStatusRequest partnerPaymentsStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<PartnerPaymentsStatusDto>>>> continuation);

    @s490("v1/autopayments/save")
    Object b(@z8u("X-Idempotency-Token") String str, @q76 AutoPaymentsSaveRequest autoPaymentsSaveRequest, Continuation<? super Result<DataWithStatusResponse<AutoPaymentsSaveDto>>> continuation);
}
