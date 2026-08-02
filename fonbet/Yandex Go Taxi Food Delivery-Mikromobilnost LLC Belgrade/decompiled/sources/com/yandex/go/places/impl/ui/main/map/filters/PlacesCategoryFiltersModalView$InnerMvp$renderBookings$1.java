package com.yandex.go.places.impl.ui.main.map.filters;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.impl.ui.main.map.filters.PlacesCategoryFiltersModalView$InnerMvp", f = "PlacesCategoryFiltersModalView.kt", l = {200}, m = "renderBookings", v = 2)
/* loaded from: classes13.dex */
final class PlacesCategoryFiltersModalView$InnerMvp$renderBookings$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesCategoryFiltersModalView$InnerMvp$renderBookings$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.O9(null, this);
    }
}
