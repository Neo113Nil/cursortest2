package com.yandex.go.places.map.data.repositories;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.map.data.repositories.PlacesMapSocialPinsRepository", f = "PlacesMapSocialPinsRepository.kt", l = {302, 343, 474, 348, 349}, m = "updateMapObjectsInternal", v = 2)
/* loaded from: classes13.dex */
final class PlacesMapSocialPinsRepository$updateMapObjectsInternal$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesMapSocialPinsRepository$updateMapObjectsInternal$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.H(null, this, false);
    }
}
