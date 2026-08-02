package com.yandex.go.zone.dto.objects;

import defpackage.agx0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.xlw0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffGroupDefinitionType;", "", "Companion", "agx0", "ITEM", "FLAT", "CAROUSEL", "UNKNOWN", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TariffGroupDefinitionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffGroupDefinitionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final TariffGroupDefinitionType CAROUSEL;
    public static final agx0 Companion;
    public static final TariffGroupDefinitionType FLAT;
    public static final TariffGroupDefinitionType ITEM;
    public static final TariffGroupDefinitionType UNKNOWN;

    static {
        TariffGroupDefinitionType tariffGroupDefinitionType = new TariffGroupDefinitionType("ITEM", 0);
        ITEM = tariffGroupDefinitionType;
        TariffGroupDefinitionType tariffGroupDefinitionType2 = new TariffGroupDefinitionType("FLAT", 1);
        FLAT = tariffGroupDefinitionType2;
        TariffGroupDefinitionType tariffGroupDefinitionType3 = new TariffGroupDefinitionType("CAROUSEL", 2);
        CAROUSEL = tariffGroupDefinitionType3;
        TariffGroupDefinitionType tariffGroupDefinitionType4 = new TariffGroupDefinitionType("UNKNOWN", 3);
        UNKNOWN = tariffGroupDefinitionType4;
        TariffGroupDefinitionType[] tariffGroupDefinitionTypeArr = {tariffGroupDefinitionType, tariffGroupDefinitionType2, tariffGroupDefinitionType3, tariffGroupDefinitionType4};
        $VALUES = tariffGroupDefinitionTypeArr;
        $ENTRIES = kotlin.enums.a.a(tariffGroupDefinitionTypeArr);
        Companion = new agx0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlw0(24));
    }

    public static TariffGroupDefinitionType valueOf(String str) {
        return (TariffGroupDefinitionType) Enum.valueOf(TariffGroupDefinitionType.class, str);
    }

    public static TariffGroupDefinitionType[] values() {
        return (TariffGroupDefinitionType[]) $VALUES.clone();
    }
}
