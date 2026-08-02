package com.yandex.go.places.experiments.map.social_pin;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.experiments.map.social_pin.PlacesSocialPinDimensionsExperimentRepository", f = "PlacesSocialPinDimensionsExperimentRepository.kt", l = {28}, m = "getSocialPinDimensions", v = 2)
/* loaded from: classes13.dex */
final class PlacesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
