package com.ybsdk.feature.status.screen.internal.data;

import com.yandex.div.state.db.StateEntry;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import defpackage.q76;
import defpackage.qg21;
import defpackage.s490;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0001H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/status/screen/internal/data/DivkitCommonScreenApi;", "", "", StateEntry.COLUMN_PATH, "body", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/status/screen/internal/data/DivCommonResponse;", "a", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-divkit-common-screen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DivkitCommonScreenApi {
    @s490
    Object a(@qg21 String str, @q76 Object obj, Continuation<? super Result<DataWithStatusResponse<DivCommonResponse>>> continuation);
}
