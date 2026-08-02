package com.ybsdk.feature.resolver.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.resolver.internal.network.dto.OnboardingRequest;
import com.ybsdk.feature.resolver.internal.network.dto.OnboardingResponse;
import com.ybsdk.feature.resolver.internal.network.dto.OnboardingResponseV2;
import com.ybsdk.feature.resolver.internal.network.dto.ShortLinkRequest;
import com.ybsdk.feature.resolver.internal.network.dto.ShortLinkResponse;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\bJ&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/resolver/internal/network/LinkApi;", "", "Lcom/ybsdk/feature/resolver/internal/network/dto/OnboardingRequest;", "body", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/resolver/internal/network/dto/OnboardingResponse;", "a", "(Lcom/ybsdk/feature/resolver/internal/network/dto/OnboardingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/resolver/internal/network/dto/OnboardingResponseV2;", "b", "Lcom/ybsdk/feature/resolver/internal/network/dto/ShortLinkRequest;", "Lcom/ybsdk/feature/resolver/internal/network/dto/ShortLinkResponse;", "c", "(Lcom/ybsdk/feature/resolver/internal/network/dto/ShortLinkRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-link-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LinkApi {
    @s490("v1/onboarding/get")
    Object a(@q76 OnboardingRequest onboardingRequest, Continuation<? super Result<DataWithStatusResponse<OnboardingResponse>>> continuation);

    @s490("v2/onboarding/get")
    Object b(@q76 OnboardingRequest onboardingRequest, Continuation<? super Result<DataWithStatusResponse<OnboardingResponseV2>>> continuation);

    @s490("v1/resolve-short-link")
    Object c(@q76 ShortLinkRequest shortLinkRequest, Continuation<? super Result<DataWithStatusResponse<ShortLinkResponse>>> continuation);
}
