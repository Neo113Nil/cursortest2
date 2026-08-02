package com.yandex.go.pickup_from_photo.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/pickup_from_photo/api/PickupFromPhotoEntryPointAnalytics$EntryPointScreen", "", "Lcom/yandex/go/pickup_from_photo/api/PickupFromPhotoEntryPointAnalytics$EntryPointScreen;", "SUGGEST", "CLARIFY", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PickupFromPhotoEntryPointAnalytics$EntryPointScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PickupFromPhotoEntryPointAnalytics$EntryPointScreen[] $VALUES;
    public static final PickupFromPhotoEntryPointAnalytics$EntryPointScreen CLARIFY;
    public static final PickupFromPhotoEntryPointAnalytics$EntryPointScreen SUGGEST;

    static {
        PickupFromPhotoEntryPointAnalytics$EntryPointScreen pickupFromPhotoEntryPointAnalytics$EntryPointScreen = new PickupFromPhotoEntryPointAnalytics$EntryPointScreen("SUGGEST", 0);
        SUGGEST = pickupFromPhotoEntryPointAnalytics$EntryPointScreen;
        PickupFromPhotoEntryPointAnalytics$EntryPointScreen pickupFromPhotoEntryPointAnalytics$EntryPointScreen2 = new PickupFromPhotoEntryPointAnalytics$EntryPointScreen("CLARIFY", 1);
        CLARIFY = pickupFromPhotoEntryPointAnalytics$EntryPointScreen2;
        PickupFromPhotoEntryPointAnalytics$EntryPointScreen[] pickupFromPhotoEntryPointAnalytics$EntryPointScreenArr = {pickupFromPhotoEntryPointAnalytics$EntryPointScreen, pickupFromPhotoEntryPointAnalytics$EntryPointScreen2};
        $VALUES = pickupFromPhotoEntryPointAnalytics$EntryPointScreenArr;
        $ENTRIES = a.a(pickupFromPhotoEntryPointAnalytics$EntryPointScreenArr);
    }

    public static PickupFromPhotoEntryPointAnalytics$EntryPointScreen valueOf(String str) {
        return (PickupFromPhotoEntryPointAnalytics$EntryPointScreen) Enum.valueOf(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.class, str);
    }

    public static PickupFromPhotoEntryPointAnalytics$EntryPointScreen[] values() {
        return (PickupFromPhotoEntryPointAnalytics$EntryPointScreen[]) $VALUES.clone();
    }
}
