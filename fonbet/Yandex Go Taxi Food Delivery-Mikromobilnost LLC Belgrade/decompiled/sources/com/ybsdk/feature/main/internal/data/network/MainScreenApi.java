package com.ybsdk.feature.main.internal.data.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.main.internal.data.network.dto.ScreenProductsRequest;
import com.ybsdk.feature.main.internal.data.network.dto.ScreenProductsResponseDto;
import com.ybsdk.feature.main.internal.data.network.dto.ScreenProductsV4ResponseDto;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J4\u0010\n\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\f0\u0007j\u0002`\r0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/MainScreenApi;", "", "", "firstInstallTime", "Lcom/ybsdk/feature/main/internal/data/network/dto/ScreenProductsRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/main/internal/data/network/dto/ScreenProductsResponseDto;", "Lcom/ybsdk/feature/main/internal/data/network/dto/ScreenProductsV3Response;", "b", "(Ljava/lang/String;Lcom/ybsdk/feature/main/internal/data/network/dto/ScreenProductsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/main/internal/data/network/dto/ScreenProductsV4ResponseDto;", "Lcom/ybsdk/feature/main/internal/data/network/dto/ScreenProductsV4Response;", "a", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MainScreenApi {
    @s490("v4/screens/products")
    Object a(@z8u("X-YB-First-Install-Time") String str, @q76 ScreenProductsRequest screenProductsRequest, Continuation<? super Result<DataWithStatusResponse<ScreenProductsV4ResponseDto>>> continuation);

    @s490("v3/screens/products")
    Object b(@z8u("X-YB-First-Install-Time") String str, @q76 ScreenProductsRequest screenProductsRequest, Continuation<? super Result<DataWithStatusResponse<ScreenProductsResponseDto>>> continuation);
}
