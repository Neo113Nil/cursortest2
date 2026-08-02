package com.ybsdk.feature.mkkdeposit.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositAmountCheckResponse;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositPageResponse;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositTransactionStatusResponse;
import com.ybsdk.feature.mkkdeposit.internal.network.dto.MkkDepositAmountCheckRequest;
import com.ybsdk.feature.mkkdeposit.internal.network.dto.MkkDepositPageRequest;
import com.ybsdk.feature.mkkdeposit.internal.network.dto.MkkDepositTransactionCreateRequest;
import com.ybsdk.feature.mkkdeposit.internal.network.dto.MkkDepositTransactionStatusRequest;
import defpackage.iyd0;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/mkkdeposit/internal/network/MkkDepositApi;", "", "Lcom/ybsdk/feature/mkkdeposit/internal/network/dto/MkkDepositPageRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositPageResponse;", "d", "(Lcom/ybsdk/feature/mkkdeposit/internal/network/dto/MkkDepositPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/mkkdeposit/internal/network/dto/MkkDepositAmountCheckRequest;", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositAmountCheckResponse;", "c", "(Lcom/ybsdk/feature/mkkdeposit/internal/network/dto/MkkDepositAmountCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "idempotencyToken", "Lcom/ybsdk/feature/mkkdeposit/internal/network/dto/MkkDepositTransactionCreateRequest;", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositTransactionStatusResponse;", "a", "(Ljava/lang/String;Lcom/ybsdk/feature/mkkdeposit/internal/network/dto/MkkDepositTransactionCreateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/mkkdeposit/internal/network/dto/MkkDepositTransactionStatusRequest;", "Ltq11;", "attemptNumber", "Liyd0;", "b", "(Lcom/ybsdk/feature/mkkdeposit/internal/network/dto/MkkDepositTransactionStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MkkDepositApi {
    @s490("/v1/mkk/transaction/create")
    Object a(@z8u("X-Idempotency-Token") String str, @q76 MkkDepositTransactionCreateRequest mkkDepositTransactionCreateRequest, Continuation<? super Result<DataWithStatusResponse<CreditDepositTransactionStatusResponse>>> continuation);

    @s490("/v1/mkk/transaction/status")
    Object b(@q76 MkkDepositTransactionStatusRequest mkkDepositTransactionStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<CreditDepositTransactionStatusResponse>>>> continuation);

    @s490("/v1/mkk/check")
    Object c(@q76 MkkDepositAmountCheckRequest mkkDepositAmountCheckRequest, Continuation<? super Result<DataWithStatusResponse<CreditDepositAmountCheckResponse>>> continuation);

    @s490("/v1/mkk/get_deposit_page")
    Object d(@q76 MkkDepositPageRequest mkkDepositPageRequest, Continuation<? super Result<DataWithStatusResponse<CreditDepositPageResponse>>> continuation);
}
