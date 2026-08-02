package com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon;

import defpackage.k4o;
import defpackage.n4h0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/taxi/order/details/v2/state/elements/driver/caricon/RideCardCarIconFallbackDelegate$CarIconType", "", "Lcom/yandex/go/taxi/order/details/v2/state/elements/driver/caricon/RideCardCarIconFallbackDelegate$CarIconType;", "", "full", CA20Status.STATUS_USER_I, "a", "()I", "simple", "b", "YELLOW", "WHITE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardCarIconFallbackDelegate$CarIconType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RideCardCarIconFallbackDelegate$CarIconType[] $VALUES;
    public static final RideCardCarIconFallbackDelegate$CarIconType WHITE;
    public static final RideCardCarIconFallbackDelegate$CarIconType YELLOW;
    private final int full;
    private final int simple;

    static {
        RideCardCarIconFallbackDelegate$CarIconType rideCardCarIconFallbackDelegate$CarIconType = new RideCardCarIconFallbackDelegate$CarIconType("YELLOW", 0, n4h0.car_icon_fallback_yellow, n4h0.car_icon_simple_fallback_yellow);
        YELLOW = rideCardCarIconFallbackDelegate$CarIconType;
        RideCardCarIconFallbackDelegate$CarIconType rideCardCarIconFallbackDelegate$CarIconType2 = new RideCardCarIconFallbackDelegate$CarIconType("WHITE", 1, n4h0.car_icon_fallback_white, n4h0.car_icon_simple_fallback_white);
        WHITE = rideCardCarIconFallbackDelegate$CarIconType2;
        RideCardCarIconFallbackDelegate$CarIconType[] rideCardCarIconFallbackDelegate$CarIconTypeArr = {rideCardCarIconFallbackDelegate$CarIconType, rideCardCarIconFallbackDelegate$CarIconType2};
        $VALUES = rideCardCarIconFallbackDelegate$CarIconTypeArr;
        $ENTRIES = kotlin.enums.a.a(rideCardCarIconFallbackDelegate$CarIconTypeArr);
    }

    public RideCardCarIconFallbackDelegate$CarIconType(String str, int i, int i2, int i3) {
        this.full = i2;
        this.simple = i3;
    }

    public static RideCardCarIconFallbackDelegate$CarIconType valueOf(String str) {
        return (RideCardCarIconFallbackDelegate$CarIconType) Enum.valueOf(RideCardCarIconFallbackDelegate$CarIconType.class, str);
    }

    public static RideCardCarIconFallbackDelegate$CarIconType[] values() {
        return (RideCardCarIconFallbackDelegate$CarIconType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getFull() {
        return this.full;
    }

    /* renamed from: b, reason: from getter */
    public final int getSimple() {
        return this.simple;
    }
}
