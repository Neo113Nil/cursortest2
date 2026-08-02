package com.yandex.go.zone.dto.objects;

import defpackage.gjx0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mqx0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffViewSectionItemType;", "", "Companion", "mqx0", "GROUP", "REQUIREMENT", "VIRTUAL_GROUP", "UNKNOWN", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TariffViewSectionItemType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffViewSectionItemType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final mqx0 Companion;
    public static final TariffViewSectionItemType GROUP;
    public static final TariffViewSectionItemType REQUIREMENT;
    public static final TariffViewSectionItemType UNKNOWN;
    public static final TariffViewSectionItemType VIRTUAL_GROUP;

    static {
        TariffViewSectionItemType tariffViewSectionItemType = new TariffViewSectionItemType("GROUP", 0);
        GROUP = tariffViewSectionItemType;
        TariffViewSectionItemType tariffViewSectionItemType2 = new TariffViewSectionItemType("REQUIREMENT", 1);
        REQUIREMENT = tariffViewSectionItemType2;
        TariffViewSectionItemType tariffViewSectionItemType3 = new TariffViewSectionItemType("VIRTUAL_GROUP", 2);
        VIRTUAL_GROUP = tariffViewSectionItemType3;
        TariffViewSectionItemType tariffViewSectionItemType4 = new TariffViewSectionItemType("UNKNOWN", 3);
        UNKNOWN = tariffViewSectionItemType4;
        TariffViewSectionItemType[] tariffViewSectionItemTypeArr = {tariffViewSectionItemType, tariffViewSectionItemType2, tariffViewSectionItemType3, tariffViewSectionItemType4};
        $VALUES = tariffViewSectionItemTypeArr;
        $ENTRIES = kotlin.enums.a.a(tariffViewSectionItemTypeArr);
        Companion = new mqx0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gjx0(5));
    }

    public static TariffViewSectionItemType valueOf(String str) {
        return (TariffViewSectionItemType) Enum.valueOf(TariffViewSectionItemType.class, str);
    }

    public static TariffViewSectionItemType[] values() {
        return (TariffViewSectionItemType[]) $VALUES.clone();
    }
}
