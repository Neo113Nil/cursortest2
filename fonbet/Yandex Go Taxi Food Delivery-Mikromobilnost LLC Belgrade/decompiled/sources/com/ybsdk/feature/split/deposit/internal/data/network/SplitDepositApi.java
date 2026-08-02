package com.ybsdk.feature.split.deposit.internal.data.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.split.deposit.internal.data.network.dto.GetDepositPageRequest;
import com.ybsdk.feature.split.deposit.internal.data.network.dto.GetDepositPageResponse;
import com.ybsdk.feature.split.deposit.internal.data.network.dto.TransactionStatusRequest;
import com.ybsdk.feature.split.deposit.internal.data.network.dto.TransactionStatusResponse;
import defpackage.iyd0;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/SplitDepositApi;", "", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse;", "b", "(Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusRequest;", "Ltq11;", "attemptNumber", "Liyd0;", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusResponse;", "a", "(Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SplitDepositApi {
    @s490("/v1/split_deposit/transaction/status")
    Object a(@q76 TransactionStatusRequest transactionStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<TransactionStatusResponse>>>> continuation);

    @s490("/v1/split_deposit/get_deposit_page")
    Object b(@q76 GetDepositPageRequest getDepositPageRequest, Continuation<? super Result<DataWithStatusResponse<GetDepositPageResponse>>> continuation);
}
