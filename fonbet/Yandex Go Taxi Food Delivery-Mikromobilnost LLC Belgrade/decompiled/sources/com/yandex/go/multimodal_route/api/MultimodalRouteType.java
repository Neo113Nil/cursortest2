package com.yandex.go.multimodal_route.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/multimodal_route/api/MultimodalRouteType;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TaxiTransport", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MultimodalRouteType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MultimodalRouteType[] $VALUES;
    public static final MultimodalRouteType TaxiTransport;
    private final String value = TariffOrderFlow.ORDER_FLOW_TAXI_KEY;

    static {
        MultimodalRouteType multimodalRouteType = new MultimodalRouteType();
        TaxiTransport = multimodalRouteType;
        MultimodalRouteType[] multimodalRouteTypeArr = {multimodalRouteType};
        $VALUES = multimodalRouteTypeArr;
        $ENTRIES = a.a(multimodalRouteTypeArr);
    }

    public static MultimodalRouteType valueOf(String str) {
        return (MultimodalRouteType) Enum.valueOf(MultimodalRouteType.class, str);
    }

    public static MultimodalRouteType[] values() {
        return (MultimodalRouteType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
