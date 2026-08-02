package com.yandex.go.taxi.order.map;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.map.RoadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2", f = "RoadObjectsInteractor.kt", l = {222, 217}, m = "emit", v = 2)
/* loaded from: classes14.dex */
public final class RoadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadObjectsInteractor$bubbleUiStateForTrafficLightFlow$$inlined$map$1$2$1(h hVar, Continuation continuation) {
        super(continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
