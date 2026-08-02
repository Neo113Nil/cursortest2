package com.yandex.go.superapp.discovery.map.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/api/SuperAppDiscoveryMapLayer;", "", "PLACES", "TRANSPORT", "SCOOTERS", "TAXI", "CHARGERS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppDiscoveryMapLayer {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperAppDiscoveryMapLayer[] $VALUES;
    public static final SuperAppDiscoveryMapLayer CHARGERS;
    public static final SuperAppDiscoveryMapLayer PLACES;
    public static final SuperAppDiscoveryMapLayer SCOOTERS;
    public static final SuperAppDiscoveryMapLayer TAXI;
    public static final SuperAppDiscoveryMapLayer TRANSPORT;

    static {
        SuperAppDiscoveryMapLayer superAppDiscoveryMapLayer = new SuperAppDiscoveryMapLayer("PLACES", 0);
        PLACES = superAppDiscoveryMapLayer;
        SuperAppDiscoveryMapLayer superAppDiscoveryMapLayer2 = new SuperAppDiscoveryMapLayer("TRANSPORT", 1);
        TRANSPORT = superAppDiscoveryMapLayer2;
        SuperAppDiscoveryMapLayer superAppDiscoveryMapLayer3 = new SuperAppDiscoveryMapLayer("SCOOTERS", 2);
        SCOOTERS = superAppDiscoveryMapLayer3;
        SuperAppDiscoveryMapLayer superAppDiscoveryMapLayer4 = new SuperAppDiscoveryMapLayer("TAXI", 3);
        TAXI = superAppDiscoveryMapLayer4;
        SuperAppDiscoveryMapLayer superAppDiscoveryMapLayer5 = new SuperAppDiscoveryMapLayer("CHARGERS", 4);
        CHARGERS = superAppDiscoveryMapLayer5;
        SuperAppDiscoveryMapLayer[] superAppDiscoveryMapLayerArr = {superAppDiscoveryMapLayer, superAppDiscoveryMapLayer2, superAppDiscoveryMapLayer3, superAppDiscoveryMapLayer4, superAppDiscoveryMapLayer5};
        $VALUES = superAppDiscoveryMapLayerArr;
        $ENTRIES = a.a(superAppDiscoveryMapLayerArr);
    }

    public static SuperAppDiscoveryMapLayer valueOf(String str) {
        return (SuperAppDiscoveryMapLayer) Enum.valueOf(SuperAppDiscoveryMapLayer.class, str);
    }

    public static SuperAppDiscoveryMapLayer[] values() {
        return (SuperAppDiscoveryMapLayer[]) $VALUES.clone();
    }
}
