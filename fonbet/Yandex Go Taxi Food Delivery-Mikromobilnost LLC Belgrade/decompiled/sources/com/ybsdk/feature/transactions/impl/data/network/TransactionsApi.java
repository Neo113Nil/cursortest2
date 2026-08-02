package com.ybsdk.feature.transactions.impl.data.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.transactions.impl.data.network.dto.TransactionDetailsRequest;
import com.ybsdk.feature.transactions.impl.data.network.dto.TransactionDetailsResponse;
import com.ybsdk.feature.transactions.impl.data.network.dto.TransactionsInfoRequestV2;
import com.ybsdk.feature.transactions.impl.data.network.dto.TransactionsInfoResponseV2;
import com.ybsdk.feature.transactions.impl.data.network.dto.TransactionsListRequestV2;
import com.ybsdk.feature.transactions.impl.data.network.dto.TransactionsListResponseV2;
import com.ybsdk.feature.transactions.impl.data.network.dto.feed.TransactionsFeedFiltersRequest;
import com.ybsdk.feature.transactions.impl.data.network.dto.feed.TransactionsFeedFiltersResponse;
import com.ybsdk.feature.transactions.impl.data.network.dto.feed.TransactionsFeedListRequest;
import com.ybsdk.feature.transactions.impl.data.network.dto.feed.TransactionsFeedListResponse;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/TransactionsApi;", "", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsInfoRequestV2;", "body", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsInfoResponseV2;", "e", "(Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsInfoRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionDetailsRequest;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionDetailsResponse;", "a", "(Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionDetailsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsListRequestV2;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsListResponseV2;", "b", "(Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsListRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedFiltersRequest;", "request", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedFiltersResponse;", "d", "(Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedFiltersRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedListRequest;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedListResponse;", "c", "(Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedListRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TransactionsApi {
    @s490("v1/screens/transaction_details")
    Object a(@q76 TransactionDetailsRequest transactionDetailsRequest, Continuation<? super Result<DataWithStatusResponse<TransactionDetailsResponse>>> continuation);

    @s490("v1/transactions/list")
    Object b(@q76 TransactionsListRequestV2 transactionsListRequestV2, Continuation<? super Result<DataWithStatusResponse<TransactionsListResponseV2>>> continuation);

    @s490("/v1/transactions_feed/list")
    Object c(@q76 TransactionsFeedListRequest transactionsFeedListRequest, Continuation<? super Result<DataWithStatusResponse<TransactionsFeedListResponse>>> continuation);

    @s490("v1/screens/transactions_feed")
    Object d(@q76 TransactionsFeedFiltersRequest transactionsFeedFiltersRequest, Continuation<? super Result<DataWithStatusResponse<TransactionsFeedFiltersResponse>>> continuation);

    @s490("v2/screens/transactions")
    Object e(@q76 TransactionsInfoRequestV2 transactionsInfoRequestV2, Continuation<? super Result<DataWithStatusResponse<TransactionsInfoResponseV2>>> continuation);
}
