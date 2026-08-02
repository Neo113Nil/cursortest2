package com.yandex.go.address.search.common.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/address/search/common/analytics/AddressSearchAnalytics$TapArea", "", "Lcom/yandex/go/address/search/common/analytics/AddressSearchAnalytics$TapArea;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Item", "Trail", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressSearchAnalytics$TapArea {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressSearchAnalytics$TapArea[] $VALUES;
    public static final AddressSearchAnalytics$TapArea Item;
    public static final AddressSearchAnalytics$TapArea Trail;
    private final String eventValue;

    static {
        AddressSearchAnalytics$TapArea addressSearchAnalytics$TapArea = new AddressSearchAnalytics$TapArea("Item", 0, "item");
        Item = addressSearchAnalytics$TapArea;
        AddressSearchAnalytics$TapArea addressSearchAnalytics$TapArea2 = new AddressSearchAnalytics$TapArea("Trail", 1, "trail");
        Trail = addressSearchAnalytics$TapArea2;
        AddressSearchAnalytics$TapArea[] addressSearchAnalytics$TapAreaArr = {addressSearchAnalytics$TapArea, addressSearchAnalytics$TapArea2};
        $VALUES = addressSearchAnalytics$TapAreaArr;
        $ENTRIES = a.a(addressSearchAnalytics$TapAreaArr);
    }

    public AddressSearchAnalytics$TapArea(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static AddressSearchAnalytics$TapArea valueOf(String str) {
        return (AddressSearchAnalytics$TapArea) Enum.valueOf(AddressSearchAnalytics$TapArea.class, str);
    }

    public static AddressSearchAnalytics$TapArea[] values() {
        return (AddressSearchAnalytics$TapArea[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
