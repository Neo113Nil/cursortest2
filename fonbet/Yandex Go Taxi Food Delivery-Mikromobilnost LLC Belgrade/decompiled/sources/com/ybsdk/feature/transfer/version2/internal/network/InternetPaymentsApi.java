package com.ybsdk.feature.transfer.version2.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.internetpayments.GetAllInternetProvidersResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.internetpayments.GetInternetProviderFormRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.internetpayments.GetInternetProviderFormResponse;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/InternetPaymentsApi;", "", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/GetAllInternetProvidersResponse;", RemoteBioParameters.Y, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/GetInternetProviderFormRequest;", "request", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/GetInternetProviderFormResponse;", "w", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/GetInternetProviderFormRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InternetPaymentsApi {
    @s490("v1/transfers/v1/internet/get_provider_form")
    Object w(@q76 GetInternetProviderFormRequest getInternetProviderFormRequest, Continuation<? super Result<DataWithStatusResponse<GetInternetProviderFormResponse>>> continuation);

    @s490("v1/transfers/v1/internet/providers/get_all")
    Object y(Continuation<? super Result<DataWithStatusResponse<GetAllInternetProvidersResponse>>> continuation);
}
