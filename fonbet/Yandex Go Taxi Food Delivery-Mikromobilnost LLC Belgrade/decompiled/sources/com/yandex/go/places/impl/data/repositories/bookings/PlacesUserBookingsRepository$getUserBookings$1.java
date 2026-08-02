package com.yandex.go.places.impl.data.repositories.bookings;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.impl.data.repositories.bookings.PlacesUserBookingsRepository", f = "PlacesUserBookingsRepository.kt", l = {29}, m = "getUserBookings", v = 2)
/* loaded from: classes13.dex */
final class PlacesUserBookingsRepository$getUserBookings$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesUserBookingsRepository$getUserBookings$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0, this);
    }
}
