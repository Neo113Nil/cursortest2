package com.yandex.go.superapp.api.repository;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/go/superapp/api/repository/SuperAppRecenterPointRepository$Type", "", "Lcom/yandex/go/superapp/api/repository/SuperAppRecenterPointRepository$Type;", "EATS", "DRIVE", "LINKED", "SCOOTERS", "LOGISTICS", "LOGISTICS_NO_ANIMATION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppRecenterPointRepository$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperAppRecenterPointRepository$Type[] $VALUES;
    public static final SuperAppRecenterPointRepository$Type DRIVE;
    public static final SuperAppRecenterPointRepository$Type EATS;
    public static final SuperAppRecenterPointRepository$Type LINKED;
    public static final SuperAppRecenterPointRepository$Type LOGISTICS;
    public static final SuperAppRecenterPointRepository$Type LOGISTICS_NO_ANIMATION;
    public static final SuperAppRecenterPointRepository$Type SCOOTERS;

    static {
        SuperAppRecenterPointRepository$Type superAppRecenterPointRepository$Type = new SuperAppRecenterPointRepository$Type("EATS", 0);
        EATS = superAppRecenterPointRepository$Type;
        SuperAppRecenterPointRepository$Type superAppRecenterPointRepository$Type2 = new SuperAppRecenterPointRepository$Type("DRIVE", 1);
        DRIVE = superAppRecenterPointRepository$Type2;
        SuperAppRecenterPointRepository$Type superAppRecenterPointRepository$Type3 = new SuperAppRecenterPointRepository$Type("LINKED", 2);
        LINKED = superAppRecenterPointRepository$Type3;
        SuperAppRecenterPointRepository$Type superAppRecenterPointRepository$Type4 = new SuperAppRecenterPointRepository$Type("SCOOTERS", 3);
        SCOOTERS = superAppRecenterPointRepository$Type4;
        SuperAppRecenterPointRepository$Type superAppRecenterPointRepository$Type5 = new SuperAppRecenterPointRepository$Type("LOGISTICS", 4);
        LOGISTICS = superAppRecenterPointRepository$Type5;
        SuperAppRecenterPointRepository$Type superAppRecenterPointRepository$Type6 = new SuperAppRecenterPointRepository$Type("LOGISTICS_NO_ANIMATION", 5);
        LOGISTICS_NO_ANIMATION = superAppRecenterPointRepository$Type6;
        SuperAppRecenterPointRepository$Type[] superAppRecenterPointRepository$TypeArr = {superAppRecenterPointRepository$Type, superAppRecenterPointRepository$Type2, superAppRecenterPointRepository$Type3, superAppRecenterPointRepository$Type4, superAppRecenterPointRepository$Type5, superAppRecenterPointRepository$Type6};
        $VALUES = superAppRecenterPointRepository$TypeArr;
        $ENTRIES = a.a(superAppRecenterPointRepository$TypeArr);
    }

    public static SuperAppRecenterPointRepository$Type valueOf(String str) {
        return (SuperAppRecenterPointRepository$Type) Enum.valueOf(SuperAppRecenterPointRepository$Type.class, str);
    }

    public static SuperAppRecenterPointRepository$Type[] values() {
        return (SuperAppRecenterPointRepository$Type[]) $VALUES.clone();
    }
}
