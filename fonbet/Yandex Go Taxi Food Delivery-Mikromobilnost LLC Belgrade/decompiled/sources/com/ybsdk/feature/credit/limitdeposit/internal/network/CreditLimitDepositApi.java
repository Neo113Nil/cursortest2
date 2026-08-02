package com.ybsdk.feature.credit.limitdeposit.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositAmountCheckResponse;
import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositAmountCheckRequest;
import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositPageRequest;
import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositPageResponse;
import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositTransactionCreateRequest;
import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositTransactionStatusRequest;
import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositTransactionStatusResponse;
import defpackage.iyd0;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J6\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/credit/limitdeposit/internal/network/CreditLimitDepositApi;", "", "Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositTransactionStatusRequest;", "request", "Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositTransactionStatusResponse;", "a", "(Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositTransactionStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositAmountCheckRequest;", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositAmountCheckResponse;", "c", "(Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositAmountCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "idempotencyToken", "Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositTransactionCreateRequest;", "b", "(Ljava/lang/String;Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositTransactionCreateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositPageRequest;", "Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositPageResponse;", "d", "(Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CreditLimitDepositApi {
    @s490("/v1/credit_limit_deposit/transaction/status")
    Object a(@q76 CreditLimitDepositTransactionStatusRequest creditLimitDepositTransactionStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<CreditLimitDepositTransactionStatusResponse>>>> continuation);

    @s490("/v1/credit_limit_deposit/transaction/create")
    Object b(@z8u("X-Idempotency-Token") String str, @q76 CreditLimitDepositTransactionCreateRequest creditLimitDepositTransactionCreateRequest, Continuation<? super Result<DataWithStatusResponse<CreditLimitDepositTransactionStatusResponse>>> continuation);

    @s490("/v1/credit_limit_deposit/check")
    Object c(@q76 CreditLimitDepositAmountCheckRequest creditLimitDepositAmountCheckRequest, Continuation<? super Result<DataWithStatusResponse<CreditDepositAmountCheckResponse>>> continuation);

    @s490("/v1/credit_limit_deposit/get_deposit_page")
    Object d(@q76 CreditLimitDepositPageRequest creditLimitDepositPageRequest, Continuation<? super Result<DataWithStatusResponse<CreditLimitDepositPageResponse>>> continuation);
}
