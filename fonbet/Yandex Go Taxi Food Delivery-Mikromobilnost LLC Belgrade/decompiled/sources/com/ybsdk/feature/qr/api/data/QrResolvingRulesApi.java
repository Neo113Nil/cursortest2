package com.ybsdk.feature.qr.api.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.qr.api.data.rules.GetResolvingRulesRequest;
import com.ybsdk.feature.qr.api.data.rules.GetResolvingRulesResponseDto;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/qr/api/data/QrResolvingRulesApi;", "", "Lcom/ybsdk/feature/qr/api/data/rules/GetResolvingRulesRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/qr/api/data/rules/GetResolvingRulesResponseDto;", "a", "(Lcom/ybsdk/feature/qr/api/data/rules/GetResolvingRulesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface QrResolvingRulesApi {
    @s490("v1/qr/get_resolving_rules")
    Object a(@q76 GetResolvingRulesRequest getResolvingRulesRequest, Continuation<? super Result<DataWithStatusResponse<GetResolvingRulesResponseDto>>> continuation);

    @s490("v2/qr/get_resolving_rules")
    Object b(@q76 GetResolvingRulesRequest getResolvingRulesRequest, Continuation<? super Result<DataWithStatusResponse<GetResolvingRulesResponseDto>>> continuation);
}
