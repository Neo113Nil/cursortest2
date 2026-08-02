package com.yandex.go.places.impl.data.repositories.bookings;

import com.yandex.go.places.impl.data.entities.network.bookings.PlacesUserBookingsRequestParams;
import com.yandex.go.places.impl.data.entities.network.bookings.PlacesUserBookingsResponse;
import defpackage.bl80;
import defpackage.cmt;
import defpackage.kk80;
import defpackage.mk80;
import defpackage.ny61;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final bl80 a;

    public a(bl80 bl80Var) {
        this.a = bl80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, ContinuationImpl continuationImpl) {
        PlacesUserBookingsRepository$getUserBookings$1 placesUserBookingsRepository$getUserBookings$1;
        int i2;
        try {
            if (continuationImpl instanceof PlacesUserBookingsRepository$getUserBookings$1) {
                placesUserBookingsRepository$getUserBookings$1 = (PlacesUserBookingsRepository$getUserBookings$1) continuationImpl;
                int i3 = placesUserBookingsRepository$getUserBookings$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    placesUserBookingsRepository$getUserBookings$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = placesUserBookingsRepository$getUserBookings$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = placesUserBookingsRepository$getUserBookings$1.label;
                    if (i2 != 0) {
                        b.b(obj);
                        cmt<PlacesUserBookingsResponse> c = this.a.a().c(new PlacesUserBookingsRequestParams(i));
                        placesUserBookingsRepository$getUserBookings$1.L$0 = null;
                        placesUserBookingsRepository$getUserBookings$1.I$0 = 0;
                        placesUserBookingsRepository$getUserBookings$1.I$1 = i;
                        placesUserBookingsRepository$getUserBookings$1.Z$0 = false;
                        placesUserBookingsRepository$getUserBookings$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.d(c, placesUserBookingsRepository$getUserBookings$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return new kk80((PlacesUserBookingsResponse) obj);
                }
            }
            if (i2 != 0) {
            }
            return new kk80((PlacesUserBookingsResponse) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new mk80(th);
        }
        placesUserBookingsRepository$getUserBookings$1 = new PlacesUserBookingsRepository$getUserBookings$1(this, continuationImpl);
        Object obj2 = placesUserBookingsRepository$getUserBookings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = placesUserBookingsRepository$getUserBookings$1.label;
    }
}
