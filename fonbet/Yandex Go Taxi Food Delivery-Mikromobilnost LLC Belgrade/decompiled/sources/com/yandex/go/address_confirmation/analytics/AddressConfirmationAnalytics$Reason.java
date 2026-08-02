package com.yandex.go.address_confirmation.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/address_confirmation/analytics/AddressConfirmationAnalytics$Reason", "", "Lcom/yandex/go/address_confirmation/analytics/AddressConfirmationAnalytics$Reason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BadGeo", "GeoDisabled", "Other", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressConfirmationAnalytics$Reason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressConfirmationAnalytics$Reason[] $VALUES;
    public static final AddressConfirmationAnalytics$Reason BadGeo;
    public static final AddressConfirmationAnalytics$Reason GeoDisabled;
    public static final AddressConfirmationAnalytics$Reason Other;
    private final String eventValue;

    static {
        AddressConfirmationAnalytics$Reason addressConfirmationAnalytics$Reason = new AddressConfirmationAnalytics$Reason("BadGeo", 0, "bad_geo");
        BadGeo = addressConfirmationAnalytics$Reason;
        AddressConfirmationAnalytics$Reason addressConfirmationAnalytics$Reason2 = new AddressConfirmationAnalytics$Reason("GeoDisabled", 1, "geo_disabled");
        GeoDisabled = addressConfirmationAnalytics$Reason2;
        AddressConfirmationAnalytics$Reason addressConfirmationAnalytics$Reason3 = new AddressConfirmationAnalytics$Reason("Other", 2, "other");
        Other = addressConfirmationAnalytics$Reason3;
        AddressConfirmationAnalytics$Reason[] addressConfirmationAnalytics$ReasonArr = {addressConfirmationAnalytics$Reason, addressConfirmationAnalytics$Reason2, addressConfirmationAnalytics$Reason3};
        $VALUES = addressConfirmationAnalytics$ReasonArr;
        $ENTRIES = kotlin.enums.a.a(addressConfirmationAnalytics$ReasonArr);
    }

    public AddressConfirmationAnalytics$Reason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static AddressConfirmationAnalytics$Reason valueOf(String str) {
        return (AddressConfirmationAnalytics$Reason) Enum.valueOf(AddressConfirmationAnalytics$Reason.class, str);
    }

    public static AddressConfirmationAnalytics$Reason[] values() {
        return (AddressConfirmationAnalytics$Reason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
