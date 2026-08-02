package com.yandex.go.taxi.order.models.api.response;

/* loaded from: classes14.dex */
public abstract class g4 {
    public static final boolean a(RideCardInfoResponse rideCardInfoResponse) {
        return (rideCardInfoResponse == null || rideCardInfoResponse.c.a.a.isEmpty()) ? false : true;
    }

    public static final boolean b(RideCardInfoResponse rideCardInfoResponse) {
        return (rideCardInfoResponse == null || rideCardInfoResponse.c.b.a.isEmpty()) ? false : true;
    }

    public static final boolean c(RideCardInfoResponse rideCardInfoResponse) {
        return (rideCardInfoResponse == null || rideCardInfoResponse.a.isEmpty()) ? false : true;
    }
}
