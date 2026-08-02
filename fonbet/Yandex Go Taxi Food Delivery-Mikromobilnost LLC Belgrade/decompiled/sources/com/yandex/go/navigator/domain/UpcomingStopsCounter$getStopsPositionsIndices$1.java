package com.yandex.go.navigator.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.domain.UpcomingStopsCounter", f = "UpcomingStopsCounter.kt", l = {64}, m = "getStopsPositionsIndices", v = 2)
/* loaded from: classes12.dex */
final class UpcomingStopsCounter$getStopsPositionsIndices$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpcomingStopsCounter$getStopsPositionsIndices$1(a0 a0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a0.a(this.this$0, null, this);
    }
}
