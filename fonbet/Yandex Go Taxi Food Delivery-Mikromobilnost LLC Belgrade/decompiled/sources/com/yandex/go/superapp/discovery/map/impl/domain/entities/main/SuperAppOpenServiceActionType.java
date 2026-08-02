package com.yandex.go.superapp.discovery.map.impl.domain.entities.main;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/domain/entities/main/SuperAppOpenServiceActionType;", "", "FAVORITES", "TRANSPORT", "CHARGERS", "SCOOTERS", "TAXI", "PLACES", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppOpenServiceActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperAppOpenServiceActionType[] $VALUES;
    public static final SuperAppOpenServiceActionType CHARGERS;
    public static final SuperAppOpenServiceActionType FAVORITES;
    public static final SuperAppOpenServiceActionType PLACES;
    public static final SuperAppOpenServiceActionType SCOOTERS;
    public static final SuperAppOpenServiceActionType TAXI;
    public static final SuperAppOpenServiceActionType TRANSPORT;

    static {
        SuperAppOpenServiceActionType superAppOpenServiceActionType = new SuperAppOpenServiceActionType("FAVORITES", 0);
        FAVORITES = superAppOpenServiceActionType;
        SuperAppOpenServiceActionType superAppOpenServiceActionType2 = new SuperAppOpenServiceActionType("TRANSPORT", 1);
        TRANSPORT = superAppOpenServiceActionType2;
        SuperAppOpenServiceActionType superAppOpenServiceActionType3 = new SuperAppOpenServiceActionType("CHARGERS", 2);
        CHARGERS = superAppOpenServiceActionType3;
        SuperAppOpenServiceActionType superAppOpenServiceActionType4 = new SuperAppOpenServiceActionType("SCOOTERS", 3);
        SCOOTERS = superAppOpenServiceActionType4;
        SuperAppOpenServiceActionType superAppOpenServiceActionType5 = new SuperAppOpenServiceActionType("TAXI", 4);
        TAXI = superAppOpenServiceActionType5;
        SuperAppOpenServiceActionType superAppOpenServiceActionType6 = new SuperAppOpenServiceActionType("PLACES", 5);
        PLACES = superAppOpenServiceActionType6;
        SuperAppOpenServiceActionType[] superAppOpenServiceActionTypeArr = {superAppOpenServiceActionType, superAppOpenServiceActionType2, superAppOpenServiceActionType3, superAppOpenServiceActionType4, superAppOpenServiceActionType5, superAppOpenServiceActionType6};
        $VALUES = superAppOpenServiceActionTypeArr;
        $ENTRIES = a.a(superAppOpenServiceActionTypeArr);
    }

    public static SuperAppOpenServiceActionType valueOf(String str) {
        return (SuperAppOpenServiceActionType) Enum.valueOf(SuperAppOpenServiceActionType.class, str);
    }

    public static SuperAppOpenServiceActionType[] values() {
        return (SuperAppOpenServiceActionType[]) $VALUES.clone();
    }
}
