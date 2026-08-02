package com.yandex.go.pickup_from_photo.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.pickup_from_photo.data.PickupFromPhotoFinalSuggestRepository", f = "PickupFromPhotoFinalSuggestRepository.kt", l = {42, 52}, m = "getAddressInfoByCoordinates", v = 2)
/* loaded from: classes13.dex */
final class PickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupFromPhotoFinalSuggestRepository$getAddressInfoByCoordinates$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
