package com.yandex.go.taxi.order.details.v2.analytics.perf;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/taxi/order/details/v2/analytics/perf/RideCardPerfAnalytics$RenderViewType", "", "Lcom/yandex/go/taxi/order/details/v2/analytics/perf/RideCardPerfAnalytics$RenderViewType;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "VIEW", "COMPOSE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardPerfAnalytics$RenderViewType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RideCardPerfAnalytics$RenderViewType[] $VALUES;
    public static final RideCardPerfAnalytics$RenderViewType COMPOSE;
    public static final RideCardPerfAnalytics$RenderViewType VIEW;
    private final String value;

    static {
        RideCardPerfAnalytics$RenderViewType rideCardPerfAnalytics$RenderViewType = new RideCardPerfAnalytics$RenderViewType("VIEW", 0, "view");
        VIEW = rideCardPerfAnalytics$RenderViewType;
        RideCardPerfAnalytics$RenderViewType rideCardPerfAnalytics$RenderViewType2 = new RideCardPerfAnalytics$RenderViewType("COMPOSE", 1, "compose");
        COMPOSE = rideCardPerfAnalytics$RenderViewType2;
        RideCardPerfAnalytics$RenderViewType[] rideCardPerfAnalytics$RenderViewTypeArr = {rideCardPerfAnalytics$RenderViewType, rideCardPerfAnalytics$RenderViewType2};
        $VALUES = rideCardPerfAnalytics$RenderViewTypeArr;
        $ENTRIES = kotlin.enums.a.a(rideCardPerfAnalytics$RenderViewTypeArr);
    }

    public RideCardPerfAnalytics$RenderViewType(String str, int i, String str2) {
        this.value = str2;
    }

    public static RideCardPerfAnalytics$RenderViewType valueOf(String str) {
        return (RideCardPerfAnalytics$RenderViewType) Enum.valueOf(RideCardPerfAnalytics$RenderViewType.class, str);
    }

    public static RideCardPerfAnalytics$RenderViewType[] values() {
        return (RideCardPerfAnalytics$RenderViewType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
