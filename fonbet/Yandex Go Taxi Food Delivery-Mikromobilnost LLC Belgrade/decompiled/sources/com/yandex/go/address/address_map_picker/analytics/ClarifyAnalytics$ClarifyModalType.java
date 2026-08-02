package com.yandex.go.address.address_map_picker.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/address/address_map_picker/analytics/ClarifyAnalytics$ClarifyModalType", "", "Lcom/yandex/go/address/address_map_picker/analytics/ClarifyAnalytics$ClarifyModalType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Address", "Drums", "Alert", "BlockScreen", "PickupLocationFromPhoto", "Error", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClarifyAnalytics$ClarifyModalType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ClarifyAnalytics$ClarifyModalType[] $VALUES;
    public static final ClarifyAnalytics$ClarifyModalType Address;
    public static final ClarifyAnalytics$ClarifyModalType Alert;
    public static final ClarifyAnalytics$ClarifyModalType BlockScreen;
    public static final ClarifyAnalytics$ClarifyModalType Drums;
    public static final ClarifyAnalytics$ClarifyModalType Error;
    public static final ClarifyAnalytics$ClarifyModalType PickupLocationFromPhoto;
    private final String eventValue;

    static {
        ClarifyAnalytics$ClarifyModalType clarifyAnalytics$ClarifyModalType = new ClarifyAnalytics$ClarifyModalType("Address", 0, "address");
        Address = clarifyAnalytics$ClarifyModalType;
        ClarifyAnalytics$ClarifyModalType clarifyAnalytics$ClarifyModalType2 = new ClarifyAnalytics$ClarifyModalType("Drums", 1, "drums");
        Drums = clarifyAnalytics$ClarifyModalType2;
        ClarifyAnalytics$ClarifyModalType clarifyAnalytics$ClarifyModalType3 = new ClarifyAnalytics$ClarifyModalType("Alert", 2, "alert");
        Alert = clarifyAnalytics$ClarifyModalType3;
        ClarifyAnalytics$ClarifyModalType clarifyAnalytics$ClarifyModalType4 = new ClarifyAnalytics$ClarifyModalType("BlockScreen", 3, "block_screen");
        BlockScreen = clarifyAnalytics$ClarifyModalType4;
        ClarifyAnalytics$ClarifyModalType clarifyAnalytics$ClarifyModalType5 = new ClarifyAnalytics$ClarifyModalType("PickupLocationFromPhoto", 4, "pickup_location_from_photo");
        PickupLocationFromPhoto = clarifyAnalytics$ClarifyModalType5;
        ClarifyAnalytics$ClarifyModalType clarifyAnalytics$ClarifyModalType6 = new ClarifyAnalytics$ClarifyModalType("Error", 5, "error");
        Error = clarifyAnalytics$ClarifyModalType6;
        ClarifyAnalytics$ClarifyModalType[] clarifyAnalytics$ClarifyModalTypeArr = {clarifyAnalytics$ClarifyModalType, clarifyAnalytics$ClarifyModalType2, clarifyAnalytics$ClarifyModalType3, clarifyAnalytics$ClarifyModalType4, clarifyAnalytics$ClarifyModalType5, clarifyAnalytics$ClarifyModalType6};
        $VALUES = clarifyAnalytics$ClarifyModalTypeArr;
        $ENTRIES = a.a(clarifyAnalytics$ClarifyModalTypeArr);
    }

    public ClarifyAnalytics$ClarifyModalType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ClarifyAnalytics$ClarifyModalType valueOf(String str) {
        return (ClarifyAnalytics$ClarifyModalType) Enum.valueOf(ClarifyAnalytics$ClarifyModalType.class, str);
    }

    public static ClarifyAnalytics$ClarifyModalType[] values() {
        return (ClarifyAnalytics$ClarifyModalType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
