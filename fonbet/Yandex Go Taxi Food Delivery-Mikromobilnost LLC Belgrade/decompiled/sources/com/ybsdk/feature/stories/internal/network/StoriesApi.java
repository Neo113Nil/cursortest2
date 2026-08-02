package com.ybsdk.feature.stories.internal.network;

import com.ybsdk.core.stories.dto.StoriesResponse;
import com.ybsdk.core.stories.dto.VerticalStoriesResponse;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.stories.internal.network.dto.GetStoriesRequest;
import com.ybsdk.feature.stories.internal.network.dto.GetVerticalStoriesRequest;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/stories/internal/network/StoriesApi;", "", "Lcom/ybsdk/feature/stories/internal/network/dto/GetStoriesRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/core/stories/dto/StoriesResponse;", "a", "(Lcom/ybsdk/feature/stories/internal/network/dto/GetStoriesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "firstInstallTime", "Lcom/ybsdk/feature/stories/internal/network/dto/GetVerticalStoriesRequest;", "Lcom/ybsdk/core/stories/dto/VerticalStoriesResponse;", "b", "(Ljava/lang/String;Lcom/ybsdk/feature/stories/internal/network/dto/GetVerticalStoriesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface StoriesApi {
    @s490("/v1/stories/v1/get")
    Object a(@q76 GetStoriesRequest getStoriesRequest, Continuation<? super Result<DataWithStatusResponse<StoriesResponse>>> continuation);

    @s490("/v1/vertical_stories/v1/get")
    Object b(@z8u("X-YB-First-Install-Time") String str, @q76 GetVerticalStoriesRequest getVerticalStoriesRequest, Continuation<? super Result<DataWithStatusResponse<VerticalStoriesResponse>>> continuation);
}
