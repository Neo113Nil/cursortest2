package com.yandex.go.scooters.photocontrol.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.photocontrol.domain.ScootersPhotocontrolObjectDetectionInteractor", f = "ScootersPhotocontrolObjectDetectionInteractor.kt", l = {40, 44}, m = "findAndGetObjectPointsIfAny", v = 2)
/* loaded from: classes13.dex */
final class ScootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return f.b(this.this$0, null, this);
    }
}
