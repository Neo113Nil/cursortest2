package com.yandex.go.taxi.order.models.api.response.driver;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kik0;
import defpackage.zfj0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/driver/RideCardDriverState;", "", "Companion", "kik0", "SEARCHING", "WAITING_RESPONSE", "REJECTED", "ASSIGNED_DRIVER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardDriverState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RideCardDriverState[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final RideCardDriverState ASSIGNED_DRIVER;
    public static final kik0 Companion;
    public static final RideCardDriverState REJECTED;
    public static final RideCardDriverState SEARCHING;
    public static final RideCardDriverState WAITING_RESPONSE;

    static {
        RideCardDriverState rideCardDriverState = new RideCardDriverState("SEARCHING", 0);
        SEARCHING = rideCardDriverState;
        RideCardDriverState rideCardDriverState2 = new RideCardDriverState("WAITING_RESPONSE", 1);
        WAITING_RESPONSE = rideCardDriverState2;
        RideCardDriverState rideCardDriverState3 = new RideCardDriverState("REJECTED", 2);
        REJECTED = rideCardDriverState3;
        RideCardDriverState rideCardDriverState4 = new RideCardDriverState("ASSIGNED_DRIVER", 3);
        ASSIGNED_DRIVER = rideCardDriverState4;
        RideCardDriverState[] rideCardDriverStateArr = {rideCardDriverState, rideCardDriverState2, rideCardDriverState3, rideCardDriverState4};
        $VALUES = rideCardDriverStateArr;
        $ENTRIES = kotlin.enums.a.a(rideCardDriverStateArr);
        Companion = new kik0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zfj0(27));
    }

    public static RideCardDriverState valueOf(String str) {
        return (RideCardDriverState) Enum.valueOf(RideCardDriverState.class, str);
    }

    public static RideCardDriverState[] values() {
        return (RideCardDriverState[]) $VALUES.clone();
    }
}
