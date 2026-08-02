package com.yandex.go.superapp.discovery.map.impl.ui.main.filters.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/ui/main/filters/domain/entities/SuperAppDiscoveryMapFilter;", "", "PLACES", "TRANSPORT", "CHARGERS", "SCOOTERS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppDiscoveryMapFilter {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperAppDiscoveryMapFilter[] $VALUES;
    public static final SuperAppDiscoveryMapFilter CHARGERS;
    public static final SuperAppDiscoveryMapFilter PLACES;
    public static final SuperAppDiscoveryMapFilter SCOOTERS;
    public static final SuperAppDiscoveryMapFilter TRANSPORT;

    static {
        SuperAppDiscoveryMapFilter superAppDiscoveryMapFilter = new SuperAppDiscoveryMapFilter("PLACES", 0);
        PLACES = superAppDiscoveryMapFilter;
        SuperAppDiscoveryMapFilter superAppDiscoveryMapFilter2 = new SuperAppDiscoveryMapFilter("TRANSPORT", 1);
        TRANSPORT = superAppDiscoveryMapFilter2;
        SuperAppDiscoveryMapFilter superAppDiscoveryMapFilter3 = new SuperAppDiscoveryMapFilter("CHARGERS", 2);
        CHARGERS = superAppDiscoveryMapFilter3;
        SuperAppDiscoveryMapFilter superAppDiscoveryMapFilter4 = new SuperAppDiscoveryMapFilter("SCOOTERS", 3);
        SCOOTERS = superAppDiscoveryMapFilter4;
        SuperAppDiscoveryMapFilter[] superAppDiscoveryMapFilterArr = {superAppDiscoveryMapFilter, superAppDiscoveryMapFilter2, superAppDiscoveryMapFilter3, superAppDiscoveryMapFilter4};
        $VALUES = superAppDiscoveryMapFilterArr;
        $ENTRIES = a.a(superAppDiscoveryMapFilterArr);
    }

    public static SuperAppDiscoveryMapFilter valueOf(String str) {
        return (SuperAppDiscoveryMapFilter) Enum.valueOf(SuperAppDiscoveryMapFilter.class, str);
    }

    public static SuperAppDiscoveryMapFilter[] values() {
        return (SuperAppDiscoveryMapFilter[]) $VALUES.clone();
    }
}
