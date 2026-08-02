package com.ybsdk.feature.passes.widget.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/passes/widget/internal/data/PassesWidgetApi;", "", "Lcom/ybsdk/feature/passes/widget/internal/data/PassesWidgetRequestDto;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/passes/widget/internal/data/PassesWidgetResponseDto;", "a", "(Lcom/ybsdk/feature/passes/widget/internal/data/PassesWidgetRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-passes-widget_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PassesWidgetApi {
    @s490("v1/screens/loyalty_passes_widget")
    Object a(@q76 PassesWidgetRequestDto passesWidgetRequestDto, Continuation<? super Result<DataWithStatusResponse<PassesWidgetResponseDto>>> continuation);
}
