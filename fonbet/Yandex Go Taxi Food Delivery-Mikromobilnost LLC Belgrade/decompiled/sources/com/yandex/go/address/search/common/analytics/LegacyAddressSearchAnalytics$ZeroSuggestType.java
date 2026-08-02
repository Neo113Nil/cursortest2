package com.yandex.go.address.search.common.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/address/search/common/analytics/LegacyAddressSearchAnalytics$ZeroSuggestType", "", "Lcom/yandex/go/address/search/common/analytics/LegacyAddressSearchAnalytics$ZeroSuggestType;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Address", "Favorite", "Withoutb", "SuggestedToSaveAddress", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LegacyAddressSearchAnalytics$ZeroSuggestType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LegacyAddressSearchAnalytics$ZeroSuggestType[] $VALUES;
    public static final LegacyAddressSearchAnalytics$ZeroSuggestType Address;
    public static final LegacyAddressSearchAnalytics$ZeroSuggestType Favorite;
    public static final LegacyAddressSearchAnalytics$ZeroSuggestType SuggestedToSaveAddress;
    public static final LegacyAddressSearchAnalytics$ZeroSuggestType Withoutb;
    private final String eventValue;

    static {
        LegacyAddressSearchAnalytics$ZeroSuggestType legacyAddressSearchAnalytics$ZeroSuggestType = new LegacyAddressSearchAnalytics$ZeroSuggestType("Address", 0, "address");
        Address = legacyAddressSearchAnalytics$ZeroSuggestType;
        LegacyAddressSearchAnalytics$ZeroSuggestType legacyAddressSearchAnalytics$ZeroSuggestType2 = new LegacyAddressSearchAnalytics$ZeroSuggestType("Favorite", 1, "favorite");
        Favorite = legacyAddressSearchAnalytics$ZeroSuggestType2;
        LegacyAddressSearchAnalytics$ZeroSuggestType legacyAddressSearchAnalytics$ZeroSuggestType3 = new LegacyAddressSearchAnalytics$ZeroSuggestType("Withoutb", 2, "withoutb");
        Withoutb = legacyAddressSearchAnalytics$ZeroSuggestType3;
        LegacyAddressSearchAnalytics$ZeroSuggestType legacyAddressSearchAnalytics$ZeroSuggestType4 = new LegacyAddressSearchAnalytics$ZeroSuggestType("SuggestedToSaveAddress", 3, "suggested_to_save_address");
        SuggestedToSaveAddress = legacyAddressSearchAnalytics$ZeroSuggestType4;
        LegacyAddressSearchAnalytics$ZeroSuggestType[] legacyAddressSearchAnalytics$ZeroSuggestTypeArr = {legacyAddressSearchAnalytics$ZeroSuggestType, legacyAddressSearchAnalytics$ZeroSuggestType2, legacyAddressSearchAnalytics$ZeroSuggestType3, legacyAddressSearchAnalytics$ZeroSuggestType4};
        $VALUES = legacyAddressSearchAnalytics$ZeroSuggestTypeArr;
        $ENTRIES = a.a(legacyAddressSearchAnalytics$ZeroSuggestTypeArr);
    }

    public LegacyAddressSearchAnalytics$ZeroSuggestType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static LegacyAddressSearchAnalytics$ZeroSuggestType valueOf(String str) {
        return (LegacyAddressSearchAnalytics$ZeroSuggestType) Enum.valueOf(LegacyAddressSearchAnalytics$ZeroSuggestType.class, str);
    }

    public static LegacyAddressSearchAnalytics$ZeroSuggestType[] values() {
        return (LegacyAddressSearchAnalytics$ZeroSuggestType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
