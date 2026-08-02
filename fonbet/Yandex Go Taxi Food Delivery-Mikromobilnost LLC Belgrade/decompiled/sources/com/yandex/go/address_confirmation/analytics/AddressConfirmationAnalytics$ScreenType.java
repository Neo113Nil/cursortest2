package com.yandex.go.address_confirmation.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/address_confirmation/analytics/AddressConfirmationAnalytics$ScreenType", "", "Lcom/yandex/go/address_confirmation/analytics/AddressConfirmationAnalytics$ScreenType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TaxiMain", "Summary", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressConfirmationAnalytics$ScreenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressConfirmationAnalytics$ScreenType[] $VALUES;
    public static final AddressConfirmationAnalytics$ScreenType Summary;
    public static final AddressConfirmationAnalytics$ScreenType TaxiMain;
    private final String eventValue;

    static {
        AddressConfirmationAnalytics$ScreenType addressConfirmationAnalytics$ScreenType = new AddressConfirmationAnalytics$ScreenType("TaxiMain", 0, "taxi_main");
        TaxiMain = addressConfirmationAnalytics$ScreenType;
        AddressConfirmationAnalytics$ScreenType addressConfirmationAnalytics$ScreenType2 = new AddressConfirmationAnalytics$ScreenType("Summary", 1, "summary");
        Summary = addressConfirmationAnalytics$ScreenType2;
        AddressConfirmationAnalytics$ScreenType[] addressConfirmationAnalytics$ScreenTypeArr = {addressConfirmationAnalytics$ScreenType, addressConfirmationAnalytics$ScreenType2};
        $VALUES = addressConfirmationAnalytics$ScreenTypeArr;
        $ENTRIES = kotlin.enums.a.a(addressConfirmationAnalytics$ScreenTypeArr);
    }

    public AddressConfirmationAnalytics$ScreenType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static AddressConfirmationAnalytics$ScreenType valueOf(String str) {
        return (AddressConfirmationAnalytics$ScreenType) Enum.valueOf(AddressConfirmationAnalytics$ScreenType.class, str);
    }

    public static AddressConfirmationAnalytics$ScreenType[] values() {
        return (AddressConfirmationAnalytics$ScreenType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
