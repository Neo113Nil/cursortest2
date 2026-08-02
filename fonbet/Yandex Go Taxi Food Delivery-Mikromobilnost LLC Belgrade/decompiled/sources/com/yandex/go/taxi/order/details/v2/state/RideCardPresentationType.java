package com.yandex.go.taxi.order.details.v2.state;

import defpackage.eqj0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.xlk0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/state/RideCardPresentationType;", "", "Companion", "xlk0", JCP.RAW_PREFIX, "COMPACT", "DETAILS", "SHARING", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RideCardPresentationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RideCardPresentationType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final RideCardPresentationType COMPACT;
    public static final xlk0 Companion;
    public static final RideCardPresentationType DETAILS;
    public static final RideCardPresentationType NONE;
    public static final RideCardPresentationType SHARING;

    static {
        RideCardPresentationType rideCardPresentationType = new RideCardPresentationType(JCP.RAW_PREFIX, 0);
        NONE = rideCardPresentationType;
        RideCardPresentationType rideCardPresentationType2 = new RideCardPresentationType("COMPACT", 1);
        COMPACT = rideCardPresentationType2;
        RideCardPresentationType rideCardPresentationType3 = new RideCardPresentationType("DETAILS", 2);
        DETAILS = rideCardPresentationType3;
        RideCardPresentationType rideCardPresentationType4 = new RideCardPresentationType("SHARING", 3);
        SHARING = rideCardPresentationType4;
        RideCardPresentationType[] rideCardPresentationTypeArr = {rideCardPresentationType, rideCardPresentationType2, rideCardPresentationType3, rideCardPresentationType4};
        $VALUES = rideCardPresentationTypeArr;
        $ENTRIES = kotlin.enums.a.a(rideCardPresentationTypeArr);
        Companion = new xlk0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eqj0(8));
    }

    public static RideCardPresentationType valueOf(String str) {
        return (RideCardPresentationType) Enum.valueOf(RideCardPresentationType.class, str);
    }

    public static RideCardPresentationType[] values() {
        return (RideCardPresentationType[]) $VALUES.clone();
    }
}
