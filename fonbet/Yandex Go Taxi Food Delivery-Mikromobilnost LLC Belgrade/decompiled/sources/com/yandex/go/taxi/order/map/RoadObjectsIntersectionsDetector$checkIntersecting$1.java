package com.yandex.go.taxi.order.map;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.map.RoadObjectsIntersectionsDetector", f = "RoadObjectsIntersectionsDetector.kt", l = {17}, m = "checkIntersecting", v = 2)
/* loaded from: classes14.dex */
final class RoadObjectsIntersectionsDetector$checkIntersecting$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadObjectsIntersectionsDetector$checkIntersecting$1(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, 0.0f, this);
    }
}
