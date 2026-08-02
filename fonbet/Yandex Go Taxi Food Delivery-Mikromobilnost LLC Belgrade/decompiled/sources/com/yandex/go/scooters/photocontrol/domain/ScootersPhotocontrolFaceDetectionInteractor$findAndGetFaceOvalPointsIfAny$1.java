package com.yandex.go.scooters.photocontrol.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.photocontrol.domain.ScootersPhotocontrolFaceDetectionInteractor", f = "ScootersPhotocontrolFaceDetectionInteractor.kt", l = {37, 41}, m = "findAndGetFaceOvalPointsIfAny", v = 2)
/* loaded from: classes13.dex */
final class ScootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.b(this.this$0, null, this);
    }
}
