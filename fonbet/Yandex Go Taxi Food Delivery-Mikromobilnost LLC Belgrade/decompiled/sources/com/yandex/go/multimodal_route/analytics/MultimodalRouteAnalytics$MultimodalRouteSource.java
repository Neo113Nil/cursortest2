package com.yandex.go.multimodal_route.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/multimodal_route/analytics/MultimodalRouteAnalytics$MultimodalRouteSource", "", "Lcom/yandex/go/multimodal_route/analytics/MultimodalRouteAnalytics$MultimodalRouteSource;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Hub", "Taxi", "Transport", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MultimodalRouteAnalytics$MultimodalRouteSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MultimodalRouteAnalytics$MultimodalRouteSource[] $VALUES;
    public static final MultimodalRouteAnalytics$MultimodalRouteSource Hub;
    public static final MultimodalRouteAnalytics$MultimodalRouteSource Taxi;
    public static final MultimodalRouteAnalytics$MultimodalRouteSource Transport;
    private final String eventValue;

    static {
        MultimodalRouteAnalytics$MultimodalRouteSource multimodalRouteAnalytics$MultimodalRouteSource = new MultimodalRouteAnalytics$MultimodalRouteSource("Hub", 0, "hub");
        Hub = multimodalRouteAnalytics$MultimodalRouteSource;
        MultimodalRouteAnalytics$MultimodalRouteSource multimodalRouteAnalytics$MultimodalRouteSource2 = new MultimodalRouteAnalytics$MultimodalRouteSource("Taxi", 1, TariffOrderFlow.ORDER_FLOW_TAXI_KEY);
        Taxi = multimodalRouteAnalytics$MultimodalRouteSource2;
        MultimodalRouteAnalytics$MultimodalRouteSource multimodalRouteAnalytics$MultimodalRouteSource3 = new MultimodalRouteAnalytics$MultimodalRouteSource("Transport", 2, "transport");
        Transport = multimodalRouteAnalytics$MultimodalRouteSource3;
        MultimodalRouteAnalytics$MultimodalRouteSource[] multimodalRouteAnalytics$MultimodalRouteSourceArr = {multimodalRouteAnalytics$MultimodalRouteSource, multimodalRouteAnalytics$MultimodalRouteSource2, multimodalRouteAnalytics$MultimodalRouteSource3};
        $VALUES = multimodalRouteAnalytics$MultimodalRouteSourceArr;
        $ENTRIES = a.a(multimodalRouteAnalytics$MultimodalRouteSourceArr);
    }

    public MultimodalRouteAnalytics$MultimodalRouteSource(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MultimodalRouteAnalytics$MultimodalRouteSource valueOf(String str) {
        return (MultimodalRouteAnalytics$MultimodalRouteSource) Enum.valueOf(MultimodalRouteAnalytics$MultimodalRouteSource.class, str);
    }

    public static MultimodalRouteAnalytics$MultimodalRouteSource[] values() {
        return (MultimodalRouteAnalytics$MultimodalRouteSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
