package com.ybsdk.feature.ui.stat.internal.data.network;

import com.ybsdk.feature.ui.stat.internal.data.network.dto.UiStatEventsRequest;
import defpackage.q76;
import defpackage.s490;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/ui/stat/internal/data/network/UiStatEventsApi;", "", "", "Lcom/ybsdk/feature/ui/stat/internal/data/network/dto/UiStatEventsRequest;", "events", "Lkotlin/Result;", "Lzy11;", "a", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-ui-stat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface UiStatEventsApi {
    @s490("v1/send_ui_stat_events")
    Object a(@q76 List<UiStatEventsRequest> list, Continuation<? super Result<zy11>> continuation);
}
