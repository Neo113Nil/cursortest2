package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.WalkingRouteUriResolver", f = "WalkingRouteUriResolver.kt", l = {34, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "resolveUriInternal", v = 2)
/* loaded from: classes14.dex */
final class WalkingRouteUriResolver$resolveUriInternal$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkingRouteUriResolver$resolveUriInternal$1(j0 j0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return j0.a(this.this$0, null, this);
    }
}
