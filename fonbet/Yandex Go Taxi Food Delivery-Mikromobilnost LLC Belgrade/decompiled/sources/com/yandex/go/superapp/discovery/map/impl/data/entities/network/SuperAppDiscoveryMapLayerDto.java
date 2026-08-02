package com.yandex.go.superapp.discovery.map.impl.data.entities.network;

import defpackage.bnv0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ruv0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/data/entities/network/SuperAppDiscoveryMapLayerDto;", "", "Companion", "ruv0", "PLACES", "TRANSPORT", "SCOOTERS", "TAXI", "CHARGERS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppDiscoveryMapLayerDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperAppDiscoveryMapLayerDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final SuperAppDiscoveryMapLayerDto CHARGERS;
    public static final ruv0 Companion;
    public static final SuperAppDiscoveryMapLayerDto PLACES;
    public static final SuperAppDiscoveryMapLayerDto SCOOTERS;
    public static final SuperAppDiscoveryMapLayerDto TAXI;
    public static final SuperAppDiscoveryMapLayerDto TRANSPORT;

    static {
        SuperAppDiscoveryMapLayerDto superAppDiscoveryMapLayerDto = new SuperAppDiscoveryMapLayerDto("PLACES", 0);
        PLACES = superAppDiscoveryMapLayerDto;
        SuperAppDiscoveryMapLayerDto superAppDiscoveryMapLayerDto2 = new SuperAppDiscoveryMapLayerDto("TRANSPORT", 1);
        TRANSPORT = superAppDiscoveryMapLayerDto2;
        SuperAppDiscoveryMapLayerDto superAppDiscoveryMapLayerDto3 = new SuperAppDiscoveryMapLayerDto("SCOOTERS", 2);
        SCOOTERS = superAppDiscoveryMapLayerDto3;
        SuperAppDiscoveryMapLayerDto superAppDiscoveryMapLayerDto4 = new SuperAppDiscoveryMapLayerDto("TAXI", 3);
        TAXI = superAppDiscoveryMapLayerDto4;
        SuperAppDiscoveryMapLayerDto superAppDiscoveryMapLayerDto5 = new SuperAppDiscoveryMapLayerDto("CHARGERS", 4);
        CHARGERS = superAppDiscoveryMapLayerDto5;
        SuperAppDiscoveryMapLayerDto[] superAppDiscoveryMapLayerDtoArr = {superAppDiscoveryMapLayerDto, superAppDiscoveryMapLayerDto2, superAppDiscoveryMapLayerDto3, superAppDiscoveryMapLayerDto4, superAppDiscoveryMapLayerDto5};
        $VALUES = superAppDiscoveryMapLayerDtoArr;
        $ENTRIES = kotlin.enums.a.a(superAppDiscoveryMapLayerDtoArr);
        Companion = new ruv0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bnv0(24));
    }

    public static SuperAppDiscoveryMapLayerDto valueOf(String str) {
        return (SuperAppDiscoveryMapLayerDto) Enum.valueOf(SuperAppDiscoveryMapLayerDto.class, str);
    }

    public static SuperAppDiscoveryMapLayerDto[] values() {
        return (SuperAppDiscoveryMapLayerDto[]) $VALUES.clone();
    }
}
