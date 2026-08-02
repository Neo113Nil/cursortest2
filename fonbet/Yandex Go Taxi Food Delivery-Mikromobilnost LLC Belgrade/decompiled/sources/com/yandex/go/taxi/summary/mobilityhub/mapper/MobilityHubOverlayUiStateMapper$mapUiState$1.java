package com.yandex.go.taxi.summary.mobilityhub.mapper;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.mapper.MobilityHubOverlayUiStateMapper", f = "MobilityHubOverlayUiStateMapper.kt", l = {65}, m = "mapUiState", v = 2)
/* loaded from: classes14.dex */
final class MobilityHubOverlayUiStateMapper$mapUiState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilityHubOverlayUiStateMapper$mapUiState$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, this);
    }
}
