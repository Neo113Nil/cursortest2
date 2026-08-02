package com.ybsdk.feature.transfer.version2.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.dashboard.TransfersDashboardRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.dashboard.TransfersDashboardResponse;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/TransfersDashboardApi;", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/dashboard/TransfersDashboardRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/dashboard/TransfersDashboardResponse;", "u", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/dashboard/TransfersDashboardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TransfersDashboardApi {
    @s490("v1/screens/transfers_dashboard")
    Object u(@q76 TransfersDashboardRequest transfersDashboardRequest, Continuation<? super Result<DataWithStatusResponse<TransfersDashboardResponse>>> continuation);
}
