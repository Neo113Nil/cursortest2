package com.ybsdk.feature.transfer.version2.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments.GetAllMobileProvidersRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments.GetAllMobileProvidersResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments.GetLastMobilePaymentsRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments.GetLastMobilePaymentsResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments.GetSuggestedMobileProviderRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments.GetSuggestedMobileProviderResponse;
import defpackage.q76;
import defpackage.s490;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/MobilePaymentsApi;", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetAllMobileProvidersRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetAllMobileProvidersResponse;", "A", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetAllMobileProvidersRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetSuggestedMobileProviderRequest;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetSuggestedMobileProviderResponse;", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetSuggestedMobileProviderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetLastMobilePaymentsRequest;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetLastMobilePaymentsResponse;", CoreConstants.PushMessage.SERVICE_TYPE, "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetLastMobilePaymentsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MobilePaymentsApi {
    @s490("v1/transfers/v1/mobile/providers/get_all")
    Object A(@q76 GetAllMobileProvidersRequest getAllMobileProvidersRequest, Continuation<? super Result<DataWithStatusResponse<GetAllMobileProvidersResponse>>> continuation);

    @s490("v1/transfers/v1/mobile/get_last_accounts")
    Object i(@q76 GetLastMobilePaymentsRequest getLastMobilePaymentsRequest, Continuation<? super Result<DataWithStatusResponse<GetLastMobilePaymentsResponse>>> continuation);

    @s490("v1/transfers/v1/mobile/providers/get_suggested")
    Object j(@q76 GetSuggestedMobileProviderRequest getSuggestedMobileProviderRequest, Continuation<? super Result<DataWithStatusResponse<GetSuggestedMobileProviderResponse>>> continuation);
}
