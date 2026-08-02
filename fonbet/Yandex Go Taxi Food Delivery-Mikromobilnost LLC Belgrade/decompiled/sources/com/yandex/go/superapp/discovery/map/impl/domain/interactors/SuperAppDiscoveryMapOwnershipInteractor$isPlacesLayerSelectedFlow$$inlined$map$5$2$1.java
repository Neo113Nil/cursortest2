package com.yandex.go.superapp.discovery.map.impl.domain.interactors;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.domain.interactors.SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$2", f = "SuperAppDiscoveryMapOwnershipInteractor.kt", l = {217}, m = "emit", v = 2)
/* loaded from: classes14.dex */
public final class SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$2$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$2$1(v vVar, Continuation continuation) {
        super(continuation);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
