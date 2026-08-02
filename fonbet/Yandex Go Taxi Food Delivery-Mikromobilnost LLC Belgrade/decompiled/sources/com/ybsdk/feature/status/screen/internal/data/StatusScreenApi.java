package com.ybsdk.feature.status.screen.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.divkit.api.dto.DivScreenDto;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/status/screen/internal/data/StatusScreenApi;", "", "Lcom/ybsdk/feature/status/screen/internal/data/StatusScreenRequest;", "body", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/divkit/api/dto/DivScreenDto;", "a", "(Lcom/ybsdk/feature/status/screen/internal/data/StatusScreenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-status-screen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface StatusScreenApi {
    @s490("/v1/screens/status_screen")
    Object a(@q76 StatusScreenRequest statusScreenRequest, Continuation<? super Result<DataWithStatusResponse<DivScreenDto>>> continuation);
}
