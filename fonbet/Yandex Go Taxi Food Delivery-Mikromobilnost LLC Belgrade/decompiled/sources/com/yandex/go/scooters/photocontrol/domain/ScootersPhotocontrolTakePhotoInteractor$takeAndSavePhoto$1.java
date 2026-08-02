package com.yandex.go.scooters.photocontrol.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.photocontrol.domain.ScootersPhotocontrolTakePhotoInteractor", f = "ScootersPhotocontrolTakePhotoInteractor.kt", l = {14}, m = "takeAndSavePhoto", v = 2)
/* loaded from: classes13.dex */
final class ScootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
