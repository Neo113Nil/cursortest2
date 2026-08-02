package com.yandex.go.scooters.offers.v2.data.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/scooters/offers/v2/data/model/ScootersBookState$Booking$Type", "", "Lcom/yandex/go/scooters/offers/v2/data/model/ScootersBookState$Booking$Type;", "DEFAULT", "PACKAGE_PURCHASE", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersBookState$Booking$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersBookState$Booking$Type[] $VALUES;
    public static final ScootersBookState$Booking$Type DEFAULT;
    public static final ScootersBookState$Booking$Type PACKAGE_PURCHASE;

    static {
        ScootersBookState$Booking$Type scootersBookState$Booking$Type = new ScootersBookState$Booking$Type("DEFAULT", 0);
        DEFAULT = scootersBookState$Booking$Type;
        ScootersBookState$Booking$Type scootersBookState$Booking$Type2 = new ScootersBookState$Booking$Type("PACKAGE_PURCHASE", 1);
        PACKAGE_PURCHASE = scootersBookState$Booking$Type2;
        ScootersBookState$Booking$Type[] scootersBookState$Booking$TypeArr = {scootersBookState$Booking$Type, scootersBookState$Booking$Type2};
        $VALUES = scootersBookState$Booking$TypeArr;
        $ENTRIES = kotlin.enums.a.a(scootersBookState$Booking$TypeArr);
    }

    public static ScootersBookState$Booking$Type valueOf(String str) {
        return (ScootersBookState$Booking$Type) Enum.valueOf(ScootersBookState$Booking$Type.class, str);
    }

    public static ScootersBookState$Booking$Type[] values() {
        return (ScootersBookState$Booking$Type[]) $VALUES.clone();
    }
}
